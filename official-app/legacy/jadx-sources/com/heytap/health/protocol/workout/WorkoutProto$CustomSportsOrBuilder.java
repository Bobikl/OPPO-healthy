package com.heytap.health.protocol.workout;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$CustomSportsOrBuilder extends MessageLiteOrBuilder {
    String getId();

    ByteString getIdBytes();

    int getMaxSelect();

    String getName();

    ByteString getNameBytes();

    WorkoutProto$SportsPageData getNormalSlectedData(int i);

    int getNormalSlectedDataCount();

    List<WorkoutProto$SportsPageData> getNormalSlectedDataList();

    WorkoutProto$SportsPageData getSlectedData(int i);

    int getSlectedDataCount();

    List<WorkoutProto$SportsPageData> getSlectedDataList();

    int getSportCategory();

    WorkoutProto$SportsDataItem getSupportData(int i);

    int getSupportDataCount();

    List<WorkoutProto$SportsDataItem> getSupportDataList();
}
