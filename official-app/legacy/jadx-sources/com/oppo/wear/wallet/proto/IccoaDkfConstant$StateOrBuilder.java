package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes9.dex */
public interface IccoaDkfConstant$StateOrBuilder extends MessageLiteOrBuilder {
    String getAdditionalInfo();

    ByteString getAdditionalInfoBytes();

    IccoaDkfConstant$ICCOAErrorCode getCode();

    int getCodeValue();

    String getErrorMessage();

    ByteString getErrorMessageBytes();
}
