package com.example.venkateshjose.sqlitesample;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by venkatesh jose on 4/24/2017.
 */

public class DBHelper extends SQLiteOpenHelper {


    public SQLiteDatabase db = getWritableDatabase();



    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public String getDatabaseName() {
        return "venkatesh1100";
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE USER(userid integer primary key, fname TEXT , lname TEXT , age int, address TEXT");
        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE USER IF EXISTS");
        onCreate(db);

    }


    public void insertUser(String fName, String lName, String age, String address){

        db.execSQL("INSERT INTO USER(userid,fname,lname,age,address) VALUES(1,'"+fName+"','"+lName+"',"+age+",'"+address+"')");
    }



}
