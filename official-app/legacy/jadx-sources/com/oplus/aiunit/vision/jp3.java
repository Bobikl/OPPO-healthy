package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.heytap.store.base.core.util.CommonUtil;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.nearx.track.internal.utils.Logger;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0004\u0010\tR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/jp3;", "", "Landroid/content/Context;", "context", "a", "", "b", "c", "", "Ljava/lang/String;", "TAG", "RO_CRYPTO_TYPE", "FBE", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class jp3 {

    @NotNull
    public static final jp3 INSTANCE = new jp3();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String TAG = CommonUtil.TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String RO_CRYPTO_TYPE = "ro.crypto.type";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String FBE = Const.Scheme.SCHEME_FILE;

    @NotNull
    public final Context a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Logger.b(k6k.e(), TAG, "currentBuildVersion is " + Build.VERSION.SDK_INT + ", isFBEVersion:" + b(), null, null, 12, null);
        if (!b()) {
            return context;
        }
        Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        Intrinsics.checkNotNullExpressionValue(contextCreateDeviceProtectedStorageContext, "{\n            context.cr…torageContext()\n        }");
        return contextCreateDeviceProtectedStorageContext;
    }

    public final boolean b() {
        return FBE.equals(xkj.INSTANCE.b(RO_CRYPTO_TYPE));
    }

    public final boolean c() {
        return Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper());
    }
}
