package com.heytap.wearable.music.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.aui;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class StorageCapacityProto$StorageCapacityInfo extends GeneratedMessageLite<StorageCapacityProto$StorageCapacityInfo, Builder> implements StorageCapacityProto$StorageCapacityInfoOrBuilder {
    private static final StorageCapacityProto$StorageCapacityInfo DEFAULT_INSTANCE;
    private static volatile Parser<StorageCapacityProto$StorageCapacityInfo> PARSER = null;
    public static final int STORAGE_CAPACITY_FIELD_NUMBER = 1;
    private int storageCapacity_;

    public static final class Builder extends GeneratedMessageLite.Builder<StorageCapacityProto$StorageCapacityInfo, Builder> implements StorageCapacityProto$StorageCapacityInfoOrBuilder {
        public Builder clearStorageCapacity() {
            copyOnWrite();
            ((StorageCapacityProto$StorageCapacityInfo) this.instance).clearStorageCapacity();
            return this;
        }

        @Override // com.heytap.wearable.music.proto.StorageCapacityProto$StorageCapacityInfoOrBuilder
        public int getStorageCapacity() {
            return ((StorageCapacityProto$StorageCapacityInfo) this.instance).getStorageCapacity();
        }

        public Builder setStorageCapacity(int i) {
            copyOnWrite();
            ((StorageCapacityProto$StorageCapacityInfo) this.instance).setStorageCapacity(i);
            return this;
        }

        private Builder() {
            super(StorageCapacityProto$StorageCapacityInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        StorageCapacityProto$StorageCapacityInfo storageCapacityProto$StorageCapacityInfo = new StorageCapacityProto$StorageCapacityInfo();
        DEFAULT_INSTANCE = storageCapacityProto$StorageCapacityInfo;
        GeneratedMessageLite.registerDefaultInstance(StorageCapacityProto$StorageCapacityInfo.class, storageCapacityProto$StorageCapacityInfo);
    }

    private StorageCapacityProto$StorageCapacityInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStorageCapacity() {
        this.storageCapacity_ = 0;
    }

    public static StorageCapacityProto$StorageCapacityInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static StorageCapacityProto$StorageCapacityInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StorageCapacityProto$StorageCapacityInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StorageCapacityProto$StorageCapacityInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (StorageCapacityProto$StorageCapacityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<StorageCapacityProto$StorageCapacityInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStorageCapacity(int i) {
        this.storageCapacity_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = aui.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new StorageCapacityProto$StorageCapacityInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"storageCapacity_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<StorageCapacityProto$StorageCapacityInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (StorageCapacityProto$StorageCapacityInfo.class) {
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

    @Override // com.heytap.wearable.music.proto.StorageCapacityProto$StorageCapacityInfoOrBuilder
    public int getStorageCapacity() {
        return this.storageCapacity_;
    }

    public static Builder newBuilder(StorageCapacityProto$StorageCapacityInfo storageCapacityProto$StorageCapacityInfo) {
        return DEFAULT_INSTANCE.createBuilder(storageCapacityProto$StorageCapacityInfo);
    }

    public static StorageCapacityProto$StorageCapacityInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StorageCapacityProto$StorageCapacityInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StorageCapacityProto$StorageCapacityInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StorageCapacityProto$StorageCapacityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static StorageCapacityProto$StorageCapacityInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (StorageCapacityProto$StorageCapacityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static StorageCapacityProto$StorageCapacityInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StorageCapacityProto$StorageCapacityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static StorageCapacityProto$StorageCapacityInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (StorageCapacityProto$StorageCapacityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StorageCapacityProto$StorageCapacityInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StorageCapacityProto$StorageCapacityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static StorageCapacityProto$StorageCapacityInfo parseFrom(InputStream inputStream) throws IOException {
        return (StorageCapacityProto$StorageCapacityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StorageCapacityProto$StorageCapacityInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StorageCapacityProto$StorageCapacityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StorageCapacityProto$StorageCapacityInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (StorageCapacityProto$StorageCapacityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static StorageCapacityProto$StorageCapacityInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StorageCapacityProto$StorageCapacityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
