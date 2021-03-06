package br.usjt.jpa_hibernate_prev.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_diasemana")
public class DiasDaSemana {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String diasemana;
	@OneToOne(optional=false)
	@JoinColumn(name="id_da_minha_previsao")
	private Previsao previsao;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDiasemana() {
		return diasemana;
	}
	public void setDiasemana(String diasemana) {
		this.diasemana = diasemana;
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
		DiasDaSemana other = (DiasDaSemana) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DiasDaSemana [id=" + id + ", diasemana=" + diasemana + ", previsao=" + previsao + "]";
	}

	
	

}
