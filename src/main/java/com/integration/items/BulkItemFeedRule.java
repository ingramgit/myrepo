package com.integration.items;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BulkItemFeedRule implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private boolean reprocessFailed;
	private int maxRetries;
	private boolean sendEmailOnMaxRetries;

	public BulkItemFeedRule() {
	}

	public int getMaxRetries() {
		return this.maxRetries;
	}

	public void setMaxRetries(int maxRetries) {
		this.maxRetries = maxRetries;
	}

	public boolean isReprocessFailed() {
		return this.reprocessFailed;
	}

	public void setReprocessFailed(boolean reprocessFailed) {
		this.reprocessFailed = reprocessFailed;
	}

	public boolean isSendEmailOnMaxRetries() {
		return this.sendEmailOnMaxRetries;
	}

	public void setSendEmailOnMaxRetries(boolean sendEmailOnMaxRetries) {
		this.sendEmailOnMaxRetries = sendEmailOnMaxRetries;
	}

	public BulkItemFeedRule(boolean reprocessFailed, int maxRetries,
			boolean sendEmailOnMaxRetries) {
		this.reprocessFailed = reprocessFailed;
		this.maxRetries = maxRetries;
		this.sendEmailOnMaxRetries = sendEmailOnMaxRetries;
	}

}