package com.oplus.web.container.jsbridge.common;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.dqg;
import com.oplus.aiunit.vision.eja;
import com.oplus.aiunit.vision.kja;
import com.oplus.aiunit.vision.lr9;
import com.oplus.aiunit.vision.or9;
import com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor;
import com.oplus.web.container.safe.model.HostSecurityLevel;
import com.platform.account.webview.constant.Constants;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public interface JsApis {

    @eja(method = AcCommonApiMethod.GET_CLIENT_CONTEXT, product = "vip")
    @Keep
    @dqg(level = HostSecurityLevel.NONE)
    public static class GetClientContextExecutor extends BaseJsApiExecutor {
    }

    @eja(method = AcCommonApiMethod.GET_HEADER_JSON, product = "vip")
    @Keep
    @dqg(level = HostSecurityLevel.HIGH)
    public static class GetHeaderJsonExecutor extends BaseJsApiExecutor {
        @Override // com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor
        public void handleJsApi(or9 or9Var, kja kjaVar, lr9 lr9Var) throws Throwable {
            invokeSuccess(lr9Var);
        }
    }

    @eja(method = Constants.JsbConstants.METHOD_GO_BACK, product = "vip")
    @Keep
    @dqg(level = HostSecurityLevel.NONE)
    public static class GoBackExecutor extends BaseJsApiExecutor {
    }

    @eja(method = AcCommonApiMethod.LAUNCH_ACTIVITY, product = "vip")
    @Keep
    @dqg(level = HostSecurityLevel.LOW)
    public static class LaunchActivityExecutor extends BaseJsApiExecutor {
    }

    @eja(method = Constants.JsbConstants.METHOD_MAKE_TOAST, product = "vip")
    @Keep
    @dqg(level = HostSecurityLevel.LOW)
    public static class MakeToastExecutor extends BaseJsApiExecutor {
    }

    @eja(method = "managePermission", product = "vip")
    @Keep
    @dqg(level = HostSecurityLevel.LOW)
    public static class ManagePermissionExecutor extends BaseJsApiExecutor {
    }

    @eja(method = "operateSp", product = "vip")
    @Keep
    @dqg(level = HostSecurityLevel.HIGH)
    public static class OperateSpExecutor extends BaseJsApiExecutor {
    }

    @eja(method = "printLog", product = "vip")
    @Keep
    @dqg(level = HostSecurityLevel.MEDIUM)
    public static class PrintLogExecutor extends BaseJsApiExecutor {
    }

    @eja(method = AcCommonApiMethod.STATISTICS, product = "vip")
    @Keep
    @dqg(level = HostSecurityLevel.MEDIUM)
    public static class StatisticsExecutor extends BaseJsApiExecutor {
    }
}
