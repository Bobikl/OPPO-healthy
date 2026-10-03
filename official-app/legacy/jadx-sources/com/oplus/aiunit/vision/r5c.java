package com.oplus.aiunit.vision;

import com.heytap.push.codec.mqtt.MqttMessageType;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderResult;

/* JADX INFO: loaded from: classes19.dex */
public final class r5c {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MqttMessageType.values().length];
            a = iArr;
            try {
                iArr[MqttMessageType.CONNECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MqttMessageType.CONNACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[MqttMessageType.SUBSCRIBE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[MqttMessageType.SUBACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[MqttMessageType.UNSUBACK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[MqttMessageType.UNSUBSCRIBE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[MqttMessageType.PUBLISH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[MqttMessageType.PUBACK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[MqttMessageType.PUBREC.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[MqttMessageType.PUBREL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[MqttMessageType.PUBCOMP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[MqttMessageType.PINGREQ.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[MqttMessageType.PINGRESP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[MqttMessageType.DISCONNECT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public static q5c a(Throwable th) {
        return new q5c(null, null, null, DecoderResult.failure(th));
    }

    public static q5c b(p5c p5cVar, Object obj, Object obj2) {
        switch (a.a[p5cVar.c().ordinal()]) {
            case 1:
                return new l5c(p5cVar, (n5c) obj, (m5c) obj2);
            case 2:
                return new j5c(p5cVar, (k5c) obj);
            case 3:
                return new z5c(p5cVar, (s5c) obj, (a6c) obj2);
            case 4:
                return new x5c(p5cVar, (s5c) obj, (y5c) obj2);
            case 5:
                return new i6c(p5cVar, (s5c) obj);
            case 6:
                return new j6c(p5cVar, (s5c) obj, (k6c) obj2);
            case 7:
                return new v5c(p5cVar, (w5c) obj, (ByteBuf) obj2);
            case 8:
                return new t5c(p5cVar, (u5c) obj);
            case 9:
            case 10:
            case 11:
                return new q5c(p5cVar, obj);
            case 12:
            case 13:
            case 14:
                return new q5c(p5cVar);
            default:
                throw new IllegalArgumentException("unknown message type: " + p5cVar.c());
        }
    }
}
