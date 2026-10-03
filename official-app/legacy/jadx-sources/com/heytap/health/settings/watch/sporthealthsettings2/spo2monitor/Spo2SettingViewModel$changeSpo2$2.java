package com.heytap.health.settings.watch.sporthealthsettings2.spo2monitor;

import com.heytap.health.settings.watch.sporthealthsettings.bean.a0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.SuspendFunction;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class Spo2SettingViewModel$changeSpo2$2 extends AdaptedFunctionReference implements Function1<Continuation<? super a0>, Object>, SuspendFunction {
    public Spo2SettingViewModel$changeSpo2$2(Object obj) {
        super(1, obj, Spo2SettingViewModel.class, "spo2Settings", "spo2Settings()Lcom/heytap/health/settings/watch/sporthealthsettings/bean/Spo2Settings;", 4);
    }

    @Override // p010kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@NotNull Continuation<? super a0> continuation) {
        return Spo2SettingViewModel.x0((Spo2SettingViewModel) this.receiver, continuation);
    }
}
