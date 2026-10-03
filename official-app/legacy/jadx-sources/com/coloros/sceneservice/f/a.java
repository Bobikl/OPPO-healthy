package com.coloros.sceneservice.f;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {
    public static final String TAG = "BaseManager";
    public ContentResolver mContentResolver;

    public a(Context context) {
        this.mContentResolver = null;
        if (context != null) {
            this.mContentResolver = context.getApplicationContext().getContentResolver();
        }
    }

    public abstract ContentValues a(Object obj);

    public abstract Object a(Cursor cursor);

    public ArrayList a(String[] strArr, String str, String[] strArr2, String str2) {
        return a(getUri(), strArr, str, strArr2, str2);
    }

    public abstract Uri getUri();

    public ArrayList a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursorQuery;
        ArrayList arrayList = new ArrayList();
        try {
            cursorQuery = this.mContentResolver.query(uri, strArr, str, strArr2, str2);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        while (cursorQuery.moveToNext()) {
                            arrayList.add(a(cursorQuery));
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append("queryAll: ");
                        sb.append(th);
                        com.coloros.sceneservice.m.f.e(TAG, sb.toString());
                    } finally {
                        com.coloros.sceneservice.m.d.closeQuietly(cursorQuery);
                    }
                }
            }
            com.coloros.sceneservice.m.d.closeQuietly(cursorQuery);
        } catch (Throwable th2) {
            th = th2;
            cursorQuery = null;
        }
        return arrayList;
    }

    public Object a(String str, String[] strArr, String str2) {
        ArrayList arrayListA = a(null, str, strArr, str2);
        if (com.coloros.sceneservice.m.e.a(arrayListA)) {
            return null;
        }
        return arrayListA.get(0);
    }
}
