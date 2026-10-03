package com.heytap.health.device.ota.cloud.model;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class RespsInfo {
    public List<OTAModule> modules;
    public String msg;
    public int result;
    public int resultCode;

    public String toString() {
        return "RespsInfo{modules=" + this.modules + ", msg='" + this.msg + "', resultCode=" + this.resultCode + ", result=" + this.result + '}';
    }
}
