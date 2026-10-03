package com.heytap.health.protocol.workout;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$SportsDataItemListOrBuilder extends MessageLiteOrBuilder {
    WorkoutProto$SportsDataItem getItem(int i);

    int getItemCount();

    List<WorkoutProto$SportsDataItem> getItemList();
}
