package com.heytap.push.codec.mqtt;

import io.netty.util.CharsetUtil;
import io.netty.util.internal.ObjectUtil;

/* JADX INFO: loaded from: classes19.dex */
public enum MqttVersion {
    MQTT_3_1_1("MQTT", (byte) 4),
    MQTT_3_1_2("MQTT_3_1_2", (byte) 5),
    MQTT_3_1_3("MQTT_3_1_3", (byte) 6);

    private final byte level;
    private final String name;

    MqttVersion(String str, byte b) {
        this.name = (String) ObjectUtil.checkNotNull(str, "protocolName");
        this.level = b;
    }

    public static MqttVersion fromProtocolNameAndLevel(String str, byte b) {
        for (MqttVersion mqttVersion : values()) {
            if (mqttVersion.name.equals(str)) {
                if (mqttVersion.level == b) {
                    return mqttVersion;
                }
                throw new MqttUnacceptableProtocolVersionException(str + " and " + ((int) b) + " are not match");
            }
        }
        throw new MqttUnacceptableProtocolVersionException(str + "is unknown protocol name");
    }

    public byte protocolLevel() {
        return this.level;
    }

    public String protocolName() {
        return this.name;
    }

    public byte[] protocolNameBytes() {
        return this.name.getBytes(CharsetUtil.UTF_8);
    }
}
