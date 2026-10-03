package com.oplus.aiunit.vision;

import com.oplus.pay.opensdk.msp.pay.PayConstant;
import com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@mka(method = "setClientStatusBar", product = PayConstant.MethodName.PAY)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/tzg;", "Lcom/oplus/web/container/comunication/jsapi/BaseJsApiExecutor;", "Lcom/oplus/aiunit/vision/us9;", "fragment", "Lcom/oplus/aiunit/vision/ska;", "apiArguments", "Lcom/oplus/aiunit/vision/rs9;", "callback", "", "handleJsApi", "<init>", "()V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
public final class tzg extends BaseJsApiExecutor {
    @Override // com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor
    public void handleJsApi(@Nullable us9 fragment, @Nullable ska apiArguments, @Nullable rs9 callback) {
        Object obj;
        Unit unit = null;
        if ((fragment != null ? fragment.getActivity() : null) == null) {
            if (callback != null) {
                callback.fail(-1, "setClientStatusBar Fragment or activity is null");
            }
            hrl.h("setClientStatusBar Fragment or activity is null");
            return;
        }
        String strC = apiArguments != null ? apiArguments.c("statusBarBackColor") : null;
        if (strC == null || strC.length() == 0) {
            if (callback != null) {
                callback.fail(-1, "dark is null ");
            }
            hrl.h("setClientStatusBar dark is null");
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            rri.c(fragment.getActivity(), Intrinsics.areEqual(strC, "dark"));
            if (callback != null) {
                callback.success();
                unit = Unit.INSTANCE;
            }
            obj = Result.constructor-impl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            hrl.b("setStatusBarModel error: " + th2.getMessage());
            if (callback != null) {
                callback.fail(-1, "setStatusBarModel error: " + th2.getMessage());
            }
        }
    }
}
