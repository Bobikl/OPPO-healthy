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
public final class IWatch$IWatchResetResult extends GeneratedMessageLite<IWatch$IWatchResetResult, Builder> implements IWatch$IWatchResetResultOrBuilder {
    private static final IWatch$IWatchResetResult DEFAULT_INSTANCE;
    private static volatile Parser<IWatch$IWatchResetResult> PARSER = null;
    public static final int RESULT_CODE_FIELD_NUMBER = 1;
    private int resultCode_;

    public static final class Builder extends GeneratedMessageLite.Builder<IWatch$IWatchResetResult, Builder> implements IWatch$IWatchResetResultOrBuilder {
        public Builder clearResultCode() {
            copyOnWrite();
            ((IWatch$IWatchResetResult) this.instance).clearResultCode();
            return this;
        }

        @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchResetResultOrBuilder
        public int getResultCode() {
            return ((IWatch$IWatchResetResult) this.instance).getResultCode();
        }

        public Builder setResultCode(int i) {
            copyOnWrite();
            ((IWatch$IWatchResetResult) this.instance).setResultCode(i);
            return this;
        }

        private Builder() {
            super(IWatch$IWatchResetResult.DEFAULT_INSTANCE);
        }
    }

    static {
        IWatch$IWatchResetResult iWatch$IWatchResetResult = new IWatch$IWatchResetResult();
        DEFAULT_INSTANCE = iWatch$IWatchResetResult;
        GeneratedMessageLite.registerDefaultInstance(IWatch$IWatchResetResult.class, iWatch$IWatchResetResult);
    }

    private IWatch$IWatchResetResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResultCode() {
        this.resultCode_ = 0;
    }

    public static IWatch$IWatchResetResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IWatch$IWatchResetResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IWatch$IWatchResetResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IWatch$IWatchResetResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IWatch$IWatchResetResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IWatch$IWatchResetResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultCode(int i) {
        this.resultCode_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = f0a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new IWatch$IWatchResetResult();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"resultCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IWatch$IWatchResetResult> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IWatch$IWatchResetResult.class) {
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

    @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchResetResultOrBuilder
    public int getResultCode() {
        return this.resultCode_;
    }

    public static Builder newBuilder(IWatch$IWatchResetResult iWatch$IWatchResetResult) {
        return DEFAULT_INSTANCE.createBuilder(iWatch$IWatchResetResult);
    }

    public static IWatch$IWatchResetResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$IWatchResetResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IWatch$IWatchResetResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$IWatchResetResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IWatch$IWatchResetResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IWatch$IWatchResetResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IWatch$IWatchResetResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$IWatchResetResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IWatch$IWatchResetResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IWatch$IWatchResetResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IWatch$IWatchResetResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$IWatchResetResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IWatch$IWatchResetResult parseFrom(InputStream inputStream) throws IOException {
        return (IWatch$IWatchResetResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IWatch$IWatchResetResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$IWatchResetResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IWatch$IWatchResetResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IWatch$IWatchResetResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IWatch$IWatchResetResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$IWatchResetResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
