package com.heytap.accessory.pair.common;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public enum FastPairRole {
    SEEKER,
    PROVIDER;

    public FastPairRole getRole(int i) {
        FastPairRole fastPairRole = SEEKER;
        return i == fastPairRole.ordinal() ? fastPairRole : PROVIDER;
    }
}
