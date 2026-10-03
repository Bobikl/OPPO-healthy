package com.oplus.aiunit.vision;

import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public class eee {
    public boolean a = false;
    public final Set<b> b = new ArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, ppb> f10897c = new HashMap();
    public final Comparator<Pair<String, Float>> d = new a();

    public class a implements Comparator<Pair<String, Float>> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = pair.second.floatValue();
            float fFloatValue2 = pair2.second.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    public interface b {
        void a(float f);
    }

    public void a(String str, float f) {
        if (this.a) {
            ppb ppbVar = this.f10897c.get(str);
            if (ppbVar == null) {
                ppbVar = new ppb();
                this.f10897c.put(str, ppbVar);
            }
            ppbVar.a(f);
            if (str.equals("__container")) {
                Iterator<b> it = this.b.iterator();
                while (it.hasNext()) {
                    it.next().a(f);
                }
            }
        }
    }

    public void b(boolean z) {
        this.a = z;
    }
}
