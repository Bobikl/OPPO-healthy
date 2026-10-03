package com.heytap.health.protocol.dm;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DMProto$ACCOUNT_FLAG implements Internal.EnumLite {
    FLAG_NORMAL(0),
    FLAG_CHILD(1),
    UNRECOGNIZED(-1);

    public static final int FLAG_CHILD_VALUE = 1;
    public static final int FLAG_NORMAL_VALUE = 0;
    private static final Internal.EnumLiteMap<DMProto$ACCOUNT_FLAG> internalValueMap = new Internal.EnumLiteMap<DMProto$ACCOUNT_FLAG>() { // from class: com.heytap.health.protocol.dm.DMProto$ACCOUNT_FLAG.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DMProto$ACCOUNT_FLAG findValueByNumber(int i) {
            return DMProto$ACCOUNT_FLAG.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DMProto$ACCOUNT_FLAG.forNumber(i) != null;
        }
    }

    DMProto$ACCOUNT_FLAG(int i) {
        this.value = i;
    }

    public static DMProto$ACCOUNT_FLAG forNumber(int i) {
        if (i == 0) {
            return FLAG_NORMAL;
        }
        if (i != 1) {
            return null;
        }
        return FLAG_CHILD;
    }

    public static Internal.EnumLiteMap<DMProto$ACCOUNT_FLAG> internalGetValueMap() {
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
    public static DMProto$ACCOUNT_FLAG valueOf(int i) {
        return forNumber(i);
    }
}
