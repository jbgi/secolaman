package secolaman.net;

/**
 * 
 * @author jbgiraudeau
 *
 */
public interface GroupInfo {

	/**
	 * @return
	 */
	public String getDownloadDirectory();

	/**
	 * @return
	 */
	public String getMetaDataDirectory();

	/**
	 * @return
	 */
	public String getName();

	/**
	 * @return
	 */
	public String getPeerID();

	/**
	 * @return
	 */
	public String getPeerName();

	/**
	 * @return
	 */
	public boolean isHidden();

	/**
	 * @return
	 */
	public boolean isPasswordProtected();

	/**
	 * @return
	 */
	public boolean isSigned();

	/**
	 * @param directory
	 */
	public void setDownloadDirectory(String directory);

	/**
	 * @param groupName
	 */
	public void setGroupName(String groupName);

	/**
	 * @param hidden
	 */
	public void setHidden(boolean hidden);

	/**
	 * @param directory
	 */
	public void setMetaDataDirectory(String directory);

	/**
	 * @param password
	 */
	public void setPassword(String password);

	/**
	 * @param peerID
	 */
	public void setPeerID(String peerID);

	/**
	 * @param peerName
	 */
	public void setPeerName(String peerName);

	/**
	 * @param signed
	 */
	public void signRecords(boolean signed);

}
