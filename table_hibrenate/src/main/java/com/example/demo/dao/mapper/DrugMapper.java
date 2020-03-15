package com.example.demo.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.entity.Drug;

public class DrugMapper implements RowMapper<Drug> {

	@Override
	public Drug mapRow(ResultSet rs, int rowNum) throws SQLException {
		Drug d = new Drug();
		d.setDrugName(rs.getString("drug_name"));
		d.setDrugType(rs.getString("drug_type"));
		d.setDrugUsedInCancer(rs.getString("drug_use_in_cancer"));
		d.setMolecularFormula(rs.getString("molecular_formula"));
		d.setMolecularWeight(rs.getString("molecular_weight"));
		d.setPubchemId(rs.getString("pubchem_id"));
		d.setTargets(rs.getString("targets"));
		d.setTherapeuticClass(rs.getString("therapeutic_class"));
		d.setUsedToTreatDiseases(rs.getString("used_to_treat_diseases"));
		return d;
	}

}
