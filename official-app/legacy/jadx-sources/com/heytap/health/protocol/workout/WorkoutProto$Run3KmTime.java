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
public final class WorkoutProto$Run3KmTime extends GeneratedMessageLite<WorkoutProto$Run3KmTime, Builder> implements WorkoutProto$Run3KmTimeOrBuilder {
    private static final WorkoutProto$Run3KmTime DEFAULT_INSTANCE;
    private static volatile Parser<WorkoutProto$Run3KmTime> PARSER = null;
    public static final int TIME_FIELD_NUMBER = 1;
    private int time_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$Run3KmTime, Builder> implements WorkoutProto$Run3KmTimeOrBuilder {
        public Builder clearTime() {
            copyOnWrite();
            ((WorkoutProto$Run3KmTime) this.instance).clearTime();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$Run3KmTimeOrBuilder
        public int getTime() {
            return ((WorkoutProto$Run3KmTime) this.instance).getTime();
        }

        public Builder setTime(int i) {
            copyOnWrite();
            ((WorkoutProto$Run3KmTime) this.instance).setTime(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$Run3KmTime.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$Run3KmTime workoutProto$Run3KmTime = new WorkoutProto$Run3KmTime();
        DEFAULT_INSTANCE = workoutProto$Run3KmTime;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$Run3KmTime.class, workoutProto$Run3KmTime);
    }

    private WorkoutProto$Run3KmTime() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0;
    }

    public static WorkoutProto$Run3KmTime getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$Run3KmTime parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$Run3KmTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$Run3KmTime parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$Run3KmTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$Run3KmTime> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(int i) {
        this.time_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$Run3KmTime();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"time_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$Run3KmTime> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$Run3KmTime.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$Run3KmTimeOrBuilder
    public int getTime() {
        return this.time_;
    }

    public static Builder newBuilder(WorkoutProto$Run3KmTime workoutProto$Run3KmTime) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$Run3KmTime);
    }

    public static WorkoutProto$Run3KmTime parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$Run3KmTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$Run3KmTime parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$Run3KmTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$Run3KmTime parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$Run3KmTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$Run3KmTime parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$Run3KmTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$Run3KmTime parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$Run3KmTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$Run3KmTime parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$Run3KmTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$Run3KmTime parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$Run3KmTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$Run3KmTime parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$Run3KmTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$Run3KmTime parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$Run3KmTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$Run3KmTime parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$Run3KmTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
