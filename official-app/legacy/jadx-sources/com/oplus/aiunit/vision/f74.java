package com.oplus.aiunit.vision;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes16.dex */
public abstract class f74 {
    public ContentProvider a;

    public f74(ContentProvider contentProvider) {
        this.a = contentProvider;
    }

    public boolean a() {
        return false;
    }

    public abstract int b(@Nullable String str, @Nullable String[] strArr);

    public String c() {
        return "";
    }

    public ContentProvider d() {
        return this.a;
    }

    public abstract boolean e(@Nullable ContentValues contentValues);

    public abstract Cursor f(@Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2);

    public String g() {
        return "";
    }

    public abstract int h(@Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr);

    public String i() {
        return "";
    }
}
