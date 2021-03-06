package com.tm.invoice.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value = Include.NON_NULL)
public class InvoiceExceptionDetailsDTO implements Serializable {

	private static final long serialVersionUID = 4382875706277720023L;
	private String contractorName;
	private String fileNumber;
	private Date weekEndDate;
	private String st;
	private String ot;
	private String dt;
	private String amount;
	private String status;
	private String totalHours;
	private String returnComments;
	private String returnApprovalComments;
	private String currencyType;
	private String timesheetId;
	private String invoiceNumber;
	private Integer untis;
	private String rejectComments;
	
	public String getContractorName() {
		return contractorName;
	}

	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}

	public String getSt() {
		return st;
	}

	public void setSt(String st) {
		this.st = st;
	}

	public String getOt() {
		return ot;
	}

	public void setOt(String ot) {
		this.ot = ot;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReturnComments() {
		return returnComments;
	}

	public void setReturnComments(String returnComments) {
		this.returnComments = returnComments;
	}

	public String getReturnApprovalComments() {
		return returnApprovalComments;
	}

	public void setReturnApprovalComments(String returnApprovalComments) {
		this.returnApprovalComments = returnApprovalComments;
	}

	public String getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(String totalHours) {
		this.totalHours = totalHours;
	}

	public String getFileNumber() {
		return fileNumber;
	}

	public void setFileNumber(String fileNumber) {
		this.fileNumber = fileNumber;
	}

	public Date getWeekEndDate() {
		return weekEndDate;
	}

	public void setWeekEndDate(Date weekEndDate) {
		this.weekEndDate = weekEndDate;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public String getTimesheetId() {
		return timesheetId;
	}

	public void setTimesheetId(String timesheetId) {
		this.timesheetId = timesheetId;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Integer getUntis() {
		return untis;
	}

	public void setUntis(Integer untis) {
		this.untis = untis;
	}

	public String getRejectComments() {
		return rejectComments;
	}

	public void setRejectComments(String rejectComments) {
		this.rejectComments = rejectComments;
	}

	
}
