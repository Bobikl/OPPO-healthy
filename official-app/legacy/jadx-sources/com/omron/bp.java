package com.omron;

import android.support.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class bp {

    @Nullable
    private Map<dx, Object> a;

    @Nullable
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Integer f8847c;

    @Nullable
    private Map<dy, Object> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Long f8848e;

    @Nullable
    private Integer f;

    @Nullable
    private List<Map<dw, Object>> g;

    @Nullable
    private Cdo h;

    @Nullable
    private ds i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private String f8849j;

    @Nullable
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private String f8850l;

    @Nullable
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private String f8851n;

    @Nullable
    private String o;

    @Nullable
    private Integer p;

    @Nullable
    public Integer a() {
        return this.p;
    }

    @Nullable
    public Cdo b() {
        return this.h;
    }

    @Nullable
    public String c() {
        return this.b;
    }

    @Nullable
    public Long d() {
        return this.f8848e;
    }

    @Nullable
    public String e() {
        return this.f8850l;
    }

    @Nullable
    public String f() {
        return this.m;
    }

    @Nullable
    public String g() {
        return this.o;
    }

    @Nullable
    public List<Map<dw, Object>> h() {
        return this.g;
    }

    @Nullable
    public String i() {
        return this.f8849j;
    }

    @Nullable
    public Integer j() {
        return this.f;
    }

    @Nullable
    public String k() {
        return this.k;
    }

    @Nullable
    public String l() {
        return this.f8851n;
    }

    @Nullable
    public Map<dy, Object> m() {
        return this.d;
    }

    public String toString() {
        return "SessionData{option=" + this.a + ", currentTime='" + this.b + "', userIndex=" + this.f8847c + ", userData=" + this.d + ", databaseChangeIncrement=" + this.f8848e + ", sequenceNumberOfLatestRecord=" + this.f + ", measurementRecords=" + this.g + ", completionReason=" + this.h + ", deviceCategory=" + this.i + ", modelName='" + this.f8849j + "', serialNumber='" + this.k + "', firmwareRevision='" + this.f8850l + "', hardwareRevision='" + this.m + "', softwareRevision='" + this.f8851n + "', manufacturerName='" + this.o + "', batteryLevel=" + this.p + '}';
    }

    public void a(@Nullable Cdo cdo) {
        this.h = cdo;
    }

    public void b(@Nullable Integer num) {
        this.f = num;
    }

    public void c(@Nullable Integer num) {
        this.f8847c = num;
    }

    public void d(@Nullable String str) {
        this.o = str;
    }

    public void e(@Nullable String str) {
        this.f8849j = str;
    }

    public void f(@Nullable String str) {
        this.k = str;
    }

    public void g(@Nullable String str) {
        this.f8851n = str;
    }

    public void a(@Nullable ds dsVar) {
        this.i = dsVar;
    }

    public void b(@Nullable String str) {
        this.f8850l = str;
    }

    public void c(@Nullable String str) {
        this.m = str;
    }

    public void a(@Nullable Integer num) {
        this.p = num;
    }

    public void b(@Nullable Map<dy, Object> map) {
        this.d = map;
    }

    public void a(@Nullable Long l2) {
        this.f8848e = l2;
    }

    public void a(@Nullable String str) {
        this.b = str;
    }

    public void a(@Nullable List<Map<dw, Object>> list) {
        this.g = list;
    }

    public void a(@Nullable Map<dx, Object> map) {
        this.a = map;
    }
}
