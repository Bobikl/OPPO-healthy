package com.heytap.health.protocol.foodplan;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FoodPlanProto$FoodDetailOrBuilder extends MessageLiteOrBuilder {
    int getCalorie();

    String getName();

    ByteString getNameBytes();

    int getQuantity();

    String getUnit();

    ByteString getUnitBytes();
}
