package com.oplus.smartenginehelper.entity;

import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b)\u0018\u0000 B2\u00020\u0001:\u0001BB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bJ\u0016\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bJ\u0016\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bJ\u0016\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010 \u001a\u00020\bJ\u001e\u0010!\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u001aJ\u0016\u0010$\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bJ\u0016\u0010&\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010'\u001a\u00020\bJ\u0016\u0010(\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bJ\u0016\u0010*\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u0012J\u0016\u0010,\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010-\u001a\u00020\bJ\u0016\u0010.\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010/\u001a\u00020\bJ\u0016\u00100\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u00101\u001a\u00020\bJ\u0016\u00102\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u0012J.\u00103\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\bJ\u0016\u00108\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u00109\u001a\u00020\u0012J\u0016\u0010:\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010;\u001a\u00020\u0015J\u0016\u0010<\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bJ\u0016\u0010=\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u0015J\u0016\u0010?\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010@\u001a\u00020\u0012J\u0016\u0010A\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010@\u001a\u00020\b¨\u0006C"}, d2 = {"Lcom/oplus/smartenginehelper/entity/ClickApiEntity;", "Lcom/oplus/smartenginehelper/entity/ClickEntity;", "()V", ClickApiEntity.END_ANIM, "", ClickApiEntity.PAUSE_ALL_VIDEO, ClickApiEntity.PAUSE_VIDEO, "id", "", ClickApiEntity.PLAY_ALL_VIDEO, ClickApiEntity.PLAY_VIDEO, ClickApiEntity.RELEASE_VIDEO, ClickApiEntity.RUN_ANIM, ClickApiEntity.RUN_ANIM_DELAY, ClickApiEntity.DELAY, "", ClickApiEntity.SEEK_VIDEO, ClickApiEntity.TIME, "", ClickApiEntity.SET_ALPHA, "alpha", "", ClickApiEntity.SET_BACKGROUND, "background", ClickApiEntity.SET_ENABLED, ViewEntity.ENABLED, "", ClickApiEntity.SET_IMAGE_SRC, ClickApiEntity.NEW_SRC, ClickApiEntity.SET_INDETERMINATE_DRAWABLE, ParserTag.TAG_INDETERMINATE_DRAWABLE, ClickApiEntity.SET_INDETERMINATE_TINT, ParserTag.TAG_INDETERMINATE_TINT, ClickApiEntity.SET_PROGRESS, "progress", ClickApiEntity.ANIMATE_ENABLE, ClickApiEntity.SET_PROGRESS_BACKGROUND_TINT, ParserTag.TAG_PROGRESS_BACKGROUND_TINT, ClickApiEntity.SET_PROGRESS_DRAWABLE, ParserTag.TAG_PROGRESS_DRAWABLE, ClickApiEntity.SET_PROGRESS_TINT, ParserTag.TAG_PROGRESS_TINT, ClickApiEntity.SET_SECONDARY_PROGRESS, ParserTag.TAG_SECONDARY_PROGRESS, ClickApiEntity.SET_SECONDARY_PROGRESS_TINT, ParserTag.TAG_SECONDARY_PROGRESS_TINT, "setTexColorString", ClickApiEntity.NEW_TEXT_COLOR, ClickApiEntity.SET_TEXT, ClickApiEntity.NEW_TEXT, ClickApiEntity.SET_TEXT_COLOR, ClickApiEntity.SET_TEXT_COMPOUND_DRAWABLE, ParserTag.TAG_DRAWABLE_START, ParserTag.TAG_DRAWABLE_TOP, ParserTag.TAG_DRAWABLE_END, ParserTag.TAG_DRAWABLE_BOTTOM, ClickApiEntity.SET_TEXT_SIZE, ClickApiEntity.NEW_TEXT_SIZE, ClickApiEntity.SET_VIDEO_SPEED, "speed", ClickApiEntity.SET_VIDEO_SRC, ClickApiEntity.SET_VIDEO_VOLUME, ClickApiEntity.NEW_VOLUME, ClickApiEntity.SET_VISIBILITY, "visibility", ClickApiEntity.SET_VISIBILITY_STR, "Companion", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class ClickApiEntity extends ClickEntity {

    @NotNull
    public static final String ANIMATE_ENABLE = "animateEnable";

    @NotNull
    public static final String DELAY = "delay";

    @NotNull
    public static final String END_ANIM = "endAnim";

    @NotNull
    public static final String NEW_SRC = "newSrc";

    @NotNull
    public static final String NEW_TEXT = "newText";

    @NotNull
    public static final String NEW_TEXT_COLOR = "newTextColor";

    @NotNull
    public static final String NEW_TEXT_SIZE = "newTextSize";

    @NotNull
    public static final String NEW_VOLUME = "newVolume";

    @NotNull
    public static final String PAUSE_ALL_VIDEO = "pauseAllVideo";

    @NotNull
    public static final String PAUSE_VIDEO = "pauseVideo";

    @NotNull
    public static final String PLAY_ALL_VIDEO = "playAllVideo";

    @NotNull
    public static final String PLAY_VIDEO = "playVideo";

    @NotNull
    public static final String RELEASE_VIDEO = "releaseVideo";

    @NotNull
    public static final String RUN_ANIM = "runAnim";

    @NotNull
    public static final String RUN_ANIM_DELAY = "runAnimDelay";

    @NotNull
    public static final String SEEK_VIDEO = "seekVideo";

    @NotNull
    public static final String SET_ALPHA = "setAlpha";

    @NotNull
    public static final String SET_BACKGROUND = "setBackground";

    @NotNull
    public static final String SET_ENABLED = "setEnabled";

    @NotNull
    public static final String SET_IMAGE_SRC = "setImageSrc";

    @NotNull
    public static final String SET_INDETERMINATE_DRAWABLE = "setIndeterminateDrawable";

    @NotNull
    public static final String SET_INDETERMINATE_TINT = "setIndeterminateTint";

    @NotNull
    public static final String SET_PROGRESS = "setProgress";

    @NotNull
    public static final String SET_PROGRESS_BACKGROUND_TINT = "setProgressBackgroundTint";

    @NotNull
    public static final String SET_PROGRESS_DRAWABLE = "setProgressDrawable";

    @NotNull
    public static final String SET_PROGRESS_TINT = "setProgressTint";

    @NotNull
    public static final String SET_SECONDARY_PROGRESS = "setSecondaryProgress";

    @NotNull
    public static final String SET_SECONDARY_PROGRESS_TINT = "setSecondaryProgressTint";

    @NotNull
    public static final String SET_TEXT = "setText";

    @NotNull
    public static final String SET_TEXT_COLOR = "setTextColor";

    @NotNull
    public static final String SET_TEXT_COLOR_STRING = "setTextColorString";

    @NotNull
    public static final String SET_TEXT_COMPOUND_DRAWABLE = "setTextCompoundDrawable";

    @NotNull
    public static final String SET_TEXT_SIZE = "setTextSize";

    @NotNull
    public static final String SET_VIDEO_SPEED = "setVideoSpeed";

    @NotNull
    public static final String SET_VIDEO_SRC = "setVideoSrc";

    @NotNull
    public static final String SET_VIDEO_VOLUME = "setVideoVolume";

    @NotNull
    public static final String SET_VISIBILITY = "setVisibility";

    @NotNull
    public static final String SET_VISIBILITY_STR = "setVisibilityStr";

    @NotNull
    public static final String SPEED = "speed";

    @NotNull
    public static final String TIME = "time";

    public final void endAnim() throws JSONException {
        getMJSONObject().put("type", END_ANIM);
    }

    public final void pauseAllVideo() throws JSONException {
        getMJSONObject().put("type", PAUSE_ALL_VIDEO);
    }

    public final void pauseVideo(@NotNull String id) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        getMJSONObject().put("type", PAUSE_VIDEO);
        getMJSONObject().put("id", id);
    }

    public final void playAllVideo() throws JSONException {
        getMJSONObject().put("type", PLAY_ALL_VIDEO);
    }

    public final void playVideo(@NotNull String id) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        getMJSONObject().put("type", PLAY_VIDEO);
        getMJSONObject().put("id", id);
    }

    public final void releaseVideo(@NotNull String id) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        getMJSONObject().put("type", RELEASE_VIDEO);
        getMJSONObject().put("id", id);
    }

    public final void runAnim() throws JSONException {
        getMJSONObject().put("type", RUN_ANIM);
    }

    public final void runAnimDelay(long delay) throws JSONException {
        getMJSONObject().put("type", RUN_ANIM_DELAY);
        getMJSONObject().put(DELAY, delay);
    }

    public final void seekVideo(@NotNull String id, int time) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        getMJSONObject().put("type", SEEK_VIDEO);
        getMJSONObject().put("id", id);
        getMJSONObject().put(TIME, time);
    }

    public final void setAlpha(@NotNull String id, float alpha) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        getMJSONObject().put("type", SET_ALPHA);
        getMJSONObject().put("id", id);
        getMJSONObject().put("alpha", Float.valueOf(alpha));
    }

    public final void setBackground(@NotNull String id, @NotNull String background) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(background, "background");
        getMJSONObject().put("type", SET_BACKGROUND);
        getMJSONObject().put("id", id);
        getMJSONObject().put("background", background);
    }

    public final void setEnabled(@NotNull String id, boolean enabled) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        getMJSONObject().put("type", SET_ENABLED);
        getMJSONObject().put("id", id);
        getMJSONObject().put(ViewEntity.ENABLED, enabled);
    }

    public final void setImageSrc(@NotNull String id, @NotNull String newSrc) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(newSrc, "newSrc");
        getMJSONObject().put("type", SET_IMAGE_SRC);
        getMJSONObject().put("id", id);
        getMJSONObject().put(NEW_SRC, newSrc);
    }

    public final void setIndeterminateDrawable(@NotNull String id, @NotNull String indeterminateDrawable) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(indeterminateDrawable, "indeterminateDrawable");
        getMJSONObject().put("type", SET_INDETERMINATE_DRAWABLE);
        getMJSONObject().put("id", id);
        getMJSONObject().put(ParserTag.TAG_INDETERMINATE_DRAWABLE, indeterminateDrawable);
    }

    public final void setIndeterminateTint(@NotNull String id, @NotNull String indeterminateTint) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(indeterminateTint, "indeterminateTint");
        getMJSONObject().put("type", SET_INDETERMINATE_TINT);
        getMJSONObject().put("id", id);
        getMJSONObject().put(ParserTag.TAG_INDETERMINATE_TINT, indeterminateTint);
    }

    public final void setProgress(@NotNull String id, int progress, boolean animateEnable) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        getMJSONObject().put("type", SET_PROGRESS);
        getMJSONObject().put("id", id);
        getMJSONObject().put("progress", progress);
        getMJSONObject().put(ANIMATE_ENABLE, animateEnable);
    }

    public final void setProgressBackgroundTint(@NotNull String id, @NotNull String progressBackgroundTint) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(progressBackgroundTint, "progressBackgroundTint");
        getMJSONObject().put("type", SET_PROGRESS_BACKGROUND_TINT);
        getMJSONObject().put("id", id);
        getMJSONObject().put(ParserTag.TAG_PROGRESS_BACKGROUND_TINT, progressBackgroundTint);
    }

    public final void setProgressDrawable(@NotNull String id, @NotNull String progressDrawable) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(progressDrawable, "progressDrawable");
        getMJSONObject().put("type", SET_PROGRESS_DRAWABLE);
        getMJSONObject().put("id", id);
        getMJSONObject().put(ParserTag.TAG_PROGRESS_DRAWABLE, progressDrawable);
    }

    public final void setProgressTint(@NotNull String id, @NotNull String progressTint) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(progressTint, "progressTint");
        getMJSONObject().put("type", SET_PROGRESS_TINT);
        getMJSONObject().put("id", id);
        getMJSONObject().put(ParserTag.TAG_PROGRESS_TINT, progressTint);
    }

    public final void setSecondaryProgress(@NotNull String id, int secondaryProgress) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        getMJSONObject().put("type", SET_SECONDARY_PROGRESS);
        getMJSONObject().put("id", id);
        getMJSONObject().put(ParserTag.TAG_SECONDARY_PROGRESS, secondaryProgress);
    }

    public final void setSecondaryProgressTint(@NotNull String id, @NotNull String secondaryProgressTint) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(secondaryProgressTint, "secondaryProgressTint");
        getMJSONObject().put("type", SET_SECONDARY_PROGRESS_TINT);
        getMJSONObject().put("id", id);
        getMJSONObject().put(ParserTag.TAG_SECONDARY_PROGRESS_TINT, secondaryProgressTint);
    }

    public final void setTexColorString(@NotNull String id, @NotNull String newTextColor) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(newTextColor, "newTextColor");
        getMJSONObject().put("type", SET_TEXT_COLOR_STRING);
        getMJSONObject().put("id", id);
        getMJSONObject().put(NEW_TEXT_COLOR, newTextColor);
    }

    public final void setText(@NotNull String id, @NotNull String newText) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(newText, "newText");
        getMJSONObject().put("type", SET_TEXT);
        getMJSONObject().put("id", id);
        getMJSONObject().put(NEW_TEXT, newText);
    }

    public final void setTextColor(@NotNull String id, int newTextColor) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        getMJSONObject().put("type", SET_TEXT_COLOR);
        getMJSONObject().put("id", id);
        getMJSONObject().put(NEW_TEXT_COLOR, newTextColor);
    }

    public final void setTextCompoundDrawable(@NotNull String id, @NotNull String drawableStart, @NotNull String drawableTop, @NotNull String drawableEnd, @NotNull String drawableBottom) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(drawableStart, "drawableStart");
        Intrinsics.checkNotNullParameter(drawableTop, "drawableTop");
        Intrinsics.checkNotNullParameter(drawableEnd, "drawableEnd");
        Intrinsics.checkNotNullParameter(drawableBottom, "drawableBottom");
        getMJSONObject().put("type", SET_TEXT_COMPOUND_DRAWABLE);
        getMJSONObject().put("id", id);
        getMJSONObject().put(ParserTag.TAG_DRAWABLE_START, drawableStart);
        getMJSONObject().put(ParserTag.TAG_DRAWABLE_TOP, drawableTop);
        getMJSONObject().put(ParserTag.TAG_DRAWABLE_END, drawableEnd);
        getMJSONObject().put(ParserTag.TAG_DRAWABLE_BOTTOM, drawableBottom);
    }

    public final void setTextSize(@NotNull String id, int newTextSize) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        getMJSONObject().put("type", SET_TEXT_SIZE);
        getMJSONObject().put("id", id);
        getMJSONObject().put(NEW_TEXT_SIZE, newTextSize);
    }

    public final void setVideoSpeed(@NotNull String id, float speed) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        getMJSONObject().put("type", SET_VIDEO_SPEED);
        getMJSONObject().put("id", id);
        getMJSONObject().put("speed", Float.valueOf(speed));
    }

    public final void setVideoSrc(@NotNull String id, @NotNull String newSrc) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(newSrc, "newSrc");
        getMJSONObject().put("type", SET_VIDEO_SRC);
        getMJSONObject().put("id", id);
        getMJSONObject().put(NEW_SRC, newSrc);
    }

    public final void setVideoVolume(@NotNull String id, float newVolume) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        getMJSONObject().put("type", SET_VIDEO_VOLUME);
        getMJSONObject().put("id", id);
        getMJSONObject().put(NEW_VOLUME, Float.valueOf(newVolume));
    }

    public final void setVisibility(@NotNull String id, int visibility) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        getMJSONObject().put("type", SET_VISIBILITY);
        getMJSONObject().put("id", id);
        getMJSONObject().put("visibility", visibility);
    }

    public final void setVisibilityStr(@NotNull String id, @NotNull String visibility) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        getMJSONObject().put("type", SET_VISIBILITY_STR);
        getMJSONObject().put("id", id);
        getMJSONObject().put("visibility", visibility);
    }
}
