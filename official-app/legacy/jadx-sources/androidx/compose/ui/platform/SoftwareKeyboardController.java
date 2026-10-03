package androidx.compose.ui.platform;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.ReplaceWith;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H\u0017J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/SoftwareKeyboardController;", "", CardAction.LIFE_CIRCLE_VALUE_HIDE, "", "hideSoftwareKeyboard", CardAction.LIFE_CIRCLE_VALUE_SHOW, "showSoftwareKeyboard", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SoftwareKeyboardController {
    void hide();

    @Deprecated(message = "Use hide instead.", replaceWith = @ReplaceWith(expression = "hide()", imports = {}))
    default void hideSoftwareKeyboard() {
        hide();
    }

    void show();

    @Deprecated(message = "Use show instead.", replaceWith = @ReplaceWith(expression = "show()", imports = {}))
    default void showSoftwareKeyboard() {
        show();
    }
}
