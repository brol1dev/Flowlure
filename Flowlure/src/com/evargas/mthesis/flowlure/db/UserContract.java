package com.evargas.mthesis.flowlure.db;

import android.provider.BaseColumns;

/**
 * Meta-data information of database and its tables
 * 
 * @author ericvargas
 *
 */
public class UserContract {

	// Avoid instantiation
	private UserContract() {}
	
	/* Meta-data for users table */
	public static abstract class UserEntry implements BaseColumns {
		public static final String TABLE_NAME = "User";
		public static final String COLUMN_USERNAME = "username";
		public static final String COLUMN_PASSWORD = "password";
	}
	
	
}
