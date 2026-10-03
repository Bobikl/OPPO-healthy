package com.oplus.aiunit.vision;

import com.heytap.push.codec.mqtt.MqttMessageType;
import com.heytap.push.codec.mqtt.MqttQoS;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.StringUtil;

/* JADX INFO: loaded from: classes19.dex */
public final class p5c {
    public final MqttMessageType a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MqttQoS f15203c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15204e;

    public p5c(MqttMessageType mqttMessageType, boolean z, MqttQoS mqttQoS, boolean z2, int i) {
        this.a = (MqttMessageType) ObjectUtil.checkNotNull(mqttMessageType, "messageType");
        this.b = z;
        this.f15203c = (MqttQoS) ObjectUtil.checkNotNull(mqttQoS, "qosLevel");
        this.d = z2;
        this.f15204e = i;
    }

    public boolean a() {
        return this.b;
    }

    public boolean b() {
        return this.d;
    }

    public MqttMessageType c() {
        return this.a;
    }

    public MqttQoS d() {
        return this.f15203c;
    }

    public int e() {
        return this.f15204e;
    }

    public String toString() {
        return StringUtil.simpleClassName(this) + "[messageType=" + this.a + ", isDup=" + this.b + ", qosLevel=" + this.f15203c + ", isRetain=" + this.d + ", remainingLength=" + this.f15204e + ']';
    }
}
