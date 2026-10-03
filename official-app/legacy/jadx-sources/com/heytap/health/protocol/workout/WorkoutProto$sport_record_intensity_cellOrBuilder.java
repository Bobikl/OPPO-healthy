package com.heytap.health.protocol.workout;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$sport_record_intensity_cellOrBuilder extends MessageLiteOrBuilder {
    WorkoutProto$sport_record_intensity_algo getAlgoInfo();

    int getDuration();

    WorkoutProto$MODIFY_SOURCE_LOAD getSource();

    int getSourceValue();

    int getSportType();

    String getSportUuid();

    ByteString getSportUuidBytes();

    int getSportsStartTime();

    int getTimestamp();

    int getUserIntensity();

    boolean hasAlgoInfo();

    boolean hasSportUuid();
}
