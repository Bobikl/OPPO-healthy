package com.airbnb.lottie.compose;

import androidx.compose.runtime.State;
import com.oplus.aiunit.vision.sab;
import com.oplus.aiunit.vision.wab;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class LottieDynamicPropertiesKt$rememberLottieDynamicProperty$2$1 extends Lambda implements Function1<wab<Object>, Object> {
    final /* synthetic */ State<Function1<wab<Object>, Object>> $callbackState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LottieDynamicPropertiesKt$rememberLottieDynamicProperty$2$1(State<? extends Function1<? super wab<Object>, Object>> state) {
        super(1);
        this.$callbackState$delegate = state;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final Object invoke(@NotNull wab<Object> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return sab.c(this.$callbackState$delegate).invoke(it);
    }
}
