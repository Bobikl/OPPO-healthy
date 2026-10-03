package com.heytap.health.device.protocol.browser;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.y62;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class Browser$BrowserSupport extends GeneratedMessageLite<Browser$BrowserSupport, Builder> implements Browser$BrowserSupportOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final Browser$BrowserSupport DEFAULT_INSTANCE;
    private static volatile Parser<Browser$BrowserSupport> PARSER;
    private int code_;

    public static final class Builder extends GeneratedMessageLite.Builder<Browser$BrowserSupport, Builder> implements Browser$BrowserSupportOrBuilder {
        public Builder clearCode() {
            copyOnWrite();
            ((Browser$BrowserSupport) this.instance).clearCode();
            return this;
        }

        @Override // com.heytap.health.device.protocol.browser.Browser$BrowserSupportOrBuilder
        public int getCode() {
            return ((Browser$BrowserSupport) this.instance).getCode();
        }

        public Builder setCode(int i) {
            copyOnWrite();
            ((Browser$BrowserSupport) this.instance).setCode(i);
            return this;
        }

        private Builder() {
            super(Browser$BrowserSupport.DEFAULT_INSTANCE);
        }
    }

    static {
        Browser$BrowserSupport browser$BrowserSupport = new Browser$BrowserSupport();
        DEFAULT_INSTANCE = browser$BrowserSupport;
        GeneratedMessageLite.registerDefaultInstance(Browser$BrowserSupport.class, browser$BrowserSupport);
    }

    private Browser$BrowserSupport() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    public static Browser$BrowserSupport getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Browser$BrowserSupport parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Browser$BrowserSupport) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Browser$BrowserSupport parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Browser$BrowserSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Browser$BrowserSupport> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i) {
        this.code_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = y62.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Browser$BrowserSupport();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"code_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Browser$BrowserSupport> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Browser$BrowserSupport.class) {
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

    @Override // com.heytap.health.device.protocol.browser.Browser$BrowserSupportOrBuilder
    public int getCode() {
        return this.code_;
    }

    public static Builder newBuilder(Browser$BrowserSupport browser$BrowserSupport) {
        return DEFAULT_INSTANCE.createBuilder(browser$BrowserSupport);
    }

    public static Browser$BrowserSupport parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Browser$BrowserSupport) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Browser$BrowserSupport parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Browser$BrowserSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Browser$BrowserSupport parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Browser$BrowserSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Browser$BrowserSupport parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Browser$BrowserSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Browser$BrowserSupport parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Browser$BrowserSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Browser$BrowserSupport parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Browser$BrowserSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Browser$BrowserSupport parseFrom(InputStream inputStream) throws IOException {
        return (Browser$BrowserSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Browser$BrowserSupport parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Browser$BrowserSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Browser$BrowserSupport parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Browser$BrowserSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Browser$BrowserSupport parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Browser$BrowserSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
