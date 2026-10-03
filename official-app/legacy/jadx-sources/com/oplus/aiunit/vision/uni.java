package com.oplus.aiunit.vision;

import com.platform.sdk.center.sdk.statistics.UCIStatisticsDispatcher;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class uni implements UCIStatisticsDispatcher {
    @Override // com.platform.sdk.center.sdk.statistics.UCIStatisticsDispatcher
    public void onStatistics(String str, String str2, String str3, Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("埋点log:systemID：");
        sb.append(str);
        sb.append(",categoryID：");
        sb.append(str2);
        sb.append(",eventID：");
        sb.append(str3);
        sb.append(",hashMap");
        sb.append(map == null ? "" : map.toString());
    }
}
