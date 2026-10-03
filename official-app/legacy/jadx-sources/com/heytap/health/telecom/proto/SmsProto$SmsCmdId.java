package com.heytap.health.telecom.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes18.dex */
public enum SmsProto$SmsCmdId implements Internal.EnumLite {
    CMD_ID_SMS_UNDEFINE(0),
    CMD_ID_SMS_CONTROL_PHONE_SEND_SMS(3),
    UNRECOGNIZED(-1);

    public static final int CMD_ID_SMS_CONTROL_PHONE_SEND_SMS_VALUE = 3;
    public static final int CMD_ID_SMS_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<SmsProto$SmsCmdId> internalValueMap = new Internal.EnumLiteMap<SmsProto$SmsCmdId>() { // from class: com.heytap.health.telecom.proto.SmsProto$SmsCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SmsProto$SmsCmdId findValueByNumber(int i) {
            return SmsProto$SmsCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return SmsProto$SmsCmdId.forNumber(i) != null;
        }
    }

    SmsProto$SmsCmdId(int i) {
        this.value = i;
    }

    public static SmsProto$SmsCmdId forNumber(int i) {
        if (i == 0) {
            return CMD_ID_SMS_UNDEFINE;
        }
        if (i != 3) {
            return null;
        }
        return CMD_ID_SMS_CONTROL_PHONE_SEND_SMS;
    }

    public static Internal.EnumLiteMap<SmsProto$SmsCmdId> internalGetValueMap() {
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
    public static SmsProto$SmsCmdId valueOf(int i) {
        return forNumber(i);
    }
}
