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
public final class BandFace$watchface extends GeneratedMessageLite<BandFace$watchface, Builder> implements BandFace$watchfaceOrBuilder {
    public static final int CITY_FIELD_NUMBER = 6;
    private static final BandFace$watchface DEFAULT_INSTANCE;
    public static final int FILENAME_FIELD_NUMBER = 3;
    private static volatile Parser<BandFace$watchface> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 4;
    public static final int VISUAL_FIELD_NUMBER = 5;
    public static final int WATCHDIALID_FIELD_NUMBER = 1;
    private int bitField0_;
    private BandFace$city city_;
    private int type_;
    private int version_;
    private BandFace$visual visual_;
    private String watchDialId_ = "";
    private String fileName_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<BandFace$watchface, Builder> implements BandFace$watchfaceOrBuilder {
        public Builder clearCity() {
            copyOnWrite();
            ((BandFace$watchface) this.instance).clearCity();
            return this;
        }

        public Builder clearFileName() {
            copyOnWrite();
            ((BandFace$watchface) this.instance).clearFileName();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((BandFace$watchface) this.instance).clearType();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((BandFace$watchface) this.instance).clearVersion();
            return this;
        }

        public Builder clearVisual() {
            copyOnWrite();
            ((BandFace$watchface) this.instance).clearVisual();
            return this;
        }

        public Builder clearWatchDialId() {
            copyOnWrite();
            ((BandFace$watchface) this.instance).clearWatchDialId();
            return this;
        }

        @Override // com.heytap.health.bandface.data.BandFace$watchfaceOrBuilder
        public BandFace$city getCity() {
            return ((BandFace$watchface) this.instance).getCity();
        }

        @Override // com.heytap.health.bandface.data.BandFace$watchfaceOrBuilder
        public String getFileName() {
            return ((BandFace$watchface) this.instance).getFileName();
        }

        @Override // com.heytap.health.bandface.data.BandFace$watchfaceOrBuilder
        public ByteString getFileNameBytes() {
            return ((BandFace$watchface) this.instance).getFileNameBytes();
        }

        @Override // com.heytap.health.bandface.data.BandFace$watchfaceOrBuilder
        public int getType() {
            return ((BandFace$watchface) this.instance).getType();
        }

        @Override // com.heytap.health.bandface.data.BandFace$watchfaceOrBuilder
        public int getVersion() {
            return ((BandFace$watchface) this.instance).getVersion();
        }

        @Override // com.heytap.health.bandface.data.BandFace$watchfaceOrBuilder
        public BandFace$visual getVisual() {
            return ((BandFace$watchface) this.instance).getVisual();
        }

        @Override // com.heytap.health.bandface.data.BandFace$watchfaceOrBuilder
        public String getWatchDialId() {
            return ((BandFace$watchface) this.instance).getWatchDialId();
        }

        @Override // com.heytap.health.bandface.data.BandFace$watchfaceOrBuilder
        public ByteString getWatchDialIdBytes() {
            return ((BandFace$watchface) this.instance).getWatchDialIdBytes();
        }

        @Override // com.heytap.health.bandface.data.BandFace$watchfaceOrBuilder
        public boolean hasCity() {
            return ((BandFace$watchface) this.instance).hasCity();
        }

        @Override // com.heytap.health.bandface.data.BandFace$watchfaceOrBuilder
        public boolean hasVisual() {
            return ((BandFace$watchface) this.instance).hasVisual();
        }

        public Builder mergeCity(BandFace$city bandFace$city) {
            copyOnWrite();
            ((BandFace$watchface) this.instance).mergeCity(bandFace$city);
            return this;
        }

        public Builder mergeVisual(BandFace$visual bandFace$visual) {
            copyOnWrite();
            ((BandFace$watchface) this.instance).mergeVisual(bandFace$visual);
            return this;
        }

        public Builder setCity(BandFace$city bandFace$city) {
            copyOnWrite();
            ((BandFace$watchface) this.instance).setCity(bandFace$city);
            return this;
        }

        public Builder setFileName(String str) {
            copyOnWrite();
            ((BandFace$watchface) this.instance).setFileName(str);
            return this;
        }

        public Builder setFileNameBytes(ByteString byteString) {
            copyOnWrite();
            ((BandFace$watchface) this.instance).setFileNameBytes(byteString);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((BandFace$watchface) this.instance).setType(i);
            return this;
        }

        public Builder setVersion(int i) {
            copyOnWrite();
            ((BandFace$watchface) this.instance).setVersion(i);
            return this;
        }

        public Builder setVisual(BandFace$visual bandFace$visual) {
            copyOnWrite();
            ((BandFace$watchface) this.instance).setVisual(bandFace$visual);
            return this;
        }

        public Builder setWatchDialId(String str) {
            copyOnWrite();
            ((BandFace$watchface) this.instance).setWatchDialId(str);
            return this;
        }

        public Builder setWatchDialIdBytes(ByteString byteString) {
            copyOnWrite();
            ((BandFace$watchface) this.instance).setWatchDialIdBytes(byteString);
            return this;
        }

        private Builder() {
            super(BandFace$watchface.DEFAULT_INSTANCE);
        }

        public Builder setCity(BandFace$city.Builder builder) {
            copyOnWrite();
            ((BandFace$watchface) this.instance).setCity(builder.build());
            return this;
        }

        public Builder setVisual(BandFace$visual.Builder builder) {
            copyOnWrite();
            ((BandFace$watchface) this.instance).setVisual(builder.build());
            return this;
        }
    }

