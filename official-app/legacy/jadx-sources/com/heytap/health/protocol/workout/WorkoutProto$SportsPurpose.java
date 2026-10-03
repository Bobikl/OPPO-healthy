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
public final class WorkoutProto$SportsPurpose extends GeneratedMessageLite<WorkoutProto$SportsPurpose, Builder> implements WorkoutProto$SportsPurposeOrBuilder {
    private static final WorkoutProto$SportsPurpose DEFAULT_INSTANCE;
    private static volatile Parser<WorkoutProto$SportsPurpose> PARSER = null;
    public static final int PURPOSE_FIELD_NUMBER = 1;
    private int purpose_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$SportsPurpose, Builder> implements WorkoutProto$SportsPurposeOrBuilder {
        public Builder clearPurpose() {
            copyOnWrite();
            ((WorkoutProto$SportsPurpose) this.instance).clearPurpose();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$SportsPurposeOrBuilder
        public int getPurpose() {
            return ((WorkoutProto$SportsPurpose) this.instance).getPurpose();
        }

        public Builder setPurpose(int i) {
            copyOnWrite();
            ((WorkoutProto$SportsPurpose) this.instance).setPurpose(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$SportsPurpose.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$SportsPurpose workoutProto$SportsPurpose = new WorkoutProto$SportsPurpose();
        DEFAULT_INSTANCE = workoutProto$SportsPurpose;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$SportsPurpose.class, workoutProto$SportsPurpose);
    }

    private WorkoutProto$SportsPurpose() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPurpose() {
        this.purpose_ = 0;
    }

    public static WorkoutProto$SportsPurpose getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$SportsPurpose parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$SportsPurpose) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$SportsPurpose parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportsPurpose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$SportsPurpose> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPurpose(int i) {
        this.purpose_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$SportsPurpose();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"purpose_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$SportsPurpose> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$SportsPurpose.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$SportsPurposeOrBuilder
    public int getPurpose() {
        return this.purpose_;
    }

    public static Builder newBuilder(WorkoutProto$SportsPurpose workoutProto$SportsPurpose) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$SportsPurpose);
    }

    public static WorkoutProto$SportsPurpose parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$SportsPurpose) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$SportsPurpose parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportsPurpose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$SportsPurpose parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportsPurpose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$SportsPurpose parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportsPurpose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$SportsPurpose parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportsPurpose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$SportsPurpose parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportsPurpose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$SportsPurpose parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$SportsPurpose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$SportsPurpose parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$SportsPurpose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$SportsPurpose parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$SportsPurpose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$SportsPurpose parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$SportsPurpose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
