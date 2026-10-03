package com.heytap.health.device.protocol.browser;

import com.google.protobuf.AbstractMessageLite;
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
public final class Browser$Label extends GeneratedMessageLite<Browser$Label, Builder> implements Browser$LabelOrBuilder {
    public static final int DEFAULT_FIELD_NUMBER = 5;
    private static final Browser$Label DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<Browser$Label> PARSER = null;
    public static final int URL_FIELD_NUMBER = 3;
    private boolean default_;
    private int id_;
    private String name_ = "";
    private String url_ = "";
    private String icon_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<Browser$Label, Builder> implements Browser$LabelOrBuilder {
        public Builder clearDefault() {
            copyOnWrite();
            ((Browser$Label) this.instance).clearDefault();
            return this;
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((Browser$Label) this.instance).clearIcon();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((Browser$Label) this.instance).clearId();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Browser$Label) this.instance).clearName();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((Browser$Label) this.instance).clearUrl();
            return this;
        }

        @Override // com.heytap.health.device.protocol.browser.Browser$LabelOrBuilder
        public boolean getDefault() {
            return ((Browser$Label) this.instance).getDefault();
        }

        @Override // com.heytap.health.device.protocol.browser.Browser$LabelOrBuilder
        public String getIcon() {
            return ((Browser$Label) this.instance).getIcon();
        }

        @Override // com.heytap.health.device.protocol.browser.Browser$LabelOrBuilder
        public ByteString getIconBytes() {
            return ((Browser$Label) this.instance).getIconBytes();
        }

        @Override // com.heytap.health.device.protocol.browser.Browser$LabelOrBuilder
        public int getId() {
            return ((Browser$Label) this.instance).getId();
        }

        @Override // com.heytap.health.device.protocol.browser.Browser$LabelOrBuilder
        public String getName() {
            return ((Browser$Label) this.instance).getName();
        }

        @Override // com.heytap.health.device.protocol.browser.Browser$LabelOrBuilder
        public ByteString getNameBytes() {
            return ((Browser$Label) this.instance).getNameBytes();
        }

        @Override // com.heytap.health.device.protocol.browser.Browser$LabelOrBuilder
        public String getUrl() {
            return ((Browser$Label) this.instance).getUrl();
        }

        @Override // com.heytap.health.device.protocol.browser.Browser$LabelOrBuilder
        public ByteString getUrlBytes() {
            return ((Browser$Label) this.instance).getUrlBytes();
        }

        public Builder setDefault(boolean z) {
            copyOnWrite();
            ((Browser$Label) this.instance).setDefault(z);
            return this;
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((Browser$Label) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((Browser$Label) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setId(int i) {
            copyOnWrite();
            ((Browser$Label) this.instance).setId(i);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Browser$Label) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Browser$Label) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((Browser$Label) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Browser$Label) this.instance).setUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(Browser$Label.DEFAULT_INSTANCE);
        }
    }

    static {
        Browser$Label browser$Label = new Browser$Label();
        DEFAULT_INSTANCE = browser$Label;
        GeneratedMessageLite.registerDefaultInstance(Browser$Label.class, browser$Label);
    }

    private Browser$Label() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefault() {
        this.default_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static Browser$Label getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Browser$Label parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Browser$Label) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Browser$Label parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Browser$Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Browser$Label> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefault(boolean z) {
        this.default_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i) {
        this.id_ = i;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = y62.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Browser$Label();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0007", new Object[]{"id_", "name_", "url_", "icon_", "default_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Browser$Label> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Browser$Label.class) {
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

    @Override // com.heytap.health.device.protocol.browser.Browser$LabelOrBuilder
    public boolean getDefault() {
        return this.default_;
    }

    @Override // com.heytap.health.device.protocol.browser.Browser$LabelOrBuilder
    public String getIcon() {
        return this.icon_;
    }

    @Override // com.heytap.health.device.protocol.browser.Browser$LabelOrBuilder
    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    @Override // com.heytap.health.device.protocol.browser.Browser$LabelOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // com.heytap.health.device.protocol.browser.Browser$LabelOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.heytap.health.device.protocol.browser.Browser$LabelOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.heytap.health.device.protocol.browser.Browser$LabelOrBuilder
    public String getUrl() {
        return this.url_;
    }

    @Override // com.heytap.health.device.protocol.browser.Browser$LabelOrBuilder
    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static Builder newBuilder(Browser$Label browser$Label) {
        return DEFAULT_INSTANCE.createBuilder(browser$Label);
    }

    public static Browser$Label parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Browser$Label) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Browser$Label parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Browser$Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Browser$Label parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Browser$Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Browser$Label parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Browser$Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Browser$Label parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Browser$Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Browser$Label parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Browser$Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Browser$Label parseFrom(InputStream inputStream) throws IOException {
        return (Browser$Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Browser$Label parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Browser$Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Browser$Label parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Browser$Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Browser$Label parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Browser$Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
