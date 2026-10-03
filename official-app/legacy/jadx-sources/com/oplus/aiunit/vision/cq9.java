package com.oplus.aiunit.vision;

import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/cq9;", "", "", "s5", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "O6", "()Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "lazyGetFamilyConfig", "health_release"}, k = 1, mv = {1, 8, 0})
public interface cq9 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @NotNull
        public static String a(@NotNull cq9 cq9Var) {
            String ssoid;
            FamilyMoreDataDetailConfigBean lazyGetFamilyConfig = cq9Var.getLazyGetFamilyConfig();
            if (lazyGetFamilyConfig != null && (ssoid = lazyGetFamilyConfig.getSsoid()) != null) {
                return ssoid;
            }
            String ssoid2 = um.c().getSsoid();
            Intrinsics.checkNotNullExpressionValue(ssoid2, "getAccountManager().ssoid");
            return ssoid2;
        }

        @Nullable
        public static FamilyMoreDataDetailConfigBean b(@NotNull cq9 cq9Var) {
            return cq9Var.getLazyGetFamilyConfig();
        }

        public static boolean c(@NotNull cq9 cq9Var) {
            return cq9Var.getLazyGetFamilyConfig() != null;
        }

        public static void d(@NotNull cq9 cq9Var, @NotNull Function0<Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            if (cq9Var.getLazyGetFamilyConfig() == null) {
                block.invoke();
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: O6 */
    FamilyMoreDataDetailConfigBean getLazyGetFamilyConfig();

    boolean s5();
}
