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
public final class WorkoutProto$PlaybackEndResult extends GeneratedMessageLite<WorkoutProto$PlaybackEndResult, Builder> implements WorkoutProto$PlaybackEndResultOrBuilder {
    private static final WorkoutProto$PlaybackEndResult DEFAULT_INSTANCE;
    private static volatile Parser<WorkoutProto$PlaybackEndResult> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int VOICE_ID_FIELD_NUMBER = 1;
    private int type_;
    private int voiceId_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$PlaybackEndResult, Builder> implements WorkoutProto$PlaybackEndResultOrBuilder {
        public Builder clearType() {
            copyOnWrite();
            ((WorkoutProto$PlaybackEndResult) this.instance).clearType();
            return this;
        }

        public Builder clearVoiceId() {
            copyOnWrite();
            ((WorkoutProto$PlaybackEndResult) this.instance).clearVoiceId();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$PlaybackEndResultOrBuilder
        public int getType() {
            return ((WorkoutProto$PlaybackEndResult) this.instance).getType();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$PlaybackEndResultOrBuilder
        public int getVoiceId() {
            return ((WorkoutProto$PlaybackEndResult) this.instance).getVoiceId();
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((WorkoutProto$PlaybackEndResult) this.instance).setType(i);
            return this;
        }

        public Builder setVoiceId(int i) {
            copyOnWrite();
            ((WorkoutProto$PlaybackEndResult) this.instance).setVoiceId(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$PlaybackEndResult.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$PlaybackEndResult workoutProto$PlaybackEndResult = new WorkoutProto$PlaybackEndResult();
        DEFAULT_INSTANCE = workoutProto$PlaybackEndResult;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$PlaybackEndResult.class, workoutProto$PlaybackEndResult);
    }

    private WorkoutProto$PlaybackEndResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceId() {
        this.voiceId_ = 0;
    }

    public static WorkoutProto$PlaybackEndResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$PlaybackEndResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$PlaybackEndResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$PlaybackEndResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$PlaybackEndResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$PlaybackEndResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceId(int i) {
        this.voiceId_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$PlaybackEndResult();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"voiceId_", "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$PlaybackEndResult> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$PlaybackEndResult.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$PlaybackEndResultOrBuilder
    public int getType() {
        return this.type_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$PlaybackEndResultOrBuilder
    public int getVoiceId() {
        return this.voiceId_;
    }

    public static Builder newBuilder(WorkoutProto$PlaybackEndResult workoutProto$PlaybackEndResult) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$PlaybackEndResult);
    }

    public static WorkoutProto$PlaybackEndResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$PlaybackEndResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$PlaybackEndResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$PlaybackEndResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$PlaybackEndResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$PlaybackEndResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$PlaybackEndResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$PlaybackEndResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$PlaybackEndResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$PlaybackEndResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$PlaybackEndResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$PlaybackEndResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$PlaybackEndResult parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$PlaybackEndResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$PlaybackEndResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$PlaybackEndResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$PlaybackEndResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$PlaybackEndResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$PlaybackEndResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$PlaybackEndResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
