package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class j38 {
    public static final j38 d = new j38(true, null, null);
    public final boolean a;

    @Nullable
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f12743c;

    public j38(boolean z, @Nullable String str, @Nullable String str2) {
        this.a = z;
        this.b = str;
        this.f12743c = str2;
    }

    @NonNull
    public static j38 a(@NonNull String str, @NonNull String str2) {
        return new j38(false, str, str2);
    }

    @NonNull
    public static j38 e() {
        return d;
    }

    @Nullable
    public String b() {
        return this.f12743c;
    }

    public boolean c() {
        return !this.a;
    }

    public boolean d() {
        return this.a;
    }

    public String toString() {
        if (this.a) {
            return "GateResult{PASS}";
        }
        return "GateResult{BLOCKED by " + this.b + ": " + this.f12743c + "}";
    }
}
