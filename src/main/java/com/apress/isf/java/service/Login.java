package com.apress.isf.java.service;

/**
 * @since 3/31/2017
 *
 */
public interface Login {
	public boolean isAuthorized(String email, String pass);
}
