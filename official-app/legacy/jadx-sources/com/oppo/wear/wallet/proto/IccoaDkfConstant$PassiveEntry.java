package com.oppo.wear.wallet.proto;

import com.google.protobuf.AbstractMessageLite;
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
public final class IccoaDkfConstant$PassiveEntry extends GeneratedMessageLite<IccoaDkfConstant$PassiveEntry, Builder> implements IccoaDkfConstant$PassiveEntryOrBuilder {
    private static final IccoaDkfConstant$PassiveEntry DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<IccoaDkfConstant$PassiveEntry> PARSER;
    private String name_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<IccoaDkfConstant$PassiveEntry, Builder> implements IccoaDkfConstant$PassiveEntryOrBuilder {
        public Builder clearName() {
            copyOnWrite();
            ((IccoaDkfConstant$PassiveEntry) this.instance).clearName();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$PassiveEntryOrBuilder
        public String getName() {
            return ((IccoaDkfConstant$PassiveEntry) this.instance).getName();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$PassiveEntryOrBuilder
        public ByteString getNameBytes() {
            return ((IccoaDkfConstant$PassiveEntry) this.instance).getNameBytes();
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((IccoaDkfConstant$PassiveEntry) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$PassiveEntry) this.instance).setNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(IccoaDkfConstant$PassiveEntry.DEFAULT_INSTANCE);
        }
    }

    static {
        IccoaDkfConstant$PassiveEntry iccoaDkfConstant$PassiveEntry = new IccoaDkfConstant$PassiveEntry();
        DEFAULT_INSTANCE = iccoaDkfConstant$PassiveEntry;
        GeneratedMessageLite.registerDefaultInstance(IccoaDkfConstant$PassiveEntry.class, iccoaDkfConstant$PassiveEntry);
    }

    private IccoaDkfConstant$PassiveEntry() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static IccoaDkfConstant$PassiveEntry getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IccoaDkfConstant$PassiveEntry parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$PassiveEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$PassiveEntry parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$PassiveEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IccoaDkfConstant$PassiveEntry> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = j1a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new IccoaDkfConstant$PassiveEntry();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IccoaDkfConstant$PassiveEntry> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IccoaDkfConstant$PassiveEntry.class) {
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

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$PassiveEntryOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$PassiveEntryOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public static Builder newBuilder(IccoaDkfConstant$PassiveEntry iccoaDkfConstant$PassiveEntry) {
        return DEFAULT_INSTANCE.createBuilder(iccoaDkfConstant$PassiveEntry);
    }

    public static IccoaDkfConstant$PassiveEntry parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$PassiveEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$PassiveEntry parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$PassiveEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IccoaDkfConstant$PassiveEntry parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$PassiveEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IccoaDkfConstant$PassiveEntry parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$PassiveEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IccoaDkfConstant$PassiveEntry parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$PassiveEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IccoaDkfConstant$PassiveEntry parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$PassiveEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IccoaDkfConstant$PassiveEntry parseFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$PassiveEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$PassiveEntry parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$PassiveEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$PassiveEntry parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IccoaDkfConstant$PassiveEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IccoaDkfConstant$PassiveEntry parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$PassiveEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
