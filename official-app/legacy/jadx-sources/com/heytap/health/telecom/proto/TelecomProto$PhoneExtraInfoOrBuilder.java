package com.heytap.health.telecom.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes18.dex */
public interface TelecomProto$PhoneExtraInfoOrBuilder extends MessageLiteOrBuilder {
    boolean getIsNoMark();

    String getNumberAttribution();

    ByteString getNumberAttributionBytes();

    String getNumberIdentification();

    ByteString getNumberIdentificationBytes();

    String getPhoneNumber();

    ByteString getPhoneNumberBytes();

    boolean getPrimary();

    int getTagType();
}
