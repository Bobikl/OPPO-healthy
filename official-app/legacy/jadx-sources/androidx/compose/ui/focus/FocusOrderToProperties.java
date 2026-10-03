package androidx.compose.ui.focus;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001e\u0012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002R\"\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/ui/focus/FocusOrderToProperties;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusProperties;", "", "focusOrderReceiver", "Landroidx/compose/ui/focus/FocusOrder;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "getFocusOrderReceiver", "()Lkotlin/jvm/functions/Function1;", "invoke", "focusProperties", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FocusOrderToProperties implements Function1<FocusProperties, Unit> {

    @NotNull
    private final Function1<FocusOrder, Unit> focusOrderReceiver;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusOrderToProperties(@NotNull Function1<? super FocusOrder, Unit> focusOrderReceiver) {
        Intrinsics.checkNotNullParameter(focusOrderReceiver, "focusOrderReceiver");
        this.focusOrderReceiver = focusOrderReceiver;
    }

    @NotNull
    public final Function1<FocusOrder, Unit> getFocusOrderReceiver() {
        return this.focusOrderReceiver;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FocusProperties focusProperties) {
        invoke2(focusProperties);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(@NotNull FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        this.focusOrderReceiver.invoke(new FocusOrder(focusProperties));
    }
}
