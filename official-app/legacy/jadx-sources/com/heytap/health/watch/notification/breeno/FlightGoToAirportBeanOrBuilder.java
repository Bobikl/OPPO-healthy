package com.heytap.health.watch.notification.breeno;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface FlightGoToAirportBeanOrBuilder extends MessageLiteOrBuilder {
    String getArriveTime();

    ByteString getArriveTimeBytes();

    String getCheckInOffice();

    ByteString getCheckInOfficeBytes();

    String getFlightCompanyName();

    ByteString getFlightCompanyNameBytes();

    String getFlightNumber();

    ByteString getFlightNumberBytes();

    String getFlightStatus();

    ByteString getFlightStatusBytes();

    long getNavDuration();

    String getStartPlace();

    ByteString getStartPlaceBytes();

    String getTakeOffTime();

    ByteString getTakeOffTimeBytes();
}
