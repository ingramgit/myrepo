package com.myspace.bulk_item_upload;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class MPItemMatchRule implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private int minSizeToProcess;
	private int maxWaitInterval;
	private java.lang.String reprocessFailed;
	private int maxRetries;
	private java.lang.String sendEmailOnMaxRetries;
	private java.lang.String maxRecordsToSendToMarketplace;

	public MPItemMatchRule() {
	}

	public int getMinSizeToProcess() {
		return this.minSizeToProcess;
	}

	public void setMinSizeToProcess(int minSizeToProcess) {
		this.minSizeToProcess = minSizeToProcess;
	}

	public int getMaxWaitInterval() {
		return this.maxWaitInterval;
	}

	public void setMaxWaitInterval(int maxWaitInterval) {
		this.maxWaitInterval = maxWaitInterval;
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

	public java.lang.String getSendEmailOnMaxRetries() {
		return this.sendEmailOnMaxRetries;
	}

	public void setSendEmailOnMaxRetries(java.lang.String sendEmailOnMaxRetries) {
		this.sendEmailOnMaxRetries = sendEmailOnMaxRetries;
	}

	public java.lang.String getMaxRecordsToSendToMarketplace() {
		return this.maxRecordsToSendToMarketplace;
	}

	public void setMaxRecordsToSendToMarketplace(
			java.lang.String maxRecordsToSendToMarketplace) {
		this.maxRecordsToSendToMarketplace = maxRecordsToSendToMarketplace;
	}

	public MPItemMatchRule(int minSizeToProcess, int maxWaitInterval,
			java.lang.String reprocessFailed, int maxRetries,
			java.lang.String sendEmailOnMaxRetries,
			java.lang.String maxRecordsToSendToMarketplace) {
		this.minSizeToProcess = minSizeToProcess;
		this.maxWaitInterval = maxWaitInterval;
		this.reprocessFailed = reprocessFailed;
		this.maxRetries = maxRetries;
		this.sendEmailOnMaxRetries = sendEmailOnMaxRetries;
		this.maxRecordsToSendToMarketplace = maxRecordsToSendToMarketplace;
	}

}