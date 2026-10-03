package com.oplus.smartenginehelper.sliver;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.jla;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.smartenginehelper.entity.TextEntity;
import com.oplus.smartenginehelper.entity.VideoEntity;
import java.nio.charset.Charset;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJB\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0012J\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bJ\u0016\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0016J\u0016\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0016J\u0016\u0010\u0019\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0016J\u0016\u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0016J\u0016\u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u001c\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0016J\u0016\u0010\u001d\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0016J\u0016\u0010\u001e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0016J\u0016\u0010\u001f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0016J\u0016\u0010 \u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0016J\u0016\u0010!\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0016J\u0016\u0010\"\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0016J\u0016\u0010#\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0016J\u0016\u0010$\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0016J\u0016\u0010&\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u0016J\u0016\u0010(\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u0016J\u0016\u0010(\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000bJ.\u0010*\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0016J.\u0010*\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000bJ\u0016\u0010/\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bJ\u0016\u00101\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u0016J\u0016\u00102\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00103\u001a\u000204J\u0016\u00105\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0016J\u0016\u00105\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u00106\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00107\u001a\u000204J\u0016\u00108\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u0016J\u0016\u00109\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/oplus/smartenginehelper/sliver/SliverCoder;", "", "byteArray", "", "([B)V", "jsonArray", "Lorg/json/JSONArray;", jla.DEFAULT_BUILD_METHOD, ClickApiEntity.SET_BACKGROUND, "", "id", "", "src", "setClickToActivity", "packageName", "action", "category", "params", "", "setImageScaleType", ParserTag.TAG_SCALE_TYPE, "setImageViewResource", "", "setLayoutHeight", "size", "setLayoutWidth", "setLottieResource", "rawId", "setMarginBottom", "setMarginEnd", "setMarginStart", "setMarginTop", "setPaddingBottom", "setPaddingEnd", "setPaddingStart", "setPaddingTop", "setRoundImageRadius", "radius", "setRoundImageType", "type", ClickApiEntity.SET_TEXT_COLOR, "color", "setTextViewCompoundDrawables", "start", "top", TextEntity.ELLIPSIZE_END, "bottom", "setTextViewText", "value", "setTextViewTextSize", ClickApiEntity.SET_VIDEO_SPEED, "speed", "", "setVideoViewResource", ClickApiEntity.SET_VIDEO_VOLUME, SpeechConstant.KEY_VOLUME, "setViewVisibility", ClickApiEntity.SET_VISIBILITY, "visibility", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class SliverCoder {
    private final JSONArray jsonArray;

    public SliverCoder(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        this.jsonArray = new JSONArray(new String(byteArray, Charsets.UTF_8));
    }

    @NotNull
    public final byte[] build() {
        String string = this.jsonArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonArray.toString()");
        Charset charset = Charsets.UTF_8;
        if (string == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = string.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public final void setBackground(@NotNull String id, @NotNull String src) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(src, "src");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, "background", src);
    }

    public final void setClickToActivity(@NotNull String id, @NotNull String packageName, @NotNull String action, @Nullable String category, @Nullable Map<String, String> params) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(action, "action");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "activity");
        jSONObject.put("packageName", packageName);
        jSONObject.put("action", action);
        if (!(category == null || category.length() == 0)) {
            jSONObject.put("category", category);
        }
        if (!(params == null || params.isEmpty())) {
            jSONObject.put("params", new JSONObject(params));
        }
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, ParserTag.TAG_ONCLICK, jSONObject);
    }

    public final void setImageScaleType(@NotNull String id, @NotNull String scaleType) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, ParserTag.TAG_SCALE_TYPE, scaleType);
    }

    public final void setImageViewResource(@NotNull String id, @NotNull String src) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(src, "src");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, "src", src);
    }

    public final void setLayoutHeight(@NotNull String id, int size) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, "layout_height", Integer.valueOf(size));
    }

    public final void setLayoutWidth(@NotNull String id, int size) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, "layout_width", Integer.valueOf(size));
    }

    public final void setLottieResource(@NotNull String id, @NotNull String src) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(src, "src");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, ParserTag.ASSET_NAME, src);
    }

    public final void setMarginBottom(@NotNull String id, int size) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, "layout_marginBottom", Integer.valueOf(size));
    }

    public final void setMarginEnd(@NotNull String id, int size) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, "layout_marginEnd", Integer.valueOf(size));
    }

    public final void setMarginStart(@NotNull String id, int size) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, "layout_marginStart", Integer.valueOf(size));
    }

    public final void setMarginTop(@NotNull String id, int size) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, "layout_marginTop", Integer.valueOf(size));
    }

    public final void setPaddingBottom(@NotNull String id, int size) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, "paddingBottom", Integer.valueOf(size));
    }

    public final void setPaddingEnd(@NotNull String id, int size) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, "paddingEnd", Integer.valueOf(size));
    }

    public final void setPaddingStart(@NotNull String id, int size) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, "paddingStart", Integer.valueOf(size));
    }

    public final void setPaddingTop(@NotNull String id, int size) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, "paddingTop", Integer.valueOf(size));
    }

    public final void setRoundImageRadius(@NotNull String id, int radius) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, "borderRadius", Integer.valueOf(radius));
    }

    public final void setRoundImageType(@NotNull String id, int type) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, "imageType", Integer.valueOf(type));
    }

    public final void setTextColor(@NotNull String id, int color) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, ParserTag.TAG_TEXT_COLOR, Integer.valueOf(color));
    }

    public final void setTextViewCompoundDrawables(@NotNull String id, @NotNull String start, @NotNull String top, @NotNull String end, @NotNull String bottom) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        SliverUtils sliverUtils = SliverUtils.INSTANCE;
        sliverUtils.tryReplaceOrAdd(this.jsonArray, id, ParserTag.TAG_DRAWABLE_START, start);
        sliverUtils.tryReplaceOrAdd(this.jsonArray, id, ParserTag.TAG_DRAWABLE_TOP, top);
        sliverUtils.tryReplaceOrAdd(this.jsonArray, id, ParserTag.TAG_DRAWABLE_END, end);
        sliverUtils.tryReplaceOrAdd(this.jsonArray, id, ParserTag.TAG_DRAWABLE_BOTTOM, bottom);
    }

    public final void setTextViewText(@NotNull String id, @NotNull String value) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, "text", value);
    }

    public final void setTextViewTextSize(@NotNull String id, int value) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, ParserTag.TAG_TEXT_SIZE, Integer.valueOf(value));
    }

    public final void setVideoSpeed(@NotNull String id, float speed) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, VideoEntity.PLAY_SPEED, Float.valueOf(speed));
    }

    public final void setVideoViewResource(@NotNull String id, int src) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, "src", Integer.valueOf(src));
    }

    public final void setVideoVolume(@NotNull String id, float volume) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, VideoEntity.VOLUME_VALUE, Float.valueOf(volume));
    }

    public final void setViewVisibility(@NotNull String id, int value) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, "visibility", Integer.valueOf(value));
    }

    public final void setVisibility(@NotNull String id, int visibility) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, "visibility", Integer.valueOf(visibility));
    }

    public final void setImageViewResource(@NotNull String id, int src) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, "src", Integer.valueOf(src));
    }

    public final void setLottieResource(@NotNull String id, int rawId) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, ParserTag.ASSET_NAME, Integer.valueOf(rawId));
    }

    public final void setTextColor(@NotNull String id, @NotNull String color) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(color, "color");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, ParserTag.TAG_TEXT_COLOR, color);
    }

    public final void setVideoViewResource(@NotNull String id, @NotNull String src) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(src, "src");
        SliverUtils.INSTANCE.tryReplaceOrAdd(this.jsonArray, id, "src", src);
    }

    public final void setTextViewCompoundDrawables(@NotNull String id, int start, int top, int end, int bottom) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        SliverUtils sliverUtils = SliverUtils.INSTANCE;
        sliverUtils.tryReplaceOrAdd(this.jsonArray, id, ParserTag.TAG_DRAWABLE_START, Integer.valueOf(start));
        sliverUtils.tryReplaceOrAdd(this.jsonArray, id, ParserTag.TAG_DRAWABLE_TOP, Integer.valueOf(top));
        sliverUtils.tryReplaceOrAdd(this.jsonArray, id, ParserTag.TAG_DRAWABLE_END, Integer.valueOf(end));
        sliverUtils.tryReplaceOrAdd(this.jsonArray, id, ParserTag.TAG_DRAWABLE_BOTTOM, Integer.valueOf(bottom));
    }
}
