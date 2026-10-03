package com.heytap.webpro.jsbridge.executor;

import androidx.annotation.Keep;
import com.heytap.webpro.jsapi.BaseJsApiExecutor;
import com.oplus.aiunit.vision.cqg;
import com.oplus.aiunit.vision.dja;
import com.oplus.aiunit.vision.jja;
import com.oplus.aiunit.vision.kr9;
import com.oplus.aiunit.vision.pr9;
import com.platform.account.webview.constant.Constants;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public interface JsApis {

    @Keep
    @cqg(permissionType = 1, score = 1)
    @dja(method = AcCommonApiMethod.GET_CLIENT_CONTEXT, product = "vip")
    public static class GetClientContextExecutor extends BaseJsApiExecutor {
    }

    @Keep
    @cqg(score = 100)
    @dja(method = AcCommonApiMethod.GET_HEADER_JSON, product = "vip")
    public static class GetHeaderJsonExecutor extends BaseJsApiExecutor {
        @Override // com.heytap.webpro.jsapi.BaseJsApiExecutor
        public void handleJsApi(pr9 pr9Var, jja jjaVar, kr9 kr9Var) throws Throwable {
            invokeSuccess(kr9Var);
        }
    }

    @Keep
    @cqg(score = 0)
    @dja(method = Constants.JsbConstants.METHOD_GO_BACK, product = "vip")
    public static class GoBackExecutor extends BaseJsApiExecutor {
    }

    @Keep
    @cqg(score = 1)
    @dja(method = AcCommonApiMethod.LAUNCH_ACTIVITY, product = "vip")
    public static class LaunchActivityExecutor extends BaseJsApiExecutor {
    }

    @Keep
    @cqg(score = 30)
    @dja(method = Constants.JsbConstants.METHOD_MAKE_TOAST, product = "vip")
    public static class MakeToastExecutor extends BaseJsApiExecutor {
    }

    @Keep
    @cqg(score = 1)
    @dja(method = "managePermission", product = "vip")
    public static class ManagePermissionExecutor extends BaseJsApiExecutor {
    }

    @Keep
    @cqg(permissionType = 4, score = 80)
    @dja(method = "operateSp", product = "vip")
    public static class OperateSpExecutor extends BaseJsApiExecutor {
    }

    @Keep
    @cqg(score = 30)
    @dja(method = "printLog", product = "vip")
    public static class PrintLogExecutor extends BaseJsApiExecutor {
    }

    @Keep
    @cqg(score = 30)
    @dja(method = AcCommonApiMethod.STATISTICS, product = "vip")
    public static class StatisticsExecutor extends BaseJsApiExecutor {
    }
}
