package com.heytap.health.device.protocol.emergency;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes16.dex */
public interface EmergencySettingProto$EmergencyMedicalCardInfoOrBuilder extends MessageLiteOrBuilder {
    String getAllergicReaction();

    ByteString getAllergicReactionBytes();

    int getBirthday();

    int getBloodType();

    int getGender();

    int getHeight();

    String getMedicalHistory();

    ByteString getMedicalHistoryBytes();

    String getMedicine();

    ByteString getMedicineBytes();

    String getName();

    ByteString getNameBytes();

    int getWeight();
}
