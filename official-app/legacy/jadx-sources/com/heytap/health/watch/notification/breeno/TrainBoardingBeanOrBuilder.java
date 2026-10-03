package com.heytap.health.watch.notification.breeno;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface TrainBoardingBeanOrBuilder extends MessageLiteOrBuilder {
    String getArriveTime();

    ByteString getArriveTimeBytes();

    String getEndPlace();

    ByteString getEndPlaceBytes();

    String getSeat();

    ByteString getSeatBytes();

    String getStartPlace();

    ByteString getStartPlaceBytes();

    String getTakeOffTime();

    ByteString getTakeOffTimeBytes();

    String getTicketGate();

    ByteString getTicketGateBytes();

    String getTrainNumber();

    ByteString getTrainNumberBytes();
}
