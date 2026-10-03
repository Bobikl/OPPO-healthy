package com.accountcenter;

import androidx.annotation.Nullable;
import com.heytap.webpro.jsbridge.interceptor.impl.StatisticInterceptor;
import com.platform.sdk.center.deprecated.AcDispatcherManager;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class y extends StatisticInterceptor {
    @Override // com.heytap.webpro.jsbridge.interceptor.impl.StatisticInterceptor
    public final void onStatistic(String str, String str2, @Nullable Map<String, String> map, boolean z) {
        AcDispatcherManager.getInstance().onStatistics("3012", str, str2, map);
    }
}
