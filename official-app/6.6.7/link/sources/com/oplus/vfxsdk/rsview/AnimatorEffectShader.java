package com.oplus.vfxsdk.rsview;

import android.graphics.RuntimeShader;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.oplus.aiunit.vision.RuntimeShaderOptions;
import com.oplus.aiunit.vision.d6g;
import com.oplus.aiunit.vision.dvk;
import com.oplus.aiunit.vision.nmk;
import com.oplus.vfxsdk.common.AnimatorType;
import com.oplus.vfxsdk.common.COEData;
import com.oplus.vfxsdk.common.Layer;
import com.oplus.vfxsdk.common.RendPass;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.MyLRUCache;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@RequiresApi(33)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 02\u00020\u0001:\u0001\fB!\u0012\u0006\u0010)\u001a\u00020(\u0012\b\b\u0002\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J*\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\nH\u0016JX\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0012\"\u0004\b\u0000\u0010\r\"\u000e\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0012J\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0002R>\u0010\u001a\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0011j\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e`\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"RC\u0010'\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0011j\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e`\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b%\u0010&¨\u00061"}, d2 = {"Lcom/oplus/vfxsdk/rsview/AnimatorEffectShader;", "Lcom/oplus/aiunit/vision/d6g;", "", "r", "Landroid/graphics/RuntimeShader;", "x", "", "stateKey", "", "isSeekMode", "Lkotlin/Function0;", "endCb", "a", "K", "Lcom/oplus/aiunit/vision/nmk;", "", "V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "v", "A", "uniformName", "f", "z", "t", "Ljava/util/HashMap;", "uniformsMapSync", "u", "Landroid/graphics/RuntimeShader;", "mEffectShader", "Lcom/oplus/vfxsdk/rsview/AnimatorEffectShader;", "w", "()Lcom/oplus/vfxsdk/rsview/AnimatorEffectShader;", "setAnimator", "(Lcom/oplus/vfxsdk/rsview/AnimatorEffectShader;)V", "animator", "Lkotlin/Lazy;", "y", "()Ljava/util/HashMap;", "uniformsMap", "Lcom/oplus/vfxsdk/common/COEData;", "coeData", "", "layerIndex", "Lcom/oplus/aiunit/vision/e6g;", "options", "<init>", "(Lcom/oplus/vfxsdk/common/COEData;ILcom/oplus/aiunit/vision/e6g;)V", "Companion", "rsview.1.1.0_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAnimatorEffectShader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatorEffectShader.kt\ncom/oplus/vfxsdk/rsview/AnimatorEffectShader\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,172:1\n13309#2,2:173\n215#3,2:175\n*S KotlinDebug\n*F\n+ 1 AnimatorEffectShader.kt\ncom/oplus/vfxsdk/rsview/AnimatorEffectShader\n*L\n39#1:173,2\n67#1:175,2\n*E\n"})
public final class AnimatorEffectShader extends d6g {

    @NotNull
    public static final String TAG = "AnimatorEffectShader";

    @NotNull
    public HashMap<String, nmk<Object>> t;

    @Nullable
    public RuntimeShader u;

    @NotNull
    public AnimatorEffectShader v;

    @NotNull
    public final Lazy w;

    public /* synthetic */ AnimatorEffectShader(COEData cOEData, int i, RuntimeShaderOptions runtimeShaderOptions, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cOEData, (i2 & 2) != 0 ? 0 : i, runtimeShaderOptions);
    }

    @RequiresApi(33)
    public void A() {
        u(getU(), y());
    }

    @Override // com.oplus.vfxsdk.common.AbsAnimator, com.oplus.vfxsdk.common.a
    public void a(@NotNull String stateKey, boolean isSeekMode, @Nullable Function0<Unit> endCb) {
        Intrinsics.checkNotNullParameter(stateKey, "stateKey");
        super.a(stateKey, isSeekMode, endCb);
        if (getK() == AnimatorType.Animator) {
            z();
        }
        m(AnimatorType.Slot);
    }

    @Override // com.oplus.vfxsdk.common.AbsAnimator
    @Nullable
    public nmk<Object> f(@NotNull String uniformName) {
        Intrinsics.checkNotNullParameter(uniformName, "uniformName");
        return y().get(uniformName);
    }

    @Override // com.oplus.aiunit.vision.d6g
    @RequiresApi(33)
    public void r() {
        Layer layer;
        RendPass[] render;
        Layer layer2;
        RendPass[] render2;
        Log.i(dvk.TAG, getS() + "=>load start");
        COEData i = getI();
        Intrinsics.checkNotNull(i);
        Layer[] layers = i.getLayers();
        Integer numValueOf = (layers == null || (layer2 = (Layer) ArraysKt.getOrNull(layers, 0)) == null || (render2 = layer2.getRender()) == null) ? null : Integer.valueOf(render2.length);
        if (numValueOf != null) {
            numValueOf.intValue();
        }
        COEData i2 = getI();
        Intrinsics.checkNotNull(i2);
        Layer[] layers2 = i2.getLayers();
        if (layers2 == null || (layer = (Layer) ArraysKt.getOrNull(layers2, 0)) == null || (render = layer.getRender()) == null) {
            return;
        }
        for (RendPass rendPass : render) {
            Log.i(dvk.TAG, getS() + "=>translate start");
            Log.d(getS(), "haitest options:" + getR());
            this.u = n(rendPass, getR());
        }
    }

    @NotNull
    public final <K, V extends nmk<Object>> HashMap<K, V> v(@NotNull HashMap<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        MyLRUCache myLRUCache = (HashMap<K, V>) new HashMap();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            nmk nmkVarA = entry.getValue().a();
            Intrinsics.checkNotNull(nmkVarA, "null cannot be cast to non-null type V of com.oplus.vfxsdk.rsview.AnimatorEffectShader.deepCopy$lambda$2$lambda$1");
            myLRUCache.put(key, nmkVarA);
        }
        return myLRUCache;
    }

    @Override // com.oplus.vfxsdk.common.a
    @NotNull
    /* JADX INFO: renamed from: w, reason: from getter and merged with bridge method [inline-methods] */
    public AnimatorEffectShader getAnimator() {
        return this.v;
    }

    @RequiresApi(33)
    @Nullable
    /* JADX INFO: renamed from: x, reason: from getter */
    public final RuntimeShader getU() {
        return this.u;
    }

    public final HashMap<String, nmk<Object>> y() {
        return (HashMap) this.w.getValue();
    }

    public final void z() {
        this.t = v(y());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatorEffectShader(@NotNull COEData cOEData, int i, @NotNull RuntimeShaderOptions runtimeShaderOptions) {
        super(cOEData, i, runtimeShaderOptions);
        Intrinsics.checkNotNullParameter(cOEData, "coeData");
        Intrinsics.checkNotNullParameter(runtimeShaderOptions, "options");
        this.t = new HashMap<>();
        this.v = this;
        this.w = LazyKt.lazy(new Function0<HashMap<String, nmk<Object>>>() { // from class: com.oplus.vfxsdk.rsview.AnimatorEffectShader$uniformsMap$2
            {
                super(0);
            }

            @NotNull
            public final HashMap<String, nmk<Object>> invoke() {
                HashMap<String, nmk<Object>> map = this.this$0.g().get(0);
                Intrinsics.checkNotNull(map);
                return map;
            }
        });
        o();
    }
}
