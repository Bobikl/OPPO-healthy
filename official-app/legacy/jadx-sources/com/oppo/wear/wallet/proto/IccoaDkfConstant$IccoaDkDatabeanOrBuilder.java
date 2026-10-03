package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes9.dex */
public interface IccoaDkfConstant$IccoaDkDatabeanOrBuilder extends MessageLiteOrBuilder {
    IccoaDkfConstant$BLUETOOTH_KEY_STATUS getBluetoothKeyStatus();

    int getBluetoothKeyStatusValue();

    String getBrandId();

    ByteString getBrandIdBytes();

    long getEndDate();

    String getFriendlyName();

    ByteString getFriendlyNameBytes();

    String getImageUrl();

    ByteString getImageUrlBytes();

    ByteString getKeyId();

    String getKeyPrivilege();

    ByteString getKeyPrivilegeBytes();

    IccoaDkfConstant$KeyType getKeyType();

    int getKeyTypeValue();

    ByteString getOemData();

    long getStartDate();

    IccoaDkfConstant$KeyStatus getStatus();

    int getStatusValue();

    ByteString getVehicleId();

    String getVehicleModel();

    ByteString getVehicleModelBytes();

    ByteString getVehicleOemId();

    IccoaDkfConstant$VehicleProfile getVehicleProfile();

    ByteString getVehicleProprietaryData();

    boolean hasVehicleProfile();
}
