package com.heytap.health.device.protocol.emergency;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes16.dex */
public interface SGP$SafeGuardSyncTravelDataOrBuilder extends MessageLiteOrBuilder {
    int getAccuracy();

    int getAltitude();

    int getBatteryLevel();

    int getHeartRate();

    int getLatitude();

    int getLongitude();

    int getPosType();

    int getPushUserState();

    int getSignal();

    int getSpeed();

    int getStayTime();

    int getTimestamp();

    String getTravelId();

    ByteString getTravelIdBytes();

    int getUserState();

    int getWearStatus();
}
