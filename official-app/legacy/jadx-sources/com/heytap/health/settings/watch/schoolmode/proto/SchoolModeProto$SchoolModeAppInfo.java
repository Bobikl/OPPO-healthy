package com.heytap.health.settings.watch.schoolmode.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.ohg;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes18.dex */
public final class SchoolModeProto$SchoolModeAppInfo extends GeneratedMessageLite<SchoolModeProto$SchoolModeAppInfo, Builder> implements SchoolModeProto$SchoolModeAppInfoOrBuilder {
    public static final int APPNAME_FIELD_NUMBER = 3;
    private static final SchoolModeProto$SchoolModeAppInfo DEFAULT_INSTANCE;
    public static final int ITEMENABLE_FIELD_NUMBER = 2;
    public static final int PACKAGENAME_FIELD_NUMBER = 1;
    private static volatile Parser<SchoolModeProto$SchoolModeAppInfo> PARSER;
    private boolean itemEnable_;
    private String packageName_ = "";
    private String appName_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<SchoolModeProto$SchoolModeAppInfo, Builder> implements SchoolModeProto$SchoolModeAppInfoOrBuilder {
        public Builder clearAppName() {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeAppInfo) this.instance).clearAppName();
            return this;
        }

        public Builder clearItemEnable() {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeAppInfo) this.instance).clearItemEnable();
            return this;
        }

        public Builder clearPackageName() {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeAppInfo) this.instance).clearPackageName();
            return this;
        }

        @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeAppInfoOrBuilder
        public String getAppName() {
            return ((SchoolModeProto$SchoolModeAppInfo) this.instance).getAppName();
        }

        @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeAppInfoOrBuilder
        public ByteString getAppNameBytes() {
            return ((SchoolModeProto$SchoolModeAppInfo) this.instance).getAppNameBytes();
        }

        @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeAppInfoOrBuilder
        public boolean getItemEnable() {
            return ((SchoolModeProto$SchoolModeAppInfo) this.instance).getItemEnable();
        }

        @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeAppInfoOrBuilder
        public String getPackageName() {
            return ((SchoolModeProto$SchoolModeAppInfo) this.instance).getPackageName();
        }

        @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeAppInfoOrBuilder
        public ByteString getPackageNameBytes() {
            return ((SchoolModeProto$SchoolModeAppInfo) this.instance).getPackageNameBytes();
        }

        public Builder setAppName(String str) {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeAppInfo) this.instance).setAppName(str);
            return this;
        }

        public Builder setAppNameBytes(ByteString byteString) {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeAppInfo) this.instance).setAppNameBytes(byteString);
            return this;
        }

        public Builder setItemEnable(boolean z) {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeAppInfo) this.instance).setItemEnable(z);
            return this;
        }

        public Builder setPackageName(String str) {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeAppInfo) this.instance).setPackageName(str);
            return this;
        }

        public Builder setPackageNameBytes(ByteString byteString) {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeAppInfo) this.instance).setPackageNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(SchoolModeProto$SchoolModeAppInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        SchoolModeProto$SchoolModeAppInfo schoolModeProto$SchoolModeAppInfo = new SchoolModeProto$SchoolModeAppInfo();
        DEFAULT_INSTANCE = schoolModeProto$SchoolModeAppInfo;
        GeneratedMessageLite.registerDefaultInstance(SchoolModeProto$SchoolModeAppInfo.class, schoolModeProto$SchoolModeAppInfo);
    }

    private SchoolModeProto$SchoolModeAppInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppName() {
        this.appName_ = getDefaultInstance().getAppName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItemEnable() {
        this.itemEnable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackageName() {
        this.packageName_ = getDefaultInstance().getPackageName();
    }

    public static SchoolModeProto$SchoolModeAppInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SchoolModeProto$SchoolModeAppInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SchoolModeProto$SchoolModeAppInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SchoolModeProto$SchoolModeAppInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SchoolModeProto$SchoolModeAppInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppName(String str) {
        str.getClass();
        this.appName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.appName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemEnable(boolean z) {
        this.itemEnable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageName(String str) {
        str.getClass();
        this.packageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.packageName_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ohg.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SchoolModeProto$SchoolModeAppInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003Ȉ", new Object[]{"packageName_", "itemEnable_", "appName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SchoolModeProto$SchoolModeAppInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SchoolModeProto$SchoolModeAppInfo.class) {
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

    @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeAppInfoOrBuilder
    public String getAppName() {
        return this.appName_;
    }

    @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeAppInfoOrBuilder
    public ByteString getAppNameBytes() {
        return ByteString.copyFromUtf8(this.appName_);
    }

    @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeAppInfoOrBuilder
    public boolean getItemEnable() {
        return this.itemEnable_;
    }

    @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeAppInfoOrBuilder
    public String getPackageName() {
        return this.packageName_;
    }

    @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeAppInfoOrBuilder
    public ByteString getPackageNameBytes() {
        return ByteString.copyFromUtf8(this.packageName_);
    }

    public static Builder newBuilder(SchoolModeProto$SchoolModeAppInfo schoolModeProto$SchoolModeAppInfo) {
        return DEFAULT_INSTANCE.createBuilder(schoolModeProto$SchoolModeAppInfo);
    }

    public static SchoolModeProto$SchoolModeAppInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SchoolModeProto$SchoolModeAppInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeAppInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeAppInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SchoolModeProto$SchoolModeAppInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeAppInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SchoolModeProto$SchoolModeAppInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeAppInfo parseFrom(InputStream inputStream) throws IOException {
        return (SchoolModeProto$SchoolModeAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SchoolModeProto$SchoolModeAppInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SchoolModeProto$SchoolModeAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeAppInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SchoolModeProto$SchoolModeAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SchoolModeProto$SchoolModeAppInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SchoolModeProto$SchoolModeAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
