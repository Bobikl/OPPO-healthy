package com.oplus.nearx.track.internal.common;

import com.oplus.aiunit.vision.y15;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/nearx/track/internal/common/DataType;", "", y15.PARAMS_DATA_TYPE, "", "(Ljava/lang/String;II)V", "value", "BIZ", "TECH", "core-statistics_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public enum DataType {
    BIZ(0),
    TECH(1);

    private final int dataType;

    DataType(int i) {
        this.dataType = i;
    }

    /* JADX INFO: renamed from: value, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }
}
