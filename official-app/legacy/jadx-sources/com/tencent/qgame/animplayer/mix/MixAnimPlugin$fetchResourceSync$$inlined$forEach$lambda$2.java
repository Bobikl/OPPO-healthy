package com.tencent.qgame.animplayer.mix;

import com.oplus.aiunit.vision.q0;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/tencent/qgame/animplayer/mix/MixAnimPlugin$fetchResourceSync$2$2"}, k = 3, mv = {1, 1, 15})
final class MixAnimPlugin$fetchResourceSync$$inlined$forEach$lambda$2 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ Src $src;
    final /* synthetic */ MixAnimPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MixAnimPlugin$fetchResourceSync$$inlined$forEach$lambda$2(Src src, MixAnimPlugin mixAnimPlugin) {
        super(1);
        this.$src = src;
        this.this$0 = mixAnimPlugin;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable String str) {
        this.$src.n(str != null ? str : "");
        q0.INSTANCE.d("AnimPlayer.MixAnimPlugin", "fetch text " + this.$src.getSrcId() + " finish txt is " + str);
        this.this$0.l();
    }
}
