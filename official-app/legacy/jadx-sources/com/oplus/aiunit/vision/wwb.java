package com.oplus.aiunit.vision;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.oplus.anim.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes19.dex */
@TargetApi(19)
public class wwb implements i9e, xb8 {
    public final String d;
    public final MergePaths f;
    public final Path a = new Path();
    public final Path b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f18423c = new Path();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<i9e> f18424e = new ArrayList();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            a = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public wwb(MergePaths mergePaths) {
        this.d = mergePaths.c();
        this.f = mergePaths;
    }

    @Override // com.oplus.aiunit.vision.xb8
    public void b(ListIterator<d74> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            d74 d74VarPrevious = listIterator.previous();
            if (d74VarPrevious instanceof i9e) {
                this.f18424e.add((i9e) d74VarPrevious);
                listIterator.remove();
            }
        }
    }

    public final void d() {
        for (int i = 0; i < this.f18424e.size(); i++) {
            this.f18423c.addPath(this.f18424e.get(i).getPath());
        }
    }

    @Override // com.oplus.aiunit.vision.d74
    public void e(List<d74> list, List<d74> list2) {
        for (int i = 0; i < this.f18424e.size(); i++) {
            this.f18424e.get(i).e(list, list2);
        }
    }

    @TargetApi(19)
    public final void g(Path.Op op) {
        this.b.reset();
        this.a.reset();
        for (int size = this.f18424e.size() - 1; size >= 1; size--) {
            i9e i9eVar = this.f18424e.get(size);
            if (i9eVar instanceof i74) {
                i74 i74Var = (i74) i9eVar;
                List<i9e> listK = i74Var.k();
                for (int size2 = listK.size() - 1; size2 >= 0; size2--) {
                    Path path = listK.get(size2).getPath();
                    path.transform(i74Var.l());
                    this.b.addPath(path);
                }
            } else {
                this.b.addPath(i9eVar.getPath());
            }
        }
        i9e i9eVar2 = this.f18424e.get(0);
        if (i9eVar2 instanceof i74) {
            i74 i74Var2 = (i74) i9eVar2;
            List<i9e> listK2 = i74Var2.k();
            for (int i = 0; i < listK2.size(); i++) {
                Path path2 = listK2.get(i).getPath();
                path2.transform(i74Var2.l());
                this.a.addPath(path2);
            }
        } else {
            this.a.set(i9eVar2.getPath());
        }
        this.f18423c.op(this.a, this.b, op);
    }

    @Override // com.oplus.aiunit.vision.i9e
    public Path getPath() {
        this.f18423c.reset();
        if (this.f.d()) {
            return this.f18423c;
        }
        int i = a.a[this.f.b().ordinal()];
        if (i == 1) {
            d();
        } else if (i == 2) {
            g(Path.Op.UNION);
        } else if (i == 3) {
            g(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            g(Path.Op.INTERSECT);
        } else if (i == 5) {
            g(Path.Op.XOR);
        }
        return this.f18423c;
    }
}
