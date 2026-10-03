package com.heytap.accessory.base.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.heytap.accessory.logging.SensitiveLogUtils;

/* JADX INFO: loaded from: classes14.dex */
@Entity(indices = {@Index(unique = true, value = {"deviceId", "alias"})}, tableName = "ksc_info")
public class k {

    @ColumnInfo(name = "deviceId")
    public String a;

    @ColumnInfo(name = "alias")
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @PrimaryKey(autoGenerate = true)
    public int f2449c;

    @ColumnInfo(name = "ksc")
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ColumnInfo(name = "iv")
    public String f2450e;

    @ColumnInfo(name = "date")
    public long f;

    public String toString() {
        return "EncryptedKscInfo{deviceId = '" + SensitiveLogUtils.toHiddenIfNeed(this.a) + "', alias = " + SensitiveLogUtils.toHiddenIfNeed(this.b) + ", iv = " + SensitiveLogUtils.toHiddenIfNeed(this.f2450e) + ", encryptedKsc = '" + SensitiveLogUtils.toHiddenIfNeed(this.d) + "', date = '" + SensitiveLogUtils.toHiddenIfNeed(this.f) + "'}";
    }
}
