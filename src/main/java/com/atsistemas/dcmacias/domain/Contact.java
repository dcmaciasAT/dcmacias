package com.atsistemas.dcmacias.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "CONTACT")
public class Contact {

	public Contact() {
	}

	public Contact(@NotNull Long phone, @NotNull String contactName) {
		this.phone = phone;
		this.contactName = contactName;
	}

	@Id
	@NotNull
	@ApiModelProperty(notes = "The contact id")
	@Column(name = "PHONE", nullable = false, unique = true)
	private Long phone;

	@NotNull
	@ApiModelProperty(notes = "The contact name")
	@Column(name = "NAME", nullable = false, unique = false)
	private String contactName;

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	@Override
	public String toString() {
		return "Contact [phone=" + phone + ", contactName=" + contactName + "]";
	}

	
	
}
