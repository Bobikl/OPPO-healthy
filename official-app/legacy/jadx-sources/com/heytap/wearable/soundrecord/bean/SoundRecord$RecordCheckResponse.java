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
public final class SoundRecord$RecordCheckResponse extends GeneratedMessageLite<SoundRecord$RecordCheckResponse, Builder> implements SoundRecord$RecordCheckResponseOrBuilder {
    private static final SoundRecord$RecordCheckResponse DEFAULT_INSTANCE;
    private static volatile Parser<SoundRecord$RecordCheckResponse> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;

    public static final class Builder extends GeneratedMessageLite.Builder<SoundRecord$RecordCheckResponse, Builder> implements SoundRecord$RecordCheckResponseOrBuilder {
        public Builder clearStatus() {
            copyOnWrite();
            ((SoundRecord$RecordCheckResponse) this.instance).clearStatus();
            return this;
        }

        @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordCheckResponseOrBuilder
        public int getStatus() {
            return ((SoundRecord$RecordCheckResponse) this.instance).getStatus();
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((SoundRecord$RecordCheckResponse) this.instance).setStatus(i);
            return this;
        }

        private Builder() {
            super(SoundRecord$RecordCheckResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        SoundRecord$RecordCheckResponse soundRecord$RecordCheckResponse = new SoundRecord$RecordCheckResponse();
        DEFAULT_INSTANCE = soundRecord$RecordCheckResponse;
        GeneratedMessageLite.registerDefaultInstance(SoundRecord$RecordCheckResponse.class, soundRecord$RecordCheckResponse);
    }

    private SoundRecord$RecordCheckResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    public static SoundRecord$RecordCheckResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SoundRecord$RecordCheckResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SoundRecord$RecordCheckResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SoundRecord$RecordCheckResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordCheckResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SoundRecord$RecordCheckResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = c3i.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SoundRecord$RecordCheckResponse();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"status_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SoundRecord$RecordCheckResponse> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SoundRecord$RecordCheckResponse.class) {
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

    @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordCheckResponseOrBuilder
    public int getStatus() {
        return this.status_;
    }

    public static Builder newBuilder(SoundRecord$RecordCheckResponse soundRecord$RecordCheckResponse) {
        return DEFAULT_INSTANCE.createBuilder(soundRecord$RecordCheckResponse);
    }

    public static SoundRecord$RecordCheckResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordCheckResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SoundRecord$RecordCheckResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordCheckResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SoundRecord$RecordCheckResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordCheckResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SoundRecord$RecordCheckResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordCheckResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SoundRecord$RecordCheckResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordCheckResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SoundRecord$RecordCheckResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordCheckResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SoundRecord$RecordCheckResponse parseFrom(InputStream inputStream) throws IOException {
        return (SoundRecord$RecordCheckResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SoundRecord$RecordCheckResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordCheckResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SoundRecord$RecordCheckResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SoundRecord$RecordCheckResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SoundRecord$RecordCheckResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordCheckResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
