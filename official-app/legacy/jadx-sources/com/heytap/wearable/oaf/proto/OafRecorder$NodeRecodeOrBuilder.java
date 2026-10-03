package com.heytap.wearable.oaf.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface OafRecorder$NodeRecodeOrBuilder extends MessageLiteOrBuilder {
    int getConnectionType();

    ByteString getKsc();

    ByteString getKscAlias();

    ByteString getLocalDeviceId();

    String getNodeId();

    ByteString getNodeIdBytes();

    ByteString getOafModelId();

    ByteString getRemoteDeviceId();
}
