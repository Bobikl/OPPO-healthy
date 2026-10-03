package com.heytap.health.protocol.dm;

import com.google.protobuf.AbstractMessageLite;
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
public final class DMProto$ConnectDeviceInfo extends GeneratedMessageLite<DMProto$ConnectDeviceInfo, Builder> implements DMProto$ConnectDeviceInfoOrBuilder {
    public static final int BOARD_ID_FIELD_NUMBER = 19;
    public static final int BT_NAME_FIELD_NUMBER = 17;
    public static final int BT_VERSION_FIELD_NUMBER = 1;
    private static final DMProto$ConnectDeviceInfo DEFAULT_INSTANCE;
    public static final int DEVICE_BLE_MAC_FIELD_NUMBER = 15;
    public static final int DEVICE_BT_MAC_FIELD_NUMBER = 5;
    public static final int DEVICE_HARD_VERSION_FIELD_NUMBER = 13;
    public static final int DEVICE_IMEI_FIELD_NUMBER = 6;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 10;
    public static final int DEVICE_NAME_FIELD_NUMBER = 11;
    public static final int DEVICE_OPENSOURCE_VERSION_FIELD_NUMBER = 8;
    public static final int DEVICE_OTA_VERSION_FIELD_NUMBER = 21;
    public static final int DEVICE_PHONE_NUMBER_FIELD_NUMBER = 4;
    public static final int DEVICE_SKU_FIELD_NUMBER = 16;
    public static final int DEVICE_SN_FIELD_NUMBER = 9;
    public static final int DEVICE_SOFT_VERSION_FIELD_NUMBER = 7;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 2;
    public static final int DEVICE_VERSION_FIELD_NUMBER = 3;
    public static final int GUID_FIELD_NUMBER = 23;
    public static final int LINKAGE_PHONE_FIELD_NUMBER = 12;
    public static final int MANUFACTURER_FIELD_NUMBER = 14;
    public static final int OAF_MODEL_ID_FIELD_NUMBER = 22;
    public static final int OSVERSION_FIELD_NUMBER = 20;
    private static volatile Parser<DMProto$ConnectDeviceInfo> PARSER = null;
    public static final int PROJECT_ID_FIELD_NUMBER = 18;
    public static final int SSOID_FIELD_NUMBER = 24;
    private int deviceType_;
    private int linkagePhone_;
    private String bTVersion_ = "";
    private String deviceVersion_ = "";
    private String devicePhoneNumber_ = "";
    private String deviceBtMac_ = "";
    private String deviceImei_ = "";
    private String deviceSoftVersion_ = "";
    private String deviceOpensourceVersion_ = "";
    private String deviceSn_ = "";
    private String deviceModel_ = "";
    private String deviceName_ = "";
    private String deviceHardVersion_ = "";
    private String manufacturer_ = "";
    private String deviceBleMac_ = "";
    private String deviceSku_ = "";
    private String btName_ = "";
    private String projectId_ = "";
    private String boardId_ = "";
    private String osVersion_ = "";
    private String deviceOtaVersion_ = "";
    private String oafModelId_ = "";
    private String guid_ = "";
    private String ssoid_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$ConnectDeviceInfo, Builder> implements DMProto$ConnectDeviceInfoOrBuilder {
        public Builder clearBTVersion() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearBTVersion();
            return this;
        }

