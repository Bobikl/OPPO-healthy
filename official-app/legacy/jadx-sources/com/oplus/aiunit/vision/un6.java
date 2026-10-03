package com.oplus.aiunit.vision;

import android.content.Intent;
import android.view.View;
import com.oplus.seedling.sdk.callback.StartActivityCallback;
import com.oplus.seedling.sdk.seedling.ISeedling;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.app.ILaunchInterceptor;
import pantanal.app.bean.CardCategory;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u00182\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\n\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/un6;", "Lcom/oplus/seedling/sdk/callback/StartActivityCallback;", "Lcom/oplus/seedling/sdk/seedling/ISeedling;", "seedling", "", "Landroid/content/Intent;", "intentList", "", "onStartActivity", "Lpantanal/app/ILaunchInterceptor;", "a", "Lpantanal/app/ILaunchInterceptor;", "getLaunchInterceptor", "()Lpantanal/app/ILaunchInterceptor;", "b", "(Lpantanal/app/ILaunchInterceptor;)V", "launchInterceptor", "Z", "getEnableV2Callback", "()Z", "(Z)V", "enableV2Callback", "<init>", "()V", "Companion", "card-seedling_release"}, k = 1, mv = {1, 8, 0})
public final class un6 implements StartActivityCallback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public ILaunchInterceptor launchInterceptor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean enableV2Callback;

    public final void a(boolean z) {
        this.enableV2Callback = z;
    }

    public final void b(@Nullable ILaunchInterceptor iLaunchInterceptor) {
        this.launchInterceptor = iLaunchInterceptor;
    }

    @Override // com.oplus.seedling.sdk.callback.StartActivityCallback
    public boolean onStartActivity(@NotNull ISeedling seedling, @NotNull List<? extends Intent> intentList) {
        Intrinsics.checkNotNullParameter(seedling, "seedling");
        Intrinsics.checkNotNullParameter(intentList, "intentList");
        t6e t6eVar = t6e.INSTANCE;
        bs9.a.c(t6eVar, "EntranceActivityStarter", "onStartActivity: begin,intent List = " + intentList + ",seedling = " + seedling + " ,enableV2Callback=" + this.enableV2Callback, false, null, false, 0, false, null, 252, null);
        ILaunchInterceptor iLaunchInterceptor = this.launchInterceptor;
        if (iLaunchInterceptor == null) {
            bs9.a.c(t6eVar, "EntranceActivityStarter", "onStartActivity: begin, launchInterceptor is null.", false, null, false, 0, false, null, 252, null);
            return false;
        }
        Unit unit = null;
        if (this.enableV2Callback) {
            if (iLaunchInterceptor != null) {
                iLaunchInterceptor.onStartActivityV2(seedling.getView(), CardCategory.SEEDLING, null, intentList, seedling, null);
                unit = Unit.INSTANCE;
            }
            bs9.a.c(t6eVar, "EntranceActivityStarter", "onStartActivityV2: result = " + unit, false, null, false, 0, false, null, 252, null);
            return true;
        }
        if (iLaunchInterceptor != null) {
            iLaunchInterceptor.onStartActivity(seedling.getView(), CardCategory.SEEDLING, null, intentList);
            unit = Unit.INSTANCE;
        }
        bs9.a.c(t6eVar, "EntranceActivityStarter", "onStartActivity: result = " + unit, false, null, false, 0, false, null, 252, null);
        return true;
    }

    @Override // com.oplus.seedling.sdk.callback.StartActivityCallback
    public boolean onStartActivityV2(@NotNull ISeedling iSeedling, @NotNull List<? extends Intent> list, @Nullable View view) {
        return StartActivityCallback.DefaultImpls.onStartActivityV2(this, iSeedling, list, view);
    }
}
