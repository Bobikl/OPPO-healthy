package com.oplus.epona.ipc.remote;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.ep6;
import com.oplus.aiunit.vision.h2f;
import com.oplus.aiunit.vision.l7b;
import com.oplus.aiunit.vision.nu5;
import com.oplus.aiunit.vision.u66;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DispatcherProvider extends ContentProvider {
    private static final String SECURITY_PERMISSION = "com.oplus.permission.safe.SECURITY";
    private static final String TAG = "Epona->DispatcherProvider";

    private Bundle findTransfer(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putBinder("com.oplus.epona.Dispatcher.TRANSFER_VALUE", nu5.d().c(bundle.getString("com.oplus.epona.Dispatcher.TRANSFER_KEY")));
        }
        return bundle2;
    }

    private boolean hasPermission() {
        return getContext().checkCallingPermission(SECURITY_PERMISSION) == 0;
    }

    private Bundle registerTransfer(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putBoolean("REGISTER_TRANSFER_RESULT", nu5.d().h(bundle.getString("com.oplus.epona.Dispatcher.TRANSFER_KEY"), bundle.getBinder("com.oplus.epona.Dispatcher.TRANSFER_VALUE"), str));
        }
        return bundle2;
    }

    private Bundle unregisterTransfer(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putBoolean("REGISTER_TRANSFER_RESULT", nu5.d().k(bundle.getString("com.oplus.epona.Dispatcher.TRANSFER_KEY"), str));
        }
        return bundle2;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        if (hasPermission()) {
            if (TextUtils.equals(str, "com.oplus.epona.Dispatcher.FIND_TRANSFER")) {
                return findTransfer(bundle);
            }
            if (TextUtils.equals(str, "com.oplus.epona.Dispatcher.REGISTER_TRANSFER")) {
                return registerTransfer(bundle, getCallingPackage());
            }
            return TextUtils.equals(str, "com.oplus.epona.Dispatcher.UNREGISTER_TRANSFER") ? unregisterTransfer(bundle, getCallingPackage()) : super.call(str, str2, bundle);
        }
        l7b.d(TAG, "<CALL> Calling package : [" + getCallingPackage() + "] have no permission : " + SECURITY_PERMISSION, new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            super.dump(fileDescriptor, printWriter, strArr);
            return;
        }
        u66 u66VarH = ep6.h(strArr[0]);
        if (u66VarH != null) {
            u66VarH.a(fileDescriptor, printWriter, strArr);
        }
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
    public Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        if (!hasPermission()) {
            l7b.d(TAG, "<QUERY> Calling package : [" + getCallingPackage() + "] have no permission : " + SECURITY_PERMISSION, new Object[0]);
            return null;
        }
        if (bundle != null) {
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("com.oplus.epona.Dispatcher.QUERY_METHOD");
            Bundle bundle3 = bundle.getBundle("com.oplus.epona.Dispatcher.QUERY_EXTRA");
            if (string != null) {
                if (string.equals("com.oplus.epona.Dispatcher.REGISTER_TRANSFER")) {
                    bundle2 = registerTransfer(bundle3, getCallingPackage());
                } else if (string.equals("com.oplus.epona.Dispatcher.UNREGISTER_TRANSFER")) {
                    bundle2 = unregisterTransfer(bundle3, getCallingPackage());
                }
                return h2f.a(bundle2);
            }
        }
        return super.query(uri, strArr, bundle, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        if (!hasPermission()) {
            l7b.d(TAG, "<QUERY> Calling package : [" + getCallingPackage() + "] have no permission : " + SECURITY_PERMISSION, new Object[0]);
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments != null && pathSegments.size() > 0) {
            if ("find_transfer".equals(pathSegments.get(0))) {
                Bundle bundle = new Bundle();
                if (pathSegments.size() > 1) {
                    bundle.putBinder("com.oplus.epona.Dispatcher.TRANSFER_VALUE", nu5.d().c(pathSegments.get(1)));
                    return h2f.a(bundle);
                }
                l7b.d(TAG, "Get ComponentName error : " + uri, new Object[0]);
                return null;
            }
            l7b.d(TAG, "The path is not /find_transfer : " + pathSegments.get(0), new Object[0]);
        } else {
            l7b.d(TAG, "Could not find the uri : " + uri, new Object[0]);
        }
        return null;
    }
}
