package com.heytap.sportwatch.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.r98;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class GpsData$GpsReq extends GeneratedMessageLite<GpsData$GpsReq, Builder> implements GpsData$GpsReqOrBuilder {
    private static final GpsData$GpsReq DEFAULT_INSTANCE;
    private static volatile Parser<GpsData$GpsReq> PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 2;
    public static final int REQTYPE_FIELD_NUMBER = 1;
    private int provider_;
    private int reqType_;

    public static final class Builder extends GeneratedMessageLite.Builder<GpsData$GpsReq, Builder> implements GpsData$GpsReqOrBuilder {
        public Builder clearProvider() {
            copyOnWrite();
            ((GpsData$GpsReq) this.instance).clearProvider();
            return this;
        }

        public Builder clearReqType() {
            copyOnWrite();
            ((GpsData$GpsReq) this.instance).clearReqType();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.GpsData$GpsReqOrBuilder
        public int getProvider() {
            return ((GpsData$GpsReq) this.instance).getProvider();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$GpsReqOrBuilder
        public int getReqType() {
            return ((GpsData$GpsReq) this.instance).getReqType();
        }

        public Builder setProvider(int i) {
            copyOnWrite();
            ((GpsData$GpsReq) this.instance).setProvider(i);
            return this;
        }

        public Builder setReqType(int i) {
            copyOnWrite();
            ((GpsData$GpsReq) this.instance).setReqType(i);
            return this;
        }

        private Builder() {
            super(GpsData$GpsReq.DEFAULT_INSTANCE);
        }
    }

    static {
        GpsData$GpsReq gpsData$GpsReq = new GpsData$GpsReq();
        DEFAULT_INSTANCE = gpsData$GpsReq;
        GeneratedMessageLite.registerDefaultInstance(GpsData$GpsReq.class, gpsData$GpsReq);
    }

    private GpsData$GpsReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.provider_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReqType() {
        this.reqType_ = 0;
    }

    public static GpsData$GpsReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GpsData$GpsReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GpsData$GpsReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GpsData$GpsReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GpsData$GpsReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GpsData$GpsReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvider(int i) {
        this.provider_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReqType(int i) {
        this.reqType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = r98.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new GpsData$GpsReq();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"reqType_", "provider_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GpsData$GpsReq> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (GpsData$GpsReq.class) {
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

    @Override // com.heytap.sportwatch.proto.GpsData$GpsReqOrBuilder
    public int getProvider() {
        return this.provider_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$GpsReqOrBuilder
    public int getReqType() {
        return this.reqType_;
    }

    public static Builder newBuilder(GpsData$GpsReq gpsData$GpsReq) {
        return DEFAULT_INSTANCE.createBuilder(gpsData$GpsReq);
    }

    public static GpsData$GpsReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$GpsReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GpsData$GpsReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$GpsReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GpsData$GpsReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GpsData$GpsReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GpsData$GpsReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$GpsReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GpsData$GpsReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GpsData$GpsReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GpsData$GpsReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$GpsReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GpsData$GpsReq parseFrom(InputStream inputStream) throws IOException {
        return (GpsData$GpsReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GpsData$GpsReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$GpsReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GpsData$GpsReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GpsData$GpsReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GpsData$GpsReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$GpsReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
