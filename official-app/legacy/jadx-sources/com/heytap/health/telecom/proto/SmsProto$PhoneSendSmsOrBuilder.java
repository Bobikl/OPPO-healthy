package com.heytap.health.telecom.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes18.dex */
public interface SmsProto$PhoneSendSmsOrBuilder extends MessageLiteOrBuilder {
    String getSmsContent();

    ByteString getSmsContentBytes();

    String getSmsDestinationAddress();

    ByteString getSmsDestinationAddressBytes();

    String getSmsScAddress();

    ByteString getSmsScAddressBytes();

    String getSmsSlotIccId();

    ByteString getSmsSlotIccIdBytes();

    int getSmsSlotId();

    String getSmsSlotImsi();

    ByteString getSmsSlotImsiBytes();

    int getSmsSlotSubId();
}
