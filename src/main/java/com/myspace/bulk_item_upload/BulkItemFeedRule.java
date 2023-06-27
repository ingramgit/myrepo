package com.myspace.bulk_item_upload;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BulkItemFeedRule implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String reprocessFailed;
	private int maxRetries;
	private boolean sendEmailOnMaxRetries;

	public BulkItemFeedRule() {
	}

	public java.lang.String getReprocessFailed() {
		return this.reprocessFailed;
	}

	public void setReprocessFailed(java.lang.String reprocessFailed) {
		this.reprocessFailed = reprocessFailed;
	}

	public int getMaxRetries() {
		return this.maxRetries;
	}

	public void setMaxRetries(int maxRetries) {
		this.maxRetries = maxRetries;
	}

	public boolean isSendEmailOnMaxRetries() {
		return this.sendEmailOnMaxRetries;
	}

	public void setSendEmailOnMaxRetries(boolean sendEmailOnMaxRetries) {
		this.sendEmailOnMaxRetries = sendEmailOnMaxRetries;
	}

	public BulkItemFeedRule(java.lang.String reprocessFailed, int maxRetries,
			boolean sendEmailOnMaxRetries) {
		this.reprocessFailed = reprocessFailed;
		this.maxRetries = maxRetries;
		this.sendEmailOnMaxRetries = sendEmailOnMaxRetries;
	}

}