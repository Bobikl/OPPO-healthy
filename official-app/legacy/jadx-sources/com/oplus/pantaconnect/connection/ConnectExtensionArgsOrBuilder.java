package com.oplus.pantaconnect.connection;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface ConnectExtensionArgsOrBuilder extends MessageOrBuilder {
    boolean getAddBlacklist();

    boolean getForce();

    boolean getIsCloseAll();

    int getPid();

    String getPkg();

    ByteString getPkgBytes();
}
