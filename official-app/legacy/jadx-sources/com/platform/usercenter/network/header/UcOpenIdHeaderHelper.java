package com.platform.usercenter.network.header;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.platform.usercenter.network.data.HeaderOpenIdBean;
import com.platform.usercenter.tools.env.EnvConstantManager;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.os.UCOSVersionUtil;
import com.platform.usercenter.tools.thread.BackgroundExecutor;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class UcOpenIdHeaderHelper {
    public static final String HEADER_X_CLIENT_APID = "X-Client-APID";
    public static final String HEADER_X_CLIENT_AUID = "X-Client-AUID";
    public static final String HEADER_X_CLIENT_DUID = "X-Client-DUID";
    public static final String HEADER_X_CLIENT_GUID = "X-Client-GUID";
    public static final String HEADER_X_CLIENT_OUID = "X-Client-OUID";
    private static final String TAG = "OpenIDHelper";
    private final IBizHeaderManager mBizHeaderManager;
    private final ConcurrentHashMap<String, String> sOpenidMap = new ConcurrentHashMap<>(5);

    public UcOpenIdHeaderHelper(IBizHeaderManager iBizHeaderManager) {
        this.mBizHeaderManager = iBizHeaderManager;
    }

    private static String checkNullValue(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        UCLogUtil.i(TAG, "id is NULL");
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getOpenId, reason: merged with bridge method [inline-methods] */
    public void lambda$getOpenIdHeader$0(Context context) {
        IBizHeaderManager iBizHeaderManager = this.mBizHeaderManager;
        if (iBizHeaderManager == null) {
            return;
        }
        HeaderOpenIdBean headerOpenId = iBizHeaderManager.getHeaderOpenId(context);
        if (headerOpenId != null) {
            this.sOpenidMap.put("X-Client-GUID", checkNullValue(headerOpenId.getGuid()));
            this.sOpenidMap.put("X-Client-OUID", checkNullValue(headerOpenId.getOuid()));
            this.sOpenidMap.put("X-Client-DUID", checkNullValue(headerOpenId.getDuid()));
            this.sOpenidMap.put("X-Client-AUID", checkNullValue(headerOpenId.getAuid()));
            this.sOpenidMap.put("X-Client-APID", checkNullValue(headerOpenId.getApid()));
        }
        if (EnvConstantManager.getInstance().DEBUG()) {
            for (String str : this.sOpenidMap.keySet()) {
                UCLogUtil.d("k = " + str + " , values = " + this.sOpenidMap.get(str));
            }
        }
    }

    public String getAPID() {
        ConcurrentHashMap<String, String> concurrentHashMap = this.sOpenidMap;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get("X-Client-APID");
    }

    public String getAUID() {
        ConcurrentHashMap<String, String> concurrentHashMap = this.sOpenidMap;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get("X-Client-AUID");
    }

    @Deprecated
    public String getDUID() {
        return "";
    }

    public String getGUID() {
        ConcurrentHashMap<String, String> concurrentHashMap = this.sOpenidMap;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get("X-Client-GUID");
    }

    public String getOUID() {
        ConcurrentHashMap<String, String> concurrentHashMap = this.sOpenidMap;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get("X-Client-OUID");
    }

    public ConcurrentHashMap<String, String> getOpenIdHeader(final Context context, boolean z) {
        try {
            ConcurrentHashMap<String, String> concurrentHashMap = this.sOpenidMap;
            if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                return this.sOpenidMap;
            }
            if (z) {
                return this.sOpenidMap;
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                UCLogUtil.i("getOpenIdHeader Cannot run on MainThread");
                return this.sOpenidMap;
            }
            if (UCOSVersionUtil.getOSVersionCode() == 19 || UCOSVersionUtil.getOSVersionCode() == 20 || UCOSVersionUtil.getOSVersionCode() == 21) {
                BackgroundExecutor.runOnWorkThread(new Runnable() { // from class: com.oplus.aiunit.vision.vfk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.lambda$getOpenIdHeader$0(context);
                    }
                });
            } else {
                lambda$getOpenIdHeader$0(context);
            }
            return this.sOpenidMap;
        } catch (Exception e2) {
            UCLogUtil.e(e2);
        }
    }

    public ConcurrentHashMap<String, String> getOpenIdHeader(Context context) {
        return getOpenIdHeader(context, false);
    }
}
