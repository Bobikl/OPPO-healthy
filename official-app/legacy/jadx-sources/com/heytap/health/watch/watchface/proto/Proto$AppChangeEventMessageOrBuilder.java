package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface Proto$AppChangeEventMessageOrBuilder extends MessageLiteOrBuilder {
    int getEventStatus();

    int getEventType();

    Proto$WfEntity getOperateWf(int i);

    int getOperateWfCount();

    List<Proto$WfEntity> getOperateWfList();
}
