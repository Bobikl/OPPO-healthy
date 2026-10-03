package com.oplus.pantaconnect.fusionservice;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface IdentityParamsOrBuilder extends MessageOrBuilder {
    String getAccountGroup();

    ByteString getAccountGroupBytes();

    String getAccountHash();

    ByteString getAccountHashBytes();

    String getContactHash();

    ByteString getContactHashBytes();
}
