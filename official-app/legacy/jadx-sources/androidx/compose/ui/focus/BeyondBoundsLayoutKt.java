package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0006¢\u0006\u0002\b\bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"searchBeyondBounds", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "searchBeyondBounds--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BeyondBoundsLayoutKt {
    @ExperimentalComposeUiApi
    @Nullable
    /* JADX INFO: renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m1302searchBeyondBoundsOMvw8(@NotNull FocusTargetModifierNode searchBeyondBounds, int i, @NotNull Function1<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> block) {
        int iM3118getBeforehoxUOeE;
        Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
        Intrinsics.checkNotNullParameter(block, "block");
        BeyondBoundsLayout beyondBoundsLayoutParent$ui_release = searchBeyondBounds.getBeyondBoundsLayoutParent$ui_release();
        if (beyondBoundsLayoutParent$ui_release == null) {
            return null;
        }
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1306equalsimpl0(i, companion.m1323getUpdhqQ8s())) {
            iM3118getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3116getAbovehoxUOeE();
        } else if (FocusDirection.m1306equalsimpl0(i, companion.m1314getDowndhqQ8s())) {
            iM3118getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3119getBelowhoxUOeE();
        } else if (FocusDirection.m1306equalsimpl0(i, companion.m1318getLeftdhqQ8s())) {
            iM3118getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3120getLefthoxUOeE();
        } else if (FocusDirection.m1306equalsimpl0(i, companion.m1322getRightdhqQ8s())) {
            iM3118getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3121getRighthoxUOeE();
        } else if (FocusDirection.m1306equalsimpl0(i, companion.m1319getNextdhqQ8s())) {
            iM3118getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3117getAfterhoxUOeE();
        } else {
            if (!FocusDirection.m1306equalsimpl0(i, companion.m1321getPreviousdhqQ8s())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            }
            iM3118getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3118getBeforehoxUOeE();
        }
        return (T) beyondBoundsLayoutParent$ui_release.mo627layouto7g1Pn8(iM3118getBeforehoxUOeE, block);
    }
}
