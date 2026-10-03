package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum Proto$ScreenType implements Internal.EnumLite {
    SCREEN_TYPE_DEFAULT(0),
    SCREEN_TYPE_OVAL(1),
    SCREEN_TYPE_SQUARE(2),
    UNRECOGNIZED(-1);

    public static final int SCREEN_TYPE_DEFAULT_VALUE = 0;
    public static final int SCREEN_TYPE_OVAL_VALUE = 1;
    public static final int SCREEN_TYPE_SQUARE_VALUE = 2;
    private static final Internal.EnumLiteMap<Proto$ScreenType> internalValueMap = new Internal.EnumLiteMap<Proto$ScreenType>() { // from class: com.heytap.health.watch.watchface.proto.Proto$ScreenType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Proto$ScreenType findValueByNumber(int i) {
            return Proto$ScreenType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Proto$ScreenType.forNumber(i) != null;
        }
    }

    Proto$ScreenType(int i) {
        this.value = i;
    }

    public static Proto$ScreenType forNumber(int i) {
        if (i == 0) {
            return SCREEN_TYPE_DEFAULT;
        }
        if (i == 1) {
            return SCREEN_TYPE_OVAL;
        }
        if (i != 2) {
            return null;
        }
        return SCREEN_TYPE_SQUARE;
    }

    public static Internal.EnumLiteMap<Proto$ScreenType> internalGetValueMap() {
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
    public static Proto$ScreenType valueOf(int i) {
        return forNumber(i);
    }
}
