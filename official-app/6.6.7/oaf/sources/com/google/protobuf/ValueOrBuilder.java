package com.google.protobuf;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface ValueOrBuilder extends MessageOrBuilder {
    boolean getBoolValue();

    Value.KindCase getKindCase();

    ListValue getListValue();

    ListValueOrBuilder getListValueOrBuilder();

    NullValue getNullValue();

    int getNullValueValue();

    double getNumberValue();

    String getStringValue();

    ByteString getStringValueBytes();

    Struct getStructValue();

    StructOrBuilder getStructValueOrBuilder();

    boolean hasBoolValue();

    boolean hasListValue();

    boolean hasNullValue();

    boolean hasNumberValue();

    boolean hasStringValue();

    boolean hasStructValue();
}
