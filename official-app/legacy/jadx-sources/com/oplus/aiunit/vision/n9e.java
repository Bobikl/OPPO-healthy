package com.oplus.aiunit.vision;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class n9e extends zoa<PointF> {
    public final PointF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f14407j;
    public final PathMeasure k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l9e f14408l;

    public n9e(List<? extends xoa<PointF>> list) {
        super(list);
        this.i = new PointF();
        this.f14407j = new float[2];
        this.k = new PathMeasure();
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
    @Override // com.oplus.aiunit.vision.w51
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF i(xoa<PointF> xoaVar, float f) {
        PointF pointF;
        l9e l9eVar = (l9e) xoaVar;
        Path pathK = l9eVar.k();
        if (pathK == null) {
            return xoaVar.b;
        }
        mi6<A> mi6Var = this.f18122e;
        if (mi6Var != 0 && (pointF = (PointF) mi6Var.b(l9eVar.g, l9eVar.h.floatValue(), (PointF) l9eVar.b, (PointF) l9eVar.f18704c, e(), f, f())) != null) {
            return pointF;
        }
        if (this.f14408l != l9eVar) {
            this.k.setPath(pathK, false);
            this.f14408l = l9eVar;
        }
        PathMeasure pathMeasure = this.k;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f14407j, null);
        PointF pointF2 = this.i;
        float[] fArr = this.f14407j;
        pointF2.set(fArr[0], fArr[1]);
        return this.i;
    }
}
