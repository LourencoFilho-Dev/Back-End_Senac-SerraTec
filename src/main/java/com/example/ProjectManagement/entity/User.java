package com.example.ProjectManagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    private String nome;
    private String email;
    private String senha;

    @ManyToOne
    @JoinColumn(name = "idRole")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "idEventReason")
    private EventReason eventReason;

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public EventReason getEventReason() {
		return eventReason;
	}

	public void setEventReason(EventReason eventReason) {
		this.eventReason = eventReason;
	}

    // Getters and setters
}
