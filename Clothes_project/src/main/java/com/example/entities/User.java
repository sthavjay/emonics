package com.example.entities;

import java.util.Set;

import javax.management.relation.Role;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class User {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@NotBlank
		@Size(max = 20)
		private String username;

	
		@Size(max = 50)
		@Email
		private String email;

		@Size(max = 120)
		private String password;

		@ManyToMany(fetch = FetchType.LAZY)
		@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
		private Set<Role> roles;
		
		
		public User() {
		}
		
		public User(String username, String email, String password) {
			this.username = username;
			this.email = email;
			this.password = password;
		}
}
