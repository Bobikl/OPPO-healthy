package com.oplus.aiunit.vision;

import io.netty.util.internal.StringUtil;

/* JADX INFO: loaded from: classes19.dex */
public final class s5c {
    public final String a;

    public s5c(String str) {
        this.a = str;
    }

    public static s5c a(String str) {
        if (str != null && !str.isEmpty()) {
            return new s5c(str);
        }
        throw new IllegalArgumentException("messageId: " + str + " (expected: 0 ~ Integer.MAX_VALUE)");
    }

    public String b() {
        return this.a;
    }

    public String toString() {
        return StringUtil.simpleClassName(this) + "[messageId=" + this.a + ']';
    }
}
