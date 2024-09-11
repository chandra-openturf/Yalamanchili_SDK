package com.narada.sdk.models;

import com.narada.sdk.utilities.XmlElementName;

public class OTPValidationRequest {
	@XmlElementName("TxnRefNo")
	private String txnRefNo;

	@XmlElementName("ProxyNumber")
	private String proxyNumber;

	@XmlElementName("OTP")
	private String otp;

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
	 * @return the OTP value
	 */
	public String getOtp() {
		return otp;
	}

	/**
	 * @param otp the OTP value to set
	 */
	public void setOtp(String otp) {
		this.otp = otp;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OtpValidationRequest [txnRefNo=").append(txnRefNo).append(", proxyNumber=").append(proxyNumber)
				.append(", otp=").append(otp).append("]");
		return builder.toString();
	}
}
