package com.oplus.tingle.ipc;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.e14;
import com.oplus.aiunit.vision.gzk;
import com.oplus.aiunit.vision.i9b;
import com.oplus.aiunit.vision.mge;
import com.oplus.aiunit.vision.p35;
import com.oplus.aiunit.vision.t4f;
import com.oplus.aiunit.vision.uib;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class MasterProvider extends ContentProvider {
    private static final String SECURITY_PERMISSION = "com.oplus.permission.safe.SECURITY";
    private static final String TAG = "MasterProvider";

    private IBinder getMasterBinder() {
        return gzk.a() ? Master.getInstance() : (IBinder) getMasterBinderCompat();
    }

    private static Object getMasterBinderCompat() {
        return uib.a();
    }

    private String getSecurityPermission() {
        return gzk.a() ? SECURITY_PERMISSION : (String) getSecurityPermissionCompat();
    }

    private static Object getSecurityPermissionCompat() {
        return uib.b();
    }

    private boolean hasPermission() {
        return p35.e().g() || getContext().checkCallingPermission(getSecurityPermission()) == 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Bundle call(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (hasPermission()) {
            if (e14.METHOD_SEND_BINDER.equals(str)) {
                bundle2.putBinder(e14.e(), getMasterBinder());
            }
            return bundle2;
        }
        i9b.c(TAG, "<CALL> Calling package : [" + getCallingPackage() + "] have no permission : " + getSecurityPermission(), new Object[0]);
        bundle2.putBinder(e14.e(), null);
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
        i9b.b(TAG, "Provider onCreate", new Object[0]);
        mge.a().c(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        if (hasPermission()) {
            return t4f.a(getMasterBinder());
        }
        i9b.c(TAG, "<QUERY> Calling package : [" + getCallingPackage() + "] have no permission : " + getSecurityPermission(), new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
