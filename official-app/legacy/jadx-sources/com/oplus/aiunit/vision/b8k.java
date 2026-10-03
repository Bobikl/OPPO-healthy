package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.menstrual_period.datahandler.ButtonStateHelper;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eJ\u0016\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eJ\u0016\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0005J\u0006\u0010\u0018\u001a\u00020\u0002J\u0006\u0010\u0019\u001a\u00020\u0002J\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u0002¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/b8k;", "", "", LogFieldKey.MESSAGE_KEY, LogFieldKey.LEVEL_KEY, "", "name", "f", "d", "c", MapSchema.FIELD_NAME_ENTRY, "Ljava/time/LocalDate;", "date", "j", "", "needCorrectPeriod", "needCorrectCycle", b2n.f, b2n.g, "curDateDesc", "Lcom/heytap/health/menstrual_period/datahandler/ButtonStateHelper$ButtonState;", "btnStatus", "i", "b", LogFieldKey.PROCESS_NAME_KEY, "o", "n", "", "postion", MapSchema.FIELD_NAME_KEY, "a", "<init>", "()V", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
public final class b8k {
    public static final int $stable = 0;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonStateHelper.ButtonState.values().length];
            try {
                iArr[ButtonStateHelper.ButtonState.HIGHLIGHT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonStateHelper.ButtonState.UNHIGHLIGHT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonStateHelper.ButtonState.HIGHLIGHT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void a() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 10).a(vik.TAG_POSTION1, 1).b();
    }

    public final void b(@NotNull String curDateDesc) {
        Intrinsics.checkNotNullParameter(curDateDesc, "curDateDesc");
        com.heytap.health.base.track.a.x().a(vik.TAG_MODULE_ID, 3).a(vik.TAG_POSTION1, 2).a("contents", curDateDesc).b();
    }

    public final void c() {
        com.heytap.health.base.track.a.x().a(vik.TAG_MODULE_ID, 2).a(vik.TAG_POSTION1, 3).a(vik.TAG_POSTION2, -1).b();
    }

    public final void d(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).a(vik.TAG_POSTION1, 2).a("date", name).b();
    }

    public final void e() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).a(vik.TAG_POSTION1, 3).a(vik.TAG_POSTION2, 1).b();
    }

    public final void f(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).a(vik.TAG_POSTION1, 1).a("date", name).b();
    }

    public final void g(boolean needCorrectPeriod, boolean needCorrectCycle) {
        int i = 1;
        if (!needCorrectCycle || !needCorrectPeriod) {
            i = needCorrectPeriod ? 2 : 3;
        }
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 4).a(vik.TAG_POSTION1, 1).a(vik.TAG_POSTION2, 1).a("warn", Integer.valueOf(i)).b();
    }

    public final void h(boolean needCorrectPeriod, boolean needCorrectCycle) {
        int i;
        if (needCorrectCycle && needCorrectPeriod) {
            i = 1;
        } else {
            i = needCorrectPeriod ? 2 : 3;
        }
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 4).a(vik.TAG_POSTION1, 1).a(vik.TAG_POSTION2, 2).a("warn", Integer.valueOf(i)).b();
    }

    public final void i(@NotNull String curDateDesc, @NotNull ButtonStateHelper.ButtonState btnStatus) {
        int i;
        Intrinsics.checkNotNullParameter(curDateDesc, "curDateDesc");
        Intrinsics.checkNotNullParameter(btnStatus, "btnStatus");
        int i2 = a.$EnumSwitchMapping$0[btnStatus.ordinal()];
        if (i2 != 1) {
            i = 2;
            if (i2 != 2) {
                i = i2 != 3 ? 4 : 3;
            }
        } else {
            i = 1;
        }
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).a(vik.TAG_POSTION1, 1).a("contents", curDateDesc).a("status_value", Integer.valueOf(i)).b();
    }

    public final void j(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).a(vik.TAG_POSTION1, 4).a("date", date.toString()).b();
    }

    public final void k(int postion) {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 9).a(vik.TAG_POSTION1, Integer.valueOf(postion)).b();
    }

    public final void l() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, 2).b();
    }

    public final void m() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, 1).b();
    }

    public final void n() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).a(vik.TAG_POSTION1, 4).b();
    }

    public final void o() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).a(vik.TAG_POSTION1, 2).b();
    }

    public final void p() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).a(vik.TAG_POSTION1, 2).b();
    }
}
