package com.heytap.health.telecom.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes18.dex */
public interface TelecomProto$PhoneSimStateChangeOrBuilder extends MessageLiteOrBuilder {
    boolean getIsDefaultCallCard();

    String getSlotIccId();

    ByteString getSlotIccIdBytes();

    int getSlotId();

    String getSlotImsi();

    ByteString getSlotImsiBytes();

    int getSlotSimState();

    int getSlotSubId();
}
