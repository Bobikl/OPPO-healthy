package com.heytap.accessory.base.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Entity(indices = {@Index(unique = true, value = {"agentId", "channelId"})}, tableName = "ChannelDescription")
public class d {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    public int a;

    @ColumnInfo(name = "channelId")
    public int b;

    @ColumnInfo(name = "class")
    public int c;

    @ColumnInfo(name = "priority")
    public int d;

    @ColumnInfo(name = "dataType")
    public int e;

    @ColumnInfo(name = "agentId")
    public long f;

    public void a(int i) {
        this.b = i;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
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
        return "ChannelDescriptionDbBean{mId=" + this.a + ", mChannelId=" + this.b + ", mClazz=" + this.c + ", mPriority=" + this.d + ", mDataType=" + this.e + ", mAgentId=" + this.f + '}';
    }

    public long a() {
        return this.f;
    }

    public void b(int i) {
        this.c = i;
    }

    public void c(int i) {
        this.e = i;
    }

    public int d() {
        return this.e;
    }

    public void e(int i) {
        this.d = i;
    }

    public void a(long j) {
        this.f = j;
    }
}
