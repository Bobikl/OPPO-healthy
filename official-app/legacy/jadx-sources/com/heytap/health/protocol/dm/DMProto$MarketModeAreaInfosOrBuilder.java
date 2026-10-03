package com.heytap.health.protocol.dm;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface DMProto$MarketModeAreaInfosOrBuilder extends MessageLiteOrBuilder {
    int getCode();

    DMProto$AreaInfo getData(int i);

    int getDataCount();

    List<DMProto$AreaInfo> getDataList();
}
