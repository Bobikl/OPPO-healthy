package com.oplus.smartenginehelper.dsl;

import com.oplus.aiunit.vision.jla;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.AnimEntity;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.smartenginehelper.entity.ClickEntity;
import com.oplus.smartenginehelper.entity.ContentProviderClickEntity;
import com.oplus.smartenginehelper.entity.DrawableEntity;
import com.oplus.smartenginehelper.entity.StartActivityClickEntity;
import com.oplus.smartenginehelper.entity.StartAnimClickEntity;
import com.oplus.smartenginehelper.entity.StartServiceClickEntity;
import com.oplus.smartenginehelper.entity.ViewEntity;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0003J\u000e\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0017J\u000e\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0003J\u000e\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0014J\u000e\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u0017J\u000e\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0017J\u000e\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0003J\u000e\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u001eJ\u000e\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u0003J\u000e\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u001eJ\u000e\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u0003J\u000e\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\u001eJ\u000e\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\u001eJ\u000e\u00103\u001a\u00020\n2\u0006\u00104\u001a\u00020\u001eJ\u000e\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\u001eJ\u000e\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\u001eJ\u000e\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\u001eJ\u001f\u0010;\u001a\u00020\n2\u0012\u0010<\u001a\n\u0012\u0006\b\u0001\u0012\u00020>0=\"\u00020>¢\u0006\u0002\u0010?J\u000e\u0010@\u001a\u00020\n2\u0006\u0010A\u001a\u00020BJ\u000e\u0010C\u001a\u00020\n2\u0006\u0010D\u001a\u00020EJ\u000e\u0010F\u001a\u00020\n2\u0006\u0010G\u001a\u00020HJ\u000e\u0010I\u001a\u00020\n2\u0006\u0010J\u001a\u00020KJ\u000e\u0010L\u001a\u00020\n2\u0006\u0010M\u001a\u00020NJ\u000e\u0010O\u001a\u00020\n2\u0006\u0010P\u001a\u00020\u001eJ\u000e\u0010Q\u001a\u00020\n2\u0006\u0010R\u001a\u00020\u001eJ\u000e\u0010S\u001a\u00020\n2\u0006\u0010T\u001a\u00020\u001eJ\u000e\u0010U\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u001eJ\u000e\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020\u0011J\u000e\u0010Y\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\u0003J\u000e\u0010[\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\\\u001a\u00020\n2\u0006\u0010]\u001a\u00020\u001eJ\u000e\u0010\\\u001a\u00020\n2\u0006\u0010]\u001a\u00020\u0003R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006^"}, d2 = {"Lcom/oplus/smartenginehelper/dsl/DSLBuilder;", "", "packageName", "", "(Ljava/lang/String;)V", "mChildJSONArray", "Lorg/json/JSONArray;", "mJSONObject", "Lorg/json/JSONObject;", "addView", "", "viewEntity", "Lcom/oplus/smartenginehelper/entity/ViewEntity;", jla.DEFAULT_BUILD_METHOD, "", "seRootAnim", "animEntity", "Lcom/oplus/smartenginehelper/entity/AnimEntity;", "setRootAlpha", "alpha", "", "setRootAutoAnim", ParserTag.TAG_AUTO_ANIM, "", "setRootBackground", "drawableEntity", "Lcom/oplus/smartenginehelper/entity/DrawableEntity;", "background", "setRootBackgroundResource", "resId", "", "setRootClickable", ViewEntity.CLICKABLE, "setRootContentDescription", ViewEntity.CONTENT_DESCRIPTION, "setRootElevation", "elevation", "setRootEnabled", ViewEntity.ENABLED, "setRootForceDarkAllowed", ViewEntity.FORCE_DARK_ALLOWED, "setRootId", "id", "setRootLayoutHeight", "layoutHeight", "setRootLayoutWidth", "layoutWidth", "setRootMarginBottom", "marginBottom", "setRootMarginEnd", "marginEnd", "setRootMarginStart", "marginStart", "setRootMarginTop", "marginTop", "setRootMinHeight", ViewEntity.MIN_HEIGHT, "setRootMinWidth", ViewEntity.MIN_WIDTH, "setRootOnClick", "clickEntities", "", "Lcom/oplus/smartenginehelper/entity/ClickEntity;", "([Lcom/oplus/smartenginehelper/entity/ClickEntity;)V", "setRootOnClickApi", "clickApiEntity", "Lcom/oplus/smartenginehelper/entity/ClickApiEntity;", "setRootOnClickStartActivity", "startActivityClickEntity", "Lcom/oplus/smartenginehelper/entity/StartActivityClickEntity;", "setRootOnClickStartAnim", "startAnimClickEntity", "Lcom/oplus/smartenginehelper/entity/StartAnimClickEntity;", "setRootOnClickStartContentProvider", "contentProviderClickEntity", "Lcom/oplus/smartenginehelper/entity/ContentProviderClickEntity;", "setRootOnClickStartService", "startServiceClickEntity", "Lcom/oplus/smartenginehelper/entity/StartServiceClickEntity;", "setRootPaddingBottom", "paddingBottom", "setRootPaddingEnd", "paddingEnd", "setRootPaddingStart", "paddingStart", "setRootPaddingTop", "paddingTop", "setRootSliverAnim", "sliverAnimEntity", "setRootStateListAnimator", "stateListAnimator", "setRootStateListAnimatorResource", "setRootVisibility", "visibility", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class DSLBuilder {
    private JSONArray mChildJSONArray;
    private final JSONObject mJSONObject;

    public DSLBuilder(@Nullable String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.mJSONObject = jSONObject;
        jSONObject.put("type", ParserTag.TYPE_CONSTRAINT);
        if (str != null) {
            jSONObject.put("package", str);
        }
    }

    public final void addView(@NotNull ViewEntity viewEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(viewEntity, "viewEntity");
        if (this.mChildJSONArray == null) {
            JSONArray jSONArray = new JSONArray();
            this.mChildJSONArray = jSONArray;
            this.mJSONObject.put("child", jSONArray);
        }
        JSONArray jSONArray2 = this.mChildJSONArray;
        if (jSONArray2 != null) {
            jSONArray2.put(viewEntity.getMJSONObject());
        }
    }

    @NotNull
    public final byte[] build() {
        String string = this.mJSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "mJSONObject.toString()");
        Charset charset = Charsets.UTF_8;
        if (string == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = string.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public final void seRootAnim(@NotNull AnimEntity animEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(animEntity, "animEntity");
        this.mJSONObject.put(ParserTag.TAG_ANIM, animEntity.getMJSONObject());
    }

    public final void setRootAlpha(float alpha) throws JSONException {
        this.mJSONObject.put("alpha", Float.valueOf(alpha));
    }

    public final void setRootAutoAnim(boolean autoAnim) throws JSONException {
        this.mJSONObject.put(ParserTag.TAG_AUTO_ANIM, autoAnim);
    }

    public final void setRootBackground(@NotNull String background) throws JSONException {
        Intrinsics.checkNotNullParameter(background, "background");
        this.mJSONObject.put("background", background);
    }

    public final void setRootBackgroundResource(int resId) throws JSONException {
        this.mJSONObject.put("background", resId);
    }

    public final void setRootClickable(boolean clickable) throws JSONException {
        this.mJSONObject.put(ViewEntity.CLICKABLE, clickable);
    }

    public final void setRootContentDescription(@NotNull String contentDescription) throws JSONException {
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.mJSONObject.put(ViewEntity.CONTENT_DESCRIPTION, contentDescription);
    }

    public final void setRootElevation(float elevation) throws JSONException {
        this.mJSONObject.put("elevation", Float.valueOf(elevation));
    }

    public final void setRootEnabled(boolean enabled) throws JSONException {
        this.mJSONObject.put(ViewEntity.ENABLED, enabled);
    }

    public final void setRootForceDarkAllowed(boolean forceDarkAllowed) throws JSONException {
        this.mJSONObject.put(ViewEntity.FORCE_DARK_ALLOWED, forceDarkAllowed);
    }

    public final void setRootId(@NotNull String id) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        this.mJSONObject.put("id", id);
    }

    public final void setRootLayoutHeight(@NotNull String layoutHeight) throws JSONException {
        Intrinsics.checkNotNullParameter(layoutHeight, "layoutHeight");
        this.mJSONObject.put("layout_height", layoutHeight);
    }

    public final void setRootLayoutWidth(@NotNull String layoutWidth) throws JSONException {
        Intrinsics.checkNotNullParameter(layoutWidth, "layoutWidth");
        this.mJSONObject.put("layout_width", layoutWidth);
    }

    public final void setRootMarginBottom(int marginBottom) throws JSONException {
        this.mJSONObject.put("layout_marginBottom", marginBottom);
    }

    public final void setRootMarginEnd(int marginEnd) throws JSONException {
        this.mJSONObject.put("layout_marginEnd", marginEnd);
    }

    public final void setRootMarginStart(int marginStart) throws JSONException {
        this.mJSONObject.put("layout_marginStart", marginStart);
    }

    public final void setRootMarginTop(int marginTop) throws JSONException {
        this.mJSONObject.put("layout_marginTop", marginTop);
    }

    public final void setRootMinHeight(int minHeight) throws JSONException {
        this.mJSONObject.put(ViewEntity.MIN_HEIGHT, minHeight);
    }

    public final void setRootMinWidth(int minWidth) throws JSONException {
        this.mJSONObject.put(ViewEntity.MIN_WIDTH, minWidth);
    }

    public final void setRootOnClick(@NotNull ClickEntity... clickEntities) throws JSONException {
        Intrinsics.checkNotNullParameter(clickEntities, "clickEntities");
        JSONArray jSONArray = new JSONArray();
        for (ClickEntity clickEntity : clickEntities) {
            jSONArray.put(clickEntity.getMJSONObject());
        }
        this.mJSONObject.put(ParserTag.TAG_ONCLICK, jSONArray);
    }

    public final void setRootOnClickApi(@NotNull ClickApiEntity clickApiEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(clickApiEntity, "clickApiEntity");
        this.mJSONObject.put(ParserTag.TAG_ONCLICK, clickApiEntity.getMJSONObject());
    }

    public final void setRootOnClickStartActivity(@NotNull StartActivityClickEntity startActivityClickEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startActivityClickEntity, "startActivityClickEntity");
        this.mJSONObject.put(ParserTag.TAG_ONCLICK, startActivityClickEntity.getMJSONObject());
    }

    public final void setRootOnClickStartAnim(@NotNull StartAnimClickEntity startAnimClickEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startAnimClickEntity, "startAnimClickEntity");
        this.mJSONObject.put(ParserTag.TAG_ONCLICK, startAnimClickEntity.getMJSONObject());
    }

    public final void setRootOnClickStartContentProvider(@NotNull ContentProviderClickEntity contentProviderClickEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(contentProviderClickEntity, "contentProviderClickEntity");
        this.mJSONObject.put(ParserTag.TAG_ONCLICK, contentProviderClickEntity.getMJSONObject());
    }

    public final void setRootOnClickStartService(@NotNull StartServiceClickEntity startServiceClickEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(startServiceClickEntity, "startServiceClickEntity");
        this.mJSONObject.put(ParserTag.TAG_ONCLICK, startServiceClickEntity.getMJSONObject());
    }

    public final void setRootPaddingBottom(int paddingBottom) throws JSONException {
        this.mJSONObject.put("paddingBottom", paddingBottom);
    }

    public final void setRootPaddingEnd(int paddingEnd) throws JSONException {
        this.mJSONObject.put("paddingEnd", paddingEnd);
    }

    public final void setRootPaddingStart(int paddingStart) throws JSONException {
        this.mJSONObject.put("paddingStart", paddingStart);
    }

    public final void setRootPaddingTop(int paddingTop) throws JSONException {
        this.mJSONObject.put("paddingTop", paddingTop);
    }

    public final void setRootSliverAnim(@NotNull AnimEntity sliverAnimEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(sliverAnimEntity, "sliverAnimEntity");
        this.mJSONObject.put(ParserTag.TAG_SLIVER_ANIM, sliverAnimEntity.getMJSONObject());
    }

    public final void setRootStateListAnimator(@NotNull String stateListAnimator) throws JSONException {
        Intrinsics.checkNotNullParameter(stateListAnimator, "stateListAnimator");
        this.mJSONObject.put("stateListAnimator", stateListAnimator);
    }

    public final void setRootStateListAnimatorResource(int resId) throws JSONException {
        this.mJSONObject.put("stateListAnimator", resId);
    }

    public final void setRootVisibility(@NotNull String visibility) throws JSONException {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.mJSONObject.put("visibility", visibility);
    }

    public final void setRootBackground(@NotNull DrawableEntity drawableEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(drawableEntity, "drawableEntity");
        this.mJSONObject.put("background", drawableEntity.getMJSONObject());
    }

    public final void setRootLayoutHeight(int layoutHeight) throws JSONException {
        String strValueOf;
        if (layoutHeight != -2) {
            strValueOf = layoutHeight != -1 ? String.valueOf(layoutHeight) : ViewEntity.MATCH_PARENT;
        } else {
            strValueOf = ViewEntity.WRAP_CONTENT;
        }
        this.mJSONObject.put("layout_height", strValueOf);
    }

    public final void setRootLayoutWidth(int layoutWidth) throws JSONException {
        String strValueOf;
        if (layoutWidth != -2) {
            strValueOf = layoutWidth != -1 ? String.valueOf(layoutWidth) : ViewEntity.MATCH_PARENT;
        } else {
            strValueOf = ViewEntity.WRAP_CONTENT;
        }
        this.mJSONObject.put("layout_width", strValueOf);
    }

    public final void setRootVisibility(int visibility) throws JSONException {
        this.mJSONObject.put("visibility", visibility);
    }
}
