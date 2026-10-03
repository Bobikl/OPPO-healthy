package com.oplus.accountsdk.base.account.trace.bean;

import androidx.annotation.Keep;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcTraceConfigResponse {
    public String country;
    public Map<String, AcTraceDomainConfig> domainConfig;
    public Map<String, Boolean> eventConfig;
    public int reportBatchMaxSize;
    public long reportInterval;
    public int version;

    public boolean validParam() {
        Map<String, Boolean> map;
        Map<String, AcTraceDomainConfig> map2 = this.domainConfig;
        return (map2 == null || map2.isEmpty() || (map = this.eventConfig) == null || map.isEmpty() || this.reportInterval <= 0 || this.reportBatchMaxSize <= 0) ? false : true;
    }
}
