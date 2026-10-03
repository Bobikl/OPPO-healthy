package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.zhl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class WearEngineProto$WEPermission extends GeneratedMessageLite<WearEngineProto$WEPermission, Builder> implements WearEngineProto$WEPermissionOrBuilder {
    private static final WearEngineProto$WEPermission DEFAULT_INSTANCE;
    public static final int ISGRANTED_FIELD_NUMBER = 3;
    private static volatile Parser<WearEngineProto$WEPermission> PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 1;
    public static final int UPDATETIME_FIELD_NUMBER = 2;
    private boolean isGranted_;
    private int permission_;
    private long updateTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<WearEngineProto$WEPermission, Builder> implements WearEngineProto$WEPermissionOrBuilder {
        public Builder clearIsGranted() {
            copyOnWrite();
            ((WearEngineProto$WEPermission) this.instance).clearIsGranted();
            return this;
        }

        public Builder clearPermission() {
            copyOnWrite();
            ((WearEngineProto$WEPermission) this.instance).clearPermission();
            return this;
        }

        public Builder clearUpdateTime() {
            copyOnWrite();
            ((WearEngineProto$WEPermission) this.instance).clearUpdateTime();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEPermissionOrBuilder
        public boolean getIsGranted() {
            return ((WearEngineProto$WEPermission) this.instance).getIsGranted();
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEPermissionOrBuilder
        public int getPermission() {
            return ((WearEngineProto$WEPermission) this.instance).getPermission();
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEPermissionOrBuilder
        public long getUpdateTime() {
            return ((WearEngineProto$WEPermission) this.instance).getUpdateTime();
        }

        public Builder setIsGranted(boolean z) {
            copyOnWrite();
            ((WearEngineProto$WEPermission) this.instance).setIsGranted(z);
            return this;
        }

        public Builder setPermission(int i) {
            copyOnWrite();
            ((WearEngineProto$WEPermission) this.instance).setPermission(i);
            return this;
        }

        public Builder setUpdateTime(long j2) {
            copyOnWrite();
            ((WearEngineProto$WEPermission) this.instance).setUpdateTime(j2);
            return this;
        }

        private Builder() {
            super(WearEngineProto$WEPermission.DEFAULT_INSTANCE);
        }
    }

    static {
        WearEngineProto$WEPermission wearEngineProto$WEPermission = new WearEngineProto$WEPermission();
        DEFAULT_INSTANCE = wearEngineProto$WEPermission;
        GeneratedMessageLite.registerDefaultInstance(WearEngineProto$WEPermission.class, wearEngineProto$WEPermission);
    }

    private WearEngineProto$WEPermission() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsGranted() {
        this.isGranted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermission() {
        this.permission_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateTime() {
        this.updateTime_ = 0L;
    }

    public static WearEngineProto$WEPermission getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WearEngineProto$WEPermission parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WearEngineProto$WEPermission) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WearEngineProto$WEPermission parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WearEngineProto$WEPermission> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsGranted(boolean z) {
        this.isGranted_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermission(int i) {
        this.permission_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateTime(long j2) {
        this.updateTime_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = zhl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WearEngineProto$WEPermission();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u0002\u0003\u0007", new Object[]{"permission_", "updateTime_", "isGranted_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WearEngineProto$WEPermission> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WearEngineProto$WEPermission.class) {
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

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEPermissionOrBuilder
    public boolean getIsGranted() {
        return this.isGranted_;
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEPermissionOrBuilder
    public int getPermission() {
        return this.permission_;
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEPermissionOrBuilder
    public long getUpdateTime() {
        return this.updateTime_;
    }

    public static Builder newBuilder(WearEngineProto$WEPermission wearEngineProto$WEPermission) {
        return DEFAULT_INSTANCE.createBuilder(wearEngineProto$WEPermission);
    }

    public static WearEngineProto$WEPermission parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WearEngineProto$WEPermission) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WearEngineProto$WEPermission parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WearEngineProto$WEPermission parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WearEngineProto$WEPermission parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WearEngineProto$WEPermission parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WearEngineProto$WEPermission parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WearEngineProto$WEPermission parseFrom(InputStream inputStream) throws IOException {
        return (WearEngineProto$WEPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WearEngineProto$WEPermission parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WearEngineProto$WEPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WearEngineProto$WEPermission parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WearEngineProto$WEPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WearEngineProto$WEPermission parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WearEngineProto$WEPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
