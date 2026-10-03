package com.heytap.msp.sdk.bean;

import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class CostConfig implements Serializable {
    private static final long serialVersionUID = -4896584832751154888L;
    private List<Long> cost;
    private int version;

    public List<Long> getCost() {
        return this.cost;
    }

    public int getVersion() {
        return this.version;
    }

    public void setCost(List<Long> list) {
        this.cost = list;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    @NonNull
    public String toString() {
        return "CostConfig{version=" + this.version + ",cost=" + this.cost + "}";
    }
}
