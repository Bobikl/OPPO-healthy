package com.heytap.health.protocol.file;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface LogKitProto$LogKitStateRspOrBuilder extends MessageLiteOrBuilder {
    int getAction();

    String getFileName();

    ByteString getFileNameBytes();

    String getHistory(int i);

    ByteString getHistoryBytes(int i);

    int getHistoryCount();

    List<String> getHistoryList();

    String getParam();

    ByteString getParamBytes();

    int getProgress();
}
