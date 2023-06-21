package com.myspace.error_action;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ErrorAction implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String marketplaceCode;
	private java.lang.String feedType;
	private java.lang.String errorDetails;
	private java.lang.String invokeAction;

	public ErrorAction() {
	}

	public java.lang.String getMarketplaceCode() {
		return this.marketplaceCode;
	}

	public void setMarketplaceCode(java.lang.String marketplaceCode) {
		this.marketplaceCode = marketplaceCode;
	}

	public java.lang.String getFeedType() {
		return this.feedType;
	}

	public void setFeedType(java.lang.String feedType) {
		this.feedType = feedType;
	}

	public java.lang.String getErrorDetails() {
		return this.errorDetails;
	}

	public void setErrorDetails(java.lang.String errorDetails) {
		this.errorDetails = errorDetails;
	}

	public java.lang.String getInvokeAction() {
		return this.invokeAction;
	}

	public void setInvokeAction(java.lang.String invokeAction) {
		this.invokeAction = invokeAction;
	}

	public ErrorAction(java.lang.String marketplaceCode,
			java.lang.String feedType, java.lang.String errorDetails,
			java.lang.String invokeAction) {
		this.marketplaceCode = marketplaceCode;
		this.feedType = feedType;
		this.errorDetails = errorDetails;
		this.invokeAction = invokeAction;
	}

}