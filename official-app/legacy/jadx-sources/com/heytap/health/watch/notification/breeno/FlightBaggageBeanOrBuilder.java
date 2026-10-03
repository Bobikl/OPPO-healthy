package com.heytap.health.watch.notification.breeno;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface FlightBaggageBeanOrBuilder extends MessageLiteOrBuilder {
    String getBaggageCarousel();

    ByteString getBaggageCarouselBytes();

    String getFlightCompanyName();

    ByteString getFlightCompanyNameBytes();

    String getFlightNumber();

    ByteString getFlightNumberBytes();
}
