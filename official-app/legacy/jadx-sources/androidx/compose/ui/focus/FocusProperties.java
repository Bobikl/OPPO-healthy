package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import com.oplus.aiunit.vision.y04;
import com.oplus.smartenginehelper.entity.TextEntity;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eRE\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00122\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00128W@WX\u0097\u000eø\u0001\u0000¢\u0006\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aRE\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00122\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00128W@WX\u0097\u000eø\u0001\u0000¢\u0006\u0012\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR$\u0010\u001f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000eR$\u0010\"\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR$\u0010%\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR$\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR$\u0010+\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010\u000eR$\u0010.\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b/\u0010\f\"\u0004\b0\u0010\u000eø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u00061À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/FocusProperties;", "", "canFocus", "", "getCanFocus", "()Z", "setCanFocus", "(Z)V", "<anonymous parameter 0>", "Landroidx/compose/ui/focus/FocusRequester;", y04.TIME_STYLE_DOWN_DIR_NAME, "getDown", "()Landroidx/compose/ui/focus/FocusRequester;", "setDown", "(Landroidx/compose/ui/focus/FocusRequester;)V", TextEntity.ELLIPSIZE_END, "getEnd", "setEnd", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusDirection;", "enter", "getEnter$annotations", "()V", "getEnter", "()Lkotlin/jvm/functions/Function1;", "setEnter", "(Lkotlin/jvm/functions/Function1;)V", "exit", "getExit$annotations", "getExit", "setExit", y04.TIME_STYLE_LEFT_DIR_NAME, "getLeft", "setLeft", "next", "getNext", "setNext", "previous", "getPrevious", "setPrevious", y04.TIME_STYLE_RIGHT_DIR_NAME, "getRight", "setRight", "start", "getStart", "setStart", y04.TIME_STYLE_UP_DIR_NAME, "getUp", "setUp", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface FocusProperties {
    @ExperimentalComposeUiApi
    static /* synthetic */ void getEnter$annotations() {
    }

    @ExperimentalComposeUiApi
    static /* synthetic */ void getExit$annotations() {
    }

    boolean getCanFocus();

    @NotNull
    default FocusRequester getDown() {
        return FocusRequester.INSTANCE.getDefault();
    }

    @NotNull
    default FocusRequester getEnd() {
        return FocusRequester.INSTANCE.getDefault();
    }

    @ExperimentalComposeUiApi
    @NotNull
    default Function1<FocusDirection, FocusRequester> getEnter() {
        return new Function1<FocusDirection, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusProperties$enter$1
            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
                return m1328invoke3ESFkO8(focusDirection.getValue());
            }

            @NotNull
            /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final FocusRequester m1328invoke3ESFkO8(int i) {
                return FocusRequester.INSTANCE.getDefault();
            }
        };
    }

    @ExperimentalComposeUiApi
    @NotNull
    default Function1<FocusDirection, FocusRequester> getExit() {
        return new Function1<FocusDirection, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusProperties$exit$1
            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
                return m1329invoke3ESFkO8(focusDirection.getValue());
            }

            @NotNull
            /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final FocusRequester m1329invoke3ESFkO8(int i) {
                return FocusRequester.INSTANCE.getDefault();
            }
        };
    }

    @NotNull
    default FocusRequester getLeft() {
        return FocusRequester.INSTANCE.getDefault();
    }

    @NotNull
    default FocusRequester getNext() {
        return FocusRequester.INSTANCE.getDefault();
    }

    @NotNull
    default FocusRequester getPrevious() {
        return FocusRequester.INSTANCE.getDefault();
    }

    @NotNull
    default FocusRequester getRight() {
        return FocusRequester.INSTANCE.getDefault();
    }

    @NotNull
    default FocusRequester getStart() {
        return FocusRequester.INSTANCE.getDefault();
    }

    @NotNull
    default FocusRequester getUp() {
        return FocusRequester.INSTANCE.getDefault();
    }

    void setCanFocus(boolean z);

    default void setDown(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    default void setEnd(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    @ExperimentalComposeUiApi
    default void setEnter(@NotNull Function1<? super FocusDirection, FocusRequester> function1) {
        Intrinsics.checkNotNullParameter(function1, "<anonymous parameter 0>");
    }

    @ExperimentalComposeUiApi
    default void setExit(@NotNull Function1<? super FocusDirection, FocusRequester> function1) {
        Intrinsics.checkNotNullParameter(function1, "<anonymous parameter 0>");
    }

    default void setLeft(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    default void setNext(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    default void setPrevious(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    default void setRight(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    default void setStart(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    default void setUp(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }
}
