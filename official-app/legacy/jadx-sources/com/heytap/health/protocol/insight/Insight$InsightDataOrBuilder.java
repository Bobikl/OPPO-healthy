package com.heytap.health.protocol.insight;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface Insight$InsightDataOrBuilder extends MessageLiteOrBuilder {
    int getCategory();

    String getCode();

    ByteString getCodeBytes();

    String getContent();

    ByteString getContentBytes();

    String getExtra();

    ByteString getExtraBytes();

    Insight$SnoreAnalysis getOsaAnalysis();

    Insight$InsightData.PayloadCase getPayloadCase();

    Insight$ScoreAnalysis getScoreAnalysis();

    boolean getShowNotify();

    Insight$MultipleSignsAnalysis getTemperatureAnalysis();

    int getTimestamp();

    String getTitle();

    ByteString getTitleBytes();

    boolean hasOsaAnalysis();

    boolean hasScoreAnalysis();

    boolean hasTemperatureAnalysis();
}
