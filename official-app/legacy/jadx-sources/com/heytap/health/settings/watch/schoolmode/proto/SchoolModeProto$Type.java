package com.heytap.health.settings.watch.schoolmode.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes18.dex */
public enum SchoolModeProto$Type implements Internal.EnumLite {
    TYPE_QUERY(0),
    TYPE_SET(1),
    TYPE_REPLY(2),
    UNRECOGNIZED(-1);

    public static final int TYPE_QUERY_VALUE = 0;
    public static final int TYPE_REPLY_VALUE = 2;
    public static final int TYPE_SET_VALUE = 1;
    private static final Internal.EnumLiteMap<SchoolModeProto$Type> internalValueMap = new Internal.EnumLiteMap<SchoolModeProto$Type>() { // from class: com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$Type.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SchoolModeProto$Type findValueByNumber(int i) {
            return SchoolModeProto$Type.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return SchoolModeProto$Type.forNumber(i) != null;
        }
    }

    SchoolModeProto$Type(int i) {
        this.value = i;
    }

    public static SchoolModeProto$Type forNumber(int i) {
        if (i == 0) {
            return TYPE_QUERY;
        }
        if (i == 1) {
            return TYPE_SET;
        }
        if (i != 2) {
            return null;
        }
        return TYPE_REPLY;
    }

    public static Internal.EnumLiteMap<SchoolModeProto$Type> internalGetValueMap() {
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
    public static SchoolModeProto$Type valueOf(int i) {
        return forNumber(i);
    }
}
