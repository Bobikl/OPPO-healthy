package com.heytap.sportwatch.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface RecommendProto$blood_pressure_dataOrBuilder extends MessageLiteOrBuilder {
    int getData(int i);

    int getDataCount();

    List<Integer> getDataList();

    RecommendProto$int_pair getStatusRange(int i);

    int getStatusRangeCount();

    List<RecommendProto$int_pair> getStatusRangeList();
}
