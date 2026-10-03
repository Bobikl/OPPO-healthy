package com.heytap.health.esim.nec;

import android.os.Handler;
import com.heytap.health.esim.bean.ESIMCMCCActiveInfoBean;
import com.oplus.aiunit.vision.a7b;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", UTraceSQLiteHelperKt.COL_INFO, "Lcom/heytap/health/esim/bean/ESIMCMCCActiveInfoBean;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class ActiveManager$recheckActivationAfterDownload$1 extends Lambda implements Function1<ESIMCMCCActiveInfoBean, Unit> {
    final /* synthetic */ Function1<Boolean, Unit> $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActiveManager$recheckActivationAfterDownload$1(Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$callback = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(Function1 callback, int i) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(Boolean.valueOf(i != 2));
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ESIMCMCCActiveInfoBean eSIMCMCCActiveInfoBean) {
        invoke2(eSIMCMCCActiveInfoBean);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable ESIMCMCCActiveInfoBean eSIMCMCCActiveInfoBean) {
        final int activeResult = eSIMCMCCActiveInfoBean != null ? eSIMCMCCActiveInfoBean.getActiveResult() : 0;
        a7b.f("EsimHealth.CMCCActive", "recheckActivation: activeResult=" + activeResult);
        if (activeResult == 2) {
            ActiveManager._necActive.postValue(Boolean.FALSE);
        }
        Handler handler = ActiveManager.mainHandler;
        final Function1<Boolean, Unit> function1 = this.$callback;
        handler.post(new Runnable() { // from class: com.heytap.health.esim.nec.a
            @Override // java.lang.Runnable
            public final void run() {
                ActiveManager$recheckActivationAfterDownload$1.invoke$lambda$0(function1, activeResult);
            }
        });
    }
}
