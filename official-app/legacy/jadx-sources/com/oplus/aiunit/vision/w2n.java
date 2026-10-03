package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class w2n extends SQLiteOpenHelper {
    public s2n i;

    public w2n(Context context, String str, int i, s2n s2nVar) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.i = s2nVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.i.a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.i.a(sQLiteDatabase, i);
    }
}
