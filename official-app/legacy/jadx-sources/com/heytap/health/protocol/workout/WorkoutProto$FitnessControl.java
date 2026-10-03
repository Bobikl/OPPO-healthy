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
public final class WorkoutProto$FitnessControl extends GeneratedMessageLite<WorkoutProto$FitnessControl, Builder> implements WorkoutProto$FitnessControlOrBuilder {
    private static final WorkoutProto$FitnessControl DEFAULT_INSTANCE;
    public static final int FITNESS_CHANGE_STATE_FIELD_NUMBER = 1;
    private static volatile Parser<WorkoutProto$FitnessControl> PARSER;
    private int fitnessChangeState_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$FitnessControl, Builder> implements WorkoutProto$FitnessControlOrBuilder {
        public Builder clearFitnessChangeState() {
            copyOnWrite();
            ((WorkoutProto$FitnessControl) this.instance).clearFitnessChangeState();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessControlOrBuilder
        public int getFitnessChangeState() {
            return ((WorkoutProto$FitnessControl) this.instance).getFitnessChangeState();
        }

        public Builder setFitnessChangeState(int i) {
            copyOnWrite();
            ((WorkoutProto$FitnessControl) this.instance).setFitnessChangeState(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$FitnessControl.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$FitnessControl workoutProto$FitnessControl = new WorkoutProto$FitnessControl();
        DEFAULT_INSTANCE = workoutProto$FitnessControl;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$FitnessControl.class, workoutProto$FitnessControl);
    }

    private WorkoutProto$FitnessControl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFitnessChangeState() {
        this.fitnessChangeState_ = 0;
    }

    public static WorkoutProto$FitnessControl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$FitnessControl parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$FitnessControl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$FitnessControl parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$FitnessControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$FitnessControl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitnessChangeState(int i) {
        this.fitnessChangeState_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$FitnessControl();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"fitnessChangeState_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$FitnessControl> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$FitnessControl.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessControlOrBuilder
    public int getFitnessChangeState() {
        return this.fitnessChangeState_;
    }

    public static Builder newBuilder(WorkoutProto$FitnessControl workoutProto$FitnessControl) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$FitnessControl);
    }

    public static WorkoutProto$FitnessControl parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$FitnessControl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$FitnessControl parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$FitnessControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$FitnessControl parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$FitnessControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$FitnessControl parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$FitnessControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$FitnessControl parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$FitnessControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$FitnessControl parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$FitnessControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$FitnessControl parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$FitnessControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$FitnessControl parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$FitnessControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$FitnessControl parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$FitnessControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$FitnessControl parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$FitnessControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
