package com.heytap.sports.record.details.vm;

import androidx.lifecycle.Observer;
import com.oplus.aiunit.vision.op5;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Metadata;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\"\u0010\b\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0003¨\u0006\t"}, d2 = {"", "", "a", "Ljava/util/Set;", "THIRD_PARTY_SOURCES", "", "kotlin.jvm.PlatformType", "b", "UNSUPPORTED_EXERCISE_LOAD_DEVICES", "sport_impl_release"}, k = 2, mv = {1, 8, 0})
public final class a {

    @NotNull
    public static final Set<Integer> a = SetsKt__SetsKt.setOf((Object[]) new Integer[]{1, 2, 3});

    @NotNull
    public static final Set<String> b = SetsKt__SetsKt.setOf((Object[]) new String[]{op5.PHONE, "mobile", op5.MERGER, "", op5.MANUAL, op5.THIRD, op5.WATCH, op5.BAND, op5.WATCH_GT, op5.WATCH2, op5.BAND2, op5.REALME_GT, op5.WATCH3, op5.BANDHSB, op5.WATCH3SE, op5.WATCH3PRO, op5.WATCH4, op5.WATCH_STAR, op5.WATCH_BAGEL, op5.WATCH_STAR_RIVER, op5.WATCH_ASTRA, op5.WATCH_OPPO_SPORT, op5.WATCH_COLUMBUS, op5.WATCH_iWATCH});

    /* JADX INFO: renamed from: com.heytap.sports.record.details.vm.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C0788a implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public C0788a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.i = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p010kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.i;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.i.invoke(obj);
        }
    }
}
