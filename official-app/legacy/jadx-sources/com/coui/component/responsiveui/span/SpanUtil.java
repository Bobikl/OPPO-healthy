package com.coui.component.responsiveui.span;

import com.coui.component.responsiveui.unit.Dp;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/coui/component/responsiveui/span/SpanUtil;", "", "()V", "Companion", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpanUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanUtil.kt\ncom/coui/component/responsiveui/span/SpanUtil\n+ 2 Dp.kt\ncom/coui/component/responsiveui/unit/DpKt\n*L\n1#1,77:1\n57#2:78\n*S KotlinDebug\n*F\n+ 1 SpanUtil.kt\ncom/coui/component/responsiveui/span/SpanUtil\n*L\n26#1:78\n*E\n"})
public final class SpanUtil {
    public static final int DEFAULT_COLUMNS_PER_SPAN = 4;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Dp a = new Dp(360);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bJ(\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\bJ\u0016\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/coui/component/responsiveui/span/SpanUtil$Companion;", "", "()V", "DEFAULT_BASE_WIDTH", "Lcom/coui/component/responsiveui/unit/Dp;", "getDEFAULT_BASE_WIDTH", "()Lcom/coui/component/responsiveui/unit/Dp;", "DEFAULT_COLUMNS_PER_SPAN", "", "calculateGapBetweenSpans", "", "windowWidth", "spanCounts", "spanWidth", "margin", "minGap", "calculateSpanCount", "baseWidth", "spanCountPerBaseWidth", "layoutGridWindowWidth", "minSpanCount", "totalColumns", "columnsPerSpan", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSpanUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanUtil.kt\ncom/coui/component/responsiveui/span/SpanUtil$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ float calculateGapBetweenSpans$default(Companion companion, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            if ((i6 & 16) != 0) {
                i5 = 1;
            }
            return companion.calculateGapBetweenSpans(i, i2, i3, i4, i5);
        }

        public static /* synthetic */ int calculateSpanCount$default(Companion companion, Dp dp, int i, Dp dp2, int i2, int i3, Object obj) {
            if ((i3 & 8) != 0) {
                i2 = i;
            }
            return companion.calculateSpanCount(dp, i, dp2, i2);
        }

        public final float calculateGapBetweenSpans(int windowWidth, int spanCounts, int spanWidth, int margin, int minGap) {
            if (!(spanCounts > 1)) {
                throw new IllegalArgumentException("spanCounts must be greater than 1");
            }
            if (minGap >= 0) {
                return RangesKt___RangesKt.coerceAtLeast(((windowWidth - (margin * 2)) - (spanWidth * spanCounts)) / (spanCounts - 1.0f), minGap);
            }
            throw new IllegalArgumentException("minGap must be equal or greater than 0");
        }

        public final int calculateSpanCount(int totalColumns, int columnsPerSpan) {
            if (!(totalColumns > 0)) {
                throw new IllegalArgumentException("totalColumns must be positive".toString());
            }
            if (!(columnsPerSpan > 0)) {
                throw new IllegalArgumentException("columnsPerSpan must be positive".toString());
            }
            if (columnsPerSpan <= totalColumns) {
                return totalColumns / columnsPerSpan;
            }
            throw new IllegalArgumentException("totalColumns must be equal or greater than columnsPerSpan".toString());
        }

        @NotNull
        public final Dp getDEFAULT_BASE_WIDTH() {
            return SpanUtil.a;
        }

        public final int calculateSpanCount(@NotNull Dp baseWidth, int spanCountPerBaseWidth, @NotNull Dp layoutGridWindowWidth, int minSpanCount) {
            Intrinsics.checkNotNullParameter(baseWidth, "baseWidth");
            Intrinsics.checkNotNullParameter(layoutGridWindowWidth, "layoutGridWindowWidth");
            if (spanCountPerBaseWidth >= 1) {
                return RangesKt___RangesKt.coerceAtLeast((int) (layoutGridWindowWidth.div(baseWidth).getValue() * spanCountPerBaseWidth), minSpanCount);
            }
            throw new IllegalArgumentException("spanCountPerBaseWidth must be equal or greater than 1".toString());
        }
    }
}
