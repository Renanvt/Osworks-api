package com.algaworks.osworks.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Cliente {
	

	@Id //Define a chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Usa a estratégia nativa do banco de dados, no caso do mysql é o Auto_increment
	private Long id;
	
	
	@NotBlank //Não deixa o nome ser nulo, com espaços
	@Size(max = 60)
	private String nome;
	
	@NotBlank
	
	@Email //Validar o formato do email (@, .com, etc)
	@Size(max = 255)
	private String email;
	
	@NotBlank
	@Size(max = 20) //Tamanho máximo de 20 caracteres
	@Column(name="fone")
	private String telefone;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
