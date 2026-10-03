package com.platform.account.webview.constant;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class Constants {
    public static final String HEADER_UA_TALKBACKSTATE = "isTalkBackState";
    public static final String JS_ACTION_ON_RESUME = "onResume";
    public static final String JS_ACTION_PREV_EXIT = "prevExit";
    public static final String JS_H5_NEXT_BTN_PRESS = "javascript:if(window.next){next()}";
    public static final String JS_VIP_NEXT_BTN_PRESS = "next";
    public static final String KEY_BUSINESS_MODULE = "key_business_module";
    public static final String KEY_IS_PANEL = "is_panel";
    public static final String KEY_PANEL_HEIGHT = "panel_height";
    public static final String KEY_RESULT_RECEIVER = "key_result_receiver";
    public static final String KEY_TRACE_ID = "key_trace_id";
    public static final String KEY_WEBVIEW_RESULT = "key_webview_result";
    public static final String KEY_WEB_URL = "url";
    public static final String PRODUCT = "account";

    @Keep
    public static class JsbConstants {
        public static final String METHOD_FINISH = "onFinish";
        public static final String METHOD_FORBID_SCREENSHOT = "forbidScreenShot";
        public static final String METHOD_GO_BACK = "goBack";
        public static final String METHOD_MAKE_TOAST = "makeToast";
        public static final String METHOD_ON_DOMLOAD_FINISH = "onDomLoadFinish";
        public static final String METHOD_OPEN_CANDIDATE = "openCandidate";
        public static final String METHOD_OPEN_NEW_WEBVIEW = "openNewWebView";
        public static final String METHOD_OPEN_OBSERVE_WEBVIEW = "openAndObserveWebview";
        public static final String METHOD_PACKAGE_INSTALLED = "isPackageInstalled";
        public static final String METHOD_PRINT_LOG = "printLog";
        public static final String METHOD_REFRESH = "refresh";
        public static final String METHOD_REPORT_WEB_LOG = "reportWebLog";
        public static final String METHOD_SET_CLIENT_TITLE = "setClientTitle";
        public static final String METHOD_SET_PAGE_CONFIG = "setPageConfig";
        public static final String PRODUCT_COMMON = "common";
        public static final String PRODUCT_VIP = "vip";

        private JsbConstants() {
        }
    }

    private Constants() {
    }
}
