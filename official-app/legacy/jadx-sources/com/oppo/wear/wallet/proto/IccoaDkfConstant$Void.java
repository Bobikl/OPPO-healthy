package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.j1a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public final class IccoaDkfConstant$Void extends GeneratedMessageLite<IccoaDkfConstant$Void, Builder> implements IccoaDkfConstant$VoidOrBuilder {
    private static final IccoaDkfConstant$Void DEFAULT_INSTANCE;
    private static volatile Parser<IccoaDkfConstant$Void> PARSER;

    public static final class Builder extends GeneratedMessageLite.Builder<IccoaDkfConstant$Void, Builder> implements IccoaDkfConstant$VoidOrBuilder {
        private Builder() {
            super(IccoaDkfConstant$Void.DEFAULT_INSTANCE);
        }
    }

    static {
        IccoaDkfConstant$Void iccoaDkfConstant$Void = new IccoaDkfConstant$Void();
        DEFAULT_INSTANCE = iccoaDkfConstant$Void;
        GeneratedMessageLite.registerDefaultInstance(IccoaDkfConstant$Void.class, iccoaDkfConstant$Void);
    }

    private IccoaDkfConstant$Void() {
    }

    public static IccoaDkfConstant$Void getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IccoaDkfConstant$Void parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$Void) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$Void parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$Void) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IccoaDkfConstant$Void> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = j1a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new IccoaDkfConstant$Void();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IccoaDkfConstant$Void> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IccoaDkfConstant$Void.class) {
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

    public static Builder newBuilder(IccoaDkfConstant$Void iccoaDkfConstant$Void) {
        return DEFAULT_INSTANCE.createBuilder(iccoaDkfConstant$Void);
    }

    public static IccoaDkfConstant$Void parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$Void) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$Void parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$Void) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IccoaDkfConstant$Void parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$Void) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IccoaDkfConstant$Void parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$Void) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IccoaDkfConstant$Void parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$Void) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IccoaDkfConstant$Void parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$Void) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IccoaDkfConstant$Void parseFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$Void) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$Void parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$Void) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$Void parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IccoaDkfConstant$Void) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IccoaDkfConstant$Void parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$Void) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
