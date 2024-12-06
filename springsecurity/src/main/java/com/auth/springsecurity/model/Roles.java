package com.auth.springsecurity.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_roles")
public class Roles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "roles_id")
	private Long rolesId;
	
	private String nome;

	public Long getRolesId() {
		return rolesId;
	}

	public void setRolesId(Long rolesId) {
		this.rolesId = rolesId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public enum Values{
		BASIC(1L), //L = Long
		ADMIN(2L);
		
		Long rolesId;
		
		Values(Long rolesId){
			this.rolesId = rolesId;
		}

		public Long getRolesId() {
			return rolesId;
		}

		public void setRolesId(Long rolesId) {
			this.rolesId = rolesId;
		}
		
	}
}
