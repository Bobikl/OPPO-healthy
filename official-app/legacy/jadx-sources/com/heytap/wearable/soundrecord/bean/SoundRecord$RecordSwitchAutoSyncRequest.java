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
public final class SoundRecord$RecordSwitchAutoSyncRequest extends GeneratedMessageLite<SoundRecord$RecordSwitchAutoSyncRequest, Builder> implements SoundRecord$RecordSwitchAutoSyncRequestOrBuilder {
    private static final SoundRecord$RecordSwitchAutoSyncRequest DEFAULT_INSTANCE;
    private static volatile Parser<SoundRecord$RecordSwitchAutoSyncRequest> PARSER;

    public static final class Builder extends GeneratedMessageLite.Builder<SoundRecord$RecordSwitchAutoSyncRequest, Builder> implements SoundRecord$RecordSwitchAutoSyncRequestOrBuilder {
        private Builder() {
            super(SoundRecord$RecordSwitchAutoSyncRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        SoundRecord$RecordSwitchAutoSyncRequest soundRecord$RecordSwitchAutoSyncRequest = new SoundRecord$RecordSwitchAutoSyncRequest();
        DEFAULT_INSTANCE = soundRecord$RecordSwitchAutoSyncRequest;
        GeneratedMessageLite.registerDefaultInstance(SoundRecord$RecordSwitchAutoSyncRequest.class, soundRecord$RecordSwitchAutoSyncRequest);
    }

    private SoundRecord$RecordSwitchAutoSyncRequest() {
    }

    public static SoundRecord$RecordSwitchAutoSyncRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SoundRecord$RecordSwitchAutoSyncRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SoundRecord$RecordSwitchAutoSyncRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SoundRecord$RecordSwitchAutoSyncRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordSwitchAutoSyncRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SoundRecord$RecordSwitchAutoSyncRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = c3i.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SoundRecord$RecordSwitchAutoSyncRequest();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SoundRecord$RecordSwitchAutoSyncRequest> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SoundRecord$RecordSwitchAutoSyncRequest.class) {
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

    public static Builder newBuilder(SoundRecord$RecordSwitchAutoSyncRequest soundRecord$RecordSwitchAutoSyncRequest) {
        return DEFAULT_INSTANCE.createBuilder(soundRecord$RecordSwitchAutoSyncRequest);
    }

    public static SoundRecord$RecordSwitchAutoSyncRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordSwitchAutoSyncRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SoundRecord$RecordSwitchAutoSyncRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordSwitchAutoSyncRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SoundRecord$RecordSwitchAutoSyncRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordSwitchAutoSyncRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SoundRecord$RecordSwitchAutoSyncRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordSwitchAutoSyncRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SoundRecord$RecordSwitchAutoSyncRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordSwitchAutoSyncRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SoundRecord$RecordSwitchAutoSyncRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordSwitchAutoSyncRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SoundRecord$RecordSwitchAutoSyncRequest parseFrom(InputStream inputStream) throws IOException {
        return (SoundRecord$RecordSwitchAutoSyncRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SoundRecord$RecordSwitchAutoSyncRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordSwitchAutoSyncRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SoundRecord$RecordSwitchAutoSyncRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SoundRecord$RecordSwitchAutoSyncRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SoundRecord$RecordSwitchAutoSyncRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordSwitchAutoSyncRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
