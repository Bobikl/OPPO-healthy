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
public final class IccoaDkfConstant$Int32 extends GeneratedMessageLite<IccoaDkfConstant$Int32, Builder> implements IccoaDkfConstant$Int32OrBuilder {
    private static final IccoaDkfConstant$Int32 DEFAULT_INSTANCE;
    private static volatile Parser<IccoaDkfConstant$Int32> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    public static final class Builder extends GeneratedMessageLite.Builder<IccoaDkfConstant$Int32, Builder> implements IccoaDkfConstant$Int32OrBuilder {
        public Builder clearValue() {
            copyOnWrite();
            ((IccoaDkfConstant$Int32) this.instance).clearValue();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$Int32OrBuilder
        public int getValue() {
            return ((IccoaDkfConstant$Int32) this.instance).getValue();
        }

        public Builder setValue(int i) {
            copyOnWrite();
            ((IccoaDkfConstant$Int32) this.instance).setValue(i);
            return this;
        }

        private Builder() {
            super(IccoaDkfConstant$Int32.DEFAULT_INSTANCE);
        }
    }

    static {
        IccoaDkfConstant$Int32 iccoaDkfConstant$Int32 = new IccoaDkfConstant$Int32();
        DEFAULT_INSTANCE = iccoaDkfConstant$Int32;
        GeneratedMessageLite.registerDefaultInstance(IccoaDkfConstant$Int32.class, iccoaDkfConstant$Int32);
    }

    private IccoaDkfConstant$Int32() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static IccoaDkfConstant$Int32 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IccoaDkfConstant$Int32 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$Int32) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$Int32 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$Int32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IccoaDkfConstant$Int32> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i) {
        this.value_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = j1a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new IccoaDkfConstant$Int32();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IccoaDkfConstant$Int32> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IccoaDkfConstant$Int32.class) {
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

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$Int32OrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder(IccoaDkfConstant$Int32 iccoaDkfConstant$Int32) {
        return DEFAULT_INSTANCE.createBuilder(iccoaDkfConstant$Int32);
    }

    public static IccoaDkfConstant$Int32 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$Int32) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$Int32 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$Int32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IccoaDkfConstant$Int32 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$Int32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IccoaDkfConstant$Int32 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$Int32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IccoaDkfConstant$Int32 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$Int32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IccoaDkfConstant$Int32 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$Int32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IccoaDkfConstant$Int32 parseFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$Int32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$Int32 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$Int32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$Int32 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IccoaDkfConstant$Int32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IccoaDkfConstant$Int32 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$Int32) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
