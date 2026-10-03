package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes9.dex */
public interface AddCardManager$CardInfoMessageOrBuilder extends MessageLiteOrBuilder {
    String getAppCode();

    ByteString getAppCodeBytes();

    int getCardAmount();

    ByteString getCardImage();

    String getWalletCardAid();

    ByteString getWalletCardAidBytes();

    int getWalletCardDefault();

    String getWalletCardName();

    ByteString getWalletCardNameBytes();

    String getWalletCardNo();

    ByteString getWalletCardNoBytes();

    int getWalletCardStatus();

    int getWalletCardType();
}
