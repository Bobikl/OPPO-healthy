package com.lifesense.plugin.ble.data;

import com.amap.api.services.core.AMapException;

/* JADX INFO: loaded from: classes5.dex */
public enum LSErrorCode {
    Unknown(-1, AMapException.AMAP_CLIENT_UNKNOWN_ERROR),
    Uninitialized(-2, "未初始化"),
    ParameterError(1, "参数错误"),
    FileFormatError(2, "文件格式错误"),
    ManagerStateError(5, "工作状态错误"),
    DeviceNotConnected(7, "设备未连接"),
    DeviceUnsupported(8, "设备不支持"),
    FileVerificationFailed(9, "文件校验失败"),
    ConfirmTimeout(10, "文件块确认超时"),
    LowBattery(11, "电量不足"),
    VersionNotMatch(12, "代码版本不匹配"),
    FileHeaderError(13, "文件头信息校验失败"),
    FlashSaveFailed(14, "Flash保存失败"),
    ScanTimeout(15, "扫描超时"),
    ConnectFailed(16, "连接失败"),
    ConnectTimeout(21, "连接超时"),
    BluetoothUnavailable(23, "蓝牙不可用"),
    AbnormalDisconnect(24, "异常断开"),
    WriteDataTimeout(25, "写数据超时"),
    UserCancel(26, "用户主动取消"),
    SettingTimeout(28, "设置超时"),
    FileUpdating(30, "文件更新过程，拒绝消息提醒或其他设置指令");

    private int code;
    private String msg;

    LSErrorCode(int i, String str) {
        this.code = i;
        this.msg = str;
    }

    public static LSErrorCode toErrorCode(int i) {
        for (LSErrorCode lSErrorCode : values()) {
            if (lSErrorCode.getCode() == i) {
                return lSErrorCode;
            }
        }
        return Unknown;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMsg(String str) {
        this.msg = str;
    }
}
