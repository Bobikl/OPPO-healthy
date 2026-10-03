package com.oplus.drs.core.upload.upload;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.gc1;
import com.oplus.aiunit.vision.t73;
import com.oplus.drs.core.upload.executor.FailureScenarioClassifier;
import com.oplus.drs.core.upload.executor.UploadOutcome;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    @NonNull
    public final ChannelType a;

    @NonNull
    public final t73 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19834c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final FailureScenarioClassifier.FailureScenario f19835e;

    @Nullable
    public final UploadOutcome f;

    @NonNull
    public final Set<String> g;
    public final int h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final Set<FailureScenarioClassifier.FailureScenario> f19836j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f19837l;

    @NonNull
    public final ChannelTaskStopReason m;

    /* JADX INFO: renamed from: com.oplus.drs.core.upload.upload.a$a, reason: collision with other inner class name */
    public static final class C0963a {

        @NonNull
        public final ChannelType a;

        @NonNull
        public final t73 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f19838c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public FailureScenarioClassifier.FailureScenario f19839e;

        @Nullable
        public UploadOutcome f;
        public int h;
        public int i;
        public boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f19841l;
        public final Set<String> g = new LinkedHashSet();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Set<FailureScenarioClassifier.FailureScenario> f19840j = new LinkedHashSet();
        public ChannelTaskStopReason m = ChannelTaskStopReason.TASK_COMPLETED;

        public C0963a(@NonNull ChannelType channelType, @NonNull t73 t73Var) {
            this.a = channelType;
            this.b = t73Var;
        }

        @NonNull
        public a n() {
            return new a(this);
        }

        public void o(@Nullable FailureScenarioClassifier.FailureScenario failureScenario) {
            if (failureScenario == null) {
                return;
            }
            this.f19840j.add(failureScenario);
        }

        public void p(@NonNull FailureScenarioClassifier.FailureScenario failureScenario, @Nullable UploadOutcome uploadOutcome) {
            if (this.d) {
                return;
            }
            this.d = true;
            this.f19839e = failureScenario;
            this.f = uploadOutcome;
        }

        public void q(@NonNull gc1 gc1Var) {
            String str;
            this.h++;
            if (gc1Var.b && (str = gc1Var.a) != null) {
                this.f19838c = true;
                this.g.add(str);
                return;
            }
            FailureScenarioClassifier.FailureScenario failureScenario = gc1Var.f11703c;
            if (failureScenario == null || this.d) {
                return;
            }
            this.d = true;
            this.f19839e = failureScenario;
            this.f = gc1Var.h;
        }

        public void r() {
            this.i++;
        }

        public void s(boolean z) {
            this.k = z;
        }

        public void t(boolean z) {
            this.f19841l = z;
        }

        public void u(@NonNull ChannelTaskStopReason channelTaskStopReason) {
            this.m = channelTaskStopReason;
        }
    }

    public a(@NonNull C0963a c0963a) {
        this.a = c0963a.a;
        this.b = c0963a.b;
        this.f19834c = c0963a.f19838c;
        this.d = c0963a.d;
        this.f19835e = c0963a.f19839e;
        this.f = c0963a.f;
        this.g = new LinkedHashSet(c0963a.g);
        this.h = c0963a.h;
        this.i = c0963a.i;
        this.f19836j = new LinkedHashSet(c0963a.f19840j);
        this.k = c0963a.k;
        this.f19837l = c0963a.f19841l;
        this.m = c0963a.m;
    }
}
