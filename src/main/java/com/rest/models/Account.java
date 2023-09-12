package com.rest.models;

import java.time.Instant;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Entity
@EntityListeners(AuditingEntityListener.class)
@Data
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int acc_id;
	
	@Column(nullable = false)
	private String bank;
	
	@Column(nullable = false)
	private int account_number;
	
	@CreatedDate
	private Instant createdAt;
	
	@LastModifiedDate
	private Instant updatedAt;
	
	@ManyToOne
	@JoinColumn(name = "emp_id")
	private Employee employee;
	
	
}
