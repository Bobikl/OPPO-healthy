package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes9.dex */
public interface APDUTransmit$APDUTransmitMessageOrBuilder extends MessageLiteOrBuilder {
    ByteString getWalletChannelAPDU();

    String getWalletChannelId();

    ByteString getWalletChannelIdBytes();

    String getWalletRequestId();

    ByteString getWalletRequestIdBytes();
}
