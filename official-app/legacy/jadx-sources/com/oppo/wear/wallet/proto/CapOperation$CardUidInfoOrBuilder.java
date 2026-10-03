package com.oppo.wear.wallet.proto;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes9.dex */
public interface CapOperation$CardUidInfoOrBuilder extends MessageLiteOrBuilder {
    int getEncryptedSecSize();

    boolean getHasUnknownKeySector();

    int getSectorSize();

    boolean getSupportMifareClassic();

    long getUid();
}
