package com.heytap.health.protocol.fitness;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.in7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProtoV2$SegmentData extends GeneratedMessageLite<FitnessProtoV2$SegmentData, Builder> implements FitnessProtoV2$SegmentDataOrBuilder {
    public static final int ACTIVEDURATION_FIELD_NUMBER = 4;
    public static final int AVGFREQ_FIELD_NUMBER = 13;
    public static final int AVGHR_FIELD_NUMBER = 10;
    public static final int AVGSTRIDEBS_FIELD_NUMBER = 16;
    public static final int AVGSTRIDE_FIELD_NUMBER = 15;
    public static final int BACKHAND_FIELD_NUMBER = 35;
    public static final int CAL_FIELD_NUMBER = 31;
    public static final int CLIMBING_FIELD_NUMBER = 32;
    public static final int CURRENTHR_FIELD_NUMBER = 7;
    private static final FitnessProtoV2$SegmentData DEFAULT_INSTANCE;
    public static final int DESCENT_FIELD_NUMBER = 33;
    public static final int DISTANCEBS_FIELD_NUMBER = 18;
    public static final int DISTANCE_FIELD_NUMBER = 17;
    public static final int DURATION_FIELD_NUMBER = 3;
    public static final int ENDTIME_FIELD_NUMBER = 6;
    public static final int FLOORS_FIELD_NUMBER = 42;
    public static final int FOREHAND_FIELD_NUMBER = 34;
    public static final int HRCONF_FIELD_NUMBER = 8;
    public static final int INTERTYPE_FIELD_NUMBER = 2;
    public static final int MAXFREQ_FIELD_NUMBER = 14;
    public static final int MAXHR_FIELD_NUMBER = 9;
    public static final int MAXPACEBS_FIELD_NUMBER = 24;
    public static final int MAXPACE_FIELD_NUMBER = 23;
    public static final int MAXSPEEDBS_FIELD_NUMBER = 28;
    public static final int MAXSPEED_FIELD_NUMBER = 27;
    public static final int MINHR_FIELD_NUMBER = 11;
    public static final int OVERHAND_FIELD_NUMBER = 36;
    public static final int PACEBS_FIELD_NUMBER = 22;
    public static final int PACE_FIELD_NUMBER = 21;
    private static volatile Parser<FitnessProtoV2$SegmentData> PARSER = null;
    public static final int REPCOUNT_FIELD_NUMBER = 29;
    public static final int REPSPEED_FIELD_NUMBER = 30;
    public static final int SEGTYPE_FIELD_NUMBER = 1;
    public static final int SEQID_FIELD_NUMBER = 41;
    public static final int SKIDISTANCEBS_FIELD_NUMBER = 20;
    public static final int SKIDISTANCE_FIELD_NUMBER = 19;
    public static final int SPEEDBS_FIELD_NUMBER = 26;
    public static final int SPEED_FIELD_NUMBER = 25;
    public static final int STARTTIME_FIELD_NUMBER = 5;
    public static final int STEPS_FIELD_NUMBER = 12;
    public static final int SWIMTYPE_FIELD_NUMBER = 39;
    public static final int SWOLFVALUE_FIELD_NUMBER = 40;
    public static final int TENNISSERVE_FIELD_NUMBER = 38;
    public static final int UNDERHAND_FIELD_NUMBER = 37;
    private int segTypeMemoizedSerializedSize = -1;
    private int interTypeMemoizedSerializedSize = -1;
    private int durationMemoizedSerializedSize = -1;
    private int activeDurationMemoizedSerializedSize = -1;
    private int startTimeMemoizedSerializedSize = -1;
    private int endTimeMemoizedSerializedSize = -1;
    private int currentHrMemoizedSerializedSize = -1;
    private int hrConfMemoizedSerializedSize = -1;
    private int maxHrMemoizedSerializedSize = -1;
    private int avgHrMemoizedSerializedSize = -1;
    private int minHrMemoizedSerializedSize = -1;
    private int stepsMemoizedSerializedSize = -1;
    private int avgFreqMemoizedSerializedSize = -1;
    private int maxFreqMemoizedSerializedSize = -1;
    private int avgStrideMemoizedSerializedSize = -1;
    private int avgStrideBsMemoizedSerializedSize = -1;
    private int distanceMemoizedSerializedSize = -1;
    private int distanceBsMemoizedSerializedSize = -1;
    private int skiDistanceMemoizedSerializedSize = -1;
    private int skiDistanceBsMemoizedSerializedSize = -1;
    private int paceMemoizedSerializedSize = -1;
    private int paceBsMemoizedSerializedSize = -1;
    private int maxPaceMemoizedSerializedSize = -1;
    private int maxPaceBsMemoizedSerializedSize = -1;
    private int speedMemoizedSerializedSize = -1;
    private int speedBsMemoizedSerializedSize = -1;
    private int maxSpeedMemoizedSerializedSize = -1;
    private int maxSpeedBsMemoizedSerializedSize = -1;
    private int repCountMemoizedSerializedSize = -1;
    private int repSpeedMemoizedSerializedSize = -1;
    private int calMemoizedSerializedSize = -1;
    private int climbingMemoizedSerializedSize = -1;
    private int descentMemoizedSerializedSize = -1;
    private int foreHandMemoizedSerializedSize = -1;
    private int backHandMemoizedSerializedSize = -1;
    private int overHandMemoizedSerializedSize = -1;
    private int underHandMemoizedSerializedSize = -1;
    private int tennisServeMemoizedSerializedSize = -1;
    private int swimTypeMemoizedSerializedSize = -1;
    private int swolfValueMemoizedSerializedSize = -1;
    private int seqIdMemoizedSerializedSize = -1;
    private int floorsMemoizedSerializedSize = -1;
    private Internal.IntList segType_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList interType_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList duration_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList activeDuration_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList startTime_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList endTime_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList currentHr_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList hrConf_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList maxHr_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList avgHr_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList minHr_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList steps_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList avgFreq_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList maxFreq_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList avgStride_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList avgStrideBs_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList distance_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList distanceBs_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList skiDistance_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList skiDistanceBs_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList pace_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList paceBs_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList maxPace_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList maxPaceBs_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList speed_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList speedBs_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList maxSpeed_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList maxSpeedBs_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList repCount_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList repSpeed_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList cal_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList climbing_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList descent_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList foreHand_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList backHand_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList overHand_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList underHand_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList tennisServe_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList swimType_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList swolfValue_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList seqId_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList floors_ = GeneratedMessageLite.emptyIntList();

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$SegmentData, Builder> implements FitnessProtoV2$SegmentDataOrBuilder {
        public Builder addActiveDuration(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addActiveDuration(i);
            return this;
        }

        public Builder addAllActiveDuration(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllActiveDuration(iterable);
            return this;
        }

        public Builder addAllAvgFreq(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllAvgFreq(iterable);
            return this;
        }

        public Builder addAllAvgHr(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllAvgHr(iterable);
            return this;
        }

        public Builder addAllAvgStride(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllAvgStride(iterable);
            return this;
        }

        public Builder addAllAvgStrideBs(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllAvgStrideBs(iterable);
            return this;
        }

        public Builder addAllBackHand(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllBackHand(iterable);
            return this;
        }

        public Builder addAllCal(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllCal(iterable);
            return this;
        }

        public Builder addAllClimbing(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllClimbing(iterable);
            return this;
        }

        public Builder addAllCurrentHr(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllCurrentHr(iterable);
            return this;
        }

        public Builder addAllDescent(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllDescent(iterable);
            return this;
        }

        public Builder addAllDistance(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllDistance(iterable);
            return this;
        }

        public Builder addAllDistanceBs(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllDistanceBs(iterable);
            return this;
        }

        public Builder addAllDuration(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllDuration(iterable);
            return this;
        }

        public Builder addAllEndTime(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllEndTime(iterable);
            return this;
        }

        public Builder addAllFloors(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllFloors(iterable);
            return this;
        }

        public Builder addAllForeHand(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllForeHand(iterable);
            return this;
        }

        public Builder addAllHrConf(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllHrConf(iterable);
            return this;
        }

        public Builder addAllInterType(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllInterType(iterable);
            return this;
        }

        public Builder addAllMaxFreq(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllMaxFreq(iterable);
            return this;
        }

        public Builder addAllMaxHr(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllMaxHr(iterable);
            return this;
        }

        public Builder addAllMaxPace(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllMaxPace(iterable);
            return this;
        }

        public Builder addAllMaxPaceBs(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllMaxPaceBs(iterable);
            return this;
        }

        public Builder addAllMaxSpeed(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllMaxSpeed(iterable);
            return this;
        }

        public Builder addAllMaxSpeedBs(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllMaxSpeedBs(iterable);
            return this;
        }

        public Builder addAllMinHr(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllMinHr(iterable);
            return this;
        }

        public Builder addAllOverHand(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllOverHand(iterable);
            return this;
        }

        public Builder addAllPace(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllPace(iterable);
            return this;
        }

        public Builder addAllPaceBs(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllPaceBs(iterable);
            return this;
        }

        public Builder addAllRepCount(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllRepCount(iterable);
            return this;
        }

        public Builder addAllRepSpeed(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllRepSpeed(iterable);
            return this;
        }

        public Builder addAllSegType(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllSegType(iterable);
            return this;
        }

        public Builder addAllSeqId(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllSeqId(iterable);
            return this;
        }

        public Builder addAllSkiDistance(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllSkiDistance(iterable);
            return this;
        }

        public Builder addAllSkiDistanceBs(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllSkiDistanceBs(iterable);
            return this;
        }

        public Builder addAllSpeed(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllSpeed(iterable);
            return this;
        }

        public Builder addAllSpeedBs(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllSpeedBs(iterable);
            return this;
        }

        public Builder addAllStartTime(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllStartTime(iterable);
            return this;
        }

        public Builder addAllSteps(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllSteps(iterable);
            return this;
        }

        public Builder addAllSwimType(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllSwimType(iterable);
            return this;
        }

        public Builder addAllSwolfValue(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllSwolfValue(iterable);
            return this;
        }

        public Builder addAllTennisServe(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllTennisServe(iterable);
            return this;
        }

        public Builder addAllUnderHand(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAllUnderHand(iterable);
            return this;
        }

        public Builder addAvgFreq(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAvgFreq(i);
            return this;
        }

        public Builder addAvgHr(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAvgHr(i);
            return this;
        }

        public Builder addAvgStride(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAvgStride(i);
            return this;
        }

        public Builder addAvgStrideBs(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addAvgStrideBs(i);
            return this;
        }

        public Builder addBackHand(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addBackHand(i);
            return this;
        }

        public Builder addCal(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addCal(i);
            return this;
        }

        public Builder addClimbing(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addClimbing(i);
            return this;
        }

        public Builder addCurrentHr(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addCurrentHr(i);
            return this;
        }

        public Builder addDescent(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addDescent(i);
            return this;
        }

        public Builder addDistance(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addDistance(i);
            return this;
        }

        public Builder addDistanceBs(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addDistanceBs(i);
            return this;
        }

        public Builder addDuration(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addDuration(i);
            return this;
        }

        public Builder addEndTime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addEndTime(i);
            return this;
        }

        public Builder addFloors(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addFloors(i);
            return this;
        }

        public Builder addForeHand(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addForeHand(i);
            return this;
        }

        public Builder addHrConf(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addHrConf(i);
            return this;
        }

        public Builder addInterType(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addInterType(i);
            return this;
        }

        public Builder addMaxFreq(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addMaxFreq(i);
            return this;
        }

        public Builder addMaxHr(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addMaxHr(i);
            return this;
        }

        public Builder addMaxPace(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addMaxPace(i);
            return this;
        }

        public Builder addMaxPaceBs(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addMaxPaceBs(i);
            return this;
        }

        public Builder addMaxSpeed(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addMaxSpeed(i);
            return this;
        }

        public Builder addMaxSpeedBs(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addMaxSpeedBs(i);
            return this;
        }

        public Builder addMinHr(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addMinHr(i);
            return this;
        }

        public Builder addOverHand(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addOverHand(i);
            return this;
        }

        public Builder addPace(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addPace(i);
            return this;
        }

        public Builder addPaceBs(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addPaceBs(i);
            return this;
        }

        public Builder addRepCount(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addRepCount(i);
            return this;
        }

        public Builder addRepSpeed(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addRepSpeed(i);
            return this;
        }

        public Builder addSegType(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addSegType(i);
            return this;
        }

        public Builder addSeqId(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addSeqId(i);
            return this;
        }

        public Builder addSkiDistance(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addSkiDistance(i);
            return this;
        }

        public Builder addSkiDistanceBs(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addSkiDistanceBs(i);
            return this;
        }

        public Builder addSpeed(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addSpeed(i);
            return this;
        }

        public Builder addSpeedBs(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addSpeedBs(i);
            return this;
        }

        public Builder addStartTime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addStartTime(i);
            return this;
        }

        public Builder addSteps(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addSteps(i);
            return this;
        }

        public Builder addSwimType(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addSwimType(i);
            return this;
        }

        public Builder addSwolfValue(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addSwolfValue(i);
            return this;
        }

        public Builder addTennisServe(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addTennisServe(i);
            return this;
        }

        public Builder addUnderHand(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).addUnderHand(i);
            return this;
        }

        public Builder clearActiveDuration() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearActiveDuration();
            return this;
        }

        public Builder clearAvgFreq() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearAvgFreq();
            return this;
        }

        public Builder clearAvgHr() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearAvgHr();
            return this;
        }

        public Builder clearAvgStride() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearAvgStride();
            return this;
        }

        public Builder clearAvgStrideBs() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearAvgStrideBs();
            return this;
        }

        public Builder clearBackHand() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearBackHand();
            return this;
        }

        public Builder clearCal() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearCal();
            return this;
        }

        public Builder clearClimbing() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearClimbing();
            return this;
        }

        public Builder clearCurrentHr() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearCurrentHr();
            return this;
        }

        public Builder clearDescent() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearDescent();
            return this;
        }

        public Builder clearDistance() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearDistance();
            return this;
        }

        public Builder clearDistanceBs() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearDistanceBs();
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearDuration();
            return this;
        }

        public Builder clearEndTime() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearEndTime();
            return this;
        }

        public Builder clearFloors() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearFloors();
            return this;
        }

        public Builder clearForeHand() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearForeHand();
            return this;
        }

        public Builder clearHrConf() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearHrConf();
            return this;
        }

        public Builder clearInterType() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearInterType();
            return this;
        }

        public Builder clearMaxFreq() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearMaxFreq();
            return this;
        }

        public Builder clearMaxHr() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearMaxHr();
            return this;
        }

        public Builder clearMaxPace() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearMaxPace();
            return this;
        }

        public Builder clearMaxPaceBs() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearMaxPaceBs();
            return this;
        }

        public Builder clearMaxSpeed() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearMaxSpeed();
            return this;
        }

        public Builder clearMaxSpeedBs() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearMaxSpeedBs();
            return this;
        }

        public Builder clearMinHr() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearMinHr();
            return this;
        }

        public Builder clearOverHand() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearOverHand();
            return this;
        }

        public Builder clearPace() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearPace();
            return this;
        }

        public Builder clearPaceBs() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearPaceBs();
            return this;
        }

        public Builder clearRepCount() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearRepCount();
            return this;
        }

        public Builder clearRepSpeed() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearRepSpeed();
            return this;
        }

        public Builder clearSegType() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearSegType();
            return this;
        }

        public Builder clearSeqId() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearSeqId();
            return this;
        }

        public Builder clearSkiDistance() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearSkiDistance();
            return this;
        }

        public Builder clearSkiDistanceBs() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearSkiDistanceBs();
            return this;
        }

        public Builder clearSpeed() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearSpeed();
            return this;
        }

        public Builder clearSpeedBs() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearSpeedBs();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearStartTime();
            return this;
        }

        public Builder clearSteps() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearSteps();
            return this;
        }

        public Builder clearSwimType() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearSwimType();
            return this;
        }

        public Builder clearSwolfValue() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearSwolfValue();
            return this;
        }

        public Builder clearTennisServe() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearTennisServe();
            return this;
        }

        public Builder clearUnderHand() {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).clearUnderHand();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getActiveDuration(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getActiveDuration(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getActiveDurationCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getActiveDurationCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getActiveDurationList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getActiveDurationList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getAvgFreq(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getAvgFreq(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getAvgFreqCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getAvgFreqCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getAvgFreqList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getAvgFreqList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getAvgHr(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getAvgHr(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getAvgHrCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getAvgHrCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getAvgHrList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getAvgHrList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getAvgStride(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getAvgStride(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getAvgStrideBs(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getAvgStrideBs(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getAvgStrideBsCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getAvgStrideBsCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getAvgStrideBsList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getAvgStrideBsList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getAvgStrideCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getAvgStrideCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getAvgStrideList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getAvgStrideList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getBackHand(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getBackHand(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getBackHandCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getBackHandCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getBackHandList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getBackHandList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getCal(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getCal(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getCalCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getCalCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getCalList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getCalList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getClimbing(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getClimbing(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getClimbingCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getClimbingCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getClimbingList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getClimbingList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getCurrentHr(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getCurrentHr(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getCurrentHrCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getCurrentHrCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getCurrentHrList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getCurrentHrList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getDescent(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getDescent(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getDescentCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getDescentCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getDescentList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getDescentList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getDistance(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getDistance(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getDistanceBs(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getDistanceBs(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getDistanceBsCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getDistanceBsCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getDistanceBsList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getDistanceBsList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getDistanceCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getDistanceCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getDistanceList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getDistanceList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getDuration(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getDuration(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getDurationCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getDurationCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getDurationList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getDurationList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getEndTime(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getEndTime(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getEndTimeCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getEndTimeCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getEndTimeList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getEndTimeList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getFloors(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getFloors(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getFloorsCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getFloorsCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getFloorsList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getFloorsList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getForeHand(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getForeHand(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getForeHandCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getForeHandCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getForeHandList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getForeHandList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getHrConf(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getHrConf(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getHrConfCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getHrConfCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getHrConfList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getHrConfList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getInterType(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getInterType(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getInterTypeCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getInterTypeCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getInterTypeList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getInterTypeList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getMaxFreq(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getMaxFreq(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getMaxFreqCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getMaxFreqCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getMaxFreqList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getMaxFreqList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getMaxHr(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getMaxHr(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getMaxHrCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getMaxHrCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getMaxHrList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getMaxHrList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getMaxPace(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getMaxPace(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getMaxPaceBs(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getMaxPaceBs(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getMaxPaceBsCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getMaxPaceBsCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getMaxPaceBsList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getMaxPaceBsList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getMaxPaceCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getMaxPaceCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getMaxPaceList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getMaxPaceList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getMaxSpeed(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getMaxSpeed(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getMaxSpeedBs(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getMaxSpeedBs(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getMaxSpeedBsCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getMaxSpeedBsCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getMaxSpeedBsList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getMaxSpeedBsList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getMaxSpeedCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getMaxSpeedCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getMaxSpeedList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getMaxSpeedList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getMinHr(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getMinHr(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getMinHrCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getMinHrCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getMinHrList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getMinHrList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getOverHand(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getOverHand(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getOverHandCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getOverHandCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getOverHandList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getOverHandList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getPace(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getPace(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getPaceBs(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getPaceBs(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getPaceBsCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getPaceBsCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getPaceBsList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getPaceBsList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getPaceCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getPaceCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getPaceList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getPaceList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getRepCount(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getRepCount(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getRepCountCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getRepCountCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getRepCountList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getRepCountList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getRepSpeed(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getRepSpeed(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getRepSpeedCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getRepSpeedCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getRepSpeedList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getRepSpeedList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getSegType(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getSegType(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getSegTypeCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getSegTypeCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getSegTypeList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getSegTypeList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getSeqId(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getSeqId(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getSeqIdCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getSeqIdCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getSeqIdList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getSeqIdList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getSkiDistance(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getSkiDistance(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getSkiDistanceBs(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getSkiDistanceBs(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getSkiDistanceBsCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getSkiDistanceBsCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getSkiDistanceBsList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getSkiDistanceBsList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getSkiDistanceCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getSkiDistanceCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getSkiDistanceList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getSkiDistanceList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getSpeed(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getSpeed(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getSpeedBs(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getSpeedBs(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getSpeedBsCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getSpeedBsCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getSpeedBsList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getSpeedBsList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getSpeedCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getSpeedCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getSpeedList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getSpeedList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getStartTime(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getStartTime(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getStartTimeCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getStartTimeCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getStartTimeList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getStartTimeList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getSteps(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getSteps(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getStepsCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getStepsCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getStepsList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getStepsList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getSwimType(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getSwimType(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getSwimTypeCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getSwimTypeCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getSwimTypeList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getSwimTypeList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getSwolfValue(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getSwolfValue(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getSwolfValueCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getSwolfValueCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getSwolfValueList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getSwolfValueList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getTennisServe(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getTennisServe(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getTennisServeCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getTennisServeCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getTennisServeList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getTennisServeList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getUnderHand(int i) {
            return ((FitnessProtoV2$SegmentData) this.instance).getUnderHand(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public int getUnderHandCount() {
            return ((FitnessProtoV2$SegmentData) this.instance).getUnderHandCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
        public List<Integer> getUnderHandList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SegmentData) this.instance).getUnderHandList());
        }

        public Builder setActiveDuration(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setActiveDuration(i, i2);
            return this;
        }

        public Builder setAvgFreq(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setAvgFreq(i, i2);
            return this;
        }

        public Builder setAvgHr(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setAvgHr(i, i2);
            return this;
        }

        public Builder setAvgStride(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setAvgStride(i, i2);
            return this;
        }

        public Builder setAvgStrideBs(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setAvgStrideBs(i, i2);
            return this;
        }

        public Builder setBackHand(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setBackHand(i, i2);
            return this;
        }

        public Builder setCal(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setCal(i, i2);
            return this;
        }

        public Builder setClimbing(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setClimbing(i, i2);
            return this;
        }

        public Builder setCurrentHr(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setCurrentHr(i, i2);
            return this;
        }

        public Builder setDescent(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setDescent(i, i2);
            return this;
        }

        public Builder setDistance(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setDistance(i, i2);
            return this;
        }

        public Builder setDistanceBs(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setDistanceBs(i, i2);
            return this;
        }

        public Builder setDuration(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setDuration(i, i2);
            return this;
        }

        public Builder setEndTime(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setEndTime(i, i2);
            return this;
        }

        public Builder setFloors(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setFloors(i, i2);
            return this;
        }

        public Builder setForeHand(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setForeHand(i, i2);
            return this;
        }

        public Builder setHrConf(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setHrConf(i, i2);
            return this;
        }

        public Builder setInterType(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setInterType(i, i2);
            return this;
        }

        public Builder setMaxFreq(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setMaxFreq(i, i2);
            return this;
        }

        public Builder setMaxHr(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setMaxHr(i, i2);
            return this;
        }

        public Builder setMaxPace(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setMaxPace(i, i2);
            return this;
        }

        public Builder setMaxPaceBs(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setMaxPaceBs(i, i2);
            return this;
        }

        public Builder setMaxSpeed(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setMaxSpeed(i, i2);
            return this;
        }

        public Builder setMaxSpeedBs(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setMaxSpeedBs(i, i2);
            return this;
        }

        public Builder setMinHr(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setMinHr(i, i2);
            return this;
        }

        public Builder setOverHand(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setOverHand(i, i2);
            return this;
        }

        public Builder setPace(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setPace(i, i2);
            return this;
        }

        public Builder setPaceBs(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setPaceBs(i, i2);
            return this;
        }

        public Builder setRepCount(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setRepCount(i, i2);
            return this;
        }

        public Builder setRepSpeed(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setRepSpeed(i, i2);
            return this;
        }

        public Builder setSegType(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setSegType(i, i2);
            return this;
        }

        public Builder setSeqId(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setSeqId(i, i2);
            return this;
        }

        public Builder setSkiDistance(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setSkiDistance(i, i2);
            return this;
        }

        public Builder setSkiDistanceBs(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setSkiDistanceBs(i, i2);
            return this;
        }

        public Builder setSpeed(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setSpeed(i, i2);
            return this;
        }

        public Builder setSpeedBs(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setSpeedBs(i, i2);
            return this;
        }

        public Builder setStartTime(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setStartTime(i, i2);
            return this;
        }

        public Builder setSteps(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setSteps(i, i2);
            return this;
        }

        public Builder setSwimType(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setSwimType(i, i2);
            return this;
        }

        public Builder setSwolfValue(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setSwolfValue(i, i2);
            return this;
        }

        public Builder setTennisServe(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setTennisServe(i, i2);
            return this;
        }

        public Builder setUnderHand(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SegmentData) this.instance).setUnderHand(i, i2);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$SegmentData.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$SegmentData fitnessProtoV2$SegmentData = new FitnessProtoV2$SegmentData();
        DEFAULT_INSTANCE = fitnessProtoV2$SegmentData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$SegmentData.class, fitnessProtoV2$SegmentData);
    }

    private FitnessProtoV2$SegmentData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addActiveDuration(int i) {
        ensureActiveDurationIsMutable();
        this.activeDuration_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllActiveDuration(Iterable<? extends Integer> iterable) {
        ensureActiveDurationIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.activeDuration_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAvgFreq(Iterable<? extends Integer> iterable) {
        ensureAvgFreqIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.avgFreq_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAvgHr(Iterable<? extends Integer> iterable) {
        ensureAvgHrIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.avgHr_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAvgStride(Iterable<? extends Integer> iterable) {
        ensureAvgStrideIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.avgStride_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAvgStrideBs(Iterable<? extends Integer> iterable) {
        ensureAvgStrideBsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.avgStrideBs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBackHand(Iterable<? extends Integer> iterable) {
        ensureBackHandIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.backHand_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCal(Iterable<? extends Integer> iterable) {
        ensureCalIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.cal_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllClimbing(Iterable<? extends Integer> iterable) {
        ensureClimbingIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.climbing_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCurrentHr(Iterable<? extends Integer> iterable) {
        ensureCurrentHrIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.currentHr_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDescent(Iterable<? extends Integer> iterable) {
        ensureDescentIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.descent_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDistance(Iterable<? extends Integer> iterable) {
        ensureDistanceIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.distance_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDistanceBs(Iterable<? extends Integer> iterable) {
        ensureDistanceBsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.distanceBs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDuration(Iterable<? extends Integer> iterable) {
        ensureDurationIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.duration_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEndTime(Iterable<? extends Integer> iterable) {
        ensureEndTimeIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.endTime_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFloors(Iterable<? extends Integer> iterable) {
        ensureFloorsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.floors_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllForeHand(Iterable<? extends Integer> iterable) {
        ensureForeHandIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.foreHand_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHrConf(Iterable<? extends Integer> iterable) {
        ensureHrConfIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.hrConf_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInterType(Iterable<? extends Integer> iterable) {
        ensureInterTypeIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.interType_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMaxFreq(Iterable<? extends Integer> iterable) {
        ensureMaxFreqIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.maxFreq_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMaxHr(Iterable<? extends Integer> iterable) {
        ensureMaxHrIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.maxHr_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMaxPace(Iterable<? extends Integer> iterable) {
        ensureMaxPaceIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.maxPace_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMaxPaceBs(Iterable<? extends Integer> iterable) {
        ensureMaxPaceBsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.maxPaceBs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMaxSpeed(Iterable<? extends Integer> iterable) {
        ensureMaxSpeedIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.maxSpeed_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMaxSpeedBs(Iterable<? extends Integer> iterable) {
        ensureMaxSpeedBsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.maxSpeedBs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMinHr(Iterable<? extends Integer> iterable) {
        ensureMinHrIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.minHr_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOverHand(Iterable<? extends Integer> iterable) {
        ensureOverHandIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.overHand_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPace(Iterable<? extends Integer> iterable) {
        ensurePaceIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.pace_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaceBs(Iterable<? extends Integer> iterable) {
        ensurePaceBsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.paceBs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRepCount(Iterable<? extends Integer> iterable) {
        ensureRepCountIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.repCount_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRepSpeed(Iterable<? extends Integer> iterable) {
        ensureRepSpeedIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.repSpeed_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSegType(Iterable<? extends Integer> iterable) {
        ensureSegTypeIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.segType_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSeqId(Iterable<? extends Integer> iterable) {
        ensureSeqIdIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.seqId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSkiDistance(Iterable<? extends Integer> iterable) {
        ensureSkiDistanceIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.skiDistance_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSkiDistanceBs(Iterable<? extends Integer> iterable) {
        ensureSkiDistanceBsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.skiDistanceBs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSpeed(Iterable<? extends Integer> iterable) {
        ensureSpeedIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.speed_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSpeedBs(Iterable<? extends Integer> iterable) {
        ensureSpeedBsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.speedBs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStartTime(Iterable<? extends Integer> iterable) {
        ensureStartTimeIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.startTime_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSteps(Iterable<? extends Integer> iterable) {
        ensureStepsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.steps_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSwimType(Iterable<? extends Integer> iterable) {
        ensureSwimTypeIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.swimType_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSwolfValue(Iterable<? extends Integer> iterable) {
        ensureSwolfValueIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.swolfValue_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTennisServe(Iterable<? extends Integer> iterable) {
        ensureTennisServeIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.tennisServe_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUnderHand(Iterable<? extends Integer> iterable) {
        ensureUnderHandIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.underHand_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAvgFreq(int i) {
        ensureAvgFreqIsMutable();
        this.avgFreq_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAvgHr(int i) {
        ensureAvgHrIsMutable();
        this.avgHr_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAvgStride(int i) {
        ensureAvgStrideIsMutable();
        this.avgStride_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAvgStrideBs(int i) {
        ensureAvgStrideBsIsMutable();
        this.avgStrideBs_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBackHand(int i) {
        ensureBackHandIsMutable();
        this.backHand_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCal(int i) {
        ensureCalIsMutable();
        this.cal_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClimbing(int i) {
        ensureClimbingIsMutable();
        this.climbing_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCurrentHr(int i) {
        ensureCurrentHrIsMutable();
        this.currentHr_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDescent(int i) {
        ensureDescentIsMutable();
        this.descent_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDistance(int i) {
        ensureDistanceIsMutable();
        this.distance_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDistanceBs(int i) {
        ensureDistanceBsIsMutable();
        this.distanceBs_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDuration(int i) {
        ensureDurationIsMutable();
        this.duration_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEndTime(int i) {
        ensureEndTimeIsMutable();
        this.endTime_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFloors(int i) {
        ensureFloorsIsMutable();
        this.floors_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addForeHand(int i) {
        ensureForeHandIsMutable();
        this.foreHand_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHrConf(int i) {
        ensureHrConfIsMutable();
        this.hrConf_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInterType(int i) {
        ensureInterTypeIsMutable();
        this.interType_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMaxFreq(int i) {
        ensureMaxFreqIsMutable();
        this.maxFreq_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMaxHr(int i) {
        ensureMaxHrIsMutable();
        this.maxHr_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMaxPace(int i) {
        ensureMaxPaceIsMutable();
        this.maxPace_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMaxPaceBs(int i) {
        ensureMaxPaceBsIsMutable();
        this.maxPaceBs_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMaxSpeed(int i) {
        ensureMaxSpeedIsMutable();
        this.maxSpeed_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMaxSpeedBs(int i) {
        ensureMaxSpeedBsIsMutable();
        this.maxSpeedBs_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMinHr(int i) {
        ensureMinHrIsMutable();
        this.minHr_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOverHand(int i) {
        ensureOverHandIsMutable();
        this.overHand_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPace(int i) {
        ensurePaceIsMutable();
        this.pace_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPaceBs(int i) {
        ensurePaceBsIsMutable();
        this.paceBs_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRepCount(int i) {
        ensureRepCountIsMutable();
        this.repCount_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRepSpeed(int i) {
        ensureRepSpeedIsMutable();
        this.repSpeed_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegType(int i) {
        ensureSegTypeIsMutable();
        this.segType_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSeqId(int i) {
        ensureSeqIdIsMutable();
        this.seqId_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSkiDistance(int i) {
        ensureSkiDistanceIsMutable();
        this.skiDistance_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSkiDistanceBs(int i) {
        ensureSkiDistanceBsIsMutable();
        this.skiDistanceBs_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpeed(int i) {
        ensureSpeedIsMutable();
        this.speed_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpeedBs(int i) {
        ensureSpeedBsIsMutable();
        this.speedBs_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStartTime(int i) {
        ensureStartTimeIsMutable();
        this.startTime_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSteps(int i) {
        ensureStepsIsMutable();
        this.steps_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSwimType(int i) {
        ensureSwimTypeIsMutable();
        this.swimType_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSwolfValue(int i) {
        ensureSwolfValueIsMutable();
        this.swolfValue_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTennisServe(int i) {
        ensureTennisServeIsMutable();
        this.tennisServe_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUnderHand(int i) {
        ensureUnderHandIsMutable();
        this.underHand_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActiveDuration() {
        this.activeDuration_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvgFreq() {
        this.avgFreq_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvgHr() {
        this.avgHr_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvgStride() {
        this.avgStride_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvgStrideBs() {
        this.avgStrideBs_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackHand() {
        this.backHand_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCal() {
        this.cal_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClimbing() {
        this.climbing_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentHr() {
        this.currentHr_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescent() {
        this.descent_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistance() {
        this.distance_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceBs() {
        this.distanceBs_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFloors() {
        this.floors_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForeHand() {
        this.foreHand_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHrConf() {
        this.hrConf_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInterType() {
        this.interType_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxFreq() {
        this.maxFreq_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxHr() {
        this.maxHr_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxPace() {
        this.maxPace_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxPaceBs() {
        this.maxPaceBs_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxSpeed() {
        this.maxSpeed_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxSpeedBs() {
        this.maxSpeedBs_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinHr() {
        this.minHr_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOverHand() {
        this.overHand_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPace() {
        this.pace_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaceBs() {
        this.paceBs_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRepCount() {
        this.repCount_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRepSpeed() {
        this.repSpeed_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegType() {
        this.segType_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeqId() {
        this.seqId_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkiDistance() {
        this.skiDistance_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkiDistanceBs() {
        this.skiDistanceBs_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeed() {
        this.speed_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedBs() {
        this.speedBs_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSteps() {
        this.steps_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwimType() {
        this.swimType_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwolfValue() {
        this.swolfValue_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTennisServe() {
        this.tennisServe_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnderHand() {
        this.underHand_ = GeneratedMessageLite.emptyIntList();
    }

    private void ensureActiveDurationIsMutable() {
        Internal.IntList intList = this.activeDuration_;
        if (intList.isModifiable()) {
            return;
        }
        this.activeDuration_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureAvgFreqIsMutable() {
        Internal.IntList intList = this.avgFreq_;
        if (intList.isModifiable()) {
            return;
        }
        this.avgFreq_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureAvgHrIsMutable() {
        Internal.IntList intList = this.avgHr_;
        if (intList.isModifiable()) {
            return;
        }
        this.avgHr_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureAvgStrideBsIsMutable() {
        Internal.IntList intList = this.avgStrideBs_;
        if (intList.isModifiable()) {
            return;
        }
        this.avgStrideBs_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureAvgStrideIsMutable() {
        Internal.IntList intList = this.avgStride_;
        if (intList.isModifiable()) {
            return;
        }
        this.avgStride_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureBackHandIsMutable() {
        Internal.IntList intList = this.backHand_;
        if (intList.isModifiable()) {
            return;
        }
        this.backHand_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureCalIsMutable() {
        Internal.IntList intList = this.cal_;
        if (intList.isModifiable()) {
            return;
        }
        this.cal_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureClimbingIsMutable() {
        Internal.IntList intList = this.climbing_;
        if (intList.isModifiable()) {
            return;
        }
        this.climbing_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureCurrentHrIsMutable() {
        Internal.IntList intList = this.currentHr_;
        if (intList.isModifiable()) {
            return;
        }
        this.currentHr_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureDescentIsMutable() {
        Internal.IntList intList = this.descent_;
        if (intList.isModifiable()) {
            return;
        }
        this.descent_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureDistanceBsIsMutable() {
        Internal.IntList intList = this.distanceBs_;
        if (intList.isModifiable()) {
            return;
        }
        this.distanceBs_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureDistanceIsMutable() {
        Internal.IntList intList = this.distance_;
        if (intList.isModifiable()) {
            return;
        }
        this.distance_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureDurationIsMutable() {
        Internal.IntList intList = this.duration_;
        if (intList.isModifiable()) {
            return;
        }
        this.duration_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureEndTimeIsMutable() {
        Internal.IntList intList = this.endTime_;
        if (intList.isModifiable()) {
            return;
        }
        this.endTime_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureFloorsIsMutable() {
        Internal.IntList intList = this.floors_;
        if (intList.isModifiable()) {
            return;
        }
        this.floors_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureForeHandIsMutable() {
        Internal.IntList intList = this.foreHand_;
        if (intList.isModifiable()) {
            return;
        }
        this.foreHand_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureHrConfIsMutable() {
        Internal.IntList intList = this.hrConf_;
        if (intList.isModifiable()) {
            return;
        }
        this.hrConf_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureInterTypeIsMutable() {
        Internal.IntList intList = this.interType_;
        if (intList.isModifiable()) {
            return;
        }
        this.interType_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureMaxFreqIsMutable() {
        Internal.IntList intList = this.maxFreq_;
        if (intList.isModifiable()) {
            return;
        }
        this.maxFreq_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureMaxHrIsMutable() {
        Internal.IntList intList = this.maxHr_;
        if (intList.isModifiable()) {
            return;
        }
        this.maxHr_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureMaxPaceBsIsMutable() {
        Internal.IntList intList = this.maxPaceBs_;
        if (intList.isModifiable()) {
            return;
        }
        this.maxPaceBs_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureMaxPaceIsMutable() {
        Internal.IntList intList = this.maxPace_;
        if (intList.isModifiable()) {
            return;
        }
        this.maxPace_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureMaxSpeedBsIsMutable() {
        Internal.IntList intList = this.maxSpeedBs_;
        if (intList.isModifiable()) {
            return;
        }
        this.maxSpeedBs_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureMaxSpeedIsMutable() {
        Internal.IntList intList = this.maxSpeed_;
        if (intList.isModifiable()) {
            return;
        }
        this.maxSpeed_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureMinHrIsMutable() {
        Internal.IntList intList = this.minHr_;
        if (intList.isModifiable()) {
            return;
        }
        this.minHr_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureOverHandIsMutable() {
        Internal.IntList intList = this.overHand_;
        if (intList.isModifiable()) {
            return;
        }
        this.overHand_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensurePaceBsIsMutable() {
        Internal.IntList intList = this.paceBs_;
        if (intList.isModifiable()) {
            return;
        }
        this.paceBs_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensurePaceIsMutable() {
        Internal.IntList intList = this.pace_;
        if (intList.isModifiable()) {
            return;
        }
        this.pace_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureRepCountIsMutable() {
        Internal.IntList intList = this.repCount_;
        if (intList.isModifiable()) {
            return;
        }
        this.repCount_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureRepSpeedIsMutable() {
        Internal.IntList intList = this.repSpeed_;
        if (intList.isModifiable()) {
            return;
        }
        this.repSpeed_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureSegTypeIsMutable() {
        Internal.IntList intList = this.segType_;
        if (intList.isModifiable()) {
            return;
        }
        this.segType_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureSeqIdIsMutable() {
        Internal.IntList intList = this.seqId_;
        if (intList.isModifiable()) {
            return;
        }
        this.seqId_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureSkiDistanceBsIsMutable() {
        Internal.IntList intList = this.skiDistanceBs_;
        if (intList.isModifiable()) {
            return;
        }
        this.skiDistanceBs_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureSkiDistanceIsMutable() {
        Internal.IntList intList = this.skiDistance_;
        if (intList.isModifiable()) {
            return;
        }
        this.skiDistance_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureSpeedBsIsMutable() {
        Internal.IntList intList = this.speedBs_;
        if (intList.isModifiable()) {
            return;
        }
        this.speedBs_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureSpeedIsMutable() {
        Internal.IntList intList = this.speed_;
        if (intList.isModifiable()) {
            return;
        }
        this.speed_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureStartTimeIsMutable() {
        Internal.IntList intList = this.startTime_;
        if (intList.isModifiable()) {
            return;
        }
        this.startTime_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureStepsIsMutable() {
        Internal.IntList intList = this.steps_;
        if (intList.isModifiable()) {
            return;
        }
        this.steps_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureSwimTypeIsMutable() {
        Internal.IntList intList = this.swimType_;
        if (intList.isModifiable()) {
            return;
        }
        this.swimType_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureSwolfValueIsMutable() {
        Internal.IntList intList = this.swolfValue_;
        if (intList.isModifiable()) {
            return;
        }
        this.swolfValue_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureTennisServeIsMutable() {
        Internal.IntList intList = this.tennisServe_;
        if (intList.isModifiable()) {
            return;
        }
        this.tennisServe_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureUnderHandIsMutable() {
        Internal.IntList intList = this.underHand_;
        if (intList.isModifiable()) {
            return;
        }
        this.underHand_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static FitnessProtoV2$SegmentData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$SegmentData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SegmentData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SegmentData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SegmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$SegmentData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveDuration(int i, int i2) {
        ensureActiveDurationIsMutable();
        this.activeDuration_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvgFreq(int i, int i2) {
        ensureAvgFreqIsMutable();
        this.avgFreq_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvgHr(int i, int i2) {
        ensureAvgHrIsMutable();
        this.avgHr_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvgStride(int i, int i2) {
        ensureAvgStrideIsMutable();
        this.avgStride_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvgStrideBs(int i, int i2) {
        ensureAvgStrideBsIsMutable();
        this.avgStrideBs_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackHand(int i, int i2) {
        ensureBackHandIsMutable();
        this.backHand_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCal(int i, int i2) {
        ensureCalIsMutable();
        this.cal_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClimbing(int i, int i2) {
        ensureClimbingIsMutable();
        this.climbing_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentHr(int i, int i2) {
        ensureCurrentHrIsMutable();
        this.currentHr_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescent(int i, int i2) {
        ensureDescentIsMutable();
        this.descent_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistance(int i, int i2) {
        ensureDistanceIsMutable();
        this.distance_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceBs(int i, int i2) {
        ensureDistanceBsIsMutable();
        this.distanceBs_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(int i, int i2) {
        ensureDurationIsMutable();
        this.duration_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(int i, int i2) {
        ensureEndTimeIsMutable();
        this.endTime_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFloors(int i, int i2) {
        ensureFloorsIsMutable();
        this.floors_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForeHand(int i, int i2) {
        ensureForeHandIsMutable();
        this.foreHand_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHrConf(int i, int i2) {
        ensureHrConfIsMutable();
        this.hrConf_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInterType(int i, int i2) {
        ensureInterTypeIsMutable();
        this.interType_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxFreq(int i, int i2) {
        ensureMaxFreqIsMutable();
        this.maxFreq_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxHr(int i, int i2) {
        ensureMaxHrIsMutable();
        this.maxHr_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxPace(int i, int i2) {
        ensureMaxPaceIsMutable();
        this.maxPace_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxPaceBs(int i, int i2) {
        ensureMaxPaceBsIsMutable();
        this.maxPaceBs_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxSpeed(int i, int i2) {
        ensureMaxSpeedIsMutable();
        this.maxSpeed_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxSpeedBs(int i, int i2) {
        ensureMaxSpeedBsIsMutable();
        this.maxSpeedBs_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinHr(int i, int i2) {
        ensureMinHrIsMutable();
        this.minHr_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverHand(int i, int i2) {
        ensureOverHandIsMutable();
        this.overHand_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPace(int i, int i2) {
        ensurePaceIsMutable();
        this.pace_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaceBs(int i, int i2) {
        ensurePaceBsIsMutable();
        this.paceBs_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRepCount(int i, int i2) {
        ensureRepCountIsMutable();
        this.repCount_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRepSpeed(int i, int i2) {
        ensureRepSpeedIsMutable();
        this.repSpeed_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegType(int i, int i2) {
        ensureSegTypeIsMutable();
        this.segType_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeqId(int i, int i2) {
        ensureSeqIdIsMutable();
        this.seqId_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkiDistance(int i, int i2) {
        ensureSkiDistanceIsMutable();
        this.skiDistance_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkiDistanceBs(int i, int i2) {
        ensureSkiDistanceBsIsMutable();
        this.skiDistanceBs_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeed(int i, int i2) {
        ensureSpeedIsMutable();
        this.speed_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedBs(int i, int i2) {
        ensureSpeedBsIsMutable();
        this.speedBs_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i, int i2) {
        ensureStartTimeIsMutable();
        this.startTime_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSteps(int i, int i2) {
        ensureStepsIsMutable();
        this.steps_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwimType(int i, int i2) {
        ensureSwimTypeIsMutable();
        this.swimType_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwolfValue(int i, int i2) {
        ensureSwolfValueIsMutable();
        this.swolfValue_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTennisServe(int i, int i2) {
        ensureTennisServeIsMutable();
        this.tennisServe_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnderHand(int i, int i2) {
        ensureUnderHandIsMutable();
        this.underHand_.setInt(i, i2);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (in7.a[methodToInvoke.ordinal()]) {
            case 1:
                return new FitnessProtoV2$SegmentData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000*\u0000\u0000\u0001**\u0000*\u0000\u0001+\u0002+\u0003+\u0004+\u0005+\u0006+\u0007+\b+\t+\n+\u000b+\f+\r+\u000e+\u000f+\u0010+\u0011+\u0012+\u0013+\u0014+\u0015+\u0016+\u0017+\u0018+\u0019+\u001a+\u001b+\u001c+\u001d+\u001e+\u001f+ +!+\"+#+$+%+&+'+(+)+*+", new Object[]{"segType_", "interType_", "duration_", "activeDuration_", "startTime_", "endTime_", "currentHr_", "hrConf_", "maxHr_", "avgHr_", "minHr_", "steps_", "avgFreq_", "maxFreq_", "avgStride_", "avgStrideBs_", "distance_", "distanceBs_", "skiDistance_", "skiDistanceBs_", "pace_", "paceBs_", "maxPace_", "maxPaceBs_", "speed_", "speedBs_", "maxSpeed_", "maxSpeedBs_", "repCount_", "repSpeed_", "cal_", "climbing_", "descent_", "foreHand_", "backHand_", "overHand_", "underHand_", "tennisServe_", "swimType_", "swolfValue_", "seqId_", "floors_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$SegmentData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$SegmentData.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getActiveDuration(int i) {
        return this.activeDuration_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getActiveDurationCount() {
        return this.activeDuration_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getActiveDurationList() {
        return this.activeDuration_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getAvgFreq(int i) {
        return this.avgFreq_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getAvgFreqCount() {
        return this.avgFreq_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getAvgFreqList() {
        return this.avgFreq_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getAvgHr(int i) {
        return this.avgHr_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getAvgHrCount() {
        return this.avgHr_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getAvgHrList() {
        return this.avgHr_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getAvgStride(int i) {
        return this.avgStride_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getAvgStrideBs(int i) {
        return this.avgStrideBs_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getAvgStrideBsCount() {
        return this.avgStrideBs_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getAvgStrideBsList() {
        return this.avgStrideBs_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getAvgStrideCount() {
        return this.avgStride_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getAvgStrideList() {
        return this.avgStride_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getBackHand(int i) {
        return this.backHand_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getBackHandCount() {
        return this.backHand_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getBackHandList() {
        return this.backHand_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getCal(int i) {
        return this.cal_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getCalCount() {
        return this.cal_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getCalList() {
        return this.cal_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getClimbing(int i) {
        return this.climbing_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getClimbingCount() {
        return this.climbing_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getClimbingList() {
        return this.climbing_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getCurrentHr(int i) {
        return this.currentHr_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getCurrentHrCount() {
        return this.currentHr_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getCurrentHrList() {
        return this.currentHr_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getDescent(int i) {
        return this.descent_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getDescentCount() {
        return this.descent_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getDescentList() {
        return this.descent_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getDistance(int i) {
        return this.distance_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getDistanceBs(int i) {
        return this.distanceBs_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getDistanceBsCount() {
        return this.distanceBs_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getDistanceBsList() {
        return this.distanceBs_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getDistanceCount() {
        return this.distance_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getDistanceList() {
        return this.distance_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getDuration(int i) {
        return this.duration_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getDurationCount() {
        return this.duration_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getDurationList() {
        return this.duration_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getEndTime(int i) {
        return this.endTime_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getEndTimeCount() {
        return this.endTime_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getEndTimeList() {
        return this.endTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getFloors(int i) {
        return this.floors_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getFloorsCount() {
        return this.floors_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getFloorsList() {
        return this.floors_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getForeHand(int i) {
        return this.foreHand_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getForeHandCount() {
        return this.foreHand_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getForeHandList() {
        return this.foreHand_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getHrConf(int i) {
        return this.hrConf_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getHrConfCount() {
        return this.hrConf_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getHrConfList() {
        return this.hrConf_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getInterType(int i) {
        return this.interType_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getInterTypeCount() {
        return this.interType_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getInterTypeList() {
        return this.interType_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getMaxFreq(int i) {
        return this.maxFreq_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getMaxFreqCount() {
        return this.maxFreq_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getMaxFreqList() {
        return this.maxFreq_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getMaxHr(int i) {
        return this.maxHr_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getMaxHrCount() {
        return this.maxHr_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getMaxHrList() {
        return this.maxHr_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getMaxPace(int i) {
        return this.maxPace_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getMaxPaceBs(int i) {
        return this.maxPaceBs_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getMaxPaceBsCount() {
        return this.maxPaceBs_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getMaxPaceBsList() {
        return this.maxPaceBs_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getMaxPaceCount() {
        return this.maxPace_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getMaxPaceList() {
        return this.maxPace_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getMaxSpeed(int i) {
        return this.maxSpeed_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getMaxSpeedBs(int i) {
        return this.maxSpeedBs_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getMaxSpeedBsCount() {
        return this.maxSpeedBs_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getMaxSpeedBsList() {
        return this.maxSpeedBs_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getMaxSpeedCount() {
        return this.maxSpeed_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getMaxSpeedList() {
        return this.maxSpeed_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getMinHr(int i) {
        return this.minHr_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getMinHrCount() {
        return this.minHr_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getMinHrList() {
        return this.minHr_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getOverHand(int i) {
        return this.overHand_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getOverHandCount() {
        return this.overHand_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getOverHandList() {
        return this.overHand_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getPace(int i) {
        return this.pace_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getPaceBs(int i) {
        return this.paceBs_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getPaceBsCount() {
        return this.paceBs_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getPaceBsList() {
        return this.paceBs_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getPaceCount() {
        return this.pace_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getPaceList() {
        return this.pace_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getRepCount(int i) {
        return this.repCount_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getRepCountCount() {
        return this.repCount_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getRepCountList() {
        return this.repCount_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getRepSpeed(int i) {
        return this.repSpeed_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getRepSpeedCount() {
        return this.repSpeed_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getRepSpeedList() {
        return this.repSpeed_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getSegType(int i) {
        return this.segType_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getSegTypeCount() {
        return this.segType_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getSegTypeList() {
        return this.segType_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getSeqId(int i) {
        return this.seqId_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getSeqIdCount() {
        return this.seqId_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getSeqIdList() {
        return this.seqId_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getSkiDistance(int i) {
        return this.skiDistance_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getSkiDistanceBs(int i) {
        return this.skiDistanceBs_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getSkiDistanceBsCount() {
        return this.skiDistanceBs_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getSkiDistanceBsList() {
        return this.skiDistanceBs_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getSkiDistanceCount() {
        return this.skiDistance_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getSkiDistanceList() {
        return this.skiDistance_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getSpeed(int i) {
        return this.speed_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getSpeedBs(int i) {
        return this.speedBs_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getSpeedBsCount() {
        return this.speedBs_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getSpeedBsList() {
        return this.speedBs_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getSpeedCount() {
        return this.speed_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getSpeedList() {
        return this.speed_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getStartTime(int i) {
        return this.startTime_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getStartTimeCount() {
        return this.startTime_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getStartTimeList() {
        return this.startTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getSteps(int i) {
        return this.steps_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getStepsCount() {
        return this.steps_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getStepsList() {
        return this.steps_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getSwimType(int i) {
        return this.swimType_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getSwimTypeCount() {
        return this.swimType_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getSwimTypeList() {
        return this.swimType_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getSwolfValue(int i) {
        return this.swolfValue_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getSwolfValueCount() {
        return this.swolfValue_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getSwolfValueList() {
        return this.swolfValue_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getTennisServe(int i) {
        return this.tennisServe_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getTennisServeCount() {
        return this.tennisServe_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getTennisServeList() {
        return this.tennisServe_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getUnderHand(int i) {
        return this.underHand_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public int getUnderHandCount() {
        return this.underHand_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SegmentDataOrBuilder
    public List<Integer> getUnderHandList() {
        return this.underHand_;
    }

    public static Builder newBuilder(FitnessProtoV2$SegmentData fitnessProtoV2$SegmentData) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$SegmentData);
    }

    public static FitnessProtoV2$SegmentData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SegmentData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SegmentData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SegmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$SegmentData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SegmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$SegmentData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SegmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$SegmentData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SegmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$SegmentData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SegmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$SegmentData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SegmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SegmentData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SegmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SegmentData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$SegmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$SegmentData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SegmentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
