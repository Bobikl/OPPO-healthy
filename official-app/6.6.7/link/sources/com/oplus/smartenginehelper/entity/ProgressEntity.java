package com.oplus.smartenginehelper.entity;

import com.oplus.smartenginehelper.ParserTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001b\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0003J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0011J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0003J\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0003J\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0003J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0003J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0003J\u000e\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0003J\u000e\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0011J\u000e\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0003J\u000e\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0003¨\u0006,"}, d2 = {"Lcom/oplus/smartenginehelper/entity/ProgressEntity;", "Lcom/oplus/smartenginehelper/entity/ViewEntity;", ParserTag.TAG_ID, "", "(Ljava/lang/String;)V", "setIndeterminate", "", ParserTag.TAG_INDETERMINATE, "", ClickApiEntity.SET_INDETERMINATE_DRAWABLE, ParserTag.TAG_INDETERMINATE_DRAWABLE, ClickApiEntity.SET_INDETERMINATE_TINT, ParserTag.TAG_INDETERMINATE_TINT, "setIndeterminateTintMode", ParserTag.TAG_INDETERMINATE_TINT_MODE, "setMax", ParserTag.TAG_MAX, "", "setMaxHeight", ParserTag.TAG_MAX_HEIGHT, "setMaxWidth", ParserTag.TAG_MAX_WIDTH, "setMin", ParserTag.TAG_MIN, ClickApiEntity.SET_PROGRESS, ParserTag.TAG_PROGRESS, ClickApiEntity.SET_PROGRESS_BACKGROUND_TINT, ParserTag.TAG_PROGRESS_BACKGROUND_TINT, "setProgressBackgroundTintMode", ParserTag.TAG_PROGRESS_BACKGROUND_TINT_MODE, ClickApiEntity.SET_PROGRESS_DRAWABLE, ParserTag.TAG_PROGRESS_DRAWABLE, ClickApiEntity.SET_PROGRESS_TINT, ParserTag.TAG_PROGRESS_TINT, "setProgressTintMode", ParserTag.TAG_PROGRESS_TINT_MODE, "setProgressType", ParserTag.TAG_PROGRESS_TYPE, ClickApiEntity.SET_SECONDARY_PROGRESS, ParserTag.TAG_SECONDARY_PROGRESS, ClickApiEntity.SET_SECONDARY_PROGRESS_TINT, ParserTag.TAG_SECONDARY_PROGRESS_TINT, "setSecondaryProgressTintMode", ParserTag.TAG_SECONDARY_PROGRESS_TINT_MODE, "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public class ProgressEntity extends ViewEntity {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressEntity(@NotNull String str) throws JSONException {
        super(str);
        Intrinsics.checkNotNullParameter(str, ParserTag.TAG_ID);
        getMJSONObject().put("type", ParserTag.TAG_PROGRESS);
    }

    public final void setIndeterminate(boolean indeterminate) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_INDETERMINATE, indeterminate);
    }

    public final void setIndeterminateDrawable(@NotNull String indeterminateDrawable) throws JSONException {
        Intrinsics.checkNotNullParameter(indeterminateDrawable, ParserTag.TAG_INDETERMINATE_DRAWABLE);
        getMJSONObject().put(ParserTag.TAG_INDETERMINATE_DRAWABLE, indeterminateDrawable);
    }

    public final void setIndeterminateTint(@NotNull String indeterminateTint) throws JSONException {
        Intrinsics.checkNotNullParameter(indeterminateTint, ParserTag.TAG_INDETERMINATE_TINT);
        getMJSONObject().put(ParserTag.TAG_INDETERMINATE_TINT, indeterminateTint);
    }

    public final void setIndeterminateTintMode(@NotNull String indeterminateTintMode) throws JSONException {
        Intrinsics.checkNotNullParameter(indeterminateTintMode, ParserTag.TAG_INDETERMINATE_TINT_MODE);
        getMJSONObject().put(ParserTag.TAG_INDETERMINATE_TINT_MODE, indeterminateTintMode);
    }

    public final void setMax(int max) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_MAX, max);
    }

    public final void setMaxHeight(int maxHeight) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_MAX_HEIGHT, maxHeight);
    }

    public final void setMaxWidth(int maxWidth) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_MAX_WIDTH, maxWidth);
    }

    public final void setMin(int min) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_MIN, min);
    }

    public final void setProgress(int progress) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_PROGRESS, progress);
    }

    public final void setProgressBackgroundTint(@NotNull String progressBackgroundTint) throws JSONException {
        Intrinsics.checkNotNullParameter(progressBackgroundTint, ParserTag.TAG_PROGRESS_BACKGROUND_TINT);
        getMJSONObject().put(ParserTag.TAG_PROGRESS_BACKGROUND_TINT, progressBackgroundTint);
    }

    public final void setProgressBackgroundTintMode(@NotNull String progressBackgroundTintMode) throws JSONException {
        Intrinsics.checkNotNullParameter(progressBackgroundTintMode, ParserTag.TAG_PROGRESS_BACKGROUND_TINT_MODE);
        getMJSONObject().put(ParserTag.TAG_PROGRESS_BACKGROUND_TINT_MODE, progressBackgroundTintMode);
    }

    public final void setProgressDrawable(@NotNull String progressDrawable) throws JSONException {
        Intrinsics.checkNotNullParameter(progressDrawable, ParserTag.TAG_PROGRESS_DRAWABLE);
        getMJSONObject().put(ParserTag.TAG_PROGRESS_DRAWABLE, progressDrawable);
    }

    public final void setProgressTint(@NotNull String progressTint) throws JSONException {
        Intrinsics.checkNotNullParameter(progressTint, ParserTag.TAG_PROGRESS_TINT);
        getMJSONObject().put(ParserTag.TAG_PROGRESS_TINT, progressTint);
    }

    public final void setProgressTintMode(@NotNull String progressTintMode) throws JSONException {
        Intrinsics.checkNotNullParameter(progressTintMode, ParserTag.TAG_PROGRESS_TINT_MODE);
        getMJSONObject().put(ParserTag.TAG_PROGRESS_TINT_MODE, progressTintMode);
    }

    public final void setProgressType(@NotNull String progressType) throws JSONException {
        Intrinsics.checkNotNullParameter(progressType, ParserTag.TAG_PROGRESS_TYPE);
        getMJSONObject().put(ParserTag.TAG_PROGRESS_TYPE, progressType);
    }

    public final void setSecondaryProgress(int secondaryProgress) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_SECONDARY_PROGRESS, secondaryProgress);
    }

    public final void setSecondaryProgressTint(@NotNull String secondaryProgressTint) throws JSONException {
        Intrinsics.checkNotNullParameter(secondaryProgressTint, ParserTag.TAG_SECONDARY_PROGRESS_TINT);
        getMJSONObject().put(ParserTag.TAG_SECONDARY_PROGRESS_TINT, secondaryProgressTint);
    }

    public final void setSecondaryProgressTintMode(@NotNull String secondaryProgressTintMode) throws JSONException {
        Intrinsics.checkNotNullParameter(secondaryProgressTintMode, ParserTag.TAG_SECONDARY_PROGRESS_TINT_MODE);
        getMJSONObject().put(ParserTag.TAG_SECONDARY_PROGRESS_TINT_MODE, secondaryProgressTintMode);
    }
}
