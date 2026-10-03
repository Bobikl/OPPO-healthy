package com.heytap.msp.okipc.server.component;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import com.heytap.msp.okipc.server.core.ChannelServer;

/* JADX INFO: loaded from: classes19.dex */
public class OkIPCProvider extends ContentProvider {
    private static final String TAG = "IPCProvider";

    public class a extends MatrixCursor {
        public a(String[] strArr) {
            super(strArr);
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public Bundle getExtras() {
            Bundle bundle = new Bundle();
            bundle.putBinder("ipc", new ChannelServer());
            return bundle;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        com.heytap.msp.okipc.server.a.i().h().g();
        return new a(new String[0]);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
