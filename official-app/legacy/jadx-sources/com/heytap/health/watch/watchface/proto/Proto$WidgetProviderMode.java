package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum Proto$WidgetProviderMode implements Internal.EnumLite {
    WIDGET_SMALL(0),
    WIDGET_MEDIUM(1),
    WIDGET_LARGE(2),
    WIDGET_ARC_TOP(8),
    WIDGET_ARC_BOTTOM(11),
    WIDGET_ARC_LEFT_TOP(7),
    WIDGET_ARC_LEFT_BOTTOM(10),
    WIDGET_ARC_RIGHT_TOP(9),
    WIDGET_ARC_RIGHT_BOTTOM(12),
    WIDGET_TEXT_LEFT(4),
    WIDGET_TEXT_CENTER(5),
    WIDGET_TEXT_RIGHT(6),
    UNRECOGNIZED(-1);

    public static final int WIDGET_ARC_BOTTOM_VALUE = 11;
    public static final int WIDGET_ARC_LEFT_BOTTOM_VALUE = 10;
    public static final int WIDGET_ARC_LEFT_TOP_VALUE = 7;
    public static final int WIDGET_ARC_RIGHT_BOTTOM_VALUE = 12;
    public static final int WIDGET_ARC_RIGHT_TOP_VALUE = 9;
    public static final int WIDGET_ARC_TOP_VALUE = 8;
    public static final int WIDGET_LARGE_VALUE = 2;
    public static final int WIDGET_MEDIUM_VALUE = 1;
    public static final int WIDGET_SMALL_VALUE = 0;
    public static final int WIDGET_TEXT_CENTER_VALUE = 5;
    public static final int WIDGET_TEXT_LEFT_VALUE = 4;
    public static final int WIDGET_TEXT_RIGHT_VALUE = 6;
    private static final Internal.EnumLiteMap<Proto$WidgetProviderMode> internalValueMap = new Internal.EnumLiteMap<Proto$WidgetProviderMode>() { // from class: com.heytap.health.watch.watchface.proto.Proto$WidgetProviderMode.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Proto$WidgetProviderMode findValueByNumber(int i) {
            return Proto$WidgetProviderMode.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Proto$WidgetProviderMode.forNumber(i) != null;
        }
    }

    Proto$WidgetProviderMode(int i) {
        this.value = i;
    }

    public static Proto$WidgetProviderMode forNumber(int i) {
        switch (i) {
            case 0:
                return WIDGET_SMALL;
            case 1:
                return WIDGET_MEDIUM;
            case 2:
                return WIDGET_LARGE;
            case 3:
            default:
                return null;
            case 4:
                return WIDGET_TEXT_LEFT;
            case 5:
                return WIDGET_TEXT_CENTER;
            case 6:
                return WIDGET_TEXT_RIGHT;
            case 7:
                return WIDGET_ARC_LEFT_TOP;
            case 8:
                return WIDGET_ARC_TOP;
            case 9:
                return WIDGET_ARC_RIGHT_TOP;
            case 10:
                return WIDGET_ARC_LEFT_BOTTOM;
            case 11:
                return WIDGET_ARC_BOTTOM;
            case 12:
                return WIDGET_ARC_RIGHT_BOTTOM;
        }
    }

    public static Internal.EnumLiteMap<Proto$WidgetProviderMode> internalGetValueMap() {
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
    public static Proto$WidgetProviderMode valueOf(int i) {
        return forNumber(i);
    }
}
