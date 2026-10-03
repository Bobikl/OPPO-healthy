package com.heytap.health.protocol.bloodpressure;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface BloodPressurePBData$BloodPressureItemDataOrBuilder extends MessageLiteOrBuilder {
    String getDeviceUniqueId();

    ByteString getDeviceUniqueIdBytes();

    int getDiastolic();

    int getMeasureTime();

    int getSystolic();
}
