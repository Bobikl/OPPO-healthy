package com.oplusos.vfxmodelviewer.view;

import com.oplus.smartenginehelper.ParserTag;
import com.oplusos.vfxmodelviewer.filament.MaterialInstance;
import com.oplusos.vfxmodelviewer.gltfio.FilamentAsset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006J\u0006\u0010\u0014\u001a\u00020\rJ\u000e\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/MaterialGroupConfig;", "", "()V", "materials", "Ljava/util/ArrayList;", "Lcom/oplusos/vfxmodelviewer/view/MaterialConfig;", "Lkotlin/collections/ArrayList;", "applyRender", "", ParserTag.ASSET_NAME, "Lcom/oplusos/vfxmodelviewer/gltfio/FilamentAsset;", "fromJson", "jsonObject", "Lorg/json/JSONObject;", "fromRender", "getMaterial", "index", "", "getMaterialCount", "getMaterials", "toJson", "updateFromRender", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MaterialGroupConfig {

    @NotNull
    private ArrayList<MaterialConfig> materials = new ArrayList<>();

    public final void applyRender(@NotNull FilamentAsset asset) {
        Intrinsics.checkNotNullParameter(asset, ParserTag.ASSET_NAME);
        MaterialInstance[] materialInstances = asset.getMaterialInstances();
        Intrinsics.checkNotNullExpressionValue(materialInstances, "asset.materialInstances");
        int size = this.materials.size();
        if (size > materialInstances.length) {
            size = materialInstances.length;
        }
        if (size <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            MaterialConfig materialConfig = this.materials.get(i);
            MaterialInstance materialInstance = materialInstances[i];
            Intrinsics.checkNotNullExpressionValue(materialInstance, "ms[index]");
            materialConfig.applyMaterialInstance(materialInstance);
            if (i2 >= size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final void fromJson(@NotNull JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.materials.clear();
        JSONArray jSONArray = jsonObject.getJSONArray("materials");
        int length = jSONArray.length();
        if (length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            MaterialConfig materialConfig = new MaterialConfig();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "array.getJSONObject(index)");
            materialConfig.fromJson(jSONObject);
            this.materials.add(materialConfig);
            if (i2 >= length) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final void fromRender(@NotNull FilamentAsset asset) {
        Intrinsics.checkNotNullParameter(asset, ParserTag.ASSET_NAME);
        this.materials.clear();
        MaterialInstance[] materialInstances = asset.getMaterialInstances();
        Intrinsics.checkNotNullExpressionValue(materialInstances, "asset.materialInstances");
        int length = materialInstances.length;
        int i = 0;
        while (i < length) {
            MaterialInstance materialInstance = materialInstances[i];
            i++;
            MaterialConfig materialConfig = new MaterialConfig();
            Intrinsics.checkNotNullExpressionValue(materialInstance, "ins");
            materialConfig.fromMaterial(materialInstance);
            this.materials.add(materialConfig);
        }
    }

    @Nullable
    public final MaterialConfig getMaterial(int index) {
        if (index < 0 || index >= this.materials.size()) {
            return null;
        }
        return this.materials.get(index);
    }

    public final int getMaterialCount() {
        return this.materials.size();
    }

    @NotNull
    public final ArrayList<MaterialConfig> getMaterials() {
        return this.materials;
    }

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<MaterialConfig> it = this.materials.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJson());
        }
        jSONObject.put("materials", jSONArray);
        return jSONObject;
    }

    public final void updateFromRender(@NotNull FilamentAsset asset) {
        int size;
        Intrinsics.checkNotNullParameter(asset, ParserTag.ASSET_NAME);
        MaterialInstance[] materialInstances = asset.getMaterialInstances();
        Intrinsics.checkNotNullExpressionValue(materialInstances, "asset.materialInstances");
        boolean z = true;
        int i = 0;
        boolean z2 = materialInstances.length != this.materials.size();
        if (!z2 && (size = this.materials.size()) > 0) {
            while (true) {
                int i2 = i + 1;
                if (!Intrinsics.areEqual(this.materials.get(i).getName(), materialInstances[i].getName())) {
                    break;
                }
                if (i2 >= size) {
                    z = z2;
                    break;
                }
                i = i2;
            }
        } else {
            z = z2;
            break;
        }
        if (z) {
            fromRender(asset);
        }
    }
}
