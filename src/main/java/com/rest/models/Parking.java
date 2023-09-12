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
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Data
public class Parking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int p_id;
	
	@Column(nullable = false)
	private String parking_code;
	
	@Column(nullable = false)
	private String vehicle_type;
	
	@Column(nullable = false)
	private String vehicle_number;
	
	@CreatedDate   
	private Instant createdAt;
	
	@LastModifiedDate
	private Instant updatedAt;
	
	@OneToOne(mappedBy = "parking")
	private Employee employee;
}
