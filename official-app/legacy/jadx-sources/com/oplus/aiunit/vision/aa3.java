package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/aa3;", "", "Lkotlin/Function1;", "", "", "doIfChildMode", "b", "<init>", "()V", "Companion", "a", "Health-6.4.4_03460bd_260624_OPlusRelease"}, k = 1, mv = {1, 8, 0})
public final class aa3 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "ChildModeStageCheckProcess";

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.aa3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/aa3$a;", "", "", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "Health-6.4.4_03460bd_260624_OPlusRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            boolean zH = um.d().h();
            a7b.f(aa3.TAG, "hasCheckChildMode : " + zH);
            return zH;
        }
    }

    public static final void c(Function1 doIfChildMode, String str, boolean z) {
        Intrinsics.checkNotNullParameter(doIfChildMode, "$doIfChildMode");
        a7b.f(TAG, "childMode is " + z);
        doIfChildMode.invoke(Boolean.valueOf(z));
    }

    public final void b(@NotNull final Function1<? super Boolean, Unit> doIfChildMode) {
        Intrinsics.checkNotNullParameter(doIfChildMode, "doIfChildMode");
        if (!INSTANCE.a()) {
            um.c().n(new rn9() { // from class: com.oplus.aiunit.vision.z93
                @Override // com.oplus.aiunit.vision.rn9
                public final void a(String str, boolean z) {
                    aa3.c(doIfChildMode, str, z);
                }
            });
        } else {
            a7b.b(TAG, "has already In ChildMode, do nothing");
            doIfChildMode.invoke(Boolean.FALSE);
        }
    }
}
