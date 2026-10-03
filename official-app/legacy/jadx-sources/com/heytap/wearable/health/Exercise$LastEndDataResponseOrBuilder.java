package com.heytap.wearable.health;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface Exercise$LastEndDataResponseOrBuilder extends MessageLiteOrBuilder {
    String getPackageName();

    ByteString getPackageNameBytes();

    Exercise$LastEndResult getResultCode();

    int getResultCodeValue();
}
