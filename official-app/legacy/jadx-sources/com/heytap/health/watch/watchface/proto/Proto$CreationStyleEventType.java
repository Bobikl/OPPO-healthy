package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum Proto$CreationStyleEventType implements Internal.EnumLite {
    EVENT_TYPE_DEFAULT(0),
    EVENT_TYPE_DELETE(1),
    EVENT_TYPE_SYNC(2),
    UNRECOGNIZED(-1);

    public static final int EVENT_TYPE_DEFAULT_VALUE = 0;
    public static final int EVENT_TYPE_DELETE_VALUE = 1;
    public static final int EVENT_TYPE_SYNC_VALUE = 2;
    private static final Internal.EnumLiteMap<Proto$CreationStyleEventType> internalValueMap = new Internal.EnumLiteMap<Proto$CreationStyleEventType>() { // from class: com.heytap.health.watch.watchface.proto.Proto$CreationStyleEventType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Proto$CreationStyleEventType findValueByNumber(int i) {
            return Proto$CreationStyleEventType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Proto$CreationStyleEventType.forNumber(i) != null;
        }
    }

    Proto$CreationStyleEventType(int i) {
        this.value = i;
    }

    public static Proto$CreationStyleEventType forNumber(int i) {
        if (i == 0) {
            return EVENT_TYPE_DEFAULT;
        }
        if (i == 1) {
            return EVENT_TYPE_DELETE;
        }
        if (i != 2) {
            return null;
        }
        return EVENT_TYPE_SYNC;
    }

    public static Internal.EnumLiteMap<Proto$CreationStyleEventType> internalGetValueMap() {
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
    public static Proto$CreationStyleEventType valueOf(int i) {
        return forNumber(i);
    }
}
