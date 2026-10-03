package com.oppo.store.web.delegate.datacenter;

import com.heytap.store.base.facade.HTStoreFacade;
import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.aiunit.vision.kbd;
import com.oppo.store.web.api.WebApiService;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJD\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005JD\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005¨\u0006\r"}, d2 = {"Lcom/oppo/store/web/delegate/datacenter/WebViewRepository;", "", "", "host", "path", "", "headers", RnConstant.KEY_INIT_OPTIONS, "Lcom/oplus/aiunit/vision/kbd;", "webGetPreInterface", "webPostPreInterface", "<init>", "()V", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1})
public final class WebViewRepository {
    @NotNull
    public final kbd<String> webGetPreInterface(@NotNull String host, @NotNull String path, @NotNull Map<String, String> headers, @NotNull Map<String, String> param) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(param, "param");
        kbd<String> kbdVarWebGetPreInterface = ((WebApiService) HTStoreFacade.INSTANCE.getInstance().getNetworkProxy().c(WebApiService.class, host)).webGetPreInterface(path, headers, param);
        Intrinsics.checkNotNullExpressionValue(kbdVarWebGetPreInterface, "HTStoreFacade.instance.g…ace(path, headers, param)");
        return kbdVarWebGetPreInterface;
    }

    @NotNull
    public final kbd<String> webPostPreInterface(@NotNull String host, @NotNull String path, @NotNull Map<String, String> headers, @NotNull Map<String, String> param) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(param, "param");
        kbd<String> kbdVarWebPostPreInterface = ((WebApiService) HTStoreFacade.INSTANCE.getInstance().getNetworkProxy().c(WebApiService.class, host)).webPostPreInterface(path, headers, param);
        Intrinsics.checkNotNullExpressionValue(kbdVarWebPostPreInterface, "HTStoreFacade.instance.g…ace(path, headers, param)");
        return kbdVarWebPostPreInterface;
    }
}
