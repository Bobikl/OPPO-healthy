package com.heytap.health.protocol.defatcalorie;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DefatCalorieProto$DefatCalorieCmdId implements Internal.EnumLite {
    DEFAT_CALORIE_COMMAND_PLACE_HOLDER(0),
    CID_WATCH_AND_APP(30),
    CID_NEXT_WEEK_CALORIE(35),
    UNRECOGNIZED(-1);

    public static final int CID_NEXT_WEEK_CALORIE_VALUE = 35;
    public static final int CID_WATCH_AND_APP_VALUE = 30;
    public static final int DEFAT_CALORIE_COMMAND_PLACE_HOLDER_VALUE = 0;
    private static final Internal.EnumLiteMap<DefatCalorieProto$DefatCalorieCmdId> internalValueMap = new Internal.EnumLiteMap<DefatCalorieProto$DefatCalorieCmdId>() { // from class: com.heytap.health.protocol.defatcalorie.DefatCalorieProto$DefatCalorieCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DefatCalorieProto$DefatCalorieCmdId findValueByNumber(int i) {
            return DefatCalorieProto$DefatCalorieCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DefatCalorieProto$DefatCalorieCmdId.forNumber(i) != null;
        }
    }

    DefatCalorieProto$DefatCalorieCmdId(int i) {
        this.value = i;
    }

    public static DefatCalorieProto$DefatCalorieCmdId forNumber(int i) {
        if (i == 0) {
            return DEFAT_CALORIE_COMMAND_PLACE_HOLDER;
        }
        if (i == 30) {
            return CID_WATCH_AND_APP;
        }
        if (i != 35) {
            return null;
        }
        return CID_NEXT_WEEK_CALORIE;
    }

    public static Internal.EnumLiteMap<DefatCalorieProto$DefatCalorieCmdId> internalGetValueMap() {
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
    public static DefatCalorieProto$DefatCalorieCmdId valueOf(int i) {
        return forNumber(i);
    }
}
