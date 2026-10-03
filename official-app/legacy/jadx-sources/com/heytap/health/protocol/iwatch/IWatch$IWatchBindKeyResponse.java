package com.heytap.health.protocol.iwatch;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.f0a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class IWatch$IWatchBindKeyResponse extends GeneratedMessageLite<IWatch$IWatchBindKeyResponse, Builder> implements IWatch$IWatchBindKeyResponseOrBuilder {
    private static final IWatch$IWatchBindKeyResponse DEFAULT_INSTANCE;
    private static volatile Parser<IWatch$IWatchBindKeyResponse> PARSER = null;
    public static final int SECRET_BIND_KEY_FIELD_NUMBER = 2;
    private String secretBindKey_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<IWatch$IWatchBindKeyResponse, Builder> implements IWatch$IWatchBindKeyResponseOrBuilder {
        public Builder clearSecretBindKey() {
            copyOnWrite();
            ((IWatch$IWatchBindKeyResponse) this.instance).clearSecretBindKey();
            return this;
        }

        @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchBindKeyResponseOrBuilder
        public String getSecretBindKey() {
            return ((IWatch$IWatchBindKeyResponse) this.instance).getSecretBindKey();
        }

        @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchBindKeyResponseOrBuilder
        public ByteString getSecretBindKeyBytes() {
            return ((IWatch$IWatchBindKeyResponse) this.instance).getSecretBindKeyBytes();
        }

        public Builder setSecretBindKey(String str) {
            copyOnWrite();
            ((IWatch$IWatchBindKeyResponse) this.instance).setSecretBindKey(str);
            return this;
        }

        public Builder setSecretBindKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((IWatch$IWatchBindKeyResponse) this.instance).setSecretBindKeyBytes(byteString);
            return this;
        }

        private Builder() {
            super(IWatch$IWatchBindKeyResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        IWatch$IWatchBindKeyResponse iWatch$IWatchBindKeyResponse = new IWatch$IWatchBindKeyResponse();
        DEFAULT_INSTANCE = iWatch$IWatchBindKeyResponse;
        GeneratedMessageLite.registerDefaultInstance(IWatch$IWatchBindKeyResponse.class, iWatch$IWatchBindKeyResponse);
    }

    private IWatch$IWatchBindKeyResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecretBindKey() {
        this.secretBindKey_ = getDefaultInstance().getSecretBindKey();
    }

    public static IWatch$IWatchBindKeyResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IWatch$IWatchBindKeyResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IWatch$IWatchBindKeyResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IWatch$IWatchBindKeyResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IWatch$IWatchBindKeyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IWatch$IWatchBindKeyResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecretBindKey(String str) {
        str.getClass();
        this.secretBindKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecretBindKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.secretBindKey_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = f0a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new IWatch$IWatchBindKeyResponse();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"secretBindKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IWatch$IWatchBindKeyResponse> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IWatch$IWatchBindKeyResponse.class) {
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

    @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchBindKeyResponseOrBuilder
    public String getSecretBindKey() {
        return this.secretBindKey_;
    }

    @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchBindKeyResponseOrBuilder
    public ByteString getSecretBindKeyBytes() {
        return ByteString.copyFromUtf8(this.secretBindKey_);
    }

    public static Builder newBuilder(IWatch$IWatchBindKeyResponse iWatch$IWatchBindKeyResponse) {
        return DEFAULT_INSTANCE.createBuilder(iWatch$IWatchBindKeyResponse);
    }

    public static IWatch$IWatchBindKeyResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$IWatchBindKeyResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IWatch$IWatchBindKeyResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$IWatchBindKeyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IWatch$IWatchBindKeyResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IWatch$IWatchBindKeyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IWatch$IWatchBindKeyResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$IWatchBindKeyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IWatch$IWatchBindKeyResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IWatch$IWatchBindKeyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IWatch$IWatchBindKeyResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$IWatchBindKeyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IWatch$IWatchBindKeyResponse parseFrom(InputStream inputStream) throws IOException {
        return (IWatch$IWatchBindKeyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IWatch$IWatchBindKeyResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$IWatchBindKeyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IWatch$IWatchBindKeyResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IWatch$IWatchBindKeyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IWatch$IWatchBindKeyResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$IWatchBindKeyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
