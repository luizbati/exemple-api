package com.exemple.api.models;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="user.TABLE_NAME")
public class User {
	
	public static final String TABLE_NAME = "user";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "id",unique = true)
	private Long id;
	
	@Column(name = "username",length = 100,nullable = false,unique = true)
	@NotNull
	@NotEmpty
	@Size(min  = 2,max = 100)
	private String username;
	
	@Column(name = "password",length = 60,nullable = false)
	
	@NotNull
	@NotEmpty
	@Size(min  = 8,max = 60)
	private String password;
	
	public User() {
		
	}

	public User(Long id, @NotNull @NotEmpty @Size(min = 2, max = 100) String username,
			@NotNull @NotEmpty @Size(min = 8, max = 60) String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id) && Objects.equals(password, other.password)
				&& Objects.equals(username, other.username);
	}

	

}	
	









