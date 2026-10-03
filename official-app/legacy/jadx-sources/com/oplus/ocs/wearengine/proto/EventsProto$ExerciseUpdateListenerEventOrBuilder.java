package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface EventsProto$ExerciseUpdateListenerEventOrBuilder extends MessageLiteOrBuilder {
    ResponsesProto$AvailabilityResponse getAvailabilityResponse();

    EventsProto$ExerciseUpdateListenerEvent.EventCase getEventCase();

    ResponsesProto$ExerciseExtraInfoResponse getExerciseExtraInfoResponse();

    ResponsesProto$ExerciseUpdateResponse getExerciseUpdateResponse();

    ResponsesProto$ExerciseLapSummaryResponse getLapSummaryResponse();

    boolean hasAvailabilityResponse();

    boolean hasExerciseExtraInfoResponse();

    boolean hasExerciseUpdateResponse();

    boolean hasLapSummaryResponse();
}
