package com.coui.appcompat.bottomfloatingtoolbar;

import android.graphics.RuntimeShader;
import androidx.annotation.RequiresApi;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.kb8;
import com.oplus.aiunit.vision.lb8;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(33)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bG\b\u0007\u0018\u0000 \\2\u00020\u0001:\u0002\u0018]B\u0007¢\u0006\u0004\bZ\u0010[J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\u001e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010J\u0016\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010R\"\u0010\u001d\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010$\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010*\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010+R\u0016\u0010.\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010%R\u0016\u00100\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010%R\u0016\u00102\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010\u001fR\u0016\u00104\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010\u001fR\u0016\u00106\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010%R\u0016\u00108\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010%R*\u0010<\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010%\u001a\u0004\b:\u0010'\"\u0004\b;\u0010)R*\u0010@\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010%\u001a\u0004\b>\u0010'\"\u0004\b?\u0010)R*\u0010C\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010%\u001a\u0004\bB\u0010'\"\u0004\b9\u0010)R*\u0010F\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010%\u001a\u0004\bE\u0010'\"\u0004\b=\u0010)R*\u0010I\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010%\u001a\u0004\bH\u0010'\"\u0004\bA\u0010)R*\u0010K\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010%\u001a\u0004\bJ\u0010'\"\u0004\bD\u0010)R*\u0010M\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010%\u001a\u0004\bL\u0010'\"\u0004\bG\u0010)R*\u0010O\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010%\u001a\u0004\bN\u0010'\"\u0004\b7\u0010)R*\u0010Q\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010%\u001a\u0004\bP\u0010'\"\u0004\b-\u0010)R*\u0010S\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010%\u001a\u0004\bR\u0010'\"\u0004\b/\u0010)R*\u0010U\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010%\u001a\u0004\bT\u0010'\"\u0004\b1\u0010)R*\u0010W\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010%\u001a\u0004\bV\u0010'\"\u0004\b3\u0010)R*\u0010Y\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010%\u001a\u0004\bX\u0010'\"\u0004\b5\u0010)¨\u0006^"}, d2 = {"Lcom/coui/appcompat/bottomfloatingtoolbar/GradientStroke;", "", "", "cornerChange", "", "v", "w", "x", "", "b", "", "viewWidth", "viewHeight", "s", "Lcom/coui/appcompat/bottomfloatingtoolbar/GradientStroke$CornerType;", "type", "", "radius", "weight", "d", "horizontal", "vertical", "q", "Landroid/graphics/RuntimeShader;", "a", "Landroid/graphics/RuntimeShader;", "()Landroid/graphics/RuntimeShader;", "t", "(Landroid/graphics/RuntimeShader;)V", "shader", "value", "I", "getColor", "()I", "c", "(I)V", "color", UserInfo.SEX_FEMALE, "getRatio", "()F", "r", "(F)V", "ratio", "Lcom/coui/appcompat/bottomfloatingtoolbar/GradientStroke$CornerType;", "cornerType", MapSchema.FIELD_NAME_ENTRY, ParserTag.TAG_CORNER_RADIUS, "f", "cornerWeight", b2n.f, "sizeWidth", b2n.g, "sizeHeight", "i", "paddingVertical", "j", "paddingHorizontal", MapSchema.FIELD_NAME_KEY, "getWidth", "u", Fields.WIDTH_FIELD, LogFieldKey.LEVEL_KEY, "getNearLineWidth", LogFieldKey.PROCESS_NAME_KEY, "nearLineWidth", LogFieldKey.MESSAGE_KEY, "getNearLineAlpha", "nearLineAlpha", "n", "getNearLineFadeToSides1", "nearLineFadeToSides1", "o", "getNearLineFadeToSides2", "nearLineFadeToSides2", "getNearLineFadeTowardCenter1", "nearLineFadeTowardCenter1", "getNearLineFadeTowardCenter2", "nearLineFadeTowardCenter2", "getFarLineWidth", "farLineWidth", "getFarLineAlpha", "farLineAlpha", "getFarLineFadeToSides1", "farLineFadeToSides1", "getFarLineFadeToSides2", "farLineFadeToSides2", "getFarLineFadeTowardCenter1", "farLineFadeTowardCenter1", "getFarLineFadeTowardCenter2", "farLineFadeTowardCenter2", "<init>", "()V", "Companion", "CornerType", "coui-support-bottomnavigation_release"}, k = 1, mv = {1, 8, 0})
public final class GradientStroke {
    public static final float DEFAULT_RATIO = 0.68f;
    public static final float DEFAULT_STROKE_CORNER_RADIUS = 200.0f;
    public static final float DEFAULT_STROKE_CORNER_WEIGHT = 1.3f;
    public static final float DEFAULT_STROKE_FAR_LINE_ALPHA = 0.4f;
    public static final float DEFAULT_STROKE_FAR_LINE_FADE_TOWARD_CENTER_1 = 0.08f;
    public static final float DEFAULT_STROKE_FAR_LINE_FADE_TOWARD_CENTER_2 = 0.12f;
    public static final float DEFAULT_STROKE_FAR_LINE_FADE_TO_SIDES_1 = 0.35f;
    public static final float DEFAULT_STROKE_FAR_LINE_FADE_TO_SIDES_2 = 0.3f;
    public static final float DEFAULT_STROKE_FAR_LINE_WIDTH = 3.0f;
    public static final float DEFAULT_STROKE_NEAR_LINE_ALPHA = 0.8f;
    public static final float DEFAULT_STROKE_NEAR_LINE_FADE_TOWARD_CENTER_1 = 0.3f;
    public static final float DEFAULT_STROKE_NEAR_LINE_FADE_TOWARD_CENTER_2 = 0.02f;
    public static final float DEFAULT_STROKE_NEAR_LINE_FADE_TO_SIDES_1 = 0.38f;
    public static final float DEFAULT_STROKE_NEAR_LINE_FADE_TO_SIDES_2 = 0.12f;
    public static final float DEFAULT_STROKE_NEAR_LINE_WIDTH = 3.0f;
    public static final float DEFAULT_STROKE_WIDTH = 50.0f;
    public static final float ONE_POINT_FIVE = 1.5f;
    public static final float POINT_FIVE = 0.5f;
    public static final float WEIGHT_RATE = 2.69f;
    public static final float WEIGHT_RATE1 = 1.023f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public RuntimeShader shader;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int sizeWidth;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int sizeHeight;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public float paddingVertical;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public float paddingHorizontal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int color = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public float ratio = 0.68f;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public CornerType cornerType = CornerType.SMOOTH;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public float cornerRadius = 200.0f;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public float cornerWeight = 1.3f;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public float width = 50.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public float nearLineWidth = 3.0f;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public float nearLineAlpha = 0.8f;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public float nearLineFadeToSides1 = 0.38f;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public float nearLineFadeToSides2 = 0.12f;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public float nearLineFadeTowardCenter1 = 0.3f;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public float nearLineFadeTowardCenter2 = 0.02f;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public float farLineWidth = 3.0f;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public float farLineAlpha = 0.4f;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public float farLineFadeToSides1 = 0.35f;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public float farLineFadeToSides2 = 0.3f;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public float farLineFadeTowardCenter1 = 0.08f;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public float farLineFadeTowardCenter2 = 0.12f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/coui/appcompat/bottomfloatingtoolbar/GradientStroke$CornerType;", "", "(Ljava/lang/String;I)V", "FULL", "BEZIER", "SMOOTH", "coui-support-bottomnavigation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum CornerType {
        FULL,
        BEZIER,
        SMOOTH
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CornerType.values().length];
            try {
                iArr[CornerType.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CornerType.BEZIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CornerType.SMOOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GradientStroke() {
        v(true);
    }

    @NotNull
    public final RuntimeShader a() {
        RuntimeShader runtimeShader = this.shader;
        if (runtimeShader != null) {
            return runtimeShader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shader");
        return null;
    }

    public final String b() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("layout(color) uniform half4 u_color;\nuniform float u_width;\nuniform float u_corner;\nuniform float u_weight;\nuniform float u_ratio;\nuniform float2 u_size;\nuniform float2 u_padding;\n// 线段线段（分为Near端与Far端）渐变参数\n// 对角线段宽度\nuniform float u_nearLineWidth;\nuniform float u_farLineWidth;\n// 对角线段最大alpha\nuniform float u_nearLineAlpha;\nuniform float u_farLineAlpha;\n// 对角线段横向渐变比例\nuniform float2 u_nearLineFadeToSides;\nuniform float2 u_farLineFadeToSides;\n// 对角线段纵向渐变比例\nuniform float2 u_nearLineFadeTowardsCenter;\nuniform float2 u_farLineFadeTowardsCenter;\nconst float PI = 2.0 * asin(1.0);");
        sb.append("float RBox(float2 p,float2 b,float r){\n    float2 q=abs(p)-b+r;\n    return min(max(q.x,q.y),0.)+length(max(q,0.))-r;\n}");
        CornerType cornerType = this.cornerType;
        int[] iArr = b.$EnumSwitchMapping$0;
        int i = iArr[cornerType.ordinal()];
        if (i == 1) {
            str = "";
        } else if (i == 2) {
            str = "float cubicBezierDistance(vec2 p, vec2 p0, vec2 p1, vec2 p2, vec2 p3) {\n    // 将贝塞尔转换为幂基形式：B(t) = c0 + c1 t + c2 t^2 + c3 t^3\n    vec2 c0 = p0;\n    vec2 c1 = 3.0 * (p1 - p0);\n    vec2 c2 = 3.0 * (p2 - 2.0 * p1 + p0);\n    vec2 c3 = p3 - 3.0 * p2 + 3.0 * p1 - p0;\n\n    float t = 0.5; // 初始值\n    for (int i = 0; i < 10; i++) {\n        vec2 Bt   = ((c3 * t + c2) * t + c1) * t + c0;\n        vec2 dBt  = (3.0 * c3 * t + 2.0 * c2) * t + c1;\n        vec2 ddBt = 6.0 * c3 * t + 2.0 * c2;\n        vec2 r    = Bt - p;\n        // E(t) = |B(t)-p|^2 的一阶、二阶导\n        float f1 = dot(dBt, r);\n        float f2 = dot(ddBt, r) + dot(dBt, dBt);\n        // 避免除零\n        float denom = max(f2, 1e-4);\n        t = clamp(t - f1 / denom, 0.0, 1.0);\n    }\n    vec2 Bt = ((c3 * t + c2) * t + c1) * t + c0;\n    vec2 re = Bt - p;\n\n    // 计算曲线在最近点处的切线向量\n    vec2 tangent = (3.0 * c3 * t + 2.0 * c2) * t + c1;\n    \n    // 计算法向量（切线逆时针旋转90度）\n    vec2 normal = vec2(-tangent.y, tangent.x);\n    \n    // 归一化法向量\n    vec2 normalizedNormal = normalize(normal);\n    \n    // 计算有符号距离\n    float dis = length(re);\n    float signedDistance = dot(re, normalizedNormal) > 0.0 ? dis : -dis;\n\n    return signedDistance ;\n}\nfloat sdBezierDistance(vec2 p, vec2 b, float cc) {\n    float sdf = 0.0;\n    if(any(lessThanEqual(abs(p), b - cc))) {\n        sdf = RBox(p, b, cc);\n    }else{\n        float point  = max(cc*u_weight*0.5,0.001);\n        sdf = cubicBezierDistance(abs(p)-b+cc,vec2(cc, 0.0), vec2(cc, point), vec2(point, cc),vec2(0.0, cc));\n    }\n    return sdf;\n}";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "float approx_sdSquircle(vec2 p, float n){\n    // symmetries\n    p = abs(p); // if( p.y>p.x ) p=p.yx;\n    float w = pow(p.x,n) + pow(p.y,n);\n\n    // linearlized implicit (taylor)\n    float b = 2.0*n-2.0;\n    float a = 1.0-1.0/n;\n    return (w-pow(w,a)) * inversesqrt(pow(p.x,b)+pow(p.y,b));\n}\n\nfloat opSmoothIntersectionOne(float d1,float d2){\n    float h=clamp(.5-.5*(d2-d1),0.,1.);\n    return mix(d2,d1,h) + h*(1.-h);\n}\nvec2 getPreCalcMA() {\n    float halfSizeX = u_size.x * 0.5;\n    float halfSizeY = u_size.y * 0.5;\n    float maX = 0.0;\n    float maY = 0.0;\n    if (halfSizeX > halfSizeY) {\n        maX = halfSizeX;\n        maY = halfSizeY * 0.5;\n    } else {\n        maX = halfSizeX * 0.5;\n        maY = halfSizeY;\n    }\n    return vec2(maX, maY);\n}\n\nvec2 sdRoundedBoxMerge(vec2 p,  vec2 b,  float cr){\n    vec2 q1 = abs(p)-b;\n    float r1 = min(max(q1.x,q1.y),0.0) + length(max(q1,0.0));\n    vec2 q2 = q1 + cr;\n    float r2 = min(max(q2.x,q2.y),0.0) + length(max(q2,0.0)) - cr;\n    float h=clamp(.5-.5*(r2-r1),0.,1.);\n    return vec2(mix(r2,r1,h)+h*(1.-h), r2);\n}\n\nfloat sdSquircle(vec2 p, in vec2 b, float cc) {\n    float sdf = 0.0;\n    float sc =  cc + u_weight * cc;\n    float rbRes = 0.0;\n    if(any(lessThan(abs(p), b - sc))) {\n        vec2 res = sdRoundedBoxMerge(p, b, cc);\n        sdf = res.x;\n        rbRes = res.y;\n    } else {\n        vec2 sp = (abs(p) - b + sc) / sc;\n        float angle = abs(atan(sp.y, sp.x) - 0.785398); // 0.785398 for 45 degree\n        float preCalcN1Delta = 3.02 + u_weight * 2.44;\n        float preCalcN2Delta = 2.05 + u_weight * 2.44;\n        float sn = mix(preCalcN1Delta, preCalcN2Delta, smoothstep(22.0, 0.0, degrees(angle)));\n        sdf = approx_sdSquircle(sp, sn) * sc;\n        rbRes = RBox(p, b, cc);\n        sdf = opSmoothIntersectionOne(sdf, rbRes);\n    }\n\n    if((u_corner) == min(b.x, b.y)) {\n        float sdfRect = RBox(p, getPreCalcMA(), 0);\n        sdf = min(max(sdfRect, rbRes), sdf);\n    }\n\n    // return smoothstep(0.0, -antiAliasing, sdf);\n    return sdf;\n}";
        }
        sb.append(str);
        sb.append("float getDis(float2 pos,float2 halfsize){\n    float2 rect=abs(pos-halfsize);\n    return rect.x+rect.y;\n}\nfloat3 getLineFadeTowardCenter(float2 u_lineFadeTowardsCenter, float lineWidth) {\n    float x = clamp(u_lineFadeTowardsCenter.x, 0.0, 1.0);\n    float y = clamp(u_lineFadeTowardsCenter.y, 0.0, 1.0 - x);\n    float z = clamp((1.0 - x - y), 0.01, 1.0);\n    float3 lineFadeTowardsCenter = lineWidth * float3(x, y, z);\n    lineFadeTowardsCenter.y += lineFadeTowardsCenter.x;\n    lineFadeTowardsCenter.z += lineFadeTowardsCenter.y;\n    lineFadeTowardsCenter *= -1.;\n    return lineFadeTowardsCenter;\n}\n\nhalf4 gradientStrokeColorWithRatio(float2 fragCoord) {\n    float ratio = u_ratio;\n\n    float2 rectSize = u_size - u_padding * 2.0;\n    float2 halfSize = rectSize / 2.0;\n    float2 pos = fragCoord - u_size / 2.0;\n    float2 dir_pos= normalize(pos);\n    float2 dirAbs_pos = abs(dir_pos);\n    float2 pos_n = min(float2(dirAbs_pos.xy*halfSize.yx/max(vec2(.001),dirAbs_pos.yx)),halfSize)*sign(dir_pos);\n\n    float2 halfSize_symobol = float2(-halfSize.y,halfSize.x);\n    float flag = mix(-1.0,1.0, step(ratio,0.5))*dot(halfSize_symobol,pos_n);\n\n    float distanceAll= rectSize.x + rectSize.y;\n    float dis_point = distanceAll*min(ratio,1.0-ratio)*2.0;\n    float dis_pos = getDis(pos_n,halfSize);\n\n    float distance_near = mix(dis_point+dis_pos,abs(dis_point-dis_pos),step(0.,flag));\n\n    distance_near=min(2.*distanceAll-distance_near,distance_near);\n\n    float2 nearLineFade = float2(u_nearLineFadeToSides.x, u_nearLineFadeToSides.x + u_nearLineFadeToSides.y);\n    float2 farLineFade = float2(u_farLineFadeToSides.x, u_farLineFadeToSides.x + u_farLineFadeToSides.y);\n    float lineNearAlpha = u_nearLineAlpha*smoothstep(nearLineFade.y*distanceAll, nearLineFade.x*distanceAll, distance_near);\n    float lineFarAlpha = u_farLineAlpha*smoothstep(farLineFade.y*distanceAll, farLineFade.x*distanceAll, distanceAll-distance_near);\n\n    float3 farLineFadeTowardsCenter = getLineFadeTowardCenter(u_farLineFadeTowardsCenter, u_farLineWidth);\n    float3 nearLineFadeTowardsCenter = getLineFadeTowardCenter(u_nearLineFadeTowardsCenter, u_nearLineWidth);\n\n    float corner = min(u_corner, min(halfSize.x, halfSize.y));");
        int i2 = iArr[this.cornerType.ordinal()];
        if (i2 == 1) {
            str2 = "float rectSdf = RBox(pos, halfSize, corner);";
        } else if (i2 == 2) {
            str2 = "float rectSdf= sdBezierDistance(pos, halfSize, corner);";
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "float rectSdf= sdSquircle(pos,halfSize, corner);";
        }
        sb.append(str2);
        sb.append("\n        float lineNearSdf = smoothstep(0., nearLineFadeTowardsCenter.x ,rectSdf)-smoothstep(nearLineFadeTowardsCenter.y,nearLineFadeTowardsCenter.z,rectSdf);\n        float lineFarSdf = smoothstep(0., farLineFadeTowardsCenter.x, rectSdf)-smoothstep(farLineFadeTowardsCenter.y,farLineFadeTowardsCenter.z,rectSdf);\n        lineNearAlpha *= lineNearSdf;\n        lineFarAlpha *= lineFarSdf;\n    \n        float lineAlpha = clamp(lineNearAlpha + lineFarAlpha, 0.0, 1.0);\n        return half4(u_color.xyz * lineAlpha, lineAlpha);\n    }\n    half4 main(float2 fragCoord) {\n        return gradientStrokeColorWithRatio(fragCoord);\n    }\n");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply {\n…T_3)\n        }.toString()");
        return string;
    }

    public final void c(int i) {
        if (this.color != i) {
            this.color = i;
            a().setColorUniform("u_color", i);
        }
    }

    public final boolean d(@NotNull CornerType type, float radius, float weight) {
        Intrinsics.checkNotNullParameter(type, "type");
        CornerType cornerType = this.cornerType;
        if (cornerType == type) {
            if (this.cornerRadius == radius) {
                if (this.cornerWeight == weight) {
                    return false;
                }
            }
        }
        CornerType cornerType2 = CornerType.BEZIER;
        if (type == cornerType2) {
            radius *= 1.5f;
        }
        this.cornerRadius = radius;
        if (type == cornerType2) {
            weight = (2.69f * weight) / (weight + 1.023f);
        }
        this.cornerWeight = weight;
        if (cornerType != type) {
            this.cornerType = type;
            v(true);
            return true;
        }
        a().setFloatUniform("u_corner", this.cornerRadius);
        a().setFloatUniform("u_weight", this.cornerWeight);
        return false;
    }

    public final void e(float f) {
        if (this.farLineAlpha == f) {
            return;
        }
        this.farLineAlpha = f;
        a().setFloatUniform("u_farLineAlpha", f);
    }

    public final void f(float f) {
        if (this.farLineFadeToSides1 == f) {
            return;
        }
        this.farLineFadeToSides1 = f;
        a().setFloatUniform("u_farLineFadeToSides", f, this.farLineFadeToSides2);
    }

    public final void g(float f) {
        if (this.farLineFadeToSides2 == f) {
            return;
        }
        this.farLineFadeToSides2 = f;
        a().setFloatUniform("u_farLineFadeToSides", this.farLineFadeToSides1, f);
    }

    public final void h(float f) {
        float fMax = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.farLineFadeTowardCenter1 == fMax) {
            return;
        }
        this.farLineFadeTowardCenter1 = fMax;
        a().setFloatUniform("u_farLineFadeTowardsCenter", fMax, this.farLineFadeTowardCenter2);
    }

