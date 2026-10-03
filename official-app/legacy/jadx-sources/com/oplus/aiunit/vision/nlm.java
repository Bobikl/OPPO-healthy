package com.oplus.aiunit.vision;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.heytap.accessory.pair.provider.ProtocolEventManager;
import com.heytap.health.settings.me.settings2.permission.PermissionDetailAct;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.TriggerEvent;

/* JADX INFO: loaded from: classes8.dex */
@Entity(indices = {@Index({TriggerEvent.EXTRA_UID, "capability_name"})}, tableName = "a_e")
public final class nlm {

    @PrimaryKey(autoGenerate = true)
    public int a;

    @ColumnInfo(name = ProtocolEventManager.Event.AUTH_CODE)
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ColumnInfo(name = "is_enable")
    public boolean f14552c;

    @ColumnInfo(name = TriggerEvent.EXTRA_UID)
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ColumnInfo(name = "capability_name")
    public String f14553e;

    @ColumnInfo(name = "expiration")
    public long f;

    @ColumnInfo(name = PermissionDetailAct.PERMISSION)
    public byte[] g;

    @ColumnInfo(name = "last_update_time")
    public long h;

    @ColumnInfo(name = "cache_time")
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @ColumnInfo(name = "pid")
    public int f14554j;

    public nlm(String str, boolean z, int i, String str2, long j2, byte[] bArr, long j3, long j4, int i2) {
        this.b = str;
        this.f14552c = z;
        this.d = i;
        this.f14553e = str2;
        this.f = j2;
        this.g = bArr;
        this.h = j3;
        this.i = j4;
        this.f14554j = i2;
    }
}
