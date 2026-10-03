package com.heytap.sports.partner.util;

import com.heytap.health.base.R$string;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.rpc;
import com.oplus.aiunit.vision.y0k;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class PUtilKt$clickableNet$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PUtilKt$clickableNet$1(Function0<Unit> function0) {
        super(0);
        this.$onClick = function0;
    }

    @Override // p010kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (rpc.c()) {
            this.$onClick.invoke();
        } else {
            y0k.i(b78.a().getString(R$string.lib_base_network_error_and_tips));
        }
    }
}