    public final void i(float f) {
        float fMax = Math.max(0.0f, Math.min(f, 1.0f - this.farLineFadeTowardCenter1));
        if (this.farLineFadeTowardCenter2 == fMax) {
            return;
        }
        this.farLineFadeTowardCenter2 = fMax;
        a().setFloatUniform("u_farLineFadeTowardsCenter", this.farLineFadeTowardCenter1, f);
    }

    public final void j(float f) {
        if (this.farLineWidth == f) {
            return;
        }
        this.farLineWidth = f;
        a().setFloatUniform("u_farLineWidth", f);
    }

    public final void k(float f) {
        if (this.nearLineAlpha == f) {
            return;
        }
        this.nearLineAlpha = f;
        a().setFloatUniform("u_nearLineAlpha", f);
    }

    public final void l(float f) {
        if (this.nearLineFadeToSides1 == f) {
            return;
        }
        this.nearLineFadeToSides1 = f;
        a().setFloatUniform("u_nearLineFadeToSides", f, this.nearLineFadeToSides2);
    }

    public final void m(float f) {
        if (this.nearLineFadeToSides2 == f) {
            return;
        }
        this.nearLineFadeToSides2 = f;
        a().setFloatUniform("u_nearLineFadeToSides", this.nearLineFadeToSides1, f);
    }

