package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengineservice.db.table.phycialmental.DBPhysicalMentalAchievement;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/n8g;", "", "Companion", "a", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class n8g {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.n8g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b;\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bS\u0010TJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0004H\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\u0004H\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0011\u001a\u00020\u0004H\u0007J\b\u0010\u0012\u001a\u00020\u0004H\u0007J\b\u0010\u0013\u001a\u00020\u0004H\u0007J\b\u0010\u0014\u001a\u00020\u0004H\u0007J\b\u0010\u0015\u001a\u00020\u0004H\u0007J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0017\u001a\u00020\u0004H\u0007J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u001e\u001a\u00020\u0004H\u0007J\b\u0010\u001f\u001a\u00020\u0004H\u0007J\b\u0010 \u001a\u00020\u0004H\u0007J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010(\u001a\u00020\u0004H\u0007J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010,\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u00100\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u00101\u001a\u00020\u0004H\u0007J\u0010\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u00103\u001a\u00020\u0004H\u0007J\b\u00104\u001a\u00020\u0004H\u0007J\b\u00105\u001a\u00020\u0004H\u0007J\u0010\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u00107\u001a\u00020\u0004H\u0007J\u0010\u00108\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010:\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010;\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010<\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010>\u001a\u00020\u0004H\u0007J\u0010\u0010?\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010B\u001a\u00020\u00042\b\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010D\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u00022\b\u0010A\u001a\u0004\u0018\u00010@H\u0007J\b\u0010E\u001a\u00020\u0004H\u0007J\u0012\u0010F\u001a\u00020\u00042\b\u0010A\u001a\u0004\u0018\u00010@H\u0007J\u001a\u0010G\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u00022\b\u0010A\u001a\u0004\u0018\u00010@H\u0007J\b\u0010H\u001a\u00020\u0004H\u0007J\b\u0010I\u001a\u00020\u0004H\u0007J\u0010\u0010J\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010K\u001a\u00020\u0004H\u0007J\b\u0010L\u001a\u00020\u0004H\u0007J\b\u0010M\u001a\u00020\u0004H\u0007J$\u0010O\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010A\u001a\u0004\u0018\u00010@2\b\u0010N\u001a\u0004\u0018\u00010@H\u0007J\u0006\u0010P\u001a\u00020\u0004J\u0006\u0010Q\u001a\u00020\u0004J\u0006\u0010R\u001a\u00020\u0004¨\u0006U"}, d2 = {"Lcom/oplus/aiunit/vision/n8g$a;", "", "", "value", "", "n0", "r", ExifInterface.LONGITUDE_EAST, "R", "d", "t0", b2n.g, "O", "J", "a", "o0", "p0", "f0", "d0", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "b0", "Y", "i", "j", "l0", "q", LogFieldKey.PROCESS_NAME_KEY, "s0", "r0", "q0", "L", "k0", "t", "S", ExifInterface.GPS_DIRECTION_TRUE, MapSchema.FIELD_NAME_ENTRY, "s", "G", "H", UserInfo.SEX_FEMALE, "e0", "I", SecureGcmConstants.MESSAGE_KEY, "Q", "K", "b", "j0", "h0", "i0", "g0", "c0", "U", "v0", ExifInterface.LONGITUDE_WEST, "Z", "a0", "M", "c", "X", "n", LogFieldKey.MESSAGE_KEY, "u0", "N", MapSchema.FIELD_NAME_KEY, "", "name", LogFieldKey.LEVEL_KEY, "postion", "D", c8l.KEY_B, "C", "A", b2n.f, "x", "w", "z", "y", "u", "data", "v", "m0", "f", "o", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void A(int postion, @Nullable String name) {
            com.heytap.health.base.track.a.b bVarA = com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, Integer.valueOf(postion));
            if (name == null) {
                name = "";
            }
            bVarA.a("element", name).b();
        }

        @JvmStatic
        public final void B() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).b();
        }

        @JvmStatic
        public final void C(@Nullable String name) {
            com.heytap.health.base.track.a.b bVarA = com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2);
            if (name == null) {
                name = "";
            }
            bVarA.a("element", name).b();
        }

        @JvmStatic
        public final void D(int postion, @Nullable String name) {
            com.heytap.health.base.track.a.b bVarA = com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, Integer.valueOf(postion));
            if (name == null) {
                name = "";
            }
            bVarA.a("element", name).b();
        }

        @JvmStatic
        public final void E(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, 3).a(DBPhysicalMentalAchievement.EXERCISE, Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void F(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void G(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void H(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void I(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).a(vik.TAG_POSTION1, Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void J() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).a(vik.TAG_POSTION1, 3).b();
        }

        @JvmStatic
        public final void K(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).a("element", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void L() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 12).b();
        }

        @JvmStatic
        public final void M(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void N() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 5).b();
        }

        @JvmStatic
        public final void O() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).a(vik.TAG_POSTION1, 2).b();
        }

        @JvmStatic
        public final void P(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).a("element", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void Q(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).a("element", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void R() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, 5).b();
        }

        @JvmStatic
        public final void S(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void T(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void U() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 4).b();
        }

        @JvmStatic
        public final void V() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 6).a(vik.TAG_POSTION1, 2).b();
        }

        @JvmStatic
        public final void W() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).b();
        }

        @JvmStatic
        public final void X(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a("element", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void Y() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 6).a(vik.TAG_POSTION1, 5).b();
        }

        @JvmStatic
        public final void Z(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void a() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).a(vik.TAG_POSTION1, 4).b();
        }

        @JvmStatic
        public final void a0() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).b();
        }

        @JvmStatic
        public final void b(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void b0() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 6).a(vik.TAG_POSTION1, 3).b();
        }

        @JvmStatic
        public final void c(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 5).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void c0(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a("element", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void d() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, 6).b();
        }

        @JvmStatic
        public final void d0() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 6).a(vik.TAG_POSTION1, 1).b();
        }

        @JvmStatic
        public final void e(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void e0() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).b();
        }

        public final void f() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).b();
        }

        @JvmStatic
        public final void f0() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 5).a(vik.TAG_POSTION1, 1).b();
        }

        @JvmStatic
        public final void g() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).b();
        }

        @JvmStatic
        public final void g0() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 5).b();
        }

        @JvmStatic
        public final void h() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).a(vik.TAG_POSTION1, 1).b();
        }

        @JvmStatic
        public final void h0(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void i(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 7).a(vik.TAG_POSTION1, 1).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void i0(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 4).a("element", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void j() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 7).a(vik.TAG_POSTION1, 2).b();
        }

        @JvmStatic
        public final void j0(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void k(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void k0() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 7).a(vik.TAG_POSTION1, 5).b();
        }

        @JvmStatic
        public final void l(@Nullable String name, int value) {
            com.heytap.health.base.track.a.b bVarA = com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1);
            if (name == null) {
                name = "";
            }
            bVarA.a("sport", name).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void l0(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 7).a(vik.TAG_POSTION1, 3).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void m(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).a("element", Integer.valueOf(value)).b();
        }

        public final void m0() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).b();
        }

        @JvmStatic
        public final void n(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void n0(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, 1).a("stepset", Integer.valueOf(value)).b();
        }

        public final void o() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).b();
        }

        @JvmStatic
        public final void o0(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 4).a(vik.TAG_POSTION1, 1).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void p(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 8).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void p0(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 4).a(vik.TAG_POSTION1, 2).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void q(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 7).a(vik.TAG_POSTION1, 4).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void q0(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 11).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void r(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, 2).a("depletion", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void r0(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 10).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void s(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void s0(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 9).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void t() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 7).a(vik.TAG_POSTION1, 6).b();
        }

        @JvmStatic
        public final void t0() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).a(vik.TAG_POSTION1, 1).b();
        }

        @JvmStatic
        public final void u() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 4).b();
        }

        @JvmStatic
        public final void u0(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 4).a("switch", Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void v(int value, @Nullable String name, @Nullable String data) {
            com.heytap.health.base.track.a.b bVarA = com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 5).a(vik.TAG_POSTION1, Integer.valueOf(value));
            if (name == null) {
                name = "";
            }
            com.heytap.health.base.track.a.b bVarA2 = bVarA.a(vik.TAG_POSTION2, name);
            if (data == null) {
                data = "";
            }
            bVarA2.a("element", data).b();
        }

        @JvmStatic
        public final void v0() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 5).b();
        }

        @JvmStatic
        public final void w(int value) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, 2).a(vik.TAG_POSTION2, Integer.valueOf(value)).b();
        }

        @JvmStatic
        public final void x() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, 1).b();
        }

        @JvmStatic
        public final void y() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).b();
        }

        @JvmStatic
        public final void z() {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).b();
        }
    }

    @JvmStatic
    public static final void A() {
        INSTANCE.Y();
    }

    @JvmStatic
    public static final void B() {
        INSTANCE.b0();
    }

    @JvmStatic
    public static final void C() {
        INSTANCE.d0();
    }

    @JvmStatic
    public static final void D() {
        INSTANCE.f0();
    }

    @JvmStatic
    public static final void E() {
        INSTANCE.k0();
    }

    @JvmStatic
    public static final void F(int i) {
        INSTANCE.l0(i);
    }

    @JvmStatic
    public static final void G(int i) {
        INSTANCE.n0(i);
    }

    @JvmStatic
    public static final void H(int i) {
        INSTANCE.o0(i);
    }

    @JvmStatic
    public static final void I(int i) {
        INSTANCE.p0(i);
    }

    @JvmStatic
    public static final void J(int i) {
        INSTANCE.q0(i);
    }

    @JvmStatic
    public static final void K(int i) {
        INSTANCE.r0(i);
    }

    @JvmStatic
    public static final void L(int i) {
        INSTANCE.s0(i);
    }

    @JvmStatic
    public static final void M() {
        INSTANCE.t0();
    }

    @JvmStatic
    public static final void a() {
        INSTANCE.a();
    }

    @JvmStatic
    public static final void b() {
        INSTANCE.d();
    }

    @JvmStatic
    public static final void c() {
        INSTANCE.g();
    }

    @JvmStatic
    public static final void d() {
        INSTANCE.h();
    }

    @JvmStatic
    public static final void e(int i) {
        INSTANCE.i(i);
    }

    @JvmStatic
    public static final void f() {
        INSTANCE.j();
    }

    @JvmStatic
    public static final void g(int i) {
        INSTANCE.p(i);
    }

    @JvmStatic
    public static final void h(int i) {
        INSTANCE.q(i);
    }

    @JvmStatic
    public static final void i(int i) {
        INSTANCE.r(i);
    }

    @JvmStatic
    public static final void j() {
        INSTANCE.t();
    }

    @JvmStatic
    public static final void k() {
        INSTANCE.u();
    }

    @JvmStatic
    public static final void l(int i, @Nullable String str, @Nullable String str2) {
        INSTANCE.v(i, str, str2);
    }

    @JvmStatic
    public static final void m(int i) {
        INSTANCE.w(i);
    }

    @JvmStatic
    public static final void n() {
        INSTANCE.x();
    }

    @JvmStatic
    public static final void o() {
        INSTANCE.y();
    }

    @JvmStatic
    public static final void p() {
        INSTANCE.z();
    }

    @JvmStatic
    public static final void q(int i, @Nullable String str) {
        INSTANCE.A(i, str);
    }

    @JvmStatic
    public static final void r() {
        INSTANCE.B();
    }

    @JvmStatic
    public static final void s(@Nullable String str) {
        INSTANCE.C(str);
    }

    @JvmStatic
    public static final void t(int i, @Nullable String str) {
        INSTANCE.D(i, str);
    }

    @JvmStatic
    public static final void u(int i) {
        INSTANCE.E(i);
    }

    @JvmStatic
    public static final void v() {
        INSTANCE.J();
    }

    @JvmStatic
    public static final void w() {
        INSTANCE.L();
    }

    @JvmStatic
    public static final void x() {
        INSTANCE.O();
    }

    @JvmStatic
    public static final void y() {
        INSTANCE.R();
    }

    @JvmStatic
    public static final void z() {
        INSTANCE.V();
    }
}
