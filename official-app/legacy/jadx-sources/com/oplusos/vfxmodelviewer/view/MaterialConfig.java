package com.oplusos.vfxmodelviewer.view;

import com.oplusos.vfxmodelviewer.filament.Material;
import com.oplusos.vfxmodelviewer.filament.MaterialInstance;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u0004J\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fJ\u0006\u0010\u0017\u001a\u00020\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/MaterialConfig;", "", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "property", "Ljava/util/ArrayList;", "Lcom/oplusos/vfxmodelviewer/view/MaterialConfig$MaterialPropertyConfig;", "Lkotlin/collections/ArrayList;", "applyMaterialInstance", "", "ins", "Lcom/oplusos/vfxmodelviewer/filament/MaterialInstance;", "fromJson", "jsonObject", "Lorg/json/JSONObject;", "fromMaterial", "getMaterialProperty", "getPropertyList", "toJson", "MaterialPropertyConfig", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MaterialConfig {

    @NotNull
    private String name = "";

    @NotNull
    private ArrayList<MaterialPropertyConfig> property = new ArrayList<>();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/MaterialConfig$MaterialPropertyConfig;", "", "()V", "color", "Lcom/oplusos/vfxmodelviewer/view/Color;", "getColor", "()Lcom/oplusos/vfxmodelviewer/view/Color;", "setColor", "(Lcom/oplusos/vfxmodelviewer/view/Color;)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "type", "Lcom/oplusos/vfxmodelviewer/filament/Material$Parameter$Type;", "getType", "()Lcom/oplusos/vfxmodelviewer/filament/Material$Parameter$Type;", "setType", "(Lcom/oplusos/vfxmodelviewer/filament/Material$Parameter$Type;)V", "value", "", "getValue", "()F", "setValue", "(F)V", "fromJson", "", "jsonObject", "Lorg/json/JSONObject;", "toJson", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class MaterialPropertyConfig {

        @NotNull
        private String name = "";
        private float value = 1.0f;

        @NotNull
        private Color color = new Color(0.0f, 0.0f, 0.0f, 0.0f, 15, null);

        @NotNull
        private Material.Parameter.Type type = Material.Parameter.Type.FLOAT;

        public final void fromJson(@NotNull JSONObject jsonObject) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String string = jsonObject.getString("name");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"name\")");
            this.name = string;
            this.value = (float) jsonObject.getDouble("value");
            this.color.fromJson(jsonObject.getJSONArray("color"));
            if (jsonObject.has("type")) {
                this.type = Material.Parameter.Type.values()[jsonObject.getInt("type")];
            }
        }

        @NotNull
        public final Color getColor() {
            return this.color;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Material.Parameter.Type getType() {
            return this.type;
        }

        public final float getValue() {
            return this.value;
        }

        public final void setColor(@NotNull Color color) {
            Intrinsics.checkNotNullParameter(color, "<set-?>");
            this.color = color;
        }

        public final void setName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.name = str;
        }

        public final void setType(@NotNull Material.Parameter.Type type) {
            Intrinsics.checkNotNullParameter(type, "<set-?>");
            this.type = type;
        }

        public final void setValue(float f) {
            this.value = f;
        }

        @NotNull
        public final JSONObject toJson() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", this.name).put("value", this.value).put("color", this.color.toJson()).put("type", this.type.ordinal());
            return jSONObject;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Material.Parameter.Type.values().length];
            iArr[Material.Parameter.Type.FLOAT.ordinal()] = 1;
            iArr[Material.Parameter.Type.FLOAT4.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void applyMaterialInstance(@NotNull MaterialInstance ins) {
        Intrinsics.checkNotNullParameter(ins, "ins");
        for (MaterialPropertyConfig materialPropertyConfig : this.property) {
            int i = WhenMappings.$EnumSwitchMapping$0[materialPropertyConfig.getType().ordinal()];
            if (i == 1) {
                ins.setParameter(materialPropertyConfig.getName(), materialPropertyConfig.getValue());
            } else if (i == 2) {
                ins.setParameter(materialPropertyConfig.getName(), materialPropertyConfig.getColor().getR(), materialPropertyConfig.getColor().getG(), materialPropertyConfig.getColor().getB(), materialPropertyConfig.getColor().getA());
            }
        }
    }

    public final void fromJson(@NotNull JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.property.clear();
        String string = jsonObject.getString("name");
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"name\")");
        this.name = string;
        JSONArray jSONArray = jsonObject.getJSONArray("property");
        int length = jSONArray.length();
        if (length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            MaterialPropertyConfig materialPropertyConfig = new MaterialPropertyConfig();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "array.getJSONObject(i)");
            materialPropertyConfig.fromJson(jSONObject);
            this.property.add(materialPropertyConfig);
            if (i2 >= length) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final void fromMaterial(@NotNull MaterialInstance ins) {
        Intrinsics.checkNotNullParameter(ins, "ins");
        this.property.clear();
        String name = ins.getName();
        Intrinsics.checkNotNullExpressionValue(name, "ins.name");
        this.name = name;
        for (Material.Parameter parameter : ins.getMaterial().getParameters()) {
            if (Intrinsics.areEqual(parameter.name, "baseColorFactor") || parameter.type == Material.Parameter.Type.FLOAT) {
                MaterialPropertyConfig materialPropertyConfig = new MaterialPropertyConfig();
                String str = parameter.name;
                Intrinsics.checkNotNullExpressionValue(str, "p.name");
                materialPropertyConfig.setName(str);
                Material.Parameter.Type type = parameter.type;
                Intrinsics.checkNotNullExpressionValue(type, "p.type");
                materialPropertyConfig.setType(type);
                materialPropertyConfig.setValue(0.0f);
                this.property.add(materialPropertyConfig);
            }
        }
    }

    @Nullable
    public final MaterialPropertyConfig getMaterialProperty(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        for (MaterialPropertyConfig materialPropertyConfig : this.property) {
            if (Intrinsics.areEqual(materialPropertyConfig.getName(), name)) {
                return materialPropertyConfig;
            }
        }
        return null;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ArrayList<MaterialPropertyConfig> getPropertyList() {
        return this.property;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", this.name);
        JSONArray jSONArray = new JSONArray();
        Iterator<MaterialPropertyConfig> it = this.property.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJson());
        }
        jSONObject.put("property", jSONArray);
        return jSONObject;
    }
}
