package com.heytap.wearable.oaf.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum WatchMode$PhoneModeMask implements Internal.EnumLite {
    HIGH_PERFORMANCE_MODE(0),
    MIX_MODE(1),
    RX_MODE(2),
    UNRECOGNIZED(-1);

    public static final int HIGH_PERFORMANCE_MODE_VALUE = 0;
    public static final int MIX_MODE_VALUE = 1;
    public static final int RX_MODE_VALUE = 2;
    private static final Internal.EnumLiteMap<WatchMode$PhoneModeMask> internalValueMap = new Internal.EnumLiteMap<WatchMode$PhoneModeMask>() { // from class: com.heytap.wearable.oaf.proto.WatchMode$PhoneModeMask.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WatchMode$PhoneModeMask findValueByNumber(int i) {
            return WatchMode$PhoneModeMask.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WatchMode$PhoneModeMask.forNumber(i) != null;
        }
    }

    WatchMode$PhoneModeMask(int i) {
        this.value = i;
    }

    public static WatchMode$PhoneModeMask forNumber(int i) {
        if (i == 0) {
            return HIGH_PERFORMANCE_MODE;
        }
        if (i == 1) {
            return MIX_MODE;
        }
        if (i != 2) {
            return null;
        }
        return RX_MODE;
    }

    public static Internal.EnumLiteMap<WatchMode$PhoneModeMask> internalGetValueMap() {
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
    public static WatchMode$PhoneModeMask valueOf(int i) {
        return forNumber(i);
    }
}
