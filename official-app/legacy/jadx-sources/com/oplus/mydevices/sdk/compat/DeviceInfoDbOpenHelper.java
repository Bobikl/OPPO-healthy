package com.oplus.mydevices.sdk.compat;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes8.dex */
public class DeviceInfoDbOpenHelper extends SQLiteOpenHelper {
    public static final String ACTION_MENU_TABLE_NAME = "action_menu_table";
    private static final String DB_NAME = "device_info.db";
    public static final String DEVICE_INFO_TABLE_NAME = "device_info_table";
    public static final String INTENT_EXTRA_TABLE_NAME = "intent_extra_table";
    private static final String TAG = "DeviceInfoDbOpenHelper";
    private final String CREATE_TABLE_ACTION_MENU;
    private final String CREATE_TABLE_DEVICE_INFO;
    private final String CREATE_TABLE_INTENT_EXTRA;

    public DeviceInfoDbOpenHelper(Context context, int i) {
        super(context, DB_NAME, (SQLiteDatabase.CursorFactory) null, i);
        this.CREATE_TABLE_DEVICE_INFO = "create table device_info_table(_id integer primary key autoincrement, device_id text, device_name text, device_icon_res_id integer, device_icon_res_id_dark integer, device_type text, device_state text)";
        this.CREATE_TABLE_ACTION_MENU = "create table action_menu_table(_id integer primary key autoincrement, device_id text, menu_id text, menu_name text, menu_icon_res_id integer, menu_icon_res_id_dark integer, menu_action_type text, menu_intent_action text, menu_intent_package text, menu_intent_class text, menu_intent_have_extra integer)";
        this.CREATE_TABLE_INTENT_EXTRA = "create table intent_extra_table(_id integer primary key autoincrement, device_id text, menu_id text, intent_extra_key text, intent_extra_value text)";
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        OLog.i(TAG, "onCreate");
        sQLiteDatabase.execSQL("create table device_info_table(_id integer primary key autoincrement, device_id text, device_name text, device_icon_res_id integer, device_icon_res_id_dark integer, device_type text, device_state text)");
        sQLiteDatabase.execSQL("create table action_menu_table(_id integer primary key autoincrement, device_id text, menu_id text, menu_name text, menu_icon_res_id integer, menu_icon_res_id_dark integer, menu_action_type text, menu_intent_action text, menu_intent_package text, menu_intent_class text, menu_intent_have_extra integer)");
        sQLiteDatabase.execSQL("create table intent_extra_table(_id integer primary key autoincrement, device_id text, menu_id text, intent_extra_key text, intent_extra_value text)");
        OLog.i(TAG, "onCreate end");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        OLog.i(TAG, "onUpgrade");
        sQLiteDatabase.execSQL("drop table if exists device_info_table");
        sQLiteDatabase.execSQL("drop table if exists action_menu_table");
        sQLiteDatabase.execSQL("drop table if exists intent_extra_table");
        onCreate(sQLiteDatabase);
        OLog.i(TAG, "onUpgrade end");
    }
}
