package com.heytap.health.telecom.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes18.dex */
public interface TelecomProto$PlacePhoneCallOrBuilder extends MessageLiteOrBuilder {
    String getCallLocalContact();

    ByteString getCallLocalContactBytes();

    String getCallRemoteNumber();

    ByteString getCallRemoteNumberBytes();

    String getCallSlotIccId();

    ByteString getCallSlotIccIdBytes();

    int getCallSlotId();

    String getCallSlotImsi();

    ByteString getCallSlotImsiBytes();

    String getCallSlotNumber();

    ByteString getCallSlotNumberBytes();

    int getCallSlotSubId();
}
