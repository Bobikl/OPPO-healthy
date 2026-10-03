package com.heytap.health.settings.me.healthrecords;

import com.heytap.health.health_archives.util.HealthArchivesUserInfoDialogUtil;
import com.heytap.health.operations.settings.data.RunGoalType;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0006H\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0006H\u0016J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0006H\u0016J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0016¨\u0006("}, d2 = {"Lcom/heytap/health/settings/me/healthrecords/a;", "", "", "newHeightMM", "", "l2", "", "errMsg", "N1", "newWeightG", "l1", "T1", "gender", "L4", "D0", "birthday", "B6", "X3", "Lcom/heytap/health/settings/me/healthrecords/BloodPressureType;", "bloodPressureType", "n6", "P5", "name", "Y2", "k6", "bloodType", "x6", "W2", HealthArchivesUserInfoDialogUtil.TYPE_MEDICAL_HISTORY, "q5", "C0", "allergicReaction", "H3", "p6", "medicine", "o3", "x3", "Lcom/heytap/health/operations/settings/data/RunGoalType;", "runGoalType", "u5", "settings_impl_release"}, k = 1, mv = {1, 8, 0})
public interface a {

    /* JADX INFO: renamed from: com.heytap.health.settings.me.healthrecords.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C0549a {
        public static void a(@NotNull a aVar, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
        }

        public static void b(@NotNull a aVar, @NotNull String allergicReaction) {
            Intrinsics.checkNotNullParameter(allergicReaction, "allergicReaction");
        }

        public static void c(@NotNull a aVar, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
        }

        public static void d(@NotNull a aVar, @NotNull String birthday) {
            Intrinsics.checkNotNullParameter(birthday, "birthday");
        }

        public static void e(@NotNull a aVar, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
        }

        public static void f(@NotNull a aVar, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
        }

        public static void g(@NotNull a aVar, @NotNull BloodPressureType bloodPressureType) {
            Intrinsics.checkNotNullParameter(bloodPressureType, "bloodPressureType");
        }

        public static void h(@NotNull a aVar, int i) {
        }

        public static void i(@NotNull a aVar, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
        }

        public static void j(@NotNull a aVar, @NotNull String gender) {
            Intrinsics.checkNotNullParameter(gender, "gender");
        }

        public static void k(@NotNull a aVar, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
        }

        public static void l(@NotNull a aVar, int i) {
        }

        public static void m(@NotNull a aVar, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
        }

        public static void n(@NotNull a aVar, @NotNull String medicalHistory) {
            Intrinsics.checkNotNullParameter(medicalHistory, "medicalHistory");
        }

        public static void o(@NotNull a aVar, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
        }

        public static void p(@NotNull a aVar, @NotNull String medicine) {
            Intrinsics.checkNotNullParameter(medicine, "medicine");
        }

        public static void q(@NotNull a aVar, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
        }

        public static void r(@NotNull a aVar, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }

        public static void s(@NotNull a aVar, @NotNull RunGoalType runGoalType) {
            Intrinsics.checkNotNullParameter(runGoalType, "runGoalType");
        }

        public static void t(@NotNull a aVar, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
        }

        public static void u(@NotNull a aVar, int i) {
        }
    }

    void B6(@NotNull String birthday);

    void C0(@NotNull String errMsg);

    void D0(@NotNull String errMsg);

    void H3(@NotNull String allergicReaction);

    void L4(@NotNull String gender);

    void N1(@NotNull String errMsg);

    void P5(@NotNull String errMsg);

    void T1(@NotNull String errMsg);

    void W2(@NotNull String errMsg);

    void X3(@NotNull String errMsg);

    void Y2(@NotNull String name);

    void k6(@NotNull String errMsg);

    void l1(int newWeightG);

    void l2(int newHeightMM);

    void n6(@NotNull BloodPressureType bloodPressureType);

    void o3(@NotNull String medicine);

    void p6(@NotNull String errMsg);

    void q5(@NotNull String medicalHistory);

    void u5(@NotNull RunGoalType runGoalType);

    void x3(@NotNull String errMsg);

    void x6(int bloodType);
}
