package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$SportRecordGpsDataOrBuilder extends MessageLiteOrBuilder {
    int getLatitude(int i);

    int getLatitudeCount();

    List<Integer> getLatitudeList();

    int getLongitude(int i);

    int getLongitudeCount();

    List<Integer> getLongitudeList();

    float getSpeed(int i);

    int getSpeedCount();

    List<Float> getSpeedList();

    int getState(int i);

    int getStateCount();

    List<Integer> getStateList();

    long getTimestamp(int i);

    int getTimestampCount();

    List<Long> getTimestampList();
}
