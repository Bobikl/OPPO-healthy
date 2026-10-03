package com.heytap.health.protocol.foodplan;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum FoodPlanProto$FoodPlanServiceId implements Internal.EnumLite {
    FOOD_PLAN_SERVICE_PLACE_HOLDER(0),
    SID_FOOD_PLAN(4),
    UNRECOGNIZED(-1);

    public static final int FOOD_PLAN_SERVICE_PLACE_HOLDER_VALUE = 0;
    public static final int SID_FOOD_PLAN_VALUE = 4;
    private static final Internal.EnumLiteMap<FoodPlanProto$FoodPlanServiceId> internalValueMap = new Internal.EnumLiteMap<FoodPlanProto$FoodPlanServiceId>() { // from class: com.heytap.health.protocol.foodplan.FoodPlanProto$FoodPlanServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FoodPlanProto$FoodPlanServiceId findValueByNumber(int i) {
            return FoodPlanProto$FoodPlanServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FoodPlanProto$FoodPlanServiceId.forNumber(i) != null;
        }
    }

    FoodPlanProto$FoodPlanServiceId(int i) {
        this.value = i;
    }

    public static FoodPlanProto$FoodPlanServiceId forNumber(int i) {
        if (i == 0) {
            return FOOD_PLAN_SERVICE_PLACE_HOLDER;
        }
        if (i != 4) {
            return null;
        }
        return SID_FOOD_PLAN;
    }

    public static Internal.EnumLiteMap<FoodPlanProto$FoodPlanServiceId> internalGetValueMap() {
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
    public static FoodPlanProto$FoodPlanServiceId valueOf(int i) {
        return forNumber(i);
    }
}
