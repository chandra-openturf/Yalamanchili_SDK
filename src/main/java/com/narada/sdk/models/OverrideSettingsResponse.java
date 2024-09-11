package com.narada.sdk.models;

import com.narada.sdk.utilities.XmlElementName;

public class OverrideSettingsResponse {
	@XmlElementName("TxnRefNo")
	private String txnRefNo;

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChangePinResponse [txnRefNo=").append(txnRefNo).append("]");
		return builder.toString();
	}
}
