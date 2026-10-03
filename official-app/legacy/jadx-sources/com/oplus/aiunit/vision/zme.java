package com.oplus.aiunit.vision;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class zme extends apa<PointF> {
    public final PointF i;

    public zme(List<yoa<PointF>> list) {
        super(list);
        this.i = new PointF();
    }

    @Override // com.oplus.aiunit.vision.v51
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF i(yoa<PointF> yoaVar, float f) {
        return j(yoaVar, f, f, f);
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
    @Override // com.oplus.aiunit.vision.v51
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF j(yoa<PointF> yoaVar, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = yoaVar.b;
        if (pointF3 == null || (pointF = yoaVar.f19086c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        mbb<A> mbbVar = this.f17711e;
        if (mbbVar != 0 && (pointF2 = (PointF) mbbVar.b(yoaVar.g, yoaVar.h.floatValue(), pointF4, pointF5, f, e(), f())) != null) {
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
