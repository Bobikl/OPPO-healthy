package com.oplus.omes.srp.sysintegrity;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class SrpConstant {
    public static final int DEBUG_CACHE_NO_PERMISSION_EXPIRE = 90003;
    public static final int DEBUG_CACHE_TOKEN_EXPIRE = 90002;
    public static final int DEBUG_CACHE_TOKEN_NULL = 90001;
    public static final int DEBUG_CLIENT_INFO = 90300;
    public static final int DEBUG_CODE_MIN = 90000;
    public static final int DEBUG_IMPL_CHECK_FINISH = 90102;
    public static final int DEBUG_IMPL_SERVICE_ENABLED_STA = 90104;
    public static final int DEBUG_IMPL_TOKEN_FROM_CACHE = 90101;
    public static final int DEBUG_IMPL_USER_EXPERIENCE_STA = 90103;
    public static final int DEBUG_JSON_RESULT = 90400;
    public static final int DEBUG_NEED_UPDATE = 90004;
    public static final int DEBUG_PROXY_BIND_FINISHED = 90201;
    public static final int DEBUG_PROXY_BIND_SERVICE_SUC = 90212;
    public static final int DEBUG_PROXY_CHECK_INTERVAL_CHANGED = 90210;
    public static final int DEBUG_PROXY_CHECK_NOT_ALLOWED = 90213;
    public static final int DEBUG_PROXY_CHECK_PARAM = 90208;
    public static final int DEBUG_PROXY_CHECK_SERVICE_RESP = 90209;
    public static final int DEBUG_PROXY_CHK_INTERVAL = 90214;
    public static final int DEBUG_PROXY_INIT_PKG_VERSION = 90202;
    public static final int DEBUG_PROXY_PKG_VER_REQUEST_PARAM = 90203;
    public static final int DEBUG_PROXY_PKG_VER_SERVICE_NEWER = 90205;
    public static final int DEBUG_PROXY_PKG_VER_SERVICE_RESP = 90204;
    public static final int DEBUG_PROXY_TOKEN_REQUEST_PARAM = 90206;
    public static final int DEBUG_PROXY_TOKEN_SERVICE_RESP = 90207;
    public static final int DEBUG_PROXY_TOKEN_TEE = 90215;
    public static final int DEBUG_PROXY_UNBIND_SERVICE = 90211;
    public static final boolean DEF_CONN_RETRY = false;
    public static final long DEF_CONN_TIMEOUT = 10;
    public static final int FAILED = -1;
    public static final int GATHER_INTERVAL_DEF = 2;
    public static final String KIT_APP_MCS_NAME = "com.heytap.mcs";
    public static final String KIT_APP_NAME = "com.heytap.htms";
    public static final int KIT_MIN_VER_CODE = 2010400;
    public static final int SUCCESS = 0;
    private static Map<Integer, String> dbgs;

    static {
        HashMap map = new HashMap();
        dbgs = map;
        map.put(Integer.valueOf(DEBUG_CACHE_TOKEN_NULL), "Cache local token null");
        dbgs.put(Integer.valueOf(DEBUG_CACHE_TOKEN_EXPIRE), "Cache local token expire");
        dbgs.put(Integer.valueOf(DEBUG_CACHE_NO_PERMISSION_EXPIRE), "Cache permission still denied");
        dbgs.put(Integer.valueOf(DEBUG_IMPL_TOKEN_FROM_CACHE), "SrpImpl return token from cache");
        dbgs.put(Integer.valueOf(DEBUG_IMPL_CHECK_FINISH), "SrpImp wait check finish");
        dbgs.put(Integer.valueOf(DEBUG_IMPL_USER_EXPERIENCE_STA), "SrpImp user experience status");
        dbgs.put(Integer.valueOf(DEBUG_IMPL_SERVICE_ENABLED_STA), "SrpImp service enabled switch status");
        dbgs.put(Integer.valueOf(DEBUG_PROXY_BIND_FINISHED), "SrpProxy bind service finish");
        dbgs.put(Integer.valueOf(DEBUG_PROXY_INIT_PKG_VERSION), "SrpProxy init package version enter");
        dbgs.put(Integer.valueOf(DEBUG_PROXY_PKG_VER_REQUEST_PARAM), "SrpProxy request param of getting package version ");
        dbgs.put(Integer.valueOf(DEBUG_PROXY_PKG_VER_SERVICE_RESP), "SrpProxy service response when get package version");
        dbgs.put(Integer.valueOf(DEBUG_PROXY_PKG_VER_SERVICE_NEWER), "SrpProxy service support package version is newer");
        dbgs.put(Integer.valueOf(DEBUG_PROXY_TOKEN_REQUEST_PARAM), "SrpProxy request request param of requesting token ");
        dbgs.put(Integer.valueOf(DEBUG_PROXY_TOKEN_SERVICE_RESP), "SrpProxy service response when request token");
        dbgs.put(Integer.valueOf(DEBUG_PROXY_CHECK_PARAM), "SrpProxy request param of checking environment");
        dbgs.put(Integer.valueOf(DEBUG_PROXY_CHECK_SERVICE_RESP), "SrpProxy service response when checking environment");
        dbgs.put(Integer.valueOf(DEBUG_PROXY_CHECK_INTERVAL_CHANGED), "SrpProxy check interval changed");
        dbgs.put(Integer.valueOf(DEBUG_PROXY_UNBIND_SERVICE), "SrpProxy unbind service");
        dbgs.put(Integer.valueOf(DEBUG_PROXY_BIND_SERVICE_SUC), "SrpProxy bind service success");
        dbgs.put(Integer.valueOf(DEBUG_PROXY_CHECK_NOT_ALLOWED), "SrpProxy check not allowed");
        dbgs.put(Integer.valueOf(DEBUG_PROXY_CHK_INTERVAL), "SrpProxy check interval");
        dbgs.put(Integer.valueOf(DEBUG_NEED_UPDATE), "msp may update from oppo appstore");
    }

    public static String getDbgMsg(int i) {
        return dbgs.containsKey(Integer.valueOf(i)) ? dbgs.get(Integer.valueOf(i)) : "Undefine";
    }
}
