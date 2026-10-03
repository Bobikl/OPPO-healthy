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
public final class SoundRecord$RecordSyncResponse extends GeneratedMessageLite<SoundRecord$RecordSyncResponse, Builder> implements SoundRecord$RecordSyncResponseOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final SoundRecord$RecordSyncResponse DEFAULT_INSTANCE;
    public static final int FILE_ID_FIELD_NUMBER = 2;
    private static volatile Parser<SoundRecord$RecordSyncResponse> PARSER;
    private int code_;
    private long fileId_;

    public static final class Builder extends GeneratedMessageLite.Builder<SoundRecord$RecordSyncResponse, Builder> implements SoundRecord$RecordSyncResponseOrBuilder {
        public Builder clearCode() {
            copyOnWrite();
            ((SoundRecord$RecordSyncResponse) this.instance).clearCode();
            return this;
        }

        public Builder clearFileId() {
            copyOnWrite();
            ((SoundRecord$RecordSyncResponse) this.instance).clearFileId();
            return this;
        }

        @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordSyncResponseOrBuilder
        public int getCode() {
            return ((SoundRecord$RecordSyncResponse) this.instance).getCode();
        }

        @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordSyncResponseOrBuilder
        public long getFileId() {
            return ((SoundRecord$RecordSyncResponse) this.instance).getFileId();
        }

        public Builder setCode(int i) {
            copyOnWrite();
            ((SoundRecord$RecordSyncResponse) this.instance).setCode(i);
            return this;
        }

        public Builder setFileId(long j2) {
            copyOnWrite();
            ((SoundRecord$RecordSyncResponse) this.instance).setFileId(j2);
            return this;
        }

        private Builder() {
            super(SoundRecord$RecordSyncResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        SoundRecord$RecordSyncResponse soundRecord$RecordSyncResponse = new SoundRecord$RecordSyncResponse();
        DEFAULT_INSTANCE = soundRecord$RecordSyncResponse;
        GeneratedMessageLite.registerDefaultInstance(SoundRecord$RecordSyncResponse.class, soundRecord$RecordSyncResponse);
    }

    private SoundRecord$RecordSyncResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileId() {
        this.fileId_ = 0L;
    }

    public static SoundRecord$RecordSyncResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SoundRecord$RecordSyncResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SoundRecord$RecordSyncResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SoundRecord$RecordSyncResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordSyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SoundRecord$RecordSyncResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i) {
        this.code_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileId(long j2) {
        this.fileId_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = c3i.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SoundRecord$RecordSyncResponse();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u0003", new Object[]{"code_", "fileId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SoundRecord$RecordSyncResponse> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SoundRecord$RecordSyncResponse.class) {
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

    @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordSyncResponseOrBuilder
    public int getCode() {
        return this.code_;
    }

    @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordSyncResponseOrBuilder
    public long getFileId() {
        return this.fileId_;
    }

    public static Builder newBuilder(SoundRecord$RecordSyncResponse soundRecord$RecordSyncResponse) {
        return DEFAULT_INSTANCE.createBuilder(soundRecord$RecordSyncResponse);
    }

    public static SoundRecord$RecordSyncResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordSyncResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SoundRecord$RecordSyncResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordSyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SoundRecord$RecordSyncResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordSyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SoundRecord$RecordSyncResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordSyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SoundRecord$RecordSyncResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordSyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SoundRecord$RecordSyncResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordSyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SoundRecord$RecordSyncResponse parseFrom(InputStream inputStream) throws IOException {
        return (SoundRecord$RecordSyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SoundRecord$RecordSyncResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordSyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SoundRecord$RecordSyncResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SoundRecord$RecordSyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SoundRecord$RecordSyncResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordSyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
