package com.heytap.theme.watch.domain.dto.request;

import io.protostuff.Tag;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class ProductItemParam {

    @Tag(1)
    private List<AppImpInfo> infos;

    @Tag(2)
    private String token;

    @Tag(3)
    private int type;

    public List<AppImpInfo> getInfos() {
        return this.infos;
    }

    public String getToken() {
        return this.token;
    }

    public int getType() {
        return this.type;
    }

    public void setInfos(List<AppImpInfo> list) {
        this.infos = list;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "ProductItemParam{infos=" + this.infos + ", token='" + this.token + "', type=" + this.type + '}';
    }
}
