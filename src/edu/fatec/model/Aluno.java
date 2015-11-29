/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fatec.model;

/**
 *
 * @author Rafael
 */
public class Aluno {

	private String ra;
	private String nome;

	public Aluno(String nome, String ra) {
		this.ra = ra;
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Aluno{" + "ra=" + ra + ", nome=" + nome + '}';
	}

}
