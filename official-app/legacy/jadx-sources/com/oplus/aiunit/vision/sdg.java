package com.oplus.aiunit.vision;

import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class sdg extends zoa<ceg> {
    public final ceg i;

    public sdg(List<xoa<ceg>> list) {
        super(list);
        this.i = new ceg();
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
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public ceg i(xoa<ceg> xoaVar, float f) {
        ceg cegVar;
        ceg cegVar2;
        ceg cegVar3 = xoaVar.b;
        if (cegVar3 == null || (cegVar = xoaVar.f18704c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        ceg cegVar4 = cegVar3;
        ceg cegVar5 = cegVar;
        mi6<A> mi6Var = this.f18122e;
        if (mi6Var != 0 && (cegVar2 = (ceg) mi6Var.b(xoaVar.g, xoaVar.h.floatValue(), cegVar4, cegVar5, f, e(), f())) != null) {
            return cegVar2;
        }
        this.i.d(l0c.i(cegVar4.b(), cegVar5.b(), f), l0c.i(cegVar4.c(), cegVar5.c(), f));
        return this.i;
    }
}
