package com.heytap.sports.track.worker;

import android.animation.Animator;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrackReplay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackReplay.kt\ncom/heytap/sports/track/worker/TrackReplay$await$4\n*L\n1#1,859:1\n*E\n"})
public final class TrackReplay$await$4 extends Lambda implements Function1<Animator, Unit> {
    public static final TrackReplay$await$4 INSTANCE = new TrackReplay$await$4();

    public TrackReplay$await$4() {
        super(1);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Animator it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Animator animator) {
        invoke2(animator);
        return Unit.INSTANCE;
    }
}
