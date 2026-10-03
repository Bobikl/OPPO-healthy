package com.oplus.aiunit.vision;

import com.heytap.push.codec.mqtt.MqttQoS;
import io.netty.util.internal.StringUtil;

/* JADX INFO: loaded from: classes19.dex */
public final class h6c {
    public final String a;
    public final MqttQoS b;

    public h6c(String str, MqttQoS mqttQoS) {
        this.a = str;
        this.b = mqttQoS;
    }

    public MqttQoS a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public String toString() {
        return StringUtil.simpleClassName(this) + "[topicFilter=" + this.a + ", qualityOfService=" + this.b + ']';
    }
}
