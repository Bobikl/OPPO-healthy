package com.heytap.health.protocol.cardiovascular;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface CardiovascularProto$AssessmentRecordDataListV2OrBuilder extends MessageLiteOrBuilder {
    CardiovascularProto$AssessmentRecordData getData(int i);

    int getDataCount();

    List<CardiovascularProto$AssessmentRecordData> getDataList();

    int getEndTime();

    boolean getHasMore();

    int getStartTime();
}