    static {
        BandFace$watchface bandFace$watchface = new BandFace$watchface();
        DEFAULT_INSTANCE = bandFace$watchface;
        GeneratedMessageLite.registerDefaultInstance(BandFace$watchface.class, bandFace$watchface);
    }

    private BandFace$watchface() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCity() {
        this.city_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileName() {
        this.fileName_ = getDefaultInstance().getFileName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVisual() {
        this.visual_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatchDialId() {
        this.watchDialId_ = getDefaultInstance().getWatchDialId();
    }

    public static BandFace$watchface getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCity(BandFace$city bandFace$city) {
        bandFace$city.getClass();
        BandFace$city bandFace$city2 = this.city_;
        if (bandFace$city2 == null || bandFace$city2 == BandFace$city.getDefaultInstance()) {
            this.city_ = bandFace$city;
        } else {
            this.city_ = BandFace$city.newBuilder(this.city_).mergeFrom(bandFace$city).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVisual(BandFace$visual bandFace$visual) {
        bandFace$visual.getClass();
        BandFace$visual bandFace$visual2 = this.visual_;
        if (bandFace$visual2 == null || bandFace$visual2 == BandFace$visual.getDefaultInstance()) {
            this.visual_ = bandFace$visual;
        } else {
            this.visual_ = BandFace$visual.newBuilder(this.visual_).mergeFrom(bandFace$visual).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BandFace$watchface parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BandFace$watchface) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BandFace$watchface parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BandFace$watchface) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BandFace$watchface> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCity(BandFace$city bandFace$city) {
        bandFace$city.getClass();
        this.city_ = bandFace$city;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileName(String str) {
        str.getClass();
        this.fileName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fileName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisual(BandFace$visual bandFace$visual) {
        bandFace$visual.getClass();
        this.visual_ = bandFace$visual;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchDialId(String str) {
        str.getClass();
        this.watchDialId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchDialIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.watchDialId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ru0.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new BandFace$watchface();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003Ȉ\u0004\u000b\u0005ဉ\u0000\u0006ဉ\u0001", new Object[]{"bitField0_", "watchDialId_", "type_", "fileName_", "version_", "visual_", "city_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BandFace$watchface> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (BandFace$watchface.class) {
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

    @Override // com.heytap.health.bandface.data.BandFace$watchfaceOrBuilder
    public BandFace$city getCity() {
        BandFace$city bandFace$city = this.city_;
        return bandFace$city == null ? BandFace$city.getDefaultInstance() : bandFace$city;
    }

    @Override // com.heytap.health.bandface.data.BandFace$watchfaceOrBuilder
    public String getFileName() {
        return this.fileName_;
    }

    @Override // com.heytap.health.bandface.data.BandFace$watchfaceOrBuilder
    public ByteString getFileNameBytes() {
        return ByteString.copyFromUtf8(this.fileName_);
    }

    @Override // com.heytap.health.bandface.data.BandFace$watchfaceOrBuilder
    public int getType() {
        return this.type_;
    }

    @Override // com.heytap.health.bandface.data.BandFace$watchfaceOrBuilder
    public int getVersion() {
        return this.version_;
    }

    @Override // com.heytap.health.bandface.data.BandFace$watchfaceOrBuilder
    public BandFace$visual getVisual() {
        BandFace$visual bandFace$visual = this.visual_;
        return bandFace$visual == null ? BandFace$visual.getDefaultInstance() : bandFace$visual;
    }

    @Override // com.heytap.health.bandface.data.BandFace$watchfaceOrBuilder
    public String getWatchDialId() {
        return this.watchDialId_;
    }

    @Override // com.heytap.health.bandface.data.BandFace$watchfaceOrBuilder
    public ByteString getWatchDialIdBytes() {
        return ByteString.copyFromUtf8(this.watchDialId_);
    }

    @Override // com.heytap.health.bandface.data.BandFace$watchfaceOrBuilder
    public boolean hasCity() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.heytap.health.bandface.data.BandFace$watchfaceOrBuilder
    public boolean hasVisual() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(BandFace$watchface bandFace$watchface) {
        return DEFAULT_INSTANCE.createBuilder(bandFace$watchface);
    }

    public static BandFace$watchface parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BandFace$watchface) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BandFace$watchface parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BandFace$watchface) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BandFace$watchface parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BandFace$watchface) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BandFace$watchface parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BandFace$watchface) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BandFace$watchface parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BandFace$watchface) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BandFace$watchface parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BandFace$watchface) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BandFace$watchface parseFrom(InputStream inputStream) throws IOException {
        return (BandFace$watchface) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BandFace$watchface parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BandFace$watchface) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BandFace$watchface parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BandFace$watchface) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BandFace$watchface parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BandFace$watchface) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
