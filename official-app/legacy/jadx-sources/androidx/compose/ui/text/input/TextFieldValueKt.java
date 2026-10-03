package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"getSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getTextAfterSelection", "maxChars", "", "getTextBeforeSelection", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldValueKt {
    @NotNull
    public static final AnnotatedString getSelectedText(@NotNull TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<this>");
        return textFieldValue.getText().m3520subSequence5zctL8(textFieldValue.getSelection());
    }

    @NotNull
    public static final AnnotatedString getTextAfterSelection(@NotNull TextFieldValue textFieldValue, int i) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<this>");
        return textFieldValue.getText().subSequence(TextRange.m3640getMaximpl(textFieldValue.getSelection()), Math.min(TextRange.m3640getMaximpl(textFieldValue.getSelection()) + i, textFieldValue.getText().length()));
    }

    @NotNull
    public static final AnnotatedString getTextBeforeSelection(@NotNull TextFieldValue textFieldValue, int i) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<this>");
        return textFieldValue.getText().subSequence(Math.max(0, TextRange.m3641getMinimpl(textFieldValue.getSelection()) - i), TextRange.m3641getMinimpl(textFieldValue.getSelection()));
    }
}
