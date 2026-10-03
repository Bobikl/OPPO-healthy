package com.heytap.health.settings.watch.schoolmode.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public interface SchoolModeProto$SchoolModeAllowedAppListOrBuilder extends MessageLiteOrBuilder {
    SchoolModeProto$SchoolModeAppInfo getAppList(int i);

    int getAppListCount();

    List<SchoolModeProto$SchoolModeAppInfo> getAppListList();

    long getTime();

    int getType();
}
