package com.heytap.health.protocol.dm;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface DMProto$DeviceAppListOrBuilder extends MessageLiteOrBuilder {
    DMProto$AppItemData getData(int i);

    int getDataCount();

    List<DMProto$AppItemData> getDataList();
}
