package com.evargas.mthesis.flowlure.db;

import com.evargas.mthesis.flowlure.db.UserContract.UserEntry;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class UserOpenHelper extends SQLiteOpenHelper {

	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_NAME = "User.db";
	private static final String TEXT_TYPE = " TEXT";
	private static final String COMMA_SEP = ",";
	
	public UserOpenHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		// Create database and tables
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

	private abstract class UserQuery {
		
		public static final String CREATE_USER_TABLE = 
				"CREATE TABLE " + UserEntry.TABLE_NAME + " (" +
				UserEntry._ID + " INTEGER PRIMARY KEY," +
				UserEntry.COLUMN_USERNAME + TEXT_TYPE + COMMA_SEP +
				UserEntry.COLUMN_PASSWORD + TEXT_TYPE ;
	}
}
