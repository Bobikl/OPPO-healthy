package com.heytap.webview.extension.protocol;

/* JADX INFO: loaded from: classes4.dex */
public interface ThemeConst {

    public interface Function {
        public static final String JS_TEMPLATE_NOTIFY_DARK_LEVEL_MODE = "javascript:if(window.refreshNightMode){window.refreshNightMode();}";
        public static final String JS_TEMPLATE_NOTIFY_DAY_MODE = "javascript:if(window.removeNightMode){window.removeNightMode();}";
        public static final String JS_TEMPLATE_NOTIFY_NIGHT_MODE = "javascript:if(window.applyNightMode){window.applyNightMode();}";
    }

    public interface ObjectName {
        public static final String JS_INTERFACE_THEME = "HeytapTheme";
    }
}
