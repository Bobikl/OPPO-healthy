package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface Proto$CreationStyleSyncOrBuilder extends MessageLiteOrBuilder {
    int getEventType();

    String getStyleZips(int i);

    ByteString getStyleZipsBytes(int i);

    int getStyleZipsCount();

    List<String> getStyleZipsList();

    String getWfUnique();

    ByteString getWfUniqueBytes();
}
