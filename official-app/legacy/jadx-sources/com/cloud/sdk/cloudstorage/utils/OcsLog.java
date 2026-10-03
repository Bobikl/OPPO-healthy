package com.cloud.sdk.cloudstorage.utils;

import android.util.Log;
import com.cloud.sdk.cloudstorage.common.ILogCallback;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015J\u001c\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015J\u001c\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015J\u001c\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015J\u001c\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/cloud/sdk/cloudstorage/utils/OcsLog;", "", "()V", "ROOT_TAG", "", "isVerbose", "", "isVerbose$cloud_storage_sdk_release", "()Z", "setVerbose$cloud_storage_sdk_release", "(Z)V", "logHook", "Lcom/cloud/sdk/cloudstorage/common/ILogCallback;", "getLogHook$cloud_storage_sdk_release", "()Lcom/cloud/sdk/cloudstorage/common/ILogCallback;", "setLogHook$cloud_storage_sdk_release", "(Lcom/cloud/sdk/cloudstorage/common/ILogCallback;)V", "d", "", "tag", "logSupplier", "Lkotlin/Function0;", MapSchema.FIELD_NAME_ENTRY, "i", "v", "w", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class OcsLog {

    @NotNull
    public static final OcsLog INSTANCE = new OcsLog();
    private static final String ROOT_TAG = "OCloudSdk.";
    private static boolean isVerbose;

    @Nullable
    private static ILogCallback logHook;

    private OcsLog() {
    }

    public final void d(@NotNull String tag, @NotNull Function0<String> logSupplier) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(logSupplier, "logSupplier");
        if (isVerbose) {
            String strInvoke = logSupplier.invoke();
            String str = ROOT_TAG + tag;
            ILogCallback iLogCallback = logHook;
            if (iLogCallback != null) {
                iLogCallback.d(str, strInvoke);
            }
            Log.d(str, strInvoke);
        }
    }

    public final void e(@NotNull String tag, @NotNull Function0<String> logSupplier) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(logSupplier, "logSupplier");
        String strInvoke = logSupplier.invoke();
        String str = ROOT_TAG + tag;
        ILogCallback iLogCallback = logHook;
        if (iLogCallback != null) {
            iLogCallback.e(str, strInvoke);
        }
        Log.e(str, strInvoke);
    }

    @Nullable
    public final ILogCallback getLogHook$cloud_storage_sdk_release() {
        return logHook;
    }

    public final void i(@NotNull String tag, @NotNull Function0<String> logSupplier) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(logSupplier, "logSupplier");
        String strInvoke = logSupplier.invoke();
        String str = ROOT_TAG + tag;
        ILogCallback iLogCallback = logHook;
        if (iLogCallback != null) {
            iLogCallback.i(str, strInvoke);
        }
        Log.i(str, strInvoke);
    }

    public final boolean isVerbose$cloud_storage_sdk_release() {
        return isVerbose;
    }

    public final void setLogHook$cloud_storage_sdk_release(@Nullable ILogCallback iLogCallback) {
        logHook = iLogCallback;
    }

    public final void setVerbose$cloud_storage_sdk_release(boolean z) {
        isVerbose = z;
    }

    public final void v(@NotNull String tag, @NotNull Function0<String> logSupplier) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(logSupplier, "logSupplier");
        if (isVerbose) {
            String strInvoke = logSupplier.invoke();
            String str = ROOT_TAG + tag;
            ILogCallback iLogCallback = logHook;
            if (iLogCallback != null) {
                iLogCallback.v(str, strInvoke);
            }
            Log.v(str, strInvoke);
        }
    }

    public final void w(@NotNull String tag, @NotNull Function0<String> logSupplier) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(logSupplier, "logSupplier");
        String strInvoke = logSupplier.invoke();
        String str = ROOT_TAG + tag;
        ILogCallback iLogCallback = logHook;
        if (iLogCallback != null) {
            iLogCallback.w(str, strInvoke);
        }
        Log.w(str, strInvoke);
    }
}
