package com.example.demo.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.entity.Gene;

public class GeneMapper implements RowMapper<Gene> {

	@Override
	public Gene mapRow(ResultSet rs, int rowNum) throws SQLException {
		Gene g = new Gene();
		g.setGeneId(rs.getInt("gene_id"));
		g.setName(rs.getString("gene_name"));
		g.setSymbols(rs.getString("gene_symbol"));
		g.setType(rs.getString("gene_type"));
		g.setInvolvementInDisease(rs.getString("involvement_in_disease"));
		g.setOrganism(rs.getString("organism"));
		g.setUniProtId(rs.getString("uni_prot_id"));
		g.setDrugUsed(rs.getString("drug_used"));
		return g;
	}

	

}
