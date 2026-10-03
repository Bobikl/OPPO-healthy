package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface Proto$WfEditConfigOrBuilder extends MessageLiteOrBuilder {
    String getExtraJson();

    ByteString getExtraJsonBytes();

    long getLastSyncTime();

    int getWfColorIndex();

    int getWfStyleIndex();

    int getWfTimeIndex();

    String getWfUnique();

    ByteString getWfUniqueBytes();

    String getWfVersion();

    ByteString getWfVersionBytes();

    Proto$WfWidget getWidgetList(int i);

    int getWidgetListCount();

    List<Proto$WfWidget> getWidgetListList();
}
