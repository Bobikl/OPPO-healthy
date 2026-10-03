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
public final class WorkoutProto$Vo2MaxData extends GeneratedMessageLite<WorkoutProto$Vo2MaxData, Builder> implements WorkoutProto$Vo2MaxDataOrBuilder {
    private static final WorkoutProto$Vo2MaxData DEFAULT_INSTANCE;
    private static volatile Parser<WorkoutProto$Vo2MaxData> PARSER = null;
    public static final int TIME_STAMP_FIELD_NUMBER = 2;
    public static final int VO2MAX_FIELD_NUMBER = 1;
    private int timeStamp_;
    private float vo2Max_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$Vo2MaxData, Builder> implements WorkoutProto$Vo2MaxDataOrBuilder {
        public Builder clearTimeStamp() {
            copyOnWrite();
            ((WorkoutProto$Vo2MaxData) this.instance).clearTimeStamp();
            return this;
        }

        public Builder clearVo2Max() {
            copyOnWrite();
            ((WorkoutProto$Vo2MaxData) this.instance).clearVo2Max();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$Vo2MaxDataOrBuilder
        public int getTimeStamp() {
            return ((WorkoutProto$Vo2MaxData) this.instance).getTimeStamp();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$Vo2MaxDataOrBuilder
        public float getVo2Max() {
            return ((WorkoutProto$Vo2MaxData) this.instance).getVo2Max();
        }

        public Builder setTimeStamp(int i) {
            copyOnWrite();
            ((WorkoutProto$Vo2MaxData) this.instance).setTimeStamp(i);
            return this;
        }

        public Builder setVo2Max(float f) {
            copyOnWrite();
            ((WorkoutProto$Vo2MaxData) this.instance).setVo2Max(f);
            return this;
        }

        private Builder() {
            super(WorkoutProto$Vo2MaxData.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$Vo2MaxData workoutProto$Vo2MaxData = new WorkoutProto$Vo2MaxData();
        DEFAULT_INSTANCE = workoutProto$Vo2MaxData;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$Vo2MaxData.class, workoutProto$Vo2MaxData);
    }

    private WorkoutProto$Vo2MaxData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeStamp() {
        this.timeStamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVo2Max() {
        this.vo2Max_ = 0.0f;
    }

    public static WorkoutProto$Vo2MaxData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$Vo2MaxData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$Vo2MaxData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$Vo2MaxData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$Vo2MaxData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$Vo2MaxData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeStamp(int i) {
        this.timeStamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVo2Max(float f) {
        this.vo2Max_ = f;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$Vo2MaxData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u000b", new Object[]{"vo2Max_", "timeStamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$Vo2MaxData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$Vo2MaxData.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$Vo2MaxDataOrBuilder
    public int getTimeStamp() {
        return this.timeStamp_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$Vo2MaxDataOrBuilder
    public float getVo2Max() {
        return this.vo2Max_;
    }

    public static Builder newBuilder(WorkoutProto$Vo2MaxData workoutProto$Vo2MaxData) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$Vo2MaxData);
    }

    public static WorkoutProto$Vo2MaxData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$Vo2MaxData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$Vo2MaxData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$Vo2MaxData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$Vo2MaxData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$Vo2MaxData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$Vo2MaxData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$Vo2MaxData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$Vo2MaxData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$Vo2MaxData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$Vo2MaxData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$Vo2MaxData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$Vo2MaxData parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$Vo2MaxData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$Vo2MaxData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$Vo2MaxData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$Vo2MaxData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$Vo2MaxData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$Vo2MaxData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$Vo2MaxData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
