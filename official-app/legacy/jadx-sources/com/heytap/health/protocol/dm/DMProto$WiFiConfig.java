package com.heytap.health.protocol.dm;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.yl4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class DMProto$WiFiConfig extends GeneratedMessageLite<DMProto$WiFiConfig, Builder> implements DMProto$WiFiConfigOrBuilder {
    private static final DMProto$WiFiConfig DEFAULT_INSTANCE;
    private static volatile Parser<DMProto$WiFiConfig> PARSER = null;
    public static final int PWD_FIELD_NUMBER = 2;
    public static final int SECURITYTYPE_FIELD_NUMBER = 3;
    public static final int SSID_FIELD_NUMBER = 1;
    private int securityType_;
    private String ssid_ = "";
    private String pwd_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$WiFiConfig, Builder> implements DMProto$WiFiConfigOrBuilder {
        public Builder clearPwd() {
            copyOnWrite();
            ((DMProto$WiFiConfig) this.instance).clearPwd();
            return this;
        }

        public Builder clearSecurityType() {
            copyOnWrite();
            ((DMProto$WiFiConfig) this.instance).clearSecurityType();
            return this;
        }

        public Builder clearSsid() {
            copyOnWrite();
            ((DMProto$WiFiConfig) this.instance).clearSsid();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$WiFiConfigOrBuilder
        public String getPwd() {
            return ((DMProto$WiFiConfig) this.instance).getPwd();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$WiFiConfigOrBuilder
        public ByteString getPwdBytes() {
            return ((DMProto$WiFiConfig) this.instance).getPwdBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$WiFiConfigOrBuilder
        public int getSecurityType() {
            return ((DMProto$WiFiConfig) this.instance).getSecurityType();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$WiFiConfigOrBuilder
        public String getSsid() {
            return ((DMProto$WiFiConfig) this.instance).getSsid();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$WiFiConfigOrBuilder
        public ByteString getSsidBytes() {
            return ((DMProto$WiFiConfig) this.instance).getSsidBytes();
        }

        public Builder setPwd(String str) {
            copyOnWrite();
            ((DMProto$WiFiConfig) this.instance).setPwd(str);
            return this;
        }

        public Builder setPwdBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$WiFiConfig) this.instance).setPwdBytes(byteString);
            return this;
        }

        public Builder setSecurityType(int i) {
            copyOnWrite();
            ((DMProto$WiFiConfig) this.instance).setSecurityType(i);
            return this;
        }

        public Builder setSsid(String str) {
            copyOnWrite();
            ((DMProto$WiFiConfig) this.instance).setSsid(str);
            return this;
        }

        public Builder setSsidBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$WiFiConfig) this.instance).setSsidBytes(byteString);
            return this;
        }

        private Builder() {
            super(DMProto$WiFiConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$WiFiConfig dMProto$WiFiConfig = new DMProto$WiFiConfig();
        DEFAULT_INSTANCE = dMProto$WiFiConfig;
        GeneratedMessageLite.registerDefaultInstance(DMProto$WiFiConfig.class, dMProto$WiFiConfig);
    }

    private DMProto$WiFiConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPwd() {
        this.pwd_ = getDefaultInstance().getPwd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecurityType() {
        this.securityType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSsid() {
        this.ssid_ = getDefaultInstance().getSsid();
    }

    public static DMProto$WiFiConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$WiFiConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$WiFiConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$WiFiConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$WiFiConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$WiFiConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPwd(String str) {
        str.getClass();
        this.pwd_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPwdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pwd_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecurityType(int i) {
        this.securityType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSsid(String str) {
        str.getClass();
        this.ssid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSsidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ssid_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$WiFiConfig();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b", new Object[]{"ssid_", "pwd_", "securityType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$WiFiConfig> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$WiFiConfig.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$WiFiConfigOrBuilder
    public String getPwd() {
        return this.pwd_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$WiFiConfigOrBuilder
    public ByteString getPwdBytes() {
        return ByteString.copyFromUtf8(this.pwd_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$WiFiConfigOrBuilder
    public int getSecurityType() {
        return this.securityType_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$WiFiConfigOrBuilder
    public String getSsid() {
        return this.ssid_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$WiFiConfigOrBuilder
    public ByteString getSsidBytes() {
        return ByteString.copyFromUtf8(this.ssid_);
    }

    public static Builder newBuilder(DMProto$WiFiConfig dMProto$WiFiConfig) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$WiFiConfig);
    }

    public static DMProto$WiFiConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$WiFiConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$WiFiConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$WiFiConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$WiFiConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$WiFiConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$WiFiConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$WiFiConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$WiFiConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$WiFiConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$WiFiConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$WiFiConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$WiFiConfig parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$WiFiConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$WiFiConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$WiFiConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$WiFiConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$WiFiConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$WiFiConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$WiFiConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
