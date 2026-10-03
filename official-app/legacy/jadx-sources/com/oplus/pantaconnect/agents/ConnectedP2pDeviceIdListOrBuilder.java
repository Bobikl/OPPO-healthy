package com.oplus.pantaconnect.agents;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface ConnectedP2pDeviceIdListOrBuilder extends MessageOrBuilder {
    String getDeviceIdList(int i);

    ByteString getDeviceIdListBytes(int i);

    int getDeviceIdListCount();

    List<String> getDeviceIdListList();
}
