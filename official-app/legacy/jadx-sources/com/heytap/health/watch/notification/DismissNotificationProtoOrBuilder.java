package com.heytap.health.watch.notification;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface DismissNotificationProtoOrBuilder extends MessageLiteOrBuilder {
    boolean getIsRemoveAll();

    SimpleNotificationProto getNtfs(int i);

    int getNtfsCount();

    List<SimpleNotificationProto> getNtfsList();
}
