package com.heytap.sportwatch.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface RecommendProto$level_entry_dataOrBuilder extends MessageLiteOrBuilder {
    RecommendProto$entry_w_time getEntryArr(int i);

    int getEntryArrCount();

    List<RecommendProto$entry_w_time> getEntryArrList();

    RecommendProto$GUIDE_SPORTS_PURPOSE getPurpose(int i);

    int getPurposeCount();

    List<RecommendProto$GUIDE_SPORTS_PURPOSE> getPurposeList();

    int getPurposeValue(int i);

    List<Integer> getPurposeValueList();
}
