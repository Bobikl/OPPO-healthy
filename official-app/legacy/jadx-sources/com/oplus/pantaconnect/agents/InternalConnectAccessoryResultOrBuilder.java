package com.oplus.pantaconnect.agents;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface InternalConnectAccessoryResultOrBuilder extends MessageOrBuilder {
    ByteString getProtocolDeviceId();

    int getResultCode();
}
