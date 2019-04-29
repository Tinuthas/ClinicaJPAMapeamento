package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_CONSULTA")
@IdClass(ConsultaPK.class)
public class Consulta {
	
	@Id
	@Column(name="cd_consulta")
	@GeneratedValue(generator="consulta",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="consulta",sequenceName="SQ_T_CONSULTA",allocationSize=1)
	private int codigo;

	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_paciente")
	private Paciente paciente;
	
	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_medico")
	private Medico medico;
	
	@Id
	@Temporal(TemporalType.DATE)
	@Column(name="dt_consulta")
	private Calendar data;
	
	@Column(name="vl_consulta")
	private double valor;
	
	@Column(name="st_convenio")
	private boolean convenio;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isConvenio() {
		return convenio;
	}

	public void setConvenio(boolean convenio) {
		this.convenio = convenio;
	}
	
	
	
}
