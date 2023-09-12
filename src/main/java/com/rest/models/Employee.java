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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emp_id;
	
	@Column(nullable = false)
	private String emp_name;
	
	@Column(nullable = false)
	private int emp_salary;
	
	@Column(nullable = false)
	private String phone;
	
	@CreatedDate
	private Instant createdAt;
	
	@LastModifiedDate
	private Instant updatedAt;
	
	@OneToOne
	@JoinColumn(name= "parking_id")
	private Parking parking;
	
	@OneToMany(mappedBy = "employee")
	private List<Account> accounts;
	
	@ManyToMany
	@JoinTable(
			name = "employee_project",
			joinColumns = @JoinColumn(name= "employee_id", referencedColumnName = "emp_id"),
			inverseJoinColumns = @JoinColumn(name= "pro_id", referencedColumnName = "project_id")	
			)
	private List<Project> project;
	
	
}
