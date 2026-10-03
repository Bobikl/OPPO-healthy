package com.heytap.health.bandface.data;

import com.google.protobuf.AbstractMessageLite;
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
public final class BandFace$city extends GeneratedMessageLite<BandFace$city, Builder> implements BandFace$cityOrBuilder {
    private static final BandFace$city DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<BandFace$city> PARSER = null;
    public static final int TIMEZONE_FIELD_NUMBER = 1;
    private String name_ = "";
    private int timezone_;

    public static final class Builder extends GeneratedMessageLite.Builder<BandFace$city, Builder> implements BandFace$cityOrBuilder {
        public Builder clearName() {
            copyOnWrite();
            ((BandFace$city) this.instance).clearName();
            return this;
        }

        public Builder clearTimezone() {
            copyOnWrite();
            ((BandFace$city) this.instance).clearTimezone();
            return this;
        }

        @Override // com.heytap.health.bandface.data.BandFace$cityOrBuilder
        public String getName() {
            return ((BandFace$city) this.instance).getName();
        }

        @Override // com.heytap.health.bandface.data.BandFace$cityOrBuilder
        public ByteString getNameBytes() {
            return ((BandFace$city) this.instance).getNameBytes();
        }

        @Override // com.heytap.health.bandface.data.BandFace$cityOrBuilder
        public int getTimezone() {
            return ((BandFace$city) this.instance).getTimezone();
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((BandFace$city) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((BandFace$city) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setTimezone(int i) {
            copyOnWrite();
            ((BandFace$city) this.instance).setTimezone(i);
            return this;
        }

        private Builder() {
            super(BandFace$city.DEFAULT_INSTANCE);
        }
    }

    static {
        BandFace$city bandFace$city = new BandFace$city();
        DEFAULT_INSTANCE = bandFace$city;
        GeneratedMessageLite.registerDefaultInstance(BandFace$city.class, bandFace$city);
    }

    private BandFace$city() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimezone() {
        this.timezone_ = 0;
    }

    public static BandFace$city getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BandFace$city parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BandFace$city) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BandFace$city parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BandFace$city) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BandFace$city> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimezone(int i) {
        this.timezone_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ru0.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new BandFace$city();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"timezone_", "name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BandFace$city> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (BandFace$city.class) {
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

    @Override // com.heytap.health.bandface.data.BandFace$cityOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.heytap.health.bandface.data.BandFace$cityOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.heytap.health.bandface.data.BandFace$cityOrBuilder
    public int getTimezone() {
        return this.timezone_;
    }

    public static Builder newBuilder(BandFace$city bandFace$city) {
        return DEFAULT_INSTANCE.createBuilder(bandFace$city);
    }

    public static BandFace$city parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BandFace$city) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BandFace$city parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BandFace$city) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BandFace$city parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BandFace$city) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BandFace$city parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BandFace$city) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BandFace$city parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BandFace$city) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BandFace$city parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BandFace$city) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BandFace$city parseFrom(InputStream inputStream) throws IOException {
        return (BandFace$city) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BandFace$city parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BandFace$city) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BandFace$city parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BandFace$city) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BandFace$city parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BandFace$city) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
