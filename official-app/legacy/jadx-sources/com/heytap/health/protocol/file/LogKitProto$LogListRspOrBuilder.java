package com.heytap.health.protocol.file;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface LogKitProto$LogListRspOrBuilder extends MessageLiteOrBuilder {
    String getLogList(int i);

    ByteString getLogListBytes(int i);

    int getLogListCount();

    List<String> getLogListList();
}
