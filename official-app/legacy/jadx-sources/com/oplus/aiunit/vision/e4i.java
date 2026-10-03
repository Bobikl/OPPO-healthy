package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.SpaceCardMetaData;
import com.heytap.databaseengine.model.SpaceInfo;

/* JADX INFO: loaded from: classes16.dex */
public class e4i {
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10782c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SpaceInfo f10783e;
    public SpaceCardMetaData f;
    public String g;
    public int h = 99;

    public int a() {
        return this.d;
    }

    public SpaceCardMetaData b() {
        return this.f;
    }

    public int c() {
        return this.h;
    }

    public int d() {
        return this.f10782c;
    }

    public SpaceInfo e() {
        return this.f10783e;
    }

    public int f() {
        return this.a;
    }

    public void g(String str) {
        this.g = str;
    }

    public void h(int i) {
        this.b = i;
    }

    public void i(int i) {
        this.d = i;
    }

    public void j(SpaceCardMetaData spaceCardMetaData) {
        this.f = spaceCardMetaData;
    }

    public void k(int i) {
        this.f10782c = i;
    }

    public void l(SpaceInfo spaceInfo) {
        this.f10783e = spaceInfo;
    }

    public void m(int i) {
        this.a = i;
    }

    public String toString() {
        return "SpaceBiBean{topLocation=" + this.a + ", bottomLocation=" + this.b + ", position=" + this.f10782c + ", childPosition=" + this.d + ", spaceInfo=" + this.f10783e + ", metaData=" + this.f + ", biEventCode='" + this.g + "', moduleId=" + this.h + '}';
    }
}
