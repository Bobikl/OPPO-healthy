package org.hapjs.card.api;

/* JADX INFO: loaded from: classes11.dex */
public interface IRenderListener extends com.nearme.instant.xcard.IRenderListener {

    public static class ErrorCode {
        public static final int ERROR_FILE_NOT_FOUND = 1003;
        public static final int ERROR_INCOMPATIBLE = 1006;
        public static final int ERROR_INITIAL = 1001;
        public static final int ERROR_INSPECTOR_UNREADY = 1007;
        public static final int ERROR_INSTALL_FAILED = 1004;
        public static final int ERROR_PAGE_NOT_FOUND = 1005;
        public static final int ERROR_UNKNOWN = 1000;
        public static final int ERROR_URL = 1002;

        private ErrorCode() {
        }
    }

    @Override // com.nearme.instant.xcard.IRenderListener
    @Deprecated
    void onRenderException(int i, String str);

    @Override // com.nearme.instant.xcard.IRenderListener
    boolean onRenderFailed(int i, String str);

    @Override // com.nearme.instant.xcard.IRenderListener
    boolean onRenderProgress();

    @Override // com.nearme.instant.xcard.IRenderListener
    void onRenderSuccess();
}
