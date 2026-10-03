package com.oplus.aiunit.vision;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class yme extends zoa<PointF> {
    public final PointF i;

    public yme(List<xoa<PointF>> list) {
        super(list);
        this.i = new PointF();
    }

    @Override // com.oplus.aiunit.vision.w51
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF i(xoa<PointF> xoaVar, float f) {
        return j(xoaVar, f, f, f);
    }

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
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF j(xoa<PointF> xoaVar, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = xoaVar.b;
        if (pointF3 == null || (pointF = xoaVar.f18704c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        mi6<A> mi6Var = this.f18122e;
        if (mi6Var != 0 && (pointF2 = (PointF) mi6Var.b(xoaVar.g, xoaVar.h.floatValue(), pointF4, pointF5, f, e(), f())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.i;
        float f4 = pointF4.x;
        float f5 = f4 + (f2 * (pointF5.x - f4));
        float f6 = pointF4.y;
        pointF6.set(f5, f6 + (f3 * (pointF5.y - f6)));
        return this.i;
    }
}
