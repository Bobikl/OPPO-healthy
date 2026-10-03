package com.heytap.health.protocol.foodplan;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FoodPlanProto$FoodPlanDetailOrBuilder extends MessageLiteOrBuilder {
    FoodPlanProto$FoodDetail getFoodDetail(int i);

    int getFoodDetailCount();

    List<FoodPlanProto$FoodDetail> getFoodDetailList();

    int getFoodType();

    String getPlanDate();

    ByteString getPlanDateBytes();

    int getTargetCalorie();
}
