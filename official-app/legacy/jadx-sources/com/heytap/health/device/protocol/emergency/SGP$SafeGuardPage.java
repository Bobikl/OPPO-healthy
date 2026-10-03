package com.heytap.health.device.protocol.emergency;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.l5g;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class SGP$SafeGuardPage extends GeneratedMessageLite<SGP$SafeGuardPage, Builder> implements SGP$SafeGuardPageOrBuilder {
    private static final SGP$SafeGuardPage DEFAULT_INSTANCE;
    public static final int PAGECODE_FIELD_NUMBER = 1;
    private static volatile Parser<SGP$SafeGuardPage> PARSER;
    private int pageCode_;

    public static final class Builder extends GeneratedMessageLite.Builder<SGP$SafeGuardPage, Builder> implements SGP$SafeGuardPageOrBuilder {
        public Builder clearPageCode() {
            copyOnWrite();
            ((SGP$SafeGuardPage) this.instance).clearPageCode();
            return this;
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardPageOrBuilder
        public int getPageCode() {
            return ((SGP$SafeGuardPage) this.instance).getPageCode();
        }

        public Builder setPageCode(int i) {
            copyOnWrite();
            ((SGP$SafeGuardPage) this.instance).setPageCode(i);
            return this;
        }

        private Builder() {
            super(SGP$SafeGuardPage.DEFAULT_INSTANCE);
        }
    }

    static {
        SGP$SafeGuardPage sGP$SafeGuardPage = new SGP$SafeGuardPage();
        DEFAULT_INSTANCE = sGP$SafeGuardPage;
        GeneratedMessageLite.registerDefaultInstance(SGP$SafeGuardPage.class, sGP$SafeGuardPage);
    }

    private SGP$SafeGuardPage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageCode() {
        this.pageCode_ = 0;
    }

    public static SGP$SafeGuardPage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SGP$SafeGuardPage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SGP$SafeGuardPage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SGP$SafeGuardPage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SGP$SafeGuardPage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageCode(int i) {
        this.pageCode_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = l5g.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SGP$SafeGuardPage();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"pageCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SGP$SafeGuardPage> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SGP$SafeGuardPage.class) {
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

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardPageOrBuilder
    public int getPageCode() {
        return this.pageCode_;
    }

    public static Builder newBuilder(SGP$SafeGuardPage sGP$SafeGuardPage) {
        return DEFAULT_INSTANCE.createBuilder(sGP$SafeGuardPage);
    }

    public static SGP$SafeGuardPage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$SafeGuardPage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SGP$SafeGuardPage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SGP$SafeGuardPage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SGP$SafeGuardPage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SGP$SafeGuardPage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SGP$SafeGuardPage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SGP$SafeGuardPage parseFrom(InputStream inputStream) throws IOException {
        return (SGP$SafeGuardPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SGP$SafeGuardPage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$SafeGuardPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SGP$SafeGuardPage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SGP$SafeGuardPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SGP$SafeGuardPage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$SafeGuardPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
