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
public final class WorkoutProto$exercise_load_ratio extends GeneratedMessageLite<WorkoutProto$exercise_load_ratio, Builder> implements WorkoutProto$exercise_load_ratioOrBuilder {
    private static final WorkoutProto$exercise_load_ratio DEFAULT_INSTANCE;
    public static final int EXERCISE_LOAD_RATIO_FIELD_NUMBER = 2;
    private static volatile Parser<WorkoutProto$exercise_load_ratio> PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int exerciseLoadRatio_;
    private int timestamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$exercise_load_ratio, Builder> implements WorkoutProto$exercise_load_ratioOrBuilder {
        public Builder clearExerciseLoadRatio() {
            copyOnWrite();
            ((WorkoutProto$exercise_load_ratio) this.instance).clearExerciseLoadRatio();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((WorkoutProto$exercise_load_ratio) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$exercise_load_ratioOrBuilder
        public int getExerciseLoadRatio() {
            return ((WorkoutProto$exercise_load_ratio) this.instance).getExerciseLoadRatio();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$exercise_load_ratioOrBuilder
        public int getTimestamp() {
            return ((WorkoutProto$exercise_load_ratio) this.instance).getTimestamp();
        }

        public Builder setExerciseLoadRatio(int i) {
            copyOnWrite();
            ((WorkoutProto$exercise_load_ratio) this.instance).setExerciseLoadRatio(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((WorkoutProto$exercise_load_ratio) this.instance).setTimestamp(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$exercise_load_ratio.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$exercise_load_ratio workoutProto$exercise_load_ratio = new WorkoutProto$exercise_load_ratio();
        DEFAULT_INSTANCE = workoutProto$exercise_load_ratio;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$exercise_load_ratio.class, workoutProto$exercise_load_ratio);
    }

    private WorkoutProto$exercise_load_ratio() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseLoadRatio() {
        this.exerciseLoadRatio_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    public static WorkoutProto$exercise_load_ratio getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$exercise_load_ratio parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$exercise_load_ratio) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$exercise_load_ratio parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$exercise_load_ratio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$exercise_load_ratio> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseLoadRatio(int i) {
        this.exerciseLoadRatio_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$exercise_load_ratio();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"timestamp_", "exerciseLoadRatio_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$exercise_load_ratio> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$exercise_load_ratio.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$exercise_load_ratioOrBuilder
    public int getExerciseLoadRatio() {
        return this.exerciseLoadRatio_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$exercise_load_ratioOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    public static Builder newBuilder(WorkoutProto$exercise_load_ratio workoutProto$exercise_load_ratio) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$exercise_load_ratio);
    }

    public static WorkoutProto$exercise_load_ratio parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$exercise_load_ratio) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$exercise_load_ratio parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$exercise_load_ratio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$exercise_load_ratio parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$exercise_load_ratio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$exercise_load_ratio parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$exercise_load_ratio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$exercise_load_ratio parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$exercise_load_ratio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$exercise_load_ratio parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$exercise_load_ratio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$exercise_load_ratio parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$exercise_load_ratio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$exercise_load_ratio parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$exercise_load_ratio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$exercise_load_ratio parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$exercise_load_ratio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$exercise_load_ratio parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$exercise_load_ratio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
