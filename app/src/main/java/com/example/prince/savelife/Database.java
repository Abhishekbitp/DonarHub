package com.example.prince.savelife;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by prince on 18/6/17.
 */

public class Database extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "user.db";
    private static final String TABLE_NAME ="user";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_MOB ="mob";
    private static final String COLUMN_NAME ="name";
    private static final String COLUMN_PASS ="pass";

    SQLiteDatabase db;

    private static final String TABLE_CREATE = "create table user(id integer primary key not null,"+"name text not null , mob text not null , pass text not null);";


    public Database(Context context) {
        super(context,DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME);
        this.onCreate(db);
    }


    public void adduser(user u) {
        db = this.getWritableDatabase();
        ContentValues value = new ContentValues();

        Cursor c =db.rawQuery("select * from user",null);
        int k = c.getCount();
        value.put(COLUMN_ID,k);
        value.put(COLUMN_NAME,u.getName());
        value.put(COLUMN_MOB,u.getmob());
        value.put(COLUMN_PASS,u.getPassword());
        db.insert(TABLE_NAME,null,value);
        db.close();
    }

    public String searchpass(String name) {
        db = this.getReadableDatabase();
        Cursor c = db.rawQuery("select name, pass from "+TABLE_NAME,null);
        String a,b;
        b="USER NAME NOT FOUND";
        if(c.moveToFirst())
        {
            b = "hello";
            do
            {
                a=c.getString(0);


                if(a.equalsIgnoreCase(name))
                {
                    b = c.getString(1);
                    break;
                }
            }while (c.moveToNext());
        }
       return b;
    }

}
