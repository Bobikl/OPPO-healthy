package com.heytap.theme.watch.domain.dto.response;

import io.protostuff.Tag;

/* JADX INFO: loaded from: classes17.dex */
public class ThemewVideoDto {

    @Tag(1)
    private String pic;

    @Tag(2)
    private String url;

    public String getPic() {
        return this.pic;
    }

    public String getUrl() {
        return this.url;
    }

    public void setPic(String str) {
        this.pic = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "ThemewVideoDto{pic='" + this.pic + "', url='" + this.url + "'}";
    }
}
