package com.heytap.health.protocol.workout;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$RecomCourseResponseOrBuilder extends MessageLiteOrBuilder {
    WorkoutProto$CourseDetail getList(int i);

    int getListCount();

    List<WorkoutProto$CourseDetail> getListList();
}
