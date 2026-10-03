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
public final class DMProto$OpenSourceAppInfo extends GeneratedMessageLite<DMProto$OpenSourceAppInfo, Builder> implements DMProto$OpenSourceAppInfoOrBuilder {
    private static final DMProto$OpenSourceAppInfo DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int PACKAGE_FIELD_NUMBER = 2;
    private static volatile Parser<DMProto$OpenSourceAppInfo> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private String name_ = "";
    private String package_ = "";
    private String version_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$OpenSourceAppInfo, Builder> implements DMProto$OpenSourceAppInfoOrBuilder {
        public Builder clearName() {
            copyOnWrite();
            ((DMProto$OpenSourceAppInfo) this.instance).clearName();
            return this;
        }

        public Builder clearPackage() {
            copyOnWrite();
            ((DMProto$OpenSourceAppInfo) this.instance).clearPackage();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((DMProto$OpenSourceAppInfo) this.instance).clearVersion();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$OpenSourceAppInfoOrBuilder
        public String getName() {
            return ((DMProto$OpenSourceAppInfo) this.instance).getName();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$OpenSourceAppInfoOrBuilder
        public ByteString getNameBytes() {
            return ((DMProto$OpenSourceAppInfo) this.instance).getNameBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$OpenSourceAppInfoOrBuilder
        public String getPackage() {
            return ((DMProto$OpenSourceAppInfo) this.instance).getPackage();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$OpenSourceAppInfoOrBuilder
        public ByteString getPackageBytes() {
            return ((DMProto$OpenSourceAppInfo) this.instance).getPackageBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$OpenSourceAppInfoOrBuilder
        public String getVersion() {
            return ((DMProto$OpenSourceAppInfo) this.instance).getVersion();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$OpenSourceAppInfoOrBuilder
        public ByteString getVersionBytes() {
            return ((DMProto$OpenSourceAppInfo) this.instance).getVersionBytes();
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((DMProto$OpenSourceAppInfo) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$OpenSourceAppInfo) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setPackage(String str) {
            copyOnWrite();
            ((DMProto$OpenSourceAppInfo) this.instance).setPackage(str);
            return this;
        }

        public Builder setPackageBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$OpenSourceAppInfo) this.instance).setPackageBytes(byteString);
            return this;
        }

        public Builder setVersion(String str) {
            copyOnWrite();
            ((DMProto$OpenSourceAppInfo) this.instance).setVersion(str);
            return this;
        }

        public Builder setVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$OpenSourceAppInfo) this.instance).setVersionBytes(byteString);
            return this;
        }

        private Builder() {
            super(DMProto$OpenSourceAppInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$OpenSourceAppInfo dMProto$OpenSourceAppInfo = new DMProto$OpenSourceAppInfo();
        DEFAULT_INSTANCE = dMProto$OpenSourceAppInfo;
        GeneratedMessageLite.registerDefaultInstance(DMProto$OpenSourceAppInfo.class, dMProto$OpenSourceAppInfo);
    }

    private DMProto$OpenSourceAppInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackage() {
        this.package_ = getDefaultInstance().getPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    public static DMProto$OpenSourceAppInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$OpenSourceAppInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$OpenSourceAppInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$OpenSourceAppInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$OpenSourceAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$OpenSourceAppInfo> parser() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackage(String str) {
        str.getClass();
        this.package_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.package_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.version_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$OpenSourceAppInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"name_", "package_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$OpenSourceAppInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$OpenSourceAppInfo.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$OpenSourceAppInfoOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$OpenSourceAppInfoOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$OpenSourceAppInfoOrBuilder
    public String getPackage() {
        return this.package_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$OpenSourceAppInfoOrBuilder
    public ByteString getPackageBytes() {
        return ByteString.copyFromUtf8(this.package_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$OpenSourceAppInfoOrBuilder
    public String getVersion() {
        return this.version_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$OpenSourceAppInfoOrBuilder
    public ByteString getVersionBytes() {
        return ByteString.copyFromUtf8(this.version_);
    }

    public static Builder newBuilder(DMProto$OpenSourceAppInfo dMProto$OpenSourceAppInfo) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$OpenSourceAppInfo);
    }

    public static DMProto$OpenSourceAppInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$OpenSourceAppInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$OpenSourceAppInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$OpenSourceAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$OpenSourceAppInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$OpenSourceAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$OpenSourceAppInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$OpenSourceAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$OpenSourceAppInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$OpenSourceAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$OpenSourceAppInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$OpenSourceAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$OpenSourceAppInfo parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$OpenSourceAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$OpenSourceAppInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$OpenSourceAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$OpenSourceAppInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$OpenSourceAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$OpenSourceAppInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$OpenSourceAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
