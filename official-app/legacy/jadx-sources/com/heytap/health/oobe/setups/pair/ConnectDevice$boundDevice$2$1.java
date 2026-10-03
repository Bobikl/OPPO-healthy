package com.heytap.health.oobe.setups.pair;

import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.rdf;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class ConnectDevice$boundDevice$2$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ ConnectDevice$boundDevice$2$receiver$1 $receiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectDevice$boundDevice$2$1(ConnectDevice$boundDevice$2$receiver$1 connectDevice$boundDevice$2$receiver$1) {
        super(1);
        this.$receiver = connectDevice$boundDevice$2$receiver$1;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th) {
        rdf.c(b78.a(), this.$receiver);
    }
}
