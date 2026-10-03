package com.heytap.health.protocol.foodplan;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum FoodPlanProto$FoodPlanCmdId implements Internal.EnumLite {
    FOOD_PLAN_COMMAND_PLACE_HOLDER(0),
    CID_FOOD_PLAN(31),
    UNRECOGNIZED(-1);

    public static final int CID_FOOD_PLAN_VALUE = 31;
    public static final int FOOD_PLAN_COMMAND_PLACE_HOLDER_VALUE = 0;
    private static final Internal.EnumLiteMap<FoodPlanProto$FoodPlanCmdId> internalValueMap = new Internal.EnumLiteMap<FoodPlanProto$FoodPlanCmdId>() { // from class: com.heytap.health.protocol.foodplan.FoodPlanProto$FoodPlanCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FoodPlanProto$FoodPlanCmdId findValueByNumber(int i) {
            return FoodPlanProto$FoodPlanCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FoodPlanProto$FoodPlanCmdId.forNumber(i) != null;
        }
    }

    FoodPlanProto$FoodPlanCmdId(int i) {
        this.value = i;
    }

    public static FoodPlanProto$FoodPlanCmdId forNumber(int i) {
        if (i == 0) {
            return FOOD_PLAN_COMMAND_PLACE_HOLDER;
        }
        if (i != 31) {
            return null;
        }
        return CID_FOOD_PLAN;
    }

    public static Internal.EnumLiteMap<FoodPlanProto$FoodPlanCmdId> internalGetValueMap() {
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
    public static FoodPlanProto$FoodPlanCmdId valueOf(int i) {
        return forNumber(i);
    }
}
