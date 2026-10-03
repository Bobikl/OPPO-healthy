package com.heytap.health.protocol.cardiovascular;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface CardiovascularProto$BloodPressureInfoOrBuilder extends MessageLiteOrBuilder {
    int getBloodPressureType();

    int getCountdown();

    int getEndDayTime();

    int getFocusEndOffsetTime(int i);

    int getFocusEndOffsetTimeCount();

    List<Integer> getFocusEndOffsetTimeList();

    int getFocusStartOffsetTime(int i);

    int getFocusStartOffsetTimeCount();

    List<Integer> getFocusStartOffsetTimeList();

    CardiovascularProto$TimeToIntValueInfo getLeftDayInfo(int i);

    int getLeftDayInfoCount();

    List<CardiovascularProto$TimeToIntValueInfo> getLeftDayInfoList();

    int getStartDayTime();

    int getState();

    CardiovascularProto$TimeToFloatValueInfo getValueList(int i);

    int getValueListCount();

    List<CardiovascularProto$TimeToFloatValueInfo> getValueListList();
}
