package com.heytap.health.sunshine.ui.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import com.oplus.aiunit.vision.VitaminAnalyzeData;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.sequences.Sequence;
import p010kotlin.sequences.SequencesKt__SequencesKt;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/sunshine/ui/compose/VitaminAnalyzeDataPreviewParameter;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/oplus/aiunit/vision/x1l;", "Lkotlin/sequences/Sequence;", "a", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "values", "<init>", "()V", "sunshine_release"}, k = 1, mv = {1, 8, 0})
public final class VitaminAnalyzeDataPreviewParameter implements PreviewParameterProvider<VitaminAnalyzeData> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Sequence<VitaminAnalyzeData> values = SequencesKt__SequencesKt.sequenceOf(new VitaminAnalyzeData(400, 90, 1, null, 8, null));

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    @NotNull
    public Sequence<VitaminAnalyzeData> getValues() {
        return this.values;
    }
}
