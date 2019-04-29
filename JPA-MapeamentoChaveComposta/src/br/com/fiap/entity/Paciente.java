package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="paciente", sequenceName="SQ_T_PACIENTE", allocationSize=1)
@Table(name="T_PACIENTE")
public class Paciente {

	@Id
	@GeneratedValue(generator="paciente", strategy=GenerationType.SEQUENCE)
	@Column(name="cd_paciente")
	private int codigo;
	
	@Column(name="nm_paciente")
	private String nome;
	
	@Column(name="ds_endereco")
	private String endereco;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
