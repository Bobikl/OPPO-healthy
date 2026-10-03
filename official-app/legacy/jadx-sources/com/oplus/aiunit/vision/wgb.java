package com.oplus.aiunit.vision;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class wgb {
    public final List<v51<fyg, Path>> a;
    public final List<v51<Integer, Integer>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Mask> f18257c;

    public wgb(List<Mask> list) {
        this.f18257c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(list.get(i).b().a());
            this.b.add(list.get(i).c().a());
        }
    }

    public List<v51<fyg, Path>> a() {
        return this.a;
    }

    public List<Mask> b() {
        return this.f18257c;
    }

    public List<v51<Integer, Integer>> c() {
        return this.b;
    }
}
