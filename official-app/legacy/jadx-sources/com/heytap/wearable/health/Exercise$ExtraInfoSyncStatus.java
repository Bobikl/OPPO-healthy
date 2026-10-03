package com.heytap.wearable.health;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum Exercise$ExtraInfoSyncStatus implements Internal.EnumLite {
    IMPERFECT(0),
    COMPLETE(1),
    UNRECOGNIZED(-1);

    public static final int COMPLETE_VALUE = 1;
    public static final int IMPERFECT_VALUE = 0;
    private static final Internal.EnumLiteMap<Exercise$ExtraInfoSyncStatus> internalValueMap = new Internal.EnumLiteMap<Exercise$ExtraInfoSyncStatus>() { // from class: com.heytap.wearable.health.Exercise$ExtraInfoSyncStatus.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exercise$ExtraInfoSyncStatus findValueByNumber(int i) {
            return Exercise$ExtraInfoSyncStatus.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Exercise$ExtraInfoSyncStatus.forNumber(i) != null;
        }
    }

    Exercise$ExtraInfoSyncStatus(int i) {
        this.value = i;
    }

    public static Exercise$ExtraInfoSyncStatus forNumber(int i) {
        if (i == 0) {
            return IMPERFECT;
        }
        if (i != 1) {
            return null;
        }
        return COMPLETE;
    }

    public static Internal.EnumLiteMap<Exercise$ExtraInfoSyncStatus> internalGetValueMap() {
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
    public static Exercise$ExtraInfoSyncStatus valueOf(int i) {
        return forNumber(i);
    }
}
