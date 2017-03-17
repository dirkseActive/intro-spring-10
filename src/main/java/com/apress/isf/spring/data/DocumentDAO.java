/**
 * 
 */
package com.apress.isf.spring.data;

import java.util.List;

import com.apress.isf.java.model.Document;

/**
 * @since 3/17/2017
 *
 */
public interface DocumentDAO {
	public List<Document> getAll();
}
