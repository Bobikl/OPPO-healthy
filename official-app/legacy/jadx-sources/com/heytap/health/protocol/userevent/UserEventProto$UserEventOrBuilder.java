package com.heytap.health.protocol.userevent;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public interface UserEventProto$UserEventOrBuilder extends MessageLiteOrBuilder {
    boolean containsValues(String str);

    String getEventCategory();

    ByteString getEventCategoryBytes();

    String getEventName();

    ByteString getEventNameBytes();

    long getUtcTimeMs();

    @Deprecated
    Map<String, String> getValues();

    int getValuesCount();

    Map<String, String> getValuesMap();

    String getValuesOrDefault(String str, String str2);

    String getValuesOrThrow(String str);
}
