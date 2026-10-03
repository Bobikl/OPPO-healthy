package com.oplus.pantaconnect.connection;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface GlobalDeviceConnectionsOrBuilder extends MessageOrBuilder {
    GlobalDeviceConnectionItem getData(int i);

    int getDataCount();

    List<GlobalDeviceConnectionItem> getDataList();

    GlobalDeviceConnectionItemOrBuilder getDataOrBuilder(int i);

    List<? extends GlobalDeviceConnectionItemOrBuilder> getDataOrBuilderList();
}
