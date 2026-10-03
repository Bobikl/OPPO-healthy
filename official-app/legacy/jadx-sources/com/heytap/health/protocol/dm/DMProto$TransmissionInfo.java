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
public final class DMProto$TransmissionInfo extends GeneratedMessageLite<DMProto$TransmissionInfo, Builder> implements DMProto$TransmissionInfoOrBuilder {
    private static final DMProto$TransmissionInfo DEFAULT_INSTANCE;
    private static volatile Parser<DMProto$TransmissionInfo> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$TransmissionInfo, Builder> implements DMProto$TransmissionInfoOrBuilder {
        public Builder clearStatus() {
            copyOnWrite();
            ((DMProto$TransmissionInfo) this.instance).clearStatus();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$TransmissionInfoOrBuilder
        public int getStatus() {
            return ((DMProto$TransmissionInfo) this.instance).getStatus();
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((DMProto$TransmissionInfo) this.instance).setStatus(i);
            return this;
        }

        private Builder() {
            super(DMProto$TransmissionInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$TransmissionInfo dMProto$TransmissionInfo = new DMProto$TransmissionInfo();
        DEFAULT_INSTANCE = dMProto$TransmissionInfo;
        GeneratedMessageLite.registerDefaultInstance(DMProto$TransmissionInfo.class, dMProto$TransmissionInfo);
    }

    private DMProto$TransmissionInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    public static DMProto$TransmissionInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$TransmissionInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$TransmissionInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$TransmissionInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$TransmissionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$TransmissionInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$TransmissionInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"status_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$TransmissionInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$TransmissionInfo.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$TransmissionInfoOrBuilder
    public int getStatus() {
        return this.status_;
    }

    public static Builder newBuilder(DMProto$TransmissionInfo dMProto$TransmissionInfo) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$TransmissionInfo);
    }

    public static DMProto$TransmissionInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$TransmissionInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$TransmissionInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$TransmissionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$TransmissionInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$TransmissionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$TransmissionInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$TransmissionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$TransmissionInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$TransmissionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$TransmissionInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$TransmissionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$TransmissionInfo parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$TransmissionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$TransmissionInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$TransmissionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$TransmissionInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$TransmissionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$TransmissionInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$TransmissionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
