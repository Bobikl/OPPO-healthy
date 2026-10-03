package com.heytap.theme.watch.domain.dto.request;

import io.protostuff.Tag;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class UpgradeParam {

    @Tag(1)
    private List<AppImpInfo> items;

    @Tag(2)
    private String token;

    public List<AppImpInfo> getItems() {
        return this.items;
    }

    public String getToken() {
        return this.token;
    }

    public void setItems(List<AppImpInfo> list) {
        this.items = list;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String toString() {
        return "UpgradeParam{items=" + this.items + ", token='" + this.token + "'}";
    }
}
