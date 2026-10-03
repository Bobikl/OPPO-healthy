package com.heytap.health.devicemanager.event;

import com.heytap.health.base.track.quality.QualityTrack;
import com.heytap.health.base.track.quality.Scenes;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.FunctionReferenceImpl;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class DMQualityEventHelper$reportQualityEvent$1$2 extends FunctionReferenceImpl implements Function2<Scenes, String, Unit> {
    public DMQualityEventHelper$reportQualityEvent$1$2(Object obj) {
        super(2, obj, QualityTrack.class, "reportSuccess", "reportSuccess(Lcom/heytap/health/base/track/quality/Scenes;Ljava/lang/String;)V", 0);
    }

    @Override // p010kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Scenes scenes, String str) {
        invoke2(scenes, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Scenes p0, @NotNull String p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((QualityTrack) this.receiver).g(p0, p1);
    }
}
