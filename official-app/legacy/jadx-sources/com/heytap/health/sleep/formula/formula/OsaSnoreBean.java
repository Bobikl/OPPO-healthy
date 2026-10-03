package com.heytap.health.sleep.formula.formula;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class OsaSnoreBean {
    public int recordFileLen;
    public long recordStartUnix;
    public int snoreDataLen;
    public OsaSnoreModelSummaryBean snoreModelSummary;
    public int snoreOsaModelLen;
    public OsaSnoreInfoBean[] snoreDataBuf = {new OsaSnoreInfoBean()};
    public OsaSnoreModelInfoBean[] snoreOsaModelBuf = {new OsaSnoreModelInfoBean()};

    public String toString() {
        return "OsaSnoreBean{recordStartUnix=" + this.recordStartUnix + ", recordFileLen=" + this.recordFileLen + ", snoreDataLen=" + this.snoreDataLen + '}';
    }
}
