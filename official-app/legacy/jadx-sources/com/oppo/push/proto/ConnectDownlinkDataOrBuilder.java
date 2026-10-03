package com.oppo.push.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes9.dex */
public interface ConnectDownlinkDataOrBuilder extends MessageOrBuilder {
    String getClientId();

    ByteString getClientIdBytes();

    String getCmdLatest();

    ByteString getCmdLatestBytes();

    String getDataPayload();

    ByteString getDataPayloadBytes();

    String getMessageId();

    ByteString getMessageIdBytes();

    boolean hasClientId();

    boolean hasCmdLatest();

    boolean hasDataPayload();

    boolean hasMessageId();
}
