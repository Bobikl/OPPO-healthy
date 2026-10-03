package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$JoinProjectStateRequestOrBuilder extends MessageLiteOrBuilder {
    FitnessProto$JoinProjectItem getItems(int i);

    int getItemsCount();

    List<FitnessProto$JoinProjectItem> getItemsList();

    int getType();
}
