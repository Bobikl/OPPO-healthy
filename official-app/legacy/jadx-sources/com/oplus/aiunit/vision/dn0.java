package com.oplus.aiunit.vision;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.heytap.accessory.pair.provider.ProtocolEventManager;
import com.heytap.health.settings.me.settings2.permission.PermissionDetailAct;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.TriggerEvent;

/* JADX INFO: loaded from: classes19.dex */
@Entity(tableName = "a_e")
public class dn0 {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public int a;

    @ColumnInfo(name = ProtocolEventManager.Event.AUTH_CODE)
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ColumnInfo(name = "is_enable")
    public boolean f10629c;

    @ColumnInfo(name = TriggerEvent.EXTRA_UID)
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ColumnInfo(name = "packageName")
    public String f10630e;

    @ColumnInfo(name = "capability_name")
    public String f;

    @ColumnInfo(name = "expiration")
    public long g;

    @ColumnInfo(name = PermissionDetailAct.PERMISSION)
    public byte[] h;

    @ColumnInfo(name = "last_update_time")
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @ColumnInfo(name = "cache_time")
    public long f10631j;

    public dn0(String str, boolean z, int i, String str2, String str3, long j2, byte[] bArr, long j3, long j4) {
        this.b = str;
        this.f10629c = z;
        this.d = i;
        this.f10630e = str2;
        this.f = str3;
        this.g = j2;
        this.h = bArr;
        this.i = j3;
        this.f10631j = j4;
    }

    public String a() {
        return this.b;
    }

    public long b() {
        return this.f10631j;
    }

    public String c() {
        return this.f;
    }

    public long d() {
        return this.g;
    }

    public int e() {
        return this.a;
    }

    public long f() {
        return this.i;
    }

    public String g() {
        return this.f10630e;
    }

    public byte[] h() {
        return this.h;
    }

    public int i() {
        return this.d;
    }

    public boolean j() {
        return this.f10629c;
    }

    public void k(int i) {
        this.a = i;
    }
}
