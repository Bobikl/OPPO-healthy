package com.oplus.drs.core.upload.executor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.log.config.LogMemoryConfig;
import com.oplus.aiunit.vision.co3;
import com.oplus.aiunit.vision.zb0;
import com.oppo.obus.common.report.core.entity.v32.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    @NonNull
    public final String a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final List<co3> f19813c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19814e;

    @Nullable
    public String f;
    public boolean g;
    public int h;
    public final List<C0961a> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Message f19815j;

    @Nullable
    public zb0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public UploadOutcome f19816l;

    /* JADX INFO: renamed from: com.oplus.drs.core.upload.executor.a$a, reason: collision with other inner class name */
    public static final class C0961a {

        @NonNull
        public final String a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final FailureScenarioClassifier.FailureScenario f19817c;

        @Nullable
        public final Throwable d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f19818e = System.currentTimeMillis();

        public C0961a(@NonNull String str, int i, @NonNull FailureScenarioClassifier.FailureScenario failureScenario, @Nullable Throwable th) {
            this.a = str;
            this.b = i;
            this.f19817c = failureScenario;
            this.d = th;
        }

        @NonNull
        public String a() {
            String str;
            if (this.a.length() > 20) {
                str = this.a.substring(0, 20) + LogMemoryConfig.LOG_ELLIPSIS;
            } else {
                str = this.a;
            }
            return str + "→" + this.f19817c + "(" + this.b + ")";
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DomainAttempt{domain='");
            sb.append(this.a);
            sb.append("', httpCode=");
            sb.append(this.b);
            sb.append(", failureScenario=");
            sb.append(this.f19817c);
            sb.append(", exception=");
            Throwable th = this.d;
            sb.append(th != null ? th.getClass().getSimpleName() : "null");
            sb.append(", timestamp=");
            sb.append(this.f19818e);
            sb.append("}");
            return sb.toString();
        }
    }

    public a(@NonNull String str, int i, @NonNull List<co3> list) {
        this(str, i, list, false, 0);
    }

    @Nullable
    public zb0 a() {
        return this.k;
    }

    public int b() {
        return this.i.size();
    }

    @Nullable
    public Message c() {
        return this.f19815j;
    }

    @Nullable
    public String d() {
        return this.f;
    }

    public int e() {
        int i = this.d;
        if (i >= 0) {
            return i;
        }
        if (this.f19813c.isEmpty()) {
            return -1;
        }
        return this.f19813c.get(0).t;
    }

    @Nullable
    public FailureScenarioClassifier.FailureScenario f() {
        if (this.i.isEmpty()) {
            return null;
        }
        List<C0961a> list = this.i;
        return list.get(list.size() - 1).f19817c;
    }

    @NonNull
    public Set<String> g() {
        HashSet hashSet = new HashSet();
        Iterator<C0961a> it = this.i.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().a);
        }
        return hashSet;
    }

    public boolean h() {
        return this.f19815j != null;
    }

    public boolean i() {
        return this.b == 1;
    }

    public boolean j() {
        return this.f19814e;
    }

    public void k(@NonNull String str, int i, @NonNull FailureScenarioClassifier.FailureScenario failureScenario, @Nullable Throwable th) {
        this.i.add(new C0961a(str, i, failureScenario, th));
    }

    public void l(@Nullable zb0 zb0Var) {
        this.k = zb0Var;
    }

    public void m(@Nullable Message message) {
        this.f19815j = message;
    }

    public void n(@Nullable String str) {
        this.f = str;
    }

    public void o(int i) {
        this.d = i;
    }

    public void p(@Nullable UploadOutcome uploadOutcome) {
        this.f19816l = uploadOutcome;
    }

    public void q(int i) {
        this.g = true;
        this.h = i;
    }

    public void r(boolean z) {
        this.f19814e = z;
    }

    @NonNull
    public String s() {
        StringBuilder sb = new StringBuilder();
        sb.append("UploadContext{appId=");
        sb.append(this.a);
        sb.append(", domainType=");
        sb.append(this.b);
        sb.append(", batchSize=");
        sb.append(this.f19813c.size());
        sb.append(", isHighPriority=");
        sb.append(this.g);
        if (this.g) {
            sb.append(", eventCode=");
            sb.append(this.h);
        }
        if (this.f19814e) {
            sb.append(", legacy=true");
        }
        if (this.f != null) {
            sb.append(", pathSuffix=");
            sb.append(this.f);
        }
        if (!this.i.isEmpty()) {
            sb.append(", attempts=[");
            for (int i = 0; i < this.i.size(); i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(this.i.get(i).a());
            }
            sb.append("]");
        }
        if (this.f19816l != null) {
            sb.append(", outcome=");
            sb.append(this.f19816l.p());
        }
        sb.append("}");
        return sb.toString();
    }

    @NonNull
    public String toString() {
        return s();
    }

    public a(@NonNull String str, int i) {
        this(str, i, new ArrayList(), false, 0);
    }

    public a(@NonNull String str, int i, @NonNull List<co3> list, boolean z, int i2) {
        this.d = -1;
        this.f19814e = false;
        this.f = null;
        this.i = new ArrayList();
        this.a = str;
        this.b = i;
        this.f19813c = list;
        this.g = z;
        this.h = i2;
    }
}
