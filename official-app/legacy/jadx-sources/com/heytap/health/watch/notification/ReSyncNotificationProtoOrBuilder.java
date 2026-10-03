package com.heytap.health.watch.notification;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface ReSyncNotificationProtoOrBuilder extends MessageLiteOrBuilder {
    SimpleNotificationProto getDismiss(int i);

    int getDismissCount();

    List<SimpleNotificationProto> getDismissList();

    SimpleNotificationProto getHave(int i);

    int getHaveCount();

    List<SimpleNotificationProto> getHaveList();
}
