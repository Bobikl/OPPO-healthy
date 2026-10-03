package org.hapjs.card.api;

/* JADX INFO: loaded from: classes11.dex */
public interface DownloadListener {
    public static final int DOWNLOAD_ERROR_ALREADY_INSTALLED = 101;
    public static final int DOWNLOAD_ERROR_DOWNGRADE = 102;
    public static final int DOWNLOAD_ERROR_INSTALL_FAILED = 107;
    public static final int DOWNLOAD_ERROR_NETWORK_UNAVAILABLE = 104;
    public static final int DOWNLOAD_ERROR_PACKAGE_PATH_EMPTY = 105;
    public static final int DOWNLOAD_ERROR_PACKAGE_UNAVAILABLE = 103;
    public static final int DOWNLOAD_ERROR_PLATFORM_NOT_SUPPORTED = 108;
    public static final int DOWNLOAD_ERROR_SDK_NOT_INIT = 106;
    public static final int DOWNLOAD_ERROR_UNKNOWN = 100;
    public static final int DOWNLOAD_RESULT_FAILED = 1;
    public static final int DOWNLOAD_RESULT_OK = 0;

    void onDownloadResult(String str, int i, int i2);
}
