package com.heytap.sportwatch.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface GpsData$GpsConfigOrBuilder extends MessageLiteOrBuilder {
    int getAppVer();

    int getCriteria();

    int getDistanceThreshold();

    int getGroupSendCount();

    int getGroupSendInterval();

    int getInfoBitmap();

    String getPackageName();

    ByteString getPackageNameBytes();

    int getProcId();

    int getProvider();

    int getSampleInterval();

    int getSendType();

    String getSessionId();

    ByteString getSessionIdBytes();

    int getSupportOptimize();
}
