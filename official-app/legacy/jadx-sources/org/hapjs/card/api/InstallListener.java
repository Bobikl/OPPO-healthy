package org.hapjs.card.api;

/* JADX INFO: loaded from: classes11.dex */
public interface InstallListener {
    public static final int INSTALL_ERROR_CORRUPTION = 101;
    public static final int INSTALL_ERROR_DOWNGRADE = 103;
    public static final int INSTALL_ERROR_INCOMPATIBLE = 105;
    public static final int INSTALL_ERROR_IO = 104;
    public static final int INSTALL_ERROR_SIGNATURE = 102;
    public static final int INSTALL_ERROR_TIMEOUT = 107;
    public static final int INSTALL_ERROR_UNAVAILABLE = 106;
    public static final int INSTALL_ERROR_UNKNOWN = 100;
    public static final int INSTALL_RESULT_FAILED = 1;
    public static final int INSTALL_RESULT_OK = 0;

    @Deprecated
    void onInstallResult(String str, int i);

    void onInstallResult(String str, int i, int i2);
}
