package com.oplus.aiunit.vision;

import android.view.View;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H&J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/kq2;", "", "", "a", "Landroid/view/View;", "monthParentView", "Ljava/time/LocalDate;", "firstDayOfMonth", "", MapSchema.FIELD_NAME_ENTRY, "dayParentView", "Lcom/heytap/health/base/view/calendar/a;", "c", "dayView", "actualDay", "d", "b", "()Ljava/lang/Integer;", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public interface kq2 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Nullable
        public static Integer a(@NotNull kq2 kq2Var) {
            return null;
        }
    }

    int a();

    @Nullable
    Integer b();

    @NotNull
    com.heytap.health.base.view.calendar.a c(@NotNull View dayParentView);

    void d(@NotNull com.heytap.health.base.view.calendar.a dayView, @NotNull LocalDate actualDay);

    void e(@NotNull View monthParentView, @NotNull LocalDate firstDayOfMonth);
}
