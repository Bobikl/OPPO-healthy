package com.oppo.wear.wallet.proto;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes9.dex */
public interface CreateIccoaKey$CreateDigitalKeyResponseOrBuilder extends MessageLiteOrBuilder {
    IccoaDkfConstant$IccoaDkDatabean getKey();

    IccoaDkfConstant$State getState();

    boolean hasKey();

    boolean hasState();
}
