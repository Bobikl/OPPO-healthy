package com.heytap.health.protocol.iwatch;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.f0a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class IWatch$IWatchDeviceInfoResponse extends GeneratedMessageLite<IWatch$IWatchDeviceInfoResponse, Builder> implements IWatch$IWatchDeviceInfoResponseOrBuilder {
    private static final IWatch$IWatchDeviceInfoResponse DEFAULT_INSTANCE;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 4;
    public static final int DEVICE_OS_VERSION_FIELD_NUMBER = 6;
    public static final int DEVICE_SKU_FIELD_NUMBER = 5;
    public static final int DEVICE_SOFT_VERSION_FIELD_NUMBER = 3;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 1;
    public static final int DEVICE_UNIQUE_ID_FIELD_NUMBER = 2;
    private static volatile Parser<IWatch$IWatchDeviceInfoResponse> PARSER;
    private int deviceType_;
    private String deviceUniqueId_ = "";
    private String deviceSoftVersion_ = "";
    private String deviceModel_ = "";
    private String deviceSku_ = "";
    private String deviceOsVersion_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<IWatch$IWatchDeviceInfoResponse, Builder> implements IWatch$IWatchDeviceInfoResponseOrBuilder {
        public Builder clearDeviceModel() {
            copyOnWrite();
            ((IWatch$IWatchDeviceInfoResponse) this.instance).clearDeviceModel();
            return this;
        }

        public Builder clearDeviceOsVersion() {
            copyOnWrite();
            ((IWatch$IWatchDeviceInfoResponse) this.instance).clearDeviceOsVersion();
            return this;
        }

        public Builder clearDeviceSku() {
            copyOnWrite();
            ((IWatch$IWatchDeviceInfoResponse) this.instance).clearDeviceSku();
            return this;
        }

        public Builder clearDeviceSoftVersion() {
            copyOnWrite();
            ((IWatch$IWatchDeviceInfoResponse) this.instance).clearDeviceSoftVersion();
            return this;
        }

        public Builder clearDeviceType() {
            copyOnWrite();
            ((IWatch$IWatchDeviceInfoResponse) this.instance).clearDeviceType();
            return this;
        }

        public Builder clearDeviceUniqueId() {
            copyOnWrite();
            ((IWatch$IWatchDeviceInfoResponse) this.instance).clearDeviceUniqueId();
            return this;
        }

        @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
        public String getDeviceModel() {
            return ((IWatch$IWatchDeviceInfoResponse) this.instance).getDeviceModel();
        }

        @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
        public ByteString getDeviceModelBytes() {
            return ((IWatch$IWatchDeviceInfoResponse) this.instance).getDeviceModelBytes();
        }

        @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
        public String getDeviceOsVersion() {
            return ((IWatch$IWatchDeviceInfoResponse) this.instance).getDeviceOsVersion();
        }

        @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
        public ByteString getDeviceOsVersionBytes() {
            return ((IWatch$IWatchDeviceInfoResponse) this.instance).getDeviceOsVersionBytes();
        }

        @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
        public String getDeviceSku() {
            return ((IWatch$IWatchDeviceInfoResponse) this.instance).getDeviceSku();
        }

        @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
        public ByteString getDeviceSkuBytes() {
            return ((IWatch$IWatchDeviceInfoResponse) this.instance).getDeviceSkuBytes();
        }

        @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
        public String getDeviceSoftVersion() {
            return ((IWatch$IWatchDeviceInfoResponse) this.instance).getDeviceSoftVersion();
        }

        @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
        public ByteString getDeviceSoftVersionBytes() {
            return ((IWatch$IWatchDeviceInfoResponse) this.instance).getDeviceSoftVersionBytes();
        }

        @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
        public int getDeviceType() {
            return ((IWatch$IWatchDeviceInfoResponse) this.instance).getDeviceType();
        }

        @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
        public String getDeviceUniqueId() {
            return ((IWatch$IWatchDeviceInfoResponse) this.instance).getDeviceUniqueId();
        }

        @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
        public ByteString getDeviceUniqueIdBytes() {
            return ((IWatch$IWatchDeviceInfoResponse) this.instance).getDeviceUniqueIdBytes();
        }

        public Builder setDeviceModel(String str) {
            copyOnWrite();
            ((IWatch$IWatchDeviceInfoResponse) this.instance).setDeviceModel(str);
            return this;
        }

        public Builder setDeviceModelBytes(ByteString byteString) {
            copyOnWrite();
            ((IWatch$IWatchDeviceInfoResponse) this.instance).setDeviceModelBytes(byteString);
            return this;
        }

        public Builder setDeviceOsVersion(String str) {
            copyOnWrite();
            ((IWatch$IWatchDeviceInfoResponse) this.instance).setDeviceOsVersion(str);
            return this;
        }

        public Builder setDeviceOsVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((IWatch$IWatchDeviceInfoResponse) this.instance).setDeviceOsVersionBytes(byteString);
            return this;
        }

        public Builder setDeviceSku(String str) {
            copyOnWrite();
            ((IWatch$IWatchDeviceInfoResponse) this.instance).setDeviceSku(str);
            return this;
        }

        public Builder setDeviceSkuBytes(ByteString byteString) {
            copyOnWrite();
            ((IWatch$IWatchDeviceInfoResponse) this.instance).setDeviceSkuBytes(byteString);
            return this;
        }

        public Builder setDeviceSoftVersion(String str) {
            copyOnWrite();
            ((IWatch$IWatchDeviceInfoResponse) this.instance).setDeviceSoftVersion(str);
            return this;
        }

        public Builder setDeviceSoftVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((IWatch$IWatchDeviceInfoResponse) this.instance).setDeviceSoftVersionBytes(byteString);
            return this;
        }

        public Builder setDeviceType(int i) {
            copyOnWrite();
            ((IWatch$IWatchDeviceInfoResponse) this.instance).setDeviceType(i);
            return this;
        }

        public Builder setDeviceUniqueId(String str) {
            copyOnWrite();
            ((IWatch$IWatchDeviceInfoResponse) this.instance).setDeviceUniqueId(str);
            return this;
        }

        public Builder setDeviceUniqueIdBytes(ByteString byteString) {
            copyOnWrite();
            ((IWatch$IWatchDeviceInfoResponse) this.instance).setDeviceUniqueIdBytes(byteString);
            return this;
        }

        private Builder() {
            super(IWatch$IWatchDeviceInfoResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        IWatch$IWatchDeviceInfoResponse iWatch$IWatchDeviceInfoResponse = new IWatch$IWatchDeviceInfoResponse();
        DEFAULT_INSTANCE = iWatch$IWatchDeviceInfoResponse;
        GeneratedMessageLite.registerDefaultInstance(IWatch$IWatchDeviceInfoResponse.class, iWatch$IWatchDeviceInfoResponse);
    }

    private IWatch$IWatchDeviceInfoResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceModel() {
        this.deviceModel_ = getDefaultInstance().getDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceOsVersion() {
        this.deviceOsVersion_ = getDefaultInstance().getDeviceOsVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceSku() {
        this.deviceSku_ = getDefaultInstance().getDeviceSku();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceSoftVersion() {
        this.deviceSoftVersion_ = getDefaultInstance().getDeviceSoftVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceType() {
        this.deviceType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceUniqueId() {
        this.deviceUniqueId_ = getDefaultInstance().getDeviceUniqueId();
    }

    public static IWatch$IWatchDeviceInfoResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IWatch$IWatchDeviceInfoResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IWatch$IWatchDeviceInfoResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IWatch$IWatchDeviceInfoResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IWatch$IWatchDeviceInfoResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IWatch$IWatchDeviceInfoResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceModel(String str) {
        str.getClass();
        this.deviceModel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceModelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceModel_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceOsVersion(String str) {
        str.getClass();
        this.deviceOsVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceOsVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceOsVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceSku(String str) {
        str.getClass();
        this.deviceSku_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceSkuBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceSku_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceSoftVersion(String str) {
        str.getClass();
        this.deviceSoftVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceSoftVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceSoftVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceType(int i) {
        this.deviceType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceUniqueId(String str) {
        str.getClass();
        this.deviceUniqueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceUniqueIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceUniqueId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = f0a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new IWatch$IWatchDeviceInfoResponse();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u000b\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"deviceType_", "deviceUniqueId_", "deviceSoftVersion_", "deviceModel_", "deviceSku_", "deviceOsVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IWatch$IWatchDeviceInfoResponse> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IWatch$IWatchDeviceInfoResponse.class) {
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

    @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
    public String getDeviceModel() {
        return this.deviceModel_;
    }

    @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
    public ByteString getDeviceModelBytes() {
        return ByteString.copyFromUtf8(this.deviceModel_);
    }

    @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
    public String getDeviceOsVersion() {
        return this.deviceOsVersion_;
    }

    @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
    public ByteString getDeviceOsVersionBytes() {
        return ByteString.copyFromUtf8(this.deviceOsVersion_);
    }

    @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
    public String getDeviceSku() {
        return this.deviceSku_;
    }

    @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
    public ByteString getDeviceSkuBytes() {
        return ByteString.copyFromUtf8(this.deviceSku_);
    }

    @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
    public String getDeviceSoftVersion() {
        return this.deviceSoftVersion_;
    }

    @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
    public ByteString getDeviceSoftVersionBytes() {
        return ByteString.copyFromUtf8(this.deviceSoftVersion_);
    }

    @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
    public int getDeviceType() {
        return this.deviceType_;
    }

    @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
    public String getDeviceUniqueId() {
        return this.deviceUniqueId_;
    }

    @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponseOrBuilder
    public ByteString getDeviceUniqueIdBytes() {
        return ByteString.copyFromUtf8(this.deviceUniqueId_);
    }

    public static Builder newBuilder(IWatch$IWatchDeviceInfoResponse iWatch$IWatchDeviceInfoResponse) {
        return DEFAULT_INSTANCE.createBuilder(iWatch$IWatchDeviceInfoResponse);
    }

    public static IWatch$IWatchDeviceInfoResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$IWatchDeviceInfoResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IWatch$IWatchDeviceInfoResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$IWatchDeviceInfoResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IWatch$IWatchDeviceInfoResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IWatch$IWatchDeviceInfoResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IWatch$IWatchDeviceInfoResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$IWatchDeviceInfoResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IWatch$IWatchDeviceInfoResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IWatch$IWatchDeviceInfoResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IWatch$IWatchDeviceInfoResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$IWatchDeviceInfoResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IWatch$IWatchDeviceInfoResponse parseFrom(InputStream inputStream) throws IOException {
        return (IWatch$IWatchDeviceInfoResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IWatch$IWatchDeviceInfoResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$IWatchDeviceInfoResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IWatch$IWatchDeviceInfoResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IWatch$IWatchDeviceInfoResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IWatch$IWatchDeviceInfoResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$IWatchDeviceInfoResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
