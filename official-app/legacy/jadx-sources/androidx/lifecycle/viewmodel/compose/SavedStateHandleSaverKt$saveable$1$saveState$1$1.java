package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.lifecycle.SavedStateHandle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.FunctionReferenceImpl;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class SavedStateHandleSaverKt$saveable$1$saveState$1$1 implements SaverScope, FunctionAdapter {
    final /* synthetic */ SavedStateHandle.Companion $tmp0;

    public SavedStateHandleSaverKt$saveable$1$saveState$1$1(SavedStateHandle.Companion companion) {
        this.$tmp0 = companion;
    }

    @Override // androidx.compose.runtime.saveable.SaverScope
    public final boolean canBeSaved(@Nullable Object obj) {
        return this.$tmp0.validateValue(obj);
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof SaverScope) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p010kotlin.jvm.internal.FunctionAdapter
    @NotNull
    public final Function<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.$tmp0, SavedStateHandle.Companion.class, "validateValue", "validateValue(Ljava/lang/Object;)Z", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
