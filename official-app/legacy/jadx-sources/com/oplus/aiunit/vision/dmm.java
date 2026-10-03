package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes10.dex */
public class dmm {
    public cm0 a;
    public p4f b;

    public dmm(String str, Context context) {
        q8g.i("openSDK_LOG.QQAuth", "new QQAuth() --start");
        this.b = new p4f(str);
        this.a = new cm0(this.b);
        jcm.d(context, this.b);
        b(context, s04.SDK_VERSION);
        q8g.i("openSDK_LOG.QQAuth", "new QQAuth() --end");
    }

    public static dmm a(String str, Context context) {
        uum.c(context.getApplicationContext());
        q8g.i("openSDK_LOG.QQAuth", "QQAuth -- createInstance() --start");
        dmm dmmVar = new dmm(str, context);
        q8g.i("openSDK_LOG.QQAuth", "QQAuth -- createInstance()  --end");
        return dmmVar;
    }

    public static void b(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("BuglySdkInfos", 0).edit();
        editorEdit.putString("bcb3903995", str);
        editorEdit.apply();
    }

    public p4f c() {
        return this.b;
    }
}
