package com.heytap.store.business.rn.service;

import androidx.fragment.app.FragmentActivity;
import com.heytap.store.platform.htrouter.facade.template.IProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JA\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH&¨\u0006\u000e"}, d2 = {"Lcom/heytap/store/business/rn/service/IRNPaymentService;", "Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "preloadOrderDetailPopView", "", "context", "Landroidx/fragment/app/FragmentActivity;", RnConstant.KEY_COMPONENT_NAME, "", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "rn-service_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IRNPaymentService extends IProvider {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void preloadOrderDetailPopView$default(IRNPaymentService iRNPaymentService, FragmentActivity fragmentActivity, String str, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preloadOrderDetailPopView");
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            iRNPaymentService.preloadOrderDetailPopView(fragmentActivity, str, function1);
        }
    }

    void preloadOrderDetailPopView(@Nullable FragmentActivity context, @NotNull String componentName, @Nullable Function1<? super Boolean, Unit> callback);
}
