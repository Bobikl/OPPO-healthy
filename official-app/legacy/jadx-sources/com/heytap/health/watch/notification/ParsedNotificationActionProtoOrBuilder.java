package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface ParsedNotificationActionProtoOrBuilder extends MessageLiteOrBuilder {
    boolean getAllowGeneratedReplies();

    ExtendAction getExt();

    boolean getHintDisplayActionInline();

    String getIntentId();

    ByteString getIntentIdBytes();

    boolean getIsWatchContentIntent();

    ParsedRemoteInputProto getRemoteInputs();

    String getReply();

    ByteString getReplyBytes();

    String getTitle();

    ByteString getTitleBytes();

    boolean hasExt();

    boolean hasRemoteInputs();
}
