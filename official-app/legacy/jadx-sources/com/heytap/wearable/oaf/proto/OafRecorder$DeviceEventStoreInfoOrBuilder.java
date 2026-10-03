package com.heytap.wearable.oaf.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface OafRecorder$DeviceEventStoreInfoOrBuilder extends MessageLiteOrBuilder {
    OafRecorder$DeviceEventStore getStoreInfo(int i);

    int getStoreInfoCount();

    List<OafRecorder$DeviceEventStore> getStoreInfoList();
}
