package com.heytap.sportwatch.proto;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface GpsData$LocationOrBuilder extends MessageLiteOrBuilder {
    int getAccuracy();

    int getDistance();

    double getLatitude();

    double getLongitude();

    int getSpeed();

    int getState();

    int getTimestamp();
}
