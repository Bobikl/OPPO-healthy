package com.oplus.pantaconnect.devicemgr;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface LocalResourceListOrBuilder extends MessageOrBuilder {
    LocalResourceInfo getResourceInfos(int i);

    int getResourceInfosCount();

    List<LocalResourceInfo> getResourceInfosList();

    LocalResourceInfoOrBuilder getResourceInfosOrBuilder(int i);

    List<? extends LocalResourceInfoOrBuilder> getResourceInfosOrBuilderList();
}
