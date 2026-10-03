package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.msp.bean.BizResponse;
import com.heytap.msp.sdk.base.callback.Callback;
import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014R\"\u0010\r\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00070\u00070\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/vfg;", "Lcom/heytap/msp/sdk/base/callback/Callback;", "Lcom/heytap/msp/bean/BizResponse;", "", "response", "", "callback", "Landroid/content/Context;", "context", "a", "Ljava/lang/ref/SoftReference;", "kotlin.jvm.PlatformType", "Ljava/lang/ref/SoftReference;", "softContext", "<init>", "(Landroid/content/Context;)V", "paysdk_release"}, k = 1, mv = {1, 8, 0})
public class vfg implements Callback<BizResponse<String>> {

    @NotNull
    public final SoftReference<Context> a;

    public vfg(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = new SoftReference<>(context);
    }

    public void a(@NotNull Context context, @NotNull BizResponse<String> response) {
        throw null;
    }

    public void callback(@NotNull BizResponse<String> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Context context = this.a.get();
        if (context != null) {
            a(context, response);
        }
    }
}
