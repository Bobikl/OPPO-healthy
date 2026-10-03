package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface ChatMessageProtoOrBuilder extends MessageLiteOrBuilder {
    MsgPictureProto getBitmap();

    MsgPictureProto getSenderAvatar();

    String getSenderKey();

    ByteString getSenderKeyBytes();

    String getSenderName();

    ByteString getSenderNameBytes();

    String getText();

    ByteString getTextBytes();

    long getTimestampMillis();

    boolean hasBitmap();

    boolean hasSenderAvatar();
}
