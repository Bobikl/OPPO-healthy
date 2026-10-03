package com.heytap.health.settings.watch.schoolmode.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes18.dex */
public enum SchoolModeProto$ServiceId implements Internal.EnumLite {
    SID_UNDEFINE(0),
    SID(37),
    UNRECOGNIZED(-1);

    public static final int SID_UNDEFINE_VALUE = 0;
    public static final int SID_VALUE = 37;
    private static final Internal.EnumLiteMap<SchoolModeProto$ServiceId> internalValueMap = new Internal.EnumLiteMap<SchoolModeProto$ServiceId>() { // from class: com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$ServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SchoolModeProto$ServiceId findValueByNumber(int i) {
            return SchoolModeProto$ServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return SchoolModeProto$ServiceId.forNumber(i) != null;
        }
    }

    SchoolModeProto$ServiceId(int i) {
        this.value = i;
    }

    public static SchoolModeProto$ServiceId forNumber(int i) {
        if (i == 0) {
            return SID_UNDEFINE;
        }
        if (i != 37) {
            return null;
        }
        return SID;
    }

    public static Internal.EnumLiteMap<SchoolModeProto$ServiceId> internalGetValueMap() {
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
    public static SchoolModeProto$ServiceId valueOf(int i) {
        return forNumber(i);
    }
}
