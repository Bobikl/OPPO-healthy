package com.oplus.aiunit.vision;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public class bc0 implements ac0 {
    public final x56 a;

    public bc0(x56 x56Var) {
        this.a = x56Var;
    }

    @Override // com.oplus.aiunit.vision.ac0
    public long a(zb0 zb0Var) {
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("appId", zb0Var.a);
        contentValues.put("app_key", zb0Var.b);
        contentValues.put("app_secret", zb0Var.f19349c);
        return writableDatabase.replace("app_secrets", null, contentValues);
    }

    @Override // com.oplus.aiunit.vision.ac0
    public zb0 get(String str) {
        Cursor cursorQuery = this.a.getReadableDatabase().query("app_secrets", null, "appId=?", new String[]{str}, null, null, null);
        try {
            if (!cursorQuery.moveToFirst()) {
                return null;
            }
            zb0 zb0Var = new zb0();
            zb0Var.a = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("appId"));
            zb0Var.b = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("app_key"));
            zb0Var.f19349c = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("app_secret"));
            return zb0Var;
        } finally {
            cursorQuery.close();
        }
    }
}
