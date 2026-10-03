package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.nh7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProto$ExerciseTimeGoal extends GeneratedMessageLite<FitnessProto$ExerciseTimeGoal, Builder> implements FitnessProto$ExerciseTimeGoalOrBuilder {
    private static final FitnessProto$ExerciseTimeGoal DEFAULT_INSTANCE;
    public static final int EXERCISE_TIME_GOAL_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProto$ExerciseTimeGoal> PARSER;
    private int exerciseTimeGoal_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$ExerciseTimeGoal, Builder> implements FitnessProto$ExerciseTimeGoalOrBuilder {
        public Builder clearExerciseTimeGoal() {
            copyOnWrite();
            ((FitnessProto$ExerciseTimeGoal) this.instance).clearExerciseTimeGoal();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ExerciseTimeGoalOrBuilder
        public int getExerciseTimeGoal() {
            return ((FitnessProto$ExerciseTimeGoal) this.instance).getExerciseTimeGoal();
        }

        public Builder setExerciseTimeGoal(int i) {
            copyOnWrite();
            ((FitnessProto$ExerciseTimeGoal) this.instance).setExerciseTimeGoal(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$ExerciseTimeGoal.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$ExerciseTimeGoal fitnessProto$ExerciseTimeGoal = new FitnessProto$ExerciseTimeGoal();
        DEFAULT_INSTANCE = fitnessProto$ExerciseTimeGoal;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$ExerciseTimeGoal.class, fitnessProto$ExerciseTimeGoal);
    }

    private FitnessProto$ExerciseTimeGoal() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseTimeGoal() {
        this.exerciseTimeGoal_ = 0;
    }

    public static FitnessProto$ExerciseTimeGoal getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$ExerciseTimeGoal parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$ExerciseTimeGoal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$ExerciseTimeGoal parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$ExerciseTimeGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$ExerciseTimeGoal> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseTimeGoal(int i) {
        this.exerciseTimeGoal_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$ExerciseTimeGoal();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"exerciseTimeGoal_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$ExerciseTimeGoal> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$ExerciseTimeGoal.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ExerciseTimeGoalOrBuilder
    public int getExerciseTimeGoal() {
        return this.exerciseTimeGoal_;
    }

    public static Builder newBuilder(FitnessProto$ExerciseTimeGoal fitnessProto$ExerciseTimeGoal) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$ExerciseTimeGoal);
    }

    public static FitnessProto$ExerciseTimeGoal parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ExerciseTimeGoal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$ExerciseTimeGoal parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ExerciseTimeGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$ExerciseTimeGoal parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$ExerciseTimeGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$ExerciseTimeGoal parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ExerciseTimeGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$ExerciseTimeGoal parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$ExerciseTimeGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$ExerciseTimeGoal parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ExerciseTimeGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$ExerciseTimeGoal parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$ExerciseTimeGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$ExerciseTimeGoal parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ExerciseTimeGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$ExerciseTimeGoal parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$ExerciseTimeGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$ExerciseTimeGoal parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ExerciseTimeGoal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
