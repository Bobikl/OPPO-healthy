package com.oplus.aiunit.vision;

import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class d6e {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10402c;

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public void c(String str) {
        this.b = str;
    }

    public void d(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.b, ((d6e) obj).b);
    }

    public int hashCode() {
        return Objects.hash(this.b);
    }

    public String toString() {
        return "PairDeviceInfo{deviceName='" + this.a + "', deviceMac='" + this.b + "', deviceType=" + this.f10402c + '}';
    }
}
