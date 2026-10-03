package com.oplus.drs.core.upload;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.opa;
import com.oplus.aiunit.vision.tpe;
import com.oplus.aiunit.vision.w56;
import com.oplus.aiunit.vision.z6b;

/* JADX INFO: loaded from: classes6.dex */
public final class AppServerDirectiveStore {
    public final opa a;

    public enum DirectiveType {
        NONE,
        REJECTED,
        BACKOFF
    }

    public static final class a {

        @NonNull
        public static final a NONE = new a(DirectiveType.NONE, 0, 0, 0);

        @NonNull
        public final DirectiveType a;
        public final long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f19798c;
        public final int d;

        public boolean a() {
            return this.a != DirectiveType.NONE && this.f19798c > 0;
        }

        public a(@NonNull DirectiveType directiveType, long j2, long j3, int i) {
            this.a = directiveType;
            this.b = Math.max(0L, j2);
            this.f19798c = Math.max(0L, j3);
            this.d = Math.max(0, i);
        }
    }

    public AppServerDirectiveStore(Context context) {
        this.a = tpe.h(context == null ? w56.h() : context, "upload_app_blocklist");
    }

    public static String e(String str) {
        return "last_seen_" + str;
    }

    public static String f(String str) {
        return "reason_" + str;
    }

    public static String g(String str) {
        return "retry_count_" + str;
    }

    public static String h(String str) {
        return "type_" + str;
    }

    public static String i(String str) {
        return "until_" + str;
    }

    public synchronized void a(@Nullable String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                this.a.remove(i(str));
                this.a.remove(f(str));
                this.a.remove(h(str));
                this.a.remove(g(str));
                this.a.remove(e(str));
            }
        }
    }

    public synchronized void b(@Nullable String str) {
        a(str);
    }

    @NonNull
    public synchronized a c(@Nullable String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                long j2 = this.a.getLong(i(str), 0L);
                if (j2 <= 0) {
                    return a.NONE;
                }
                DirectiveType directiveTypeN = n(str);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis < j2 && !d(str, jCurrentTimeMillis, directiveTypeN)) {
                    return new a(directiveTypeN, j2, j2 - jCurrentTimeMillis, this.a.getInt(g(str), 0));
                }
                a(str);
                return a.NONE;
            }
        }
        return a.NONE;
    }

    public final boolean d(@NonNull String str, long j2, @NonNull DirectiveType directiveType) {
        if (directiveType != DirectiveType.BACKOFF) {
            return false;
        }
        long j3 = this.a.getLong(e(str), 0L);
        if (j3 <= 0) {
            this.a.putLong(e(str), j2);
            return false;
        }
        this.a.putLong(e(str), j2);
        return j2 - j3 > 7200000;
    }

    public final void j() {
    }

    public synchronized void k(@Nullable String str, int i, long j2, int i2) {
        l(str, DirectiveType.BACKOFF, i, j2, i2);
    }

    public final void l(@Nullable String str, @NonNull DirectiveType directiveType, int i, long j2, int i2) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (j2 <= 0) {
            j2 = 86400000;
        }
        j();
        long jCurrentTimeMillis = System.currentTimeMillis() + j2;
        this.a.putLong(i(str), jCurrentTimeMillis);
        this.a.putInt(f(str), i);
        this.a.putInt(h(str), directiveType.ordinal());
        this.a.putInt(g(str), Math.max(0, i2));
        this.a.putLong(e(str), System.currentTimeMillis());
        z6b.u("AppServerDirectiveStore", "recordDirective: appId=" + str + ", directiveType=" + directiveType + ", reasonCode=" + i + ", retryCount=" + i2 + ", untilMs=" + jCurrentTimeMillis);
    }

    public synchronized void m(@Nullable String str, int i, long j2) {
        l(str, DirectiveType.REJECTED, i, j2, 0);
    }

    @NonNull
    public final DirectiveType n(@NonNull String str) {
        int i = this.a.getInt(h(str), -1);
        DirectiveType directiveType = DirectiveType.REJECTED;
        if (i == directiveType.ordinal()) {
            return directiveType;
        }
        DirectiveType directiveType2 = DirectiveType.BACKOFF;
        return i == directiveType2.ordinal() ? directiveType2 : directiveType;
    }

    public synchronized boolean o(@Nullable String str) {
        return c(str).a();
    }
}
