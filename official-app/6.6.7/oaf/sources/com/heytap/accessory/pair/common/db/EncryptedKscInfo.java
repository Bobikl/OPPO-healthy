package com.heytap.accessory.pair.common.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.heytap.accessory.constant.Constants;
import com.heytap.accessory.pair.logging.SensitiveLogUtils;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Entity(indices = {@Index(unique = true, value = {Constants.EXTRA_DEVICE_ID, "alias"})}, tableName = "ksc_info")
public class EncryptedKscInfo {

    @ColumnInfo(name = "alias")
    public String alias;

    @PrimaryKey(autoGenerate = true)
    public int autoId;

    @ColumnInfo(name = "date")
    public long date;

    @ColumnInfo(name = Constants.EXTRA_DEVICE_ID)
    public String deviceId;

    @ColumnInfo(name = "ksc")
    public String encryptedKsc;

    @ColumnInfo(name = "iv")
    public String iv;

    public String toString() {
        return "EncryptedKscInfo{deviceId = '" + SensitiveLogUtils.toHiddenIfNeed(this.deviceId) + "', alias = " + SensitiveLogUtils.toHiddenIfNeed(this.alias) + ", iv = " + SensitiveLogUtils.toHiddenIfNeed(this.iv) + ", encryptedKsc = '" + SensitiveLogUtils.toHiddenIfNeed(this.encryptedKsc) + "', date = '" + SensitiveLogUtils.toHiddenIfNeed(this.date) + "'}";
    }
}
