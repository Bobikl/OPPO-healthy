package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class SelectionAdjustment$Companion$Word$1$adjust$1 extends FunctionReferenceImpl implements Function1<Integer, TextRange> {
    public SelectionAdjustment$Companion$Word$1$adjust$1(Object obj) {
        super(1, obj, TextLayoutResult.class, "getWordBoundary", "getWordBoundary--jx7JFs(I)J", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ TextRange invoke(Integer num) {
        return TextRange.m3631boximpl(m832invokejx7JFs(num.intValue()));
    }

    /* JADX INFO: renamed from: invoke--jx7JFs, reason: not valid java name */
    public final long m832invokejx7JFs(int i) {
        return ((TextLayoutResult) this.receiver).m3617getWordBoundaryjx7JFs(i);
    }
}
