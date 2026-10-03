package com.heytap.health.watch.notification.flashback;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum Status implements Internal.EnumLite {
    STATUS_ACTIVE(0),
    STATUS_HIDE(1),
    STATUS_DESTROY(2),
    UNRECOGNIZED(-1);

    public static final int STATUS_ACTIVE_VALUE = 0;
    public static final int STATUS_DESTROY_VALUE = 2;
    public static final int STATUS_HIDE_VALUE = 1;
    private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.heytap.health.watch.notification.flashback.Status.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Status findValueByNumber(int i) {
            return Status.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Status.forNumber(i) != null;
        }
    }

    Status(int i) {
        this.value = i;
    }

    public static Status forNumber(int i) {
        if (i == 0) {
            return STATUS_ACTIVE;
        }
        if (i == 1) {
            return STATUS_HIDE;
        }
        if (i != 2) {
            return null;
        }
        return STATUS_DESTROY;
    }

    public static Internal.EnumLiteMap<Status> internalGetValueMap() {
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
    public static Status valueOf(int i) {
        return forNumber(i);
    }
}
