package com.oplus.aiunit.vision;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes12.dex */
@TargetApi(19)
public class vwb implements j9e, yb8 {
    public final String d;
    public final MergePaths f;
    public final Path a = new Path();
    public final Path b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f18017c = new Path();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<j9e> f18018e = new ArrayList();

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

    public vwb(MergePaths mergePaths) {
        this.d = mergePaths.c();
        this.f = mergePaths;
    }

    @Override // com.oplus.aiunit.vision.yb8
    public void b(ListIterator<e74> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            e74 e74VarPrevious = listIterator.previous();
            if (e74VarPrevious instanceof j9e) {
                this.f18018e.add((j9e) e74VarPrevious);
                listIterator.remove();
            }
        }
    }

    public final void d() {
        for (int i = 0; i < this.f18018e.size(); i++) {
            this.f18017c.addPath(this.f18018e.get(i).getPath());
        }
    }

    @Override // com.oplus.aiunit.vision.e74
    public void e(List<e74> list, List<e74> list2) {
        for (int i = 0; i < this.f18018e.size(); i++) {
            this.f18018e.get(i).e(list, list2);
        }
    }

    @TargetApi(19)
    public final void f(Path.Op op) {
        this.b.reset();
        this.a.reset();
        for (int size = this.f18018e.size() - 1; size >= 1; size--) {
            j9e j9eVar = this.f18018e.get(size);
            if (j9eVar instanceof j74) {
                j74 j74Var = (j74) j9eVar;
                List<j9e> listK = j74Var.k();
                for (int size2 = listK.size() - 1; size2 >= 0; size2--) {
                    Path path = listK.get(size2).getPath();
                    path.transform(j74Var.l());
                    this.b.addPath(path);
                }
            } else {
                this.b.addPath(j9eVar.getPath());
            }
        }
        j9e j9eVar2 = this.f18018e.get(0);
        if (j9eVar2 instanceof j74) {
            j74 j74Var2 = (j74) j9eVar2;
            List<j9e> listK2 = j74Var2.k();
            for (int i = 0; i < listK2.size(); i++) {
                Path path2 = listK2.get(i).getPath();
                path2.transform(j74Var2.l());
                this.a.addPath(path2);
            }
        } else {
            this.a.set(j9eVar2.getPath());
        }
        this.f18017c.op(this.a, this.b, op);
    }

    @Override // com.oplus.aiunit.vision.j9e
    public Path getPath() {
        this.f18017c.reset();
        if (this.f.d()) {
            return this.f18017c;
        }
        int i = a.a[this.f.b().ordinal()];
        if (i == 1) {
            d();
        } else if (i == 2) {
            f(Path.Op.UNION);
        } else if (i == 3) {
            f(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            f(Path.Op.INTERSECT);
        } else if (i == 5) {
            f(Path.Op.XOR);
        }
        return this.f18017c;
    }
}
