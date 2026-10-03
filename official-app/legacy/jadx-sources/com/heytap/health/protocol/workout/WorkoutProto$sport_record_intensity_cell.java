package com.heytap.health.protocol.workout;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.yzl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class WorkoutProto$sport_record_intensity_cell extends GeneratedMessageLite<WorkoutProto$sport_record_intensity_cell, Builder> implements WorkoutProto$sport_record_intensity_cellOrBuilder {
    public static final int ALGO_INFO_FIELD_NUMBER = 6;
    private static final WorkoutProto$sport_record_intensity_cell DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 8;
    private static volatile Parser<WorkoutProto$sport_record_intensity_cell> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 2;
    public static final int SPORTS_START_TIME_FIELD_NUMBER = 3;
    public static final int SPORT_TYPE_FIELD_NUMBER = 4;
    public static final int SPORT_UUID_FIELD_NUMBER = 7;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int USER_INTENSITY_FIELD_NUMBER = 5;
    private WorkoutProto$sport_record_intensity_algo algoInfo_;
    private int bitField0_;
    private int duration_;
    private int source_;
    private int sportType_;
    private String sportUuid_ = "";
    private int sportsStartTime_;
    private int timestamp_;
    private int userIntensity_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$sport_record_intensity_cell, Builder> implements WorkoutProto$sport_record_intensity_cellOrBuilder {
        public Builder clearAlgoInfo() {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_cell) this.instance).clearAlgoInfo();
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_cell) this.instance).clearDuration();
            return this;
        }

        public Builder clearSource() {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_cell) this.instance).clearSource();
            return this;
        }

        public Builder clearSportType() {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_cell) this.instance).clearSportType();
            return this;
        }

        public Builder clearSportUuid() {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_cell) this.instance).clearSportUuid();
            return this;
        }

        public Builder clearSportsStartTime() {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_cell) this.instance).clearSportsStartTime();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_cell) this.instance).clearTimestamp();
            return this;
        }

        public Builder clearUserIntensity() {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_cell) this.instance).clearUserIntensity();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
        public WorkoutProto$sport_record_intensity_algo getAlgoInfo() {
            return ((WorkoutProto$sport_record_intensity_cell) this.instance).getAlgoInfo();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
        public int getDuration() {
            return ((WorkoutProto$sport_record_intensity_cell) this.instance).getDuration();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
        public WorkoutProto$MODIFY_SOURCE_LOAD getSource() {
            return ((WorkoutProto$sport_record_intensity_cell) this.instance).getSource();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
        public int getSourceValue() {
            return ((WorkoutProto$sport_record_intensity_cell) this.instance).getSourceValue();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
        public int getSportType() {
            return ((WorkoutProto$sport_record_intensity_cell) this.instance).getSportType();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
        public String getSportUuid() {
            return ((WorkoutProto$sport_record_intensity_cell) this.instance).getSportUuid();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
        public ByteString getSportUuidBytes() {
            return ((WorkoutProto$sport_record_intensity_cell) this.instance).getSportUuidBytes();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
        public int getSportsStartTime() {
            return ((WorkoutProto$sport_record_intensity_cell) this.instance).getSportsStartTime();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
        public int getTimestamp() {
            return ((WorkoutProto$sport_record_intensity_cell) this.instance).getTimestamp();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
        public int getUserIntensity() {
            return ((WorkoutProto$sport_record_intensity_cell) this.instance).getUserIntensity();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
        public boolean hasAlgoInfo() {
            return ((WorkoutProto$sport_record_intensity_cell) this.instance).hasAlgoInfo();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
        public boolean hasSportUuid() {
            return ((WorkoutProto$sport_record_intensity_cell) this.instance).hasSportUuid();
        }

        public Builder mergeAlgoInfo(WorkoutProto$sport_record_intensity_algo workoutProto$sport_record_intensity_algo) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_cell) this.instance).mergeAlgoInfo(workoutProto$sport_record_intensity_algo);
            return this;
        }

        public Builder setAlgoInfo(WorkoutProto$sport_record_intensity_algo workoutProto$sport_record_intensity_algo) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_cell) this.instance).setAlgoInfo(workoutProto$sport_record_intensity_algo);
            return this;
        }

        public Builder setDuration(int i) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_cell) this.instance).setDuration(i);
            return this;
        }

        public Builder setSource(WorkoutProto$MODIFY_SOURCE_LOAD workoutProto$MODIFY_SOURCE_LOAD) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_cell) this.instance).setSource(workoutProto$MODIFY_SOURCE_LOAD);
            return this;
        }

        public Builder setSourceValue(int i) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_cell) this.instance).setSourceValue(i);
            return this;
        }

        public Builder setSportType(int i) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_cell) this.instance).setSportType(i);
            return this;
        }

        public Builder setSportUuid(String str) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_cell) this.instance).setSportUuid(str);
            return this;
        }

        public Builder setSportUuidBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_cell) this.instance).setSportUuidBytes(byteString);
            return this;
        }

        public Builder setSportsStartTime(int i) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_cell) this.instance).setSportsStartTime(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_cell) this.instance).setTimestamp(i);
            return this;
        }

        public Builder setUserIntensity(int i) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_cell) this.instance).setUserIntensity(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$sport_record_intensity_cell.DEFAULT_INSTANCE);
        }

        public Builder setAlgoInfo(WorkoutProto$sport_record_intensity_algo.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_cell) this.instance).setAlgoInfo(builder.build());
            return this;
        }
    }

    static {
        WorkoutProto$sport_record_intensity_cell workoutProto$sport_record_intensity_cell = new WorkoutProto$sport_record_intensity_cell();
        DEFAULT_INSTANCE = workoutProto$sport_record_intensity_cell;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$sport_record_intensity_cell.class, workoutProto$sport_record_intensity_cell);
    }

    private WorkoutProto$sport_record_intensity_cell() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlgoInfo() {
        this.algoInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportType() {
        this.sportType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportUuid() {
        this.bitField0_ &= -3;
        this.sportUuid_ = getDefaultInstance().getSportUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportsStartTime() {
        this.sportsStartTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserIntensity() {
        this.userIntensity_ = 0;
    }

    public static WorkoutProto$sport_record_intensity_cell getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlgoInfo(WorkoutProto$sport_record_intensity_algo workoutProto$sport_record_intensity_algo) {
        workoutProto$sport_record_intensity_algo.getClass();
        WorkoutProto$sport_record_intensity_algo workoutProto$sport_record_intensity_algo2 = this.algoInfo_;
        if (workoutProto$sport_record_intensity_algo2 == null || workoutProto$sport_record_intensity_algo2 == WorkoutProto$sport_record_intensity_algo.getDefaultInstance()) {
            this.algoInfo_ = workoutProto$sport_record_intensity_algo;
        } else {
            this.algoInfo_ = WorkoutProto$sport_record_intensity_algo.newBuilder(this.algoInfo_).mergeFrom(workoutProto$sport_record_intensity_algo).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$sport_record_intensity_cell parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$sport_record_intensity_cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$sport_record_intensity_cell parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_record_intensity_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$sport_record_intensity_cell> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlgoInfo(WorkoutProto$sport_record_intensity_algo workoutProto$sport_record_intensity_algo) {
        workoutProto$sport_record_intensity_algo.getClass();
        this.algoInfo_ = workoutProto$sport_record_intensity_algo;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(int i) {
        this.duration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(WorkoutProto$MODIFY_SOURCE_LOAD workoutProto$MODIFY_SOURCE_LOAD) {
        this.source_ = workoutProto$MODIFY_SOURCE_LOAD.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i) {
        this.source_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportType(int i) {
        this.sportType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportUuid(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sportUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportUuidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sportUuid_ = byteString.toStringUtf8();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportsStartTime(int i) {
        this.sportsStartTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserIntensity(int i) {
        this.userIntensity_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$sport_record_intensity_cell();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003\u000b\u0004\u000b\u0005\u000b\u0006ဉ\u0000\u0007ለ\u0001\b\u000b", new Object[]{"bitField0_", "timestamp_", "source_", "sportsStartTime_", "sportType_", "userIntensity_", "algoInfo_", "sportUuid_", "duration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$sport_record_intensity_cell> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$sport_record_intensity_cell.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
    public WorkoutProto$sport_record_intensity_algo getAlgoInfo() {
        WorkoutProto$sport_record_intensity_algo workoutProto$sport_record_intensity_algo = this.algoInfo_;
        return workoutProto$sport_record_intensity_algo == null ? WorkoutProto$sport_record_intensity_algo.getDefaultInstance() : workoutProto$sport_record_intensity_algo;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
    public int getDuration() {
        return this.duration_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
    public WorkoutProto$MODIFY_SOURCE_LOAD getSource() {
        WorkoutProto$MODIFY_SOURCE_LOAD workoutProto$MODIFY_SOURCE_LOADForNumber = WorkoutProto$MODIFY_SOURCE_LOAD.forNumber(this.source_);
        return workoutProto$MODIFY_SOURCE_LOADForNumber == null ? WorkoutProto$MODIFY_SOURCE_LOAD.UNRECOGNIZED : workoutProto$MODIFY_SOURCE_LOADForNumber;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
    public int getSourceValue() {
        return this.source_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
    public int getSportType() {
        return this.sportType_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
    public String getSportUuid() {
        return this.sportUuid_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
    public ByteString getSportUuidBytes() {
        return ByteString.copyFromUtf8(this.sportUuid_);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
    public int getSportsStartTime() {
        return this.sportsStartTime_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
    public int getUserIntensity() {
        return this.userIntensity_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
    public boolean hasAlgoInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_cellOrBuilder
    public boolean hasSportUuid() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(WorkoutProto$sport_record_intensity_cell workoutProto$sport_record_intensity_cell) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$sport_record_intensity_cell);
    }

    public static WorkoutProto$sport_record_intensity_cell parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$sport_record_intensity_cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$sport_record_intensity_cell parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_record_intensity_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$sport_record_intensity_cell parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_record_intensity_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$sport_record_intensity_cell parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_record_intensity_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$sport_record_intensity_cell parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_record_intensity_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$sport_record_intensity_cell parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_record_intensity_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$sport_record_intensity_cell parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$sport_record_intensity_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$sport_record_intensity_cell parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$sport_record_intensity_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$sport_record_intensity_cell parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$sport_record_intensity_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$sport_record_intensity_cell parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$sport_record_intensity_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
