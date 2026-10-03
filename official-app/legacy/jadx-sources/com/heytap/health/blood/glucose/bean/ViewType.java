package com.heytap.health.blood.glucose.bean;

import androidx.annotation.Keep;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/heytap/health/blood/glucose/bean/ViewType;", "", "type", "", "(Ljava/lang/String;II)V", "getType", "()I", "TITLE", "CONTENT", "blood_glucose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum ViewType {
    TITLE(0),
    CONTENT(1);

    private final int type;

    ViewType(int i) {
        this.type = i;
    }

    public final int getType() {
        return this.type;
    }
}
