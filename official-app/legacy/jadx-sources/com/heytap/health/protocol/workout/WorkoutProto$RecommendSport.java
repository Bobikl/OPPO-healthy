package com.heytap.health.protocol.workout;

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
public final class WorkoutProto$RecommendSport extends GeneratedMessageLite<WorkoutProto$RecommendSport, Builder> implements WorkoutProto$RecommendSportOrBuilder {
    private static final WorkoutProto$RecommendSport DEFAULT_INSTANCE;
    private static volatile Parser<WorkoutProto$RecommendSport> PARSER = null;
    public static final int SPORTDURATION_FIELD_NUMBER = 2;
    public static final int SPORTHRSECTION_FIELD_NUMBER = 3;
    public static final int SPORTTYPE_FIELD_NUMBER = 1;
    private int sportDuration_;
    private int sportHrSection_;
    private int sportType_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$RecommendSport, Builder> implements WorkoutProto$RecommendSportOrBuilder {
        public Builder clearSportDuration() {
            copyOnWrite();
            ((WorkoutProto$RecommendSport) this.instance).clearSportDuration();
            return this;
        }

        public Builder clearSportHrSection() {
            copyOnWrite();
            ((WorkoutProto$RecommendSport) this.instance).clearSportHrSection();
            return this;
        }

        public Builder clearSportType() {
            copyOnWrite();
            ((WorkoutProto$RecommendSport) this.instance).clearSportType();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$RecommendSportOrBuilder
        public int getSportDuration() {
            return ((WorkoutProto$RecommendSport) this.instance).getSportDuration();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$RecommendSportOrBuilder
        public int getSportHrSection() {
            return ((WorkoutProto$RecommendSport) this.instance).getSportHrSection();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$RecommendSportOrBuilder
        public int getSportType() {
            return ((WorkoutProto$RecommendSport) this.instance).getSportType();
        }

        public Builder setSportDuration(int i) {
            copyOnWrite();
            ((WorkoutProto$RecommendSport) this.instance).setSportDuration(i);
            return this;
        }

        public Builder setSportHrSection(int i) {
            copyOnWrite();
            ((WorkoutProto$RecommendSport) this.instance).setSportHrSection(i);
            return this;
        }

        public Builder setSportType(int i) {
            copyOnWrite();
            ((WorkoutProto$RecommendSport) this.instance).setSportType(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$RecommendSport.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$RecommendSport workoutProto$RecommendSport = new WorkoutProto$RecommendSport();
        DEFAULT_INSTANCE = workoutProto$RecommendSport;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$RecommendSport.class, workoutProto$RecommendSport);
    }

    private WorkoutProto$RecommendSport() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportDuration() {
        this.sportDuration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportHrSection() {
        this.sportHrSection_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportType() {
        this.sportType_ = 0;
    }

    public static WorkoutProto$RecommendSport getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$RecommendSport parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$RecommendSport) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$RecommendSport parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$RecommendSport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$RecommendSport> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportDuration(int i) {
        this.sportDuration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportHrSection(int i) {
        this.sportHrSection_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportType(int i) {
        this.sportType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$RecommendSport();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"sportType_", "sportDuration_", "sportHrSection_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$RecommendSport> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$RecommendSport.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$RecommendSportOrBuilder
    public int getSportDuration() {
        return this.sportDuration_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$RecommendSportOrBuilder
    public int getSportHrSection() {
        return this.sportHrSection_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$RecommendSportOrBuilder
    public int getSportType() {
        return this.sportType_;
    }

    public static Builder newBuilder(WorkoutProto$RecommendSport workoutProto$RecommendSport) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$RecommendSport);
    }

    public static WorkoutProto$RecommendSport parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$RecommendSport) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$RecommendSport parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$RecommendSport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$RecommendSport parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$RecommendSport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$RecommendSport parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$RecommendSport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$RecommendSport parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$RecommendSport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$RecommendSport parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$RecommendSport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$RecommendSport parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$RecommendSport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$RecommendSport parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$RecommendSport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$RecommendSport parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$RecommendSport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$RecommendSport parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$RecommendSport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
