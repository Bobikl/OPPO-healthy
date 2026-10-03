package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.accessory.pair.provider.ProtocolEventManager;

/* JADX INFO: loaded from: classes19.dex */
@Entity(primaryKeys = {ProtocolEventManager.Event.MAC_ADDRESS, "blocked_id"}, tableName = "blocked_lite")
public class m15 implements yr9 {

    @NonNull
    @ColumnInfo(name = ProtocolEventManager.Event.MAC_ADDRESS)
    public String a;

    @ColumnInfo(name = "blocked_id")
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ColumnInfo(name = "status")
    public int f13903c;

    @ColumnInfo(name = "original_number")
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ColumnInfo(name = "status_modify_time")
    public long f13904e;

    public m15(@NonNull String str, long j2) {
        this.a = str;
        this.b = j2;
    }

    @Override // com.oplus.aiunit.vision.yr9
    public void a(int i) {
        this.f13903c = i;
    }

    @Override // com.oplus.aiunit.vision.yr9
    public void b(long j2) {
        this.f13904e = j2;
    }

    public long c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.d;
    }

    public long f() {
        return this.f13904e;
    }

    public void g(String str) {
        this.d = str;
    }

    @Override // com.oplus.aiunit.vision.yr9
    public int getStatus() {
        return this.f13903c;
    }

    public String toString() {
        return "DbBlockedLite{blockedId=" + this.b + ", status=" + this.f13903c + '}';
    }
}
