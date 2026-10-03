package com.heytap.theme.watch.domain.dto.request;

import io.protostuff.Tag;

/* JADX INFO: loaded from: classes17.dex */
public class PageBaseParam {

    @Tag(3)
    private int offset;

    @Tag(2)
    private int size;

    @Tag(1)
    private int start;

    @Tag(4)
    private String token;

    public int getOffset() {
        return this.offset;
    }

    public int getSize() {
        return this.size;
    }

    public int getStart() {
        return this.start;
    }

    public String getToken() {
        return this.token;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public void setStart(int i) {
        this.start = i;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String toString() {
        return "PageBaseParam{start=" + this.start + ", size=" + this.size + ", offset=" + this.offset + ", token='" + this.token + "'}";
    }
}
