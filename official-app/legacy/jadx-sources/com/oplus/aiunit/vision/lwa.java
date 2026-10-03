package com.oplus.aiunit.vision;

import androidx.lifecycle.LifecycleOwner;
import com.afollestad.assent.internal.Lifecycle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\b\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\"\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "", "Landroidx/lifecycle/Lifecycle$Event;", "watchFor", "Lkotlin/Function1;", "", "onEvent", "Lcom/afollestad/assent/internal/Lifecycle;", "a", "(Ljava/lang/Object;[Landroidx/lifecycle/Lifecycle$Event;Lkotlin/jvm/functions/Function1;)Lcom/afollestad/assent/internal/Lifecycle;", "core"}, k = 2, mv = {1, 4, 0})
public final class lwa {
    @Nullable
    public static final Lifecycle a(@Nullable Object obj, @NotNull androidx.lifecycle.Lifecycle.Event[] watchFor, @NotNull Function1<? super androidx.lifecycle.Lifecycle.Event, Unit> onEvent) {
        Intrinsics.checkParameterIsNotNull(watchFor, "watchFor");
        Intrinsics.checkParameterIsNotNull(onEvent, "onEvent");
        if (obj instanceof LifecycleOwner) {
            return new Lifecycle((LifecycleOwner) obj, watchFor, onEvent);
        }
        return null;
    }
}
