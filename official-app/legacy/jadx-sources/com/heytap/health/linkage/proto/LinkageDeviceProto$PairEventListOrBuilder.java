package com.heytap.health.linkage.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface LinkageDeviceProto$PairEventListOrBuilder extends MessageLiteOrBuilder {
    LinkageDeviceProto$PairEvent getEvent(int i);

    int getEventCount();

    List<LinkageDeviceProto$PairEvent> getEventList();
}
