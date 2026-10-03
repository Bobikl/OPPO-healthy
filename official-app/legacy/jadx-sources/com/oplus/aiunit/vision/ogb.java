package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ogb implements ngb {
    public final Map<Class<? extends ltc>, e5i> a;

    public static class a implements ngb.a {
        public final Map<Class<? extends ltc>, e5i> a = new HashMap(3);

        @Override // com.oplus.aiunit.vision.ngb.a
        @NonNull
        public <N extends ltc> ngb.a a(@NonNull Class<N> cls, @NonNull e5i e5iVar) {
            e5i e5iVar2 = this.a.get(cls);
            if (e5iVar2 == null) {
                this.a.put(cls, e5iVar);
            } else if (e5iVar2 instanceof b) {
                ((b) e5iVar2).a.add(0, e5iVar);
            } else {
                this.a.put(cls, new b(e5iVar, e5iVar2));
            }
            return this;
        }

        @Override // com.oplus.aiunit.vision.ngb.a
        @NonNull
        public <N extends ltc> ngb.a b(@NonNull Class<N> cls, @Nullable e5i e5iVar) {
            if (e5iVar == null) {
                this.a.remove(cls);
            } else {
                this.a.put(cls, e5iVar);
            }
            return this;
        }

        @Override // com.oplus.aiunit.vision.ngb.a
        @NonNull
        public ngb build() {
            return new ogb(Collections.unmodifiableMap(this.a));
        }
    }

    public static class b implements e5i {
        public final List<e5i> a;

        public b(@NonNull e5i e5iVar, @NonNull e5i e5iVar2) {
            ArrayList arrayList = new ArrayList(3);
            this.a = arrayList;
            arrayList.add(e5iVar);
            arrayList.add(e5iVar2);
        }

        @Override // com.oplus.aiunit.vision.e5i
        @Nullable
        public Object a(@NonNull hgb hgbVar, @NonNull kpf kpfVar) {
            int size = this.a.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = this.a.get(i).a(hgbVar, kpfVar);
            }
            return objArr;
        }
    }

    public ogb(@NonNull Map<Class<? extends ltc>, e5i> map) {
        this.a = map;
    }

    @Override // com.oplus.aiunit.vision.ngb
    @Nullable
    public <N extends ltc> e5i get(@NonNull Class<N> cls) {
        return this.a.get(cls);
    }
}
