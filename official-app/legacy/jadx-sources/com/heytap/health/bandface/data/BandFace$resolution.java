package com.heytap.health.bandface.data;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.ru0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes15.dex */
public final class BandFace$resolution extends GeneratedMessageLite<BandFace$resolution, Builder> implements BandFace$resolutionOrBuilder {
    private static final BandFace$resolution DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    private static volatile Parser<BandFace$resolution> PARSER = null;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private int height_;
    private int width_;

    public static final class Builder extends GeneratedMessageLite.Builder<BandFace$resolution, Builder> implements BandFace$resolutionOrBuilder {
        public Builder clearHeight() {
            copyOnWrite();
            ((BandFace$resolution) this.instance).clearHeight();
            return this;
        }

        public Builder clearWidth() {
            copyOnWrite();
            ((BandFace$resolution) this.instance).clearWidth();
            return this;
        }

        @Override // com.heytap.health.bandface.data.BandFace$resolutionOrBuilder
        public int getHeight() {
            return ((BandFace$resolution) this.instance).getHeight();
        }

        @Override // com.heytap.health.bandface.data.BandFace$resolutionOrBuilder
        public int getWidth() {
            return ((BandFace$resolution) this.instance).getWidth();
        }

        public Builder setHeight(int i) {
            copyOnWrite();
            ((BandFace$resolution) this.instance).setHeight(i);
            return this;
        }

        public Builder setWidth(int i) {
            copyOnWrite();
            ((BandFace$resolution) this.instance).setWidth(i);
            return this;
        }

        private Builder() {
            super(BandFace$resolution.DEFAULT_INSTANCE);
        }
    }

    static {
        BandFace$resolution bandFace$resolution = new BandFace$resolution();
        DEFAULT_INSTANCE = bandFace$resolution;
        GeneratedMessageLite.registerDefaultInstance(BandFace$resolution.class, bandFace$resolution);
    }

    private BandFace$resolution() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0;
    }

    public static BandFace$resolution getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BandFace$resolution parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BandFace$resolution) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BandFace$resolution parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BandFace$resolution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BandFace$resolution> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i) {
        this.height_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(int i) {
        this.width_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ru0.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new BandFace$resolution();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"width_", "height_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BandFace$resolution> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (BandFace$resolution.class) {
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

    @Override // com.heytap.health.bandface.data.BandFace$resolutionOrBuilder
    public int getHeight() {
        return this.height_;
    }

    @Override // com.heytap.health.bandface.data.BandFace$resolutionOrBuilder
    public int getWidth() {
        return this.width_;
    }

    public static Builder newBuilder(BandFace$resolution bandFace$resolution) {
        return DEFAULT_INSTANCE.createBuilder(bandFace$resolution);
    }

    public static BandFace$resolution parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BandFace$resolution) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BandFace$resolution parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BandFace$resolution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BandFace$resolution parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BandFace$resolution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BandFace$resolution parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BandFace$resolution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BandFace$resolution parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BandFace$resolution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BandFace$resolution parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BandFace$resolution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BandFace$resolution parseFrom(InputStream inputStream) throws IOException {
        return (BandFace$resolution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BandFace$resolution parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BandFace$resolution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BandFace$resolution parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BandFace$resolution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BandFace$resolution parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BandFace$resolution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
