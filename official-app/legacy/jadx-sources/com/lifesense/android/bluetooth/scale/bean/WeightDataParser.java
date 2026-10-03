package com.lifesense.android.bluetooth.scale.bean;

import com.lifesense.android.bluetooth.core.bean.BaseDeviceProperty;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;

/* JADX INFO: loaded from: classes4.dex */
public class WeightDataParser {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PacketProfile.values().length];
            a = iArr;
            try {
                iArr[PacketProfile.RECEIVE_USER_INFO_TO_WEIGHT_FOR_A6.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[PacketProfile.RECEIVE_TARGET_TO_WEIGHT_FOR_A6.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[PacketProfile.RECEIVE_UNIT_TO_WEIGHT_FOR_A6.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static BaseDeviceProperty parseDeviceSettingForA6(PacketProfile packetProfile, byte[] bArr, LsDeviceInfo lsDeviceInfo) {
        int i = a.a[packetProfile.ordinal()];
        if (i == 1) {
            return WeightUserInfo.fromBytes(bArr, lsDeviceInfo);
        }
        if (i == 2) {
            return WeightScaleTarget.fromBytes(bArr, lsDeviceInfo);
        }
        if (i != 3) {
            return null;
        }
        return WeightScaleUnit.fromBytes(bArr, lsDeviceInfo);
    }
}
