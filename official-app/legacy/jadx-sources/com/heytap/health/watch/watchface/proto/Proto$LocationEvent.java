package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.fze;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes19.dex */
public final class Proto$LocationEvent extends GeneratedMessageLite<Proto$LocationEvent, Builder> implements Proto$LocationEventOrBuilder {
    public static final int ADDRESS_FIELD_NUMBER = 6;
    public static final int CANLOCATION_FIELD_NUMBER = 7;
    public static final int CITY_FIELD_NUMBER = 4;
    private static final Proto$LocationEvent DEFAULT_INSTANCE;
    public static final int DISTRICT_FIELD_NUMBER = 5;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile Parser<Proto$LocationEvent> PARSER = null;
    public static final int PROVINCE_FIELD_NUMBER = 3;
    private boolean canLocation_;
    private double latitude_;
    private double longitude_;
    private String province_ = "";
    private String city_ = "";
    private String district_ = "";
    private String address_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<Proto$LocationEvent, Builder> implements Proto$LocationEventOrBuilder {
        public Builder clearAddress() {
            copyOnWrite();
            ((Proto$LocationEvent) this.instance).clearAddress();
            return this;
        }

        public Builder clearCanLocation() {
            copyOnWrite();
            ((Proto$LocationEvent) this.instance).clearCanLocation();
            return this;
        }

        public Builder clearCity() {
            copyOnWrite();
            ((Proto$LocationEvent) this.instance).clearCity();
            return this;
        }

        public Builder clearDistrict() {
            copyOnWrite();
            ((Proto$LocationEvent) this.instance).clearDistrict();
            return this;
        }

        public Builder clearLatitude() {
            copyOnWrite();
            ((Proto$LocationEvent) this.instance).clearLatitude();
            return this;
        }

        public Builder clearLongitude() {
            copyOnWrite();
            ((Proto$LocationEvent) this.instance).clearLongitude();
            return this;
        }

        public Builder clearProvince() {
            copyOnWrite();
            ((Proto$LocationEvent) this.instance).clearProvince();
            return this;
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
        public String getAddress() {
            return ((Proto$LocationEvent) this.instance).getAddress();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
        public ByteString getAddressBytes() {
            return ((Proto$LocationEvent) this.instance).getAddressBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
        public boolean getCanLocation() {
            return ((Proto$LocationEvent) this.instance).getCanLocation();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
        public String getCity() {
            return ((Proto$LocationEvent) this.instance).getCity();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
        public ByteString getCityBytes() {
            return ((Proto$LocationEvent) this.instance).getCityBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
        public String getDistrict() {
            return ((Proto$LocationEvent) this.instance).getDistrict();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
        public ByteString getDistrictBytes() {
            return ((Proto$LocationEvent) this.instance).getDistrictBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
        public double getLatitude() {
            return ((Proto$LocationEvent) this.instance).getLatitude();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
        public double getLongitude() {
            return ((Proto$LocationEvent) this.instance).getLongitude();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
        public String getProvince() {
            return ((Proto$LocationEvent) this.instance).getProvince();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
        public ByteString getProvinceBytes() {
            return ((Proto$LocationEvent) this.instance).getProvinceBytes();
        }

        public Builder setAddress(String str) {
            copyOnWrite();
            ((Proto$LocationEvent) this.instance).setAddress(str);
            return this;
        }

        public Builder setAddressBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$LocationEvent) this.instance).setAddressBytes(byteString);
            return this;
        }

        public Builder setCanLocation(boolean z) {
            copyOnWrite();
            ((Proto$LocationEvent) this.instance).setCanLocation(z);
            return this;
        }

        public Builder setCity(String str) {
            copyOnWrite();
            ((Proto$LocationEvent) this.instance).setCity(str);
            return this;
        }

        public Builder setCityBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$LocationEvent) this.instance).setCityBytes(byteString);
            return this;
        }

        public Builder setDistrict(String str) {
            copyOnWrite();
            ((Proto$LocationEvent) this.instance).setDistrict(str);
            return this;
        }

        public Builder setDistrictBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$LocationEvent) this.instance).setDistrictBytes(byteString);
            return this;
        }

        public Builder setLatitude(double d) {
            copyOnWrite();
            ((Proto$LocationEvent) this.instance).setLatitude(d);
            return this;
        }

        public Builder setLongitude(double d) {
            copyOnWrite();
            ((Proto$LocationEvent) this.instance).setLongitude(d);
            return this;
        }

        public Builder setProvince(String str) {
            copyOnWrite();
            ((Proto$LocationEvent) this.instance).setProvince(str);
            return this;
        }

        public Builder setProvinceBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$LocationEvent) this.instance).setProvinceBytes(byteString);
            return this;
        }

        private Builder() {
            super(Proto$LocationEvent.DEFAULT_INSTANCE);
        }
    }

    static {
        Proto$LocationEvent proto$LocationEvent = new Proto$LocationEvent();
        DEFAULT_INSTANCE = proto$LocationEvent;
        GeneratedMessageLite.registerDefaultInstance(Proto$LocationEvent.class, proto$LocationEvent);
    }

    private Proto$LocationEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddress() {
        this.address_ = getDefaultInstance().getAddress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanLocation() {
        this.canLocation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCity() {
        this.city_ = getDefaultInstance().getCity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistrict() {
        this.district_ = getDefaultInstance().getDistrict();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitude() {
        this.latitude_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongitude() {
        this.longitude_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvince() {
        this.province_ = getDefaultInstance().getProvince();
    }

    public static Proto$LocationEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Proto$LocationEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Proto$LocationEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$LocationEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Proto$LocationEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Proto$LocationEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddress(String str) {
        str.getClass();
        this.address_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.address_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanLocation(boolean z) {
        this.canLocation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCity(String str) {
        str.getClass();
        this.city_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.city_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistrict(String str) {
        str.getClass();
        this.district_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistrictBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.district_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitude(double d) {
        this.latitude_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongitude(double d) {
        this.longitude_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvince(String str) {
        str.getClass();
        this.province_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvinceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.province_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = fze.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Proto$LocationEvent();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0007", new Object[]{"latitude_", "longitude_", "province_", "city_", "district_", "address_", "canLocation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proto$LocationEvent> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Proto$LocationEvent.class) {
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

    @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
    public String getAddress() {
        return this.address_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
    public ByteString getAddressBytes() {
        return ByteString.copyFromUtf8(this.address_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
    public boolean getCanLocation() {
        return this.canLocation_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
    public String getCity() {
        return this.city_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
    public ByteString getCityBytes() {
        return ByteString.copyFromUtf8(this.city_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
    public String getDistrict() {
        return this.district_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
    public ByteString getDistrictBytes() {
        return ByteString.copyFromUtf8(this.district_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
    public double getLatitude() {
        return this.latitude_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
    public double getLongitude() {
        return this.longitude_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
    public String getProvince() {
        return this.province_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$LocationEventOrBuilder
    public ByteString getProvinceBytes() {
        return ByteString.copyFromUtf8(this.province_);
    }

    public static Builder newBuilder(Proto$LocationEvent proto$LocationEvent) {
        return DEFAULT_INSTANCE.createBuilder(proto$LocationEvent);
    }

    public static Proto$LocationEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$LocationEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$LocationEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$LocationEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Proto$LocationEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Proto$LocationEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Proto$LocationEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$LocationEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Proto$LocationEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Proto$LocationEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Proto$LocationEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$LocationEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Proto$LocationEvent parseFrom(InputStream inputStream) throws IOException {
        return (Proto$LocationEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$LocationEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$LocationEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$LocationEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Proto$LocationEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Proto$LocationEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$LocationEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
