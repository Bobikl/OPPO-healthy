package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public enum HashType implements Internal.EnumLite {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);

    public static final int SHA1_VALUE = 1;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final Internal.EnumLiteMap<HashType> internalValueMap = new Internal.EnumLiteMap<HashType>() { // from class: com.google.crypto.tink.proto.HashType.1
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public HashType findValueByNumber(int i) {
            return HashType.forNumber(i);
        }
    };
    private final int value;

    public static final class HashTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new HashTypeVerifier();

        private HashTypeVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return HashType.forNumber(i) != null;
        }
    }

    HashType(int i) {
        this.value = i;
    }

    public static HashType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i != 4) {
            return null;
        }
        return SHA512;
    }

    public static Internal.EnumLiteMap<HashType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return HashTypeVerifier.INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static HashType valueOf(int i) {
        return forNumber(i);
    }
}
