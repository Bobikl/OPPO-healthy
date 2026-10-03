package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.log.collect.auto.SystemInfoCollect;
import com.heytap.log.formatter.LogFieldKey;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/eq6;", "", "Companion", "a", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class eq6 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.eq6$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0007¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/eq6$a;", "", "", "mac", "", LogFieldKey.LEVEL_KEY, SystemInfoCollect.IMEI, "j", "eid", "f", "iccid", b2n.g, "content", "n", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void g(String eid) {
            Intrinsics.checkNotNullParameter(eid, "$eid");
            String content = v0j.a(eid, 6, 2);
            n7a.Companion companion = n7a.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(content, "content");
            n7a.Companion.d(companion, 32, 6, content, 0L, 0L, null, 56, null);
        }

        public static final void i(String iccid) {
            Intrinsics.checkNotNullParameter(iccid, "$iccid");
            String content = v0j.a(iccid, 6, 2);
            n7a.Companion companion = n7a.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(content, "content");
            n7a.Companion.d(companion, 33, 6, content, 0L, 0L, null, 56, null);
        }

        public static final void k(String IMEI) {
            Intrinsics.checkNotNullParameter(IMEI, "$IMEI");
            String content = v0j.a(IMEI, 6, 2);
            n7a.Companion companion = n7a.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(content, "content");
            n7a.Companion.d(companion, 27, 6, content, 0L, 0L, null, 56, null);
        }

        public static final void m(String mac) {
            Intrinsics.checkNotNullParameter(mac, "$mac");
            String content = v0j.a(mac, 6, 2);
            n7a.Companion companion = n7a.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(content, "content");
            n7a.Companion.d(companion, 37, 6, content, 0L, 0L, null, 56, null);
        }

        public static final void o(String content) {
            Intrinsics.checkNotNullParameter(content, "$content");
            n7a.Companion.d(n7a.INSTANCE, 24, 6, content, 0L, 0L, null, 56, null);
        }

        @JvmStatic
        public final void f(@NotNull final String eid) {
            Intrinsics.checkNotNullParameter(eid, "eid");
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.bq6
                @Override // java.lang.Runnable
                public final void run() {
                    eq6.Companion.g(eid);
                }
            });
        }

        @JvmStatic
        public final void h(@NotNull final String iccid) {
            Intrinsics.checkNotNullParameter(iccid, "iccid");
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.cq6
                @Override // java.lang.Runnable
                public final void run() {
                    eq6.Companion.i(iccid);
                }
            });
        }

        @JvmStatic
        public final void j(@NotNull final String IMEI) {
            Intrinsics.checkNotNullParameter(IMEI, "IMEI");
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.aq6
                @Override // java.lang.Runnable
                public final void run() {
                    eq6.Companion.k(IMEI);
                }
            });
        }

        @JvmStatic
        public final void l(@NotNull final String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.dq6
                @Override // java.lang.Runnable
                public final void run() {
                    eq6.Companion.m(mac);
                }
            });
        }

        @JvmStatic
        public final void n(@NotNull final String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.zp6
                @Override // java.lang.Runnable
                public final void run() {
                    eq6.Companion.o(content);
                }
            });
        }
    }
}
