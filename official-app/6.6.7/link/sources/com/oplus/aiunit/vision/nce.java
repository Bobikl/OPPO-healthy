package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.heytap.mspsdk.MspSdk;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/nce;", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", TraceConstants.KEY_ACTION, "", "b", "Landroid/os/Bundle;", "a", "<init>", "()V", "paysdk_release"}, k = 1, mv = {1, 8, 0})
public final class nce {

    @NotNull
    public static final nce INSTANCE = new nce();

    public final Bundle a(Intent intent) {
        Bundle extras;
        Bundle bundle = new Bundle();
        bundle.putString(dde.PAY_INPUT_PARAMETERS, (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString(dde.PAY_INPUT_PARAMETERS));
        bundle.putString("launcherAction", intent != null ? intent.getAction() : null);
        bundle.putInt("msp_app_min_versioncode", 2020000);
        bundle.putString("msp_sdk_kit_name", "kit_pay");
        return bundle;
    }

    public final void b(@NotNull Context context, @Nullable Intent intent) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        MspSdk.init(context);
        Object objApiProxy = MspSdk.apiProxy(new mai(context, a(intent)));
        Intrinsics.checkNotNullExpressionValue(objApiProxy, "apiProxy(client)");
        ((nai) objApiProxy).a((Activity) context);
    }
}
