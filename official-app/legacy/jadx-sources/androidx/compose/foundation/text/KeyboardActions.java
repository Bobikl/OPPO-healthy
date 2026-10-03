package androidx.compose.foundation.text;

import androidx.compose.runtime.Stable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B³\u0001\u0012\u001b\b\u0002\u0010\u0002\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u001b\b\u0002\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u001b\b\u0002\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u001b\b\u0002\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\fJ\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R$\u0010\u0002\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR$\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR$\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR$\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR$\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR$\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActions;", "", "onDone", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "", "Lkotlin/ExtensionFunctionType;", "onGo", "onNext", "onPrevious", "onSearch", "onSend", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getOnDone", "()Lkotlin/jvm/functions/Function1;", "getOnGo", "getOnNext", "getOnPrevious", "getOnSearch", "getOnSend", "equals", "", "other", "hashCode", "", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KeyboardActions {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final KeyboardActions Default = new KeyboardActions(null, null, null, null, null, null, 63, null);

    @Nullable
    private final Function1<KeyboardActionScope, Unit> onDone;

    @Nullable
    private final Function1<KeyboardActionScope, Unit> onGo;

    @Nullable
    private final Function1<KeyboardActionScope, Unit> onNext;

    @Nullable
    private final Function1<KeyboardActionScope, Unit> onPrevious;

    @Nullable
    private final Function1<KeyboardActionScope, Unit> onSearch;

    @Nullable
    private final Function1<KeyboardActionScope, Unit> onSend;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActions$Companion;", "", "()V", "Default", "Landroidx/compose/foundation/text/KeyboardActions;", "getDefault$annotations", "getDefault", "()Landroidx/compose/foundation/text/KeyboardActions;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }

        @NotNull
        public final KeyboardActions getDefault() {
            return KeyboardActions.Default;
        }
    }

    public KeyboardActions() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyboardActions)) {
            return false;
        }
        KeyboardActions keyboardActions = (KeyboardActions) other;
        return Intrinsics.areEqual(this.onDone, keyboardActions.onDone) && Intrinsics.areEqual(this.onGo, keyboardActions.onGo) && Intrinsics.areEqual(this.onNext, keyboardActions.onNext) && Intrinsics.areEqual(this.onPrevious, keyboardActions.onPrevious) && Intrinsics.areEqual(this.onSearch, keyboardActions.onSearch) && Intrinsics.areEqual(this.onSend, keyboardActions.onSend);
    }

    @Nullable
    public final Function1<KeyboardActionScope, Unit> getOnDone() {
        return this.onDone;
    }

    @Nullable
    public final Function1<KeyboardActionScope, Unit> getOnGo() {
        return this.onGo;
    }

    @Nullable
    public final Function1<KeyboardActionScope, Unit> getOnNext() {
        return this.onNext;
    }

    @Nullable
    public final Function1<KeyboardActionScope, Unit> getOnPrevious() {
        return this.onPrevious;
    }

    @Nullable
    public final Function1<KeyboardActionScope, Unit> getOnSearch() {
        return this.onSearch;
    }

    @Nullable
    public final Function1<KeyboardActionScope, Unit> getOnSend() {
        return this.onSend;
    }

    public int hashCode() {
        Function1<KeyboardActionScope, Unit> function1 = this.onDone;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1<KeyboardActionScope, Unit> function2 = this.onGo;
        int iHashCode2 = (iHashCode + (function2 != null ? function2.hashCode() : 0)) * 31;
        Function1<KeyboardActionScope, Unit> function3 = this.onNext;
        int iHashCode3 = (iHashCode2 + (function3 != null ? function3.hashCode() : 0)) * 31;
        Function1<KeyboardActionScope, Unit> function4 = this.onPrevious;
        int iHashCode4 = (iHashCode3 + (function4 != null ? function4.hashCode() : 0)) * 31;
        Function1<KeyboardActionScope, Unit> function5 = this.onSearch;
        int iHashCode5 = (iHashCode4 + (function5 != null ? function5.hashCode() : 0)) * 31;
        Function1<KeyboardActionScope, Unit> function6 = this.onSend;
        return iHashCode5 + (function6 != null ? function6.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyboardActions(@Nullable Function1<? super KeyboardActionScope, Unit> function1, @Nullable Function1<? super KeyboardActionScope, Unit> function2, @Nullable Function1<? super KeyboardActionScope, Unit> function3, @Nullable Function1<? super KeyboardActionScope, Unit> function4, @Nullable Function1<? super KeyboardActionScope, Unit> function5, @Nullable Function1<? super KeyboardActionScope, Unit> function6) {
        this.onDone = function1;
        this.onGo = function2;
        this.onNext = function3;
        this.onPrevious = function4;
        this.onSearch = function5;
        this.onSend = function6;
    }

    public /* synthetic */ KeyboardActions(Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function2, (i & 4) != 0 ? null : function3, (i & 8) != 0 ? null : function4, (i & 16) != 0 ? null : function5, (i & 32) != 0 ? null : function6);
    }
}
