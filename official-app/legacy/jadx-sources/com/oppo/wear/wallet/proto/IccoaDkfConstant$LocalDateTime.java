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
public final class IccoaDkfConstant$LocalDateTime extends GeneratedMessageLite<IccoaDkfConstant$LocalDateTime, Builder> implements IccoaDkfConstant$LocalDateTimeOrBuilder {
    private static final IccoaDkfConstant$LocalDateTime DEFAULT_INSTANCE;
    private static volatile Parser<IccoaDkfConstant$LocalDateTime> PARSER;

    public static final class Builder extends GeneratedMessageLite.Builder<IccoaDkfConstant$LocalDateTime, Builder> implements IccoaDkfConstant$LocalDateTimeOrBuilder {
        private Builder() {
            super(IccoaDkfConstant$LocalDateTime.DEFAULT_INSTANCE);
        }
    }

    static {
        IccoaDkfConstant$LocalDateTime iccoaDkfConstant$LocalDateTime = new IccoaDkfConstant$LocalDateTime();
        DEFAULT_INSTANCE = iccoaDkfConstant$LocalDateTime;
        GeneratedMessageLite.registerDefaultInstance(IccoaDkfConstant$LocalDateTime.class, iccoaDkfConstant$LocalDateTime);
    }

    private IccoaDkfConstant$LocalDateTime() {
    }

    public static IccoaDkfConstant$LocalDateTime getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IccoaDkfConstant$LocalDateTime parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$LocalDateTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$LocalDateTime parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$LocalDateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IccoaDkfConstant$LocalDateTime> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = j1a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new IccoaDkfConstant$LocalDateTime();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IccoaDkfConstant$LocalDateTime> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IccoaDkfConstant$LocalDateTime.class) {
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

    public static Builder newBuilder(IccoaDkfConstant$LocalDateTime iccoaDkfConstant$LocalDateTime) {
        return DEFAULT_INSTANCE.createBuilder(iccoaDkfConstant$LocalDateTime);
    }

    public static IccoaDkfConstant$LocalDateTime parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$LocalDateTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$LocalDateTime parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$LocalDateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IccoaDkfConstant$LocalDateTime parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$LocalDateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IccoaDkfConstant$LocalDateTime parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$LocalDateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IccoaDkfConstant$LocalDateTime parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$LocalDateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IccoaDkfConstant$LocalDateTime parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$LocalDateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IccoaDkfConstant$LocalDateTime parseFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$LocalDateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$LocalDateTime parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$LocalDateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$LocalDateTime parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IccoaDkfConstant$LocalDateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IccoaDkfConstant$LocalDateTime parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$LocalDateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
