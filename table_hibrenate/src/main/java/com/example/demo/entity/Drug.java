package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="drug")
public class Drug {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int drugId;
	
	@Column(name="drug_name")
	private String drugName;
	
	@Column(name="drug_type")
	private String drugType;
	
	@Column(name="drug_used_in_cancer")
	private String drugUsedInCancer;
	
	@Column(name="molecular_formula")
	private String molecularFormula;
	
	@Column(name="molecular_weight")
	private String molecularWeight;
	
	@Column(name="pubchem_id")
	private String pubchemId;
	
	@Column(name="targets")
	private String targets;
	
	@Column(name="therapeutic_class")
	private String therapeuticClass;
	
	@Column(name="used_to_treat_diseases")
	private String usedToTreatDiseases;

	public int getDrugId() {
		return drugId;
	}

	public void setDrugId(int drug_id) {
		this.drugId = drug_id;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getDrugType() {
		return drugType;
	}

	public void setDrugType(String drugType) {
		this.drugType = drugType;
	}

	public String getDrugUsedInCancer() {
		return drugUsedInCancer;
	}

	public void setDrugUsedInCancer(String drugUsedInCancer) {
		this.drugUsedInCancer = drugUsedInCancer;
	}

	public String getMolecularFormula() {
		return molecularFormula;
	}

	public void setMolecularFormula(String molecularFormula) {
		this.molecularFormula = molecularFormula;
	}

	public String getMolecularWeight() {
		return molecularWeight;
	}

	public void setMolecularWeight(String molecularWeight) {
		this.molecularWeight = molecularWeight;
	}

	public String getPubchemId() {
		return pubchemId;
	}

	public void setPubchemId(String pubchemId) {
		this.pubchemId = pubchemId;
	}

	public String getTargets() {
		return targets;
	}

	public void setTargets(String targets) {
		this.targets = targets;
	}

	public String getTherapeuticClass() {
		return therapeuticClass;
	}

	public void setTherapeuticClass(String therapeuticClass) {
		this.therapeuticClass = therapeuticClass;
	}

	public String getUsedToTreatDiseases() {
		return usedToTreatDiseases;
	}

	public void setUsedToTreatDiseases(String usedToTreatDiseases) {
		this.usedToTreatDiseases = usedToTreatDiseases;
	}
	
	
	
}
