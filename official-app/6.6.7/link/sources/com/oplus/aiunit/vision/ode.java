package com.oplus.aiunit.vision;

import android.content.Context;
import com.client.platform.opensdk.pay.PayRequest;
import com.oplus.pay.opensdk.PaySdkCoreV3;
import com.oplus.pay.opensdk.model.PreOrderParameters;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007J \u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/ode;", "", "Landroid/content/Context;", "context", "Lcom/client/platform/opensdk/pay/PayRequest;", "mPayRequest", "", dde.IS_EU, "", "a", "Lcom/oplus/pay/opensdk/model/PreOrderParameters;", "preOrderParameters", "b", "<init>", "()V", "paysdk_release"}, k = 1, mv = {1, 8, 0})
public final class ode {

    @NotNull
    public static final ode INSTANCE = new ode();

    @Deprecated(message = "PaySdkCore.payPreOder() instead", replaceWith = @ReplaceWith(expression = "PaySdkCore.pay(context, mPayRequest, isEU)", imports = {}))
    public final void a(@NotNull Context context, @NotNull PayRequest mPayRequest, boolean isEU) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mPayRequest, "mPayRequest");
        PaySdkCoreV3.INSTANCE.m(context, mPayRequest, isEU);
    }

    public final void b(@NotNull Context context, @NotNull PreOrderParameters preOrderParameters, boolean isEU) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preOrderParameters, "preOrderParameters");
        PaySdkCoreV3.INSTANCE.o(context, preOrderParameters, isEU);
    }
}
