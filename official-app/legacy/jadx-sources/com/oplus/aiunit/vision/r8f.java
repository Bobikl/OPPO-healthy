package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006J\u001e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\u0002J\u0006\u0010\u0018\u001a\u00020\u0002J\u000e\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0010J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0006J\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u001e\u001a\u00020\u0002J\u0006\u0010\u001f\u001a\u00020\u0002J\u0006\u0010 \u001a\u00020\u0002J\u000e\u0010!\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006$"}, d2 = {"Lcom/oplus/aiunit/vision/r8f;", "", "", "s", LogFieldKey.LEVEL_KEY, "i", "", "isRisk", b2n.f, "a", "", "name", "j", b2n.g, "isReSelect", "b", "", "keyIndex", "otherIndex", "c", "t", "time2riskStr", "r", MapSchema.FIELD_NAME_KEY, "f", "position", MapSchema.FIELD_NAME_ENTRY, "isCheck", "d", LogFieldKey.PROCESS_NAME_KEY, "o", "n", LogFieldKey.MESSAGE_KEY, "q", "<init>", "()V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final class r8f {
    public static final int $stable = 0;

    @NotNull
    public static final r8f INSTANCE = new r8f();

    public final void a() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 4).b();
    }

    public final void b(boolean isReSelect) {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, Integer.valueOf(isReSelect ? 8 : 7)).a(vik.TAG_POSTION1, 2).b();
    }

    public final void c(boolean isReSelect, int keyIndex, int otherIndex) {
        String str;
        if (keyIndex >= 0) {
            str = "key_index=" + keyIndex;
        } else if (otherIndex >= 0) {
            str = "other_index=" + otherIndex;
        } else {
            str = "";
        }
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, Integer.valueOf(isReSelect ? 8 : 7)).a(vik.TAG_POSTION1, 1).a("element", str).b();
    }

    public final void d(boolean isCheck) {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 13).a(vik.TAG_POSTION1, 3).a("element", "select=" + (!isCheck ? 1 : 0)).b();
    }

    public final void e(int position) {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 13).a(vik.TAG_POSTION1, Integer.valueOf(position)).b();
    }

    public final void f() {
        com.heytap.health.base.track.a.x().a(vik.TAG_MODULE_ID, 12).b();
    }

    public final void g(boolean isRisk) {
        com.heytap.health.base.track.a.x().a(vik.TAG_MODULE_ID, 3).a("element", "abnormal=" + (!isRisk ? 1 : 0)).b();
    }

    public final void h() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 6).b();
    }

    public final void i() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).b();
    }

    public final void j(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 5).a("element", "name=" + name).b();
    }

    public final void k() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 11).b();
    }

    public final void l() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, 1).b();
    }

    public final void m() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).b();
    }

    public final void n() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, 2).b();
    }

    public final void o() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, 1).b();
    }

    public final void p(boolean isRisk) {
        com.heytap.health.base.track.a.x().a(vik.TAG_MODULE_ID, -1).a("element", "abnormal=" + (!isRisk ? 1 : 0)).b();
    }

    public final void q(boolean isRisk) {
        com.heytap.health.base.track.a.x().a(vik.TAG_MODULE_ID, -1).a("element", "abnormal=" + (!isRisk ? 1 : 0)).b();
    }

    public final void r(@NotNull String time2riskStr) {
        Intrinsics.checkNotNullParameter(time2riskStr, "time2riskStr");
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 10).a("element", time2riskStr).b();
    }

    public final void s() {
        com.heytap.health.base.track.a.x().a(vik.TAG_MODULE_ID, -1).b();
    }

    public final void t() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 9).b();
    }
}
