package com.heytap.accessory.stream.model;

/* JADX INFO: loaded from: classes14.dex */
public enum c {
    RESULT_SUCCESS,
    RESULT_FAILURE;

    public static c a(int i) {
        if (i == 0) {
            return RESULT_SUCCESS;
        }
        if (i == 1) {
            return RESULT_FAILURE;
        }
        throw new IllegalArgumentException("Invalid Result Status Parameter");
    }
}
