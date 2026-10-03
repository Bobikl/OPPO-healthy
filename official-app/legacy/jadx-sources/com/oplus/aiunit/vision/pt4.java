package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public abstract class pt4 {
    public ContentResolver a;

    public pt4(Context context) {
        this.a = context.getContentResolver();
    }

    public abstract int a(Uri uri, ContentValues contentValues);

    public abstract int b(Uri uri, JSONObject jSONObject);

    public abstract String[] c(Uri uri, int i);
}
