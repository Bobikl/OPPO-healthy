package com.heytap.health.operation.ecg.data;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class SubmitEcgDataBean {
    public int ecgState = -1;
    public String reportId;

    public boolean isEcgDataChecking() {
        return this.ecgState == -1;
    }

    public boolean isEcgDataOk() {
        return this.ecgState == 0;
    }

    public SubmitEcgDataBean setEcgDataOk() {
        this.ecgState = 0;
        return this;
    }
}
