package com.oplus.aiunit.vision;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.oplus.drs.core.config.entity.DebugModeEntity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ef9 implements df9 {
    public final x56 a;

    public ef9(x56 x56Var) {
        this.a = x56Var;
    }

    @Override // com.oplus.aiunit.vision.df9
    public int a(List<cf9> list) {
        int i = 0;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            for (cf9 cf9Var : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("scope", cf9Var.a);
                contentValues.put("appId", cf9Var.b);
                contentValues.put("bizHost", cf9Var.f10059c);
                contentValues.put("techHost", cf9Var.d);
                contentValues.put("v", Integer.valueOf(cf9Var.f10060e));
                contentValues.put("is_expired", Integer.valueOf(cf9Var.f));
                contentValues.put("updated_at", Long.valueOf(cf9Var.g));
                contentValues.put(DebugModeEntity.KEY_AREA, cf9Var.h);
                if (writableDatabase.insertWithOnConflict("host_config", null, contentValues, 5) != -1) {
                    i++;
                }
            }
            writableDatabase.setTransactionSuccessful();
            return i;
        } finally {
            writableDatabase.endTransaction();
        }
    }

    @Override // com.oplus.aiunit.vision.df9
    public cf9 b(String str) {
        return e("GLOBAL", null, str);
    }

    @Override // com.oplus.aiunit.vision.df9
    public cf9 c(String str, String str2) {
        return e("APP", str, str2);
    }

    @Override // com.oplus.aiunit.vision.df9
    public List<cf9> d(String str) {
        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = readableDatabase.query("host_config", new String[]{"scope", "appId", "bizHost", "techHost", "v", "is_expired", "updated_at", DebugModeEntity.KEY_AREA}, "scope=? AND (area=? OR area IS NULL)", new String[]{"APP", str}, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                cf9 cf9Var = new cf9();
                cf9Var.a = cursorQuery.getString(0);
                cf9Var.b = cursorQuery.getString(1);
                cf9Var.f10059c = cursorQuery.getString(2);
                cf9Var.d = cursorQuery.getString(3);
                cf9Var.f10060e = cursorQuery.getInt(4);
                cf9Var.f = cursorQuery.getInt(5);
                cf9Var.g = cursorQuery.getLong(6);
                cf9Var.h = cursorQuery.getString(7);
                arrayList.add(cf9Var);
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public final cf9 e(String str, String str2, String str3) {
        String[] strArr;
        String str4;
        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
        if (str2 == null) {
            strArr = new String[]{str, str3};
            str4 = "scope=? AND appId IS NULL AND (area=? OR area IS NULL)";
        } else {
            strArr = new String[]{str, str2, str3};
            str4 = "scope=? AND appId=? AND (area=? OR area IS NULL)";
        }
        String[] strArr2 = {"scope", "appId", "bizHost", "techHost", "v", "is_expired", "updated_at", DebugModeEntity.KEY_AREA};
        Cursor cursorQuery = readableDatabase.query("host_config", strArr2, str4, strArr, null, null, null);
        try {
            if (!cursorQuery.moveToFirst()) {
                return null;
            }
            cf9 cf9Var = new cf9();
            cf9Var.a = cursorQuery.getString(0);
            cf9Var.b = cursorQuery.getString(1);
            cf9Var.f10059c = cursorQuery.getString(2);
            cf9Var.d = cursorQuery.getString(3);
            cf9Var.f10060e = cursorQuery.getInt(4);
            cf9Var.f = cursorQuery.getInt(5);
            cf9Var.g = cursorQuery.getLong(6);
            cf9Var.h = cursorQuery.getString(7);
            return cf9Var;
        } finally {
            cursorQuery.close();
        }
    }
}
