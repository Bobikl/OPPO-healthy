package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes9.dex */
public interface ChannelManger$OpenChannelMessageOrBuilder extends MessageLiteOrBuilder {
    boolean getSessionSwitch();

    String getWalletAid();

    ByteString getWalletAidBytes();

    int getWalletChannelType();
}
