package com.heytap.health.protocol.workout;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.yzl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class WorkoutProto$RecoveryHeartRate extends GeneratedMessageLite<WorkoutProto$RecoveryHeartRate, Builder> implements WorkoutProto$RecoveryHeartRateOrBuilder {
    private static final WorkoutProto$RecoveryHeartRate DEFAULT_INSTANCE;
    public static final int HEART_RATE_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    private static volatile Parser<WorkoutProto$RecoveryHeartRate> PARSER = null;
    public static final int SPORTS_END_TIME_FIELD_NUMBER = 3;
    public static final int SPORTS_START_TIME_FIELD_NUMBER = 2;
    public static final int SPORT_TYPE_FIELD_NUMBER = 1;
    public static final int START_TIME_FIELD_NUMBER = 4;
    private int sportType_;
    private int sportsEndTime_;
    private int sportsStartTime_;
    private int startTime_;
    private int offsetMemoizedSerializedSize = -1;
    private ByteString heartRate_ = ByteString.EMPTY;
    private Internal.IntList offset_ = GeneratedMessageLite.emptyIntList();

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$RecoveryHeartRate, Builder> implements WorkoutProto$RecoveryHeartRateOrBuilder {
        public Builder addAllOffset(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((WorkoutProto$RecoveryHeartRate) this.instance).addAllOffset(iterable);
            return this;
        }

        public Builder addOffset(int i) {
            copyOnWrite();
            ((WorkoutProto$RecoveryHeartRate) this.instance).addOffset(i);
            return this;
        }

        public Builder clearHeartRate() {
            copyOnWrite();
            ((WorkoutProto$RecoveryHeartRate) this.instance).clearHeartRate();
            return this;
        }

        public Builder clearOffset() {
            copyOnWrite();
            ((WorkoutProto$RecoveryHeartRate) this.instance).clearOffset();
            return this;
        }

        public Builder clearSportType() {
            copyOnWrite();
            ((WorkoutProto$RecoveryHeartRate) this.instance).clearSportType();
            return this;
        }

        public Builder clearSportsEndTime() {
            copyOnWrite();
            ((WorkoutProto$RecoveryHeartRate) this.instance).clearSportsEndTime();
            return this;
        }

        public Builder clearSportsStartTime() {
            copyOnWrite();
            ((WorkoutProto$RecoveryHeartRate) this.instance).clearSportsStartTime();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((WorkoutProto$RecoveryHeartRate) this.instance).clearStartTime();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$RecoveryHeartRateOrBuilder
        public ByteString getHeartRate() {
            return ((WorkoutProto$RecoveryHeartRate) this.instance).getHeartRate();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$RecoveryHeartRateOrBuilder
        public int getOffset(int i) {
            return ((WorkoutProto$RecoveryHeartRate) this.instance).getOffset(i);
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$RecoveryHeartRateOrBuilder
        public int getOffsetCount() {
            return ((WorkoutProto$RecoveryHeartRate) this.instance).getOffsetCount();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$RecoveryHeartRateOrBuilder
        public List<Integer> getOffsetList() {
            return Collections.unmodifiableList(((WorkoutProto$RecoveryHeartRate) this.instance).getOffsetList());
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$RecoveryHeartRateOrBuilder
        public int getSportType() {
            return ((WorkoutProto$RecoveryHeartRate) this.instance).getSportType();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$RecoveryHeartRateOrBuilder
        public int getSportsEndTime() {
            return ((WorkoutProto$RecoveryHeartRate) this.instance).getSportsEndTime();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$RecoveryHeartRateOrBuilder
        public int getSportsStartTime() {
            return ((WorkoutProto$RecoveryHeartRate) this.instance).getSportsStartTime();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$RecoveryHeartRateOrBuilder
        public int getStartTime() {
            return ((WorkoutProto$RecoveryHeartRate) this.instance).getStartTime();
        }

        public Builder setHeartRate(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$RecoveryHeartRate) this.instance).setHeartRate(byteString);
            return this;
        }

        public Builder setOffset(int i, int i2) {
            copyOnWrite();
            ((WorkoutProto$RecoveryHeartRate) this.instance).setOffset(i, i2);
            return this;
        }

        public Builder setSportType(int i) {
            copyOnWrite();
            ((WorkoutProto$RecoveryHeartRate) this.instance).setSportType(i);
            return this;
        }

        public Builder setSportsEndTime(int i) {
            copyOnWrite();
            ((WorkoutProto$RecoveryHeartRate) this.instance).setSportsEndTime(i);
            return this;
        }

        public Builder setSportsStartTime(int i) {
            copyOnWrite();
            ((WorkoutProto$RecoveryHeartRate) this.instance).setSportsStartTime(i);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((WorkoutProto$RecoveryHeartRate) this.instance).setStartTime(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$RecoveryHeartRate.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$RecoveryHeartRate workoutProto$RecoveryHeartRate = new WorkoutProto$RecoveryHeartRate();
        DEFAULT_INSTANCE = workoutProto$RecoveryHeartRate;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$RecoveryHeartRate.class, workoutProto$RecoveryHeartRate);
    }

    private WorkoutProto$RecoveryHeartRate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOffset(Iterable<? extends Integer> iterable) {
        ensureOffsetIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.offset_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOffset(int i) {
        ensureOffsetIsMutable();
        this.offset_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRate() {
        this.heartRate_ = getDefaultInstance().getHeartRate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffset() {
        this.offset_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportType() {
        this.sportType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportsEndTime() {
        this.sportsEndTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportsStartTime() {
        this.sportsStartTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    private void ensureOffsetIsMutable() {
        Internal.IntList intList = this.offset_;
        if (intList.isModifiable()) {
            return;
        }
        this.offset_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static WorkoutProto$RecoveryHeartRate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$RecoveryHeartRate parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$RecoveryHeartRate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$RecoveryHeartRate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$RecoveryHeartRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$RecoveryHeartRate> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRate(ByteString byteString) {
        byteString.getClass();
        this.heartRate_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffset(int i, int i2) {
        ensureOffsetIsMutable();
        this.offset_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportType(int i) {
        this.sportType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportsEndTime(int i) {
        this.sportsEndTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportsStartTime(int i) {
        this.sportsStartTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$RecoveryHeartRate();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0004\u0002\u000b\u0003\u000b\u0004\u000b\u0005\n\u0006'", new Object[]{"sportType_", "sportsStartTime_", "sportsEndTime_", "startTime_", "heartRate_", "offset_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$RecoveryHeartRate> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$RecoveryHeartRate.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$RecoveryHeartRateOrBuilder
    public ByteString getHeartRate() {
        return this.heartRate_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$RecoveryHeartRateOrBuilder
    public int getOffset(int i) {
        return this.offset_.getInt(i);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$RecoveryHeartRateOrBuilder
    public int getOffsetCount() {
        return this.offset_.size();
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$RecoveryHeartRateOrBuilder
    public List<Integer> getOffsetList() {
        return this.offset_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$RecoveryHeartRateOrBuilder
    public int getSportType() {
        return this.sportType_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$RecoveryHeartRateOrBuilder
    public int getSportsEndTime() {
        return this.sportsEndTime_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$RecoveryHeartRateOrBuilder
    public int getSportsStartTime() {
        return this.sportsStartTime_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$RecoveryHeartRateOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    public static Builder newBuilder(WorkoutProto$RecoveryHeartRate workoutProto$RecoveryHeartRate) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$RecoveryHeartRate);
    }

    public static WorkoutProto$RecoveryHeartRate parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$RecoveryHeartRate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$RecoveryHeartRate parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$RecoveryHeartRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$RecoveryHeartRate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$RecoveryHeartRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$RecoveryHeartRate parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$RecoveryHeartRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$RecoveryHeartRate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$RecoveryHeartRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$RecoveryHeartRate parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$RecoveryHeartRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$RecoveryHeartRate parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$RecoveryHeartRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$RecoveryHeartRate parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$RecoveryHeartRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$RecoveryHeartRate parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$RecoveryHeartRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$RecoveryHeartRate parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$RecoveryHeartRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
