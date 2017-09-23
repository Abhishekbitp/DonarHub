package com.example.prince.savelife;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by prince on 19/6/17.
 */

public class RegisterDatabase extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "registered.db";
    private static final String TABLE_NAME = "registered";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_ADD = "add";
    private static final String COLUMN_city = "city";
    private static final String COLUMN_MOB = "mob";
    private static final String COLUMN_BLOOD = "blood";
    private static final String COLUMN_AGE = "age";

    SQLiteDatabase rdb;

    private static final String TABLE_CREATE = "create table registered(id integer primary key not null," + "name text not null , add text not null , city text not null , mob text not null , blood text not null , age text not null);";

    public RegisterDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        rdb.execSQL(TABLE_CREATE);
        this.rdb = rdb;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        rdb.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        this.onCreate(rdb);
    }

    public void reguser(RegisterUser u) {
        rdb = this.getWritableDatabase();
        ContentValues value = new ContentValues();

        Cursor c = rdb.rawQuery("select * from Registeruser", null);
        int k = c.getCount();
        value.put(COLUMN_ID, k);
        value.put(COLUMN_NAME, u.getName());
        value.put(COLUMN_ADD, u.getAdd());
        value.put(COLUMN_city, u.getCity());
        value.put(COLUMN_MOB, u.getMob());
        value.put(COLUMN_BLOOD, u.getBlood());
        value.put(COLUMN_AGE, u.getAge());

        rdb.insert(TABLE_NAME, null, value);
        rdb.close();
    }
}
