package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public final class w5c {
    public final short a;
    public final short b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18128c;

    public w5c(short s, short s2, String str) {
        this.a = s;
        this.b = s2;
        this.f18128c = str;
    }

    public short a() {
        return this.a;
    }

    public String b() {
        return this.f18128c;
    }

    public short c() {
        return this.b;
    }

    public String toString() {
        return "MqttPublishVariableHeader{channelId=" + ((int) this.a) + ", messageId=" + this.f18128c + ", messageType=" + ((int) this.b) + '}';
    }
}
