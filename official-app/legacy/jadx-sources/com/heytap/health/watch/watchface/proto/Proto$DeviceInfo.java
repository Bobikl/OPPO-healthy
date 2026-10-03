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
public final class Proto$DeviceInfo extends GeneratedMessageLite<Proto$DeviceInfo, Builder> implements Proto$DeviceInfoOrBuilder {
    private static final Proto$DeviceInfo DEFAULT_INSTANCE;
    public static final int DENSITY_FIELD_NUMBER = 19;
    public static final int DEVICE_APP_VERSION_FIELD_NUMBER = 23;
    public static final int DEVICE_CATEGORY_FIELD_NUMBER = 1;
    public static final int DEVICE_MAC_FIELD_NUMBER = 16;
    public static final int DEVICE_SN_FIELD_NUMBER = 9;
    public static final int DEVICE_UNIQUE_ID_FIELD_NUMBER = 6;
    public static final int FIRMWARE_VERSION_FIELD_NUMBER = 7;
    public static final int HARDWARE_VERSION_FIELD_NUMBER = 8;
    public static final int MODEL_FIELD_NUMBER = 2;
    public static final int MODEL_NAME_FIELD_NUMBER = 3;
    private static volatile Parser<Proto$DeviceInfo> PARSER = null;
    public static final int SCALED_DENSITY_FIELD_NUMBER = 20;
    public static final int SCREEN_HEIGHT_FIELD_NUMBER = 18;
    public static final int SCREEN_RADIUS_FIELD_NUMBER = 21;
    public static final int SCREEN_TYPE_FIELD_NUMBER = 22;
    public static final int SCREEN_WIDTH_FIELD_NUMBER = 17;
    public static final int SECRET_KEY_FIELD_NUMBER = 24;
    public static final int SKU_FIELD_NUMBER = 4;
    public static final int SKU_NAME_FIELD_NUMBER = 5;
    private float density_;
    private int deviceAppVersion_;
    private float scaledDensity_;
    private int screenHeight_;
    private int screenRadius_;
    private int screenType_;
    private int screenWidth_;
    private String deviceCategory_ = "";
    private String model_ = "";
    private String modelName_ = "";
    private String sku_ = "";
    private String skuName_ = "";
    private String deviceUniqueId_ = "";
    private String firmwareVersion_ = "";
    private String hardwareVersion_ = "";
    private String deviceSn_ = "";
    private String deviceMac_ = "";
    private String secretKey_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<Proto$DeviceInfo, Builder> implements Proto$DeviceInfoOrBuilder {
        public Builder clearDensity() {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).clearDensity();
            return this;
        }

