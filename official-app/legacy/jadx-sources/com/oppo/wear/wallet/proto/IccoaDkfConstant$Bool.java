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
public final class IccoaDkfConstant$Bool extends GeneratedMessageLite<IccoaDkfConstant$Bool, Builder> implements IccoaDkfConstant$BoolOrBuilder {
    private static final IccoaDkfConstant$Bool DEFAULT_INSTANCE;
    private static volatile Parser<IccoaDkfConstant$Bool> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    public static final class Builder extends GeneratedMessageLite.Builder<IccoaDkfConstant$Bool, Builder> implements IccoaDkfConstant$BoolOrBuilder {
        public Builder clearValue() {
            copyOnWrite();
            ((IccoaDkfConstant$Bool) this.instance).clearValue();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$BoolOrBuilder
        public boolean getValue() {
            return ((IccoaDkfConstant$Bool) this.instance).getValue();
        }

        public Builder setValue(boolean z) {
            copyOnWrite();
            ((IccoaDkfConstant$Bool) this.instance).setValue(z);
            return this;
        }

        private Builder() {
            super(IccoaDkfConstant$Bool.DEFAULT_INSTANCE);
        }
    }

    static {
        IccoaDkfConstant$Bool iccoaDkfConstant$Bool = new IccoaDkfConstant$Bool();
        DEFAULT_INSTANCE = iccoaDkfConstant$Bool;
        GeneratedMessageLite.registerDefaultInstance(IccoaDkfConstant$Bool.class, iccoaDkfConstant$Bool);
    }

    private IccoaDkfConstant$Bool() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = false;
    }

    public static IccoaDkfConstant$Bool getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IccoaDkfConstant$Bool parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$Bool) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$Bool parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$Bool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IccoaDkfConstant$Bool> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(boolean z) {
        this.value_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = j1a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new IccoaDkfConstant$Bool();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IccoaDkfConstant$Bool> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IccoaDkfConstant$Bool.class) {
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

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$BoolOrBuilder
    public boolean getValue() {
        return this.value_;
    }

    public static Builder newBuilder(IccoaDkfConstant$Bool iccoaDkfConstant$Bool) {
        return DEFAULT_INSTANCE.createBuilder(iccoaDkfConstant$Bool);
    }

    public static IccoaDkfConstant$Bool parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$Bool) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$Bool parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$Bool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IccoaDkfConstant$Bool parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$Bool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IccoaDkfConstant$Bool parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$Bool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IccoaDkfConstant$Bool parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$Bool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IccoaDkfConstant$Bool parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$Bool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IccoaDkfConstant$Bool parseFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$Bool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$Bool parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$Bool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$Bool parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IccoaDkfConstant$Bool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IccoaDkfConstant$Bool parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$Bool) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
