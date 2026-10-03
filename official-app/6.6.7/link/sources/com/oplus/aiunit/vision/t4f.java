package com.oplus.aiunit.vision;

import android.database.MatrixCursor;
import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class t4f extends MatrixCursor {
    public static final String BINDER_KEY = "IBinder";
    public static final String TAG = "ProviderCursor";
    public Bundle i;
    public static final String[] DEFAULT_COLUMNS = {"col"};
    public static volatile t4f j = null;

    public t4f(String[] strArr, IBinder iBinder) {
        super(strArr);
        Bundle bundle = new Bundle();
        this.i = bundle;
        bundle.putBinder(BINDER_KEY, iBinder);
    }

    public static t4f a(IBinder iBinder) {
        if (j == null) {
            synchronized (t4f.class) {
                if (j == null) {
                    j = new t4f(DEFAULT_COLUMNS, iBinder);
                }
            }
        }
        return j;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public Bundle getExtras() {
        return this.i;
    }
}
