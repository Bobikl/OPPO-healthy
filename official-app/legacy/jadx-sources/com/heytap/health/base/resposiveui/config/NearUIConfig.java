package com.heytap.health.base.resposiveui.config;

import com.oplus.aiunit.vision.slc;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public class NearUIConfig {
    public Status a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public slc f3203c;
    public WindowType d;

    public enum Status {
        FOLD("fd"),
        UNFOLDING("fding"),
        UNFOLD("ufd"),
        UNKNOWN("unknown");

        private String mName;

        Status(String str) {
            this.mName = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mName;
        }
    }

    public enum WindowType {
        SMALL,
        MEDIUM,
        LARGE
    }

    public NearUIConfig(Status status, slc slcVar, int i, WindowType windowType) {
        this.a = status;
        this.f3203c = slcVar;
        this.b = i;
        this.d = windowType;
    }

    public int a() {
        return this.b;
    }

    public slc b() {
        return this.f3203c;
    }

    public Status c() {
        return this.a;
    }

    public void d(slc slcVar) {
        this.f3203c = slcVar;
    }

    public void e(Status status) {
        this.a = status;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NearUIConfig nearUIConfig = (NearUIConfig) obj;
        return this.b == nearUIConfig.b && this.a == nearUIConfig.a && Objects.equals(this.f3203c, nearUIConfig.f3203c);
    }

    public void f(WindowType windowType) {
        this.d = windowType;
    }

    public int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.f3203c);
    }

    public String toString() {
        return "UIConfig{mStatus= " + this.a + ", mOrientation=" + this.b + ", mScreenSize=" + this.f3203c + ", mWindowType=" + this.d + "}";
    }
}
