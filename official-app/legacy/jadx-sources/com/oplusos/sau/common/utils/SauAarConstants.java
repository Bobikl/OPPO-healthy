package com.oplusos.sau.common.utils;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class SauAarConstants {
    public static final int A = 3001;
    public static final int B = 3002;
    public static final int C = 3003;
    public static final int D = 3004;
    public static final int E = 3011;
    public static final int F = 3012;
    public static final int G = 3013;
    public static final int H = 3014;
    public static final int I = Integer.MIN_VALUE;
    public static final int J = 1073741824;
    public static final int K = 536870912;
    public static final int L = 268435456;
    public static final int M = 134217728;
    public static final int N = 67108864;
    public static final int O = 1;
    public static final int P = 2;
    public static final String Q = "sau_aar_update_dialog_record";
    public static final String R = "sp_last_pop_update_dialog";
    public static final int S = -32765;
    public static final int T = -32764;
    public static final String V = "com.oplus.sau";
    public static final int W = 20;
    public static final String Y = "com.oplus.permission.safe.SAU";
    public static final String b = "com.oplusos.sau.app_update";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20183c = "com.oplusos.saujar.UNBIND_SERVICE";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f20184e = 300000;
    public static final long f = 240000;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 1001;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f20185j = 1002;
    public static final int k = 1003;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f20186l = 1004;
    public static final int m = 1005;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f20187n = 1006;
    public static final int o = 2001;
    public static final int p = 2002;
    public static final int q = 2003;
    public static final int r = 2004;
    public static final int s = 2005;
    public static final int t = 2006;
    public static final int u = 2011;
    public static final int v = 2012;
    public static final int w = 2013;
    public static final int x = 2014;
    public static final int y = 2015;
    public static final int z = 2016;
    public static final String a = new String(Base64.decode("Y29tLmNvbG9yb3Muc2F1LmFwcF91cGRhdGU=".getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8);
    public static final String d = new String(Base64.decode("b3Bwby5pbnRlbnQuYWN0aW9uLlNBVV9BUFBfSkFSX1VQR1JBREVfU0VSVklDRQ==".getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8);
    public static final String U = new String(Base64.decode("Y29tLmNvbG9yb3Muc2F1".getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8);
    public static final String X = new String(Base64.decode("Y29tLm9wcG8ucGVybWlzc2lvbi5zYWZlLlNBVQ==".getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8);
    public static final Map Z = Collections.unmodifiableMap(new HashMap() { // from class: com.oplusos.sau.common.utils.SauAarConstants.1
        {
            put(1001, "MSG_REQUEST_BIND_SERVICE");
            put(2001, "MSG_REQUEST_APP_CHECK_UPDATE");
            put(2002, "MSG_REQUEST_APP_START_DOWNLOAD");
            put(2003, "MSG_REQUEST_APP_PAUSED_DOWNLOAD");
            put(2004, "MSG_REQUEST_APP_RESUME_DOWNLOAD");
            put(2005, "MSG_REQUEST_APP_START_INSTALL");
            put(3001, "MSG_RESPONSE_APP_CHECK_RESULT");
            put(3002, "MSG_RESPONSE_APP_DOWNLOAD_SIZE_UPDATE");
            put(3003, "MSG_RESPONSE_APP_INSTALL_RESULT");
            put(3004, "MSG_RESPONSE_APP_INFO_UPDATE");
            put(1002, "MSG_REQUEST_UNBIND_SERVICE");
            put(2011, "MSG_REQUEST_DATARES_CHECK_UPDATE");
            put(2012, "MSG_REQUEST_DATARES_START_DOWNLOAD");
            put(2013, "MSG_REQUEST_DATARES_PAUSED_DOWNLOAD");
            put(2014, "MSG_REQUEST_DATARES_RESUME_DOWNLOAD");
            put(2015, "MSG_REQUEST_DATARES_START_INSTALL");
            put(3011, "MSG_RESPONSE_DATARES_CHECK_RESULT");
            put(3012, "MSG_RESPONSE_DATARES_DOWNLOAD_SIZE_UPDATE");
            put(Integer.valueOf(SauAarConstants.G), "MSG_RESPONSE_DATARES_INSTALL_RESULT");
            put(3014, "MSG_RESPONSE_DATARES_INFO_UPDATE");
            put(2006, "MSG_REQUEST_APP_CANCEL_DOWNLOAD");
            put(2016, "MSG_REQUEST_DATARES_CANCEL_DOWNLOAD");
            put(1004, "MSG_REQUEST_RESET_OBSERVER");
            put(1005, "MSG_REQUEST_REGISTER_OBSERVER");
            put(1006, "MSG_REQUEST_DISCONNECTED_SERVICE");
        }
    });
}
