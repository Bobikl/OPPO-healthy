package com.heytap.health.protocol.defatcalorie;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DefatCalorieProto$DefatCalorieServiceId implements Internal.EnumLite {
    DEFAT_CALORIE_SERVICE_PLACE_HOLDER(0),
    SID_WATCH_AND_APP(4),
    UNRECOGNIZED(-1);

    public static final int DEFAT_CALORIE_SERVICE_PLACE_HOLDER_VALUE = 0;
    public static final int SID_WATCH_AND_APP_VALUE = 4;
    private static final Internal.EnumLiteMap<DefatCalorieProto$DefatCalorieServiceId> internalValueMap = new Internal.EnumLiteMap<DefatCalorieProto$DefatCalorieServiceId>() { // from class: com.heytap.health.protocol.defatcalorie.DefatCalorieProto$DefatCalorieServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DefatCalorieProto$DefatCalorieServiceId findValueByNumber(int i) {
            return DefatCalorieProto$DefatCalorieServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DefatCalorieProto$DefatCalorieServiceId.forNumber(i) != null;
        }
    }

    DefatCalorieProto$DefatCalorieServiceId(int i) {
        this.value = i;
    }

    public static DefatCalorieProto$DefatCalorieServiceId forNumber(int i) {
        if (i == 0) {
            return DEFAT_CALORIE_SERVICE_PLACE_HOLDER;
        }
        if (i != 4) {
            return null;
        }
        return SID_WATCH_AND_APP;
    }

    public static Internal.EnumLiteMap<DefatCalorieProto$DefatCalorieServiceId> internalGetValueMap() {
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
    public static DefatCalorieProto$DefatCalorieServiceId valueOf(int i) {
        return forNumber(i);
    }
}
