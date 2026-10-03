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
public final class WorkoutProto$MotionState extends GeneratedMessageLite<WorkoutProto$MotionState, Builder> implements WorkoutProto$MotionStateOrBuilder {
    private static final WorkoutProto$MotionState DEFAULT_INSTANCE;
    private static volatile Parser<WorkoutProto$MotionState> PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int state_;
    private int type_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$MotionState, Builder> implements WorkoutProto$MotionStateOrBuilder {
        public Builder clearState() {
            copyOnWrite();
            ((WorkoutProto$MotionState) this.instance).clearState();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((WorkoutProto$MotionState) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MotionStateOrBuilder
        public int getState() {
            return ((WorkoutProto$MotionState) this.instance).getState();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MotionStateOrBuilder
        public int getType() {
            return ((WorkoutProto$MotionState) this.instance).getType();
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((WorkoutProto$MotionState) this.instance).setState(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((WorkoutProto$MotionState) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$MotionState.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$MotionState workoutProto$MotionState = new WorkoutProto$MotionState();
        DEFAULT_INSTANCE = workoutProto$MotionState;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$MotionState.class, workoutProto$MotionState);
    }

    private WorkoutProto$MotionState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static WorkoutProto$MotionState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$MotionState parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$MotionState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$MotionState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$MotionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$MotionState> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int i) {
        this.state_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$MotionState();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"state_", "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$MotionState> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$MotionState.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MotionStateOrBuilder
    public int getState() {
        return this.state_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MotionStateOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(WorkoutProto$MotionState workoutProto$MotionState) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$MotionState);
    }

    public static WorkoutProto$MotionState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$MotionState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$MotionState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$MotionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$MotionState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$MotionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$MotionState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$MotionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$MotionState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$MotionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$MotionState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$MotionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$MotionState parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$MotionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$MotionState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$MotionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$MotionState parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$MotionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$MotionState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$MotionState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
