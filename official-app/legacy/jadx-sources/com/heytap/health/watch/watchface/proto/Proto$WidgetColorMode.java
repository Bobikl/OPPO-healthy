package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum Proto$WidgetColorMode implements Internal.EnumLite {
    COLOR(0),
    CHANGE(1),
    UNRECOGNIZED(-1);

    public static final int CHANGE_VALUE = 1;
    public static final int COLOR_VALUE = 0;
    private static final Internal.EnumLiteMap<Proto$WidgetColorMode> internalValueMap = new Internal.EnumLiteMap<Proto$WidgetColorMode>() { // from class: com.heytap.health.watch.watchface.proto.Proto$WidgetColorMode.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Proto$WidgetColorMode findValueByNumber(int i) {
            return Proto$WidgetColorMode.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Proto$WidgetColorMode.forNumber(i) != null;
        }
    }

    Proto$WidgetColorMode(int i) {
        this.value = i;
    }

    public static Proto$WidgetColorMode forNumber(int i) {
        if (i == 0) {
            return COLOR;
        }
        if (i != 1) {
            return null;
        }
        return CHANGE;
    }

    public static Internal.EnumLiteMap<Proto$WidgetColorMode> internalGetValueMap() {
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
    public static Proto$WidgetColorMode valueOf(int i) {
        return forNumber(i);
    }
}
