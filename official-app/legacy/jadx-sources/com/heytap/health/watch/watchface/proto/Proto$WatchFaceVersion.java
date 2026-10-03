package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.fze;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes19.dex */
public final class Proto$WatchFaceVersion extends GeneratedMessageLite<Proto$WatchFaceVersion, Builder> implements Proto$WatchFaceVersionOrBuilder {
    private static final Proto$WatchFaceVersion DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Proto$WatchFaceVersion> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private String packageName_ = "";
    private int version_;

    public static final class Builder extends GeneratedMessageLite.Builder<Proto$WatchFaceVersion, Builder> implements Proto$WatchFaceVersionOrBuilder {
        public Builder clearPackageName() {
            copyOnWrite();
            ((Proto$WatchFaceVersion) this.instance).clearPackageName();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((Proto$WatchFaceVersion) this.instance).clearVersion();
            return this;
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceVersionOrBuilder
        public String getPackageName() {
            return ((Proto$WatchFaceVersion) this.instance).getPackageName();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceVersionOrBuilder
        public ByteString getPackageNameBytes() {
            return ((Proto$WatchFaceVersion) this.instance).getPackageNameBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceVersionOrBuilder
        public int getVersion() {
            return ((Proto$WatchFaceVersion) this.instance).getVersion();
        }

        public Builder setPackageName(String str) {
            copyOnWrite();
            ((Proto$WatchFaceVersion) this.instance).setPackageName(str);
            return this;
        }

        public Builder setPackageNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WatchFaceVersion) this.instance).setPackageNameBytes(byteString);
            return this;
        }

        public Builder setVersion(int i) {
            copyOnWrite();
            ((Proto$WatchFaceVersion) this.instance).setVersion(i);
            return this;
        }

        private Builder() {
            super(Proto$WatchFaceVersion.DEFAULT_INSTANCE);
        }
    }

    static {
        Proto$WatchFaceVersion proto$WatchFaceVersion = new Proto$WatchFaceVersion();
        DEFAULT_INSTANCE = proto$WatchFaceVersion;
        GeneratedMessageLite.registerDefaultInstance(Proto$WatchFaceVersion.class, proto$WatchFaceVersion);
    }

    private Proto$WatchFaceVersion() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackageName() {
        this.packageName_ = getDefaultInstance().getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static Proto$WatchFaceVersion getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Proto$WatchFaceVersion parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Proto$WatchFaceVersion) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WatchFaceVersion parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Proto$WatchFaceVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Proto$WatchFaceVersion> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = fze.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Proto$WatchFaceVersion();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"packageName_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proto$WatchFaceVersion> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Proto$WatchFaceVersion.class) {
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

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceVersionOrBuilder
    public String getPackageName() {
        return this.packageName_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceVersionOrBuilder
    public ByteString getPackageNameBytes() {
        return ByteString.copyFromUtf8(this.packageName_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceVersionOrBuilder
    public int getVersion() {
        return this.version_;
    }

    public static Builder newBuilder(Proto$WatchFaceVersion proto$WatchFaceVersion) {
        return DEFAULT_INSTANCE.createBuilder(proto$WatchFaceVersion);
    }

    public static Proto$WatchFaceVersion parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WatchFaceVersion) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WatchFaceVersion parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WatchFaceVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Proto$WatchFaceVersion parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Proto$WatchFaceVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Proto$WatchFaceVersion parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WatchFaceVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Proto$WatchFaceVersion parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Proto$WatchFaceVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Proto$WatchFaceVersion parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WatchFaceVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Proto$WatchFaceVersion parseFrom(InputStream inputStream) throws IOException {
        return (Proto$WatchFaceVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WatchFaceVersion parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WatchFaceVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WatchFaceVersion parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Proto$WatchFaceVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Proto$WatchFaceVersion parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WatchFaceVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
