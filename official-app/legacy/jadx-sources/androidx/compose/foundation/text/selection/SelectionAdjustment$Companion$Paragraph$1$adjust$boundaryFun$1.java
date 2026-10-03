package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.ui.text.TextRange;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1 extends FunctionReferenceImpl implements Function1<Integer, TextRange> {
    public SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1(Object obj) {
        super(1, obj, StringHelpersKt.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ TextRange invoke(Integer num) {
        return TextRange.m3631boximpl(m831invokejx7JFs(num.intValue()));
    }

    /* JADX INFO: renamed from: invoke--jx7JFs, reason: not valid java name */
    public final long m831invokejx7JFs(int i) {
        return StringHelpersKt.getParagraphBoundary((CharSequence) this.receiver, i);
    }
}
