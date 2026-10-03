package com.oplus.aiunit.vision;

import android.graphics.Path;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class qyg extends w51<eyg, Path> {
    public final eyg i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f15991j;
    public List<vyg> k;

    public qyg(List<xoa<eyg>> list) {
        super(list);
        this.i = new eyg();
        this.f15991j = new Path();
    }

    @Override // com.oplus.aiunit.vision.w51
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Path i(xoa<eyg> xoaVar, float f) {
        this.i.c(xoaVar.b, xoaVar.f18704c, f);
        eyg eygVarF = this.i;
        List<vyg> list = this.k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                eygVarF = this.k.get(size).f(eygVarF);
            }
        }
        l0c.h(eygVarF, this.f15991j);
        return this.f15991j;
    }

    public void q(@Nullable List<vyg> list) {
        this.k = list;
    }
}
