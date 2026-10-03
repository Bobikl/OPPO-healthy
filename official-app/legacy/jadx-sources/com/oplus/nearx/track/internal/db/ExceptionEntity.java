package com.oplus.nearx.track.internal.db;

import android.database.Cursor;
import com.oplus.aiunit.vision.l6k;
import com.oplus.aiunit.vision.l7k;

/* JADX INFO: loaded from: classes8.dex */
public class ExceptionEntity implements l7k {
    long _id = 0;

    @l6k
    public long moduleId = 0;

    @l6k
    public long eventTime = 0;

    @l6k
    public String exception = "";

    @l6k
    public long count = 1;

    @l6k
    public String moduleVersion = "";

    @l6k
    public String md5 = "";

    @l6k
    public String kvProperties = "";

    public static ExceptionEntity convertCursor(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        ExceptionEntity exceptionEntity = new ExceptionEntity();
        exceptionEntity._id = cursor.getLong(cursor.getColumnIndex("_id"));
        exceptionEntity.moduleId = cursor.getLong(cursor.getColumnIndex("module_id"));
        exceptionEntity.eventTime = cursor.getLong(cursor.getColumnIndex("event_time"));
        exceptionEntity.exception = cursor.getString(cursor.getColumnIndex("exception"));
        exceptionEntity.count = cursor.getLong(cursor.getColumnIndex("count"));
        exceptionEntity.moduleVersion = cursor.getString(cursor.getColumnIndex("module_version"));
        exceptionEntity.md5 = cursor.getString(cursor.getColumnIndex("md5"));
        exceptionEntity.kvProperties = cursor.getString(cursor.getColumnIndex("kv_properties"));
        return exceptionEntity;
    }
}
