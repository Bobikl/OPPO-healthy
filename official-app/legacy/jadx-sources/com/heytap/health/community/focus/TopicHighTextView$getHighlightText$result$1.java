package com.heytap.health.community.focus;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;
import p010kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class TopicHighTextView$getHighlightText$result$1 extends Lambda implements Function1<MatchResult, String> {
    public static final TopicHighTextView$getHighlightText$result$1 INSTANCE = new TopicHighTextView$getHighlightText$result$1();

    public TopicHighTextView$getHighlightText$result$1() {
        super(1);
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final String invoke(@NotNull MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getGroupValues().get(1);
    }
}
