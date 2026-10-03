package com.oplus.aiunit.vision;

import com.heytap.health.device_settings.health.SportHealthSetting;

/* JADX INFO: loaded from: classes18.dex */
public class h6g {
    public SportHealthSetting a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12027c;

    public h6g(SportHealthSetting sportHealthSetting, String str, int i) {
        this.a = sportHealthSetting;
        this.b = str;
        this.f12027c = i;
    }

    public int a() {
        return this.f12027c;
    }

    public String b() {
        return this.b;
    }

    public String toString() {
        return "SHSBean{type=" + this.a + ", value='" + this.b + "', modifyTime=" + this.f12027c + '}';
    }
}
