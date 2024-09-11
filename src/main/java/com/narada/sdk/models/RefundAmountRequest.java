package com.narada.sdk.models;

import com.narada.sdk.utilities.XmlElementName;

public class RefundAmountRequest {
	@XmlElementName("TxnRefNo")
	private String txnRefNo;
	@XmlElementName("ProxyNumber")
	private String proxyNumber;
	@XmlElementName("ProductCode")
	private String productCode;
	@XmlElementName("Amount")
	private String amount;
	
	/**
	 * @return the transaction reference number
	 */
	public String getTxnRefNo() {
		return txnRefNo;
	}

	/**
	 * @param txnRefNo the transaction reference number to set
	 */
	public void setTxnRefNo(String txnRefNo) {
		this.txnRefNo = txnRefNo;
	}

	/**
	 * @return the proxy number
	 */
	public String getProxyNumber() {
		return proxyNumber;
	}

	/**
	 * @param proxyNumber the proxy number to set
	 */
	public void setProxyNumber(String proxyNumber) {
		this.proxyNumber = proxyNumber;
	}
	
	/**
	 * @return the product code
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * @param productCode the product code to set
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RefundAmountRequest [txnRefNo=").append(txnRefNo).append(", proxyNumber=").append(proxyNumber)
				.append(", productCode=").append(productCode).append(", amount=").append(amount)
				.append("]");
		return builder.toString();
	}
}