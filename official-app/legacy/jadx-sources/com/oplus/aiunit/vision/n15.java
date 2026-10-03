package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.accessory.pair.provider.ProtocolEventManager;

/* JADX INFO: loaded from: classes19.dex */
@Entity(primaryKeys = {ProtocolEventManager.Event.MAC_ADDRESS, "calls_id"}, tableName = "calls_lite")
public class n15 implements yr9 {

    @NonNull
    @ColumnInfo(name = ProtocolEventManager.Event.MAC_ADDRESS)
    public String a;

    @ColumnInfo(name = "calls_id")
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ColumnInfo(name = "number")
    public String f14288c;

    @ColumnInfo(name = "date")
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ColumnInfo(name = "last_modified")
    public long f14289e;

    @ColumnInfo(name = "status")
    public int f;

    @ColumnInfo(name = "status_modify_time")
    public long g;

    public n15(@NonNull String str, long j2) {
        this.a = str;
        this.b = j2;
    }

    @Override // com.oplus.aiunit.vision.yr9
    public void a(int i) {
        this.f = i;
    }

    @Override // com.oplus.aiunit.vision.yr9
    public void b(long j2) {
        this.g = j2;
    }

    public long c() {
        return this.d;
    }

    public long d() {
        return this.b;
    }

    public long e() {
        return this.f14289e;
    }

    public String f() {
        return this.a;
    }

    public String g() {
        return this.f14288c;
    }

    @Override // com.oplus.aiunit.vision.yr9
    public int getStatus() {
        return this.f;
    }

    public long h() {
        return this.g;
    }

    public void i(long j2) {
        this.d = j2;
    }

    public void j(long j2) {
        this.f14289e = j2;
    }

    public void k(String str) {
        this.f14288c = str;
    }

    public String toString() {
        return "DbCallsLite{id=" + this.b + ", lastModified=" + this.f14289e + ", status=" + this.f + '}';
    }
}
