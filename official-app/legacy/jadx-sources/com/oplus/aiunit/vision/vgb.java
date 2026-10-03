package com.oplus.aiunit.vision;

import android.graphics.Path;
import com.oplus.anim.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vgb {
    public final List<w51<eyg, Path>> a;
    public final List<w51<Integer, Integer>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Mask> f17855c;

    public vgb(List<Mask> list) {
        this.f17855c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(list.get(i).b().a());
            this.b.add(list.get(i).c().a());
        }
    }

    public List<w51<eyg, Path>> a() {
        return this.a;
    }

    public List<Mask> b() {
        return this.f17855c;
    }

    public List<w51<Integer, Integer>> c() {
        return this.b;
    }
}
