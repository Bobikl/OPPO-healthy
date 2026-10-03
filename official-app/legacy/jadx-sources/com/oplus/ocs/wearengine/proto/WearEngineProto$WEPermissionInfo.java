package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.zhl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class WearEngineProto$WEPermissionInfo extends GeneratedMessageLite<WearEngineProto$WEPermissionInfo, Builder> implements WearEngineProto$WEPermissionInfoOrBuilder {
    private static final WearEngineProto$WEPermissionInfo DEFAULT_INSTANCE;
    public static final int PACKAGENAME_FIELD_NUMBER = 1;
    private static volatile Parser<WearEngineProto$WEPermissionInfo> PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 2;
    private String packageName_ = "";
    private Internal.ProtobufList<WearEngineProto$WEPermission> permission_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<WearEngineProto$WEPermissionInfo, Builder> implements WearEngineProto$WEPermissionInfoOrBuilder {
        public Builder addAllPermission(Iterable<? extends WearEngineProto$WEPermission> iterable) {
            copyOnWrite();
            ((WearEngineProto$WEPermissionInfo) this.instance).addAllPermission(iterable);
            return this;
        }

        public Builder addPermission(WearEngineProto$WEPermission wearEngineProto$WEPermission) {
            copyOnWrite();
            ((WearEngineProto$WEPermissionInfo) this.instance).addPermission(wearEngineProto$WEPermission);
            return this;
        }

        public Builder clearPackageName() {
            copyOnWrite();
            ((WearEngineProto$WEPermissionInfo) this.instance).clearPackageName();
            return this;
        }

        public Builder clearPermission() {
            copyOnWrite();
            ((WearEngineProto$WEPermissionInfo) this.instance).clearPermission();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEPermissionInfoOrBuilder
        public String getPackageName() {
            return ((WearEngineProto$WEPermissionInfo) this.instance).getPackageName();
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEPermissionInfoOrBuilder
        public ByteString getPackageNameBytes() {
            return ((WearEngineProto$WEPermissionInfo) this.instance).getPackageNameBytes();
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEPermissionInfoOrBuilder
        public WearEngineProto$WEPermission getPermission(int i) {
            return ((WearEngineProto$WEPermissionInfo) this.instance).getPermission(i);
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEPermissionInfoOrBuilder
        public int getPermissionCount() {
            return ((WearEngineProto$WEPermissionInfo) this.instance).getPermissionCount();
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEPermissionInfoOrBuilder
        public List<WearEngineProto$WEPermission> getPermissionList() {
            return Collections.unmodifiableList(((WearEngineProto$WEPermissionInfo) this.instance).getPermissionList());
        }

        public Builder removePermission(int i) {
            copyOnWrite();
            ((WearEngineProto$WEPermissionInfo) this.instance).removePermission(i);
            return this;
        }

        public Builder setPackageName(String str) {
            copyOnWrite();
            ((WearEngineProto$WEPermissionInfo) this.instance).setPackageName(str);
            return this;
        }

        public Builder setPackageNameBytes(ByteString byteString) {
            copyOnWrite();
            ((WearEngineProto$WEPermissionInfo) this.instance).setPackageNameBytes(byteString);
            return this;
        }

        public Builder setPermission(int i, WearEngineProto$WEPermission wearEngineProto$WEPermission) {
            copyOnWrite();
            ((WearEngineProto$WEPermissionInfo) this.instance).setPermission(i, wearEngineProto$WEPermission);
            return this;
        }

        private Builder() {
            super(WearEngineProto$WEPermissionInfo.DEFAULT_INSTANCE);
        }

        public Builder addPermission(int i, WearEngineProto$WEPermission wearEngineProto$WEPermission) {
            copyOnWrite();
            ((WearEngineProto$WEPermissionInfo) this.instance).addPermission(i, wearEngineProto$WEPermission);
            return this;
        }

        public Builder setPermission(int i, WearEngineProto$WEPermission.Builder builder) {
            copyOnWrite();
            ((WearEngineProto$WEPermissionInfo) this.instance).setPermission(i, builder.build());
            return this;
        }

        public Builder addPermission(WearEngineProto$WEPermission.Builder builder) {
            copyOnWrite();
            ((WearEngineProto$WEPermissionInfo) this.instance).addPermission(builder.build());
            return this;
        }

        public Builder addPermission(int i, WearEngineProto$WEPermission.Builder builder) {
            copyOnWrite();
            ((WearEngineProto$WEPermissionInfo) this.instance).addPermission(i, builder.build());
            return this;
        }
    }

    static {
        WearEngineProto$WEPermissionInfo wearEngineProto$WEPermissionInfo = new WearEngineProto$WEPermissionInfo();
        DEFAULT_INSTANCE = wearEngineProto$WEPermissionInfo;
        GeneratedMessageLite.registerDefaultInstance(WearEngineProto$WEPermissionInfo.class, wearEngineProto$WEPermissionInfo);
    }

    private WearEngineProto$WEPermissionInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPermission(Iterable<? extends WearEngineProto$WEPermission> iterable) {
        ensurePermissionIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.permission_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPermission(WearEngineProto$WEPermission wearEngineProto$WEPermission) {
        wearEngineProto$WEPermission.getClass();
        ensurePermissionIsMutable();
        this.permission_.add(wearEngineProto$WEPermission);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackageName() {
        this.packageName_ = getDefaultInstance().getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermission() {
        this.permission_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePermissionIsMutable() {
        Internal.ProtobufList<WearEngineProto$WEPermission> protobufList = this.permission_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.permission_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static WearEngineProto$WEPermissionInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WearEngineProto$WEPermissionInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WearEngineProto$WEPermissionInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WearEngineProto$WEPermissionInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEPermissionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WearEngineProto$WEPermissionInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePermission(int i) {
        ensurePermissionIsMutable();
        this.permission_.remove(i);
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
    public void setPermission(int i, WearEngineProto$WEPermission wearEngineProto$WEPermission) {
        wearEngineProto$WEPermission.getClass();
        ensurePermissionIsMutable();
        this.permission_.set(i, wearEngineProto$WEPermission);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = zhl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WearEngineProto$WEPermissionInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"packageName_", "permission_", WearEngineProto$WEPermission.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WearEngineProto$WEPermissionInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WearEngineProto$WEPermissionInfo.class) {
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

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEPermissionInfoOrBuilder
    public String getPackageName() {
        return this.packageName_;
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEPermissionInfoOrBuilder
    public ByteString getPackageNameBytes() {
        return ByteString.copyFromUtf8(this.packageName_);
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEPermissionInfoOrBuilder
    public WearEngineProto$WEPermission getPermission(int i) {
        return this.permission_.get(i);
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEPermissionInfoOrBuilder
    public int getPermissionCount() {
        return this.permission_.size();
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEPermissionInfoOrBuilder
    public List<WearEngineProto$WEPermission> getPermissionList() {
        return this.permission_;
    }

    public WearEngineProto$WEPermissionOrBuilder getPermissionOrBuilder(int i) {
        return this.permission_.get(i);
    }

    public List<? extends WearEngineProto$WEPermissionOrBuilder> getPermissionOrBuilderList() {
        return this.permission_;
    }

    public static Builder newBuilder(WearEngineProto$WEPermissionInfo wearEngineProto$WEPermissionInfo) {
        return DEFAULT_INSTANCE.createBuilder(wearEngineProto$WEPermissionInfo);
    }

    public static WearEngineProto$WEPermissionInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WearEngineProto$WEPermissionInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WearEngineProto$WEPermissionInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEPermissionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WearEngineProto$WEPermissionInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEPermissionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPermission(int i, WearEngineProto$WEPermission wearEngineProto$WEPermission) {
        wearEngineProto$WEPermission.getClass();
        ensurePermissionIsMutable();
        this.permission_.add(i, wearEngineProto$WEPermission);
    }

    public static WearEngineProto$WEPermissionInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEPermissionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WearEngineProto$WEPermissionInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEPermissionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WearEngineProto$WEPermissionInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEPermissionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WearEngineProto$WEPermissionInfo parseFrom(InputStream inputStream) throws IOException {
        return (WearEngineProto$WEPermissionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WearEngineProto$WEPermissionInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WearEngineProto$WEPermissionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WearEngineProto$WEPermissionInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WearEngineProto$WEPermissionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WearEngineProto$WEPermissionInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WearEngineProto$WEPermissionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
