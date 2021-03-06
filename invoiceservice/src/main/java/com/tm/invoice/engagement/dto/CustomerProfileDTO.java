package com.tm.invoice.engagement.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CustomerProfileDTO extends ResourceSupport implements Serializable {

	private static final long serialVersionUID = -3996522176189454337L;

	private static final String CUSTOMER_NUMBER_IS_REQUIRED = "Customer Number is Required";
	private static final String CUSTOMER_NAME_IS_REQUIRED = "Customer Name is Required";
	private static final String STATE_NAME_IS_REQUIRED = "State Name is Required";
	private static final String CITY_NAME_IS_REQUIRED = "City Name is Required";
	private static final String STATE_DATE_IS_REQUIRED = "Start Date is Required";
	private static final String END_DATE_IS_REQUIRED = "End Date is Required";
	private static final String UI_REQUEST_DATE_FORMAT = "MMM dd, yyyy";

	private Long customerId;
	@NotBlank(message = CUSTOMER_NUMBER_IS_REQUIRED)
	private String customerNumber;
	@NotBlank(message = CUSTOMER_NAME_IS_REQUIRED)
	private String customerName;
	private String customerEmail;
	private String customerPhone;
	private String customerAddress;
	private Long countryId;
	@NotBlank(message = STATE_NAME_IS_REQUIRED)
	private String stateName;
	@NotBlank(message = CITY_NAME_IS_REQUIRED)
	private String cityName;
	@NotBlank(message = STATE_DATE_IS_REQUIRED)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = UI_REQUEST_DATE_FORMAT)
	private String effectiveStartDate;
	@NotBlank(message = END_DATE_IS_REQUIRED)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = UI_REQUEST_DATE_FORMAT)
	private String effectiveEndDate;
	private String postalCode;
	private String activeFlag;
	private String countryName;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMM dd, yyyy HH:mm:ss a")
	private String createdDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMM dd, yyyy HH:mm:ss a")
	private String updatedDate;
	private Long createdBy;
	private Long updatedBy;
	private CountryDTO country;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getEffectiveStartDate() {
		return effectiveStartDate;
	}

	public void setEffectiveStartDate(String effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}

	public String getEffectiveEndDate() {
		return effectiveEndDate;
	}

	public void setEffectiveEndDate(String effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}

}