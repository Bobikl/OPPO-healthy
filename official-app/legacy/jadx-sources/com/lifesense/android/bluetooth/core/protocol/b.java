package com.lifesense.android.bluetooth.core.protocol;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import com.lifesense.android.bluetooth.core.OnDeviceUpgradeListener;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceUpgradeStatus;
import com.lifesense.android.bluetooth.core.bean.constant.ErrorCode;
import java.io.File;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"UseSparseArrays"})
public final class b extends c {
    public static final boolean LOG_ALL_UPGRADE_FILE_DATA_PERMISSION = false;
    public static b a;

    public static boolean a(LsDeviceInfo lsDeviceInfo) {
        return lsDeviceInfo != null && StringUtils.isNotEmpty(lsDeviceInfo.getDeviceType()) && StringUtils.isNotEmpty(lsDeviceInfo.getMacAddress());
    }

    public static b getInstance() {
        b bVar = a;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        a = bVar2;
        return bVar2;
    }

    public String d(String str) {
        if (str == null || !c.marshalModelNumber.containsKey(str)) {
            return null;
        }
        return c.marshalModelNumber.get(str);
    }

    @SuppressLint({"DefaultLocale"})
    public boolean a(String str, File file, OnDeviceUpgradeListener onDeviceUpgradeListener) {
        com.lifesense.android.bluetooth.core.business.log.b generalLogInfo;
        DeviceUpgradeStatus deviceUpgradeStatus;
        ErrorCode errorCode;
        if (BluetoothAdapter.checkBluetoothAddress(str)) {
            if (file != null && file.isFile() && file.exists()) {
                String upperCase = file.getName().toUpperCase();
                for (String str2 : d.UPGRADE_FILE_NAME_SUFFIXS) {
                    if (upperCase.endsWith(str2)) {
                        return true;
                    }
                }
                generalLogInfo = getGeneralLogInfo(null, "failed to send upgrade request,file name is invalid..." + upperCase, com.lifesense.android.bluetooth.core.business.log.report.a.Upgrade_Message, null, false);
            } else {
                generalLogInfo = getGeneralLogInfo(null, "failed to send upgrade request,upgrade file is invalid...", com.lifesense.android.bluetooth.core.business.log.report.a.Upgrade_Message, null, false);
            }
            printLogMessage(generalLogInfo);
            deviceUpgradeStatus = DeviceUpgradeStatus.UPGRADE_FAILURE;
            errorCode = ErrorCode.FILE_FORMAT_ERROR_CODE;
        } else {
            printLogMessage(getGeneralLogInfo(null, "failed to send upgrade request,mac address is invalid..." + str, com.lifesense.android.bluetooth.core.business.log.report.a.Upgrade_Message, null, false));
            deviceUpgradeStatus = DeviceUpgradeStatus.UPGRADE_FAILURE;
            errorCode = ErrorCode.PARAMETER_ERROR_CODE;
        }
        onDeviceUpgradeListener.onDeviceUpgradeStateChange(str, deviceUpgradeStatus, errorCode.getCode());
        return false;
    }
}
