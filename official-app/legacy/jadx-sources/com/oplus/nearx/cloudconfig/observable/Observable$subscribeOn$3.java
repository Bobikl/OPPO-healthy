package com.oplus.nearx.cloudconfig.observable;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.gbd;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "invoke"}, k = 3, mv = {1, 1, 16})
final class Observable$subscribeOn$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ gbd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Observable$subscribeOn$3(gbd gbdVar) {
        super(0);
        this.this$0 = gbdVar;
    }

    @Override // p010kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.a();
    }
}
