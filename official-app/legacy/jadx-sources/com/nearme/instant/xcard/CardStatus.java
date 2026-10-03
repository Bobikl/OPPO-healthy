package com.nearme.instant.xcard;

/* JADX INFO: loaded from: classes5.dex */
public class CardStatus {
    public static final int STATUS_AVAILABLE = 1;
    public static final int STATUS_INCOMPATIBLE = 3;
    public static final int STATUS_NOT_FOUND = -1;
    public static final int STATUS_UNKNOWN = 0;
    public static final int STATUS_UPDATE = 2;
    private int status;
    private String uri;

    public int getStatus() {
        return this.status;
    }

    public String getUri() {
        return this.uri;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setUri(String str) {
        this.uri = str;
    }
}
