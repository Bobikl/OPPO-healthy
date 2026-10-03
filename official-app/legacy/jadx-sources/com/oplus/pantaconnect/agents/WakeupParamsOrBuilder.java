package com.oplus.pantaconnect.agents;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface WakeupParamsOrBuilder extends MessageOrBuilder {
    String getAction();

    ByteString getActionBytes();

    int getComponentType();

    String getPkg();

    ByteString getPkgBytes();
}
