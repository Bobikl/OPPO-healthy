package com.oplus.aiunit.vision;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class sk3 extends apa<Integer> {
    public sk3(List<yoa<Integer>> list) {
        super(list);
    }

    public int q() {
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
    public int r(yoa<Integer> yoaVar, float f) {
        Float f2;
        Integer num;
        if (yoaVar.b == null || yoaVar.f19086c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        mbb<A> mbbVar = this.f17711e;
        return (mbbVar == 0 || (f2 = yoaVar.h) == null || (num = (Integer) mbbVar.b(yoaVar.g, f2.floatValue(), yoaVar.b, yoaVar.f19086c, f, e(), f())) == null) ? i38.c(m0c.b(f, 0.0f, 1.0f), yoaVar.b.intValue(), yoaVar.f19086c.intValue()) : num.intValue();
    }

    @Override // com.oplus.aiunit.vision.v51
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer i(yoa<Integer> yoaVar, float f) {
        return Integer.valueOf(r(yoaVar, f));
    }
}
