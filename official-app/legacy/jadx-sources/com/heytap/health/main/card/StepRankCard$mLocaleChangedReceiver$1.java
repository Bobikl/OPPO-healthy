package com.heytap.health.main.card;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.heytap.health.main.card.StepRankCard$mLocaleChangedReceiver$1;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.ld9;
import com.oplus.aiunit.vision.su8;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/heytap/health/main/card/StepRankCard$mLocaleChangedReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StepRankCard$mLocaleChangedReceiver$1 extends BroadcastReceiver {
    public final /* synthetic */ StepRankCard a;

    public StepRankCard$mLocaleChangedReceiver$1(StepRankCard stepRankCard) {
        this.a = stepRankCard;
    }

    public static final void b(StepRankCard this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.S();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        String action = intent.getAction();
        StringBuilder sb = new StringBuilder();
        sb.append("getAction:");
        sb.append(action);
        if (Intrinsics.areEqual(intent.getAction(), "android.intent.action.LOCALE_CHANGED") && ld9.i()) {
            this.a.rankPage.G8(this.a.f4943j);
            cfg cfgVarC = su8.c();
            final StepRankCard stepRankCard = this.a;
            cfgVarC.h(new Runnable() { // from class: com.oplus.aiunit.vision.ssi
                @Override // java.lang.Runnable
                public final void run() {
                    StepRankCard$mLocaleChangedReceiver$1.b(stepRankCard);
                }
            }, 2L, TimeUnit.SECONDS);
        }
    }
}
