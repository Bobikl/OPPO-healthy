package com.heytap.theme.watch.domain.dto.request;

import io.protostuff.Tag;

/* JADX INFO: loaded from: classes17.dex */
public class PageListParam extends PageBaseParam {

    @Tag(101)
    private int id;

    @Tag(103)
    private int style;

    @Tag(102)
    private int type;

    public int getId() {
        return this.id;
    }

    public int getStyle() {
        return this.style;
    }

    public int getType() {
        return this.type;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setStyle(int i) {
        this.style = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    @Override // com.heytap.theme.watch.domain.dto.request.PageBaseParam
    public String toString() {
        return "PageListParam{" + super.toString() + "id=" + this.id + ", type=" + this.type + ", style=" + this.style + '}';
    }
}
