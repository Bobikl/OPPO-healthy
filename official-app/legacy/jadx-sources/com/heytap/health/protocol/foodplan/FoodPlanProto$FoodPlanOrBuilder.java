package com.heytap.health.protocol.foodplan;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FoodPlanProto$FoodPlanOrBuilder extends MessageLiteOrBuilder {
    FoodPlanProto$FoodPlanDetail getFoodPlanDetail(int i);

    int getFoodPlanDetailCount();

    List<FoodPlanProto$FoodPlanDetail> getFoodPlanDetailList();
}
