package com.heytap.health.protocol.workout;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$CourseDetailOrBuilder extends MessageLiteOrBuilder {
    String getArrangeId();

    ByteString getArrangeIdBytes();

    String getCourseId();

    ByteString getCourseIdBytes();

    String getCourseName();

    ByteString getCourseNameBytes();

    String getExtraData();

    ByteString getExtraDataBytes();

    int getFinishState();

    int getGoalType();

    int getGoalValue();

    int getPlanDate();

    String getPlanId();

    ByteString getPlanIdBytes();

    int getSportType();
}
