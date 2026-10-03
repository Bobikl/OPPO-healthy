package com.oplus.aiunit.vision;

import android.database.MatrixCursor;
import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes8.dex */
public class i2f extends MatrixCursor {
    public static final String BINDER_KEY = "IBinder";
    public static final String TAG = "ProviderCursor";
    public Bundle i;
    public static final String[] DEFAULT_COLUMNS = {"col"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile i2f f12359j = null;

    public i2f(String[] strArr, IBinder iBinder) {
        super(strArr);
        Bundle bundle = new Bundle();
        this.i = bundle;
        bundle.putBinder(BINDER_KEY, iBinder);
    }

    public static i2f a(IBinder iBinder) {
        if (f12359j == null) {
            synchronized (i2f.class) {
                if (f12359j == null) {
                    f12359j = new i2f(DEFAULT_COLUMNS, iBinder);
                }
            }
        }
        return f12359j;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public Bundle getExtras() {
        return this.i;
    }
}
