package com.heytap.sports.record.details.running;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/heytap/sports/record/details/running/PAGER;", "", "index", "", "(Ljava/lang/String;II)V", "getIndex", "()I", "TOUCHDOWN_BALANCE", "TOUCHDOWN_TIME", "VERTICAL_AMPLITUDE", "VERTICAL_STRIDE_RATIO", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum PAGER {
    TOUCHDOWN_BALANCE(0),
    TOUCHDOWN_TIME(1),
    VERTICAL_AMPLITUDE(2),
    VERTICAL_STRIDE_RATIO(3);

    private final int index;

    PAGER(int i) {
        this.index = i;
    }

    public final int getIndex() {
        return this.index;
    }
}
