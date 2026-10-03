package com.heytap.theme.watch.domain.dto.response;

import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class TagDto implements Serializable {
    private static final long serialVersionUID = -8484001714719315743L;

    @Tag(1)
    private long id;

    @Tag(2)
    private String name;

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return "TagDto{id=" + this.id + ", name='" + this.name + "'}";
    }
}
