package com.heytap.wearable.music.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum StorageCapacityProto$StorageCapacityServiceId implements Internal.EnumLite {
    SERVICE_ID_STORAGE_CAPACITY_UNDEFINE(0),
    SERVICE_ID_STORAGE_CAPACITY(1),
    UNRECOGNIZED(-1);

    public static final int SERVICE_ID_STORAGE_CAPACITY_UNDEFINE_VALUE = 0;
    public static final int SERVICE_ID_STORAGE_CAPACITY_VALUE = 1;
    private static final Internal.EnumLiteMap<StorageCapacityProto$StorageCapacityServiceId> internalValueMap = new Internal.EnumLiteMap<StorageCapacityProto$StorageCapacityServiceId>() { // from class: com.heytap.wearable.music.proto.StorageCapacityProto$StorageCapacityServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StorageCapacityProto$StorageCapacityServiceId findValueByNumber(int i) {
            return StorageCapacityProto$StorageCapacityServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return StorageCapacityProto$StorageCapacityServiceId.forNumber(i) != null;
        }
    }

    StorageCapacityProto$StorageCapacityServiceId(int i) {
        this.value = i;
    }

    public static StorageCapacityProto$StorageCapacityServiceId forNumber(int i) {
        if (i == 0) {
            return SERVICE_ID_STORAGE_CAPACITY_UNDEFINE;
        }
        if (i != 1) {
            return null;
        }
        return SERVICE_ID_STORAGE_CAPACITY;
    }

    public static Internal.EnumLiteMap<StorageCapacityProto$StorageCapacityServiceId> internalGetValueMap() {
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
    public static StorageCapacityProto$StorageCapacityServiceId valueOf(int i) {
        return forNumber(i);
    }
}
