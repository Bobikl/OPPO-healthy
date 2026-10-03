package com.heytap.health.protocol.cardiovascular;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface CardiovascularProto$CardioHistoryInfoOrBuilder extends MessageLiteOrBuilder {
    CardiovascularProto$EcgHistoryInfo getEcgAbnormalHistoryList(int i);

    int getEcgAbnormalHistoryListCount();

    List<CardiovascularProto$EcgHistoryInfo> getEcgAbnormalHistoryListList();

    CardiovascularProto$TimeToFloatValueInfo getPwvHistoryAvgList(int i);

    int getPwvHistoryAvgListCount();

    List<CardiovascularProto$TimeToFloatValueInfo> getPwvHistoryAvgListList();

    CardiovascularProto$TimeToIntValueInfoWithBaseLine getRestHeartRateHistoryList(int i);

    int getRestHeartRateHistoryListCount();

    List<CardiovascularProto$TimeToIntValueInfoWithBaseLine> getRestHeartRateHistoryListList();

    CardiovascularProto$TimeToIntValueInfoWithBaseLine getSleepHeartRateHistoryList(int i);

    int getSleepHeartRateHistoryListCount();

    List<CardiovascularProto$TimeToIntValueInfoWithBaseLine> getSleepHeartRateHistoryListList();
}
