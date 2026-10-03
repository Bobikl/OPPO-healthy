package com.oplus.aiunit.vision;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class tdg extends apa<deg> {
    public final deg i;

    public tdg(List<yoa<deg>> list) {
        super(list);
        this.i = new deg();
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
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public deg i(yoa<deg> yoaVar, float f) {
        deg degVar;
        deg degVar2;
        deg degVar3 = yoaVar.b;
        if (degVar3 == null || (degVar = yoaVar.f19086c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        deg degVar4 = degVar3;
        deg degVar5 = degVar;
        mbb<A> mbbVar = this.f17711e;
        if (mbbVar != 0 && (degVar2 = (deg) mbbVar.b(yoaVar.g, yoaVar.h.floatValue(), degVar4, degVar5, f, e(), f())) != null) {
            return degVar2;
        }
        this.i.d(m0c.i(degVar4.b(), degVar5.b(), f), m0c.i(degVar4.c(), degVar5.c(), f));
        return this.i;
    }
}
