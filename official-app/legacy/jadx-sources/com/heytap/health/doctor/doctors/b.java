package com.heytap.health.doctor.doctors;

import android.app.Activity;
import android.content.DialogInterface;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.health.device_settings.impl.R$string;
import com.oplus.aiunit.vision.op;
import com.oplus.aiunit.vision.qg3;
import com.oplus.aiunit.vision.qtf;
import com.support.dialog.R$style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J8\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\rH\u0016¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/doctor/doctors/b;", "", "Lcom/oplus/aiunit/vision/qg3;", "clinic", "", "c", "", "a", "", "titleRes", "ivRes", "", DBHealthReviewPlan.DESC, "Lkotlin/Function1;", "click", "b", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public interface b {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static void c(@NotNull b bVar, int i, int i2, @Nullable String str, @NotNull final Function1<? super Boolean, Unit> click) {
            Intrinsics.checkNotNullParameter(click, "click");
            Activity activityP = op.n().p();
            Intrinsics.checkNotNull(activityP);
            COUIAlertDialogBuilder cOUIAlertDialogBuilder = new COUIAlertDialogBuilder(activityP, R$style.COUIAlertDialog_Custom);
            cOUIAlertDialogBuilder.setTitle(i);
            if (str != null) {
                cOUIAlertDialogBuilder.C(str);
            }
            cOUIAlertDialogBuilder.A(qtf.h(i2));
            cOUIAlertDialogBuilder.setCancelable(false);
            cOUIAlertDialogBuilder.setPositiveButton(R$string.settings_blood_pressure_yes, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.d9d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    com.heytap.health.doctor.doctors.b.a.e(click, dialogInterface, i3);
                }
            });
            cOUIAlertDialogBuilder.setNegativeButton(R$string.settings_blood_pressure_no, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.e9d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    com.heytap.health.doctor.doctors.b.a.f(click, dialogInterface, i3);
                }
            });
            cOUIAlertDialogBuilder.y(true);
            cOUIAlertDialogBuilder.show();
        }

        public static /* synthetic */ void d(b bVar, int i, int i2, String str, Function1 function1, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSuggestionDialog");
            }
            if ((i3 & 4) != 0) {
                str = null;
            }
            bVar.b(i, i2, str, function1);
        }

        public static void e(Function1 click, DialogInterface dialogInterface, int i) {
            Intrinsics.checkNotNullParameter(click, "$click");
            click.invoke(Boolean.TRUE);
        }

        public static void f(Function1 click, DialogInterface dialogInterface, int i) {
            Intrinsics.checkNotNullParameter(click, "$click");
            click.invoke(Boolean.FALSE);
        }
    }

    void a(@NotNull qg3 clinic);

    void b(int titleRes, int ivRes, @Nullable String desc, @NotNull Function1<? super Boolean, Unit> click);

    boolean c(@NotNull qg3 clinic);
}
