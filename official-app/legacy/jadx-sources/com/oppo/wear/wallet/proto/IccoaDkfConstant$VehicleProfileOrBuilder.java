package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface IccoaDkfConstant$VehicleProfileOrBuilder extends MessageLiteOrBuilder {
    String getCardImgResId();

    ByteString getCardImgResIdBytes();

    IccoaDkfConstant$KeyAccessProfile getKeyAccessProfiles(int i);

    int getKeyAccessProfilesCount();

    List<IccoaDkfConstant$KeyAccessProfile> getKeyAccessProfilesList();

    IccoaDkfConstant$PassiveEntry getPassiveEntries(int i);

    int getPassiveEntriesCount();

    List<IccoaDkfConstant$PassiveEntry> getPassiveEntriesList();

    IccoaDkfConstant$RkeFunction getRkeFunctions(int i);

    int getRkeFunctionsCount();

    List<IccoaDkfConstant$RkeFunction> getRkeFunctionsList();

    int getShareLimit();

    String getVehicleModel();

    ByteString getVehicleModelBytes();
}
