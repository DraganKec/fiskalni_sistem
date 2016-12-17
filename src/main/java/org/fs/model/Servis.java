package org.fs.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "servis")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Servis {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "kasaid")
	private Kasa kasa;

	@Column(name = "datumservisa")
	private String datumServisa;

	private String opis;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Kasa getKasa() {
		return kasa;
	}

	public void setKasa(Kasa kasa) {
		this.kasa = kasa;
	}

	public String getDatumServisa() {
		return datumServisa;
	}

	public void setDatumServisa(String datumServisa) {
		this.datumServisa = datumServisa;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

}
