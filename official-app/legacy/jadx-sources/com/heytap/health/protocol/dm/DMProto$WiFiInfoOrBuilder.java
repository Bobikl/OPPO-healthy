package com.heytap.health.protocol.dm;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface DMProto$WiFiInfoOrBuilder extends MessageLiteOrBuilder {
    DMProto$WiFiConfig getConfigs(int i);

    int getConfigsCount();

    List<DMProto$WiFiConfig> getConfigsList();

    String getKey();

    ByteString getKeyBytes();
}
