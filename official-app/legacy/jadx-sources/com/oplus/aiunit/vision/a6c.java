package com.oplus.aiunit.vision;

import io.netty.util.internal.StringUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class a6c {
    public final List<h6c> a;

    public a6c(List<h6c> list) {
        this.a = Collections.unmodifiableList(list);
    }

    public List<h6c> a() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(StringUtil.simpleClassName(this));
        sb.append('[');
        for (int i = 0; i < this.a.size() - 1; i++) {
            sb.append(this.a.get(i));
            sb.append(", ");
        }
        List<h6c> list = this.a;
        sb.append(list.get(list.size() - 1));
        sb.append(']');
        return sb.toString();
    }
}
