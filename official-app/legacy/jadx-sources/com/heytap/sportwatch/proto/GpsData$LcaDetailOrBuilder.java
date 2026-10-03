package com.heytap.sportwatch.proto;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface GpsData$LcaDetailOrBuilder extends MessageLiteOrBuilder {
    int getAccuracy();

    int getAltitude();

    float getBearing();

    double getDistance();

    double getHDop();

    double getLatitude();

    double getLongitude();

    float getMslAltitudeAccuracy();

    double getPDop();

    double getSpeed();

    int getTimestamp();

    double getVDop();
}
