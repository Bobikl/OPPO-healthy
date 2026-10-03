package com.coloros.sceneservice.e;

import android.net.Uri;
import android.provider.BaseColumns;

/* JADX INFO: loaded from: classes13.dex */
public class d implements BaseColumns {
    public static final String KEY = "key";
    public static final String TABLE_NAME = "Settings";
    public static final Uri URI = com.coloros.sceneservice.b.a.a(TABLE_NAME);
    public static final String VALUE = "value";
    public static final String fb = "CREATE TABLE IF NOT EXISTS Settings (_id INTEGER PRIMARY KEY,key TEXT NOT NULL UNIQUE,value TEXT );";
}
