package com.heytap.nearx.uikit.resposiveui.config;

/* JADX INFO: loaded from: classes18.dex */
public enum NearUIConfig$Status {
    FOLD("fd"),
    UNFOLDING("fding"),
    UNFOLD("ufd"),
    UNKNOWN("unknown");

    private String mName;

    NearUIConfig$Status(String str) {
        this.mName = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mName;
    }
}
