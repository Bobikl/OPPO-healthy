package com.cloud.sdk.cloudstorage.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.cloud.sdk.cloudstorage.upload.CloudStorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/cloud/sdk/cloudstorage/utils/NetworkUtil;", "", "()V", "TAG", "", "isNetWorkReady", "", "isNetworkConnected", "context", "Landroid/content/Context;", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class NetworkUtil {

    @NotNull
    public static final NetworkUtil INSTANCE = new NetworkUtil();
    private static final String TAG = "NetworkUtil";

    private NetworkUtil() {
    }

    public final boolean isNetWorkReady() {
        Object systemService = CloudStorageManager.INSTANCE.getSdkOptions$cloud_storage_sdk_release().getContext().getSystemService("connectivity");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean isNetworkConnected(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("connectivity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
                OcsLog.INSTANCE.d(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.utils.NetworkUtil.isNetworkConnected.1
                    @Override // p010kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "isNetworkConnected true";
                    }
                });
                return true;
            }
            return false;
        } catch (Exception unused) {
            OcsLog.INSTANCE.e(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.utils.NetworkUtil.isNetworkConnected.2
                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "isNetworkConnected exception";
                }
            });
        }
    }
}
