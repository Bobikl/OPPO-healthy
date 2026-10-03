package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.speech.engine.constant.EngineConstant;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0002J\u0016\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u0014\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0002J\u0016\u0010\u0016\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u0017\u001a\u00020\u0002J\u0006\u0010\u0018\u001a\u00020\u0002J\u0006\u0010\u0019\u001a\u00020\u0002J\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\tJ\u0006\u0010\u001d\u001a\u00020\u0002R\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/h43;", "", "", LogFieldKey.PROCESS_NAME_KEY, MapSchema.FIELD_NAME_KEY, "q", "f", "s", LogFieldKey.LEVEL_KEY, "", "position", "", "text", LogFieldKey.MESSAGE_KEY, "o", MapSchema.FIELD_NAME_ENTRY, "d", "b", "", "onOff", "c", "n", "a", "t", "j", "i", "r", "step", b2n.f, b2n.g, "Ljava/lang/String;", "page_state", "<init>", "()V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final class h43 {
    public static final int $stable = 0;

    @NotNull
    public static final h43 INSTANCE = new h43();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String page_state = "state";

    public final void a(int position, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, Integer.valueOf(position)).a("element", text).b();
    }

    public final void b(int position, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).a(vik.TAG_POSTION1, Integer.valueOf(position)).a("element", text).b();
    }

    public final void c(int position, boolean onOff) {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).a(vik.TAG_POSTION1, Integer.valueOf(position)).a("element", Integer.valueOf(!onOff ? 1 : 0)).b();
    }

    public final void d() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, 2).b();
    }

    public final void e() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, 1).b();
    }

    public final void f() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(EngineConstant.ROUTER_TYPE_DIALOG, "cardiovascular").b();
    }

    public final void g(int step) {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, Integer.valueOf(step)).b();
    }

    public final void h() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).b();
    }

    public final void i() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).b();
    }

    public final void j() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).b();
    }

    public final void k() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(page_state, 0).b();
    }

    public final void l() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(page_state, 1).b();
    }

    public final void m(int position, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).a(vik.TAG_POSTION1, Integer.valueOf(position)).a("element", text).b();
    }

    public final void n() {
        com.heytap.health.base.track.a.x().a(vik.TAG_MODULE_ID, -1).b();
    }

    public final void o() {
        com.heytap.health.base.track.a.x().a(vik.TAG_MODULE_ID, -1).b();
    }

    public final void p() {
        com.heytap.health.base.track.a.x().a(vik.TAG_MODULE_ID, -1).a(page_state, 0).b();
    }

    public final void q() {
        com.heytap.health.base.track.a.x().a(vik.TAG_MODULE_ID, -1).a(EngineConstant.ROUTER_TYPE_DIALOG, "cardiovascular").b();
    }

    public final void r() {
        com.heytap.health.base.track.a.x().a(vik.TAG_MODULE_ID, -1).b();
    }

    public final void s() {
        com.heytap.health.base.track.a.x().a(vik.TAG_MODULE_ID, -1).a(page_state, 1).b();
    }

    public final void t() {
        com.heytap.health.base.track.a.x().a(vik.TAG_MODULE_ID, -1).b();
    }
}
