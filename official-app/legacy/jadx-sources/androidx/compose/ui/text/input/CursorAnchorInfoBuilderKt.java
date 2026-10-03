package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.oplus.aiunit.vision.jla;
import com.oplus.smartenginehelper.entity.ImageEntity;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001c\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {jla.DEFAULT_BUILD_METHOD, "Landroid/view/inputmethod/CursorAnchorInfo;", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", ImageEntity.SCALE_TYPE_MATRIX, "Landroid/graphics/Matrix;", "setInsertionMarker", "selectionStart", "", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CursorAnchorInfoBuilderKt {
    @NotNull
    public static final CursorAnchorInfo build(@NotNull CursorAnchorInfo.Builder builder, @NotNull TextFieldValue textFieldValue, @NotNull TextLayoutResult textLayoutResult, @NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        builder.reset();
        builder.setMatrix(matrix);
        int iM3641getMinimpl = TextRange.m3641getMinimpl(textFieldValue.getSelection());
        builder.setSelectionRange(iM3641getMinimpl, TextRange.m3640getMaximpl(textFieldValue.getSelection()));
        setInsertionMarker(builder, iM3641getMinimpl, textLayoutResult);
        TextRange composition = textFieldValue.getComposition();
        int iM3641getMinimpl2 = composition != null ? TextRange.m3641getMinimpl(composition.getPackedValue()) : -1;
        TextRange composition2 = textFieldValue.getComposition();
        int iM3640getMaximpl = composition2 != null ? TextRange.m3640getMaximpl(composition2.getPackedValue()) : -1;
        boolean z = false;
        if (iM3641getMinimpl2 >= 0 && iM3641getMinimpl2 < iM3640getMaximpl) {
            z = true;
        }
        if (z) {
            builder.setComposingText(iM3641getMinimpl2, textFieldValue.getText().subSequence(iM3641getMinimpl2, iM3640getMaximpl));
        }
        CursorAnchorInfo cursorAnchorInfoBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(cursorAnchorInfoBuild, "build()");
        return cursorAnchorInfoBuild;
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i, TextLayoutResult textLayoutResult) {
        if (i < 0) {
            return builder;
        }
        Rect cursorRect = textLayoutResult.getCursorRect(i);
        builder.setInsertionMarkerLocation(cursorRect.getLeft(), cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), textLayoutResult.getBidiRunDirection(i) == ResolvedTextDirection.Rtl ? 4 : 0);
        return builder;
    }
}
