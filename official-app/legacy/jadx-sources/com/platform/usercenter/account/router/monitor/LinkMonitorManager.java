package com.platform.usercenter.account.router.monitor;

import android.util.ArrayMap;
import com.oplus.aiunit.vision.of5;
import com.oplus.aiunit.vision.x0;
import com.platform.usercenter.account.api.provider.ICommonExtProvider;
import com.platform.usercenter.account.api.route.PublicServiceRouter;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.util.Map;
import xcrash.TombstoneParser;

/* JADX INFO: loaded from: classes9.dex */
public class LinkMonitorManager {
    public static String TAG = "LinkMonitorManager";

    public static void collectAndUpload(LinkMonitorParam linkMonitorParam) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("log_tag", "106");
        arrayMap.put(of5.ARG_EVENT_ID, "10607100001");
        arrayMap.put("business", "link_monitor");
        arrayMap.put("link", linkMonitorParam.linkUrl);
        arrayMap.put("trackId", linkMonitorParam.trackId);
        arrayMap.put("error", linkMonitorParam.error);
        arrayMap.put(TombstoneParser.keyStack, linkMonitorParam.stack);
        uploadLinkMonitor(arrayMap);
    }

    public static void uploadLinkMonitor(Map<String, String> map) {
        try {
            ICommonExtProvider iCommonExtProvider = (ICommonExtProvider) x0.d().b(PublicServiceRouter.COMMON_BUSINESS_EXT_PATH).navigation();
            if (iCommonExtProvider != null) {
                iCommonExtProvider.upload(map);
            }
        } catch (Throwable th) {
            UCLogUtil.e(TAG, th.getMessage());
        }
    }
}
