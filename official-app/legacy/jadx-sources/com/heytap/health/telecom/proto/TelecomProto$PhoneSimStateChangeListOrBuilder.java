package com.heytap.health.telecom.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public interface TelecomProto$PhoneSimStateChangeListOrBuilder extends MessageLiteOrBuilder {
    TelecomProto$PhoneSimStateChange getList(int i);

    int getListCount();

    List<TelecomProto$PhoneSimStateChange> getListList();

    boolean getPrimary();
}
