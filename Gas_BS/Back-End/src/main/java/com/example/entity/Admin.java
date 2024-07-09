package com.example.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*import com.example.entity.AllArgsConstructor;
import com.example.entity.Builder;
import com.example.entity.Customer;
import com.example.entity.Data;
import com.example.entity.NoArgsConstructor;*/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Admin{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer admin_id;
	
	@Column(length = 60)
	private String admin_name;
	
	@Column(name = "password")
	private String password;
	
	 @OneToMany() //mappedBy = "admin"
	    private List<Customer> customerList;
	
	// @ManyToOne(mappedBy = "admin")
	// private List<Gas> gasList;
	 
	 
	/*@ManyToOne()
	@JoinColumn(name = "cust_id")
	@JsonIgnoreProperties("course")
	private Customer instructor;*/
	
	
	
}

