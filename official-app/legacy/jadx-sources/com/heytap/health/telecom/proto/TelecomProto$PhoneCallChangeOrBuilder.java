package com.heytap.health.telecom.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes18.dex */
public interface TelecomProto$PhoneCallChangeOrBuilder extends MessageLiteOrBuilder {
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

    boolean getCanSmsReject();

    int getChangeStatus();

    int getDisconnectCause();

    String getDisplayName();

    ByteString getDisplayNameBytes();

    boolean getIsContactCall();

    boolean getMute();

    boolean getPrimary();
}
