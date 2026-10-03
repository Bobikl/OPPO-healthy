package com.oplus.accountsdk.open.core;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.core.AcOpenCoreProvider;
import com.oplus.accountsdk.open.core.ipc.AcOpenIpcFactory;
import com.oplus.accountsdk.open.core.ipc.binder.AcOpenBinder;
import com.oplus.accountsdk.open.core.storage.AcOpenStorageHelper;
import com.oplus.aiunit.vision.na;
import com.oplus.aiunit.vision.zj;
import com.platform.usercenter.account.ams.ipc.RequestConstant;

/* JADX INFO: loaded from: classes6.dex */
public class AcOpenCoreProvider extends ContentProvider {
    private static final String TAG = "AcOpenCoreProvider";
    private AcOpenBinder mAmsBinder;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prewarmStorageOnce$0(Context context) {
        String str = TAG;
        AcLogUtil.i(str, "prewarmStorage start AcOpenStorageHelper", true);
        AcOpenStorageHelper.getInstance(context);
        AcLogUtil.i(str, "prewarmStorage end", true);
    }

    private void prewarmStorageOnce() {
        final Context context = getContext();
        if (context == null) {
            AcLogUtil.w(TAG, "prewarmStorage skip, context is null");
        } else {
            zj.a().g(new Runnable() { // from class: com.oplus.aiunit.vision.hd
                @Override // java.lang.Runnable
                public final void run() {
                    AcOpenCoreProvider.lambda$prewarmStorageOnce$0(context);
                }
            });
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        String str3 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("contentProvider invoke call,method = ");
        sb.append(str);
        sb.append(" bundle is null =");
        sb.append(bundle == null);
        AcLogUtil.i(str3, sb.toString());
        Bundle bundle2 = new Bundle();
        try {
            if (str.equals(RequestConstant.BINDER_REQUEST)) {
                bundle2.putBinder(RequestConstant.KEY_GET_BINDER, this.mAmsBinder);
            } else {
                bundle2 = super.call(str, str2, bundle);
            }
        } catch (Exception e2) {
            AcLogUtil.e(TAG, "contentProvider call exception " + e2.getMessage());
        }
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
        na.b().c(new AcOpenIpcFactory());
        this.mAmsBinder = new AcOpenBinder(getContext());
        prewarmStorageOnce();
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
