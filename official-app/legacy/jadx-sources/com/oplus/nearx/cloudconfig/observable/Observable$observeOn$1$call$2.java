package com.oplus.nearx.cloudconfig.observable;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.ehd;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "", "invoke"}, k = 3, mv = {1, 1, 16})
final class Observable$observeOn$1$call$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ Function1 $subscriber;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Observable$observeOn$1$call$2(Function1 function1) {
        super(1);
        this.$subscriber = function1;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable it) {
        Intrinsics.checkParameterIsNotNull(it, "it");
        Function1 function1 = this.$subscriber;
        if (function1 instanceof ehd) {
            ((ehd) function1).onError(it);
        }
    }
}
