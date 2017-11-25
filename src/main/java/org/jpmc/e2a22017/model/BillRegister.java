package org.jpmc.e2a22017.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BillRegister {
	
	@Id
	@GeneratedValue
	private Long billNum;
	private String senderAcNo;
	private String receiverAcNo;
	private int amount;
	private Boolean billStatus;
	private String billMessage;
	
	public BillRegister() {
		
	}

	public Long getBillNum() {
		return billNum;
	}

	public void setBillNum(Long billNum) {
		this.billNum = billNum;
	}

	public Boolean getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(Boolean billStatus) {
		this.billStatus = billStatus;
	}

	public String getSenderAcNo() {
		return senderAcNo;
	}
	public void setSenderAcNo(String senderAcNo) {
		this.senderAcNo = senderAcNo;
	}
	public String getReceiverAcNo() {
		return receiverAcNo;
	}
	public void setReceiverAcNo(String receiverAcNo) {
		this.receiverAcNo = receiverAcNo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getBillMessage() {
		return billMessage;
	}
	public void setBillMessage(String billMessage) {
		this.billMessage = billMessage;
	}
	

}
