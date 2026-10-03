package com.oplus.pay.opensdk.web.jsapi;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.fragment.app.FragmentActivity;
import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;
import com.oplus.aiunit.vision.dqg;
import com.oplus.aiunit.vision.eja;
import com.oplus.aiunit.vision.hnl;
import com.oplus.aiunit.vision.jnl;
import com.oplus.aiunit.vision.kja;
import com.oplus.aiunit.vision.lr9;
import com.oplus.aiunit.vision.or9;
import com.oplus.aiunit.vision.ro0;
import com.oplus.aiunit.vision.tfb;
import com.oplus.aiunit.vision.zbe;
import com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor;
import com.oplus.web.container.safe.model.HostSecurityLevel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@eja(method = "DownloadChannelApp", product = "pay")
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J&\u0010\u0010\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¨\u0006\u0015"}, d2 = {"Lcom/oplus/pay/opensdk/web/jsapi/DownloadChannelAppExecute;", "Lcom/oplus/web/container/comunication/jsapi/BaseJsApiExecutor;", "", DownloadChannelAppExecute.DOWN_LOAD_URL, "traceID", "", "eventIdDownloadChannelAppGetUrl", "code", "msg", "eventIdOpenBrowserDownloadAppResult", "Lcom/oplus/aiunit/vision/or9;", "fragment", "Lcom/oplus/aiunit/vision/kja;", "apiArguments", "Lcom/oplus/aiunit/vision/lr9;", "callback", "handleJsApi", "<init>", "()V", "Companion", "a", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
@dqg(level = HostSecurityLevel.HIGH)
public final class DownloadChannelAppExecute extends BaseJsApiExecutor {

    @NotNull
    private static final String DOWN_LOAD_URL = "downloadUrl";

    @NotNull
    private static final String PRE_PAY_TOKEN = "prePayToken";

    private final void eventIdDownloadChannelAppGetUrl(String downloadUrl, String traceID) {
        ro0.INSTANCE.b(zbe.a(downloadUrl, traceID));
    }

    private final void eventIdOpenBrowserDownloadAppResult(String code, String msg, String traceID) {
        ro0.INSTANCE.b(zbe.c(code, msg, traceID));
    }

    @Override // com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor
    public void handleJsApi(@Nullable or9 fragment, @Nullable kja apiArguments, @Nullable lr9 callback) {
        FragmentActivity activity;
        Context applicationContext;
        String strC = apiArguments != null ? apiArguments.c(DOWN_LOAD_URL) : null;
        String strE = tfb.INSTANCE.e(apiArguments != null ? apiArguments.c("prePayToken") : null);
        eventIdDownloadChannelAppGetUrl(strC == null ? "" : strC, strE == null ? "" : strE);
        if (strC == null || strC.length() == 0) {
            if (callback != null) {
                callback.fail(-1, "downloadUrl is null ");
            }
            jnl.h("openBrowserDownload downloadUrl is null");
            return;
        }
        if (fragment == null || (activity = fragment.getActivity()) == null || (applicationContext = activity.getApplicationContext()) == null) {
            if (callback != null) {
                callback.fail(-1, "openBrowserDownload context is null ");
            }
            if (strE == null) {
                strE = "";
            }
            eventIdOpenBrowserDownloadAppResult("-1", "context is null", strE);
            jnl.h("openBrowserDownload context is null");
            return;
        }
        if (!hnl.INSTANCE.b(applicationContext, strC)) {
            if (callback != null) {
                callback.fail(-1, "openBrowserDownload is false");
            }
            if (strE == null) {
                strE = "";
            }
            eventIdOpenBrowserDownloadAppResult("-1", AcBaseTraceHelper.VAL_FAIL, strE);
            return;
        }
        jnl.a("openBrowserDownload");
        if (callback != null) {
            callback.success();
        }
        if (strE == null) {
            strE = "";
        }
        eventIdOpenBrowserDownloadAppResult("200", "success", strE);
    }
}
