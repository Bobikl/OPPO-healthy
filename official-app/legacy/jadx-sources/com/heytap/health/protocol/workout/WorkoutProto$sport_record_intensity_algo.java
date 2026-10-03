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
public final class WorkoutProto$sport_record_intensity_algo extends GeneratedMessageLite<WorkoutProto$sport_record_intensity_algo, Builder> implements WorkoutProto$sport_record_intensity_algoOrBuilder {
    public static final int ALGO_INTENSITY_FIELD_NUMBER = 3;
    private static final WorkoutProto$sport_record_intensity_algo DEFAULT_INSTANCE;
    public static final int FLASH_ID_FIELD_NUMBER = 2;
    private static volatile Parser<WorkoutProto$sport_record_intensity_algo> PARSER = null;
    public static final int RESULT_INFO_FIELD_NUMBER = 1;
    public static final int TRAINLOAD_FIELD_NUMBER = 4;
    private int algoIntensity_;
    private int flashId_;
    private int resultInfo_;
    private int trainload_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$sport_record_intensity_algo, Builder> implements WorkoutProto$sport_record_intensity_algoOrBuilder {
        public Builder clearAlgoIntensity() {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_algo) this.instance).clearAlgoIntensity();
            return this;
        }

        public Builder clearFlashId() {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_algo) this.instance).clearFlashId();
            return this;
        }

        public Builder clearResultInfo() {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_algo) this.instance).clearResultInfo();
            return this;
        }

        public Builder clearTrainload() {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_algo) this.instance).clearTrainload();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_algoOrBuilder
        public int getAlgoIntensity() {
            return ((WorkoutProto$sport_record_intensity_algo) this.instance).getAlgoIntensity();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_algoOrBuilder
        public int getFlashId() {
            return ((WorkoutProto$sport_record_intensity_algo) this.instance).getFlashId();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_algoOrBuilder
        public int getResultInfo() {
            return ((WorkoutProto$sport_record_intensity_algo) this.instance).getResultInfo();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_algoOrBuilder
        public int getTrainload() {
            return ((WorkoutProto$sport_record_intensity_algo) this.instance).getTrainload();
        }

        public Builder setAlgoIntensity(int i) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_algo) this.instance).setAlgoIntensity(i);
            return this;
        }

        public Builder setFlashId(int i) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_algo) this.instance).setFlashId(i);
            return this;
        }

        public Builder setResultInfo(int i) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_algo) this.instance).setResultInfo(i);
            return this;
        }

        public Builder setTrainload(int i) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_algo) this.instance).setTrainload(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$sport_record_intensity_algo.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$sport_record_intensity_algo workoutProto$sport_record_intensity_algo = new WorkoutProto$sport_record_intensity_algo();
        DEFAULT_INSTANCE = workoutProto$sport_record_intensity_algo;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$sport_record_intensity_algo.class, workoutProto$sport_record_intensity_algo);
    }

    private WorkoutProto$sport_record_intensity_algo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlgoIntensity() {
        this.algoIntensity_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlashId() {
        this.flashId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResultInfo() {
        this.resultInfo_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrainload() {
        this.trainload_ = 0;
    }

    public static WorkoutProto$sport_record_intensity_algo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$sport_record_intensity_algo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$sport_record_intensity_algo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$sport_record_intensity_algo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_record_intensity_algo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$sport_record_intensity_algo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlgoIntensity(int i) {
        this.algoIntensity_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlashId(int i) {
        this.flashId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultInfo(int i) {
        this.resultInfo_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrainload(int i) {
        this.trainload_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$sport_record_intensity_algo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000f\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"resultInfo_", "flashId_", "algoIntensity_", "trainload_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$sport_record_intensity_algo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$sport_record_intensity_algo.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_algoOrBuilder
    public int getAlgoIntensity() {
        return this.algoIntensity_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_algoOrBuilder
    public int getFlashId() {
        return this.flashId_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_algoOrBuilder
    public int getResultInfo() {
        return this.resultInfo_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_algoOrBuilder
    public int getTrainload() {
        return this.trainload_;
    }

    public static Builder newBuilder(WorkoutProto$sport_record_intensity_algo workoutProto$sport_record_intensity_algo) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$sport_record_intensity_algo);
    }

    public static WorkoutProto$sport_record_intensity_algo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$sport_record_intensity_algo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$sport_record_intensity_algo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_record_intensity_algo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$sport_record_intensity_algo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_record_intensity_algo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$sport_record_intensity_algo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_record_intensity_algo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$sport_record_intensity_algo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_record_intensity_algo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$sport_record_intensity_algo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_record_intensity_algo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$sport_record_intensity_algo parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$sport_record_intensity_algo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$sport_record_intensity_algo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$sport_record_intensity_algo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$sport_record_intensity_algo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$sport_record_intensity_algo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$sport_record_intensity_algo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$sport_record_intensity_algo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
