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
public final class IWatch$UnBindReq extends GeneratedMessageLite<IWatch$UnBindReq, Builder> implements IWatch$UnBindReqOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final IWatch$UnBindReq DEFAULT_INSTANCE;
    private static volatile Parser<IWatch$UnBindReq> PARSER;
    private int code_;

    public static final class Builder extends GeneratedMessageLite.Builder<IWatch$UnBindReq, Builder> implements IWatch$UnBindReqOrBuilder {
        public Builder clearCode() {
            copyOnWrite();
            ((IWatch$UnBindReq) this.instance).clearCode();
            return this;
        }

        @Override // com.heytap.health.protocol.iwatch.IWatch$UnBindReqOrBuilder
        public int getCode() {
            return ((IWatch$UnBindReq) this.instance).getCode();
        }

        public Builder setCode(int i) {
            copyOnWrite();
            ((IWatch$UnBindReq) this.instance).setCode(i);
            return this;
        }

        private Builder() {
            super(IWatch$UnBindReq.DEFAULT_INSTANCE);
        }
    }

    static {
        IWatch$UnBindReq iWatch$UnBindReq = new IWatch$UnBindReq();
        DEFAULT_INSTANCE = iWatch$UnBindReq;
        GeneratedMessageLite.registerDefaultInstance(IWatch$UnBindReq.class, iWatch$UnBindReq);
    }

    private IWatch$UnBindReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    public static IWatch$UnBindReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IWatch$UnBindReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IWatch$UnBindReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IWatch$UnBindReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IWatch$UnBindReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IWatch$UnBindReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i) {
        this.code_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = f0a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new IWatch$UnBindReq();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"code_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IWatch$UnBindReq> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IWatch$UnBindReq.class) {
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

    @Override // com.heytap.health.protocol.iwatch.IWatch$UnBindReqOrBuilder
    public int getCode() {
        return this.code_;
    }

    public static Builder newBuilder(IWatch$UnBindReq iWatch$UnBindReq) {
        return DEFAULT_INSTANCE.createBuilder(iWatch$UnBindReq);
    }

    public static IWatch$UnBindReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$UnBindReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IWatch$UnBindReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$UnBindReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IWatch$UnBindReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IWatch$UnBindReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IWatch$UnBindReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$UnBindReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IWatch$UnBindReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IWatch$UnBindReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IWatch$UnBindReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$UnBindReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IWatch$UnBindReq parseFrom(InputStream inputStream) throws IOException {
        return (IWatch$UnBindReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IWatch$UnBindReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$UnBindReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IWatch$UnBindReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IWatch$UnBindReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IWatch$UnBindReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$UnBindReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
