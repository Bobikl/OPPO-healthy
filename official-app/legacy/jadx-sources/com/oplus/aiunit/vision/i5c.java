package com.oplus.aiunit.vision;

import com.heytap.push.codec.mqtt.MqttMessageType;
import com.heytap.push.codec.mqtt.MqttQoS;
import com.heytap.push.codec.mqtt.MqttVersion;
import io.netty.handler.codec.DecoderException;

/* JADX INFO: loaded from: classes19.dex */
public final class i5c {
    public static final char[] a = {'#', '+'};

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MqttMessageType.values().length];
            a = iArr;
            try {
                iArr[MqttMessageType.PUBREL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MqttMessageType.SUBSCRIBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[MqttMessageType.UNSUBSCRIBE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[MqttMessageType.CONNECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[MqttMessageType.CONNACK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[MqttMessageType.PUBACK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[MqttMessageType.PUBREC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[MqttMessageType.PUBCOMP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[MqttMessageType.SUBACK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[MqttMessageType.UNSUBACK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[MqttMessageType.PINGREQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[MqttMessageType.PINGRESP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[MqttMessageType.DISCONNECT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public static boolean a(MqttVersion mqttVersion, String str) {
        if (mqttVersion == MqttVersion.MQTT_3_1_1 || mqttVersion == MqttVersion.MQTT_3_1_2 || mqttVersion == MqttVersion.MQTT_3_1_3) {
            return str != null;
        }
        throw new IllegalArgumentException(mqttVersion + " is unknown mqtt version");
    }

    public static boolean b(String str) {
        if (str != null && !str.isEmpty()) {
            return !str.trim().isEmpty();
        }
        throw new IllegalArgumentException("messageId: " + str + " (expected: 0 ~ Integer.MAX_VALUE)");
    }

    public static p5c c(p5c p5cVar) {
        switch (a.a[p5cVar.c().ordinal()]) {
            case 1:
            case 2:
            case 3:
                return p5cVar.b() ? new p5c(p5cVar.c(), p5cVar.a(), p5cVar.d(), false, p5cVar.e()) : p5cVar;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return (p5cVar.a() || p5cVar.d() != MqttQoS.AT_MOST_ONCE || p5cVar.b()) ? new p5c(p5cVar.c(), false, MqttQoS.AT_MOST_ONCE, false, p5cVar.e()) : p5cVar;
            default:
                return p5cVar;
        }
    }

    public static p5c d(p5c p5cVar) {
        int i = a.a[p5cVar.c().ordinal()];
        if ((i != 1 && i != 2 && i != 3) || p5cVar.d() == MqttQoS.AT_LEAST_ONCE) {
            return p5cVar;
        }
        throw new DecoderException(p5cVar.c().name() + " message must have QoS 1");
    }
}
