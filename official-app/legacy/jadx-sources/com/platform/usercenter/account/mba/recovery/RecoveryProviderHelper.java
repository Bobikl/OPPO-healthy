package com.platform.usercenter.account.mba.recovery;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import com.platform.usercenter.account.mba.entity.RecoveryPkgInfo;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class RecoveryProviderHelper {
    private static final String ACCOUNT_PROVIDER_QUERY = "com.oplus.usercenter.querypkg.open";
    private static final String TAG = "RecoveryProviderHelper";
    private static Map<String, RecoveryPkgInfo> pkgMap = new HashMap(0);

    public static RecoveryPkgInfo getMemberAppInfoForProvider(Context context, String str) {
        Bundle bundleCall;
        Map<String, RecoveryPkgInfo> map = pkgMap;
        if (map != null && map.containsKey(str)) {
            return pkgMap.get(str);
        }
        Bundle bundle = new Bundle();
        bundle.putString("packageName", str);
        try {
            bundleCall = context.getContentResolver().acquireContentProviderClient(ACCOUNT_PROVIDER_QUERY).call("queryPkgInfo", null, bundle);
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            bundleCall = null;
        }
        if (bundleCall == null) {
            return null;
        }
        int i = bundleCall.getInt("resultCode");
        String string = bundleCall.getString("recovery_pkg");
        String string2 = bundleCall.getString("recovery_label");
        byte[] byteArray = bundleCall.getByteArray("recovery_icon");
        Bitmap bitmapDecodeByteArray = byteArray != null ? BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length) : null;
        boolean z = 1000 == i;
        UCLogUtil.d(TAG, "resultCode = " + i);
        RecoveryPkgInfo recoveryPkgInfo = new RecoveryPkgInfo(i, string, string2, bitmapDecodeByteArray, z);
        if (z) {
            pkgMap.put(str, recoveryPkgInfo);
        }
        return recoveryPkgInfo;
    }
}
