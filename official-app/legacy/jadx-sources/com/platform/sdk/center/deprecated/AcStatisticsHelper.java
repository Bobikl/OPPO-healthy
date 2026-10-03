package com.platform.sdk.center.deprecated;

import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.datastructure.Maps;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Deprecated
public class AcStatisticsHelper {
    public static final String DEFAULT_SYSTEMID = "3012";
    public static final String LOG_TAG_106 = "106";

    @Keep
    public static class StatBuilder {
        private String eventId;
        private HashMap<String, String> eventInfo;
        private String logTag;

        public StatBuilder eventId(String str) {
            this.eventId = str;
            return this;
        }

        public StatBuilder logTag(String str) {
            this.logTag = str;
            return this;
        }

        public StatBuilder putInfo(String str, String str2) {
            if (this.eventInfo == null) {
                this.eventInfo = Maps.newHashMap();
            }
            this.eventInfo.put(str, str2);
            return this;
        }

        public void statistics() {
            UCLogUtil.e("statistics logTag = " + this.logTag + "\n statistics eventId = " + this.eventId + "\n statistics logmap = " + this.eventInfo);
            AcStatisticsHelper.onStatistics("3012", this.logTag, this.eventId, this.eventInfo);
        }
    }

    public static void onStatistics(String str, String str2, String str3, Map<String, String> map) {
        AcDispatcherManager.getInstance().onStatistics(str, str2, str3, map);
    }
}
