package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.heytap.mspsdk.MspSdk;
import com.heytap.mspsdk.constants.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/oae;", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "b", "Landroid/os/Bundle;", "a", "<init>", "()V", "paysdk_release"}, k = 1, mv = {1, 8, 0})
public final class oae {

    @NotNull
    public static final oae INSTANCE = new oae();

    public final Bundle a(Intent intent) {
        Bundle extras;
        Bundle bundle = new Bundle();
        bundle.putString("payParams", (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("payParams"));
        bundle.putString("launcherAction", intent != null ? intent.getAction() : null);
        bundle.putInt(Constants.BUNDLE_KEY_APP_MIN_VERSIONCODE, 2020000);
        bundle.putString(Constants.BUNDLE_KEY_MSP_SDK_KIT_NAME, "kit_pay");
        return bundle;
    }

    public final void b(@NotNull Context context, @Nullable Intent intent) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        MspSdk.init(context);
        Object objApiProxy = MspSdk.apiProxy(new v6i(context, a(intent)));
        Intrinsics.checkNotNullExpressionValue(objApiProxy, "apiProxy(client)");
        ((w6i) objApiProxy).a((Activity) context);
    }
}
