package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/rm1;", "", "", "spKey", "", "a", "value", "", "b", "SP_NAME_BLOOD_OXYGEN", "Ljava/lang/String;", rm1.SP_KEY_CLOSE_BLOOD_OXYGEN_ABOUT_POP, rm1.SP_KEY_CLOSE_BLOOD_OXYGEN_WARNING_POP, "<init>", "()V", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
public final class rm1 {

    @NotNull
    public static final rm1 INSTANCE = new rm1();

    @NotNull
    public static final String SP_KEY_CLOSE_BLOOD_OXYGEN_ABOUT_POP = "SP_KEY_CLOSE_BLOOD_OXYGEN_ABOUT_POP";

    @NotNull
    public static final String SP_KEY_CLOSE_BLOOD_OXYGEN_WARNING_POP = "SP_KEY_CLOSE_BLOOD_OXYGEN_WARNING_POP";

    @NotNull
    public static final String SP_NAME_BLOOD_OXYGEN = "SP_NAME_BLOOD_OXYGEN_";

    public final boolean a(@NotNull String spKey) {
        Intrinsics.checkNotNullParameter(spKey, "spKey");
        return v9g.x(SP_NAME_BLOOD_OXYGEN).r(spKey, false);
    }

    public final void b(@NotNull String spKey, boolean value) {
        Intrinsics.checkNotNullParameter(spKey, "spKey");
        v9g.x(SP_NAME_BLOOD_OXYGEN).W(spKey, value);
    }
}
