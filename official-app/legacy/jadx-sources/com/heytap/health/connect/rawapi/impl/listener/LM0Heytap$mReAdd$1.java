package com.heytap.health.connect.rawapi.impl.listener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.heytap.health.connect.rawapi.IHeytap;
import com.heytap.health.connect.rawapi.impl.listener.LM0Heytap$mReAdd$1;
import com.oplus.aiunit.vision.wil;
import com.oplus.aiunit.vision.zza;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/heytap/health/connect/rawapi/impl/listener/LM0Heytap$mReAdd$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LM0Heytap$mReAdd$1 extends BroadcastReceiver {
    public final /* synthetic */ LM0Heytap a;

    public LM0Heytap$mReAdd$1(LM0Heytap lM0Heytap) {
        this.a = lM0Heytap;
    }

    public static final void b(LM0Heytap this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.k("tryGetBinderOnServiceReCreate", true, Unit.INSTANCE, new Function1<IHeytap, Unit>() { // from class: com.heytap.health.connect.rawapi.impl.listener.LM0Heytap$mReAdd$1$onReceive$1$1
            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IHeytap iHeytap) {
                invoke2(iHeytap);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IHeytap iHeytap) {
                Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                wil.d(LM0Heytap.TAG, "on Service process start, got binder " + iHeytap);
            }
        });
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        zza zzaVarG = this.a.getMClientExecutor();
        final LM0Heytap lM0Heytap = this.a;
        zzaVarG.e(new Runnable() { // from class: com.oplus.aiunit.vision.lqa
            @Override // java.lang.Runnable
            public final void run() {
                LM0Heytap$mReAdd$1.b(lM0Heytap);
            }
        });
    }
}
