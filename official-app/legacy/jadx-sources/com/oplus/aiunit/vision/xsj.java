package com.oplus.aiunit.vision;

import com.oplus.anim.model.DocumentData;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class xsj extends zoa<DocumentData> {

    public class a extends mi6<DocumentData> {
        public final /* synthetic */ fi6 d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ mi6 f18749e;
        public final /* synthetic */ DocumentData f;

        public a(fi6 fi6Var, mi6 mi6Var, DocumentData documentData) {
            this.d = fi6Var;
            this.f18749e = mi6Var;
            this.f = documentData;
        }

        @Override // com.oplus.aiunit.vision.mi6
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public DocumentData a(fi6<DocumentData> fi6Var) {
            this.d.h(fi6Var.f(), fi6Var.a(), fi6Var.g().a, fi6Var.b().a, fi6Var.d(), fi6Var.c(), fi6Var.e());
            String str = (String) this.f18749e.a(this.d);
            DocumentData documentDataB = fi6Var.c() == 1.0f ? fi6Var.b() : fi6Var.g();
            this.f.a(str, documentDataB.b, documentDataB.f19617c, documentDataB.d, documentDataB.f19618e, documentDataB.f, documentDataB.g, documentDataB.h, documentDataB.i, documentDataB.f19619j, documentDataB.k, documentDataB.f19620l, documentDataB.m);
            return this.f;
        }
    }

    public xsj(List<xoa<DocumentData>> list) {
        super(list);
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
    public DocumentData i(xoa<DocumentData> xoaVar, float f) {
        DocumentData documentData;
        mi6<A> mi6Var = this.f18122e;
        if (mi6Var == 0) {
            return (f != 1.0f || (documentData = xoaVar.f18704c) == null) ? xoaVar.b : documentData;
        }
        float f2 = xoaVar.g;
        Float f3 = xoaVar.h;
        float fFloatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
        DocumentData documentData2 = xoaVar.b;
        DocumentData documentData3 = documentData2;
        DocumentData documentData4 = xoaVar.f18704c;
        return (DocumentData) mi6Var.b(f2, fFloatValue, documentData3, documentData4 == null ? documentData2 : documentData4, f, d(), f());
    }

    public void q(mi6<String> mi6Var) {
        super.n(new a(new fi6(), mi6Var, new DocumentData()));
    }
}