    public final void n(float f) {
        float fMax = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.nearLineFadeTowardCenter1 == fMax) {
            return;
        }
        this.nearLineFadeTowardCenter1 = fMax;
        a().setFloatUniform("u_nearLineFadeTowardsCenter", fMax, this.nearLineFadeTowardCenter2);
    }

    public final void o(float f) {
        float fMax = Math.max(0.0f, Math.min(f, 1.0f - this.nearLineFadeTowardCenter1));
        if (this.nearLineFadeTowardCenter2 == fMax) {
            return;
        }
        this.nearLineFadeTowardCenter2 = fMax;
        a().setFloatUniform("u_nearLineFadeTowardsCenter", this.nearLineFadeTowardCenter1, f);
    }

    public final void p(float f) {
        if (this.nearLineWidth == f) {
            return;
        }
        this.nearLineWidth = f;
        a().setFloatUniform("u_nearLineWidth", f);
    }

    public final void q(float horizontal, float vertical) {
        if (this.paddingHorizontal == horizontal) {
            if (this.paddingVertical == vertical) {
                return;
            }
        }
        this.paddingHorizontal = horizontal;
        this.paddingVertical = vertical;
        a().setFloatUniform("u_padding", this.paddingHorizontal, this.paddingVertical);
    }

    public final void r(float f) {
        if (this.ratio == f) {
            return;
        }
        this.ratio = f;
        a().setFloatUniform("u_ratio", f);
    }

    public final void s(int viewWidth, int viewHeight) {
        if (this.sizeWidth == viewWidth && this.sizeHeight == viewHeight) {
            return;
        }
        this.sizeWidth = viewWidth;
        this.sizeHeight = viewHeight;
        a().setFloatUniform("u_size", this.sizeWidth, this.sizeHeight);
    }

    public final void t(@NotNull RuntimeShader runtimeShader) {
        Intrinsics.checkNotNullParameter(runtimeShader, "<set-?>");
        this.shader = runtimeShader;
    }

    public final void u(float f) {
        if (this.width == f) {
            return;
        }
        this.width = f;
        a().setFloatUniform("u_width", f * 0.5f);
    }

    public final void v(boolean cornerChange) {
        if (cornerChange) {
            w();
        }
        x();
    }

    public final void w() {
        lb8.a();
        t(kb8.a(b()));
    }

    public final void x() {
        RuntimeShader runtimeShaderA = a();
        runtimeShaderA.setColorUniform("u_color", this.color);
        runtimeShaderA.setFloatUniform("u_width", this.width * 0.5f);
        runtimeShaderA.setFloatUniform("u_corner", this.cornerRadius);
        runtimeShaderA.setFloatUniform("u_weight", this.cornerWeight);
        runtimeShaderA.setFloatUniform("u_ratio", this.ratio);
        runtimeShaderA.setFloatUniform("u_size", this.sizeWidth, this.sizeHeight);
        runtimeShaderA.setFloatUniform("u_padding", this.paddingHorizontal, this.paddingVertical);
        runtimeShaderA.setFloatUniform("u_farLineWidth", this.farLineWidth);
        runtimeShaderA.setFloatUniform("u_nearLineWidth", this.nearLineWidth);
        runtimeShaderA.setFloatUniform("u_farLineAlpha", this.farLineAlpha);
        runtimeShaderA.setFloatUniform("u_nearLineAlpha", this.nearLineAlpha);
        runtimeShaderA.setFloatUniform("u_farLineFadeToSides", this.farLineFadeToSides1, this.farLineFadeToSides2);
        runtimeShaderA.setFloatUniform("u_nearLineFadeToSides", this.nearLineFadeToSides1, this.nearLineFadeToSides2);
        runtimeShaderA.setFloatUniform("u_farLineFadeTowardsCenter", this.farLineFadeTowardCenter1, this.farLineFadeTowardCenter2);
        runtimeShaderA.setFloatUniform("u_nearLineFadeTowardsCenter", this.nearLineFadeTowardCenter1, this.nearLineFadeTowardCenter2);
    }
}
