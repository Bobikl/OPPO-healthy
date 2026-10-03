package com.oplus.aiunit.vision;

import android.graphics.Path;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ryg extends v51<fyg, Path> {
    public final fyg i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f16407j;
    public Path k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Path f16408l;
    public List<wyg> m;

    public ryg(List<yoa<fyg>> list) {
        super(list);
        this.i = new fyg();
        this.f16407j = new Path();
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
    public Path i(yoa<fyg> yoaVar, float f) {
        fyg fygVar = yoaVar.b;
        fyg fygVar2 = yoaVar.f19086c;
        this.i.c(fygVar, fygVar2 == null ? fygVar : fygVar2, f);
        fyg fygVarG = this.i;
        List<wyg> list = this.m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                fygVarG = this.m.get(size).g(fygVarG);
            }
        }
        m0c.h(fygVarG, this.f16407j);
        if (this.f17711e == null) {
            return this.f16407j;
        }
        if (this.k == null) {
            this.k = new Path();
            this.f16408l = new Path();
        }
        m0c.h(fygVar, this.k);
        if (fygVar2 != null) {
            m0c.h(fygVar2, this.f16408l);
        }
        mbb<A> mbbVar = this.f17711e;
        float f2 = yoaVar.g;
        float fFloatValue = yoaVar.h.floatValue();
        Path path = this.k;
        return (Path) mbbVar.b(f2, fFloatValue, path, fygVar2 == null ? path : this.f16408l, f, e(), f());
    }

    public void r(@Nullable List<wyg> list) {
        this.m = list;
    }
}
