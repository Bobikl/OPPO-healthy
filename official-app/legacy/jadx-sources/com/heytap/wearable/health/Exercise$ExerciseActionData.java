package com.heytap.wearable.health;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.dv6;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Exercise$ExerciseActionData extends GeneratedMessageLite<Exercise$ExerciseActionData, Builder> implements Exercise$ExerciseActionDataOrBuilder {
    public static final int ACTION_TYPE_FIELD_NUMBER = 1;
    private static final Exercise$ExerciseActionData DEFAULT_INSTANCE;
    public static final int EXERCISE_TYPE_FIELD_NUMBER = 2;
    private static volatile Parser<Exercise$ExerciseActionData> PARSER;
    private int actionType_;
    private int exerciseType_;

    public static final class Builder extends GeneratedMessageLite.Builder<Exercise$ExerciseActionData, Builder> implements Exercise$ExerciseActionDataOrBuilder {
        public Builder clearActionType() {
            copyOnWrite();
            ((Exercise$ExerciseActionData) this.instance).clearActionType();
            return this;
        }

        public Builder clearExerciseType() {
            copyOnWrite();
            ((Exercise$ExerciseActionData) this.instance).clearExerciseType();
            return this;
        }

        @Override // com.heytap.wearable.health.Exercise$ExerciseActionDataOrBuilder
        public Exercise$RemindActionType getActionType() {
            return ((Exercise$ExerciseActionData) this.instance).getActionType();
        }

        @Override // com.heytap.wearable.health.Exercise$ExerciseActionDataOrBuilder
        public int getActionTypeValue() {
            return ((Exercise$ExerciseActionData) this.instance).getActionTypeValue();
        }

        @Override // com.heytap.wearable.health.Exercise$ExerciseActionDataOrBuilder
        public Exercise$ExerciseType getExerciseType() {
            return ((Exercise$ExerciseActionData) this.instance).getExerciseType();
        }

        @Override // com.heytap.wearable.health.Exercise$ExerciseActionDataOrBuilder
        public int getExerciseTypeValue() {
            return ((Exercise$ExerciseActionData) this.instance).getExerciseTypeValue();
        }

        public Builder setActionType(Exercise$RemindActionType exercise$RemindActionType) {
            copyOnWrite();
            ((Exercise$ExerciseActionData) this.instance).setActionType(exercise$RemindActionType);
            return this;
        }

        public Builder setActionTypeValue(int i) {
            copyOnWrite();
            ((Exercise$ExerciseActionData) this.instance).setActionTypeValue(i);
            return this;
        }

        public Builder setExerciseType(Exercise$ExerciseType exercise$ExerciseType) {
            copyOnWrite();
            ((Exercise$ExerciseActionData) this.instance).setExerciseType(exercise$ExerciseType);
            return this;
        }

        public Builder setExerciseTypeValue(int i) {
            copyOnWrite();
            ((Exercise$ExerciseActionData) this.instance).setExerciseTypeValue(i);
            return this;
        }

        private Builder() {
            super(Exercise$ExerciseActionData.DEFAULT_INSTANCE);
        }
    }

    static {
        Exercise$ExerciseActionData exercise$ExerciseActionData = new Exercise$ExerciseActionData();
        DEFAULT_INSTANCE = exercise$ExerciseActionData;
        GeneratedMessageLite.registerDefaultInstance(Exercise$ExerciseActionData.class, exercise$ExerciseActionData);
    }

    private Exercise$ExerciseActionData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionType() {
        this.actionType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseType() {
        this.exerciseType_ = 0;
    }

    public static Exercise$ExerciseActionData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Exercise$ExerciseActionData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Exercise$ExerciseActionData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exercise$ExerciseActionData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Exercise$ExerciseActionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Exercise$ExerciseActionData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionType(Exercise$RemindActionType exercise$RemindActionType) {
        this.actionType_ = exercise$RemindActionType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionTypeValue(int i) {
        this.actionType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseType(Exercise$ExerciseType exercise$ExerciseType) {
        this.exerciseType_ = exercise$ExerciseType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseTypeValue(int i) {
        this.exerciseType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = dv6.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Exercise$ExerciseActionData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"actionType_", "exerciseType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Exercise$ExerciseActionData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Exercise$ExerciseActionData.class) {
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

    @Override // com.heytap.wearable.health.Exercise$ExerciseActionDataOrBuilder
    public Exercise$RemindActionType getActionType() {
        Exercise$RemindActionType exercise$RemindActionTypeForNumber = Exercise$RemindActionType.forNumber(this.actionType_);
        return exercise$RemindActionTypeForNumber == null ? Exercise$RemindActionType.UNRECOGNIZED : exercise$RemindActionTypeForNumber;
    }

    @Override // com.heytap.wearable.health.Exercise$ExerciseActionDataOrBuilder
    public int getActionTypeValue() {
        return this.actionType_;
    }

    @Override // com.heytap.wearable.health.Exercise$ExerciseActionDataOrBuilder
    public Exercise$ExerciseType getExerciseType() {
        Exercise$ExerciseType exercise$ExerciseTypeForNumber = Exercise$ExerciseType.forNumber(this.exerciseType_);
        return exercise$ExerciseTypeForNumber == null ? Exercise$ExerciseType.UNRECOGNIZED : exercise$ExerciseTypeForNumber;
    }

    @Override // com.heytap.wearable.health.Exercise$ExerciseActionDataOrBuilder
    public int getExerciseTypeValue() {
        return this.exerciseType_;
    }

    public static Builder newBuilder(Exercise$ExerciseActionData exercise$ExerciseActionData) {
        return DEFAULT_INSTANCE.createBuilder(exercise$ExerciseActionData);
    }

    public static Exercise$ExerciseActionData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$ExerciseActionData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exercise$ExerciseActionData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$ExerciseActionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Exercise$ExerciseActionData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Exercise$ExerciseActionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Exercise$ExerciseActionData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$ExerciseActionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Exercise$ExerciseActionData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Exercise$ExerciseActionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Exercise$ExerciseActionData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$ExerciseActionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Exercise$ExerciseActionData parseFrom(InputStream inputStream) throws IOException {
        return (Exercise$ExerciseActionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exercise$ExerciseActionData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$ExerciseActionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exercise$ExerciseActionData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Exercise$ExerciseActionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Exercise$ExerciseActionData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$ExerciseActionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
