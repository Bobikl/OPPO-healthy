package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface BigPictureStyleProtoOrBuilder extends MessageLiteOrBuilder {
    String getBigTitle();

    ByteString getBigTitleBytes();

    String getBody();

    ByteString getBodyBytes();

    BigPictureProto getPicture();

    String getSummary();

    ByteString getSummaryBytes();

    boolean hasPicture();
}
