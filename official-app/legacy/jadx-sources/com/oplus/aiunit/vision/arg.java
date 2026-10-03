package com.oplus.aiunit.vision;

import android.content.Intent;
import android.view.View;
import com.oplus.seedling.sdk.callback.StartActivityCallback;
import com.oplus.seedling.sdk.seedling.ISeedling;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.app.ILaunchInterceptorV2;
import pantanal.app.bean.CardCategory;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00122\u00020\u0001:\u0001\nB\u0019\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/arg;", "Lcom/oplus/seedling/sdk/callback/StartActivityCallback;", "Lcom/oplus/seedling/sdk/seedling/ISeedling;", "seedling", "", "Landroid/content/Intent;", "intentList", "", "onStartActivity", "Lpantanal/app/ILaunchInterceptorV2;", "a", "Lpantanal/app/ILaunchInterceptorV2;", "launchInterceptor", "b", "Z", "enableV2Callback", "<init>", "(Lpantanal/app/ILaunchInterceptorV2;Z)V", "Companion", "card-seedling_release"}, k = 1, mv = {1, 8, 0})
public final class arg implements StartActivityCallback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public ILaunchInterceptorV2 launchInterceptor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean enableV2Callback;

    public arg(@Nullable ILaunchInterceptorV2 iLaunchInterceptorV2, boolean z) {
        this.launchInterceptor = iLaunchInterceptorV2;
        this.enableV2Callback = z;
    }

    @Override // com.oplus.seedling.sdk.callback.StartActivityCallback
    public boolean onStartActivity(@NotNull ISeedling seedling, @NotNull List<? extends Intent> intentList) {
        Intrinsics.checkNotNullParameter(seedling, "seedling");
        Intrinsics.checkNotNullParameter(intentList, "intentList");
        t6e t6eVar = t6e.INSTANCE;
        boolean zOnStartActivity = false;
        bs9.a.c(t6eVar, "SeedlingStartActivityInterceptorWrapper", "onStartActivity,seedling= " + seedling + ",intentList = " + intentList, false, null, false, 0, false, null, 252, null);
        ILaunchInterceptorV2 iLaunchInterceptorV2 = this.launchInterceptor;
        if (iLaunchInterceptorV2 == null) {
            bs9.a.c(t6eVar, "SeedlingStartActivityInterceptorWrapper", "onStartActivity return false,launchInterceptor is null.", false, null, false, 0, false, null, 252, null);
            return false;
        }
        if (this.enableV2Callback) {
            if (iLaunchInterceptorV2 != null) {
                zOnStartActivity = iLaunchInterceptorV2.onStartActivityV2(seedling.getView(), CardCategory.SEEDLING, null, intentList, seedling, null);
            }
        } else if (iLaunchInterceptorV2 != null) {
            zOnStartActivity = iLaunchInterceptorV2.onStartActivity(seedling.getView(), CardCategory.SEEDLING, null, intentList, seedling);
        }
        bs9.a.c(t6eVar, "SeedlingStartActivityInterceptorWrapper", "onStartActivity,intercept result = " + zOnStartActivity, false, null, false, 0, false, null, 252, null);
        return zOnStartActivity;
    }

    @Override // com.oplus.seedling.sdk.callback.StartActivityCallback
    public boolean onStartActivityV2(@NotNull ISeedling iSeedling, @NotNull List<? extends Intent> list, @Nullable View view) {
        return StartActivityCallback.DefaultImpls.onStartActivityV2(this, iSeedling, list, view);
    }
}
