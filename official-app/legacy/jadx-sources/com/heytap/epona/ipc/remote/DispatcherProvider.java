package com.heytap.epona.ipc.remote;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.j2f;
import com.oplus.aiunit.vision.mu5;
import com.oplus.aiunit.vision.s7b;
import com.oplus.aiunit.vision.v25;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class DispatcherProvider extends ContentProvider {
    private static final String SECURITY_PERMISSION = "com.oppo.permission.safe.SECURITY";
    private static final String TAG = "DispatcherProvider";

    private Bundle findTransfer(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putBinder("com.heytap.epona.Dispatcher.TRANSFER_VALUE", mu5.c().b(bundle.getString("com.heytap.epona.Dispatcher.TRANSFER_KEY")));
        }
        return bundle2;
    }

    private boolean hasPermission() {
        return v25.e().g() || getContext().checkCallingPermission(SECURITY_PERMISSION) == 0;
    }

    private Bundle registerTransfer(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putBoolean("REGISTER_TRANSFER_RESULT", mu5.c().e(bundle.getString("com.heytap.epona.Dispatcher.TRANSFER_KEY"), bundle.getBinder("com.heytap.epona.Dispatcher.TRANSFER_VALUE"), str));
        }
        return bundle2;
    }

    private Bundle snapshot() {
        Bundle bundle = new Bundle();
        bundle.putString("REMOTE_SNAPSHOT", mu5.c().f());
        return bundle;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        if (!hasPermission()) {
            s7b.c(TAG, "<CALL> Calling package : [" + getCallingPackage() + "] have no permission : " + SECURITY_PERMISSION, new Object[0]);
            return null;
        }
        str.hashCode();
        switch (str) {
            case "com.heytap.epona.Dispatcher.REGISTER_TRANSFER":
                return registerTransfer(bundle, getCallingPackage());
            case "com.heytap.epona.Dispatcher.FIND_TRANSFER":
                return findTransfer(bundle);
            case "com.heytap.epona.Dispatcher.REMOTE_SNAPSHOT":
                return snapshot();
            default:
                return super.call(str, str2, bundle);
        }
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
        return false;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        if (!hasPermission()) {
            s7b.c(TAG, "<QUERY> Calling package : [" + getCallingPackage() + "] have no permission : " + SECURITY_PERMISSION, new Object[0]);
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.size() <= 0) {
            s7b.c(TAG, "Could not find the uri : " + uri, new Object[0]);
        } else {
            if ("find_transfer".equals(pathSegments.get(0))) {
                Bundle bundle = new Bundle();
                if (pathSegments.size() > 1) {
                    bundle.putBinder("com.heytap.epona.Dispatcher.TRANSFER_VALUE", mu5.c().b(pathSegments.get(1)));
                    return j2f.a(bundle);
                }
                s7b.c(TAG, "Get ComponentName error : " + uri, new Object[0]);
                return null;
            }
            s7b.c(TAG, "The path is not /find_transfer : " + pathSegments.get(0), new Object[0]);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
