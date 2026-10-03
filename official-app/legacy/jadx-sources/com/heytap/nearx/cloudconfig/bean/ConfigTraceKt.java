package com.heytap.nearx.cloudconfig.bean;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0007"}, d2 = {"isExist", "", "", "isFailed", "isLoaded", "isLoading", "isSuccess", "com.heytap.nearx.cloudconfig"}, k = 2, mv = {1, 1, 16})
public final class ConfigTraceKt {
    public static final boolean isExist(int i) {
        return i % 10 == 1;
    }

    public static final boolean isFailed(int i) {
        return i >= 200;
    }

    public static final boolean isLoaded(int i) {
        return i >= 101;
    }

    public static final boolean isLoading(int i) {
        return i >= 10 && i < 101;
    }

    public static final boolean isSuccess(int i) {
        return i >= 101 && i < 200;
    }
}
