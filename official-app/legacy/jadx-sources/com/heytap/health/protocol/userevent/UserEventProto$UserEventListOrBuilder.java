package com.heytap.health.protocol.userevent;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface UserEventProto$UserEventListOrBuilder extends MessageLiteOrBuilder {
    UserEventProto$UserEvent getEvent(int i);

    int getEventCount();

    List<UserEventProto$UserEvent> getEventList();
}
