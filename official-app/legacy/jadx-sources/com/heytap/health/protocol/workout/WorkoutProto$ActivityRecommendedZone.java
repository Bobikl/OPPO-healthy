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
public final class WorkoutProto$ActivityRecommendedZone extends GeneratedMessageLite<WorkoutProto$ActivityRecommendedZone, Builder> implements WorkoutProto$ActivityRecommendedZoneOrBuilder {
    private static final WorkoutProto$ActivityRecommendedZone DEFAULT_INSTANCE;
    public static final int MAX_VALUE_FIELD_NUMBER = 2;
    public static final int MIN_VALUE_FIELD_NUMBER = 1;
    private static volatile Parser<WorkoutProto$ActivityRecommendedZone> PARSER;
    private int maxValue_;
    private int minValue_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$ActivityRecommendedZone, Builder> implements WorkoutProto$ActivityRecommendedZoneOrBuilder {
        public Builder clearMaxValue() {
            copyOnWrite();
            ((WorkoutProto$ActivityRecommendedZone) this.instance).clearMaxValue();
            return this;
        }

        public Builder clearMinValue() {
            copyOnWrite();
            ((WorkoutProto$ActivityRecommendedZone) this.instance).clearMinValue();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$ActivityRecommendedZoneOrBuilder
        public int getMaxValue() {
            return ((WorkoutProto$ActivityRecommendedZone) this.instance).getMaxValue();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$ActivityRecommendedZoneOrBuilder
        public int getMinValue() {
            return ((WorkoutProto$ActivityRecommendedZone) this.instance).getMinValue();
        }

        public Builder setMaxValue(int i) {
            copyOnWrite();
            ((WorkoutProto$ActivityRecommendedZone) this.instance).setMaxValue(i);
            return this;
        }

        public Builder setMinValue(int i) {
            copyOnWrite();
            ((WorkoutProto$ActivityRecommendedZone) this.instance).setMinValue(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$ActivityRecommendedZone.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$ActivityRecommendedZone workoutProto$ActivityRecommendedZone = new WorkoutProto$ActivityRecommendedZone();
        DEFAULT_INSTANCE = workoutProto$ActivityRecommendedZone;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$ActivityRecommendedZone.class, workoutProto$ActivityRecommendedZone);
    }

    private WorkoutProto$ActivityRecommendedZone() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxValue() {
        this.maxValue_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinValue() {
        this.minValue_ = 0;
    }

    public static WorkoutProto$ActivityRecommendedZone getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$ActivityRecommendedZone parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$ActivityRecommendedZone) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$ActivityRecommendedZone parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$ActivityRecommendedZone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$ActivityRecommendedZone> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxValue(int i) {
        this.maxValue_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinValue(int i) {
        this.minValue_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$ActivityRecommendedZone();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"minValue_", "maxValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$ActivityRecommendedZone> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$ActivityRecommendedZone.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$ActivityRecommendedZoneOrBuilder
    public int getMaxValue() {
        return this.maxValue_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$ActivityRecommendedZoneOrBuilder
    public int getMinValue() {
        return this.minValue_;
    }

    public static Builder newBuilder(WorkoutProto$ActivityRecommendedZone workoutProto$ActivityRecommendedZone) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$ActivityRecommendedZone);
    }

    public static WorkoutProto$ActivityRecommendedZone parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$ActivityRecommendedZone) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$ActivityRecommendedZone parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$ActivityRecommendedZone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$ActivityRecommendedZone parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$ActivityRecommendedZone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$ActivityRecommendedZone parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$ActivityRecommendedZone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$ActivityRecommendedZone parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$ActivityRecommendedZone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$ActivityRecommendedZone parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$ActivityRecommendedZone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$ActivityRecommendedZone parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$ActivityRecommendedZone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$ActivityRecommendedZone parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$ActivityRecommendedZone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$ActivityRecommendedZone parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$ActivityRecommendedZone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$ActivityRecommendedZone parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$ActivityRecommendedZone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
