package com.heytap.health.protocol.dm;

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
public final class DMProto$AppItemData extends GeneratedMessageLite<DMProto$AppItemData, Builder> implements DMProto$AppItemDataOrBuilder {
    public static final int APPSTATUS_FIELD_NUMBER = 1;
    private static final DMProto$AppItemData DEFAULT_INSTANCE;
    private static volatile Parser<DMProto$AppItemData> PARSER;
    private int appStatus_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$AppItemData, Builder> implements DMProto$AppItemDataOrBuilder {
        public Builder clearAppStatus() {
            copyOnWrite();
            ((DMProto$AppItemData) this.instance).clearAppStatus();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$AppItemDataOrBuilder
        public int getAppStatus() {
            return ((DMProto$AppItemData) this.instance).getAppStatus();
        }

        public Builder setAppStatus(int i) {
            copyOnWrite();
            ((DMProto$AppItemData) this.instance).setAppStatus(i);
            return this;
        }

        private Builder() {
            super(DMProto$AppItemData.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$AppItemData dMProto$AppItemData = new DMProto$AppItemData();
        DEFAULT_INSTANCE = dMProto$AppItemData;
        GeneratedMessageLite.registerDefaultInstance(DMProto$AppItemData.class, dMProto$AppItemData);
    }

    private DMProto$AppItemData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppStatus() {
        this.appStatus_ = 0;
    }

    public static DMProto$AppItemData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$AppItemData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$AppItemData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$AppItemData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$AppItemData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$AppItemData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppStatus(int i) {
        this.appStatus_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$AppItemData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"appStatus_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$AppItemData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$AppItemData.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$AppItemDataOrBuilder
    public int getAppStatus() {
        return this.appStatus_;
    }

    public static Builder newBuilder(DMProto$AppItemData dMProto$AppItemData) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$AppItemData);
    }

    public static DMProto$AppItemData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$AppItemData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$AppItemData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$AppItemData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$AppItemData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$AppItemData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$AppItemData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$AppItemData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$AppItemData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$AppItemData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$AppItemData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$AppItemData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$AppItemData parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$AppItemData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$AppItemData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$AppItemData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$AppItemData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$AppItemData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$AppItemData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$AppItemData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
