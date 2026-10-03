package com.heytap.wearable.music.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum StorageCapacityProto$StorageCapacityCmdId implements Internal.EnumLite {
    CMD_ID_STORAGE_CAPACITY_UNDEFINE(0),
    CMD_ID_STORAGE_CAPACITY(29),
    UNRECOGNIZED(-1);

    public static final int CMD_ID_STORAGE_CAPACITY_UNDEFINE_VALUE = 0;
    public static final int CMD_ID_STORAGE_CAPACITY_VALUE = 29;
    private static final Internal.EnumLiteMap<StorageCapacityProto$StorageCapacityCmdId> internalValueMap = new Internal.EnumLiteMap<StorageCapacityProto$StorageCapacityCmdId>() { // from class: com.heytap.wearable.music.proto.StorageCapacityProto$StorageCapacityCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StorageCapacityProto$StorageCapacityCmdId findValueByNumber(int i) {
            return StorageCapacityProto$StorageCapacityCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return StorageCapacityProto$StorageCapacityCmdId.forNumber(i) != null;
        }
    }

    StorageCapacityProto$StorageCapacityCmdId(int i) {
        this.value = i;
    }

    public static StorageCapacityProto$StorageCapacityCmdId forNumber(int i) {
        if (i == 0) {
            return CMD_ID_STORAGE_CAPACITY_UNDEFINE;
        }
        if (i != 29) {
            return null;
        }
        return CMD_ID_STORAGE_CAPACITY;
    }

    public static Internal.EnumLiteMap<StorageCapacityProto$StorageCapacityCmdId> internalGetValueMap() {
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
    public static StorageCapacityProto$StorageCapacityCmdId valueOf(int i) {
        return forNumber(i);
    }
}
