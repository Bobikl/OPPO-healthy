package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$FamilyBloodGlucoseNoticeOrBuilder extends MessageLiteOrBuilder {
    int getAlertType();

    float getThreshold();

    int getTimestamp();

    float getValue();
}
