package com.oplus.aiunit.vision;

import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class kt7 extends zoa<Float> {
    public kt7(List<xoa<Float>> list) {
        super(list);
    }

    public float p() {
        return q(b(), d());
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
    public float q(xoa<Float> xoaVar, float f) {
        Float f2;
        if (xoaVar.b == null || xoaVar.f18704c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        mi6<A> mi6Var = this.f18122e;
        return (mi6Var == 0 || (f2 = (Float) mi6Var.b(xoaVar.g, xoaVar.h.floatValue(), xoaVar.b, xoaVar.f18704c, f, e(), f())) == null) ? l0c.i(xoaVar.g(), xoaVar.d(), f) : f2.floatValue();
    }

    @Override // com.oplus.aiunit.vision.w51
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Float i(xoa<Float> xoaVar, float f) {
        return Float.valueOf(q(xoaVar, f));
    }
}
