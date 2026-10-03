package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface CacheIconsOrBuilder extends MessageLiteOrBuilder {
    String getFluidApps(int i);

    ByteString getFluidAppsBytes(int i);

    int getFluidAppsCount();

    List<String> getFluidAppsList();

    String getNotificationApps(int i);

    ByteString getNotificationAppsBytes(int i);

    int getNotificationAppsCount();

    List<String> getNotificationAppsList();

    int getSyncType();
}
