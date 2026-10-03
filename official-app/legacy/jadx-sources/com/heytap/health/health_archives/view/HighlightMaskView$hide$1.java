package com.heytap.health.health_archives.view;

import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class HighlightMaskView$hide$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ HighlightMaskView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightMaskView$hide$1(HighlightMaskView highlightMaskView) {
        super(0);
        this.this$0 = highlightMaskView;
    }

    @Override // p010kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.setVisibility(8);
        Function0<Unit> onDismissListener = this.this$0.getOnDismissListener();
        if (onDismissListener != null) {
            onDismissListener.invoke();
        }
    }
}
