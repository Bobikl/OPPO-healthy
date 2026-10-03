package com.oplus.mydevices.sdk.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.oplus.mydevices.sdk.Constants;
import com.oplus.mydevices.sdk.DeviceSdk;
import com.oplus.mydevices.sdk.Utils;
import com.oplus.mydevices.sdk.utils.LogUtils;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/oplus/mydevices/sdk/internal/DeviceSdkImpl;", "", "()V", "getLinkageMetaData", "", "isSupportLinkage", "", "isSupportNotKeepAlive", "Companion", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public class DeviceSdkImpl {
    private static final String TAG = "DeviceSdkImpl";

    @VisibleForTesting
    public int getLinkageMetaData() {
        Bundle bundle;
        PackageManager packageManager;
        try {
            Context applicationContext = DeviceSdk.getApplicationContext();
            Integer numValueOf = null;
            ApplicationInfo applicationInfo = (applicationContext == null || (packageManager = applicationContext.getPackageManager()) == null) ? null : packageManager.getApplicationInfo(Constants.PACKAGE_NAME_MY_DEVICE, 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                numValueOf = Integer.valueOf(bundle.getInt("com.heytap.mydevices.linkage"));
            }
            LogUtils.INSTANCE.d(TAG, "template : " + numValueOf);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            return 0;
        } catch (PackageManager.NameNotFoundException e2) {
            LogUtils.INSTANCE.e(TAG, "error: " + e2.getMessage());
            return 0;
        }
    }

    public final boolean isSupportLinkage() {
        return Utils.supportFlag(getLinkageMetaData(), 1);
    }

    public final boolean isSupportNotKeepAlive() {
        return Utils.supportFlag(getLinkageMetaData(), 2);
    }
}
