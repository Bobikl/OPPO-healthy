package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.oplus.vfxsdk.common.AbsAnimator;
import com.oplus.vfxsdk.common.COEData;
import com.oplus.vfxsdk.common.RendPass;
import com.oplus.vfxsdk.common.Uniform;
import com.oplus.wearable.linkservice.sdk.Node;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@RequiresApi(33)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b&\u0010'J\b\u0010\u0004\u001a\u00020\u0003H\u0005J\b\u0010\u0005\u001a\u00020\u0003H&J3\u0010\u000b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\t\"\u00028\u0000H\u0017¢\u0006\u0004\b\u000b\u0010\fJB\u0010\u0013\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\r2.\u0010\u0012\u001a*\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u000fj\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0010`\u0011H\u0005J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0004R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006("}, d2 = {"Lcom/oplus/aiunit/vision/d6g;", "Lcom/oplus/vfxsdk/common/AbsAnimator;", "", "", "o", "r", "T", "", "paraName", "", "value", "s", "(Ljava/lang/String;[Ljava/lang/Object;)V", "Landroid/graphics/RuntimeShader;", "shader", "Ljava/util/HashMap;", "Lcom/oplus/aiunit/vision/nmk;", "Lkotlin/collections/HashMap;", "uniformsMap", "u", "Lcom/oplus/vfxsdk/common/RendPass;", "passData", "Lcom/oplus/aiunit/vision/e6g;", "options", "n", Node.I_KEY, "t", "Lcom/oplus/aiunit/vision/e6g;", "p", "()Lcom/oplus/aiunit/vision/e6g;", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "TAG", "Lcom/oplus/vfxsdk/common/COEData;", "coeData", "", "layerIndex", "<init>", "(Lcom/oplus/vfxsdk/common/COEData;ILcom/oplus/aiunit/vision/e6g;)V", "rsview.1.1.0_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRuntimeShaderAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeShaderAnimator.kt\ncom/oplus/vfxsdk/rsview/RuntimeShaderAnimator\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,273:1\n215#2:274\n215#2,2:275\n216#2:277\n1855#3:278\n731#3,9:279\n1856#3:290\n37#4,2:288\n*S KotlinDebug\n*F\n+ 1 RuntimeShaderAnimator.kt\ncom/oplus/vfxsdk/rsview/RuntimeShaderAnimator\n*L\n32#1:274\n33#1:275,2\n32#1:277\n143#1:278\n169#1:279,9\n143#1:290\n169#1:288,2\n*E\n"})
public abstract class d6g extends AbsAnimator {

    @NotNull
    public final RuntimeShaderOptions r;

    @NotNull
    public final String s;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/d6g$a", "Lcom/oplus/aiunit/vision/t0a;", "", Node.I_KEY, "", "value", "", "a", "rsview.1.1.0_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nRuntimeShaderAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeShaderAnimator.kt\ncom/oplus/vfxsdk/rsview/RuntimeShaderAnimator$doInit$1$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,273:1\n11115#2:274\n11450#2,3:275\n37#3,2:278\n*S KotlinDebug\n*F\n+ 1 RuntimeShaderAnimator.kt\ncom/oplus/vfxsdk/rsview/RuntimeShaderAnimator$doInit$1$1$1\n*L\n41#1:274\n41#1:275,3\n41#1:278,2\n*E\n"})
    public static final class a implements t0a {
        public final /* synthetic */ nmk<Object> a;
        public final /* synthetic */ d6g b;

        public a(nmk<Object> nmkVar, d6g d6gVar) {
            this.a = nmkVar;
            this.b = d6gVar;
        }

