package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import com.nearme.game_sdk_pluginagent.AppCompatPluginActivity;
import com.oplus.pay.opensdk.web.ui.PluginDialogFragment;
import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/vg1;", "Lcom/oplus/aiunit/vision/wn9;", "Landroid/os/Bundle;", "bundle", "", "onCallback", "Ljava/lang/ref/SoftReference;", "Landroid/content/Context;", "a", "Ljava/lang/ref/SoftReference;", "contextRef", "<init>", "(Ljava/lang/ref/SoftReference;)V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
public final class vg1 implements wn9 {

    @NotNull
    public final SoftReference<Context> a;

    public vg1(@NotNull SoftReference<Context> softReference) {
        Intrinsics.checkNotNullParameter(softReference, "contextRef");
        this.a = softReference;
    }

    @Override // com.oplus.aiunit.vision.wn9
    public void onCallback(@Nullable Bundle bundle) {
        AppCompatPluginActivity appCompatPluginActivity = this.a.get();
        AppCompatPluginActivity appCompatPluginActivity2 = appCompatPluginActivity instanceof AppCompatPluginActivity ? appCompatPluginActivity : null;
        if (appCompatPluginActivity2 != null) {
            PluginDialogFragment.a0(bundle).d0(appCompatPluginActivity2);
        } else {
            hrl.h("BizActionCallback context is null");
        }
    }
}
