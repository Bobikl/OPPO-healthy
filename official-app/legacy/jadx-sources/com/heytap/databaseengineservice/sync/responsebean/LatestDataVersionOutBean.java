package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class LatestDataVersionOutBean {
    private int dataType;
    private boolean dataVersionLatest;

    public int getDataType() {
        return this.dataType;
    }

    public boolean getDataVersionLatest() {
        return this.dataVersionLatest;
    }

    public void setDataType(int i) {
        this.dataType = i;
    }

    public void setDataVersionLatest(boolean z) {
        this.dataVersionLatest = z;
    }

    @NonNull
    public String toString() {
        return "LatestDataVersionOutBean{dataType=" + this.dataType + ", dataVersionLatest=" + this.dataVersionLatest + '}';
    }
}
