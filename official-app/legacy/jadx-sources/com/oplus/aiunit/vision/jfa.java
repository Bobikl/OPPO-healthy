package com.oplus.aiunit.vision;

import android.database.Cursor;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class jfa<T> {
    public final a6<T, ?> a;

    public jfa(a6<T, ?> a6Var) {
        this.a = a6Var;
    }

    public List<T> a(Cursor cursor) {
        return this.a.loadAllAndCloseCursor(cursor);
    }

    public T b(Cursor cursor) {
        return this.a.loadUniqueAndCloseCursor(cursor);
    }
}
