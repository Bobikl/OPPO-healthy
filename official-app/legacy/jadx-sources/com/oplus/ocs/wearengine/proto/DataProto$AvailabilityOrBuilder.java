package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface DataProto$AvailabilityOrBuilder extends MessageLiteOrBuilder {
    DataProto$Availability.AvailabilityCase getAvailabilityCase();

    DataProto$Availability.DataTypeAvailability getDataTypeAvailability();

    int getDataTypeAvailabilityValue();

    DataProto$Availability.LocationAvailability getLocationAvailability();

    int getLocationAvailabilityValue();

    boolean hasDataTypeAvailability();

    boolean hasLocationAvailability();
}
