package com.nearme.instant.xcard;

import org.hapjs.card.api.Card;

/* JADX INFO: loaded from: classes5.dex */
public interface IRenderListenerV1 {

    public static class ErrorCode {
        public static final int ERROR_CARD_PREPARE_FAILED = 1012;
        public static final int ERROR_CERTIFICATE_CHANGE = 1010;
        public static final int ERROR_FILE_NOT_FOUND = 1003;
        public static final int ERROR_INCOMPATIBLE = 1006;
        public static final int ERROR_INITIAL = 1001;
        public static final int ERROR_INSPECTOR_UNREADY = 1007;
        public static final int ERROR_INSTALL_FAILED = 1004;
        public static final int ERROR_JS_NOT_FOUND = 1008;
        public static final int ERROR_NETWORK_UNAVAILABLE = 1009;
        public static final int ERROR_PAGE_NOT_FOUND = 1005;
        public static final int ERROR_PLATFORM_DISABLED = 1011;
        public static final int ERROR_UNKNOWN = 1000;
        public static final int ERROR_URL = 1002;

        private ErrorCode() {
        }
    }

    boolean onRenderFailed(Card card, int i, String str);

    boolean onRenderProgress();

    void onRenderSuccess(Card card);
}
