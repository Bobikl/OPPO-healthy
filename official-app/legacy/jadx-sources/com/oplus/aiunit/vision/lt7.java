package com.oplus.aiunit.vision;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class lt7 extends apa<Float> {
    public lt7(List<yoa<Float>> list) {
        super(list);
    }

    public float q() {
        return r(b(), d());
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
    public float r(yoa<Float> yoaVar, float f) {
        Float f2;
        if (yoaVar.b == null || yoaVar.f19086c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        mbb<A> mbbVar = this.f17711e;
        return (mbbVar == 0 || (f2 = (Float) mbbVar.b(yoaVar.g, yoaVar.h.floatValue(), yoaVar.b, yoaVar.f19086c, f, e(), f())) == null) ? m0c.i(yoaVar.g(), yoaVar.d(), f) : f2.floatValue();
    }

    @Override // com.oplus.aiunit.vision.v51
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Float i(yoa<Float> yoaVar, float f) {
        return Float.valueOf(r(yoaVar, f));
    }
}