        @Override // com.oplus.aiunit.vision.t0a
        @RequiresApi(33)
        public void a(@NotNull String key, @NotNull Object value) {
            Intrinsics.checkNotNullParameter(key, Node.I_KEY);
            Intrinsics.checkNotNullParameter(value, "value");
            if (!Intrinsics.areEqual(this.a.getB(), "Vec2") && !Intrinsics.areEqual(this.a.getB(), "Vec3") && !Intrinsics.areEqual(this.a.getB(), "Vec4") && !Intrinsics.areEqual(this.a.getB(), "Color")) {
                this.b.s(key, Boolean.TRUE, value);
                return;
            }
            d6g d6gVar = this.b;
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(Boolean.TRUE);
            float[] fArr = (float[]) value;
            ArrayList arrayList = new ArrayList(fArr.length);
            for (float f : fArr) {
                Intrinsics.checkNotNull(Float.valueOf(f), "null cannot be cast to non-null type kotlin.Any");
                arrayList.add(Float.valueOf(f));
            }
            spreadBuilder.addSpread(arrayList.toArray(new Object[0]));
            d6gVar.s(key, spreadBuilder.toArray(new Object[spreadBuilder.size()]));
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/d6g$b", "Lcom/oplus/aiunit/vision/oo9;", "", "", "value", "", "a", "([Ljava/lang/Object;)V", "rsview.1.1.0_release"}, k = 1, mv = {1, 9, 0})
    public static final class b implements oo9 {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.oo9
        public void a(@NotNull Object... value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Object obj = value[2];
            if ((obj instanceof Float) || (obj instanceof Integer)) {
                d6g d6gVar = d6g.this;
                Object obj2 = value[1];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                d6gVar.s((String) obj2, value[2]);
                return;
            }
            if (obj instanceof float[]) {
                d6g d6gVar2 = d6g.this;
                Object obj3 = value[1];
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                Object obj4 = value[2];
                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.FloatArray");
                Float[] typedArray = ArraysKt.toTypedArray((float[]) obj4);
                d6gVar2.s((String) obj3, Arrays.copyOf(typedArray, typedArray.length));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/d6g$c", "Lcom/oplus/aiunit/vision/t0a;", "", Node.I_KEY, "", "value", "", "a", "rsview.1.1.0_release"}, k = 1, mv = {1, 9, 0})
    public static final class c implements t0a {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.t0a
        @RequiresApi(33)
        public void a(@NotNull String key, @NotNull Object value) {
            Intrinsics.checkNotNullParameter(key, Node.I_KEY);
            Intrinsics.checkNotNullParameter(value, "value");
            d6g.this.t(key, value);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6g(@NotNull COEData cOEData, int i, @NotNull RuntimeShaderOptions runtimeShaderOptions) {
        super(cOEData, i);
        Intrinsics.checkNotNullParameter(cOEData, "coeData");
        Intrinsics.checkNotNullParameter(runtimeShaderOptions, "options");
        this.r = runtimeShaderOptions;
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.s = simpleName;
    }

    @RequiresApi(33)
    @NotNull
    public final RuntimeShader n(@NotNull RendPass passData, @NotNull RuntimeShaderOptions options) {
        Shader.TileMode tileModeA;
        Bitmap bitmapDecodeByteArray;
        List listEmptyList;
        Intrinsics.checkNotNullParameter(passData, "passData");
        Intrinsics.checkNotNullParameter(options, "options");
        Log.i(getS(), getS() + "=>translate start");
        oc8.a();
        RuntimeShader runtimeShaderA = nc8.a(df2.INSTANCE.c(passData.getFs(), options.getAlphaPreMultiplied()));
        Log.i(getS(), getS() + "=>translate end");
        Set<String> setKeySet = passData.getUniforms().keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            Uniform uniform = passData.getUniforms().get((String) it.next());
            if (uniform != null) {
                Log.i(getS(), "Uniform name:" + uniform.getName() + ", type:" + uniform.getType() + ", value:" + uniform.getValue() + ", x:" + uniform.getX() + ", y:" + uniform.getY());
                if (!Intrinsics.areEqual(uniform.getName(), "u_resolution")) {
                    if (Intrinsics.areEqual(uniform.getType(), "Texture")) {
                        if (uniform.getValue() != null) {
                            Integer wrapMode = uniform.getWrapMode();
                            if (wrapMode != null && wrapMode.intValue() == 10497) {
                                tileModeA = Shader.TileMode.REPEAT;
                            } else if (wrapMode != null && wrapMode.intValue() == 33648) {
                                tileModeA = Shader.TileMode.MIRROR;
                            } else if (wrapMode != null && wrapMode.intValue() == 33071) {
                                tileModeA = Shader.TileMode.CLAMP;
                            } else {
                                tileModeA = (wrapMode != null && wrapMode.intValue() == 33069) ? s30.a() : Shader.TileMode.REPEAT;
                            }
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            if (options.getUseHardwareBitmap()) {
                                options2.inPreferredConfig = Bitmap.Config.HARDWARE;
                                Log.d(getS(), "create HardwareBitmap");
                            }
                            if (uniform.getValue() instanceof String) {
                                Object value = uniform.getValue();
                                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                                List listSplit = new Regex(d14.COMMA_REGEX).split((String) value, 0);
                                if (!listSplit.isEmpty()) {
                                    ListIterator listIterator = listSplit.listIterator(listSplit.size());
                                    while (true) {
                                        if (!listIterator.hasPrevious()) {
                                            listEmptyList = CollectionsKt.emptyList();
                                            break;
                                        }
                                        if (!(((String) listIterator.previous()).length() == 0)) {
                                            listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                                            break;
                                        }
                                    }
                                } else {
                                    listEmptyList = CollectionsKt.emptyList();
                                    break;
                                }
                                byte[] bArrDecode = Base64.decode(((String[]) listEmptyList.toArray(new String[0]))[1], 0);
                                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options2);
                            } else if (uniform.getValue() instanceof ByteBuffer) {
                                Object value2 = uniform.getValue();
                                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type java.nio.ByteBuffer");
                                ByteBuffer byteBuffer = (ByteBuffer) value2;
                                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity(), options2);
                            } else {
                                bitmapDecodeByteArray = null;
                            }
                            if (bitmapDecodeByteArray != null) {
                                if (options.getEnableFlipBitmap() && uniform.getFlip()) {
                                    bitmapDecodeByteArray = sg1.INSTANCE.a(bitmapDecodeByteArray, true);
                                }
                                runtimeShaderA.setInputShader(uniform.getName(), new BitmapShader(bitmapDecodeByteArray, tileModeA, tileModeA));
                                mc8.a(runtimeShaderA, uniform.getName() + "_size", bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                            }
                        }
                    } else if (Intrinsics.areEqual(uniform.getType(), "Color") || Intrinsics.areEqual(uniform.getType(), "Vec4")) {
                        runtimeShaderA.setFloatUniform(uniform.getName(), uniform.getX(), uniform.getY(), uniform.getZ(), uniform.getW());
                    } else if (Intrinsics.areEqual(uniform.getType(), "Vec3")) {
                        runtimeShaderA.setFloatUniform(uniform.getName(), uniform.getX(), uniform.getY(), uniform.getZ());
                    } else if (Intrinsics.areEqual(uniform.getType(), "Vec2")) {
                        mc8.a(runtimeShaderA, uniform.getName(), uniform.getX(), uniform.getY());
                    } else if (Intrinsics.areEqual(uniform.getType(), "Range")) {
                        if (uniform.getValue() instanceof Float) {
                            String name = uniform.getName();
                            Object value3 = uniform.getValue();
                            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Float");
                            lc8.a(runtimeShaderA, name, ((Float) value3).floatValue());
                        }
                    } else if (Intrinsics.areEqual(uniform.getType(), "float")) {
                        String name2 = uniform.getName();
                        Object value4 = uniform.getValue();
                        Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type kotlin.Float");
                        lc8.a(runtimeShaderA, name2, ((Float) value4).floatValue());
                    } else if (Intrinsics.areEqual(uniform.getType(), "int")) {
                        String name3 = uniform.getName();
                        Object value5 = uniform.getValue();
                        Intrinsics.checkNotNull(value5, "null cannot be cast to non-null type kotlin.Int");
                        runtimeShaderA.setIntUniform(name3, ((Integer) value5).intValue());
                    }
                }
            }
        }
        runtimeShaderA.setFloatUniform("u_matResolution", new float[]{1.0f, vr3.UNSET, vr3.UNSET, vr3.UNSET, 1.0f, vr3.UNSET, vr3.UNSET, vr3.UNSET, 1.0f});
        Log.i(getS(), getS() + "=>setUniform end");
        return runtimeShaderA;
    }

    @RequiresApi(33)
    public final void o() {
        k();
        for (Map.Entry<Integer, HashMap<String, nmk<Object>>> entry : g().entrySet()) {
            entry.getKey().intValue();
            for (Map.Entry<String, nmk<Object>> entry2 : entry.getValue().entrySet()) {
                entry2.getKey();
                nmk<Object> value = entry2.getValue();
                value.j(new a(value, this));
            }
        }
        r();
        Log.d(getS(), "initUniformMap passSize:" + g().size());
        AbsAnimator.j(this, new b(), null, 0L, 6, null);
        h(new c());
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final RuntimeShaderOptions getR() {
        return this.r;
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public String getS() {
        return this.s;
    }

    public abstract void r();

    /* JADX WARN: Multi-variable type inference failed */
    @RequiresApi(33)
    public <T> void s(@Nullable String paraName, @NotNull T... value) {
        nmk<Object> nmkVarF;
        Intrinsics.checkNotNullParameter(value, "value");
        if (paraName == null || (nmkVarF = f(paraName)) == null) {
            return;
        }
        nmkVarF.k(true);
        int length = value.length;
        if (length != 0) {
            int i = 0;
            if (length == 1) {
                Object[] objArr = value[0];
                Intrinsics.checkNotNull(objArr, "null cannot be cast to non-null type kotlin.Any");
                nmkVarF.l(objArr);
                return;
            }
            Object[] objArr2 = value[0];
            if (objArr2 instanceof Integer) {
                int[] iArr = new int[value.length];
                int length2 = value.length;
                while (i < length2) {
                    Object[] objArr3 = value[i];
                    Intrinsics.checkNotNull(objArr3, "null cannot be cast to non-null type kotlin.Int");
                    iArr[i] = ((Integer) objArr3).intValue();
                    i++;
                }
                nmkVarF.l(iArr);
                return;
            }
            if (objArr2 instanceof Float) {
                float[] fArr = new float[value.length];
                int length3 = value.length;
                while (i < length3) {
                    Object[] objArr4 = value[i];
                    Intrinsics.checkNotNull(objArr4, "null cannot be cast to non-null type kotlin.Float");
                    fArr[i] = ((Float) objArr4).floatValue();
                    i++;
                }
                nmkVarF.l(fArr);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void t(@NotNull String key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        Intrinsics.checkNotNullParameter(value, "value");
        List listSplit$default = StringsKt.split$default(key, new String[]{"**_**"}, false, 0, 6, (Object) null);
        nmk<Object> nmkVarF = f((String) listSplit$default.get(0));
        if (nmkVarF == null) {
        }
        nmkVarF.k(true);
        String str = listSplit$default.size() > 1 ? (String) listSplit$default.get(1) : "";
        int iHashCode = str.hashCode();
        if (iHashCode == 0) {
            if (str.equals("")) {
                nmkVarF.l(value);
                return;
            }
            return;
        }
        switch (iHashCode) {
            case 119:
                if (str.equals("w")) {
                    Object objF = nmkVarF.f();
                    Intrinsics.checkNotNull(objF, "null cannot be cast to non-null type kotlin.FloatArray");
                    float[] fArr = (float[]) objF;
                    fArr[3] = ((Float) value).floatValue();
                    nmkVarF.l(fArr);
                    break;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    Object objF2 = nmkVarF.f();
                    Intrinsics.checkNotNull(objF2, "null cannot be cast to non-null type kotlin.FloatArray");
                    float[] fArr2 = (float[]) objF2;
                    fArr2[0] = ((Float) value).floatValue();
                    nmkVarF.l(fArr2);
                    break;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    Object objF3 = nmkVarF.f();
                    Intrinsics.checkNotNull(objF3, "null cannot be cast to non-null type kotlin.FloatArray");
                    float[] fArr3 = (float[]) objF3;
                    fArr3[1] = ((Float) value).floatValue();
                    nmkVarF.l(fArr3);
                    break;
                }
                break;
            case 122:
                if (str.equals("z")) {
                    Object objF4 = nmkVarF.f();
                    Intrinsics.checkNotNull(objF4, "null cannot be cast to non-null type kotlin.FloatArray");
                    float[] fArr4 = (float[]) objF4;
                    fArr4[2] = ((Float) value).floatValue();
                    nmkVarF.l(fArr4);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @RequiresApi(33)
    public final void u(@Nullable RuntimeShader shader, @NotNull HashMap<String, nmk<Object>> uniformsMap) {
        Intrinsics.checkNotNullParameter(uniformsMap, "uniformsMap");
        for (Map.Entry<String, nmk<Object>> entry : uniformsMap.entrySet()) {
            if (entry.getValue().getD()) {
                String b2 = entry.getValue().getB();
                switch (b2.hashCode()) {
                    case 104431:
                        if (b2.equals("int") && shader != null) {
                            String a2 = entry.getValue().getA();
                            Object objF = entry.getValue().f();
                            Intrinsics.checkNotNull(objF, "null cannot be cast to non-null type kotlin.Int");
                            shader.setIntUniform(a2, ((Integer) objF).intValue());
                        }
                        break;
                    case 2662206:
                        if (b2.equals("Vec2")) {
                            if (shader != null) {
                                String a3 = entry.getValue().getA();
                                Object objF2 = entry.getValue().f();
                                Intrinsics.checkNotNull(objF2, "null cannot be cast to non-null type kotlin.FloatArray");
                                shader.setFloatUniform(a3, (float[]) objF2);
                            }
                        }
                        break;
                    case 2662207:
                        if (b2.equals("Vec3")) {
                            if (shader != null) {
                                String a4 = entry.getValue().getA();
                                Object objF3 = entry.getValue().f();
                                Intrinsics.checkNotNull(objF3, "null cannot be cast to non-null type kotlin.FloatArray");
                                shader.setFloatUniform(a4, (float[]) objF3);
                            }
                        }
                        break;
                    case 2662208:
                        if (b2.equals("Vec4")) {
                            if (shader != null) {
                                String a5 = entry.getValue().getA();
                                Object objF4 = entry.getValue().f();
                                Intrinsics.checkNotNull(objF4, "null cannot be cast to non-null type kotlin.FloatArray");
                                shader.setFloatUniform(a5, (float[]) objF4);
                            }
                        }
                        break;
                    case 78727453:
                        if (b2.equals("Range")) {
                            if (shader != null) {
                                String a6 = entry.getValue().getA();
                                Object objF5 = entry.getValue().f();
                                Intrinsics.checkNotNull(objF5, "null cannot be cast to non-null type kotlin.Float");
                                lc8.a(shader, a6, ((Float) objF5).floatValue());
                            }
                        }
                        break;
                    case 97526364:
                        if (b2.equals("float")) {
                            if (shader != null) {
                                String a7 = entry.getValue().getA();
                                Object objF6 = entry.getValue().f();
                                Intrinsics.checkNotNull(objF6, "null cannot be cast to non-null type kotlin.Float");
                                lc8.a(shader, a7, ((Float) objF6).floatValue());
                            }
                        }
                        break;
                }
                entry.getValue().k(false);
            }
        }
    }
}
