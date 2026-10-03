package org.hapjs.card.api;

/* JADX INFO: loaded from: classes11.dex */
public interface UninstallListener {
    public static final int UNINSTALL_ERROR_HAS_PAGES = 102;
    public static final int UNINSTALL_ERROR_NOT_EXISTS = 101;
    public static final int UNINSTALL_ERROR_UNKNOWN = 100;
    public static final int UNINSTALL_RESULT_FAILED = 1;
    public static final int UNINSTALL_RESULT_OK = 0;

    void onUninstallResult(String str, int i, int i2);
}
