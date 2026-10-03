package com.oppo.wear.wallet.proto;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes9.dex */
public interface CapOperation$DrxConfigMsgOrBuilder extends MessageLiteOrBuilder {
    int getFailRetryNum();

    int getInverseKeyType();

    boolean getIsNeedInverse();

    boolean getIsNeedM4MUpgrade();

    int getNumDistance();

    int getProbeCount();

    int getQueryKeyMaxNum();

    int getQueryKeyTimeInterval();

    int getSampleCount();
}
