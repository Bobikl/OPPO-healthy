package com.oplus.aiunit.vision;

import com.heytap.push.codec.mqtt.MqttConnectReturnCode;
import io.netty.util.internal.StringUtil;

/* JADX INFO: loaded from: classes19.dex */
public final class k5c {
    public final MqttConnectReturnCode a;
    public final boolean b;

    public k5c(MqttConnectReturnCode mqttConnectReturnCode, boolean z) {
        this.a = mqttConnectReturnCode;
        this.b = z;
    }

    public MqttConnectReturnCode a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public String toString() {
        return StringUtil.simpleClassName(this) + "[connectReturnCode=" + this.a + ", sessionPresent=" + this.b + ']';
    }
}
