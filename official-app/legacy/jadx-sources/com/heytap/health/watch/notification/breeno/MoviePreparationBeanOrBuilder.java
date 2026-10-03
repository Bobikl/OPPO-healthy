package com.heytap.health.watch.notification.breeno;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface MoviePreparationBeanOrBuilder extends MessageLiteOrBuilder {
    String getCinema();

    ByteString getCinemaBytes();

    String getMovieName();

    ByteString getMovieNameBytes();

    long getOccurTime();
}
