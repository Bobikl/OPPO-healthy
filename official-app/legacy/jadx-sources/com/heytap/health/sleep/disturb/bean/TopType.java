package com.heytap.health.sleep.disturb.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class TopType {
    private long duration;
    private int type;

    public long getDuration() {
        return this.duration;
    }

    public int getType() {
        return this.type;
    }

    public void setDuration(long j2) {
        this.duration = j2;
    }

    public void setType(int i) {
        this.type = i;
    }

    @NonNull
    public String toString() {
        return "TopType{type=" + this.type + ", duration=" + this.duration + '}';
    }
}
