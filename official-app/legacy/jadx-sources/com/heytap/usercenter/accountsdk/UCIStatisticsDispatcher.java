package com.heytap.usercenter.accountsdk;

import com.platform.usercenter.basic.annotation.Keep;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public interface UCIStatisticsDispatcher {
    void onStatistics(String str, String str2, String str3, Map<String, String> map);
}
