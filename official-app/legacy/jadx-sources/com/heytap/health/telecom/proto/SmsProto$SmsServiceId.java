package com.heytap.health.telecom.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes18.dex */
public enum SmsProto$SmsServiceId implements Internal.EnumLite {
    SERVICE_ID_SMS_UNDEFINE(0),
    SERVICE_ID_SMS_EXTEND(7),
    UNRECOGNIZED(-1);

    public static final int SERVICE_ID_SMS_EXTEND_VALUE = 7;
    public static final int SERVICE_ID_SMS_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<SmsProto$SmsServiceId> internalValueMap = new Internal.EnumLiteMap<SmsProto$SmsServiceId>() { // from class: com.heytap.health.telecom.proto.SmsProto$SmsServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SmsProto$SmsServiceId findValueByNumber(int i) {
            return SmsProto$SmsServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return SmsProto$SmsServiceId.forNumber(i) != null;
        }
    }

    SmsProto$SmsServiceId(int i) {
        this.value = i;
    }

    public static SmsProto$SmsServiceId forNumber(int i) {
        if (i == 0) {
            return SERVICE_ID_SMS_UNDEFINE;
        }
        if (i != 7) {
            return null;
        }
        return SERVICE_ID_SMS_EXTEND;
    }

    public static Internal.EnumLiteMap<SmsProto$SmsServiceId> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static SmsProto$SmsServiceId valueOf(int i) {
        return forNumber(i);
    }
}
