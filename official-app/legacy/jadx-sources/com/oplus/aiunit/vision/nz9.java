package com.oplus.aiunit.vision;

import com.heytap.upgrade.model.UpgradeInfo;
import java.io.File;

/* JADX INFO: loaded from: classes19.dex */
public interface nz9 {
    public static final int ERROR_BUNDLE_LIST_NULL = 24;
    public static final int ERROR_DATA_MISSING = 26;
    public static final int ERROR_INTERRUPTED = 25;
    public static final int ERROR_NETWORK = 20;
    public static final int ERROR_NETWORK_CONNECT_TIMEOUT = 2005;
    public static final int ERROR_NETWORK_CONTENT_LENGTH = 2002;
    public static final int ERROR_NETWORK_RESPONSE_CODE = 2001;
    public static final int ERROR_NETWORK_SOCKET = 2004;
    public static final int ERROR_NETWORK_SOCKET_TIMEOUT = 2003;
    public static final int ERROR_NETWORK_UNKNOWN_HOST = 2006;
    public static final int ERROR_OUT_OF_MEMORY = 21;
    public static final int ERROR_PROCESS_OVER_100 = 27;
    public static final int ERROR_REACH_RETRY_LIMIT = 28;
    public static final int ERROR_UNKNOWN = -1;
    public static final int ERROR_WRITE_FILE = 23;
    public static final int ERROR_WRONG_MD5 = 22;

    void A6();

    void F1(UpgradeInfo upgradeInfo);

    void M3();

    void S4(int i);

    void f0(int i, long j2);

    void g(File file);
}
