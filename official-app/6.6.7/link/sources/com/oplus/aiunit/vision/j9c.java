package com.oplus.aiunit.vision;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.oplus.vfxsdk.common.AnimatorType;
import com.oplus.vfxsdk.common.COEData;
import com.oplus.vfxsdk.common.Layer;
import com.oplus.vfxsdk.common.RendPass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@RequiresApi(33)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0007J*\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0006\u0010\u0016\u001a\u00020\fJ\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0003R\"\u0010\u001e\u001a\u00020\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR2\u0010#\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006` 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/j9c;", "Lcom/oplus/aiunit/vision/d6g;", "", "r", "", "passId", "Landroid/graphics/RuntimeShader;", "y", "", "z", "", "stateKey", "", "isSeekMode", "Lkotlin/Function0;", "endCb", "a", "B", "width", "height", "Landroid/graphics/RenderEffect;", "x", "A", "v", "t", "Lcom/oplus/aiunit/vision/j9c;", "w", "()Lcom/oplus/aiunit/vision/j9c;", "setAnimator", "(Lcom/oplus/aiunit/vision/j9c;)V", "animator", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "u", "Ljava/util/HashMap;", "runtimeShaderMap", "Companion", "rsview.1.1.0_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMultiPassShader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiPassShader.kt\ncom/oplus/vfxsdk/rsview/MultiPassShader\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n13374#2,3:108\n215#3,2:111\n215#3:113\n216#3:116\n288#4,2:114\n*S KotlinDebug\n*F\n+ 1 MultiPassShader.kt\ncom/oplus/vfxsdk/rsview/MultiPassShader\n*L\n31#1:108,3\n55#1:111,2\n65#1:113\n65#1:116\n68#1:114,2\n*E\n"})
public final class j9c extends d6g {

    @NotNull
    public static final String TAG = "MultiPassAnimator";

    @NotNull
    public static final String TYPE_USE_FBO = "UseFBO";

    @NotNull
    public j9c t;

    @NotNull
    public HashMap<Integer, RuntimeShader> u;

    public final boolean A() {
        return this.u.size() > 1;
    }

    public void B() {
        for (Map.Entry<Integer, HashMap<String, nmk<Object>>> entry : g().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            u(ff2.a(this.u.get(Integer.valueOf(iIntValue))), entry.getValue());
        }
    }

    @Override // com.oplus.vfxsdk.common.AbsAnimator, com.oplus.vfxsdk.common.a
    public void a(@NotNull String stateKey, boolean isSeekMode, @Nullable Function0<Unit> endCb) {
        Intrinsics.checkNotNullParameter(stateKey, "stateKey");
        super.a(stateKey, isSeekMode, endCb);
        m(AnimatorType.Slot);
    }

    @Override // com.oplus.aiunit.vision.d6g
    @RequiresApi(33)
    public void r() {
        RendPass[] render;
        Log.i(dvk.TAG, getS() + "=>load start");
        COEData i = getI();
        Intrinsics.checkNotNull(i);
        Layer[] layers = i.getLayers();
        if (layers != null) {
            int i2 = 0;
            Layer layer = (Layer) ArraysKt.getOrNull(layers, 0);
            if (layer == null || (render = layer.getRender()) == null) {
                return;
            }
            int length = render.length;
            int i3 = 0;
            while (i2 < length) {
                RendPass rendPass = render[i2];
                Log.i(dvk.TAG, getS() + "=>translate start");
                this.u.put(Integer.valueOf(i3), n(rendPass, getR()));
                i2++;
                i3++;
            }
        }
    }

    @RequiresApi(33)
    public final RenderEffect v(int width, int height) {
        nmk nmkVar;
        Collection<nmk<Object>> collectionValues;
        Object next;
        ArrayList arrayList = new ArrayList();
        HashMap<Integer, HashMap<String, nmk<Object>>> mapG = g();
        if (this.u.size() > 1 && this.u.size() == mapG.size()) {
            for (Map.Entry<Integer, RuntimeShader> entry : this.u.entrySet()) {
                int iIntValue = entry.getKey().intValue();
                RuntimeShader runtimeShaderA = ff2.a(entry.getValue());
                if (iIntValue > 0) {
                    HashMap<String, nmk<Object>> map = mapG.get(Integer.valueOf(iIntValue));
                    if (map == null || (collectionValues = map.values()) == null) {
                        nmkVar = null;
                    } else {
                        Intrinsics.checkNotNull(collectionValues);
                        Iterator<T> it = collectionValues.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.areEqual(TYPE_USE_FBO, ((nmk) next).getB()));
                        nmkVar = (nmk) next;
                    }
                    if (nmkVar != null && nmkVar.getA() != null) {
                        mc8.a(runtimeShaderA, nmkVar.getA() + "_size", width, height);
                        RenderEffect renderEffectCreateRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShaderA, nmkVar.getA());
                        Intrinsics.checkNotNullExpressionValue(renderEffectCreateRuntimeShaderEffect, "createRuntimeShaderEffect(...)");
                        arrayList.add(renderEffectCreateRuntimeShaderEffect);
                    }
                }
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        RenderEffect renderEffectA = h9c.a(arrayList.get(0));
        for (int i = 1; i < arrayList.size(); i++) {
            renderEffectA = RenderEffect.createChainEffect(h9c.a(arrayList.get(i)), renderEffectA);
            Intrinsics.checkNotNullExpressionValue(renderEffectA, "createChainEffect(...)");
            Log.d(getS(), "createChainEffect");
        }
        return renderEffectA;
    }

    @Override // com.oplus.vfxsdk.common.a
    @NotNull
    /* JADX INFO: renamed from: w, reason: from getter and merged with bridge method [inline-methods] */
    public j9c getV() {
        return this.t;
    }

    @RequiresApi(33)
    @Nullable
    public final RenderEffect x(int width, int height) {
        return v(width, height);
    }

    @RequiresApi(33)
    @Nullable
    public final RuntimeShader y(int passId) {
        return ff2.a(this.u.get(Integer.valueOf(passId)));
    }

    @RequiresApi(33)
    @NotNull
    public final List<RuntimeShader> z() {
        Collection<RuntimeShader> collectionValues = this.u.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        return CollectionsKt.toList(collectionValues);
    }
}
