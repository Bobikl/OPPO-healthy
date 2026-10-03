package com.oplus.web.container.jsbridge.common;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.mka;
import com.oplus.aiunit.vision.rs9;
import com.oplus.aiunit.vision.ska;
import com.oplus.aiunit.vision.ttg;
import com.oplus.aiunit.vision.us9;
import com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor;
import com.oplus.web.container.safe.model.HostSecurityLevel;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
public interface JsApis {

    @Keep
    @mka(method = "getClientContext", product = "vip")
    @ttg(level = HostSecurityLevel.NONE)
    public static class GetClientContextExecutor extends BaseJsApiExecutor {
    }

    @Keep
    @mka(method = "getHeaderJson", product = "vip")
    @ttg(level = HostSecurityLevel.HIGH)
    public static class GetHeaderJsonExecutor extends BaseJsApiExecutor {
        @Override // com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor
        public void handleJsApi(us9 us9Var, ska skaVar, rs9 rs9Var) throws Throwable {
            invokeSuccess(rs9Var);
        }
    }

    @Keep
    @mka(method = "goBack", product = "vip")
    @ttg(level = HostSecurityLevel.NONE)
    public static class GoBackExecutor extends BaseJsApiExecutor {
    }

    @Keep
    @mka(method = "launchActivity", product = "vip")
    @ttg(level = HostSecurityLevel.LOW)
    public static class LaunchActivityExecutor extends BaseJsApiExecutor {
    }

    @Keep
    @mka(method = "makeToast", product = "vip")
    @ttg(level = HostSecurityLevel.LOW)
    public static class MakeToastExecutor extends BaseJsApiExecutor {
    }

    @Keep
    @mka(method = "managePermission", product = "vip")
    @ttg(level = HostSecurityLevel.LOW)
    public static class ManagePermissionExecutor extends BaseJsApiExecutor {
    }

    @Keep
    @mka(method = "operateSp", product = "vip")
    @ttg(level = HostSecurityLevel.HIGH)
    public static class OperateSpExecutor extends BaseJsApiExecutor {
    }

    @Keep
    @mka(method = "printLog", product = "vip")
    @ttg(level = HostSecurityLevel.MEDIUM)
    public static class PrintLogExecutor extends BaseJsApiExecutor {
    }

    @Keep
    @mka(method = "statisticsDCS", product = "vip")
    @ttg(level = HostSecurityLevel.MEDIUM)
    public static class StatisticsExecutor extends BaseJsApiExecutor {
    }
}
