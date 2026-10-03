package com.heytap.health.protocol.fatlossassess;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FatLossAssessProto$FatLossAssessOrBuilder extends MessageLiteOrBuilder {
    String getAssessDetail();

    ByteString getAssessDetailBytes();

    int getAvgCalorie();

    FatLossAssessProto$CalorieStatistics getCalorieStatistics(int i);

    int getCalorieStatisticsCount();

    List<FatLossAssessProto$CalorieStatistics> getCalorieStatisticsList();

    String getConsumeAssess();

    ByteString getConsumeAssessBytes();

    int getCurIntake();

    String getIntakeAssess();

    ByteString getIntakeAssessBytes();

    String getIntakeAssessDetail();

    ByteString getIntakeAssessDetailBytes();

    int getWeightArray(int i);

    int getWeightArrayCount();

    List<Integer> getWeightArrayList();

    String getWeightAssess();

    ByteString getWeightAssessBytes();

    String getWeightAssessDetail();

    ByteString getWeightAssessDetailBytes();

    int getWeightChange();
}
