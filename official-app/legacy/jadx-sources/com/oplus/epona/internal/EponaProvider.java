package com.oplus.epona.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.ep6;
import com.oplus.epona.ipc.local.RemoteTransfer;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public class EponaProvider extends ContentProvider {
    public static final String KEY_LAUNCH_SUCCESS = "KEY_LAUNCH_SUCCESS";
    public static final String KEY_REMOTE_TRANSFER = "KEY_REMOTE_TRANSFER";
    public static final String LAUNCH_METHOD = "launchComponent";

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (ep6.l().a(getContext())) {
            bundle2.putBinder(KEY_REMOTE_TRANSFER, RemoteTransfer.getInstance());
        }
        if ("launchComponent".equals(str)) {
            bundle2.putBoolean("KEY_LAUNCH_SUCCESS", true);
        }
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (strArr == null || strArr.length <= 0 || !"oplus_epona".equals(strArr[0])) {
            super.dump(fileDescriptor, printWriter, strArr);
        } else {
            ep6.d(printWriter);
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        ep6.n(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
