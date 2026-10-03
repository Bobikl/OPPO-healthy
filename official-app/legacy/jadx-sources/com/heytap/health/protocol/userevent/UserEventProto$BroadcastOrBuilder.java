package com.heytap.health.protocol.userevent;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public interface UserEventProto$BroadcastOrBuilder extends MessageLiteOrBuilder {
    boolean containsValues(String str);

    String getAction();

    ByteString getActionBytes();

    String getTarPkg();

    ByteString getTarPkgBytes();

    int getType();

    @Deprecated
    Map<String, String> getValues();

    int getValuesCount();

    Map<String, String> getValuesMap();

    String getValuesOrDefault(String str, String str2);

    String getValuesOrThrow(String str);
}
