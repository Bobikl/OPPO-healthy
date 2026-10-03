package com.heytap.health.owconnect.diagnosis;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface Events$OWConnectionOrBuilder extends MessageLiteOrBuilder {
    Events$WConnectEvent getEvents(int i);

    int getEventsCount();

    List<Events$WConnectEvent> getEventsList();

    String getMac();

    ByteString getMacBytes();
}
