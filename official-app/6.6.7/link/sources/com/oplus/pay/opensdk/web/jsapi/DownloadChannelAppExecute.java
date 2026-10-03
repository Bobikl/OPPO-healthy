package com.oplus.pay.opensdk.web.jsapi;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.fragment.app.FragmentActivity;
import com.oplus.aiunit.vision.frl;
import com.oplus.aiunit.vision.hrl;
import com.oplus.aiunit.vision.ihb;
import com.oplus.aiunit.vision.ip0;
import com.oplus.aiunit.vision.mka;
import com.oplus.aiunit.vision.rs9;
import com.oplus.aiunit.vision.ska;
import com.oplus.aiunit.vision.ttg;
import com.oplus.aiunit.vision.us9;
import com.oplus.aiunit.vision.yde;
import com.oplus.pay.opensdk.msp.pay.PayConstant;
import com.oplus.utrace.lib.NodeIDKt;
import com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor;
import com.oplus.web.container.safe.model.HostSecurityLevel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@mka(method = "DownloadChannelApp", product = PayConstant.MethodName.PAY)
@ttg(level = HostSecurityLevel.HIGH)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J&\u0010\u0010\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¨\u0006\u0015"}, d2 = {"Lcom/oplus/pay/opensdk/web/jsapi/DownloadChannelAppExecute;", "Lcom/oplus/web/container/comunication/jsapi/BaseJsApiExecutor;", "", DownloadChannelAppExecute.DOWN_LOAD_URL, "traceID", "", "eventIdDownloadChannelAppGetUrl", "code", "msg", "eventIdOpenBrowserDownloadAppResult", "Lcom/oplus/aiunit/vision/us9;", "fragment", "Lcom/oplus/aiunit/vision/ska;", "apiArguments", "Lcom/oplus/aiunit/vision/rs9;", "callback", "handleJsApi", "<init>", "()V", "Companion", "a", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
public final class DownloadChannelAppExecute extends BaseJsApiExecutor {

    @NotNull
    private static final String DOWN_LOAD_URL = "downloadUrl";

    @NotNull
    private static final String PRE_PAY_TOKEN = "prePayToken";

    private final void eventIdDownloadChannelAppGetUrl(String downloadUrl, String traceID) {
        ip0.INSTANCE.b(yde.a(downloadUrl, traceID));
    }

    private final void eventIdOpenBrowserDownloadAppResult(String code, String msg, String traceID) {
        ip0.INSTANCE.b(yde.c(code, msg, traceID));
    }

    @Override // com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor
    public void handleJsApi(@Nullable us9 fragment, @Nullable ska apiArguments, @Nullable rs9 callback) {
        FragmentActivity activity;
        Context applicationContext;
        String strC = apiArguments != null ? apiArguments.c(DOWN_LOAD_URL) : null;
        String strE = ihb.INSTANCE.e(apiArguments != null ? apiArguments.c("prePayToken") : null);
        eventIdDownloadChannelAppGetUrl(strC == null ? "" : strC, strE == null ? "" : strE);
        if (strC == null || strC.length() == 0) {
            if (callback != null) {
                callback.fail(-1, "downloadUrl is null ");
            }
            hrl.h("openBrowserDownload downloadUrl is null");
            return;
        }
        if (fragment == null || (activity = fragment.getActivity()) == null || (applicationContext = activity.getApplicationContext()) == null) {
            if (callback != null) {
                callback.fail(-1, "openBrowserDownload context is null ");
            }
            if (strE == null) {
                strE = "";
            }
            eventIdOpenBrowserDownloadAppResult(NodeIDKt.DEFAULT_SPAN_NAME, "context is null", strE);
            hrl.h("openBrowserDownload context is null");
            return;
        }
        if (!frl.INSTANCE.b(applicationContext, strC)) {
            if (callback != null) {
                callback.fail(-1, "openBrowserDownload is false");
            }
            if (strE == null) {
                strE = "";
            }
            eventIdOpenBrowserDownloadAppResult(NodeIDKt.DEFAULT_SPAN_NAME, "fail", strE);
            return;
        }
        hrl.a("openBrowserDownload");
        if (callback != null) {
            callback.success();
        }
        if (strE == null) {
            strE = "";
        }
        eventIdOpenBrowserDownloadAppResult("200", "success", strE);
    }
}
