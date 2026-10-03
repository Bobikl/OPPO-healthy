package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public final class u5c {
    public final short a;
    public final String b;

    public u5c(short s, String str) {
        if (str != null && !str.isEmpty()) {
            this.a = s;
            this.b = str;
        } else {
            throw new IllegalArgumentException("messageId: " + str + " (expected: 0 ~ Integer.MAX_VALUE)");
        }
    }

    public short a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String toString() {
        return "MqttPubAckVariableHeader{channelId=" + ((int) this.a) + ", messageId=" + this.b + '}';
    }
}
