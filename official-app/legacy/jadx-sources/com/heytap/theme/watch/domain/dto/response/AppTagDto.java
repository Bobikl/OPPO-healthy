package com.heytap.theme.watch.domain.dto.response;

import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class AppTagDto implements Serializable {
    private static final long serialVersionUID = -7820181114764433383L;

    @Tag(2)
    private Integer cornerType;

    @Tag(3)
    private String name;

    @Tag(1)
    private Integer type;

    public Integer getCornerType() {
        return this.cornerType;
    }

    public String getName() {
        return this.name;
    }

    public Integer getType() {
        return this.type;
    }

    public void setCornerType(Integer num) {
        this.cornerType = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public String toString() {
        return "AppTagDto{type=" + this.type + ", cornerType=" + this.cornerType + ", name='" + this.name + "'}";
    }
}
