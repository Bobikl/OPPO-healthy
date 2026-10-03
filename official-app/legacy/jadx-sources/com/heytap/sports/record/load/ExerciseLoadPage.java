package com.heytap.sports.record.load;

import com.oplus.aiunit.vision.t13;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/heytap/sports/record/load/ExerciseLoadPage;", "", "", "i", "I", "getI", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", t13.WEEK, t13.MONTH, t13.YEAR, "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public enum ExerciseLoadPage {
    WEEK(0),
    MONTH(1),
    YEAR(2);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int i;

    /* JADX INFO: renamed from: com.heytap.sports.record.load.ExerciseLoadPage$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/heytap/sports/record/load/ExerciseLoadPage$a;", "", "", "i", "Lcom/heytap/sports/record/load/ExerciseLoadPage;", "a", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ExerciseLoadPage a(int i) {
            ExerciseLoadPage exerciseLoadPage = ExerciseLoadPage.WEEK;
            if (i == exerciseLoadPage.getI()) {
                return exerciseLoadPage;
            }
            ExerciseLoadPage exerciseLoadPage2 = ExerciseLoadPage.MONTH;
            if (i != exerciseLoadPage2.getI()) {
                exerciseLoadPage2 = ExerciseLoadPage.YEAR;
                if (i != exerciseLoadPage2.getI()) {
                    return exerciseLoadPage;
                }
            }
            return exerciseLoadPage2;
        }
    }

    ExerciseLoadPage(int i) {
        this.i = i;
    }

    public final int getI() {
        return this.i;
    }
}
