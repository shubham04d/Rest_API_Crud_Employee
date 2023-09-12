package com.rest.models;

import java.time.Instant;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Data
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int project_id;
	
	@Column(nullable = false)
	private String project_name;
	
	@Column(nullable = false)
	private String duration;
	
	@CreatedDate
	private Instant createdAt;
	
	@LastModifiedDate
	private Instant updatedAt;
	
	@ManyToMany(mappedBy = "project")
	private List<Employee> employee;
}
