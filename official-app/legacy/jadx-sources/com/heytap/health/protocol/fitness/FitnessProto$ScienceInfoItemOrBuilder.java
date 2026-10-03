package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$ScienceInfoItemOrBuilder extends MessageLiteOrBuilder {
    FitnessProto$ScienceInfoDetail getInfoDetailList(int i);

    int getInfoDetailListCount();

    List<FitnessProto$ScienceInfoDetail> getInfoDetailListList();

    int getInfoType();
}
