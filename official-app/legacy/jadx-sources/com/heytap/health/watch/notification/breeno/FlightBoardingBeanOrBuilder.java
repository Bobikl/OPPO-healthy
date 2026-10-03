package com.heytap.health.watch.notification.breeno;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface FlightBoardingBeanOrBuilder extends MessageLiteOrBuilder {
    String getArriveTime();

    ByteString getArriveTimeBytes();

    String getBoardingGate();

    ByteString getBoardingGateBytes();

    String getFlightCompanyName();

    ByteString getFlightCompanyNameBytes();

    String getFlightNumber();

    ByteString getFlightNumberBytes();

    String getFlightStatus();

    ByteString getFlightStatusBytes();

    String getSeatNum();

    ByteString getSeatNumBytes();

    String getStartPlace();

    ByteString getStartPlaceBytes();

    String getTakeOffTime();

    ByteString getTakeOffTimeBytes();
}
