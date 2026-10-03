package com.heytap.health.protocol.workout;

import com.google.protobuf.AbstractMessageLite;
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
public final class WorkoutProto$VoicePackDataItem extends GeneratedMessageLite<WorkoutProto$VoicePackDataItem, Builder> implements WorkoutProto$VoicePackDataItemOrBuilder {
    private static final WorkoutProto$VoicePackDataItem DEFAULT_INSTANCE;
    private static volatile Parser<WorkoutProto$VoicePackDataItem> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int VOICE_PACK_NAME_FIELD_NUMBER = 2;
    private int version_;
    private String voicePackName_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$VoicePackDataItem, Builder> implements WorkoutProto$VoicePackDataItemOrBuilder {
        public Builder clearVersion() {
            copyOnWrite();
            ((WorkoutProto$VoicePackDataItem) this.instance).clearVersion();
            return this;
        }

        public Builder clearVoicePackName() {
            copyOnWrite();
            ((WorkoutProto$VoicePackDataItem) this.instance).clearVoicePackName();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$VoicePackDataItemOrBuilder
        public int getVersion() {
            return ((WorkoutProto$VoicePackDataItem) this.instance).getVersion();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$VoicePackDataItemOrBuilder
        public String getVoicePackName() {
            return ((WorkoutProto$VoicePackDataItem) this.instance).getVoicePackName();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$VoicePackDataItemOrBuilder
        public ByteString getVoicePackNameBytes() {
            return ((WorkoutProto$VoicePackDataItem) this.instance).getVoicePackNameBytes();
        }

        public Builder setVersion(int i) {
            copyOnWrite();
            ((WorkoutProto$VoicePackDataItem) this.instance).setVersion(i);
            return this;
        }

        public Builder setVoicePackName(String str) {
            copyOnWrite();
            ((WorkoutProto$VoicePackDataItem) this.instance).setVoicePackName(str);
            return this;
        }

        public Builder setVoicePackNameBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$VoicePackDataItem) this.instance).setVoicePackNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(WorkoutProto$VoicePackDataItem.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$VoicePackDataItem workoutProto$VoicePackDataItem = new WorkoutProto$VoicePackDataItem();
        DEFAULT_INSTANCE = workoutProto$VoicePackDataItem;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$VoicePackDataItem.class, workoutProto$VoicePackDataItem);
    }

    private WorkoutProto$VoicePackDataItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoicePackName() {
        this.voicePackName_ = getDefaultInstance().getVoicePackName();
    }

    public static WorkoutProto$VoicePackDataItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$VoicePackDataItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$VoicePackDataItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$VoicePackDataItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$VoicePackDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$VoicePackDataItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoicePackName(String str) {
        str.getClass();
        this.voicePackName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoicePackNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.voicePackName_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$VoicePackDataItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"version_", "voicePackName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$VoicePackDataItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$VoicePackDataItem.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$VoicePackDataItemOrBuilder
    public int getVersion() {
        return this.version_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$VoicePackDataItemOrBuilder
    public String getVoicePackName() {
        return this.voicePackName_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$VoicePackDataItemOrBuilder
    public ByteString getVoicePackNameBytes() {
        return ByteString.copyFromUtf8(this.voicePackName_);
    }

    public static Builder newBuilder(WorkoutProto$VoicePackDataItem workoutProto$VoicePackDataItem) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$VoicePackDataItem);
    }

    public static WorkoutProto$VoicePackDataItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$VoicePackDataItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$VoicePackDataItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$VoicePackDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$VoicePackDataItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$VoicePackDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$VoicePackDataItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$VoicePackDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$VoicePackDataItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$VoicePackDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$VoicePackDataItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$VoicePackDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$VoicePackDataItem parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$VoicePackDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$VoicePackDataItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$VoicePackDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$VoicePackDataItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$VoicePackDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$VoicePackDataItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$VoicePackDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
