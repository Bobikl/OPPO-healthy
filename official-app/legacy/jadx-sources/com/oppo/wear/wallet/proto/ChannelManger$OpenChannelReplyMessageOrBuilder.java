package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes9.dex */
public interface ChannelManger$OpenChannelReplyMessageOrBuilder extends MessageLiteOrBuilder {
    String getWalletChannelId();

    ByteString getWalletChannelIdBytes();

    ByteString getWalletResponseAPDU();
}
