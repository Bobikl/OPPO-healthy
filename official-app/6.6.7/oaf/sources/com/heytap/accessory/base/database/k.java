package com.heytap.accessory.base.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.heytap.accessory.constant.Constants;
import com.heytap.accessory.logging.SensitiveLogUtils;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Entity(indices = {@Index(unique = true, value = {Constants.EXTRA_DEVICE_ID, "alias"})}, tableName = "ksc_info")
public class k {

    @ColumnInfo(name = Constants.EXTRA_DEVICE_ID)
    public String a;

    @ColumnInfo(name = "alias")
    public String b;

    @PrimaryKey(autoGenerate = true)
    public int c;

    @ColumnInfo(name = "ksc")
    public String d;

    @ColumnInfo(name = "iv")
    public String e;

    @ColumnInfo(name = "date")
    public long f;

    public String toString() {
        return "EncryptedKscInfo{deviceId = '" + SensitiveLogUtils.toHiddenIfNeed(this.a) + "', alias = " + SensitiveLogUtils.toHiddenIfNeed(this.b) + ", iv = " + SensitiveLogUtils.toHiddenIfNeed(this.e) + ", encryptedKsc = '" + SensitiveLogUtils.toHiddenIfNeed(this.d) + "', date = '" + SensitiveLogUtils.toHiddenIfNeed(this.f) + "'}";
    }
}