        public Builder clearBoardId() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearBoardId();
            return this;
        }

        public Builder clearBtName() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearBtName();
            return this;
        }

        public Builder clearDeviceBleMac() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearDeviceBleMac();
            return this;
        }

        public Builder clearDeviceBtMac() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearDeviceBtMac();
            return this;
        }

        public Builder clearDeviceHardVersion() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearDeviceHardVersion();
            return this;
        }

        public Builder clearDeviceImei() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearDeviceImei();
            return this;
        }

        public Builder clearDeviceModel() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearDeviceModel();
            return this;
        }

        public Builder clearDeviceName() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearDeviceName();
            return this;
        }

        public Builder clearDeviceOpensourceVersion() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearDeviceOpensourceVersion();
            return this;
        }

        public Builder clearDeviceOtaVersion() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearDeviceOtaVersion();
            return this;
        }

        public Builder clearDevicePhoneNumber() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearDevicePhoneNumber();
            return this;
        }

        public Builder clearDeviceSku() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearDeviceSku();
            return this;
        }

        public Builder clearDeviceSn() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearDeviceSn();
            return this;
        }

        public Builder clearDeviceSoftVersion() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearDeviceSoftVersion();
            return this;
        }

        public Builder clearDeviceType() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearDeviceType();
            return this;
        }

        public Builder clearDeviceVersion() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearDeviceVersion();
            return this;
        }

        public Builder clearGuid() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearGuid();
            return this;
        }

        public Builder clearLinkagePhone() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearLinkagePhone();
            return this;
        }

        public Builder clearManufacturer() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearManufacturer();
            return this;
        }

        public Builder clearOafModelId() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearOafModelId();
            return this;
        }

        public Builder clearOsVersion() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearOsVersion();
            return this;
        }

        public Builder clearProjectId() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearProjectId();
            return this;
        }

        public Builder clearSsoid() {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).clearSsoid();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getBTVersion() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getBTVersion();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getBTVersionBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getBTVersionBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getBoardId() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getBoardId();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getBoardIdBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getBoardIdBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getBtName() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getBtName();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getBtNameBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getBtNameBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getDeviceBleMac() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceBleMac();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getDeviceBleMacBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceBleMacBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getDeviceBtMac() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceBtMac();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getDeviceBtMacBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceBtMacBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getDeviceHardVersion() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceHardVersion();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getDeviceHardVersionBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceHardVersionBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getDeviceImei() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceImei();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getDeviceImeiBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceImeiBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getDeviceModel() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceModel();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getDeviceModelBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceModelBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getDeviceName() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceName();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getDeviceNameBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceNameBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getDeviceOpensourceVersion() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceOpensourceVersion();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getDeviceOpensourceVersionBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceOpensourceVersionBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getDeviceOtaVersion() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceOtaVersion();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getDeviceOtaVersionBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceOtaVersionBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getDevicePhoneNumber() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDevicePhoneNumber();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getDevicePhoneNumberBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDevicePhoneNumberBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getDeviceSku() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceSku();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getDeviceSkuBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceSkuBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getDeviceSn() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceSn();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getDeviceSnBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceSnBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getDeviceSoftVersion() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceSoftVersion();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getDeviceSoftVersionBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceSoftVersionBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public int getDeviceType() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceType();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getDeviceVersion() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceVersion();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getDeviceVersionBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getDeviceVersionBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getGuid() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getGuid();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getGuidBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getGuidBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public int getLinkagePhone() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getLinkagePhone();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getManufacturer() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getManufacturer();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getManufacturerBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getManufacturerBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getOafModelId() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getOafModelId();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getOafModelIdBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getOafModelIdBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getOsVersion() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getOsVersion();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getOsVersionBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getOsVersionBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getProjectId() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getProjectId();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getProjectIdBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getProjectIdBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public String getSsoid() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getSsoid();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
        public ByteString getSsoidBytes() {
            return ((DMProto$ConnectDeviceInfo) this.instance).getSsoidBytes();
        }

        public Builder setBTVersion(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setBTVersion(str);
            return this;
        }

        public Builder setBTVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setBTVersionBytes(byteString);
            return this;
        }

        public Builder setBoardId(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setBoardId(str);
            return this;
        }

        public Builder setBoardIdBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setBoardIdBytes(byteString);
            return this;
        }

        public Builder setBtName(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setBtName(str);
            return this;
        }

        public Builder setBtNameBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setBtNameBytes(byteString);
            return this;
        }

        public Builder setDeviceBleMac(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceBleMac(str);
            return this;
        }

        public Builder setDeviceBleMacBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceBleMacBytes(byteString);
            return this;
        }

        public Builder setDeviceBtMac(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceBtMac(str);
            return this;
        }

        public Builder setDeviceBtMacBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceBtMacBytes(byteString);
            return this;
        }

        public Builder setDeviceHardVersion(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceHardVersion(str);
            return this;
        }

        public Builder setDeviceHardVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceHardVersionBytes(byteString);
            return this;
        }

        public Builder setDeviceImei(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceImei(str);
            return this;
        }

        public Builder setDeviceImeiBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceImeiBytes(byteString);
            return this;
        }

        public Builder setDeviceModel(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceModel(str);
            return this;
        }

        public Builder setDeviceModelBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceModelBytes(byteString);
            return this;
        }

        public Builder setDeviceName(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceName(str);
            return this;
        }

        public Builder setDeviceNameBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceNameBytes(byteString);
            return this;
        }

        public Builder setDeviceOpensourceVersion(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceOpensourceVersion(str);
            return this;
        }

        public Builder setDeviceOpensourceVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceOpensourceVersionBytes(byteString);
            return this;
        }

        public Builder setDeviceOtaVersion(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceOtaVersion(str);
            return this;
        }

        public Builder setDeviceOtaVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceOtaVersionBytes(byteString);
            return this;
        }

        public Builder setDevicePhoneNumber(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDevicePhoneNumber(str);
            return this;
        }

        public Builder setDevicePhoneNumberBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDevicePhoneNumberBytes(byteString);
            return this;
        }

        public Builder setDeviceSku(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceSku(str);
            return this;
        }

        public Builder setDeviceSkuBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceSkuBytes(byteString);
            return this;
        }

        public Builder setDeviceSn(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceSn(str);
            return this;
        }

        public Builder setDeviceSnBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceSnBytes(byteString);
            return this;
        }

        public Builder setDeviceSoftVersion(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceSoftVersion(str);
            return this;
        }

        public Builder setDeviceSoftVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceSoftVersionBytes(byteString);
            return this;
        }

        public Builder setDeviceType(int i) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceType(i);
            return this;
        }

        public Builder setDeviceVersion(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceVersion(str);
            return this;
        }

        public Builder setDeviceVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setDeviceVersionBytes(byteString);
            return this;
        }

        public Builder setGuid(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setGuid(str);
            return this;
        }

        public Builder setGuidBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setGuidBytes(byteString);
            return this;
        }

        public Builder setLinkagePhone(int i) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setLinkagePhone(i);
            return this;
        }

        public Builder setManufacturer(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setManufacturer(str);
            return this;
        }

        public Builder setManufacturerBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setManufacturerBytes(byteString);
            return this;
        }

        public Builder setOafModelId(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setOafModelId(str);
            return this;
        }

        public Builder setOafModelIdBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setOafModelIdBytes(byteString);
            return this;
        }

        public Builder setOsVersion(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setOsVersion(str);
            return this;
        }

        public Builder setOsVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setOsVersionBytes(byteString);
            return this;
        }

        public Builder setProjectId(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setProjectId(str);
            return this;
        }

        public Builder setProjectIdBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setProjectIdBytes(byteString);
            return this;
        }

        public Builder setSsoid(String str) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setSsoid(str);
            return this;
        }

        public Builder setSsoidBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ConnectDeviceInfo) this.instance).setSsoidBytes(byteString);
            return this;
        }

        private Builder() {
            super(DMProto$ConnectDeviceInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$ConnectDeviceInfo dMProto$ConnectDeviceInfo = new DMProto$ConnectDeviceInfo();
        DEFAULT_INSTANCE = dMProto$ConnectDeviceInfo;
        GeneratedMessageLite.registerDefaultInstance(DMProto$ConnectDeviceInfo.class, dMProto$ConnectDeviceInfo);
    }

    private DMProto$ConnectDeviceInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBTVersion() {
        this.bTVersion_ = getDefaultInstance().getBTVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoardId() {
        this.boardId_ = getDefaultInstance().getBoardId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBtName() {
        this.btName_ = getDefaultInstance().getBtName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceBleMac() {
        this.deviceBleMac_ = getDefaultInstance().getDeviceBleMac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceBtMac() {
        this.deviceBtMac_ = getDefaultInstance().getDeviceBtMac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceHardVersion() {
        this.deviceHardVersion_ = getDefaultInstance().getDeviceHardVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceImei() {
        this.deviceImei_ = getDefaultInstance().getDeviceImei();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceModel() {
        this.deviceModel_ = getDefaultInstance().getDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceName() {
        this.deviceName_ = getDefaultInstance().getDeviceName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceOpensourceVersion() {
        this.deviceOpensourceVersion_ = getDefaultInstance().getDeviceOpensourceVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceOtaVersion() {
        this.deviceOtaVersion_ = getDefaultInstance().getDeviceOtaVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDevicePhoneNumber() {
        this.devicePhoneNumber_ = getDefaultInstance().getDevicePhoneNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceSku() {
        this.deviceSku_ = getDefaultInstance().getDeviceSku();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceSn() {
        this.deviceSn_ = getDefaultInstance().getDeviceSn();
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
    public void clearDeviceVersion() {
        this.deviceVersion_ = getDefaultInstance().getDeviceVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGuid() {
        this.guid_ = getDefaultInstance().getGuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkagePhone() {
        this.linkagePhone_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearManufacturer() {
        this.manufacturer_ = getDefaultInstance().getManufacturer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOafModelId() {
        this.oafModelId_ = getDefaultInstance().getOafModelId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsVersion() {
        this.osVersion_ = getDefaultInstance().getOsVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProjectId() {
        this.projectId_ = getDefaultInstance().getProjectId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSsoid() {
        this.ssoid_ = getDefaultInstance().getSsoid();
    }

    public static DMProto$ConnectDeviceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$ConnectDeviceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$ConnectDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$ConnectDeviceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$ConnectDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$ConnectDeviceInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBTVersion(String str) {
        str.getClass();
        this.bTVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBTVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bTVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoardId(String str) {
        str.getClass();
        this.boardId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoardIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.boardId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBtName(String str) {
        str.getClass();
        this.btName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBtNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.btName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceBleMac(String str) {
        str.getClass();
        this.deviceBleMac_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceBleMacBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceBleMac_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceBtMac(String str) {
        str.getClass();
        this.deviceBtMac_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceBtMacBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceBtMac_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceHardVersion(String str) {
        str.getClass();
        this.deviceHardVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceHardVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceHardVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceImei(String str) {
        str.getClass();
        this.deviceImei_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceImeiBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceImei_ = byteString.toStringUtf8();
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
    public void setDeviceName(String str) {
        str.getClass();
        this.deviceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceOpensourceVersion(String str) {
        str.getClass();
        this.deviceOpensourceVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceOpensourceVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceOpensourceVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceOtaVersion(String str) {
        str.getClass();
        this.deviceOtaVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceOtaVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceOtaVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDevicePhoneNumber(String str) {
        str.getClass();
        this.devicePhoneNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDevicePhoneNumberBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.devicePhoneNumber_ = byteString.toStringUtf8();
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
    public void setDeviceVersion(String str) {
        str.getClass();
        this.deviceVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuid(String str) {
        str.getClass();
        this.guid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.guid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkagePhone(int i) {
        this.linkagePhone_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManufacturer(String str) {
        str.getClass();
        this.manufacturer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManufacturerBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.manufacturer_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOafModelId(String str) {
        str.getClass();
        this.oafModelId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOafModelIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.oafModelId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(String str) {
        str.getClass();
        this.osVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.osVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProjectId(String str) {
        str.getClass();
        this.projectId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProjectIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.projectId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSsoid(String str) {
        str.getClass();
        this.ssoid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSsoidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ssoid_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (yl4.a[methodToInvoke.ordinal()]) {
            case 1:
                return new DMProto$ConnectDeviceInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0018\u0000\u0000\u0001\u0018\u0018\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\f\u000b\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ", new Object[]{"bTVersion_", "deviceType_", "deviceVersion_", "devicePhoneNumber_", "deviceBtMac_", "deviceImei_", "deviceSoftVersion_", "deviceOpensourceVersion_", "deviceSn_", "deviceModel_", "deviceName_", "linkagePhone_", "deviceHardVersion_", "manufacturer_", "deviceBleMac_", "deviceSku_", "btName_", "projectId_", "boardId_", "osVersion_", "deviceOtaVersion_", "oafModelId_", "guid_", "ssoid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$ConnectDeviceInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$ConnectDeviceInfo.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getBTVersion() {
        return this.bTVersion_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getBTVersionBytes() {
        return ByteString.copyFromUtf8(this.bTVersion_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getBoardId() {
        return this.boardId_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getBoardIdBytes() {
        return ByteString.copyFromUtf8(this.boardId_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getBtName() {
        return this.btName_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getBtNameBytes() {
        return ByteString.copyFromUtf8(this.btName_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getDeviceBleMac() {
        return this.deviceBleMac_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getDeviceBleMacBytes() {
        return ByteString.copyFromUtf8(this.deviceBleMac_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getDeviceBtMac() {
        return this.deviceBtMac_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getDeviceBtMacBytes() {
        return ByteString.copyFromUtf8(this.deviceBtMac_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getDeviceHardVersion() {
        return this.deviceHardVersion_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getDeviceHardVersionBytes() {
        return ByteString.copyFromUtf8(this.deviceHardVersion_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getDeviceImei() {
        return this.deviceImei_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getDeviceImeiBytes() {
        return ByteString.copyFromUtf8(this.deviceImei_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getDeviceModel() {
        return this.deviceModel_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getDeviceModelBytes() {
        return ByteString.copyFromUtf8(this.deviceModel_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getDeviceName() {
        return this.deviceName_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getDeviceNameBytes() {
        return ByteString.copyFromUtf8(this.deviceName_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getDeviceOpensourceVersion() {
        return this.deviceOpensourceVersion_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getDeviceOpensourceVersionBytes() {
        return ByteString.copyFromUtf8(this.deviceOpensourceVersion_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getDeviceOtaVersion() {
        return this.deviceOtaVersion_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getDeviceOtaVersionBytes() {
        return ByteString.copyFromUtf8(this.deviceOtaVersion_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getDevicePhoneNumber() {
        return this.devicePhoneNumber_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getDevicePhoneNumberBytes() {
        return ByteString.copyFromUtf8(this.devicePhoneNumber_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getDeviceSku() {
        return this.deviceSku_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getDeviceSkuBytes() {
        return ByteString.copyFromUtf8(this.deviceSku_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getDeviceSn() {
        return this.deviceSn_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getDeviceSnBytes() {
        return ByteString.copyFromUtf8(this.deviceSn_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getDeviceSoftVersion() {
        return this.deviceSoftVersion_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getDeviceSoftVersionBytes() {
        return ByteString.copyFromUtf8(this.deviceSoftVersion_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public int getDeviceType() {
        return this.deviceType_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getDeviceVersion() {
        return this.deviceVersion_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getDeviceVersionBytes() {
        return ByteString.copyFromUtf8(this.deviceVersion_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getGuid() {
        return this.guid_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getGuidBytes() {
        return ByteString.copyFromUtf8(this.guid_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public int getLinkagePhone() {
        return this.linkagePhone_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getManufacturer() {
        return this.manufacturer_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getManufacturerBytes() {
        return ByteString.copyFromUtf8(this.manufacturer_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getOafModelId() {
        return this.oafModelId_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getOafModelIdBytes() {
        return ByteString.copyFromUtf8(this.oafModelId_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getOsVersion() {
        return this.osVersion_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getOsVersionBytes() {
        return ByteString.copyFromUtf8(this.osVersion_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getProjectId() {
        return this.projectId_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getProjectIdBytes() {
        return ByteString.copyFromUtf8(this.projectId_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public String getSsoid() {
        return this.ssoid_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfoOrBuilder
    public ByteString getSsoidBytes() {
        return ByteString.copyFromUtf8(this.ssoid_);
    }

    public static Builder newBuilder(DMProto$ConnectDeviceInfo dMProto$ConnectDeviceInfo) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$ConnectDeviceInfo);
    }

    public static DMProto$ConnectDeviceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$ConnectDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$ConnectDeviceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$ConnectDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$ConnectDeviceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$ConnectDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$ConnectDeviceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$ConnectDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$ConnectDeviceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$ConnectDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$ConnectDeviceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$ConnectDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$ConnectDeviceInfo parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$ConnectDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$ConnectDeviceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$ConnectDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$ConnectDeviceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$ConnectDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$ConnectDeviceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$ConnectDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
