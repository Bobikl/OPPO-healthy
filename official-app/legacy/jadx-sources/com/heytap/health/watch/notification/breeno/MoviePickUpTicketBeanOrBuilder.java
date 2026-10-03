package com.heytap.health.watch.notification.breeno;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface MoviePickUpTicketBeanOrBuilder extends MessageLiteOrBuilder {
    String getDateTime();

    ByteString getDateTimeBytes();

    String getMovieName();

    ByteString getMovieNameBytes();

    String getPickCode();

    ByteString getPickCodeBytes();

    String getVerification();

    ByteString getVerificationBytes();
}
