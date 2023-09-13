package net.javaguides.springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tickets")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "company")
	private String company;
	
	@Column(name = "groupName")
	private String groupName;
	
	public Ticket() {
		
	}
	
	public Ticket(String firstName, String company, String groupName) {
		super();
		this.firstName = firstName;
		this.company = company;
		this.groupName = groupName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
}
