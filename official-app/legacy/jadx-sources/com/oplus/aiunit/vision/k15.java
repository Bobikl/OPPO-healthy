package com.oplus.aiunit.vision;

import android.content.ContentValues;
import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class k15 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static k15 f13113c;
    public final y15 a;
    public pt4 b;

    public k15(Context context, String str) {
        this.a = y15.b(str);
        this.b = new nge(context);
    }

    public static k15 d(Context context, String str) {
        if (f13113c == null) {
            f13113c = new k15(context, str);
        }
        return f13113c;
    }

    public int a(long j2, int i, int i2, int i3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("appId", Long.valueOf(j2));
        contentValues.put(y15.PARAMS_DATA_TYPE, Integer.valueOf(i));
        contentValues.put("uploadType", Integer.valueOf(i2));
        contentValues.put(y15.PARAMS_INSERT_SIZE, Integer.valueOf(i3));
        return this.b.a(this.a.c(), contentValues);
    }

    public void b(int i) {
        try {
            this.b.b(this.a.a(), new JSONObject().put("value", i));
        } catch (JSONException e2) {
            k6k.e().c("DbAdapter", e2.toString(), null, new Object[0]);
        }
    }

    public int c() {
        String[] strArrC = this.b.c(this.a.a(), 1);
        if (strArrC == null || strArrC.length <= 0) {
            return 0;
        }
        return Integer.parseInt(strArrC[0]);
    }

    public void e(long j2, int i, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("appId", Long.valueOf(j2));
        contentValues.put(y15.PARAMS_DATA_TYPE, Integer.valueOf(i));
        contentValues.put("uploadType", Integer.valueOf(i2));
        this.b.a(this.a.d(), contentValues);
    }
}
