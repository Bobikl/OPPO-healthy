package com.oplus.vfxsdk.rsview;

import android.util.Log;
import com.oplus.aiunit.vision.dvk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class AnimatorEffectShader$onTrigerAnimNow$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Ref.IntRef $animatorCount;
    final /* synthetic */ Function0<Unit> $endCb;
    final /* synthetic */ Ref.IntRef $progress;
    final /* synthetic */ AnimatorEffectShader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatorEffectShader$onTrigerAnimNow$1(AnimatorEffectShader animatorEffectShader, Ref.IntRef intRef, Ref.IntRef intRef2, Function0<Unit> function0) {
        super(0);
        this.this$0 = animatorEffectShader;
        this.$animatorCount = intRef;
        this.$progress = intRef2;
        this.$endCb = function0;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return Unit.INSTANCE;
    }

    public final void invoke() {
        Function0<Unit> function0;
        Log.i(dvk.TAG, this.this$0.getS() + "=>onTrigerAnimNow: anim end " + this.$animatorCount.element + " " + this.$progress.element);
        Ref.IntRef intRef = this.$progress;
        int i = intRef.element + 1;
        intRef.element = i;
        if (i != this.$animatorCount.element || (function0 = this.$endCb) == null) {
            return;
        }
    }
}
