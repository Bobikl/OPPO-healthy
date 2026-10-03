package com.heytap.health.watch.notification.breeno;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface FlightPreparationBeanOrBuilder extends MessageLiteOrBuilder {
    String getEndPlace();

    ByteString getEndPlaceBytes();

    String getFlightCompanyName();

    ByteString getFlightCompanyNameBytes();

    String getFlightNumber();

    ByteString getFlightNumberBytes();

    String getStartPlace();

    ByteString getStartPlaceBytes();

    String getTakeOffDate();

    ByteString getTakeOffDateBytes();

    String getTakeOffTime();

    ByteString getTakeOffTimeBytes();
}
