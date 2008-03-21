package secolaman.impl.net.protocols;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.regex.Pattern;

import secolaman.data.MetaData;
import secolaman.data.MetaMatcher;
import secolaman.data.Ressource;
import secolaman.data.entries.StringMatcherEntry;
import secolaman.impl.data.Utils;
import secolaman.net.Subscriber;

public class ThreadedSubscriber extends Thread {

	private Vector<Ressource> receptionQueue = new Vector<Ressource>(5, 3);
	private ArrayList<Pattern> patterns = new ArrayList<Pattern>(3); 
	private MetaMatcher matcher;
	private Subscriber subscriber;
	
	public ThreadedSubscriber(MetaMatcher matcher, Subscriber subscriber) {
		this.matcher = matcher;
		this.subscriber = subscriber;
		Iterator<StringMatcherEntry> it = matcher.getRegexMatcherIterator();
		StringMatcherEntry p;
		while (it.hasNext())
		{
			p = it.next();
			patterns.add(Utils.getPattern(p));
		}
	}

	public void addtoQueue(Ressource r) {
		receptionQueue.add(r);
		synchronized (this) {
			this.notify();
		}
	}
	
	public void run() {
		while (true) {
			if (!receptionQueue.isEmpty()) {
				Ressource r = receptionQueue.remove(0);
				MetaData m = r.getMetaData();
				if (Utils.isStringMatch(r.getMetaData(), matcher)) {
					Iterator<StringMatcherEntry> itm = matcher.getRegexMatcherIterator();
					Iterator<Pattern> itp = patterns.iterator();
					boolean res = true;
					while (res && itm.hasNext()) {
						res = itp.next().matcher(m.getString(itm.next().getKey())).matches();
					}
					if (res && Utils.isComplexMatch(m, matcher))
						subscriber.handle(r);
				}
			}
			if (receptionQueue.isEmpty()) {
				synchronized (this) {
					try {
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
}
