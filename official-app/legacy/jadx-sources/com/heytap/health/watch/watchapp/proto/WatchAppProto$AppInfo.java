package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.l8l;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes19.dex */
public final class WatchAppProto$AppInfo extends GeneratedMessageLite<WatchAppProto$AppInfo, Builder> implements WatchAppProto$AppInfoOrBuilder {
    private static final WatchAppProto$AppInfo DEFAULT_INSTANCE;
    private static volatile Parser<WatchAppProto$AppInfo> PARSER = null;
    public static final int PKG_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int type_;
    private String pkgName_ = "";
    private String version_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<WatchAppProto$AppInfo, Builder> implements WatchAppProto$AppInfoOrBuilder {
        public Builder clearPkgName() {
            copyOnWrite();
            ((WatchAppProto$AppInfo) this.instance).clearPkgName();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((WatchAppProto$AppInfo) this.instance).clearType();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((WatchAppProto$AppInfo) this.instance).clearVersion();
            return this;
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppInfoOrBuilder
        public String getPkgName() {
            return ((WatchAppProto$AppInfo) this.instance).getPkgName();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppInfoOrBuilder
        public ByteString getPkgNameBytes() {
            return ((WatchAppProto$AppInfo) this.instance).getPkgNameBytes();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppInfoOrBuilder
        public int getType() {
            return ((WatchAppProto$AppInfo) this.instance).getType();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppInfoOrBuilder
        public String getVersion() {
            return ((WatchAppProto$AppInfo) this.instance).getVersion();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppInfoOrBuilder
        public ByteString getVersionBytes() {
            return ((WatchAppProto$AppInfo) this.instance).getVersionBytes();
        }

        public Builder setPkgName(String str) {
            copyOnWrite();
            ((WatchAppProto$AppInfo) this.instance).setPkgName(str);
            return this;
        }

        public Builder setPkgNameBytes(ByteString byteString) {
            copyOnWrite();
            ((WatchAppProto$AppInfo) this.instance).setPkgNameBytes(byteString);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((WatchAppProto$AppInfo) this.instance).setType(i);
            return this;
        }

        public Builder setVersion(String str) {
            copyOnWrite();
            ((WatchAppProto$AppInfo) this.instance).setVersion(str);
            return this;
        }

        public Builder setVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((WatchAppProto$AppInfo) this.instance).setVersionBytes(byteString);
            return this;
        }

        private Builder() {
            super(WatchAppProto$AppInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        WatchAppProto$AppInfo watchAppProto$AppInfo = new WatchAppProto$AppInfo();
        DEFAULT_INSTANCE = watchAppProto$AppInfo;
        GeneratedMessageLite.registerDefaultInstance(WatchAppProto$AppInfo.class, watchAppProto$AppInfo);
    }

    private WatchAppProto$AppInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPkgName() {
        this.pkgName_ = getDefaultInstance().getPkgName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    public static WatchAppProto$AppInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WatchAppProto$AppInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$AppInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$AppInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WatchAppProto$AppInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPkgName(String str) {
        str.getClass();
        this.pkgName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPkgNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pkgName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
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
        int i = l8l.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WatchAppProto$AppInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004", new Object[]{"pkgName_", "version_", "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WatchAppProto$AppInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WatchAppProto$AppInfo.class) {
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

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppInfoOrBuilder
    public String getPkgName() {
        return this.pkgName_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppInfoOrBuilder
    public ByteString getPkgNameBytes() {
        return ByteString.copyFromUtf8(this.pkgName_);
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppInfoOrBuilder
    public int getType() {
        return this.type_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppInfoOrBuilder
    public String getVersion() {
        return this.version_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppInfoOrBuilder
    public ByteString getVersionBytes() {
        return ByteString.copyFromUtf8(this.version_);
    }

    public static Builder newBuilder(WatchAppProto$AppInfo watchAppProto$AppInfo) {
        return DEFAULT_INSTANCE.createBuilder(watchAppProto$AppInfo);
    }

    public static WatchAppProto$AppInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$AppInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$AppInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WatchAppProto$AppInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WatchAppProto$AppInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WatchAppProto$AppInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WatchAppProto$AppInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WatchAppProto$AppInfo parseFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$AppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$AppInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$AppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$AppInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WatchAppProto$AppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WatchAppProto$AppInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$AppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
