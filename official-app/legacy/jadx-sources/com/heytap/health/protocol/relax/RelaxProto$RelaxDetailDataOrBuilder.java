package com.heytap.health.protocol.relax;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface RelaxProto$RelaxDetailDataOrBuilder extends MessageLiteOrBuilder {
    RelaxProto$RelaxItem getData(int i);

    int getDataCount();

    List<RelaxProto$RelaxItem> getDataList();

    int getIndex();

    String getSessionId();

    ByteString getSessionIdBytes();
}
