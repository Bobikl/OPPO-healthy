package com.heytap.health.protocol.workout;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$FitnessInfoOrBuilder extends MessageLiteOrBuilder {
    int getFitnessCourseCalorie();

    String getFitnessCourseChapter();

    ByteString getFitnessCourseChapterBytes();

    int getFitnessCourseDuration();

    int getFitnessCourseNumber();

    int getFitnessCourseOperable();

    int getFitnessCourseProgress();

    int getFitnessCourseState();

    int getFitnessCourseTimes();

    int getFitnessCourseTimestamp();

    String getFitnessCourseTitle();

    ByteString getFitnessCourseTitleBytes();

    int getFitnessCourseTrainTime();

    boolean getSupportFatBurningTest();
}
