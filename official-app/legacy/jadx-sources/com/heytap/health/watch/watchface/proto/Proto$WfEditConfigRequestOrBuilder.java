package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface Proto$WfEditConfigRequestOrBuilder extends MessageLiteOrBuilder {
    String getWfUniqueList(int i);

    ByteString getWfUniqueListBytes(int i);

    int getWfUniqueListCount();

    List<String> getWfUniqueListList();
}
