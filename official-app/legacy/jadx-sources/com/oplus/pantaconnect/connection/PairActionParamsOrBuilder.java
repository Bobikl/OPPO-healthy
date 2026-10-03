package com.oplus.pantaconnect.connection;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface PairActionParamsOrBuilder extends MessageOrBuilder {
    PairActionParams.ConfirmType getConfirmType();

    int getConfirmTypeValue();

    ByteString getDisplayDevice();

    InternalPairAction getPairAction();

    int getPairActionValue();
}
