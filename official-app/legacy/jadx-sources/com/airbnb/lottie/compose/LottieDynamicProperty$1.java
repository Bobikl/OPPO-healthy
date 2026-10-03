package com.airbnb.lottie.compose;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.wab;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/wab;", "it", "invoke", "(Lcom/oplus/aiunit/vision/wab;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class LottieDynamicProperty$1 extends Lambda implements Function1<wab<Object>, Object> {
    final /* synthetic */ Object $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieDynamicProperty$1(Object obj) {
        super(1);
        this.$value = obj;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final Object invoke(@NotNull wab<Object> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.$value;
    }
}
