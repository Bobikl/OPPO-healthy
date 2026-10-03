package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface Proto$WidgetListSupportResponseOrBuilder extends MessageLiteOrBuilder {
    int getWidgetList(int i);

    int getWidgetListCount();

    List<Integer> getWidgetListList();

    Proto$WidgetListSupportResponseV2 getWidgetListV2(int i);

    int getWidgetListV2Count();

    List<Proto$WidgetListSupportResponseV2> getWidgetListV2List();
}
