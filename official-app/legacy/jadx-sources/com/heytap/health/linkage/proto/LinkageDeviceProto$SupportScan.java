package com.heytap.health.linkage.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.kya;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkageDeviceProto$SupportScan extends GeneratedMessageLite<LinkageDeviceProto$SupportScan, Builder> implements LinkageDeviceProto$SupportScanOrBuilder {
    private static final LinkageDeviceProto$SupportScan DEFAULT_INSTANCE;
    public static final int ISSUPPORT_FIELD_NUMBER = 1;
    private static volatile Parser<LinkageDeviceProto$SupportScan> PARSER;
    private boolean isSupport_;

    public static final class Builder extends GeneratedMessageLite.Builder<LinkageDeviceProto$SupportScan, Builder> implements LinkageDeviceProto$SupportScanOrBuilder {
        public Builder clearIsSupport() {
            copyOnWrite();
            ((LinkageDeviceProto$SupportScan) this.instance).clearIsSupport();
            return this;
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$SupportScanOrBuilder
        public boolean getIsSupport() {
            return ((LinkageDeviceProto$SupportScan) this.instance).getIsSupport();
        }

        public Builder setIsSupport(boolean z) {
            copyOnWrite();
            ((LinkageDeviceProto$SupportScan) this.instance).setIsSupport(z);
            return this;
        }

        private Builder() {
            super(LinkageDeviceProto$SupportScan.DEFAULT_INSTANCE);
        }
    }

    static {
        LinkageDeviceProto$SupportScan linkageDeviceProto$SupportScan = new LinkageDeviceProto$SupportScan();
        DEFAULT_INSTANCE = linkageDeviceProto$SupportScan;
        GeneratedMessageLite.registerDefaultInstance(LinkageDeviceProto$SupportScan.class, linkageDeviceProto$SupportScan);
    }

    private LinkageDeviceProto$SupportScan() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSupport() {
        this.isSupport_ = false;
    }

    public static LinkageDeviceProto$SupportScan getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LinkageDeviceProto$SupportScan parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LinkageDeviceProto$SupportScan) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkageDeviceProto$SupportScan parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$SupportScan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LinkageDeviceProto$SupportScan> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSupport(boolean z) {
        this.isSupport_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = kya.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new LinkageDeviceProto$SupportScan();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isSupport_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LinkageDeviceProto$SupportScan> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (LinkageDeviceProto$SupportScan.class) {
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

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$SupportScanOrBuilder
    public boolean getIsSupport() {
        return this.isSupport_;
    }

    public static Builder newBuilder(LinkageDeviceProto$SupportScan linkageDeviceProto$SupportScan) {
        return DEFAULT_INSTANCE.createBuilder(linkageDeviceProto$SupportScan);
    }

    public static LinkageDeviceProto$SupportScan parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LinkageDeviceProto$SupportScan) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkageDeviceProto$SupportScan parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$SupportScan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LinkageDeviceProto$SupportScan parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$SupportScan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LinkageDeviceProto$SupportScan parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$SupportScan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LinkageDeviceProto$SupportScan parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$SupportScan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LinkageDeviceProto$SupportScan parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$SupportScan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LinkageDeviceProto$SupportScan parseFrom(InputStream inputStream) throws IOException {
        return (LinkageDeviceProto$SupportScan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkageDeviceProto$SupportScan parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LinkageDeviceProto$SupportScan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkageDeviceProto$SupportScan parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LinkageDeviceProto$SupportScan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LinkageDeviceProto$SupportScan parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LinkageDeviceProto$SupportScan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
