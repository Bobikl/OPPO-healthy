package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface Proto$AskStatusOrBuilder extends MessageLiteOrBuilder {
    int getFileSize();

    int getFileType();

    String getFileUnique();

    ByteString getFileUniqueBytes();

    int getSource();
}
