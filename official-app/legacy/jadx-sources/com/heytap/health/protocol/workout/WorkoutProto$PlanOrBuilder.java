package com.heytap.health.protocol.workout;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$PlanOrBuilder extends MessageLiteOrBuilder {
    WorkoutProto$CourseDetail getDetail(int i);

    int getDetailCount();

    List<WorkoutProto$CourseDetail> getDetailList();

    int getPlanEndDate();

    int getPlanGenerateWay();

    String getPlanId();

    ByteString getPlanIdBytes();

    String getPlanName();

    ByteString getPlanNameBytes();

    int getPlanStartDate();

    int getPlanState();

    int getPlanType();

    int getWeightTarget();
}
