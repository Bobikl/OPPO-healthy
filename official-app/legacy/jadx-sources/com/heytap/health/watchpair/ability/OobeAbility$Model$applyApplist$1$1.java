package com.heytap.health.watchpair.ability;

import com.heytap.health.devicemanager.processor.bean.Res;
import com.heytap.health.devicemanager.processor.bean.ResBean;
import com.oplus.aiunit.vision.prf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/heytap/health/devicemanager/processor/bean/Res;", "it", "Lcom/heytap/health/devicemanager/processor/bean/ResBean;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class OobeAbility$Model$applyApplist$1$1 extends Lambda implements Function1<ResBean, Res> {
    public static final OobeAbility$Model$applyApplist$1$1 INSTANCE = new OobeAbility$Model$applyApplist$1$1();

    public OobeAbility$Model$applyApplist$1$1() {
        super(1);
    }

    @Override // p010kotlin.jvm.functions.Function1
    @Nullable
    public final Res invoke(@NotNull ResBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return prf.c(it);
    }
}
