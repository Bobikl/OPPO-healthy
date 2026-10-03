package com.oplus.aiunit.vision;

import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class dee {
    public boolean a = false;
    public final Set<b> b = new ArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, qpb> f10527c = new HashMap();
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
            qpb qpbVar = this.f10527c.get(str);
            if (qpbVar == null) {
                qpbVar = new qpb();
                this.f10527c.put(str, qpbVar);
            }
            qpbVar.a(f);
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
