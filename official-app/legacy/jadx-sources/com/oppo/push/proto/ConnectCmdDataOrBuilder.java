package com.oppo.push.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes9.dex */
public interface ConnectCmdDataOrBuilder extends MessageOrBuilder {
    String getClientId();

    ByteString getClientIdBytes();

    String getCmdType();

    ByteString getCmdTypeBytes();

    String getDataPayload();

    ByteString getDataPayloadBytes();

    String getExt();

    ByteString getExtBytes();

    String getMessageId();

    ByteString getMessageIdBytes();

    boolean hasClientId();

    boolean hasCmdType();

    boolean hasDataPayload();

    boolean hasExt();

    boolean hasMessageId();
}
