package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_MEDICO")
@SequenceGenerator(name="medico", sequenceName="SQ_T_MEDICO", allocationSize=1)
public class Medico {
	
	@Id
	@Column(name="nr_crm")
	@GeneratedValue(generator="medico", strategy = GenerationType.SEQUENCE)
	private int crm;
	
	@Column(name="nm_medico")
	private String nome;
	
	@Column(name="ds_especialidade")
	@Enumerated(EnumType.STRING)
	private Especialidade especialidade;

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	
	
}
