package com.heytap.health.protocol.workout;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$AltitudeResponseOrBuilder extends MessageLiteOrBuilder {
    float getAirPressure();

    int getErrorCode();

    float getPressurePredict(int i);

    int getPressurePredictCount();

    List<Float> getPressurePredictList();

    float getTemperature(int i);

    int getTemperatureCount();

    List<Float> getTemperatureList();

    int getTimestamp(int i);

    int getTimestampCount();

    List<Integer> getTimestampList();
}
