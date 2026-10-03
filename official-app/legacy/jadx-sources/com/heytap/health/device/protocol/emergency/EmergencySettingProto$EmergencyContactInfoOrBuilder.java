package com.heytap.health.device.protocol.emergency;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes16.dex */
public interface EmergencySettingProto$EmergencyContactInfoOrBuilder extends MessageLiteOrBuilder {
    String getCustomRelationship();

    ByteString getCustomRelationshipBytes();

    String getName();

    ByteString getNameBytes();

    String getNumber();

    ByteString getNumberBytes();

    int getRelationship();
}
