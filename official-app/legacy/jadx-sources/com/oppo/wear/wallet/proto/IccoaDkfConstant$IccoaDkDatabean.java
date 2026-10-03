package com.oppo.wear.wallet.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.j1a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public final class IccoaDkfConstant$IccoaDkDatabean extends GeneratedMessageLite<IccoaDkfConstant$IccoaDkDatabean, Builder> implements IccoaDkfConstant$IccoaDkDatabeanOrBuilder {
    public static final int BLUETOOTHKEYSTATUS_FIELD_NUMBER = 13;
    public static final int BRANDID_FIELD_NUMBER = 10;
    private static final IccoaDkfConstant$IccoaDkDatabean DEFAULT_INSTANCE;
    public static final int ENDDATE_FIELD_NUMBER = 5;
    public static final int FRIENDLYNAME_FIELD_NUMBER = 3;
    public static final int IMAGEURL_FIELD_NUMBER = 16;
    public static final int KEYID_FIELD_NUMBER = 2;
    public static final int KEYPRIVILEGE_FIELD_NUMBER = 6;
    public static final int KEYTYPE_FIELD_NUMBER = 7;
    public static final int OEMDATA_FIELD_NUMBER = 14;
    private static volatile Parser<IccoaDkfConstant$IccoaDkDatabean> PARSER = null;
    public static final int STARTDATE_FIELD_NUMBER = 4;
    public static final int STATUS_FIELD_NUMBER = 8;
    public static final int VEHICLEID_FIELD_NUMBER = 1;
    public static final int VEHICLEMODEL_FIELD_NUMBER = 15;
    public static final int VEHICLEOEMID_FIELD_NUMBER = 9;
    public static final int VEHICLEPROFILE_FIELD_NUMBER = 12;
    public static final int VEHICLEPROPRIETARYDATA_FIELD_NUMBER = 11;
    private int bitField0_;
    private int bluetoothKeyStatus_;
    private String brandId_;
    private long endDate_;
    private String friendlyName_;
    private String imageUrl_;
    private ByteString keyId_;
    private String keyPrivilege_;
    private int keyType_;
    private ByteString oemData_;
    private long startDate_;
    private int status_;
    private ByteString vehicleId_;
    private String vehicleModel_;
    private ByteString vehicleOemId_;
    private IccoaDkfConstant$VehicleProfile vehicleProfile_;
    private ByteString vehicleProprietaryData_;

    public static final class Builder extends GeneratedMessageLite.Builder<IccoaDkfConstant$IccoaDkDatabean, Builder> implements IccoaDkfConstant$IccoaDkDatabeanOrBuilder {
        public Builder clearBluetoothKeyStatus() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).clearBluetoothKeyStatus();
            return this;
        }

        public Builder clearBrandId() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).clearBrandId();
            return this;
        }

        public Builder clearEndDate() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).clearEndDate();
            return this;
        }

        public Builder clearFriendlyName() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).clearFriendlyName();
            return this;
        }

        public Builder clearImageUrl() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).clearImageUrl();
            return this;
        }

        public Builder clearKeyId() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).clearKeyId();
            return this;
        }

        public Builder clearKeyPrivilege() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).clearKeyPrivilege();
            return this;
        }

        public Builder clearKeyType() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).clearKeyType();
            return this;
        }

        public Builder clearOemData() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).clearOemData();
            return this;
        }

        public Builder clearStartDate() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).clearStartDate();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).clearStatus();
            return this;
        }

        public Builder clearVehicleId() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).clearVehicleId();
            return this;
        }

        public Builder clearVehicleModel() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).clearVehicleModel();
            return this;
        }

        public Builder clearVehicleOemId() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).clearVehicleOemId();
            return this;
        }

        public Builder clearVehicleProfile() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).clearVehicleProfile();
            return this;
        }

        public Builder clearVehicleProprietaryData() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).clearVehicleProprietaryData();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public IccoaDkfConstant$BLUETOOTH_KEY_STATUS getBluetoothKeyStatus() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getBluetoothKeyStatus();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public int getBluetoothKeyStatusValue() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getBluetoothKeyStatusValue();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public String getBrandId() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getBrandId();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public ByteString getBrandIdBytes() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getBrandIdBytes();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public long getEndDate() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getEndDate();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public String getFriendlyName() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getFriendlyName();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public ByteString getFriendlyNameBytes() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getFriendlyNameBytes();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public String getImageUrl() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getImageUrl();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public ByteString getImageUrlBytes() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getImageUrlBytes();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public ByteString getKeyId() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getKeyId();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public String getKeyPrivilege() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getKeyPrivilege();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public ByteString getKeyPrivilegeBytes() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getKeyPrivilegeBytes();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public IccoaDkfConstant$KeyType getKeyType() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getKeyType();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public int getKeyTypeValue() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getKeyTypeValue();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public ByteString getOemData() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getOemData();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public long getStartDate() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getStartDate();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public IccoaDkfConstant$KeyStatus getStatus() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getStatus();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public int getStatusValue() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getStatusValue();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public ByteString getVehicleId() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getVehicleId();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public String getVehicleModel() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getVehicleModel();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public ByteString getVehicleModelBytes() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getVehicleModelBytes();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public ByteString getVehicleOemId() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getVehicleOemId();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public IccoaDkfConstant$VehicleProfile getVehicleProfile() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getVehicleProfile();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public ByteString getVehicleProprietaryData() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).getVehicleProprietaryData();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
        public boolean hasVehicleProfile() {
            return ((IccoaDkfConstant$IccoaDkDatabean) this.instance).hasVehicleProfile();
        }

        public Builder mergeVehicleProfile(IccoaDkfConstant$VehicleProfile iccoaDkfConstant$VehicleProfile) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).mergeVehicleProfile(iccoaDkfConstant$VehicleProfile);
            return this;
        }

        public Builder setBluetoothKeyStatus(IccoaDkfConstant$BLUETOOTH_KEY_STATUS iccoaDkfConstant$BLUETOOTH_KEY_STATUS) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setBluetoothKeyStatus(iccoaDkfConstant$BLUETOOTH_KEY_STATUS);
            return this;
        }

        public Builder setBluetoothKeyStatusValue(int i) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setBluetoothKeyStatusValue(i);
            return this;
        }

        public Builder setBrandId(String str) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setBrandId(str);
            return this;
        }

        public Builder setBrandIdBytes(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setBrandIdBytes(byteString);
            return this;
        }

        public Builder setEndDate(long j2) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setEndDate(j2);
            return this;
        }

        public Builder setFriendlyName(String str) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setFriendlyName(str);
            return this;
        }

        public Builder setFriendlyNameBytes(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setFriendlyNameBytes(byteString);
            return this;
        }

        public Builder setImageUrl(String str) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setImageUrl(str);
            return this;
        }

        public Builder setImageUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setImageUrlBytes(byteString);
            return this;
        }

        public Builder setKeyId(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setKeyId(byteString);
            return this;
        }

        public Builder setKeyPrivilege(String str) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setKeyPrivilege(str);
            return this;
        }

        public Builder setKeyPrivilegeBytes(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setKeyPrivilegeBytes(byteString);
            return this;
        }

        public Builder setKeyType(IccoaDkfConstant$KeyType iccoaDkfConstant$KeyType) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setKeyType(iccoaDkfConstant$KeyType);
            return this;
        }

        public Builder setKeyTypeValue(int i) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setKeyTypeValue(i);
            return this;
        }

        public Builder setOemData(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setOemData(byteString);
            return this;
        }

        public Builder setStartDate(long j2) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setStartDate(j2);
            return this;
        }

        public Builder setStatus(IccoaDkfConstant$KeyStatus iccoaDkfConstant$KeyStatus) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setStatus(iccoaDkfConstant$KeyStatus);
            return this;
        }

        public Builder setStatusValue(int i) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setStatusValue(i);
            return this;
        }

        public Builder setVehicleId(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setVehicleId(byteString);
            return this;
        }

        public Builder setVehicleModel(String str) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setVehicleModel(str);
            return this;
        }

        public Builder setVehicleModelBytes(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setVehicleModelBytes(byteString);
            return this;
        }

        public Builder setVehicleOemId(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setVehicleOemId(byteString);
            return this;
        }

        public Builder setVehicleProfile(IccoaDkfConstant$VehicleProfile iccoaDkfConstant$VehicleProfile) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setVehicleProfile(iccoaDkfConstant$VehicleProfile);
            return this;
        }

        public Builder setVehicleProprietaryData(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setVehicleProprietaryData(byteString);
            return this;
        }

        private Builder() {
            super(IccoaDkfConstant$IccoaDkDatabean.DEFAULT_INSTANCE);
        }

        public Builder setVehicleProfile(IccoaDkfConstant$VehicleProfile.Builder builder) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabean) this.instance).setVehicleProfile(builder.build());
            return this;
        }
    }

    static {
        IccoaDkfConstant$IccoaDkDatabean iccoaDkfConstant$IccoaDkDatabean = new IccoaDkfConstant$IccoaDkDatabean();
        DEFAULT_INSTANCE = iccoaDkfConstant$IccoaDkDatabean;
        GeneratedMessageLite.registerDefaultInstance(IccoaDkfConstant$IccoaDkDatabean.class, iccoaDkfConstant$IccoaDkDatabean);
    }

    private IccoaDkfConstant$IccoaDkDatabean() {
        ByteString byteString = ByteString.EMPTY;
        this.vehicleId_ = byteString;
        this.keyId_ = byteString;
        this.friendlyName_ = "";
        this.keyPrivilege_ = "";
        this.vehicleOemId_ = byteString;
        this.brandId_ = "";
        this.vehicleProprietaryData_ = byteString;
        this.oemData_ = byteString;
        this.vehicleModel_ = "";
        this.imageUrl_ = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBluetoothKeyStatus() {
        this.bluetoothKeyStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrandId() {
        this.brandId_ = getDefaultInstance().getBrandId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndDate() {
        this.endDate_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFriendlyName() {
        this.friendlyName_ = getDefaultInstance().getFriendlyName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUrl() {
        this.imageUrl_ = getDefaultInstance().getImageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyId() {
        this.keyId_ = getDefaultInstance().getKeyId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyPrivilege() {
        this.keyPrivilege_ = getDefaultInstance().getKeyPrivilege();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyType() {
        this.keyType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOemData() {
        this.oemData_ = getDefaultInstance().getOemData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartDate() {
        this.startDate_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleId() {
        this.vehicleId_ = getDefaultInstance().getVehicleId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleModel() {
        this.vehicleModel_ = getDefaultInstance().getVehicleModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleOemId() {
        this.vehicleOemId_ = getDefaultInstance().getVehicleOemId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleProfile() {
        this.vehicleProfile_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleProprietaryData() {
        this.vehicleProprietaryData_ = getDefaultInstance().getVehicleProprietaryData();
    }

    public static IccoaDkfConstant$IccoaDkDatabean getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVehicleProfile(IccoaDkfConstant$VehicleProfile iccoaDkfConstant$VehicleProfile) {
        iccoaDkfConstant$VehicleProfile.getClass();
        IccoaDkfConstant$VehicleProfile iccoaDkfConstant$VehicleProfile2 = this.vehicleProfile_;
        if (iccoaDkfConstant$VehicleProfile2 == null || iccoaDkfConstant$VehicleProfile2 == IccoaDkfConstant$VehicleProfile.getDefaultInstance()) {
            this.vehicleProfile_ = iccoaDkfConstant$VehicleProfile;
        } else {
            this.vehicleProfile_ = IccoaDkfConstant$VehicleProfile.newBuilder(this.vehicleProfile_).mergeFrom(iccoaDkfConstant$VehicleProfile).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IccoaDkfConstant$IccoaDkDatabean parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$IccoaDkDatabean) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$IccoaDkDatabean parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$IccoaDkDatabean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IccoaDkfConstant$IccoaDkDatabean> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBluetoothKeyStatus(IccoaDkfConstant$BLUETOOTH_KEY_STATUS iccoaDkfConstant$BLUETOOTH_KEY_STATUS) {
        this.bluetoothKeyStatus_ = iccoaDkfConstant$BLUETOOTH_KEY_STATUS.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBluetoothKeyStatusValue(int i) {
        this.bluetoothKeyStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandId(String str) {
        str.getClass();
        this.brandId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.brandId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndDate(long j2) {
        this.endDate_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFriendlyName(String str) {
        str.getClass();
        this.friendlyName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFriendlyNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.friendlyName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrl(String str) {
        str.getClass();
        this.imageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.imageUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyId(ByteString byteString) {
        byteString.getClass();
        this.keyId_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyPrivilege(String str) {
        str.getClass();
        this.keyPrivilege_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyPrivilegeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.keyPrivilege_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyType(IccoaDkfConstant$KeyType iccoaDkfConstant$KeyType) {
        this.keyType_ = iccoaDkfConstant$KeyType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyTypeValue(int i) {
        this.keyType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOemData(ByteString byteString) {
        byteString.getClass();
        this.oemData_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartDate(long j2) {
        this.startDate_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(IccoaDkfConstant$KeyStatus iccoaDkfConstant$KeyStatus) {
        this.status_ = iccoaDkfConstant$KeyStatus.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusValue(int i) {
        this.status_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleId(ByteString byteString) {
        byteString.getClass();
        this.vehicleId_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleModel(String str) {
        str.getClass();
        this.vehicleModel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleModelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.vehicleModel_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleOemId(ByteString byteString) {
        byteString.getClass();
        this.vehicleOemId_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleProfile(IccoaDkfConstant$VehicleProfile iccoaDkfConstant$VehicleProfile) {
        iccoaDkfConstant$VehicleProfile.getClass();
        this.vehicleProfile_ = iccoaDkfConstant$VehicleProfile;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleProprietaryData(ByteString byteString) {
        byteString.getClass();
        this.vehicleProprietaryData_ = byteString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (j1a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new IccoaDkfConstant$IccoaDkDatabean();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001\n\u0002\n\u0003Ȉ\u0004\u0002\u0005\u0002\u0006Ȉ\u0007\f\b\f\t\n\nȈ\u000b\n\fဉ\u0000\r\f\u000e\n\u000fȈ\u0010Ȉ", new Object[]{"bitField0_", "vehicleId_", "keyId_", "friendlyName_", "startDate_", "endDate_", "keyPrivilege_", "keyType_", "status_", "vehicleOemId_", "brandId_", "vehicleProprietaryData_", "vehicleProfile_", "bluetoothKeyStatus_", "oemData_", "vehicleModel_", "imageUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IccoaDkfConstant$IccoaDkDatabean> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IccoaDkfConstant$IccoaDkDatabean.class) {
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

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public IccoaDkfConstant$BLUETOOTH_KEY_STATUS getBluetoothKeyStatus() {
        IccoaDkfConstant$BLUETOOTH_KEY_STATUS iccoaDkfConstant$BLUETOOTH_KEY_STATUSForNumber = IccoaDkfConstant$BLUETOOTH_KEY_STATUS.forNumber(this.bluetoothKeyStatus_);
        return iccoaDkfConstant$BLUETOOTH_KEY_STATUSForNumber == null ? IccoaDkfConstant$BLUETOOTH_KEY_STATUS.UNRECOGNIZED : iccoaDkfConstant$BLUETOOTH_KEY_STATUSForNumber;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public int getBluetoothKeyStatusValue() {
        return this.bluetoothKeyStatus_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public String getBrandId() {
        return this.brandId_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public ByteString getBrandIdBytes() {
        return ByteString.copyFromUtf8(this.brandId_);
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public long getEndDate() {
        return this.endDate_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public String getFriendlyName() {
        return this.friendlyName_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public ByteString getFriendlyNameBytes() {
        return ByteString.copyFromUtf8(this.friendlyName_);
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public String getImageUrl() {
        return this.imageUrl_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public ByteString getImageUrlBytes() {
        return ByteString.copyFromUtf8(this.imageUrl_);
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public ByteString getKeyId() {
        return this.keyId_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public String getKeyPrivilege() {
        return this.keyPrivilege_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public ByteString getKeyPrivilegeBytes() {
        return ByteString.copyFromUtf8(this.keyPrivilege_);
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public IccoaDkfConstant$KeyType getKeyType() {
        IccoaDkfConstant$KeyType iccoaDkfConstant$KeyTypeForNumber = IccoaDkfConstant$KeyType.forNumber(this.keyType_);
        return iccoaDkfConstant$KeyTypeForNumber == null ? IccoaDkfConstant$KeyType.UNRECOGNIZED : iccoaDkfConstant$KeyTypeForNumber;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public int getKeyTypeValue() {
        return this.keyType_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public ByteString getOemData() {
        return this.oemData_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public long getStartDate() {
        return this.startDate_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public IccoaDkfConstant$KeyStatus getStatus() {
        IccoaDkfConstant$KeyStatus iccoaDkfConstant$KeyStatusForNumber = IccoaDkfConstant$KeyStatus.forNumber(this.status_);
        return iccoaDkfConstant$KeyStatusForNumber == null ? IccoaDkfConstant$KeyStatus.UNRECOGNIZED : iccoaDkfConstant$KeyStatusForNumber;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public int getStatusValue() {
        return this.status_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public ByteString getVehicleId() {
        return this.vehicleId_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public String getVehicleModel() {
        return this.vehicleModel_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public ByteString getVehicleModelBytes() {
        return ByteString.copyFromUtf8(this.vehicleModel_);
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public ByteString getVehicleOemId() {
        return this.vehicleOemId_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public IccoaDkfConstant$VehicleProfile getVehicleProfile() {
        IccoaDkfConstant$VehicleProfile iccoaDkfConstant$VehicleProfile = this.vehicleProfile_;
        return iccoaDkfConstant$VehicleProfile == null ? IccoaDkfConstant$VehicleProfile.getDefaultInstance() : iccoaDkfConstant$VehicleProfile;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public ByteString getVehicleProprietaryData() {
        return this.vehicleProprietaryData_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanOrBuilder
    public boolean hasVehicleProfile() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(IccoaDkfConstant$IccoaDkDatabean iccoaDkfConstant$IccoaDkDatabean) {
        return DEFAULT_INSTANCE.createBuilder(iccoaDkfConstant$IccoaDkDatabean);
    }

    public static IccoaDkfConstant$IccoaDkDatabean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$IccoaDkDatabean) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$IccoaDkDatabean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$IccoaDkDatabean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IccoaDkfConstant$IccoaDkDatabean parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$IccoaDkDatabean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IccoaDkfConstant$IccoaDkDatabean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$IccoaDkDatabean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IccoaDkfConstant$IccoaDkDatabean parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$IccoaDkDatabean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IccoaDkfConstant$IccoaDkDatabean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$IccoaDkDatabean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IccoaDkfConstant$IccoaDkDatabean parseFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$IccoaDkDatabean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$IccoaDkDatabean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$IccoaDkDatabean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$IccoaDkDatabean parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IccoaDkfConstant$IccoaDkDatabean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IccoaDkfConstant$IccoaDkDatabean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$IccoaDkDatabean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
