package com.oplus.smartenginehelper.entity;

import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/oplus/smartenginehelper/entity/ConstraintEntity;", "Lcom/oplus/smartenginehelper/entity/ViewGroupEntity;", "id", "", "(Ljava/lang/String;)V", "Companion", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class ConstraintEntity extends ViewGroupEntity {

    @NotNull
    public static final String BASELINE_TO_BASELINE = "layout_constraintBaseline_toBaselineOf";

    @NotNull
    public static final String BOTTOM_TO_BOTTOM = "layout_constraintBottom_toBottomOf";

    @NotNull
    public static final String BOTTOM_TO_TOP = "layout_constraintBottom_toTopOf";

    @NotNull
    public static final String CIRCLE = "layout_constraintCircle";

    @NotNull
    public static final String CIRCLE_ANGLE = "layout_constraintCircleAngle";

    @NotNull
    public static final String CIRCLE_RADIUS = "layout_constraintCircleRadius";

    @NotNull
    public static final String CONSTRAINED_HEIGHT = "layout_constrainedHeight";

    @NotNull
    public static final String CONSTRAINED_WIDTH = "layout_constrainedWidth";

    @NotNull
    public static final String CONSTRAINT_HORIZONTAL_WEIGHT = "layout_constraintHorizontal_weight";

    @NotNull
    public static final String CONSTRAINT_VERTICAL_WEIGHT = "layout_constraintVertical_weight";

    @NotNull
    public static final String END_TO_END = "layout_constraintEnd_toEndOf";

    @NotNull
    public static final String END_TO_START = "layout_constraintEnd_toStartOf";

    @NotNull
    public static final String GONE_MARGIN_BOTTOM = "layout_goneMarginBottom";

    @NotNull
    public static final String GONE_MARGIN_END = "layout_goneMarginEnd";

    @NotNull
    public static final String GONE_MARGIN_START = "layout_goneMarginStart";

    @NotNull
    public static final String GONE_MARGIN_TOP = "layout_goneMarginTop";

    @NotNull
    public static final String HORIZONTAL_BIAS = "layout_constraintHorizontal_bias";

    @NotNull
    public static final String MATCH_CONSTRAINT_DEFAULT_HEIGHT = "layout_constraintHeight_default";

    @NotNull
    public static final String MATCH_CONSTRAINT_DEFAULT_WIDTH = "layout_constraintWidth_default";

    @NotNull
    public static final String MATCH_CONSTRAINT_DIMENSION_RATIO = "layout_constraintDimensionRatio";

    @NotNull
    public static final String MATCH_CONSTRAINT_HEIGHT_MAX = "layout_constraintHeight_max";

    @NotNull
    public static final String MATCH_CONSTRAINT_HEIGHT_MIN = "layout_constraintHeight_min";

    @NotNull
    public static final String MATCH_CONSTRAINT_HEIGHT_PERCENT = "layout_constraintHeight_percent";

    @NotNull
    public static final String MATCH_CONSTRAINT_HORIZONTAL_CHAIN_STYLE = "layout_constraintHorizontal_chainStyle";

    @NotNull
    public static final String MATCH_CONSTRAINT_VERTICAL_CHAIN_STYLE = "layout_constraintVertical_chainStyle";

    @NotNull
    public static final String MATCH_CONSTRAINT_WIDTH_MAX = "layout_constraintWidth_max";

    @NotNull
    public static final String MATCH_CONSTRAINT_WIDTH_MIN = "layout_constraintWidth_min";

    @NotNull
    public static final String MATCH_CONSTRAINT_WIDTH_PERCENT = "layout_constraintWidth_percent";

    @NotNull
    public static final String START_TO_END = "layout_constraintStart_toEndOf";

    @NotNull
    public static final String START_TO_START = "layout_constraintStart_toStartOf";

    @NotNull
    public static final String TOP_TO_BOTTOM = "layout_constraintTop_toBottomOf";

    @NotNull
    public static final String TOP_TO_TOP = "layout_constraintTop_toTopOf";

    @NotNull
    public static final String VERTICAL_BIAS = "layout_constraintVertical_bias";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintEntity(@NotNull String id) throws JSONException {
        super(id);
        Intrinsics.checkNotNullParameter(id, "id");
        getMJSONObject().put("type", ParserTag.TYPE_CONSTRAINT);
    }
}
