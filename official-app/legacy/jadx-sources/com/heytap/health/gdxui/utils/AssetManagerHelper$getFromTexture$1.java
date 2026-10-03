package com.heytap.health.gdxui.utils;

import com.badlogic.gdx.graphics.Texture;
import com.oplus.aiunit.vision.xtj;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/oplus/aiunit/vision/xtj;", "invoke", "()Lcom/oplus/aiunit/vision/xtj;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class AssetManagerHelper$getFromTexture$1 extends Lambda implements Function0<xtj> {
    final /* synthetic */ String $path;
    final /* synthetic */ AssetManagerHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetManagerHelper$getFromTexture$1(AssetManagerHelper assetManagerHelper, String str) {
        super(0);
        this.this$0 = assetManagerHelper;
        this.$path = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function0
    @Nullable
    public final xtj invoke() {
        return new xtj((Texture) this.this$0.d(this.$path));
    }
}
