package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="gene")
public class Gene {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int geneId;
	@Column(name="gene_name")
	@NotNull(message="Name should not be null in Gene")
	private String name;
	@NotNull(message="symbols should not be null in Gene")
	@Column(name="gene_symbol")
	private String symbols;
	@NotNull(message="type should not be null in Gene")
	@Column(name="gene_type")
	private String type;
	
	@Column(name="organism")
	private String organism;
	
	@Column(name="uni_prot_id")
	private String uniProtId;
	
	@Column(name="drug_used")
	private String drugUsed;
	
	@Column(name="involvement_in_disease")
	private String involvementInDisease;

	public int getGeneId() {
		return geneId;
	}

	public void setGeneId(int gene_id) {
		this.geneId = gene_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbols() {
		return symbols;
	}

	public void setSymbols(String symbols) {
		this.symbols = symbols;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOrganism() {
		return organism;
	}

	public void setOrganism(String organism) {
		this.organism = organism;
	}

	public String getUniProtId() {
		return uniProtId;
	}

	public void setUniProtId(String uniProtId) {
		this.uniProtId = uniProtId;
	}

	public String getDrugUsed() {
		return drugUsed;
	}

	public void setDrugUsed(String drugUsed) {
		this.drugUsed = drugUsed;
	}

	public String getInvolvementInDisease() {
		return involvementInDisease;
	}

	public void setInvolvementInDisease(String involvementInDisease) {
		this.involvementInDisease = involvementInDisease;
	}
	
	
	
	
}
