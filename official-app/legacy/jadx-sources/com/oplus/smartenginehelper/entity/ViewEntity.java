package com.oplus.smartenginehelper.entity;

import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bR\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\b&\u0018\u0000 ¢\u00012\u00020\u0001:\u0002¢\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0003J\u000e\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\rJ\u000e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001aJ\u000e\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u001aJ\u000e\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u001aJ\u000e\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u001aJ\u000e\u0010'\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010(\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010)\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010*\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\rJ\u000e\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0017J\u000e\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u0003J\u000e\u00101\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u00102\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u0017J\u000e\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u0017J\u000e\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u0017J\u000e\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\rJ\u000e\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\rJ\u000e\u0010=\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u0003J\u000e\u0010?\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\rJ\u000e\u0010A\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010B\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010C\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010D\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\rJ\u000e\u0010G\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020\u0003J\u000e\u0010I\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\rJ\u000e\u0010K\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u0017J\u000e\u0010M\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u0017J\u000e\u0010O\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\u0017J\u000e\u0010Q\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020\rJ\u000e\u0010S\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020\u0017J\u000e\u0010U\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020\u0017J\u000e\u0010W\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020\u0017J\u000e\u0010Y\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u0017J\u000e\u0010[\u001a\u00020\u000b2\u0006\u0010\\\u001a\u00020\u0017J\u000e\u0010[\u001a\u00020\u000b2\u0006\u0010\\\u001a\u00020\u0003J\u000e\u0010]\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020\u0017J\u000e\u0010]\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020\u0003J\u000e\u0010_\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u0017J\u000e\u0010a\u001a\u00020\u000b2\u0006\u0010b\u001a\u00020\u0017J\u000e\u0010c\u001a\u00020\u000b2\u0006\u0010d\u001a\u00020\u0017J\u000e\u0010e\u001a\u00020\u000b2\u0006\u0010f\u001a\u00020\u0017J\u000e\u0010g\u001a\u00020\u000b2\u0006\u0010h\u001a\u00020\u0017J\u000e\u0010i\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020\u0017J\u001f\u0010k\u001a\u00020\u000b2\u0012\u0010l\u001a\n\u0012\u0006\b\u0001\u0012\u00020n0m\"\u00020n¢\u0006\u0002\u0010oJ\u000e\u0010p\u001a\u00020\u000b2\u0006\u0010q\u001a\u00020rJ\u000e\u0010s\u001a\u00020\u000b2\u0006\u0010t\u001a\u00020uJ\u000e\u0010v\u001a\u00020\u000b2\u0006\u0010w\u001a\u00020xJ\u000e\u0010y\u001a\u00020\u000b2\u0006\u0010z\u001a\u00020{J\u000e\u0010|\u001a\u00020\u000b2\u0006\u0010}\u001a\u00020~J\u000f\u0010\u007f\u001a\u00020\u000b2\u0007\u0010\u0080\u0001\u001a\u00020\u0017J\u0010\u0010\u0081\u0001\u001a\u00020\u000b2\u0007\u0010\u0082\u0001\u001a\u00020\u0017J\u0010\u0010\u0083\u0001\u001a\u00020\u000b2\u0007\u0010\u0084\u0001\u001a\u00020\u0017J\u0010\u0010\u0085\u0001\u001a\u00020\u000b2\u0007\u0010\u0086\u0001\u001a\u00020\u0017J\u0010\u0010\u0087\u0001\u001a\u00020\u000b2\u0007\u0010\u0088\u0001\u001a\u00020\rJ\u0010\u0010\u0089\u0001\u001a\u00020\u000b2\u0007\u0010\u008a\u0001\u001a\u00020\rJ\u0010\u0010\u008b\u0001\u001a\u00020\u000b2\u0007\u0010\u008c\u0001\u001a\u00020\rJ\u0010\u0010\u008d\u0001\u001a\u00020\u000b2\u0007\u0010\u008e\u0001\u001a\u00020\rJ\u0010\u0010\u008f\u0001\u001a\u00020\u000b2\u0007\u0010\u0090\u0001\u001a\u00020\rJ\u0010\u0010\u0091\u0001\u001a\u00020\u000b2\u0007\u0010\u0092\u0001\u001a\u00020\rJ\u0010\u0010\u0093\u0001\u001a\u00020\u000b2\u0007\u0010\u0094\u0001\u001a\u00020\rJ\u0010\u0010\u0095\u0001\u001a\u00020\u000b2\u0007\u0010\u0096\u0001\u001a\u00020\u0010J\u0010\u0010\u0097\u0001\u001a\u00020\u000b2\u0007\u0010\u0098\u0001\u001a\u00020\u0003J\u000f\u0010\u0099\u0001\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u009a\u0001\u001a\u00020\u000b2\u0007\u0010\u009b\u0001\u001a\u00020\rJ\u0010\u0010\u009c\u0001\u001a\u00020\u000b2\u0007\u0010\u009d\u0001\u001a\u00020\rJ\u0010\u0010\u009e\u0001\u001a\u00020\u000b2\u0007\u0010\u009f\u0001\u001a\u00020\rJ\u0010\u0010 \u0001\u001a\u00020\u000b2\u0007\u0010¡\u0001\u001a\u00020\u0017J\u0010\u0010 \u0001\u001a\u00020\u000b2\u0007\u0010¡\u0001\u001a\u00020\u0003R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006£\u0001"}, d2 = {"Lcom/oplus/smartenginehelper/entity/ViewEntity;", "", "id", "", "(Ljava/lang/String;)V", "mJSONObject", "Lorg/json/JSONObject;", "getMJSONObject", "()Lorg/json/JSONObject;", "getJSONObject", ClickApiEntity.SET_ALPHA, "", "alpha", "", "setAnim", "animEntity", "Lcom/oplus/smartenginehelper/entity/AnimEntity;", ClickApiEntity.SET_BACKGROUND, "drawableEntity", "Lcom/oplus/smartenginehelper/entity/DrawableEntity;", "background", "setBackgroundResource", "resId", "", "setClickable", ViewEntity.CLICKABLE, "", "setContentDescription", ViewEntity.CONTENT_DESCRIPTION, "setElevation", "elevation", ClickApiEntity.SET_ENABLED, ViewEntity.ENABLED, "setForceDarkAllowed", ViewEntity.FORCE_DARK_ALLOWED, "setLayoutConstrainedHeight", "constrainedHeight", "setLayoutConstrainedWidth", "constrainedWidth", "setLayoutConstraintBaselineToBaselineOf", "setLayoutConstraintBottomToBottomOf", "setLayoutConstraintBottomToTopOf", "setLayoutConstraintCircle", "setLayoutConstraintCircleAngle", "circleAngle", "setLayoutConstraintCircleRadius", "circleRadius", "setLayoutConstraintDimensionRatio", "constraintDimensionRation", "setLayoutConstraintEndToEndOf", "setLayoutConstraintEndToStartOf", "setLayoutConstraintHeightDefault", "constraintHeightDefault", "setLayoutConstraintHeightMax", "constraintHeightMax", "setLayoutConstraintHeightMin", "constraintHeightMin", "setLayoutConstraintHeightPercent", "constraintHeightPercent", "setLayoutConstraintHorizontalBias", "horizontalBias", "setLayoutConstraintHorizontalChainStyle", "constraintHorizontalChainStyle", "setLayoutConstraintHorizontalWeight", "constraintHorizontalWeight", "setLayoutConstraintStartToEndOf", "setLayoutConstraintStartToStartOf", "setLayoutConstraintTopToBottomOf", "setLayoutConstraintTopToTopOf", "setLayoutConstraintVerticalBias", "verticalBias", "setLayoutConstraintVerticalChainStyle", "constraintVerticalChainStyle", "setLayoutConstraintVerticalWeight", "constraintVerticalWeight", "setLayoutConstraintWidthDefault", "constraintWidthDefault", "setLayoutConstraintWidthMax", "constraintWidthMax", "setLayoutConstraintWidthMin", "constraintWidthMin", "setLayoutConstraintWidthPercent", "constraintWidthPercent", "setLayoutGoneBottomMargin", "goneBottomMargin", "setLayoutGoneEndMargin", "goneEndMargin", "setLayoutGoneStartMargin", "goneStartMargin", "setLayoutGoneTopMargin", "goneTopMargin", "setLayoutHeight", "layoutHeight", "setLayoutWidth", "layoutWidth", "setMarginBottom", "marginBottom", "setMarginEnd", "marginEnd", "setMarginStart", "marginStart", "setMarginTop", "marginTop", "setMinHeight", ViewEntity.MIN_HEIGHT, "setMinWidth", ViewEntity.MIN_WIDTH, "setOnClick", "clickEntities", "", "Lcom/oplus/smartenginehelper/entity/ClickEntity;", "([Lcom/oplus/smartenginehelper/entity/ClickEntity;)V", "setOnClickApi", "clickApiEntity", "Lcom/oplus/smartenginehelper/entity/ClickApiEntity;", "setOnClickStartActivity", "startActivityClickEntity", "Lcom/oplus/smartenginehelper/entity/StartActivityClickEntity;", "setOnClickStartAnim", "startAnimClickEntity", "Lcom/oplus/smartenginehelper/entity/StartAnimClickEntity;", "setOnClickStartContentProvider", "contentProviderClickEntity", "Lcom/oplus/smartenginehelper/entity/ContentProviderClickEntity;", "setOnClickStartService", "startServiceClickEntity", "Lcom/oplus/smartenginehelper/entity/StartServiceClickEntity;", "setPaddingBottom", "paddingBottom", "setPaddingEnd", "paddingEnd", "setPaddingStart", "paddingStart", "setPaddingTop", "paddingTop", "setPivotX", "pivotX", "setPivotY", "pivotY", "setRotation", "rotation", "setRotationX", "rotationX", "setRotationY", "rotationY", "setScaleX", "scaleX", "setScaleY", "scaleY", "setSliverAnim", "sliverAnimEntity", "setStateListAnimator", "stateListAnimator", "setStateListAnimatorResource", "setTranslationX", "translationX", "setTranslationY", "translationY", "setTranslationZ", "translationZ", ClickApiEntity.SET_VISIBILITY, "visibility", "Companion", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public abstract class ViewEntity {

    @NotNull
    public static final String ALPHA = "alpha";

    @NotNull
    public static final String BACKGROUND = "background";

    @NotNull
    public static final String CLICKABLE = "clickable";

    @NotNull
    public static final String CONTENT_DESCRIPTION = "contentDescription";

    @NotNull
    public static final String ELEVATION = "elevation";

    @NotNull
    public static final String ENABLED = "enabled";

    @NotNull
    public static final String FORCE_DARK_ALLOWED = "forceDarkAllowed";

    @NotNull
    public static final String HEIGHT = "layout_height";

    @NotNull
    public static final String MARGIN_BOTTOM = "layout_marginBottom";

    @NotNull
    public static final String MARGIN_END = "layout_marginEnd";

    @NotNull
    public static final String MARGIN_START = "layout_marginStart";

    @NotNull
    public static final String MARGIN_TOP = "layout_marginTop";

    @NotNull
    public static final String MATCH_PARENT = "match_parent";

    @NotNull
    public static final String MIN_HEIGHT = "minHeight";

    @NotNull
    public static final String MIN_WIDTH = "minWidth";

    @NotNull
    public static final String PADDING_BOTTOM = "paddingBottom";

    @NotNull
    public static final String PADDING_END = "paddingEnd";

    @NotNull
    public static final String PADDING_START = "paddingStart";

    @NotNull
    public static final String PADDING_TOP = "paddingTop";

    @NotNull
    public static final String ROTATION = "rotation";

    @NotNull
    public static final String ROTATION_X = "rotationX";

    @NotNull
    public static final String ROTATION_Y = "rotationY";

    @NotNull
    public static final String SCALE_X = "scaleX";

    @NotNull
    public static final String SCALE_Y = "scaleY";

    @NotNull
    public static final String STATE_LIST_ANIMATOR = "stateListAnimator";

    @NotNull
    public static final String TRANSFORM_PIVOT_X = "transformPivotX";

    @NotNull
    public static final String TRANSFORM_PIVOT_Y = "transformPivotY";

    @NotNull
    public static final String TRANSLATION_X = "translationX";

    @NotNull
    public static final String TRANSLATION_Y = "translationY";

    @NotNull
    public static final String TRANSLATION_Z = "translationZ";

    @NotNull
    public static final String VISIBILITY = "visibility";

    @NotNull
    public static final String WIDTH = "layout_width";

    @NotNull
    public static final String WRAP_CONTENT = "wrap_content";

    @NotNull
    private final JSONObject mJSONObject;

    public ViewEntity(@NotNull String id) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        JSONObject jSONObject = new JSONObject();
        this.mJSONObject = jSONObject;
        jSONObject.put("id", id);
    }

    @NotNull
    /* JADX INFO: renamed from: getJSONObject, reason: from getter */
    public final JSONObject getMJSONObject() {
        return this.mJSONObject;
    }

    @NotNull
    public final JSONObject getMJSONObject() {
        return this.mJSONObject;
    }

    public final void setAlpha(float alpha) throws JSONException {
        this.mJSONObject.put("alpha", Float.valueOf(alpha));
    }

    public final void setAnim(@NotNull AnimEntity animEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(animEntity, "animEntity");
        this.mJSONObject.put(ParserTag.TAG_ANIM, animEntity.getMJSONObject());
    }

    public final void setBackground(@NotNull String background) throws JSONException {
        Intrinsics.checkNotNullParameter(background, "background");
        this.mJSONObject.put("background", background);
    }

    public final void setBackgroundResource(int resId) throws JSONException {
        this.mJSONObject.put("background", resId);
    }

    public final void setClickable(boolean clickable) throws JSONException {
        this.mJSONObject.put(CLICKABLE, clickable);
    }

    public final void setContentDescription(@NotNull String contentDescription) throws JSONException {
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.mJSONObject.put(CONTENT_DESCRIPTION, contentDescription);
    }

    public final void setElevation(float elevation) throws JSONException {
        this.mJSONObject.put("elevation", Float.valueOf(elevation));
    }

    public final void setEnabled(boolean enabled) throws JSONException {
        this.mJSONObject.put(ENABLED, enabled);
    }

    public final void setForceDarkAllowed(boolean forceDarkAllowed) throws JSONException {
        this.mJSONObject.put(FORCE_DARK_ALLOWED, forceDarkAllowed);
    }

    public final void setLayoutConstrainedHeight(boolean constrainedHeight) throws JSONException {
        this.mJSONObject.put(ConstraintEntity.CONSTRAINED_HEIGHT, constrainedHeight);
    }

    public final void setLayoutConstrainedWidth(boolean constrainedWidth) throws JSONException {
        this.mJSONObject.put(ConstraintEntity.CONSTRAINED_WIDTH, constrainedWidth);
    }

    public final void setLayoutConstraintBaselineToBaselineOf(@NotNull String id) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        this.mJSONObject.put(ConstraintEntity.BASELINE_TO_BASELINE, id);
    }

    public final void setLayoutConstraintBottomToBottomOf(@NotNull String id) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        this.mJSONObject.put(ConstraintEntity.BOTTOM_TO_BOTTOM, id);
    }

    public final void setLayoutConstraintBottomToTopOf(@NotNull String id) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        this.mJSONObject.put(ConstraintEntity.BOTTOM_TO_TOP, id);
    }

    public final void setLayoutConstraintCircle(@NotNull String id) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        this.mJSONObject.put(ConstraintEntity.CIRCLE, id);
    }

    public final void setLayoutConstraintCircleAngle(float circleAngle) throws JSONException {
        this.mJSONObject.put(ConstraintEntity.CIRCLE_ANGLE, Float.valueOf(circleAngle));
    }

    public final void setLayoutConstraintCircleRadius(int circleRadius) throws JSONException {
        this.mJSONObject.put(ConstraintEntity.CIRCLE_RADIUS, circleRadius);
    }

    public final void setLayoutConstraintDimensionRatio(@NotNull String constraintDimensionRation) throws JSONException {
        Intrinsics.checkNotNullParameter(constraintDimensionRation, "constraintDimensionRation");
        this.mJSONObject.put(ConstraintEntity.MATCH_CONSTRAINT_DIMENSION_RATIO, constraintDimensionRation);
    }

    public final void setLayoutConstraintEndToEndOf(@NotNull String id) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        this.mJSONObject.put(ConstraintEntity.END_TO_END, id);
    }

    public final void setLayoutConstraintEndToStartOf(@NotNull String id) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        this.mJSONObject.put(ConstraintEntity.END_TO_START, id);
    }

    public final void setLayoutConstraintHeightDefault(int constraintHeightDefault) throws JSONException {
        this.mJSONObject.put(ConstraintEntity.MATCH_CONSTRAINT_DEFAULT_HEIGHT, constraintHeightDefault);
    }

    public final void setLayoutConstraintHeightMax(int constraintHeightMax) throws JSONException {
        this.mJSONObject.put(ConstraintEntity.MATCH_CONSTRAINT_HEIGHT_MAX, constraintHeightMax);
    }

    public final void setLayoutConstraintHeightMin(int constraintHeightMin) throws JSONException {
        this.mJSONObject.put(ConstraintEntity.MATCH_CONSTRAINT_HEIGHT_MIN, constraintHeightMin);
    }

    public final void setLayoutConstraintHeightPercent(float constraintHeightPercent) throws JSONException {
        this.mJSONObject.put(ConstraintEntity.MATCH_CONSTRAINT_HEIGHT_PERCENT, Float.valueOf(constraintHeightPercent));
    }

    public final void setLayoutConstraintHorizontalBias(float horizontalBias) throws JSONException {
        this.mJSONObject.put(ConstraintEntity.HORIZONTAL_BIAS, Float.valueOf(horizontalBias));
    }

    public final void setLayoutConstraintHorizontalChainStyle(@NotNull String constraintHorizontalChainStyle) throws JSONException {
        Intrinsics.checkNotNullParameter(constraintHorizontalChainStyle, "constraintHorizontalChainStyle");
        this.mJSONObject.put(ConstraintEntity.MATCH_CONSTRAINT_HORIZONTAL_CHAIN_STYLE, constraintHorizontalChainStyle);
    }

    public final void setLayoutConstraintHorizontalWeight(float constraintHorizontalWeight) throws JSONException {
        this.mJSONObject.put(ConstraintEntity.CONSTRAINT_HORIZONTAL_WEIGHT, Float.valueOf(constraintHorizontalWeight));
    }

    public final void setLayoutConstraintStartToEndOf(@NotNull String id) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        this.mJSONObject.put(ConstraintEntity.START_TO_END, id);
    }

    public final void setLayoutConstraintStartToStartOf(@NotNull String id) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        this.mJSONObject.put(ConstraintEntity.START_TO_START, id);
    }

    public final void setLayoutConstraintTopToBottomOf(@NotNull String id) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        this.mJSONObject.put(ConstraintEntity.TOP_TO_BOTTOM, id);
    }

    public final void setLayoutConstraintTopToTopOf(@NotNull String id) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        this.mJSONObject.put(ConstraintEntity.TOP_TO_TOP, id);
    }

    public final void setLayoutConstraintVerticalBias(float verticalBias) throws JSONException {
        this.mJSONObject.put(ConstraintEntity.VERTICAL_BIAS, Float.valueOf(verticalBias));
    }

    public final void setLayoutConstraintVerticalChainStyle(@NotNull String constraintVerticalChainStyle) throws JSONException {
        Intrinsics.checkNotNullParameter(constraintVerticalChainStyle, "constraintVerticalChainStyle");
        this.mJSONObject.put(ConstraintEntity.MATCH_CONSTRAINT_VERTICAL_CHAIN_STYLE, constraintVerticalChainStyle);
    }

    public final void setLayoutConstraintVerticalWeight(float constraintVerticalWeight) throws JSONException {
        this.mJSONObject.put(ConstraintEntity.CONSTRAINT_VERTICAL_WEIGHT, Float.valueOf(constraintVerticalWeight));
    }

    public final void setLayoutConstraintWidthDefault(int constraintWidthDefault) throws JSONException {
        this.mJSONObject.put(ConstraintEntity.MATCH_CONSTRAINT_DEFAULT_WIDTH, constraintWidthDefault);
    }

    public final void setLayoutConstraintWidthMax(int constraintWidthMax) throws JSONException {
        this.mJSONObject.put(ConstraintEntity.MATCH_CONSTRAINT_WIDTH_MAX, constraintWidthMax);
    }

    public final void setLayoutConstraintWidthMin(int constraintWidthMin) throws JSONException {
        this.mJSONObject.put(ConstraintEntity.MATCH_CONSTRAINT_WIDTH_MIN, constraintWidthMin);
    }

    public final void setLayoutConstraintWidthPercent(float constraintWidthPercent) throws JSONException {
        this.mJSONObject.put(ConstraintEntity.MATCH_CONSTRAINT_WIDTH_PERCENT, Float.valueOf(constraintWidthPercent));
    }

    public final void setLayoutGoneBottomMargin(int goneBottomMargin) throws JSONException {
        this.mJSONObject.put(ConstraintEntity.GONE_MARGIN_BOTTOM, goneBottomMargin);
    }

    public final void setLayoutGoneEndMargin(int goneEndMargin) throws JSONException {
        this.mJSONObject.put(ConstraintEntity.GONE_MARGIN_END, goneEndMargin);
    }

    public final void setLayoutGoneStartMargin(int goneStartMargin) throws JSONException {
        this.mJSONObject.put(ConstraintEntity.GONE_MARGIN_START, goneStartMargin);
    }

    public final void setLayoutGoneTopMargin(int goneTopMargin) throws JSONException {
        this.mJSONObject.put(ConstraintEntity.GONE_MARGIN_TOP, goneTopMargin);
    }

    public final void setLayoutHeight(@NotNull String layoutHeight) throws JSONException {
        Intrinsics.checkNotNullParameter(layoutHeight, "layoutHeight");
        this.mJSONObject.put("layout_height", layoutHeight);
    }

    public final void setLayoutWidth(@NotNull String layoutWidth) throws JSONException {
        Intrinsics.checkNotNullParameter(layoutWidth, "layoutWidth");
        this.mJSONObject.put("layout_width", layoutWidth);
    }

    public final void setMarginBottom(int marginBottom) throws JSONException {
        this.mJSONObject.put("layout_marginBottom", marginBottom);
    }

    public final void setMarginEnd(int marginEnd) throws JSONException {
        this.mJSONObject.put("layout_marginEnd", marginEnd);
    }

    public final void setMarginStart(int marginStart) throws JSONException {
        this.mJSONObject.put("layout_marginStart", marginStart);
    }

    public final void setMarginTop(int marginTop) throws JSONException {
        this.mJSONObject.put("layout_marginTop", marginTop);
    }

    public final void setMinHeight(int minHeight) throws JSONException {
        this.mJSONObject.put(MIN_HEIGHT, minHeight);
    }

    public final void setMinWidth(int minWidth) throws JSONException {
        this.mJSONObject.put(MIN_WIDTH, minWidth);
    }

    public final void setOnClick(@NotNull ClickEntity... clickEntities) throws JSONException {
        Intrinsics.checkNotNullParameter(clickEntities, "clickEntities");
        JSONArray jSONArray = new JSONArray();
        for (ClickEntity clickEntity : clickEntities) {
            jSONArray.put(clickEntity.getMJSONObject());
        }
        this.mJSONObject.put(ParserTag.TAG_ONCLICK, jSONArray);
    }

    public final void setOnClickApi(@NotNull ClickApiEntity clickApiEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(clickApiEntity, "clickApiEntity");
        this.mJSONObject.put(ParserTag.TAG_ONCLICK, clickApiEntity.getMJSONObject());
    }

    public final void setOnClickStartActivity(@NotNull StartActivityClickEntity startActivityClickEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startActivityClickEntity, "startActivityClickEntity");
        this.mJSONObject.put(ParserTag.TAG_ONCLICK, startActivityClickEntity.getMJSONObject());
    }

    public final void setOnClickStartAnim(@NotNull StartAnimClickEntity startAnimClickEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startAnimClickEntity, "startAnimClickEntity");
        this.mJSONObject.put(ParserTag.TAG_ONCLICK, startAnimClickEntity.getMJSONObject());
    }

    public final void setOnClickStartContentProvider(@NotNull ContentProviderClickEntity contentProviderClickEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(contentProviderClickEntity, "contentProviderClickEntity");
        this.mJSONObject.put(ParserTag.TAG_ONCLICK, contentProviderClickEntity.getMJSONObject());
    }

    public final void setOnClickStartService(@NotNull StartServiceClickEntity startServiceClickEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startServiceClickEntity, "startServiceClickEntity");
        this.mJSONObject.put(ParserTag.TAG_ONCLICK, startServiceClickEntity.getMJSONObject());
    }

    public final void setPaddingBottom(int paddingBottom) throws JSONException {
        this.mJSONObject.put("paddingBottom", paddingBottom);
    }

    public final void setPaddingEnd(int paddingEnd) throws JSONException {
        this.mJSONObject.put("paddingEnd", paddingEnd);
    }

    public final void setPaddingStart(int paddingStart) throws JSONException {
        this.mJSONObject.put("paddingStart", paddingStart);
    }

    public final void setPaddingTop(int paddingTop) throws JSONException {
        this.mJSONObject.put("paddingTop", paddingTop);
    }

    public final void setPivotX(float pivotX) throws JSONException {
        this.mJSONObject.put("transformPivotX", Float.valueOf(pivotX));
    }

    public final void setPivotY(float pivotY) throws JSONException {
        this.mJSONObject.put("transformPivotY", Float.valueOf(pivotY));
    }

    public final void setRotation(float rotation) throws JSONException {
        this.mJSONObject.put("rotation", Float.valueOf(rotation));
    }

    public final void setRotationX(float rotationX) throws JSONException {
        this.mJSONObject.put("rotationX", Float.valueOf(rotationX));
    }

    public final void setRotationY(float rotationY) throws JSONException {
        this.mJSONObject.put("rotationY", Float.valueOf(rotationY));
    }

    public final void setScaleX(float scaleX) throws JSONException {
        this.mJSONObject.put("scaleX", Float.valueOf(scaleX));
    }

    public final void setScaleY(float scaleY) throws JSONException {
        this.mJSONObject.put("scaleY", Float.valueOf(scaleY));
    }

    public final void setSliverAnim(@NotNull AnimEntity sliverAnimEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(sliverAnimEntity, "sliverAnimEntity");
        this.mJSONObject.put(ParserTag.TAG_SLIVER_ANIM, sliverAnimEntity.getMJSONObject());
    }

    public final void setStateListAnimator(@NotNull String stateListAnimator) throws JSONException {
        Intrinsics.checkNotNullParameter(stateListAnimator, "stateListAnimator");
        this.mJSONObject.put("stateListAnimator", stateListAnimator);
    }

    public final void setStateListAnimatorResource(int resId) throws JSONException {
        this.mJSONObject.put("stateListAnimator", resId);
    }

    public final void setTranslationX(float translationX) throws JSONException {
        this.mJSONObject.put("translationX", Float.valueOf(translationX));
    }

    public final void setTranslationY(float translationY) throws JSONException {
        this.mJSONObject.put("translationY", Float.valueOf(translationY));
    }

    public final void setTranslationZ(float translationZ) throws JSONException {
        this.mJSONObject.put("translationZ", Float.valueOf(translationZ));
    }

    public final void setVisibility(@NotNull String visibility) throws JSONException {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.mJSONObject.put("visibility", visibility);
    }

    public final void setBackground(@NotNull DrawableEntity drawableEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(drawableEntity, "drawableEntity");
        this.mJSONObject.put("background", drawableEntity.getMJSONObject());
    }

    public final void setLayoutHeight(int layoutHeight) throws JSONException {
        String strValueOf;
        if (layoutHeight != -2) {
            strValueOf = layoutHeight != -1 ? String.valueOf(layoutHeight) : MATCH_PARENT;
        } else {
            strValueOf = WRAP_CONTENT;
        }
        this.mJSONObject.put("layout_height", strValueOf);
    }

    public final void setLayoutWidth(int layoutWidth) throws JSONException {
        String strValueOf;
        if (layoutWidth != -2) {
            strValueOf = layoutWidth != -1 ? String.valueOf(layoutWidth) : MATCH_PARENT;
        } else {
            strValueOf = WRAP_CONTENT;
        }
        this.mJSONObject.put("layout_width", strValueOf);
    }

    public final void setVisibility(int visibility) throws JSONException {
        this.mJSONObject.put("visibility", visibility);
    }
}
