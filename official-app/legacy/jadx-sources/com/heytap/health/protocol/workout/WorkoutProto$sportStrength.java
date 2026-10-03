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
public final class WorkoutProto$sportStrength extends GeneratedMessageLite<WorkoutProto$sportStrength, Builder> implements WorkoutProto$sportStrengthOrBuilder {
    private static final WorkoutProto$sportStrength DEFAULT_INSTANCE;
    public static final int MAX_HR_FIELD_NUMBER = 2;
    public static final int MIN_HR_FIELD_NUMBER = 1;
    private static volatile Parser<WorkoutProto$sportStrength> PARSER;
    private int maxHr_;
    private int minHr_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$sportStrength, Builder> implements WorkoutProto$sportStrengthOrBuilder {
        public Builder clearMaxHr() {
            copyOnWrite();
            ((WorkoutProto$sportStrength) this.instance).clearMaxHr();
            return this;
        }

        public Builder clearMinHr() {
            copyOnWrite();
            ((WorkoutProto$sportStrength) this.instance).clearMinHr();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sportStrengthOrBuilder
        public int getMaxHr() {
            return ((WorkoutProto$sportStrength) this.instance).getMaxHr();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sportStrengthOrBuilder
        public int getMinHr() {
            return ((WorkoutProto$sportStrength) this.instance).getMinHr();
        }

        public Builder setMaxHr(int i) {
            copyOnWrite();
            ((WorkoutProto$sportStrength) this.instance).setMaxHr(i);
            return this;
        }

        public Builder setMinHr(int i) {
            copyOnWrite();
            ((WorkoutProto$sportStrength) this.instance).setMinHr(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$sportStrength.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$sportStrength workoutProto$sportStrength = new WorkoutProto$sportStrength();
        DEFAULT_INSTANCE = workoutProto$sportStrength;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$sportStrength.class, workoutProto$sportStrength);
    }

    private WorkoutProto$sportStrength() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxHr() {
        this.maxHr_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinHr() {
        this.minHr_ = 0;
    }

    public static WorkoutProto$sportStrength getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$sportStrength parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$sportStrength) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$sportStrength parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$sportStrength) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$sportStrength> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxHr(int i) {
        this.maxHr_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinHr(int i) {
        this.minHr_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$sportStrength();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"minHr_", "maxHr_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$sportStrength> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$sportStrength.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sportStrengthOrBuilder
    public int getMaxHr() {
        return this.maxHr_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sportStrengthOrBuilder
    public int getMinHr() {
        return this.minHr_;
    }

    public static Builder newBuilder(WorkoutProto$sportStrength workoutProto$sportStrength) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$sportStrength);
    }

    public static WorkoutProto$sportStrength parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$sportStrength) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$sportStrength parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$sportStrength) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$sportStrength parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$sportStrength) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$sportStrength parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$sportStrength) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$sportStrength parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$sportStrength) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$sportStrength parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$sportStrength) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$sportStrength parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$sportStrength) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$sportStrength parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$sportStrength) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$sportStrength parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$sportStrength) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$sportStrength parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$sportStrength) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
