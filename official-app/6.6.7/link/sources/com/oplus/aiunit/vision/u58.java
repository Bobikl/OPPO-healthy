package com.oplus.aiunit.vision;

import com.oplus.web.container.comunication.jsapi.JsApiRegister;
import com.oplus.web.container.jsbridge.common.JsApis;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class u58 {
    public static final void a() {
        JsApiRegister.getInstance().registerJsApiExecutor("common.app_info", bn3.class);
        JsApiRegister.getInstance().registerJsApiExecutor("vip.statisticsDCS", JsApis.StatisticsExecutor.class);
        JsApiRegister.getInstance().registerJsApiExecutor("common.system_setting", up3.class);
        JsApiRegister.getInstance().registerJsApiExecutor("vip.getClientContext", JsApis.GetClientContextExecutor.class);
        JsApiRegister.getInstance().registerJsApiExecutor("vip.getHeaderJson", JsApis.GetHeaderJsonExecutor.class);
        JsApiRegister.getInstance().registerJsApiExecutor("common.close", mn3.class);
        JsApiRegister.getInstance().registerJsApiExecutor("vip.goBack", JsApis.GoBackExecutor.class);
        JsApiRegister.getInstance().registerJsApiExecutor("common.call", kn3.class);
        JsApiRegister.getInstance().registerJsApiExecutor("vip.operateSp", JsApis.OperateSpExecutor.class);
        JsApiRegister.getInstance().registerJsApiExecutor("common.toast", wp3.class);
        JsApiRegister.getInstance().registerJsApiExecutor("common.device_info", qn3.class);
        JsApiRegister.getInstance().registerJsApiExecutor("vip.managePermission", JsApis.ManagePermissionExecutor.class);
        JsApiRegister.getInstance().registerJsApiExecutor("common.sdk_version", hp3.class);
        JsApiRegister.getInstance().registerJsApiExecutor("vip.makeToast", JsApis.MakeToastExecutor.class);
        JsApiRegister.getInstance().registerJsApiExecutor("common.report", so3.class);
        JsApiRegister.getInstance().registerJsApiExecutor("common.open", mo3.class);
        JsApiRegister.getInstance().registerJsApiExecutor("common.status_bar", lp3.class);
        JsApiRegister.getInstance().registerJsApiExecutor("vip.launchActivity", JsApis.LaunchActivityExecutor.class);
        JsApiRegister.getInstance().registerJsApiExecutor("common.network_state", jo3.class);
        JsApiRegister.getInstance().registerJsApiExecutor("vip.printLog", JsApis.PrintLogExecutor.class);
    }
}
