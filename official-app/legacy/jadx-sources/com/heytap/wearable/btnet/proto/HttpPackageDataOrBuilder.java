package com.heytap.wearable.btnet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface HttpPackageDataOrBuilder extends MessageLiteOrBuilder {
    int getCurrentPackageNum();

    ByteString getPackageData();

    int getPackageTotalCount();

    long getReqId();
}
