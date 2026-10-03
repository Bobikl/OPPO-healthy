package com.oplus.pantaconnect.fusionservice;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface ServiceInfoParamsOrBuilder extends MessageOrBuilder {
    ByteString getServiceData();

    String getServiceId();

    ByteString getServiceIdBytes();
}
