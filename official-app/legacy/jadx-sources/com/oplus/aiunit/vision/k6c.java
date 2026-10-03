package com.oplus.aiunit.vision;

import io.netty.util.internal.StringUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class k6c {
    public final List<String> a;

    public k6c(List<String> list) {
        this.a = Collections.unmodifiableList(list);
    }

    public List<String> a() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(StringUtil.simpleClassName(this));
        sb.append('[');
        for (int i = 0; i < this.a.size() - 1; i++) {
            sb.append("topicName = ");
            sb.append(this.a.get(i));
            sb.append(", ");
        }
        sb.append("topicName = ");
        List<String> list = this.a;
        sb.append(list.get(list.size() - 1));
        sb.append(']');
        return sb.toString();
    }
}
