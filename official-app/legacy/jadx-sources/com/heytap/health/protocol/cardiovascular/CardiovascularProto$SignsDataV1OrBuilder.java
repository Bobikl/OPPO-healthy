package com.heytap.health.protocol.cardiovascular;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface CardiovascularProto$SignsDataV1OrBuilder extends MessageLiteOrBuilder {
    int getBaselines(int i);

    int getBaselinesCount();

    List<Integer> getBaselinesList();

    int getCurrentDays();

    String getLegend();

    ByteString getLegendBytes();

    int getSafeLowerLimit(int i);

    int getSafeLowerLimitCount();

    List<Integer> getSafeLowerLimitList();

    int getSafeUpperLimit(int i);

    int getSafeUpperLimitCount();

    List<Integer> getSafeUpperLimitList();

    int getTimeList(int i);

    int getTimeListCount();

    List<Integer> getTimeListList();

    int getTotalDays();

    int getType();

    int getValues(int i);

    int getValuesCount();

    List<Integer> getValuesList();
}
