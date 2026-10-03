package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.accessory.pair.provider.ProtocolEventManager;
import java.util.Date;

/* JADX INFO: loaded from: classes19.dex */
@Entity(primaryKeys = {ProtocolEventManager.Event.MAC_ADDRESS, "contact_id"}, tableName = "contact_lite")
public class r15 implements yr9 {

    @NonNull
    @ColumnInfo(name = ProtocolEventManager.Event.MAC_ADDRESS)
    public String a;

    @ColumnInfo(name = "contact_id")
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ColumnInfo(name = "contact_last_updated_timestamp")
    public long f16013c;

    @ColumnInfo(name = "contact_last_md5")
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ColumnInfo(name = "status")
    public int f16014e;

    @ColumnInfo(name = "status_modify_time")
    public long f;

    public r15(@NonNull String str, long j2) {
        this.a = str;
        this.b = j2;
    }

    @Override // com.oplus.aiunit.vision.yr9
    public void a(int i) {
        this.f16014e = i;
    }

    @Override // com.oplus.aiunit.vision.yr9
    public void b(long j2) {
        this.f = j2;
    }

    public long c() {
        return this.b;
    }

    public String d() {
        return this.d;
    }

    public long e() {
        return this.f16013c;
    }

    public String f() {
        return this.a;
    }

    public long g() {
        return this.f;
    }

    @Override // com.oplus.aiunit.vision.yr9
    public int getStatus() {
        return this.f16014e;
    }

    public void h(String str) {
        this.d = str;
    }

    public void i(long j2) {
        this.f16013c = j2;
    }

    public String toString() {
        return "DbContactLite{contactId=" + this.b + ", contactLastUpdatedTimestamp=" + new Date(this.f16013c) + ", status='" + this.f16014e + "', statusModifyTime=" + new Date(this.f) + '}';
    }
}
