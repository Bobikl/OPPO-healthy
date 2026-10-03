package com.omron.lib.common;

/* JADX INFO: loaded from: classes5.dex */
public enum OMRONBLEErrMsg {
    OMRON_SDK_UnOpenBlueTooth(1, "蓝牙未开启,请开启蓝牙"),
    OMRON_BLE_ERROR_NOT_SUPPORT(2, "该设备不支持蓝牙"),
    OMRON_SDK_NoDevice(3, "扫描超时"),
    OMRON_SDK_InValidKey(4, "厂商ID 无效"),
    OMRON_SDK_ConnectFail(5, "连接失败"),
    OMRON_SDK_UnBind(6, "请先绑定正确的设备"),
    OMRON_SDK_UnRegister(7, "未注册"),
    OMRON_SDK_NoNet(8, "请在网络连接状态下进行操作"),
    OMRON_SDK_BindFail(9, "绑定失败"),
    OMRON_SDK_TRANSFERFAIL(10, "未找到设备同步失败"),
    OMRON_SDK_ADDRESS_EMPTY(11, "设备地址不存在"),
    OMRON_SDK_INVALID_DEVICE_ADDRESS(12, "无效的设备地址"),
    OMRON_BLE_ERROR_DEVICE_CAN_NOT_CONNECT(13, "无法与目标设备建立连接"),
    OMRON_BLE_ERROR_DEVICE_NOT_CONNECT(14, "设备未连接"),
    OMRON_BLE_ERROR_DEVICE_NOT_SUPPORT(15, "设备不支持该功能"),
    OMRON_BLE_ERROR_DEVICE_DISCOVER_SERVICE(16, "无法获取设备服务"),
    OMRON_BLE_ERROR_DEVICE_READ_ChARACTERISTIC(16, "无法读取信息"),
    OMRON_BLE_ERROR_DEVICE_WRITE_DESCRIPTOR(17, "无法更改描述"),
    OMRON_BLE_ERROR_DEVICE_BOND_FAILED(18, "配对失败"),
    OMRON_BLE_ERROR_PERMISSION_BLE(19, "需要打开附近的设备权限"),
    OMRON_BLE_ERROR_SYNC_EMPTY(20, "已同步至最新数据"),
    OMRON_BLE_ERROR_DEVICE_CATEGORY_NOT_SUPPORT(21, "不支持该设备类别"),
    OMRON_BLE_ERROR_DEVICE_TYPE_NOT_SUPPORT(22, "不支持该设备型号"),
    OMRON_BLE_ERROR_DEVICE_BOND_STATE_ERROR(23, "绑定状态错误，请在蓝牙列表中取消配对后再试"),
    OMRON_BLE_ERROR_DEVICE_TYPE_EXPIRATION(24, "设备已过期，请延长使用期后继续使用");

    final int mErrCode;
    final String mErrMsg;

    OMRONBLEErrMsg(int i, String str) {
        this.mErrCode = i;
        this.mErrMsg = str;
    }

    public int getErrCode() {
        return this.mErrCode;
    }

    public String getErrMsg() {
        return this.mErrMsg;
    }
}
