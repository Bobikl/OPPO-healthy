package com.oplus.smartenginehelper;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0003\b\u008c\u0001\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010y\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010}\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010~\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u007f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0080\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0081\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0082\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0083\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0084\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0085\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0086\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0087\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0088\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0089\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008a\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008b\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008c\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008d\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008e\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008f\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0090\u0001"}, d2 = {"Lcom/oplus/smartenginehelper/ParserTag;", "", "()V", "ASSET_NAME", "", "AUTO_PLAY", "AUTO_SIZE_MAX_TEXT_TYPE", "AUTO_SIZE_MIN_TEXT_TYPE", "AUTO_SIZE_STEP_GRANULARITY", "AUTO_SIZE_TEXT_TYPE", "BACKGROUND", "CHILD", "CHILD_LAYOUT", "CLIP_TO_PADDING", "DATA", "DATA_SAME_COUNT", "DATA_VALUE", "DATA_VALUE_ARRAY", "GRAVITY", "HAS_FIXED_SIZE", "HEIGHT", "INCLUDE_FONT_PADDING", "LAYOUT_MANAGER", "LAYOUT_ORIENTATION", "LOOP", "MARGIN_BOTTOM", "MARGIN_END", "MARGIN_START", "MARGIN_TOP", "PACKAGE", "PADDING_BOTTOM", "PADDING_END", "PADDING_START", "PADDING_TOP", "PAGINATION_SCROLL_LISTENER", "REVERSE_LAYOUT", "SPAN_COUNT", "STATE_LIST_ANIMATOR", "SUPPORT_PAGINATION_LOAD", "TAG_ACTION", "TAG_ACTIVITY", "TAG_ADJUST_VIEW_BOUNDS", "TAG_AFTER", "TAG_ANIM", "TAG_ANIM_SET", "TAG_AUTO_ANIM", "TAG_BORDER_COLOR", "TAG_BORDER_RADIUS", "TAG_CATEGORY", "TAG_CHILD", "TAG_CLICK_ANIM", "TAG_COLORS", "TAG_CORNER_RADII", "TAG_CORNER_RADIUS", "TAG_CP", "TAG_CROP_TO_PADDING", "TAG_DATA", "TAG_DRAW", "TAG_DRAWABLE_ALPHA", "TAG_DRAWABLE_BOTTOM", "TAG_DRAWABLE_END", "TAG_DRAWABLE_PADDING", "TAG_DRAWABLE_START", "TAG_DRAWABLE_TOP", "TAG_DURATION", "TAG_ELLIPSIZE", "TAG_FLAG", "TAG_FROM_NUMBER", "TAG_GET", "TAG_GRADIENT_DRAWABLE", "TAG_GRADIENT_TYPE", "TAG_HAS_BORDER", "TAG_ID", "TAG_IMAGE_TYPE", "TAG_INDETERMINATE", "TAG_INDETERMINATE_DRAWABLE", "TAG_INDETERMINATE_TINT", "TAG_INDETERMINATE_TINT_MODE", "TAG_INTENT_TYPE", "TAG_INTERPOLATOR", "TAG_LAZY", "TAG_LINE_SPACING_EXTRA", "TAG_LINE_SPACING_MULTIPLIER", "TAG_MAX", "TAG_MAX_HEIGHT", "TAG_MAX_LENGTH", "TAG_MAX_LINES", "TAG_MAX_WIDTH", "TAG_METHOD", "TAG_MIN", "TAG_MIN_LINES", "TAG_NUMBER", "TAG_OFFSETS", "TAG_ONCLICK", "TAG_ON_ANIMATION_CANCEL", "TAG_ON_ANIMATION_END", "TAG_ON_ANIMATION_REPEAT", "TAG_ON_ANIMATION_START", "TAG_ORIENTATION", "TAG_PACKAGE_NAME", "TAG_PARAMS", "TAG_PERCENT", "TAG_PROGRESS", "TAG_PROGRESS_BACKGROUND_TINT", "TAG_PROGRESS_BACKGROUND_TINT_MODE", "TAG_PROGRESS_DRAWABLE", "TAG_PROGRESS_TINT", "TAG_PROGRESS_TINT_MODE", "TAG_PROGRESS_TYPE", "TAG_REPEAT_COUNT", "TAG_REPEAT_MODE", "TAG_RESULT", "TAG_SCALE_TYPE", "TAG_SCROLL_HORIZONTALLY", "TAG_SECONDARY_PROGRESS", "TAG_SECONDARY_PROGRESS_TINT", "TAG_SECONDARY_PROGRESS_TINT_MODE", "TAG_SERVICE", "TAG_SHAPE", "TAG_SINGLE_LINE", "TAG_SLIVER_ANIM", "TAG_SRC", "TAG_START_DELAY", "TAG_STEP_INFO", "TAG_TARGET", "TAG_TEXT", "TAG_TEXT_ALIGN", "TAG_TEXT_ALL_CAPS", "TAG_TEXT_AUTO_LINK", "TAG_TEXT_COLOR", "TAG_TEXT_SIZE", "TAG_TEXT_STYLE", "TAG_TEXT_TYPEFACE", "TAG_TRY_ACTIVITY", "TAG_TYPE", "TAG_URI", "TEXT_FONT_WEIGHT", "TYPE_BUTTON", "TYPE_CONSTRAINT", "TYPE_LOTTIE", "TYPE_TEXT", "VIEW_TYPE", "VISIBILITY", "WIDTH", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class ParserTag {

    @NotNull
    public static final String ASSET_NAME = "asset";

    @NotNull
    public static final String AUTO_PLAY = "autoPlay";

    @NotNull
    public static final String AUTO_SIZE_MAX_TEXT_TYPE = "autoSizeMaxTextSize";

    @NotNull
    public static final String AUTO_SIZE_MIN_TEXT_TYPE = "autoSizeMinTextSize";

    @NotNull
    public static final String AUTO_SIZE_STEP_GRANULARITY = "autoSizeStepGranularity";

    @NotNull
    public static final String AUTO_SIZE_TEXT_TYPE = "autoSizeTextType";

    @NotNull
    public static final String BACKGROUND = "background";

    @NotNull
    public static final String CHILD = "itemLayout";

    @NotNull
    public static final String CHILD_LAYOUT = "layout";

    @NotNull
    public static final String CLIP_TO_PADDING = "clipToPadding";

    @NotNull
    public static final String DATA = "data";

    @NotNull
    public static final String DATA_SAME_COUNT = "count";

    @NotNull
    public static final String DATA_VALUE = "value";

    @NotNull
    public static final String DATA_VALUE_ARRAY = "valueArray";

    @NotNull
    public static final String GRAVITY = "gravity";

    @NotNull
    public static final String HAS_FIXED_SIZE = "hasFixedSize";

    @NotNull
    public static final String HEIGHT = "layout_height";

    @NotNull
    public static final String INCLUDE_FONT_PADDING = "includeFontPadding";

    @NotNull
    public static final ParserTag INSTANCE = new ParserTag();

    @NotNull
    public static final String LAYOUT_MANAGER = "layoutManager";

    @NotNull
    public static final String LAYOUT_ORIENTATION = "orientation";

    @NotNull
    public static final String LOOP = "loop";

    @NotNull
    public static final String MARGIN_BOTTOM = "layout_marginBottom";

    @NotNull
    public static final String MARGIN_END = "layout_marginEnd";

    @NotNull
    public static final String MARGIN_START = "layout_marginStart";

    @NotNull
    public static final String MARGIN_TOP = "layout_marginTop";

    @NotNull
    public static final String PACKAGE = "package";

    @NotNull
    public static final String PADDING_BOTTOM = "paddingBottom";

    @NotNull
    public static final String PADDING_END = "paddingEnd";

    @NotNull
    public static final String PADDING_START = "paddingStart";

    @NotNull
    public static final String PADDING_TOP = "paddingTop";

    @NotNull
    public static final String PAGINATION_SCROLL_LISTENER = "paginationOnScrollListener";

    @NotNull
    public static final String REVERSE_LAYOUT = "reverseLayout";

    @NotNull
    public static final String SPAN_COUNT = "spanCount";

    @NotNull
    public static final String STATE_LIST_ANIMATOR = "stateListAnimator";

    @NotNull
    public static final String SUPPORT_PAGINATION_LOAD = "supportPaginationLoad";

    @NotNull
    public static final String TAG_ACTION = "action";

    @NotNull
    public static final String TAG_ACTIVITY = "activity";

    @NotNull
    public static final String TAG_ADJUST_VIEW_BOUNDS = "adjustViewBounds";

    @NotNull
    public static final String TAG_AFTER = "after";

    @NotNull
    public static final String TAG_ANIM = "anim";

    @NotNull
    public static final String TAG_ANIM_SET = "animSet";

    @NotNull
    public static final String TAG_AUTO_ANIM = "autoAnim";

    @NotNull
    public static final String TAG_BORDER_COLOR = "borderColor";

    @NotNull
    public static final String TAG_BORDER_RADIUS = "borderRadius";

    @NotNull
    public static final String TAG_CATEGORY = "category";

    @NotNull
    public static final String TAG_CHILD = "child";

    @NotNull
    public static final String TAG_CLICK_ANIM = "clickAnim";

    @NotNull
    public static final String TAG_COLORS = "colors";

    @NotNull
    public static final String TAG_CORNER_RADII = "cornerRadii";

    @NotNull
    public static final String TAG_CORNER_RADIUS = "cornerRadius";

    @NotNull
    public static final String TAG_CP = "cp";

    @NotNull
    public static final String TAG_CROP_TO_PADDING = "cropToPadding";

    @NotNull
    public static final String TAG_DATA = "data";

    @NotNull
    public static final String TAG_DRAW = "draw";

    @NotNull
    public static final String TAG_DRAWABLE_ALPHA = "drawableAlpha";

    @NotNull
    public static final String TAG_DRAWABLE_BOTTOM = "drawableBottom";

    @NotNull
    public static final String TAG_DRAWABLE_END = "drawableEnd";

    @NotNull
    public static final String TAG_DRAWABLE_PADDING = "drawablePadding";

    @NotNull
    public static final String TAG_DRAWABLE_START = "drawableStart";

    @NotNull
    public static final String TAG_DRAWABLE_TOP = "drawableTop";

    @NotNull
    public static final String TAG_DURATION = "duration";

    @NotNull
    public static final String TAG_ELLIPSIZE = "ellipsize";

    @NotNull
    public static final String TAG_FLAG = "flag";

    @NotNull
    public static final String TAG_FROM_NUMBER = "fromNumber";

    @NotNull
    public static final String TAG_GET = "get";

    @NotNull
    public static final String TAG_GRADIENT_DRAWABLE = "gradientDrawable";

    @NotNull
    public static final String TAG_GRADIENT_TYPE = "gradientType";

    @NotNull
    public static final String TAG_HAS_BORDER = "hasBorder";

    @NotNull
    public static final String TAG_ID = "id";

    @NotNull
    public static final String TAG_IMAGE_TYPE = "imageType";

    @NotNull
    public static final String TAG_INDETERMINATE = "indeterminate";

    @NotNull
    public static final String TAG_INDETERMINATE_DRAWABLE = "indeterminateDrawable";

    @NotNull
    public static final String TAG_INDETERMINATE_TINT = "indeterminateTint";

    @NotNull
    public static final String TAG_INDETERMINATE_TINT_MODE = "indeterminateTintMode";

    @NotNull
    public static final String TAG_INTENT_TYPE = "intentType";

    @NotNull
    public static final String TAG_INTERPOLATOR = "interpolator";

    @NotNull
    public static final String TAG_LAZY = "lazy";

    @NotNull
    public static final String TAG_LINE_SPACING_EXTRA = "lineSpacingExtra";

    @NotNull
    public static final String TAG_LINE_SPACING_MULTIPLIER = "lineSpacingMultiplier";

    @NotNull
    public static final String TAG_MAX = "max";

    @NotNull
    public static final String TAG_MAX_HEIGHT = "maxHeight";

    @NotNull
    public static final String TAG_MAX_LENGTH = "maxLength";

    @NotNull
    public static final String TAG_MAX_LINES = "maxLines";

    @NotNull
    public static final String TAG_MAX_WIDTH = "maxWidth";

    @NotNull
    public static final String TAG_METHOD = "method";

    @NotNull
    public static final String TAG_MIN = "min";

    @NotNull
    public static final String TAG_MIN_LINES = "minLines";

    @NotNull
    public static final String TAG_NUMBER = "number";

    @NotNull
    public static final String TAG_OFFSETS = "offsets";

    @NotNull
    public static final String TAG_ONCLICK = "onClick";

    @NotNull
    public static final String TAG_ON_ANIMATION_CANCEL = "onAnimationCancel";

    @NotNull
    public static final String TAG_ON_ANIMATION_END = "onAnimationEnd";

    @NotNull
    public static final String TAG_ON_ANIMATION_REPEAT = "onAnimationRepeat";

    @NotNull
    public static final String TAG_ON_ANIMATION_START = "onAnimationStart";

    @NotNull
    public static final String TAG_ORIENTATION = "orientation";

    @NotNull
    public static final String TAG_PACKAGE_NAME = "packageName";

    @NotNull
    public static final String TAG_PARAMS = "params";

    @NotNull
    public static final String TAG_PERCENT = "percent";

    @NotNull
    public static final String TAG_PROGRESS = "progress";

    @NotNull
    public static final String TAG_PROGRESS_BACKGROUND_TINT = "progressBackgroundTint";

    @NotNull
    public static final String TAG_PROGRESS_BACKGROUND_TINT_MODE = "progressBackgroundTintMode";

    @NotNull
    public static final String TAG_PROGRESS_DRAWABLE = "progressDrawable";

    @NotNull
    public static final String TAG_PROGRESS_TINT = "progressTint";

    @NotNull
    public static final String TAG_PROGRESS_TINT_MODE = "progressTintMode";

    @NotNull
    public static final String TAG_PROGRESS_TYPE = "progressType";

    @NotNull
    public static final String TAG_REPEAT_COUNT = "repeatCount";

    @NotNull
    public static final String TAG_REPEAT_MODE = "repeatMode";

    @NotNull
    public static final String TAG_RESULT = "result";

    @NotNull
    public static final String TAG_SCALE_TYPE = "scaleType";

    @NotNull
    public static final String TAG_SCROLL_HORIZONTALLY = "scrollHorizontally";

    @NotNull
    public static final String TAG_SECONDARY_PROGRESS = "secondaryProgress";

    @NotNull
    public static final String TAG_SECONDARY_PROGRESS_TINT = "secondaryProgressTint";

    @NotNull
    public static final String TAG_SECONDARY_PROGRESS_TINT_MODE = "secondaryProgressTintMode";

    @NotNull
    public static final String TAG_SERVICE = "service";

    @NotNull
    public static final String TAG_SHAPE = "shape";

    @NotNull
    public static final String TAG_SINGLE_LINE = "singleLine";

    @NotNull
    public static final String TAG_SLIVER_ANIM = "sliverAnim";

    @NotNull
    public static final String TAG_SRC = "src";

    @NotNull
    public static final String TAG_START_DELAY = "startDelay";

    @NotNull
    public static final String TAG_STEP_INFO = "stepInfo";

    @NotNull
    public static final String TAG_TARGET = "target";

    @NotNull
    public static final String TAG_TEXT = "text";

    @NotNull
    public static final String TAG_TEXT_ALIGN = "textAlignment";

    @NotNull
    public static final String TAG_TEXT_ALL_CAPS = "textAllCaps";

    @NotNull
    public static final String TAG_TEXT_AUTO_LINK = "autoLink";

    @NotNull
    public static final String TAG_TEXT_COLOR = "textColor";

    @NotNull
    public static final String TAG_TEXT_SIZE = "textSize";

    @NotNull
    public static final String TAG_TEXT_STYLE = "textStyle";

    @NotNull
    public static final String TAG_TEXT_TYPEFACE = "typeface";

    @NotNull
    public static final String TAG_TRY_ACTIVITY = "tryActivity";

    @NotNull
    public static final String TAG_TYPE = "type";

    @NotNull
    public static final String TAG_URI = "uri";

    @NotNull
    public static final String TEXT_FONT_WEIGHT = "textFontWeight";

    @NotNull
    public static final String TYPE_BUTTON = "button";

    @NotNull
    public static final String TYPE_CONSTRAINT = "constraint";

    @NotNull
    public static final String TYPE_LOTTIE = "lottie";

    @NotNull
    public static final String TYPE_TEXT = "text";

    @NotNull
    public static final String VIEW_TYPE = "viewType";

    @NotNull
    public static final String VISIBILITY = "visibility";

    @NotNull
    public static final String WIDTH = "layout_width";

    private ParserTag() {
    }
}
