package com.coloros.sceneservice.dataprovider.api;

import android.content.Context;
import androidx.annotation.Keep;
import com.coloros.sceneservice.f.i;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/coloros/sceneservice/dataprovider/api/SupportFunctionApi;", "", "()V", "checkSupportPureManualCommute", "", "context", "Landroid/content/Context;", "com.coloros.sceneservice.sdk_release"}, k = 1, mv = {1, 1, 16})
public final class SupportFunctionApi {
    public static final SupportFunctionApi INSTANCE = new SupportFunctionApi();

    public final boolean checkSupportPureManualCommute(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return i.a(context);
    }
}
