package com.oplusos.vfxmodelviewer.view;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u00106\u001a\u0002072\u0006\u00108\u001a\u000209J\u000e\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u00020>J\u0006\u0010?\u001a\u000209R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u000201X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006@"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/ModelSceneConfig;", "", "()V", "aaType", "Lcom/oplusos/vfxmodelviewer/view/ModelScene$AAType;", "getAaType", "()Lcom/oplusos/vfxmodelviewer/view/ModelScene$AAType;", "setAaType", "(Lcom/oplusos/vfxmodelviewer/view/ModelScene$AAType;)V", "backgroundColor", "Lcom/oplusos/vfxmodelviewer/view/Color;", "getBackgroundColor", "()Lcom/oplusos/vfxmodelviewer/view/Color;", "setBackgroundColor", "(Lcom/oplusos/vfxmodelviewer/view/Color;)V", "enableBloom", "", "getEnableBloom", "()Z", "setEnableBloom", "(Z)V", "enableSSAO", "getEnableSSAO", "setEnableSSAO", "enableShadow", "getEnableShadow", "setEnableShadow", "enableSkyBox", "getEnableSkyBox", "setEnableSkyBox", "light", "Lcom/oplusos/vfxmodelviewer/view/LightConfig;", "getLight", "()Lcom/oplusos/vfxmodelviewer/view/LightConfig;", "setLight", "(Lcom/oplusos/vfxmodelviewer/view/LightConfig;)V", "materials", "Lcom/oplusos/vfxmodelviewer/view/MaterialGroupConfig;", "getMaterials", "()Lcom/oplusos/vfxmodelviewer/view/MaterialGroupConfig;", "setMaterials", "(Lcom/oplusos/vfxmodelviewer/view/MaterialGroupConfig;)V", "modelScale", "", "getModelScale", "()F", "setModelScale", "(F)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "fromJson", "", "jsonObject", "Lorg/json/JSONObject;", "read", "buffer", "Ljava/nio/ByteBuffer;", "toBytes", "", "toJson", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ModelSceneConfig {

    @NotNull
    private String name = "None";

    @NotNull
    private ModelScene.AAType aaType = ModelScene.AAType.FXAA;
    private boolean enableSkyBox = true;
    private boolean enableBloom = true;
    private boolean enableSSAO = true;
    private boolean enableShadow = true;

    @NotNull
    private Color backgroundColor = new Color(1.0f, 1.0f, 1.0f, 1.0f);
    private float modelScale = 1.0f;

    @NotNull
    private MaterialGroupConfig materials = new MaterialGroupConfig();

    @NotNull
    private LightConfig light = new LightConfig();

    public final void fromJson(@NotNull JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        if (jsonObject.has("name")) {
            String string = jsonObject.getString("name");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"name\")");
            this.name = string;
        }
        if (jsonObject.has("aaType")) {
            this.aaType = ModelScene.AAType.values()[jsonObject.getInt("aaType")];
        }
        this.enableSkyBox = jsonObject.getBoolean("enableSkyBox");
        if (jsonObject.has("enableBloom")) {
            this.enableBloom = jsonObject.getBoolean("enableBloom");
        }
        if (jsonObject.has("enableSSAO")) {
            this.enableSSAO = jsonObject.getBoolean("enableSSAO");
        }
        if (jsonObject.has("enableShadow")) {
            this.enableShadow = jsonObject.getBoolean("enableShadow");
        }
        if (jsonObject.has("backgroundColor")) {
            this.backgroundColor.fromJson(jsonObject.getJSONArray("backgroundColor"));
        }
        if (jsonObject.has("materials")) {
            MaterialGroupConfig materialGroupConfig = this.materials;
            JSONObject jSONObject = jsonObject.getJSONObject("materials");
            Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.getJSONObject(\"materials\")");
            materialGroupConfig.fromJson(jSONObject);
        }
        if (jsonObject.has("modelScale")) {
            this.modelScale = (float) jsonObject.getDouble("modelScale");
        }
        if (jsonObject.has("light")) {
            LightConfig lightConfig = this.light;
            JSONObject jSONObject2 = jsonObject.getJSONObject("light");
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.getJSONObject(\"light\")");
            lightConfig.fromJson(jSONObject2);
        }
    }

    @NotNull
    public final ModelScene.AAType getAaType() {
        return this.aaType;
    }

    @NotNull
    public final Color getBackgroundColor() {
        return this.backgroundColor;
    }

    public final boolean getEnableBloom() {
        return this.enableBloom;
    }

    public final boolean getEnableSSAO() {
        return this.enableSSAO;
    }

    public final boolean getEnableShadow() {
        return this.enableShadow;
    }

    public final boolean getEnableSkyBox() {
        return this.enableSkyBox;
    }

    @NotNull
    public final LightConfig getLight() {
        return this.light;
    }

    @NotNull
    public final MaterialGroupConfig getMaterials() {
        return this.materials;
    }

    public final float getModelScale() {
        return this.modelScale;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void read(@NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Charset charsetForName = Charset.forName("utf-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(\"utf-8\")");
        fromJson(new JSONObject(charsetForName.decode(buffer).toString()));
    }

    public final void setAaType(@NotNull ModelScene.AAType aAType) {
        Intrinsics.checkNotNullParameter(aAType, "<set-?>");
        this.aaType = aAType;
    }

    public final void setBackgroundColor(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "<set-?>");
        this.backgroundColor = color;
    }

    public final void setEnableBloom(boolean z) {
        this.enableBloom = z;
    }

    public final void setEnableSSAO(boolean z) {
        this.enableSSAO = z;
    }

    public final void setEnableShadow(boolean z) {
        this.enableShadow = z;
    }

    public final void setEnableSkyBox(boolean z) {
        this.enableSkyBox = z;
    }

    public final void setLight(@NotNull LightConfig lightConfig) {
        Intrinsics.checkNotNullParameter(lightConfig, "<set-?>");
        this.light = lightConfig;
    }

    public final void setMaterials(@NotNull MaterialGroupConfig materialGroupConfig) {
        Intrinsics.checkNotNullParameter(materialGroupConfig, "<set-?>");
        this.materials = materialGroupConfig;
    }

    public final void setModelScale(float f) {
        this.modelScale = f;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    @NotNull
    public final byte[] toBytes() {
        String string = toJson().toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", this.name).put("aaType", this.aaType.ordinal()).put("enableSkyBox", this.enableSkyBox).put("enableBloom", this.enableBloom).put("enableSSAO", this.enableSSAO).put("enableShadow", this.enableShadow).put("backgroundColor", this.backgroundColor.toJson()).put("materials", this.materials.toJson()).put("modelScale", this.modelScale).put("light", this.light.toJson());
        return jSONObject;
    }
}
