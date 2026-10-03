package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes9.dex */
public interface NfcStatusManager$GetWatchApkVersionMessageOrBuilder extends MessageLiteOrBuilder {
    long getIccoaFeatureBitmap();

    int getPixelX();

    int getPixelY();

    int getSupportWASMVersion();

    String getWatchApkVersion();

    ByteString getWatchApkVersionBytes();
}
