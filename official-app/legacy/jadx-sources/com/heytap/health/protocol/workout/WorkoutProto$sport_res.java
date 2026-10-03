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
public final class WorkoutProto$sport_res extends GeneratedMessageLite<WorkoutProto$sport_res, Builder> implements WorkoutProto$sport_resOrBuilder {
    private static final WorkoutProto$sport_res DEFAULT_INSTANCE;
    private static volatile Parser<WorkoutProto$sport_res> PARSER = null;
    public static final int RES_CODE_FIELD_NUMBER = 1;
    private int resCode_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$sport_res, Builder> implements WorkoutProto$sport_resOrBuilder {
        public Builder clearResCode() {
            copyOnWrite();
            ((WorkoutProto$sport_res) this.instance).clearResCode();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_resOrBuilder
        public int getResCode() {
            return ((WorkoutProto$sport_res) this.instance).getResCode();
        }

        public Builder setResCode(int i) {
            copyOnWrite();
            ((WorkoutProto$sport_res) this.instance).setResCode(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$sport_res.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$sport_res workoutProto$sport_res = new WorkoutProto$sport_res();
        DEFAULT_INSTANCE = workoutProto$sport_res;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$sport_res.class, workoutProto$sport_res);
    }

    private WorkoutProto$sport_res() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResCode() {
        this.resCode_ = 0;
    }

    public static WorkoutProto$sport_res getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$sport_res parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$sport_res) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$sport_res parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_res) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$sport_res> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResCode(int i) {
        this.resCode_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$sport_res();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"resCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$sport_res> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$sport_res.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_resOrBuilder
    public int getResCode() {
        return this.resCode_;
    }

    public static Builder newBuilder(WorkoutProto$sport_res workoutProto$sport_res) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$sport_res);
    }

    public static WorkoutProto$sport_res parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$sport_res) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$sport_res parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_res) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$sport_res parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_res) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$sport_res parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_res) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$sport_res parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_res) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$sport_res parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_res) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$sport_res parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$sport_res) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$sport_res parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$sport_res) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$sport_res parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$sport_res) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$sport_res parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$sport_res) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
