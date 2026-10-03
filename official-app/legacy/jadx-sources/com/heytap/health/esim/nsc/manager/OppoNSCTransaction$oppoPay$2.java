package com.heytap.health.esim.nsc.manager;

import android.content.Context;
import com.oplus.aiunit.vision.dkf;
import com.oplus.aiunit.vision.sae;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Function1;", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class OppoNSCTransaction$oppoPay$2 extends Lambda implements Function1<Function1<? super Boolean, ? extends Unit>, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $partnerId;
    final /* synthetic */ String $prePayToken;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OppoNSCTransaction$oppoPay$2(Context context, String str, String str2) {
        super(1);
        this.$context = context;
        this.$prePayToken = str;
        this.$partnerId = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(Function1 it, sae.c cVar) {
        Intrinsics.checkNotNullParameter(it, "$it");
        dkf.INSTANCE.a("oppo pay release on result >> " + cVar.a + " " + cVar.d);
        sae.h().e();
        it.invoke(Boolean.valueOf(cVar.a != 1004));
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Function1<? super Boolean, ? extends Unit> function1) {
        invoke2((Function1<? super Boolean, Unit>) function1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull final Function1<? super Boolean, Unit> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        sae.h().setPayResultListener(new sae.b() { // from class: com.heytap.health.esim.nsc.manager.b
            @Override // com.oplus.aiunit.vision.sae.b
            public final void onPayResponse(sae.c cVar) {
                OppoNSCTransaction$oppoPay$2.invoke$lambda$0(it, cVar);
            }
        });
        dkf.INSTANCE.a("oppo pay start >>");
        sae.h().m(this.$context, this.$prePayToken, this.$partnerId);
    }
}
