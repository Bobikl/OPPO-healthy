package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface MsgPictureProtoOrBuilder extends MessageLiteOrBuilder {
    ByteString getData();

    int getHeight();

    int getIndex();

    String getPicKey();

    ByteString getPicKeyBytes();

    String getPicType();

    ByteString getPicTypeBytes();

    int getWidth();
}
