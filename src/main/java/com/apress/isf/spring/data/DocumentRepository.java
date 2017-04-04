package com.apress.isf.spring.data;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.apress.isf.java.model.Document;
import com.apress.isf.spring.jdbc.DocumentRowMapper;

/**
 * @since 3/17/2017.  Last Updated: 4/03/2017 
 *
 */

@Repository("documentDAO")
public class DocumentRepository implements DocumentDAO {
	
	@Autowired
	private DataSource dataSource;
	@Autowired
	private String query;
	
	
	public List<Document> getAll(){
		return new JdbcTemplate(this.dataSource).query(query, new DocumentRowMapper());
	}
}
