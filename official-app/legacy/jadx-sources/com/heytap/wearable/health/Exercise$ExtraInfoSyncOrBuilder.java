package com.heytap.wearable.health;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface Exercise$ExtraInfoSyncOrBuilder extends MessageLiteOrBuilder {
    int getCrcCode();

    ByteString getData();

    int getIndex();

    int getLength();

    int getMaxSize();

    String getPackageName();

    ByteString getPackageNameBytes();

    Exercise$ExtraInfoSyncStatus getSyncStatus();

    int getSyncStatusValue();
}
