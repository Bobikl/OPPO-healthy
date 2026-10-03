package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/i3k;", "", "Lcom/oplus/aiunit/vision/k3k;", "listener", "", "a", "b", "", "isTourist", "c", "", "TAG", "Ljava/lang/String;", "", "Ljava/util/List;", "touristStatusListeners", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTouristLoginContinue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouristLoginContinue.kt\ncom/heytap/health/base/tourist/TouristLoginContinue\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1855#2,2:38\n*S KotlinDebug\n*F\n+ 1 TouristLoginContinue.kt\ncom/heytap/health/base/tourist/TouristLoginContinue\n*L\n32#1:38,2\n*E\n"})
public final class i3k {

    @NotNull
    public static final String TAG = "TouristLoginContinue";

    @NotNull
    public static final i3k INSTANCE = new i3k();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<k3k> touristStatusListeners = new ArrayList();

    public final void a(@NotNull k3k listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (g3k.x()) {
            touristStatusListeners.add(listener);
        }
    }

    public final void b(@Nullable k3k listener) {
        if (listener != null) {
            touristStatusListeners.remove(listener);
        }
    }

    public final void c(boolean isTourist) {
        a7b.f(TAG, "updateLoginStatus");
        Iterator<T> it = touristStatusListeners.iterator();
        while (it.hasNext()) {
            ((k3k) it.next()).a(isTourist);
        }
    }
}
