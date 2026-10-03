package com.oplus.vfxsdk.common;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Log;
import android.view.animation.PathInterpolator;
import com.oplus.aiunit.vision.Param;
import com.oplus.aiunit.vision.dvk;
import com.oplus.aiunit.vision.hw9;
import com.oplus.aiunit.vision.j9c;
import com.oplus.aiunit.vision.k9e;
import com.oplus.aiunit.vision.l9e;
import com.oplus.aiunit.vision.nmk;
import com.oplus.aiunit.vision.oo9;
import com.oplus.aiunit.vision.p9e;
import com.oplus.aiunit.vision.t0a;
import com.oplus.aiunit.vision.vr3;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.wearable.linkservice.sdk.Node;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b!\b&\u0018\u0000 R2\u00020\u0001:\u0001%B\u0019\u0012\u0006\u0010,\u001a\u00020(\u0012\b\b\u0002\u00101\u001a\u00020\u0005¢\u0006\u0004\bP\u0010QJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\\\u0010\n\u001aX\u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00040\u0004j6\u0012\u0004\u0012\u00020\u0005\u0012,\u0012*\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004j\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007`\t`\tJZ\u0010\u0015\u001a6\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012\u0018\u00010\u0011j\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012\u0018\u0001`\u00142\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fJ4\u0010\u0019\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0004j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0006H\u0016J(\u0010\u001c\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0004j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\tH\u0016J4\u0010\u001f\u001a.\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0018\u00010\u0004j\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0018\u0001`\tH\u0016J*\u0010%\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0010\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010#H\u0016J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010&\u001a\u00020\u0006H\u0016R\u0017\u0010,\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b*\u0010+R\u0017\u00101\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\"\u00108\u001a\u0002028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0003\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107RB\u0010>\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0004j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001b\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0082\u0001\u0010?\u001an\u0012\u0004\u0012\u00020\u0005\u0012,\u0012*\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004j\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007`\t0\u0004j6\u0012\u0004\u0012\u00020\u0005\u0012,\u0012*\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004j\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007`\t`\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00109RV\u0010F\u001a6\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012\u0018\u00010\u0011j\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012\u0018\u0001`\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010K\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010.\u001a\u0004\bH\u00100\"\u0004\bI\u0010JR\"\u0010O\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010.\u001a\u0004\bM\u00100\"\u0004\bN\u0010J¨\u0006S"}, d2 = {"Lcom/oplus/vfxsdk/common/AbsAnimator;", "Lcom/oplus/vfxsdk/common/a;", "", "k", "Ljava/util/HashMap;", "", "", "Lcom/oplus/aiunit/vision/nmk;", "", "Lkotlin/collections/HashMap;", "g", "Lcom/oplus/aiunit/vision/oo9;", "cb", "Landroid/animation/TimeInterpolator;", ParserTag.TAG_INTERPOLATOR, "", "duration", "Ljava/util/ArrayList;", "", "Lcom/oplus/aiunit/vision/hw9;", "Lkotlin/collections/ArrayList;", "i", "Lcom/oplus/aiunit/vision/t0a;", "update", "Lcom/oplus/vfxsdk/common/Animator;", "h", Node.I_KEY, "l", "d", "", "Lcom/oplus/vfxsdk/common/PassParams;", "b", "stateKey", "", "isSeekMode", "Lkotlin/Function0;", "endCb", "a", "uniformName", "f", "Lcom/oplus/vfxsdk/common/COEData;", "Lcom/oplus/vfxsdk/common/COEData;", "e", "()Lcom/oplus/vfxsdk/common/COEData;", "coeData", "j", "I", "getLayerIndex", "()I", "layerIndex", "Lcom/oplus/vfxsdk/common/AnimatorType;", "Lcom/oplus/vfxsdk/common/AnimatorType;", "c", "()Lcom/oplus/vfxsdk/common/AnimatorType;", "m", "(Lcom/oplus/vfxsdk/common/AnimatorType;)V", "animatorType", "Ljava/util/HashMap;", "getAnimatorMap", "()Ljava/util/HashMap;", "setAnimatorMap", "(Ljava/util/HashMap;)V", "animatorMap", "uniformMapList", "n", "Ljava/util/ArrayList;", "getDefaultPassParam", "()Ljava/util/ArrayList;", "setDefaultPassParam", "(Ljava/util/ArrayList;)V", "defaultPassParam", "o", "getParameterCount", "setParameterCount", "(I)V", "parameterCount", "p", "getStateAnimatorStartedCount", "setStateAnimatorStartedCount", "stateAnimatorStartedCount", "<init>", "(Lcom/oplus/vfxsdk/common/COEData;I)V", "Companion", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAbsAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsAnimator.kt\ncom/oplus/vfxsdk/common/AbsAnimator\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n13374#2,2:438\n13376#2:442\n13309#2:444\n11065#2:445\n11400#2,3:446\n13310#2:449\n13309#2,2:452\n13309#2:456\n11065#2:457\n11400#2,3:458\n11065#2:461\n11400#2,3:462\n11065#2:465\n11400#2,3:466\n13310#2:469\n1855#3,2:440\n1855#3:443\n1856#3:450\n1855#3:455\n1856#3:470\n1855#3,2:471\n215#4:451\n216#4:454\n215#4:473\n216#4:475\n1#5:474\n*S KotlinDebug\n*F\n+ 1 AbsAnimator.kt\ncom/oplus/vfxsdk/common/AbsAnimator\n*L\n48#1:438,2\n48#1:442\n100#1:444\n117#1:445\n117#1:446,3\n100#1:449\n140#1:452,2\n327#1:456\n349#1:457\n349#1:458,3\n380#1:461\n380#1:462,3\n389#1:465\n389#1:466,3\n327#1:469\n52#1:440,2\n93#1:443\n93#1:450\n324#1:455\n324#1:470\n414#1:471,2\n139#1:451\n139#1:454\n425#1:473\n425#1:475\n*E\n"})
public abstract class AbsAnimator implements a {

    @NotNull
    public static final String q = "AbsAnimator";

    @NotNull
    public final COEData i;
    public final int j;

    @NotNull
    public AnimatorType k;

    @Nullable
    public HashMap<String, Animator> l;

    @NotNull
    public HashMap<Integer, HashMap<String, nmk<Object>>> m;

    @Nullable
    public ArrayList<Map<String, hw9<?>>> n;
    public int o;
    public int p;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/oplus/vfxsdk/common/AbsAnimator$b", "Lcom/oplus/aiunit/vision/t0a;", "", Node.I_KEY, "", "value", "", "a", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
    public static final class b implements t0a {
        public final /* synthetic */ hw9<?> a;

        public b(hw9<?> hw9Var) {
            this.a = hw9Var;
        }

        @Override // com.oplus.aiunit.vision.t0a
        public void a(@NotNull String key, @NotNull Object value) {
            Intrinsics.checkNotNullParameter(key, Node.I_KEY);
            Intrinsics.checkNotNullParameter(value, "value");
            hw9<?> hw9Var = this.a;
            if (hw9Var instanceof k9e) {
                ((k9e) hw9Var).j((Float) value);
            } else if (hw9Var instanceof p9e) {
                ((p9e) hw9Var).j((Integer) value);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/oplus/vfxsdk/common/AbsAnimator$c", "Lcom/oplus/aiunit/vision/t0a;", "", Node.I_KEY, "", "value", "", "a", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
    public static final class c implements t0a {
        public final /* synthetic */ oo9 a;
        public final /* synthetic */ int b;

        public c(oo9 oo9Var, int i) {
            this.a = oo9Var;
            this.b = i;
        }

        @Override // com.oplus.aiunit.vision.t0a
        public void a(@NotNull String key, @NotNull Object value) {
            Intrinsics.checkNotNullParameter(key, Node.I_KEY);
            Intrinsics.checkNotNullParameter(value, "value");
            oo9 oo9Var = this.a;
            if (oo9Var != null) {
                oo9Var.a(Integer.valueOf(this.b), key, value);
            }
        }
    }

    public AbsAnimator(@NotNull COEData cOEData, int i) {
        Intrinsics.checkNotNullParameter(cOEData, "coeData");
        this.i = cOEData;
        this.j = i;
        this.k = AnimatorType.Animator;
        this.m = new HashMap<>();
    }

    public static /* synthetic */ ArrayList j(AbsAnimator absAnimator, oo9 oo9Var, TimeInterpolator timeInterpolator, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initStateParams");
        }
        if ((i & 1) != 0) {
            oo9Var = null;
        }
        if ((i & 2) != 0) {
            timeInterpolator = new PathInterpolator(0.3f, vr3.UNSET, 0.1f, 1.0f);
        }
        if ((i & 4) != 0) {
            j = 400;
        }
        return absAnimator.i(oo9Var, timeInterpolator, j);
    }

    /* JADX WARN: Code duplicated, block: B:99:0x026c  */
    @Override // com.oplus.vfxsdk.common.a
    public void a(@NotNull String stateKey, boolean isSeekMode, @Nullable final Function0<Unit> endCb) {
        Layer[] layers;
        Layer layer;
        HashMap<String, PassParams[]> params;
        PassParams[] passParamsArr;
        Iterator it;
        UniformValue[] uniformValueArr;
        Map map;
        hw9 hw9Var;
        ObjectAnimator c2;
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        Intrinsics.checkNotNullParameter(stateKey, "stateKey");
        Log.i(dvk.TAG, "onTriger: " + stateKey + ", seekMode: " + isSeekMode);
        ArrayList<Map<String, hw9<?>>> arrayList = this.n;
        if (arrayList != null) {
            Intrinsics.checkNotNull(arrayList);
            if (!arrayList.isEmpty()) {
                HashMap<String, Animator> mapD = d();
                if (mapD != null) {
                    Iterator<Map.Entry<String, Animator>> it2 = mapD.entrySet().iterator();
                    while (it2.hasNext()) {
                        it2.next().getValue().stop();
                    }
                }
                COEData cOEData = this.i;
                if (cOEData == null || (layers = cOEData.getLayers()) == null || (layer = (Layer) ArraysKt.getOrNull(layers, this.j)) == null || (params = layer.getParams()) == null || (passParamsArr = params.get(stateKey)) == null) {
                    return;
                }
                int i = 0;
                this.p = 0;
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = ArraysKt.withIndex(passParamsArr).iterator();
                while (it3.hasNext()) {
                    IndexedValue indexedValue = (IndexedValue) it3.next();
                    int iComponent1 = indexedValue.component1();
                    PassParams passParams = (PassParams) indexedValue.component2();
                    final Ref.IntRef intRef = new Ref.IntRef();
                    final Ref.IntRef intRef2 = new Ref.IntRef();
                    UniformValue[] uniformPrams = passParams.getUniformPrams();
                    int length = uniformPrams.length;
                    int i2 = i;
                    while (i2 < length) {
                        UniformValue uniformValue = uniformPrams[i2];
                        ArrayList<Map<String, hw9<?>>> arrayList3 = this.n;
                        if (arrayList3 == null || (map = (Map) CollectionsKt.getOrNull(arrayList3, iComponent1)) == null || (hw9Var = (hw9) map.get(uniformValue.getName())) == null) {
                            it = it3;
                        } else {
                            if (endCb != null) {
                                hw9Var.b(new Function0<Unit>() { // from class: com.oplus.vfxsdk.common.AbsAnimator$onTriger$2$1$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke() {
                                        invoke();
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke() {
                                        Ref.IntRef intRef3 = intRef2;
                                        int i3 = intRef3.element + 1;
                                        intRef3.element = i3;
                                        if (i3 == intRef.element) {
                                            endCb.invoke();
                                        }
                                    }
                                });
                            }
                            it = it3;
                            if (uniformValue.getDuration() >= 10) {
                                uniformValueArr = uniformPrams;
                                if (hw9Var instanceof k9e) {
                                    if (isSeekMode) {
                                        Object obj = uniformValue.getValues()[0];
                                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Float");
                                        ((k9e) hw9Var).j((Float) obj);
                                    } else {
                                        Object obj2 = uniformValue.getValues()[0];
                                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Float");
                                        c2 = ((k9e) hw9Var).e((Float) obj2).getC();
                                        if (c2 != null) {
                                            intRef.element++;
                                            this.p++;
                                            c2.setInterpolator(new PathInterpolator(uniformValue.getBezier()[0].floatValue(), uniformValue.getBezier()[1].floatValue(), uniformValue.getBezier()[2].floatValue(), uniformValue.getBezier()[3].floatValue()));
                                            c2.setDuration(uniformValue.getDuration());
                                            c2.setStartDelay(uniformValue.getDelay());
                                            arrayList2.add(c2);
                                        }
                                    }
                                } else if (!(hw9Var instanceof p9e)) {
                                    if (!(hw9Var instanceof l9e)) {
                                        c2 = null;
                                    } else if (isSeekMode) {
                                        l9e l9eVar = (l9e) hw9Var;
                                        Object[] values = uniformValue.getValues();
                                        ArrayList arrayList4 = new ArrayList(values.length);
                                        int length2 = values.length;
                                        int i3 = 0;
                                        while (i3 < length2) {
                                            Object obj3 = values[i3];
                                            Object[] objArr = values;
                                            if (obj3 instanceof Integer) {
                                                fFloatValue2 = ((Number) obj3).intValue();
                                            } else {
                                                if (!(obj3 instanceof Float)) {
                                                    throw new IllegalArgumentException("cannot convert");
                                                }
                                                fFloatValue2 = ((Number) obj3).floatValue();
                                            }
                                            arrayList4.add(Float.valueOf(fFloatValue2));
                                            i3++;
                                            values = objArr;
                                        }
                                        l9eVar.j(CollectionsKt.toFloatArray(arrayList4));
                                    } else {
                                        l9e l9eVar2 = (l9e) hw9Var;
                                        Object[] values2 = uniformValue.getValues();
                                        ArrayList arrayList5 = new ArrayList(values2.length);
                                        int length3 = values2.length;
                                        int i4 = 0;
                                        while (i4 < length3) {
                                            int i5 = length3;
                                            Object obj4 = values2[i4];
                                            Object[] objArr2 = values2;
                                            if (obj4 instanceof Integer) {
                                                fFloatValue = ((Number) obj4).intValue();
                                            } else {
                                                if (!(obj4 instanceof Float)) {
                                                    throw new IllegalArgumentException("cannot convert");
                                                }
                                                fFloatValue = ((Number) obj4).floatValue();
                                            }
                                            arrayList5.add(Float.valueOf(fFloatValue));
                                            i4++;
                                            length3 = i5;
                                            values2 = objArr2;
                                        }
                                        c2 = l9eVar2.e(CollectionsKt.toFloatArray(arrayList5)).getC();
                                    }
                                    if (c2 != null) {
                                        intRef.element++;
                                        this.p++;
                                        c2.setInterpolator(new PathInterpolator(uniformValue.getBezier()[0].floatValue(), uniformValue.getBezier()[1].floatValue(), uniformValue.getBezier()[2].floatValue(), uniformValue.getBezier()[3].floatValue()));
                                        c2.setDuration(uniformValue.getDuration());
                                        c2.setStartDelay(uniformValue.getDelay());
                                        arrayList2.add(c2);
                                    }
                                } else if (isSeekMode) {
                                    Object obj5 = uniformValue.getValues()[0];
                                    Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
                                    ((p9e) hw9Var).j((Integer) obj5);
                                } else {
                                    Object obj6 = uniformValue.getValues()[0];
                                    Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Int");
                                    c2 = ((p9e) hw9Var).e((Integer) obj6).getC();
                                    if (c2 != null) {
                                        intRef.element++;
                                        this.p++;
                                        c2.setInterpolator(new PathInterpolator(uniformValue.getBezier()[0].floatValue(), uniformValue.getBezier()[1].floatValue(), uniformValue.getBezier()[2].floatValue(), uniformValue.getBezier()[3].floatValue()));
                                        c2.setDuration(uniformValue.getDuration());
                                        c2.setStartDelay(uniformValue.getDelay());
                                        arrayList2.add(c2);
                                    }
                                }
                            } else if (hw9Var instanceof k9e) {
                                Object obj7 = uniformValue.getValues()[0];
                                Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Float");
                                ((k9e) hw9Var).j((Float) obj7);
                            } else if (hw9Var instanceof p9e) {
                                Object obj8 = uniformValue.getValues()[0];
                                Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Int");
                                ((p9e) hw9Var).j((Integer) obj8);
                            } else if (hw9Var instanceof l9e) {
                                l9e l9eVar3 = (l9e) hw9Var;
                                Object[] values3 = uniformValue.getValues();
                                ArrayList arrayList6 = new ArrayList(values3.length);
                                int length4 = values3.length;
                                int i6 = 0;
                                while (i6 < length4) {
                                    UniformValue[] uniformValueArr2 = uniformPrams;
                                    Object obj9 = values3[i6];
                                    Object[] objArr3 = values3;
                                    if (obj9 instanceof Integer) {
                                        fFloatValue3 = ((Number) obj9).intValue();
                                    } else {
                                        if (!(obj9 instanceof Float)) {
                                            throw new IllegalArgumentException("cannot convert");
                                        }
                                        fFloatValue3 = ((Number) obj9).floatValue();
                                    }
                                    arrayList6.add(Float.valueOf(fFloatValue3));
                                    i6++;
                                    uniformPrams = uniformValueArr2;
                                    values3 = objArr3;
                                }
                                uniformValueArr = uniformPrams;
                                l9eVar3.j(CollectionsKt.toFloatArray(arrayList6));
                            }
                            i2++;
                            it3 = it;
                            uniformPrams = uniformValueArr;
                            i = 0;
                        }
                        uniformValueArr = uniformPrams;
                        i2++;
                        it3 = it;
                        uniformPrams = uniformValueArr;
                        i = 0;
                    }
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    ((ObjectAnimator) it4.next()).start();
                }
                if (!isSeekMode || endCb == null) {
                    return;
                }
                return;
            }
        }
        Log.w(dvk.TAG, "onTriger defaultPassParam is null");
    }

    @Nullable
    public HashMap<String, PassParams[]> b() {
        Layer[] layers;
        Layer layer;
        COEData cOEData = this.i;
        if (cOEData == null || (layers = cOEData.getLayers()) == null || (layer = (Layer) ArraysKt.getOrNull(layers, this.j)) == null) {
            return null;
        }
        return layer.getParams();
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final AnimatorType getK() {
        return this.k;
    }

    @Nullable
    public HashMap<String, Animator> d() {
        return this.l;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final COEData getI() {
        return this.i;
    }

    @Nullable
    public nmk<Object> f(@NotNull String uniformName) {
        Intrinsics.checkNotNullParameter(uniformName, "uniformName");
        for (Map.Entry<Integer, HashMap<String, nmk<Object>>> entry : this.m.entrySet()) {
            entry.getKey().intValue();
            nmk<Object> nmkVar = entry.getValue().get(uniformName);
            if (nmkVar != null) {
                return nmkVar;
            }
        }
        return null;
    }

    @NotNull
    public final HashMap<Integer, HashMap<String, nmk<Object>>> g() {
        return this.m;
    }

    @Nullable
    public HashMap<String, Animator> h(@Nullable t0a update) {
        Layer layer;
        HashMap<String, AnimatorValue> animParams;
        this.l = new HashMap<>();
        Layer[] layers = this.i.getLayers();
        if (layers != null && (layer = (Layer) ArraysKt.getOrNull(layers, this.j)) != null && (animParams = layer.getAnimParams()) != null) {
            for (Map.Entry<String, AnimatorValue> entry : animParams.entrySet()) {
                for (AnimLine animLine : entry.getValue().getAnimLines()) {
                    String name = animLine.getName();
                    ArrayList<Map<String, hw9<?>>> arrayList = this.n;
                    Iterable<IndexedValue> iterableWithIndex = arrayList != null ? CollectionsKt.withIndex(arrayList) : null;
                    Intrinsics.checkNotNull(iterableWithIndex);
                    boolean z = false;
                    for (IndexedValue indexedValue : iterableWithIndex) {
                        indexedValue.component1();
                        for (Map.Entry entry2 : ((Map) indexedValue.component2()).entrySet()) {
                            String str = (String) entry2.getKey();
                            hw9 hw9Var = (hw9) entry2.getValue();
                            if (Intrinsics.areEqual(str, name)) {
                                animLine.setUpdate(new b(hw9Var));
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                            break;
                        }
                    }
                    Log.i(dvk.TAG, q + "=>" + name + ", updatedFind " + z);
                    if (!z) {
                        animLine.setUpdate(update);
                    }
                }
                Animator animator = new Animator(entry.getValue());
                HashMap<String, Animator> map = this.l;
                Intrinsics.checkNotNull(map);
                map.put(entry.getKey(), animator);
            }
        }
        return this.l;
    }

    @Nullable
    public final ArrayList<Map<String, hw9<?>>> i(@Nullable oo9 cb, @NotNull TimeInterpolator interpolator, long duration) {
        Layer layer;
        HashMap<String, PassParams[]> params;
        PassParams[] passParamsArr;
        int i;
        int i2;
        UniformValue[] uniformValueArr;
        Iterator it;
        float fFloatValue;
        Intrinsics.checkNotNullParameter(interpolator, ParserTag.TAG_INTERPOLATOR);
        this.n = new ArrayList<>();
        Layer[] layers = this.i.getLayers();
        if (layers != null && (layer = (Layer) ArraysKt.getOrNull(layers, this.j)) != null && (params = layer.getParams()) != null && (passParamsArr = params.get("default")) != null) {
            Iterator it2 = ArraysKt.withIndex(passParamsArr).iterator();
            while (it2.hasNext()) {
                IndexedValue indexedValue = (IndexedValue) it2.next();
                int iComponent1 = indexedValue.component1();
                PassParams passParams = (PassParams) indexedValue.component2();
                c cVar = new c(cb, iComponent1);
                HashMap map = new HashMap();
                UniformValue[] uniformPrams = passParams.getUniformPrams();
                int length = uniformPrams.length;
                int i3 = 0;
                while (i3 < length) {
                    UniformValue uniformValue = uniformPrams[i3];
                    if (Intrinsics.areEqual(uniformValue.getType(), "float")) {
                        String name = uniformValue.getName();
                        Object obj = uniformValue.getValues()[0];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Float");
                        i = i3;
                        i2 = length;
                        uniformValueArr = uniformPrams;
                        new Param(name, (Float) obj, interpolator, duration, 0L, 16, null);
                        String name2 = uniformValue.getName();
                        String name3 = uniformValue.getName();
                        Object obj2 = uniformValue.getValues()[0];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Float");
                        map.put(name2, new k9e(new Param(name3, (Float) obj2, new PathInterpolator(uniformValue.getBezier()[0].floatValue(), uniformValue.getBezier()[1].floatValue(), uniformValue.getBezier()[2].floatValue(), uniformValue.getBezier()[3].floatValue()), uniformValue.getDuration(), 0L, 16, null), cVar));
                        it = it2;
                    } else {
                        i = i3;
                        i2 = length;
                        uniformValueArr = uniformPrams;
                        if (Intrinsics.areEqual(uniformValue.getType(), "int")) {
                            String name4 = uniformValue.getName();
                            Object obj3 = uniformValue.getValues()[0];
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                            it = it2;
                            new Param(name4, (Integer) obj3, interpolator, duration, 0L, 16, null);
                            String name5 = uniformValue.getName();
                            String name6 = uniformValue.getName();
                            Object obj4 = uniformValue.getValues()[0];
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                            map.put(name5, new p9e(new Param(name6, (Integer) obj4, interpolator, duration, 0L, 16, null), cVar));
                        } else {
                            it = it2;
                            if (Intrinsics.areEqual(uniformValue.getType(), "Vec2") || Intrinsics.areEqual(uniformValue.getType(), "Vec3") || Intrinsics.areEqual(uniformValue.getType(), "Vec4") || Intrinsics.areEqual(uniformValue.getType(), "Color")) {
                                Log.i(dvk.TAG, "animator: " + uniformValue.getName() + ": " + uniformValue.getValues());
                                String name7 = uniformValue.getName();
                                Object[] values = uniformValue.getValues();
                                ArrayList arrayList = new ArrayList(values.length);
                                int length2 = values.length;
                                for (int i4 = 0; i4 < length2; i4++) {
                                    Object obj5 = values[i4];
                                    if (obj5 instanceof Integer) {
                                        fFloatValue = ((Number) obj5).intValue();
                                    } else {
                                        if (!(obj5 instanceof Float)) {
                                            throw new IllegalArgumentException("cannot convert");
                                        }
                                        fFloatValue = ((Number) obj5).floatValue();
                                    }
                                    arrayList.add(Float.valueOf(fFloatValue));
                                }
                                map.put(uniformValue.getName(), new l9e(new Param(name7, CollectionsKt.toFloatArray(arrayList), new PathInterpolator(uniformValue.getBezier()[0].floatValue(), uniformValue.getBezier()[1].floatValue(), uniformValue.getBezier()[2].floatValue(), uniformValue.getBezier()[3].floatValue()), duration, 0L, 16, null), cVar));
                            }
                        }
                    }
                    i3 = i + 1;
                    length = i2;
                    uniformPrams = uniformValueArr;
                    it2 = it;
                }
                Iterator it3 = it2;
                this.o += map.size();
                ArrayList<Map<String, hw9<?>>> arrayList2 = this.n;
                if (arrayList2 != null) {
                    arrayList2.add(map);
                }
                it2 = it3;
            }
        }
        return this.n;
    }

    public void k() {
        RendPass[] render;
        Layer[] layers = this.i.getLayers();
        Layer layer = layers != null ? (Layer) ArraysKt.getOrNull(layers, this.j) : null;
        if (layer == null || (render = layer.getRender()) == null) {
            return;
        }
        int length = render.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            RendPass rendPass = render[i];
            int i3 = i2 + 1;
            Log.d(q, "initUniformMap id:" + i2);
            HashMap<String, nmk<Object>> map = new HashMap<>();
            this.m.put(Integer.valueOf(i2), map);
            Set<String> setKeySet = rendPass.getUniforms().keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                Uniform uniform = rendPass.getUniforms().get((String) it.next());
                if (uniform != null) {
                    nmk<Object> nmkVar = new nmk<>();
                    nmkVar.g(uniform.getName());
                    nmkVar.i(uniform.getType());
                    nmkVar.h(i2);
                    if (!Intrinsics.areEqual(uniform.getName(), "iResolution") && !Intrinsics.areEqual(uniform.getType(), j9c.TYPE_USE_FBO) && !Intrinsics.areEqual(uniform.getType(), "FBO") && !Intrinsics.areEqual(uniform.getType(), "Texture")) {
                        if (Intrinsics.areEqual(uniform.getType(), "Color") || Intrinsics.areEqual(uniform.getType(), "Vec4")) {
                            nmkVar.l(new float[]{uniform.getX(), uniform.getY(), uniform.getZ(), uniform.getW()});
                        } else if (Intrinsics.areEqual(uniform.getType(), "Vec3")) {
                            nmkVar.l(new float[]{uniform.getX(), uniform.getY(), uniform.getZ()});
                        } else if (Intrinsics.areEqual(uniform.getType(), "Vec2")) {
                            nmkVar.l(new float[]{uniform.getX(), uniform.getY()});
                        } else if (Intrinsics.areEqual(uniform.getType(), "Range")) {
                            Object value = uniform.getValue();
                            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Float");
                            nmkVar.l((Float) value);
                        } else if (Intrinsics.areEqual(uniform.getType(), "float")) {
                            Object value2 = uniform.getValue();
                            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.Float");
                            nmkVar.l((Float) value2);
                        } else if (Intrinsics.areEqual(uniform.getType(), "int")) {
                            Object value3 = uniform.getValue();
                            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Int");
                            nmkVar.l((Integer) value3);
                        }
                    }
                    map.put(uniform.getName(), nmkVar);
                }
            }
            i++;
            i2 = i3;
        }
    }

    public void l(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        this.k = AnimatorType.Animator;
        HashMap<String, Animator> mapD = d();
        if (mapD != null) {
            for (Map.Entry<String, Animator> entry : mapD.entrySet()) {
                if (Intrinsics.areEqual(entry.getKey(), key)) {
                    entry.getValue().play();
                    return;
                }
            }
        }
    }

    public final void m(@NotNull AnimatorType animatorType) {
        Intrinsics.checkNotNullParameter(animatorType, "<set-?>");
        this.k = animatorType;
    }
}
