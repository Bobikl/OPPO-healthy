package com.oplus.aiunit.tools.odinheader;

import android.content.Context;
import com.oplus.aiunit.vision.jed;
import com.oplus.aiunit.vision.ooi;
import com.oplus.aiunit.vision.poi;
import java.util.concurrent.CountDownLatch;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class OdinHeaderTools$getDUID$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CountDownLatch $locker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OdinHeaderTools$getDUID$1$1(CountDownLatch countDownLatch, Context context) {
        super(0);
        this.$locker = countDownLatch;
        this.$context = context;
    }

    @Override // p010kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Object objM5287constructorimpl;
        jed jedVar = jed.INSTANCE;
        Context context = this.$context;
        try {
            Result.Companion companion = Result.INSTANCE;
            ooi ooiVarI = poi.i(context, ooi.Type_DUID);
            String strA = ooiVarI != null ? ooiVarI.a() : null;
            if (strA == null) {
                strA = "";
            } else {
                Intrinsics.checkNotNull(strA);
            }
            jed.duid = strA;
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            thM5290exceptionOrNullimpl.printStackTrace();
        }
        if (Result.m5294isSuccessimpl(objM5287constructorimpl)) {
        }
        this.$locker.countDown();
    }
}
