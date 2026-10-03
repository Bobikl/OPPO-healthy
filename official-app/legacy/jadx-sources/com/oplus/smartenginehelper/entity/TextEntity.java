package com.oplus.smartenginehelper.entity;

import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 B2\u00020\u0001:\u0001BB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0003J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0003J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0003J\u000e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0003J\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0003J\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020$J\u000e\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\nJ\u000e\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\nJ\u000e\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\nJ\u000e\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020!J\u000e\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020!J\u000e\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u000203J\u000e\u00101\u001a\u00020\u00062\u0006\u00104\u001a\u00020\nJ\u000e\u00101\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0003J\u000e\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0003J\u000e\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\nJ\u000e\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0003J\u000e\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\nJ\u000e\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\nJ\u000e\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0003J\u000e\u0010>\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u0003J\u000e\u0010@\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u0003¨\u0006C"}, d2 = {"Lcom/oplus/smartenginehelper/entity/TextEntity;", "Lcom/oplus/smartenginehelper/entity/ViewEntity;", "id", "", "(Ljava/lang/String;)V", "setAutoLink", "", ParserTag.TAG_TEXT_AUTO_LINK, "setAutoSizeMaxTextSize", "autoSizeMaxTextSize", "", "setAutoSizeMinTextSize", "autoSizeMinTextSize", "setAutoSizeStepGranularity", "autoSizeStepGranularity", "setAutoSizeTextType", "autoSizeTextType", "setDrawableBottom", ParserTag.TAG_DRAWABLE_BOTTOM, "setDrawableEnd", ParserTag.TAG_DRAWABLE_END, "setDrawablePadding", ParserTag.TAG_DRAWABLE_PADDING, "setDrawableStart", ParserTag.TAG_DRAWABLE_START, "setDrawableTop", ParserTag.TAG_DRAWABLE_TOP, "setEllipsize", ParserTag.TAG_ELLIPSIZE, "setGravity", "gravity", "setIsAllCaps", "isAllCaps", "", "setLineSpacingExtra", ParserTag.TAG_LINE_SPACING_EXTRA, "", "setLineSpacingMultiplier", ParserTag.TAG_LINE_SPACING_MULTIPLIER, "setMaxLength", ParserTag.TAG_MAX_LENGTH, "setMaxLines", ParserTag.TAG_MAX_LINES, "setMinLines", ParserTag.TAG_MIN_LINES, "setScrollHorizontally", ParserTag.TAG_SCROLL_HORIZONTALLY, "setSingleLine", ParserTag.TAG_SINGLE_LINE, ClickApiEntity.SET_TEXT, "contentProviderClickEntity", "Lcom/oplus/smartenginehelper/entity/ContentProviderClickEntity;", "resId", "text", "setTextAlignment", ParserTag.TAG_TEXT_ALIGN, ClickApiEntity.SET_TEXT_COLOR, ParserTag.TAG_TEXT_COLOR, "setTextFontWeight", "textFontWeight", ClickApiEntity.SET_TEXT_SIZE, ParserTag.TAG_TEXT_SIZE, "setTypeFace", "typeFace", "setTypeFaceStyle", "typeFaceStyle", "Companion", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public class TextEntity extends ViewEntity {

    @NotNull
    public static final String ALIGN_CENTER = "center";

    @NotNull
    public static final String ALIGN_GRAVITY = "gravity";

    @NotNull
    public static final String ALIGN_TEXT_END = "textEnd";

    @NotNull
    public static final String ALIGN_TEXT_START = "textStart";

    @NotNull
    public static final String ALIGN_VIEW_END = "viewEnd";

    @NotNull
    public static final String ALIGN_VIEW_START = "viewStart";

    @NotNull
    public static final String AUTO_LINK_ALL = "all";

    @NotNull
    public static final String AUTO_LINK_EMAIL = "email";

    @NotNull
    public static final String AUTO_LINK_PHONE = "phone";

    @NotNull
    public static final String AUTO_LINK_WEB = "web";

    @NotNull
    public static final String AUTO_SIZE_MAX_TEXT_TYPE = "autoSizeMaxTextSize";

    @NotNull
    public static final String AUTO_SIZE_MIN_TEXT_TYPE = "autoSizeMinTextSize";

    @NotNull
    public static final String AUTO_SIZE_STEP_GRANULARITY = "autoSizeStepGranularity";

    @NotNull
    public static final String AUTO_SIZE_TEXT_TYPE = "autoSizeTextType";

    @NotNull
    public static final String ELLIPSIZE_END = "end";

    @NotNull
    public static final String ELLIPSIZE_MIDDLE = "middle";

    @NotNull
    public static final String ELLIPSIZE_START = "start";

    @NotNull
    public static final String GRAVITY = "gravity";

    @NotNull
    public static final String TEXT_FONT_WEIGHT = "textFontWeight";

    @NotNull
    public static final String TYPEFACE_NORMAL = "normal";

    @NotNull
    public static final String TYPEFACE_STYLE_BOLD = "bold";

    @NotNull
    public static final String TYPEFACE_STYLE_BOLD_ITALIC = "bold_italic";

    @NotNull
    public static final String TYPEFACE_STYLE_ITALIC = "italic";

    @NotNull
    public static final String TYPEFACE_STYLE_NORMAL = "normal";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextEntity(@NotNull String id) throws JSONException {
        super(id);
        Intrinsics.checkNotNullParameter(id, "id");
        getMJSONObject().put("type", "text");
    }

    public final void setAutoLink(@NotNull String autoLink) throws JSONException {
        Intrinsics.checkNotNullParameter(autoLink, "autoLink");
        getMJSONObject().put(ParserTag.TAG_TEXT_AUTO_LINK, autoLink);
    }

    public final void setAutoSizeMaxTextSize(int autoSizeMaxTextSize) throws JSONException {
        getMJSONObject().put("autoSizeMaxTextSize", autoSizeMaxTextSize);
    }

    public final void setAutoSizeMinTextSize(int autoSizeMinTextSize) throws JSONException {
        getMJSONObject().put("autoSizeMinTextSize", autoSizeMinTextSize);
    }

    public final void setAutoSizeStepGranularity(int autoSizeStepGranularity) throws JSONException {
        getMJSONObject().put("autoSizeStepGranularity", autoSizeStepGranularity);
    }

    public final void setAutoSizeTextType(@NotNull String autoSizeTextType) throws JSONException {
        Intrinsics.checkNotNullParameter(autoSizeTextType, "autoSizeTextType");
        getMJSONObject().put("autoSizeTextType", autoSizeTextType);
    }

    public final void setDrawableBottom(@NotNull String drawableBottom) throws JSONException {
        Intrinsics.checkNotNullParameter(drawableBottom, "drawableBottom");
        getMJSONObject().put(ParserTag.TAG_DRAWABLE_BOTTOM, drawableBottom);
    }

    public final void setDrawableEnd(@NotNull String drawableEnd) throws JSONException {
        Intrinsics.checkNotNullParameter(drawableEnd, "drawableEnd");
        getMJSONObject().put(ParserTag.TAG_DRAWABLE_END, drawableEnd);
    }

    public final void setDrawablePadding(int drawablePadding) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_DRAWABLE_PADDING, drawablePadding);
    }

    public final void setDrawableStart(@NotNull String drawableStart) throws JSONException {
        Intrinsics.checkNotNullParameter(drawableStart, "drawableStart");
        getMJSONObject().put(ParserTag.TAG_DRAWABLE_START, drawableStart);
    }

    public final void setDrawableTop(@NotNull String drawableTop) throws JSONException {
        Intrinsics.checkNotNullParameter(drawableTop, "drawableTop");
        getMJSONObject().put(ParserTag.TAG_DRAWABLE_TOP, drawableTop);
    }

    public final void setEllipsize(@NotNull String ellipsize) throws JSONException {
        Intrinsics.checkNotNullParameter(ellipsize, "ellipsize");
        getMJSONObject().put(ParserTag.TAG_ELLIPSIZE, ellipsize);
    }

    public final void setGravity(@NotNull String gravity) throws JSONException {
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        getMJSONObject().put("gravity", gravity);
    }

    public final void setIsAllCaps(boolean isAllCaps) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_TEXT_ALL_CAPS, isAllCaps);
    }

    public final void setLineSpacingExtra(float lineSpacingExtra) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_LINE_SPACING_EXTRA, Float.valueOf(lineSpacingExtra));
    }

    public final void setLineSpacingMultiplier(float lineSpacingMultiplier) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_LINE_SPACING_MULTIPLIER, Float.valueOf(lineSpacingMultiplier));
    }

    public final void setMaxLength(int maxLength) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_MAX_LENGTH, maxLength);
    }

    public final void setMaxLines(int maxLines) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_MAX_LINES, maxLines);
    }

    public final void setMinLines(int minLines) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_MIN_LINES, minLines);
    }

    public final void setScrollHorizontally(boolean scrollHorizontally) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_SCROLL_HORIZONTALLY, scrollHorizontally);
    }

    public final void setSingleLine(boolean singleLine) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_SINGLE_LINE, singleLine);
    }

    public final void setText(@NotNull String text) throws JSONException {
        Intrinsics.checkNotNullParameter(text, "text");
        getMJSONObject().put("text", text);
    }

    public final void setTextAlignment(@NotNull String textAlignment) throws JSONException {
        Intrinsics.checkNotNullParameter(textAlignment, "textAlignment");
        getMJSONObject().put(ParserTag.TAG_TEXT_ALIGN, textAlignment);
    }

    public final void setTextColor(@NotNull String textColor) throws JSONException {
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        getMJSONObject().put(ParserTag.TAG_TEXT_COLOR, textColor);
    }

    public final void setTextFontWeight(int textFontWeight) throws JSONException {
        getMJSONObject().put("textFontWeight", textFontWeight);
    }

    public final void setTextSize(@NotNull String textSize) throws JSONException {
        Intrinsics.checkNotNullParameter(textSize, "textSize");
        getMJSONObject().put(ParserTag.TAG_TEXT_SIZE, textSize);
    }

    public final void setTypeFace(@NotNull String typeFace) throws JSONException {
        Intrinsics.checkNotNullParameter(typeFace, "typeFace");
        getMJSONObject().put(ParserTag.TAG_TEXT_TYPEFACE, typeFace);
    }

    public final void setTypeFaceStyle(@NotNull String typeFaceStyle) throws JSONException {
        Intrinsics.checkNotNullParameter(typeFaceStyle, "typeFaceStyle");
        getMJSONObject().put(ParserTag.TAG_TEXT_STYLE, typeFaceStyle);
    }

    public final void setDrawableBottom(int drawableBottom) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_DRAWABLE_BOTTOM, drawableBottom);
    }

    public final void setDrawableEnd(int drawableEnd) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_DRAWABLE_END, drawableEnd);
    }

    public final void setDrawableStart(int drawableStart) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_DRAWABLE_START, drawableStart);
    }

    public final void setDrawableTop(int drawableTop) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_DRAWABLE_TOP, drawableTop);
    }

    public final void setText(int resId) throws JSONException {
        getMJSONObject().put("text", resId);
    }

    public final void setTextColor(int textColor) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_TEXT_COLOR, textColor);
    }

    public final void setTextSize(int textSize) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_TEXT_SIZE, String.valueOf(textSize));
    }

    public final void setText(@NotNull ContentProviderClickEntity contentProviderClickEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(contentProviderClickEntity, "contentProviderClickEntity");
        getMJSONObject().put("text", contentProviderClickEntity.getMJSONObject());
    }
}
