package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$HrvDataOrBuilder extends MessageLiteOrBuilder {
    int getIndex();

    int getStartTime();

    int getState(int i);

    int getStateCount();

    List<Integer> getStateList();
}
