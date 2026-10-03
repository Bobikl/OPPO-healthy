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
public final class WorkoutProto$SportType extends GeneratedMessageLite<WorkoutProto$SportType, Builder> implements WorkoutProto$SportTypeOrBuilder {
    private static final WorkoutProto$SportType DEFAULT_INSTANCE;
    private static volatile Parser<WorkoutProto$SportType> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$SportType, Builder> implements WorkoutProto$SportTypeOrBuilder {
        public Builder clearType() {
            copyOnWrite();
            ((WorkoutProto$SportType) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$SportTypeOrBuilder
        public int getType() {
            return ((WorkoutProto$SportType) this.instance).getType();
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((WorkoutProto$SportType) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$SportType.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$SportType workoutProto$SportType = new WorkoutProto$SportType();
        DEFAULT_INSTANCE = workoutProto$SportType;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$SportType.class, workoutProto$SportType);
    }

    private WorkoutProto$SportType() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static WorkoutProto$SportType getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$SportType parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$SportType) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$SportType parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$SportType> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
                return new WorkoutProto$SportType();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$SportType> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$SportType.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$SportTypeOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(WorkoutProto$SportType workoutProto$SportType) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$SportType);
    }

    public static WorkoutProto$SportType parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$SportType) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$SportType parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$SportType parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$SportType parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$SportType parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$SportType parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$SportType parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$SportType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$SportType parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$SportType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$SportType parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$SportType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$SportType parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$SportType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
