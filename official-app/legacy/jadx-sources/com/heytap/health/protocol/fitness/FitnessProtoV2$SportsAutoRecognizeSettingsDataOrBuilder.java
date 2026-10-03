package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$SportsAutoRecognizeSettingsDataOrBuilder extends MessageLiteOrBuilder {
    FitnessProtoV2$SettingsEnableRecordTypeData getElliptical();

    FitnessProtoV2$SettingsEnableRecordTypeData getRide();

    FitnessProtoV2$SettingsEnableRecordTypeData getRowing();

    FitnessProtoV2$SettingsEnableRecordTypeData getRun();

    FitnessProtoV2$SettingsEnableData getSportsRecognizeSwitch();

    FitnessProtoV2$SettingsEnableRecordTypeData getSwim();

    FitnessProtoV2$SettingsEnableRecordTypeData getWalk();

    boolean hasElliptical();

    boolean hasRide();

    boolean hasRowing();

    boolean hasRun();

    boolean hasSportsRecognizeSwitch();

    boolean hasSwim();

    boolean hasWalk();
}
