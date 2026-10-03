package com.oplus.aiunit.vision;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class o9e extends apa<PointF> {
    public final PointF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f14850j;
    public final float[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PathMeasure f14851l;
    public m9e m;

    public o9e(List<? extends yoa<PointF>> list) {
        super(list);
        this.i = new PointF();
        this.f14850j = new float[2];
        this.k = new float[2];
        this.f14851l = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.oplus.aiunit.vision.v51
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF i(yoa<PointF> yoaVar, float f) {
        PointF pointF;
        m9e m9eVar = (m9e) yoaVar;
        Path pathK = m9eVar.k();
        if (pathK == null) {
            return yoaVar.b;
        }
        mbb<A> mbbVar = this.f17711e;
        if (mbbVar != 0 && (pointF = (PointF) mbbVar.b(m9eVar.g, m9eVar.h.floatValue(), (PointF) m9eVar.b, (PointF) m9eVar.f19086c, e(), f, f())) != null) {
            return pointF;
        }
        if (this.m != m9eVar) {
            this.f14851l.setPath(pathK, false);
            this.m = m9eVar;
        }
        float length = this.f14851l.getLength();
        float f2 = f * length;
        this.f14851l.getPosTan(f2, this.f14850j, this.k);
        PointF pointF2 = this.i;
        float[] fArr = this.f14850j;
        pointF2.set(fArr[0], fArr[1]);
        if (f2 < 0.0f) {
            PointF pointF3 = this.i;
            float[] fArr2 = this.k;
            pointF3.offset(fArr2[0] * f2, fArr2[1] * f2);
        } else if (f2 > length) {
            PointF pointF4 = this.i;
            float[] fArr3 = this.k;
            float f3 = f2 - length;
            pointF4.offset(fArr3[0] * f3, fArr3[1] * f3);
        }
        return this.i;
    }
}
