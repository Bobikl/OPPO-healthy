package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$SportStatListToDeviceOrBuilder extends MessageLiteOrBuilder {
    FitnessProtoV2$SportStatToDeviceItem getData(int i);

    int getDataCount();

    List<FitnessProtoV2$SportStatToDeviceItem> getDataList();
}
