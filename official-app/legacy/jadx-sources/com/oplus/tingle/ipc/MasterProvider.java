package com.oplus.tingle.ipc;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.fhb;
import com.oplus.aiunit.vision.i2f;
import com.oplus.aiunit.vision.ivk;
import com.oplus.aiunit.vision.nee;
import com.oplus.aiunit.vision.r04;
import com.oplus.aiunit.vision.w25;
import com.oplus.aiunit.vision.w7b;

/* JADX INFO: loaded from: classes8.dex */
public class MasterProvider extends ContentProvider {
    private static final String SECURITY_PERMISSION = "com.oplus.permission.safe.SECURITY";
    private static final String TAG = "MasterProvider";

    private IBinder getMasterBinder() {
        return ivk.a() ? Master.getInstance() : (IBinder) getMasterBinderCompat();
    }

    private static Object getMasterBinderCompat() {
        return fhb.a();
    }

    private String getSecurityPermission() {
        return ivk.a() ? SECURITY_PERMISSION : (String) getSecurityPermissionCompat();
    }

    private static Object getSecurityPermissionCompat() {
        return fhb.b();
    }

    private boolean hasPermission() {
        return w25.e().g() || getContext().checkCallingPermission(getSecurityPermission()) == 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Bundle call(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (hasPermission()) {
            if (r04.METHOD_SEND_BINDER.equals(str)) {
                bundle2.putBinder(r04.e(), getMasterBinder());
            }
            return bundle2;
        }
        w7b.c(TAG, "<CALL> Calling package : [" + getCallingPackage() + "] have no permission : " + getSecurityPermission(), new Object[0]);
        bundle2.putBinder(r04.e(), null);
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        w7b.b(TAG, "Provider onCreate", new Object[0]);
        nee.a().c(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        if (hasPermission()) {
            return i2f.a(getMasterBinder());
        }
        w7b.c(TAG, "<QUERY> Calling package : [" + getCallingPackage() + "] have no permission : " + getSecurityPermission(), new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
