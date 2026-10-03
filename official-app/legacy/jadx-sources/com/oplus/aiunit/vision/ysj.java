package com.oplus.aiunit.vision;

import com.airbnb.lottie.model.DocumentData;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ysj extends apa<DocumentData> {

    public class a extends mbb<DocumentData> {
        public final /* synthetic */ wab d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ mbb f19134e;
        public final /* synthetic */ DocumentData f;

        public a(wab wabVar, mbb mbbVar, DocumentData documentData) {
            this.d = wabVar;
            this.f19134e = mbbVar;
            this.f = documentData;
        }

        @Override // com.oplus.aiunit.vision.mbb
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public DocumentData a(wab<DocumentData> wabVar) {
            this.d.h(wabVar.f(), wabVar.a(), wabVar.g().a, wabVar.b().a, wabVar.d(), wabVar.c(), wabVar.e());
            String str = (String) this.f19134e.a(this.d);
            DocumentData documentDataB = wabVar.c() == 1.0f ? wabVar.b() : wabVar.g();
            this.f.a(str, documentDataB.b, documentDataB.f503c, documentDataB.d, documentDataB.f504e, documentDataB.f, documentDataB.g, documentDataB.h, documentDataB.i, documentDataB.f505j, documentDataB.k, documentDataB.f506l, documentDataB.m);
            return this.f;
        }
    }

    public ysj(List<yoa<DocumentData>> list) {
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
    @Override // com.oplus.aiunit.vision.v51
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public DocumentData i(yoa<DocumentData> yoaVar, float f) {
        DocumentData documentData;
        mbb<A> mbbVar = this.f17711e;
        if (mbbVar == 0) {
            return (f != 1.0f || (documentData = yoaVar.f19086c) == null) ? yoaVar.b : documentData;
        }
        float f2 = yoaVar.g;
        Float f3 = yoaVar.h;
        float fFloatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
        DocumentData documentData2 = yoaVar.b;
        DocumentData documentData3 = documentData2;
        DocumentData documentData4 = yoaVar.f19086c;
        return (DocumentData) mbbVar.b(f2, fFloatValue, documentData3, documentData4 == null ? documentData2 : documentData4, f, d(), f());
    }

    public void r(mbb<String> mbbVar) {
        super.o(new a(new wab(), mbbVar, new DocumentData()));
    }
}
