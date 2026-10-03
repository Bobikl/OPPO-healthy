package com.oplus.nearx.cloudconfig.observable;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.gbd;
import com.oplus.aiunit.vision.hbd;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "it", "invoke", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 1, 16})
final class Observable$map$1$call$1 extends Lambda implements Function1<Object, Unit> {
    final /* synthetic */ Function1 $subscriber;
    final /* synthetic */ hbd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Observable$map$1$call$1(hbd hbdVar, Function1 function1) {
        super(1);
        this.$subscriber = function1;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Object obj) {
        gbd.Companion companion = gbd.INSTANCE;
        throw null;
    }
}
