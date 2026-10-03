package com.heytap.health.protocol.iwatch;

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
public final class IWatch$IWatchConnectResultData extends GeneratedMessageLite<IWatch$IWatchConnectResultData, Builder> implements IWatch$IWatchConnectResultDataOrBuilder {
    public static final int BINDRESULT_FIELD_NUMBER = 1;
    private static final IWatch$IWatchConnectResultData DEFAULT_INSTANCE;
    private static volatile Parser<IWatch$IWatchConnectResultData> PARSER;
    private int bindResult_;

    public static final class Builder extends GeneratedMessageLite.Builder<IWatch$IWatchConnectResultData, Builder> implements IWatch$IWatchConnectResultDataOrBuilder {
        public Builder clearBindResult() {
            copyOnWrite();
            ((IWatch$IWatchConnectResultData) this.instance).clearBindResult();
            return this;
        }

        @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchConnectResultDataOrBuilder
        public int getBindResult() {
            return ((IWatch$IWatchConnectResultData) this.instance).getBindResult();
        }

        public Builder setBindResult(int i) {
            copyOnWrite();
            ((IWatch$IWatchConnectResultData) this.instance).setBindResult(i);
            return this;
        }

        private Builder() {
            super(IWatch$IWatchConnectResultData.DEFAULT_INSTANCE);
        }
    }

    static {
        IWatch$IWatchConnectResultData iWatch$IWatchConnectResultData = new IWatch$IWatchConnectResultData();
        DEFAULT_INSTANCE = iWatch$IWatchConnectResultData;
        GeneratedMessageLite.registerDefaultInstance(IWatch$IWatchConnectResultData.class, iWatch$IWatchConnectResultData);
    }

    private IWatch$IWatchConnectResultData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBindResult() {
        this.bindResult_ = 0;
    }

    public static IWatch$IWatchConnectResultData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IWatch$IWatchConnectResultData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IWatch$IWatchConnectResultData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IWatch$IWatchConnectResultData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IWatch$IWatchConnectResultData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IWatch$IWatchConnectResultData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBindResult(int i) {
        this.bindResult_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = f0a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new IWatch$IWatchConnectResultData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"bindResult_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IWatch$IWatchConnectResultData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IWatch$IWatchConnectResultData.class) {
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

    @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchConnectResultDataOrBuilder
    public int getBindResult() {
        return this.bindResult_;
    }

    public static Builder newBuilder(IWatch$IWatchConnectResultData iWatch$IWatchConnectResultData) {
        return DEFAULT_INSTANCE.createBuilder(iWatch$IWatchConnectResultData);
    }

    public static IWatch$IWatchConnectResultData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$IWatchConnectResultData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IWatch$IWatchConnectResultData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$IWatchConnectResultData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IWatch$IWatchConnectResultData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IWatch$IWatchConnectResultData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IWatch$IWatchConnectResultData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$IWatchConnectResultData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IWatch$IWatchConnectResultData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IWatch$IWatchConnectResultData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IWatch$IWatchConnectResultData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$IWatchConnectResultData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IWatch$IWatchConnectResultData parseFrom(InputStream inputStream) throws IOException {
        return (IWatch$IWatchConnectResultData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IWatch$IWatchConnectResultData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$IWatchConnectResultData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IWatch$IWatchConnectResultData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IWatch$IWatchConnectResultData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IWatch$IWatchConnectResultData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$IWatchConnectResultData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
