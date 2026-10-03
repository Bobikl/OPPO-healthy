package com.heytap.health.protocol.workout;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$SportsPageDataOrBuilder extends MessageLiteOrBuilder {
    WorkoutProto$SportsDataItem getDataItem(int i);

    int getDataItemCount();

    List<WorkoutProto$SportsDataItem> getDataItemList();

    int getPageNum();
}
