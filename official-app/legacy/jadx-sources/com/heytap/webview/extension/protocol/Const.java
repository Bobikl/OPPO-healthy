package com.heytap.webview.extension.protocol;

/* JADX INFO: loaded from: classes4.dex */
public interface Const {

    public interface Arguments {

        public interface AppInfo {
            public static final String PACKAGE_NAME = "package_name";
        }

        public interface Call {
            public static final String DIAL = "dial";
            public static final String PHONE_NUMBER = "number";
        }

        public interface Close {
            public static final String TYPE = "type";

            public interface TypeValue {
                public static final String ALL = "all";
            }
        }

        public interface Open {
            public static final String MAIN = "main";
            public static final String STYLE = "style";
            public static final String TITLE = "title";
            public static final String URL = "url";
        }

        public interface Setting {
            public static final String ACTION = "action";
            public static final String PACKAGE_NAME = "package_name";

            public interface Prefix {
                public static final String PACKAGE_PREFIX = "package";
                public static final String SETTING_PREFIX = "android.settings.";
            }
        }

        public interface StatusBar {
            public static final String Dark_MODEL = "dark_model";
        }

        public interface Title {
            public static final String TITLE = "title";
        }

        public interface Toast {
            public static final String DURATION = "duration";
            public static final String MSG = "message";

            public interface Duration {
                public static final String LONG = "LONG";

                @Deprecated
                public static final String LONG_OLD = "1";
                public static final String SHORT = "SHORT";
            }
        }
    }

    public interface Batch {
        public static final String ARGUMENTS = "arguments";
        public static final String CALLBACK_ID = "callback_id";
        public static final String METHOD = "method";
    }

    public interface Callback {
        public static final String JS_API_CALLBACK_CODE = "code";
        public static final String JS_API_CALLBACK_DATA = "data";
        public static final String JS_API_CALLBACK_MSG = "msg";

        public interface AppInfo {
            public static final String PACKAGE_NAME = "package_name";
            public static final String VERSION_CODE = "version_code";
            public static final String VERSION_NAME = "version_name";
        }

        public interface DeviceInfo {
            public static final String BRAND = "brand";
            public static final String COUNTRY = "country";
            public static final String LAN = "language";
            public static final String MODEL = "model";
            public static final String SYSTEM_VERSION = "system_version";
            public static final String TZ = "time_zone";
        }

        public interface NetworkState {
            public static final String NS = "network_state";

            public interface NetworkType {
                public static final String NETWORK_MOBILE = "MOBILE";
                public static final String NETWORK_NO = "NO";
            }
        }

        public interface SDKVersion {
            public static final String VER = "version";
        }
    }

    public interface JsApiResponse {

        public interface IllegalArgument {
            public static final int CODE = 2;
            public static final String MESSAGE = "illegal argument!";
        }

        public interface PermissionDenied {
            public static final int CODE = 3;
            public static final String MESSAGE = "permission denied!";
        }

        public interface Success {
            public static final int CODE = 0;
            public static final String MESSAGE = "success!";
        }

        public interface UnsupportedOperation {
            public static final int CODE = 1;
            public static final String MESSAGE = "unsupported operation!";
        }
    }

    public interface ObjectName {
        public static final String JS_API_OBJECT = "HeytapNativeApi";
    }

    public interface Scheme {
        public static final String SCHEME_FILE = "file";
        public static final String SCHEME_HTTP = "http";
        public static final String SCHEME_HTTPS = "https";
    }

    public interface Tag {
        public static final String BROADCAST = "JSAPI-Broadcast";
        public static final String EXECUTOR = "JSAPI-Executor";
        public static final String LOADING_PROCESS = "WebExt-LoadingProcess";
    }
}
