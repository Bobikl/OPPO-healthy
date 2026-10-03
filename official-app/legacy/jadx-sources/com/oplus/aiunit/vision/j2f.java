package com.oplus.aiunit.vision;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Bundle;

/* JADX INFO: loaded from: classes15.dex */
public class j2f extends MatrixCursor {
    public static final String[] DEFAULT_COLUMNS = {"col"};
    public static final String TAG = "ProviderCursor";
    public Bundle i;

    public j2f(String[] strArr, Bundle bundle) {
        super(strArr);
        this.i = new Bundle(bundle);
    }

    public static j2f a(Bundle bundle) {
        return new j2f(DEFAULT_COLUMNS, bundle);
    }

    public static Bundle g(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        return cursor.getExtras();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public Bundle getExtras() {
        return this.i;
    }
}
