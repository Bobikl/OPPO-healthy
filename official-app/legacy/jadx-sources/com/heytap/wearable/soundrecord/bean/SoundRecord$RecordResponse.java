package com.heytap.wearable.soundrecord.bean;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.c3i;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class SoundRecord$RecordResponse extends GeneratedMessageLite<SoundRecord$RecordResponse, Builder> implements SoundRecord$RecordResponseOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final SoundRecord$RecordResponse DEFAULT_INSTANCE;
    private static volatile Parser<SoundRecord$RecordResponse> PARSER = null;
    public static final int PROCESS_FIELD_NUMBER = 2;
    private int code_;
    private int process_;

    public static final class Builder extends GeneratedMessageLite.Builder<SoundRecord$RecordResponse, Builder> implements SoundRecord$RecordResponseOrBuilder {
        public Builder clearCode() {
            copyOnWrite();
            ((SoundRecord$RecordResponse) this.instance).clearCode();
            return this;
        }

        public Builder clearProcess() {
            copyOnWrite();
            ((SoundRecord$RecordResponse) this.instance).clearProcess();
            return this;
        }

        @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordResponseOrBuilder
        public int getCode() {
            return ((SoundRecord$RecordResponse) this.instance).getCode();
        }

        @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordResponseOrBuilder
        public int getProcess() {
            return ((SoundRecord$RecordResponse) this.instance).getProcess();
        }

        public Builder setCode(int i) {
            copyOnWrite();
            ((SoundRecord$RecordResponse) this.instance).setCode(i);
            return this;
        }

        public Builder setProcess(int i) {
            copyOnWrite();
            ((SoundRecord$RecordResponse) this.instance).setProcess(i);
            return this;
        }

        private Builder() {
            super(SoundRecord$RecordResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        SoundRecord$RecordResponse soundRecord$RecordResponse = new SoundRecord$RecordResponse();
        DEFAULT_INSTANCE = soundRecord$RecordResponse;
        GeneratedMessageLite.registerDefaultInstance(SoundRecord$RecordResponse.class, soundRecord$RecordResponse);
    }

    private SoundRecord$RecordResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProcess() {
        this.process_ = 0;
    }

    public static SoundRecord$RecordResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SoundRecord$RecordResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SoundRecord$RecordResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SoundRecord$RecordResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SoundRecord$RecordResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i) {
        this.code_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcess(int i) {
        this.process_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = c3i.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SoundRecord$RecordResponse();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"code_", "process_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SoundRecord$RecordResponse> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SoundRecord$RecordResponse.class) {
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

    @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordResponseOrBuilder
    public int getCode() {
        return this.code_;
    }

    @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordResponseOrBuilder
    public int getProcess() {
        return this.process_;
    }

    public static Builder newBuilder(SoundRecord$RecordResponse soundRecord$RecordResponse) {
        return DEFAULT_INSTANCE.createBuilder(soundRecord$RecordResponse);
    }

    public static SoundRecord$RecordResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SoundRecord$RecordResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SoundRecord$RecordResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SoundRecord$RecordResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SoundRecord$RecordResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SoundRecord$RecordResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SoundRecord$RecordResponse parseFrom(InputStream inputStream) throws IOException {
        return (SoundRecord$RecordResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SoundRecord$RecordResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SoundRecord$RecordResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SoundRecord$RecordResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SoundRecord$RecordResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
