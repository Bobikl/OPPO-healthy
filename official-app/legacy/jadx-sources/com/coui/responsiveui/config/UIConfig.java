package com.coui.responsiveui.config;

import com.oplus.aiunit.vision.ffk;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class UIConfig {
    public Status a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ffk f2195c;
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

    public UIConfig(Status status, ffk ffkVar, int i, WindowType windowType) {
        this.a = status;
        this.f2195c = ffkVar;
        this.b = i;
        this.d = windowType;
    }

    public int a() {
        return this.b;
    }

    public ffk b() {
        return this.f2195c;
    }

    public Status c() {
        return this.a;
    }

    public WindowType d() {
        return this.d;
    }

    public void e(ffk ffkVar) {
        this.f2195c = ffkVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UIConfig uIConfig = (UIConfig) obj;
        return this.b == uIConfig.b && this.a == uIConfig.a && Objects.equals(this.f2195c, uIConfig.f2195c);
    }

    public void f(Status status) {
        this.a = status;
    }

    public void g(WindowType windowType) {
        this.d = windowType;
    }

    public int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.f2195c);
    }

    public String toString() {
        return "UIConfig{mStatus= " + this.a + ", mOrientation=" + this.b + ", mScreenSize=" + this.f2195c + ", mWindowType=" + this.d + "}";
    }
}
