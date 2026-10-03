package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$TumbleDataOrBuilder extends MessageLiteOrBuilder {
    FitnessProto$TumbleItem getData(int i);

    int getDataCount();

    List<FitnessProto$TumbleItem> getDataList();

    int getIndex();

    int getStartTime();
}
