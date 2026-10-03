package com.heytap.sports.track.worker;

import android.animation.ValueAnimator;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/animation/ValueAnimator;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrackReplay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackReplay.kt\ncom/heytap/sports/track/worker/TrackReplay$await$5\n*L\n1#1,859:1\n*E\n"})
public final class TrackReplay$await$5 extends Lambda implements Function2<ValueAnimator, Integer, Unit> {
    public static final TrackReplay$await$5 INSTANCE = new TrackReplay$await$5();

    public TrackReplay$await$5() {
        super(2);
    }

    public final void invoke(@NotNull ValueAnimator valueAnimator, int i) {
        Intrinsics.checkNotNullParameter(valueAnimator, "<anonymous parameter 0>");
    }

    @Override // p010kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ValueAnimator valueAnimator, Integer num) {
        invoke(valueAnimator, num.intValue());
        return Unit.INSTANCE;
    }
}
