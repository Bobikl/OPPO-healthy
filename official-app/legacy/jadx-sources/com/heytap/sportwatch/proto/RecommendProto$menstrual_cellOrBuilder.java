package com.heytap.sportwatch.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface RecommendProto$menstrual_cellOrBuilder extends MessageLiteOrBuilder {
    int getDay();

    RecommendProto$entry_data getEntry(int i);

    int getEntryCount();

    List<RecommendProto$entry_data> getEntryList();
}
