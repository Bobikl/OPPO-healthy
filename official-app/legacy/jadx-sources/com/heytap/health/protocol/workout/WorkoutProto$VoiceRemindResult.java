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
public final class WorkoutProto$VoiceRemindResult extends GeneratedMessageLite<WorkoutProto$VoiceRemindResult, Builder> implements WorkoutProto$VoiceRemindResultOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final WorkoutProto$VoiceRemindResult DEFAULT_INSTANCE;
    private static volatile Parser<WorkoutProto$VoiceRemindResult> PARSER;
    private int code_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$VoiceRemindResult, Builder> implements WorkoutProto$VoiceRemindResultOrBuilder {
        public Builder clearCode() {
            copyOnWrite();
            ((WorkoutProto$VoiceRemindResult) this.instance).clearCode();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$VoiceRemindResultOrBuilder
        public int getCode() {
            return ((WorkoutProto$VoiceRemindResult) this.instance).getCode();
        }

        public Builder setCode(int i) {
            copyOnWrite();
            ((WorkoutProto$VoiceRemindResult) this.instance).setCode(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$VoiceRemindResult.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$VoiceRemindResult workoutProto$VoiceRemindResult = new WorkoutProto$VoiceRemindResult();
        DEFAULT_INSTANCE = workoutProto$VoiceRemindResult;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$VoiceRemindResult.class, workoutProto$VoiceRemindResult);
    }

    private WorkoutProto$VoiceRemindResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    public static WorkoutProto$VoiceRemindResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$VoiceRemindResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$VoiceRemindResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$VoiceRemindResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$VoiceRemindResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$VoiceRemindResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i) {
        this.code_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$VoiceRemindResult();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"code_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$VoiceRemindResult> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$VoiceRemindResult.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$VoiceRemindResultOrBuilder
    public int getCode() {
        return this.code_;
    }

    public static Builder newBuilder(WorkoutProto$VoiceRemindResult workoutProto$VoiceRemindResult) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$VoiceRemindResult);
    }

    public static WorkoutProto$VoiceRemindResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$VoiceRemindResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$VoiceRemindResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$VoiceRemindResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$VoiceRemindResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$VoiceRemindResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$VoiceRemindResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$VoiceRemindResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$VoiceRemindResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$VoiceRemindResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$VoiceRemindResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$VoiceRemindResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$VoiceRemindResult parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$VoiceRemindResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$VoiceRemindResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$VoiceRemindResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$VoiceRemindResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$VoiceRemindResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$VoiceRemindResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$VoiceRemindResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