        public Builder clearDeviceAppVersion() {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).clearDeviceAppVersion();
            return this;
        }

        public Builder clearDeviceCategory() {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).clearDeviceCategory();
            return this;
        }

        public Builder clearDeviceMac() {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).clearDeviceMac();
            return this;
        }

        public Builder clearDeviceSn() {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).clearDeviceSn();
            return this;
        }

        public Builder clearDeviceUniqueId() {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).clearDeviceUniqueId();
            return this;
        }

        public Builder clearFirmwareVersion() {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).clearFirmwareVersion();
            return this;
        }

        public Builder clearHardwareVersion() {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).clearHardwareVersion();
            return this;
        }

        public Builder clearModel() {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).clearModel();
            return this;
        }

        public Builder clearModelName() {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).clearModelName();
            return this;
        }

        public Builder clearScaledDensity() {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).clearScaledDensity();
            return this;
        }

        public Builder clearScreenHeight() {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).clearScreenHeight();
            return this;
        }

        public Builder clearScreenRadius() {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).clearScreenRadius();
            return this;
        }

        public Builder clearScreenType() {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).clearScreenType();
            return this;
        }

        public Builder clearScreenWidth() {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).clearScreenWidth();
            return this;
        }

        public Builder clearSecretKey() {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).clearSecretKey();
            return this;
        }

        public Builder clearSku() {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).clearSku();
            return this;
        }

        public Builder clearSkuName() {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).clearSkuName();
            return this;
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public float getDensity() {
            return ((Proto$DeviceInfo) this.instance).getDensity();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public int getDeviceAppVersion() {
            return ((Proto$DeviceInfo) this.instance).getDeviceAppVersion();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public String getDeviceCategory() {
            return ((Proto$DeviceInfo) this.instance).getDeviceCategory();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public ByteString getDeviceCategoryBytes() {
            return ((Proto$DeviceInfo) this.instance).getDeviceCategoryBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public String getDeviceMac() {
            return ((Proto$DeviceInfo) this.instance).getDeviceMac();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public ByteString getDeviceMacBytes() {
            return ((Proto$DeviceInfo) this.instance).getDeviceMacBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public String getDeviceSn() {
            return ((Proto$DeviceInfo) this.instance).getDeviceSn();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public ByteString getDeviceSnBytes() {
            return ((Proto$DeviceInfo) this.instance).getDeviceSnBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public String getDeviceUniqueId() {
            return ((Proto$DeviceInfo) this.instance).getDeviceUniqueId();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public ByteString getDeviceUniqueIdBytes() {
            return ((Proto$DeviceInfo) this.instance).getDeviceUniqueIdBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public String getFirmwareVersion() {
            return ((Proto$DeviceInfo) this.instance).getFirmwareVersion();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public ByteString getFirmwareVersionBytes() {
            return ((Proto$DeviceInfo) this.instance).getFirmwareVersionBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public String getHardwareVersion() {
            return ((Proto$DeviceInfo) this.instance).getHardwareVersion();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public ByteString getHardwareVersionBytes() {
            return ((Proto$DeviceInfo) this.instance).getHardwareVersionBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public String getModel() {
            return ((Proto$DeviceInfo) this.instance).getModel();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public ByteString getModelBytes() {
            return ((Proto$DeviceInfo) this.instance).getModelBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public String getModelName() {
            return ((Proto$DeviceInfo) this.instance).getModelName();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public ByteString getModelNameBytes() {
            return ((Proto$DeviceInfo) this.instance).getModelNameBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public float getScaledDensity() {
            return ((Proto$DeviceInfo) this.instance).getScaledDensity();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public int getScreenHeight() {
            return ((Proto$DeviceInfo) this.instance).getScreenHeight();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public int getScreenRadius() {
            return ((Proto$DeviceInfo) this.instance).getScreenRadius();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public Proto$ScreenType getScreenType() {
            return ((Proto$DeviceInfo) this.instance).getScreenType();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public int getScreenTypeValue() {
            return ((Proto$DeviceInfo) this.instance).getScreenTypeValue();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public int getScreenWidth() {
            return ((Proto$DeviceInfo) this.instance).getScreenWidth();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public String getSecretKey() {
            return ((Proto$DeviceInfo) this.instance).getSecretKey();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public ByteString getSecretKeyBytes() {
            return ((Proto$DeviceInfo) this.instance).getSecretKeyBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public String getSku() {
            return ((Proto$DeviceInfo) this.instance).getSku();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public ByteString getSkuBytes() {
            return ((Proto$DeviceInfo) this.instance).getSkuBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public String getSkuName() {
            return ((Proto$DeviceInfo) this.instance).getSkuName();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
        public ByteString getSkuNameBytes() {
            return ((Proto$DeviceInfo) this.instance).getSkuNameBytes();
        }

        public Builder setDensity(float f) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setDensity(f);
            return this;
        }

        public Builder setDeviceAppVersion(int i) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setDeviceAppVersion(i);
            return this;
        }

        public Builder setDeviceCategory(String str) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setDeviceCategory(str);
            return this;
        }

        public Builder setDeviceCategoryBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setDeviceCategoryBytes(byteString);
            return this;
        }

        public Builder setDeviceMac(String str) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setDeviceMac(str);
            return this;
        }

        public Builder setDeviceMacBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setDeviceMacBytes(byteString);
            return this;
        }

        public Builder setDeviceSn(String str) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setDeviceSn(str);
            return this;
        }

        public Builder setDeviceSnBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setDeviceSnBytes(byteString);
            return this;
        }

        public Builder setDeviceUniqueId(String str) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setDeviceUniqueId(str);
            return this;
        }

        public Builder setDeviceUniqueIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setDeviceUniqueIdBytes(byteString);
            return this;
        }

        public Builder setFirmwareVersion(String str) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setFirmwareVersion(str);
            return this;
        }

        public Builder setFirmwareVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setFirmwareVersionBytes(byteString);
            return this;
        }

        public Builder setHardwareVersion(String str) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setHardwareVersion(str);
            return this;
        }

        public Builder setHardwareVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setHardwareVersionBytes(byteString);
            return this;
        }

        public Builder setModel(String str) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setModel(str);
            return this;
        }

        public Builder setModelBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setModelBytes(byteString);
            return this;
        }

        public Builder setModelName(String str) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setModelName(str);
            return this;
        }

        public Builder setModelNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setModelNameBytes(byteString);
            return this;
        }

        public Builder setScaledDensity(float f) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setScaledDensity(f);
            return this;
        }

        public Builder setScreenHeight(int i) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setScreenHeight(i);
            return this;
        }

        public Builder setScreenRadius(int i) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setScreenRadius(i);
            return this;
        }

        public Builder setScreenType(Proto$ScreenType proto$ScreenType) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setScreenType(proto$ScreenType);
            return this;
        }

        public Builder setScreenTypeValue(int i) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setScreenTypeValue(i);
            return this;
        }

        public Builder setScreenWidth(int i) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setScreenWidth(i);
            return this;
        }

        public Builder setSecretKey(String str) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setSecretKey(str);
            return this;
        }

        public Builder setSecretKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setSecretKeyBytes(byteString);
            return this;
        }

        public Builder setSku(String str) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setSku(str);
            return this;
        }

        public Builder setSkuBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setSkuBytes(byteString);
            return this;
        }

        public Builder setSkuName(String str) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setSkuName(str);
            return this;
        }

        public Builder setSkuNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$DeviceInfo) this.instance).setSkuNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(Proto$DeviceInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        Proto$DeviceInfo proto$DeviceInfo = new Proto$DeviceInfo();
        DEFAULT_INSTANCE = proto$DeviceInfo;
        GeneratedMessageLite.registerDefaultInstance(Proto$DeviceInfo.class, proto$DeviceInfo);
    }

    private Proto$DeviceInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDensity() {
        this.density_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceAppVersion() {
        this.deviceAppVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceCategory() {
        this.deviceCategory_ = getDefaultInstance().getDeviceCategory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceMac() {
        this.deviceMac_ = getDefaultInstance().getDeviceMac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceSn() {
        this.deviceSn_ = getDefaultInstance().getDeviceSn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceUniqueId() {
        this.deviceUniqueId_ = getDefaultInstance().getDeviceUniqueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirmwareVersion() {
        this.firmwareVersion_ = getDefaultInstance().getFirmwareVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHardwareVersion() {
        this.hardwareVersion_ = getDefaultInstance().getHardwareVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModel() {
        this.model_ = getDefaultInstance().getModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModelName() {
        this.modelName_ = getDefaultInstance().getModelName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScaledDensity() {
        this.scaledDensity_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenHeight() {
        this.screenHeight_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenRadius() {
        this.screenRadius_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenType() {
        this.screenType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenWidth() {
        this.screenWidth_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecretKey() {
        this.secretKey_ = getDefaultInstance().getSecretKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSku() {
        this.sku_ = getDefaultInstance().getSku();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkuName() {
        this.skuName_ = getDefaultInstance().getSkuName();
    }

    public static Proto$DeviceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Proto$DeviceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Proto$DeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$DeviceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Proto$DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Proto$DeviceInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDensity(float f) {
        this.density_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceAppVersion(int i) {
        this.deviceAppVersion_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceCategory(String str) {
        str.getClass();
        this.deviceCategory_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceCategoryBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceCategory_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceMac(String str) {
        str.getClass();
        this.deviceMac_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceMacBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceMac_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceSn(String str) {
        str.getClass();
        this.deviceSn_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceSnBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceSn_ = byteString.toStringUtf8();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirmwareVersion(String str) {
        str.getClass();
        this.firmwareVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirmwareVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.firmwareVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHardwareVersion(String str) {
        str.getClass();
        this.hardwareVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHardwareVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.hardwareVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModel(String str) {
        str.getClass();
        this.model_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.model_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModelName(String str) {
        str.getClass();
        this.modelName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModelNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.modelName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScaledDensity(float f) {
        this.scaledDensity_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenHeight(int i) {
        this.screenHeight_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenRadius(int i) {
        this.screenRadius_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenType(Proto$ScreenType proto$ScreenType) {
        this.screenType_ = proto$ScreenType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenTypeValue(int i) {
        this.screenType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenWidth(int i) {
        this.screenWidth_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecretKey(String str) {
        str.getClass();
        this.secretKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecretKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.secretKey_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSku(String str) {
        str.getClass();
        this.sku_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkuBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sku_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkuName(String str) {
        str.getClass();
        this.skuName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkuNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.skuName_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (fze.a[methodToInvoke.ordinal()]) {
            case 1:
                return new Proto$DeviceInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0000\u0001\u0018\u0012\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\u0010Ȉ\u0011\u0004\u0012\u0004\u0013\u0001\u0014\u0001\u0015\u0004\u0016\f\u0017\u0004\u0018Ȉ", new Object[]{"deviceCategory_", "model_", "modelName_", "sku_", "skuName_", "deviceUniqueId_", "firmwareVersion_", "hardwareVersion_", "deviceSn_", "deviceMac_", "screenWidth_", "screenHeight_", "density_", "scaledDensity_", "screenRadius_", "screenType_", "deviceAppVersion_", "secretKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proto$DeviceInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Proto$DeviceInfo.class) {
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

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public float getDensity() {
        return this.density_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public int getDeviceAppVersion() {
        return this.deviceAppVersion_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public String getDeviceCategory() {
        return this.deviceCategory_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public ByteString getDeviceCategoryBytes() {
        return ByteString.copyFromUtf8(this.deviceCategory_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public String getDeviceMac() {
        return this.deviceMac_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public ByteString getDeviceMacBytes() {
        return ByteString.copyFromUtf8(this.deviceMac_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public String getDeviceSn() {
        return this.deviceSn_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public ByteString getDeviceSnBytes() {
        return ByteString.copyFromUtf8(this.deviceSn_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public String getDeviceUniqueId() {
        return this.deviceUniqueId_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public ByteString getDeviceUniqueIdBytes() {
        return ByteString.copyFromUtf8(this.deviceUniqueId_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public String getFirmwareVersion() {
        return this.firmwareVersion_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public ByteString getFirmwareVersionBytes() {
        return ByteString.copyFromUtf8(this.firmwareVersion_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public String getHardwareVersion() {
        return this.hardwareVersion_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public ByteString getHardwareVersionBytes() {
        return ByteString.copyFromUtf8(this.hardwareVersion_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public String getModel() {
        return this.model_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public ByteString getModelBytes() {
        return ByteString.copyFromUtf8(this.model_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public String getModelName() {
        return this.modelName_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public ByteString getModelNameBytes() {
        return ByteString.copyFromUtf8(this.modelName_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public float getScaledDensity() {
        return this.scaledDensity_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public int getScreenHeight() {
        return this.screenHeight_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public int getScreenRadius() {
        return this.screenRadius_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public Proto$ScreenType getScreenType() {
        Proto$ScreenType proto$ScreenTypeForNumber = Proto$ScreenType.forNumber(this.screenType_);
        return proto$ScreenTypeForNumber == null ? Proto$ScreenType.UNRECOGNIZED : proto$ScreenTypeForNumber;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public int getScreenTypeValue() {
        return this.screenType_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public int getScreenWidth() {
        return this.screenWidth_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public String getSecretKey() {
        return this.secretKey_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public ByteString getSecretKeyBytes() {
        return ByteString.copyFromUtf8(this.secretKey_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public String getSku() {
        return this.sku_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public ByteString getSkuBytes() {
        return ByteString.copyFromUtf8(this.sku_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public String getSkuName() {
        return this.skuName_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$DeviceInfoOrBuilder
    public ByteString getSkuNameBytes() {
        return ByteString.copyFromUtf8(this.skuName_);
    }

    public static Builder newBuilder(Proto$DeviceInfo proto$DeviceInfo) {
        return DEFAULT_INSTANCE.createBuilder(proto$DeviceInfo);
    }

    public static Proto$DeviceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$DeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$DeviceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Proto$DeviceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Proto$DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Proto$DeviceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Proto$DeviceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Proto$DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Proto$DeviceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Proto$DeviceInfo parseFrom(InputStream inputStream) throws IOException {
        return (Proto$DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$DeviceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$DeviceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Proto$DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Proto$DeviceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
