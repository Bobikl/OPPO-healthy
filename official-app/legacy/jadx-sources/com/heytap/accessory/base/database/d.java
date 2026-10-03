package com.heytap.accessory.base.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.oplus.aiunit.vision.y15;

/* JADX INFO: loaded from: classes14.dex */
@Entity(indices = {@Index(unique = true, value = {"agentId", "channelId"})}, tableName = "ChannelDescription")
public class d {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    public int a;

    @ColumnInfo(name = "channelId")
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ColumnInfo(name = "class")
    public int f2444c;

    @ColumnInfo(name = "priority")
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ColumnInfo(name = y15.PARAMS_DATA_TYPE)
    public int f2445e;

    @ColumnInfo(name = "agentId")
    public long f;

    public void a(int i) {
        this.b = i;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.f2444c;
    }

    public void d(int i) {
        this.a = i;
    }

    public int e() {
        return this.a;
    }

    public int f() {
        return this.d;
    }

    public String toString() {
        return "ChannelDescriptionDbBean{mId=" + this.a + ", mChannelId=" + this.b + ", mClazz=" + this.f2444c + ", mPriority=" + this.d + ", mDataType=" + this.f2445e + ", mAgentId=" + this.f + '}';
    }

    public long a() {
        return this.f;
    }

    public void b(int i) {
        this.f2444c = i;
    }

    public void c(int i) {
        this.f2445e = i;
    }

    public int d() {
        return this.f2445e;
    }

    public void e(int i) {
        this.d = i;
    }

    public void a(long j2) {
        this.f = j2;
    }
}
