package com.heytap.wearable.health;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum Exercise$DataSyncStatus implements Internal.EnumLite {
    DATA_SYNC_STATUS_IMPERFECT(0),
    DATA_SYNC_STATUS_COMPLETE(1),
    UNRECOGNIZED(-1);

    public static final int DATA_SYNC_STATUS_COMPLETE_VALUE = 1;
    public static final int DATA_SYNC_STATUS_IMPERFECT_VALUE = 0;
    private static final Internal.EnumLiteMap<Exercise$DataSyncStatus> internalValueMap = new Internal.EnumLiteMap<Exercise$DataSyncStatus>() { // from class: com.heytap.wearable.health.Exercise$DataSyncStatus.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exercise$DataSyncStatus findValueByNumber(int i) {
            return Exercise$DataSyncStatus.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Exercise$DataSyncStatus.forNumber(i) != null;
        }
    }

    Exercise$DataSyncStatus(int i) {
        this.value = i;
    }

    public static Exercise$DataSyncStatus forNumber(int i) {
        if (i == 0) {
            return DATA_SYNC_STATUS_IMPERFECT;
        }
        if (i != 1) {
            return null;
        }
        return DATA_SYNC_STATUS_COMPLETE;
    }

    public static Internal.EnumLiteMap<Exercise$DataSyncStatus> internalGetValueMap() {
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
    public static Exercise$DataSyncStatus valueOf(int i) {
        return forNumber(i);
    }
}
