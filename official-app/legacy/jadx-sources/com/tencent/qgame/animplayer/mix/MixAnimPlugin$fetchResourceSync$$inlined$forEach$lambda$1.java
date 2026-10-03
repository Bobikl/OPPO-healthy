package com.tencent.qgame.animplayer.mix;

import android.graphics.Bitmap;
import com.oplus.aiunit.vision.eg1;
import com.oplus.aiunit.vision.q0;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "invoke", "com/tencent/qgame/animplayer/mix/MixAnimPlugin$fetchResourceSync$2$1"}, k = 3, mv = {1, 1, 15})
final class MixAnimPlugin$fetchResourceSync$$inlined$forEach$lambda$1 extends Lambda implements Function1<Bitmap, Unit> {
    final /* synthetic */ Src $src;
    final /* synthetic */ MixAnimPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MixAnimPlugin$fetchResourceSync$$inlined$forEach$lambda$1(Src src, MixAnimPlugin mixAnimPlugin) {
        super(1);
        this.$src = src;
        this.this$0 = mixAnimPlugin;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Bitmap bitmap) {
        Bitmap bitmapA;
        Src src = this.$src;
        if (bitmap == null) {
            q0.INSTANCE.b("AnimPlayer.MixAnimPlugin", "fetch image " + this.$src.getSrcId() + " bitmap return null");
            bitmapA = eg1.INSTANCE.a();
        } else {
            bitmapA = bitmap;
        }
        src.l(bitmapA);
        q0 q0Var = q0.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append("fetch image ");
        sb.append(this.$src.getSrcId());
        sb.append(" finish bitmap is ");
        sb.append(bitmap != null ? Integer.valueOf(bitmap.hashCode()) : null);
        q0Var.d("AnimPlayer.MixAnimPlugin", sb.toString());
        this.this$0.l();
    }
}
