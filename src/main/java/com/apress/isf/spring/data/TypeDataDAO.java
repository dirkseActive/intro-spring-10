/**
 * 
 */
package com.apress.isf.spring.data;

import com.apress.isf.java.model.Type;

/**
 * @since 3/31/2017
 *
 */
public interface TypeDataDAO {
	public Type[] getAll();
	public Type findById(String id);
}
