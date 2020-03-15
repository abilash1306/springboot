package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.mapper.DrugMapper;
import com.example.demo.dao.mapper.GeneMapper;
import com.example.demo.entity.Drug;
import com.example.demo.entity.Gene;

@Repository
public class GeneDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public List<Gene> geneList(String gene){
	    return (List<Gene>)jdbcTemplate.query("select * from gene where gene_name=?",new Object[] {gene},new GeneMapper());	
	}


	public List<Drug> drugList(String drugName,String category) {
		if(category == null)
    		return (List<Drug>)jdbcTemplate.query("select * from drug where drug_name=?",new Object[] {drugName}, new DrugMapper());
		
		return (List<Drug>)jdbcTemplate.query("select * from drug where drug_name=? and drug_type=?",new Object[] {drugName,category}, new DrugMapper());
	}
}
