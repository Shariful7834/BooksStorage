package com.example.mehrabpatwary.booksstorage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;
// database create by zahid
public class BookMarkHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Bookmark.db";
    private static final String TABLE_NAME = "bookmark_details";
    private static final String BOOK_ID = "bookNameId";
    private static final String USER_ID = "userId";
    private static final int VERSION_NUMBER = 1;
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" + BOOK_ID + " KEY1, " + USER_ID + " KEY2)";

    private Context context;

    public BookMarkHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION_NUMBER);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            Toast.makeText(context, "On create is called", Toast.LENGTH_LONG).show();
            db.execSQL(CREATE_TABLE);
        } catch (Exception e) {
            Toast.makeText(context, "Exception : " + e, Toast.LENGTH_LONG).show();
        }
        }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
