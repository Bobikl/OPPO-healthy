package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.d6j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public final class SwitchCard$SwitchOpen extends GeneratedMessageLite<SwitchCard$SwitchOpen, Builder> implements SwitchCard$SwitchOpenOrBuilder {
    private static final SwitchCard$SwitchOpen DEFAULT_INSTANCE;
    public static final int ISOPEN_FIELD_NUMBER = 1;
    private static volatile Parser<SwitchCard$SwitchOpen> PARSER;
    private boolean isOpen_;

    public static final class Builder extends GeneratedMessageLite.Builder<SwitchCard$SwitchOpen, Builder> implements SwitchCard$SwitchOpenOrBuilder {
        public Builder clearIsOpen() {
            copyOnWrite();
            ((SwitchCard$SwitchOpen) this.instance).clearIsOpen();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.SwitchCard$SwitchOpenOrBuilder
        public boolean getIsOpen() {
            return ((SwitchCard$SwitchOpen) this.instance).getIsOpen();
        }

        public Builder setIsOpen(boolean z) {
            copyOnWrite();
            ((SwitchCard$SwitchOpen) this.instance).setIsOpen(z);
            return this;
        }

        private Builder() {
            super(SwitchCard$SwitchOpen.DEFAULT_INSTANCE);
        }
    }

    static {
        SwitchCard$SwitchOpen switchCard$SwitchOpen = new SwitchCard$SwitchOpen();
        DEFAULT_INSTANCE = switchCard$SwitchOpen;
        GeneratedMessageLite.registerDefaultInstance(SwitchCard$SwitchOpen.class, switchCard$SwitchOpen);
    }

    private SwitchCard$SwitchOpen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsOpen() {
        this.isOpen_ = false;
    }

    public static SwitchCard$SwitchOpen getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SwitchCard$SwitchOpen parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SwitchCard$SwitchOpen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SwitchCard$SwitchOpen parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SwitchCard$SwitchOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SwitchCard$SwitchOpen> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsOpen(boolean z) {
        this.isOpen_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = d6j.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SwitchCard$SwitchOpen();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isOpen_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SwitchCard$SwitchOpen> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SwitchCard$SwitchOpen.class) {
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

    @Override // com.oppo.wear.wallet.proto.SwitchCard$SwitchOpenOrBuilder
    public boolean getIsOpen() {
        return this.isOpen_;
    }

    public static Builder newBuilder(SwitchCard$SwitchOpen switchCard$SwitchOpen) {
        return DEFAULT_INSTANCE.createBuilder(switchCard$SwitchOpen);
    }

    public static SwitchCard$SwitchOpen parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SwitchCard$SwitchOpen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SwitchCard$SwitchOpen parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SwitchCard$SwitchOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SwitchCard$SwitchOpen parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SwitchCard$SwitchOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SwitchCard$SwitchOpen parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SwitchCard$SwitchOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SwitchCard$SwitchOpen parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SwitchCard$SwitchOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SwitchCard$SwitchOpen parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SwitchCard$SwitchOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SwitchCard$SwitchOpen parseFrom(InputStream inputStream) throws IOException {
        return (SwitchCard$SwitchOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SwitchCard$SwitchOpen parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SwitchCard$SwitchOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SwitchCard$SwitchOpen parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SwitchCard$SwitchOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SwitchCard$SwitchOpen parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SwitchCard$SwitchOpen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
