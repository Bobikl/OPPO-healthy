package com.oplus.pantaconnect.fusionservice;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface ServiceListenerEventOrBuilder extends MessageOrBuilder {
    ByteString getArgs();

    String getType();

    ByteString getTypeBytes();
}
