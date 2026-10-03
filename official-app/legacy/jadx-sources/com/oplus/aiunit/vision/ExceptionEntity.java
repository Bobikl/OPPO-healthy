package com.oplus.aiunit.vision;

import android.database.Cursor;

/* JADX INFO: loaded from: classes17.dex */
public class ExceptionEntity implements m7k {
    public long a = 0;
    public long b = 0;

    @m6k
    public long eventTime = 0;

    @m6k
    public String exception = "";

    @m6k
    public long count = 1;

    @m6k
    public String moduleVersion = "";

    @m6k
    public String md5 = "";

    @m6k
    public String kvProperties = "";

    public static ExceptionEntity a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        ExceptionEntity exceptionEntity = new ExceptionEntity();
        exceptionEntity.a = cursor.getLong(cursor.getColumnIndex("_id"));
        exceptionEntity.b = cursor.getLong(cursor.getColumnIndex("module_id"));
        exceptionEntity.eventTime = cursor.getLong(cursor.getColumnIndex("event_time"));
        exceptionEntity.exception = cursor.getString(cursor.getColumnIndex("exception"));
        exceptionEntity.count = cursor.getLong(cursor.getColumnIndex("count"));
        exceptionEntity.moduleVersion = cursor.getString(cursor.getColumnIndex("module_version"));
        exceptionEntity.md5 = cursor.getString(cursor.getColumnIndex("md5"));
        exceptionEntity.kvProperties = cursor.getString(cursor.getColumnIndex("kv_properties"));
        return exceptionEntity;
    }
}
