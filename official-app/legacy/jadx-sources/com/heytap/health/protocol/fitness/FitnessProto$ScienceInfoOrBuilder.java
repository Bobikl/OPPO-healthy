package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$ScienceInfoOrBuilder extends MessageLiteOrBuilder {
    FitnessProto$ScienceInfoItem getScienceInfoList(int i);

    int getScienceInfoListCount();

    List<FitnessProto$ScienceInfoItem> getScienceInfoListList();
}
