package com.oplus.pantaconnect.fusionservice;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface CpCallConfigOrBuilder extends MessageOrBuilder {
    String getArg();

    ByteString getArgBytes();

    ByteString getExtrasBundleBytes();

    String getMethod();

    ByteString getMethodBytes();

    boolean hasArg();

    boolean hasExtrasBundleBytes();
}
