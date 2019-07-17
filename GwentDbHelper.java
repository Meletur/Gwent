package com.meletur.gwent_beta.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Мелетур on 31.07.2018.
 */

public class GwentDbHelper extends SQLiteOpenHelper {

    public final static String DATABASE_NAME = "Gwent.db";
    public final static int DATABASE_VERSION = 1;

    public GwentDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db){
        String SQL_CREATE_CARDS_TABLE = "CREATE TABLE " + GwentContract.CardsTable.TABLE_NAME + " ("
                + GwentContract.CardsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + GwentContract.CardsTable.COLUMN_NAME + " TEXT NOT NULL, "
                + GwentContract.CardsTable.COLUMN_FACTION + " INTEGER NOT NULL, "
                + GwentContract.CardsTable.COLUMN_TYPE + " INTEGER NOT NULL, "
                + GwentContract.CardsTable.COLUMN_RARITY + " INTEGER NOT NULL, "
                + GwentContract.CardsTable.COLUMN_LOYALTY + " INTEGER NOT NULL, "
                + GwentContract.CardsTable.COLUMN_POWER + " INTEGER NOT NULL, "
                + GwentContract.CardsTable.COLUMN_TAG_1 + " TEXT, "
                + GwentContract.CardsTable.COLUMN_TAG_2 + " TEXT, "
                + GwentContract.CardsTable.COLUMN_TAG_3 + " TEXT);";
        db.execSQL(SQL_CREATE_CARDS_TABLE);
        String SQL_FILL_CARDS_TABLE = "INSERT INTO " + GwentContract.CardsTable.TABLE_NAME
                + " VALUES (0, NAME, 0, 0, RARITY, 0, POWER, TAG_1, TAG_2, TAG_3); "
                + " VALUES (0, NAME, 0, 0, RARITY, 0, POWER, TAG_1, TAG_2, TAG_3); "
                + " VALUES (0, NAME, 0, 0, RARITY, 0, POWER, TAG_1, TAG_2, TAG_3); "
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

}
