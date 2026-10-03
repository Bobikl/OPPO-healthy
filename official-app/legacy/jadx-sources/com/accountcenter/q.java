package com.accountcenter;

import androidx.annotation.NonNull;
import com.heytap.store.base.core.http.HttpConst;
import com.heytap.store.base.core.http.HttpUtils;
import com.heytap.usercenter.accountsdk.AccountAgent;
import com.oplus.aiunit.vision.bv9;
import com.platform.sdk.center.pay.PayTaskHelper;
import com.platform.sdk.center.preload.ILocationCallback;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.tools.algorithm.MD5Util;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements bv9 {
    public final ILocationCallback a;

    public q(ILocationCallback iLocationCallback) {
        this.a = iLocationCallback;
    }

    @Override // com.oplus.aiunit.vision.bv9
    public /* bridge */ /* synthetic */ String encodeParam(String str) {
        return super.encodeParam(str);
    }

    @Override // com.oplus.aiunit.vision.bv9
    public final String getParamValue(String str) {
        ILocationCallback iLocationCallback;
        if ("TOKEN".equals(str)) {
            return AccountAgent.getToken(BaseApp.mContext, "");
        }
        if ("AUTORENEEWAL".equals(str)) {
            int payApkVersionCode = PayTaskHelper.getPayApkVersionCode(BaseApp.mContext);
            return String.valueOf(payApkVersionCode > 213 && payApkVersionCode != 1550);
        }
        if (!com.coloros.sceneservice.e.a.va.equals(str)) {
            return (!com.coloros.sceneservice.e.a.ua.equals(str) || (iLocationCallback = this.a) == null) ? "" : String.valueOf(iLocationCallback.getLatitude());
        }
        ILocationCallback iLocationCallback2 = this.a;
        return iLocationCallback2 != null ? String.valueOf(iLocationCallback2.getLongitude()) : "";
    }

    @Override // com.oplus.aiunit.vision.bv9
    @NonNull
    public final Map<String, String> getParams() {
        TreeMap treeMap = new TreeMap();
        treeMap.put(HttpConst.APP_KEY, "zyzTuucAUYWHSNViMfDvm1");
        treeMap.put("nonce", String.valueOf(System.currentTimeMillis()));
        treeMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        return treeMap;
    }

    @Override // com.oplus.aiunit.vision.bv9
    public final String getSign(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(entry.getValue());
            sb.append("&");
        }
        sb.append("key=9WBpW4VPXTDnFSGJXRqdBbYZPjvYHNGFD");
        return MD5Util.md5Hex(sb.toString());
    }
}
