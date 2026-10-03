package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.fze;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes19.dex */
public final class Proto$OutfitEventMessage extends GeneratedMessageLite<Proto$OutfitEventMessage, Builder> implements Proto$OutfitEventMessageOrBuilder {
    private static final Proto$OutfitEventMessage DEFAULT_INSTANCE;
    private static volatile Parser<Proto$OutfitEventMessage> PARSER;

    public static final class Builder extends GeneratedMessageLite.Builder<Proto$OutfitEventMessage, Builder> implements Proto$OutfitEventMessageOrBuilder {
        private Builder() {
            super(Proto$OutfitEventMessage.DEFAULT_INSTANCE);
        }
    }

    static {
        Proto$OutfitEventMessage proto$OutfitEventMessage = new Proto$OutfitEventMessage();
        DEFAULT_INSTANCE = proto$OutfitEventMessage;
        GeneratedMessageLite.registerDefaultInstance(Proto$OutfitEventMessage.class, proto$OutfitEventMessage);
    }

    private Proto$OutfitEventMessage() {
    }

    public static Proto$OutfitEventMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Proto$OutfitEventMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Proto$OutfitEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$OutfitEventMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Proto$OutfitEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Proto$OutfitEventMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = fze.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Proto$OutfitEventMessage();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proto$OutfitEventMessage> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Proto$OutfitEventMessage.class) {
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

    public static Builder newBuilder(Proto$OutfitEventMessage proto$OutfitEventMessage) {
        return DEFAULT_INSTANCE.createBuilder(proto$OutfitEventMessage);
    }

    public static Proto$OutfitEventMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$OutfitEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$OutfitEventMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$OutfitEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Proto$OutfitEventMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Proto$OutfitEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Proto$OutfitEventMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$OutfitEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Proto$OutfitEventMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Proto$OutfitEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Proto$OutfitEventMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$OutfitEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Proto$OutfitEventMessage parseFrom(InputStream inputStream) throws IOException {
        return (Proto$OutfitEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$OutfitEventMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$OutfitEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$OutfitEventMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Proto$OutfitEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Proto$OutfitEventMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$OutfitEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
