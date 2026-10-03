package com.heytap.sportwatch.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface RecommendProto$entry_dataOrBuilder extends MessageLiteOrBuilder {
    String getDefaultStr();

    ByteString getDefaultStrBytes();

    int getEntryId();

    RecommendProto$com_entry_cell getTrans();

    boolean hasTrans();
}
