package com.coui.appcompat.chip;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import com.coui.appcompat.chip.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UiThread
public class b<T extends com.coui.appcompat.chip.a<T>> {
    public final Map<Integer, T> a = new HashMap();
    public final Set<Integer> b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f1669c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1670e;

    public interface a {
        void onCheckedStateChanged(@NonNull Set<Integer> set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(com.coui.appcompat.chip.a aVar, boolean z) {
        if (z) {
            if (!d(aVar)) {
                return;
            }
        } else if (!o(aVar, this.f1670e)) {
            return;
        }
        k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(T t) {
        this.a.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            d(t);
        }
        t.setInternalOnCheckedChangeListener(new com.coui.appcompat.chip.a.InterfaceC0198a() { // from class: com.oplus.aiunit.vision.lg2
            @Override // com.coui.appcompat.chip.a.InterfaceC0198a
            public final void onCheckedChanged(Object obj, boolean z) {
                this.a.j((com.coui.appcompat.chip.a) obj, z);
            }
        });
    }

    public void c(@IdRes int i) {
        T t = this.a.get(Integer.valueOf(i));
        if (t != null && d(t)) {
            k();
        }
    }

    public final boolean d(@NonNull com.coui.appcompat.chip.a<T> aVar) {
        int id = aVar.getId();
        if (this.b.contains(Integer.valueOf(id))) {
            return false;
        }
        T t = this.a.get(Integer.valueOf(h()));
        if (t != null) {
            o(t, false);
        }
        boolean zAdd = this.b.add(Integer.valueOf(id));
        if (!aVar.isChecked()) {
            aVar.setChecked(true);
        }
        return zAdd;
    }

    public void e() {
        boolean z = !this.b.isEmpty();
        Iterator<T> it = this.a.values().iterator();
        while (it.hasNext()) {
            o(it.next(), false);
        }
        if (z) {
            k();
        }
    }

    @NonNull
    public Set<Integer> f() {
        return new HashSet(this.b);
    }

    @NonNull
    public List<Integer> g(@NonNull ViewGroup viewGroup) {
        Set<Integer> setF = f();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof com.coui.appcompat.chip.a) && setF.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @IdRes
    public int h() {
        if (!this.d || this.b.isEmpty()) {
            return -1;
        }
        return this.b.iterator().next().intValue();
    }

    public boolean i() {
        return this.d;
    }

    public final void k() {
        a aVar = this.f1669c;
        if (aVar != null) {
            aVar.onCheckedStateChanged(f());
        }
    }

    public void l(T t) {
        t.setInternalOnCheckedChangeListener(null);
        this.a.remove(Integer.valueOf(t.getId()));
        this.b.remove(Integer.valueOf(t.getId()));
    }

    public void m(boolean z) {
        this.f1670e = z;
    }

    public void n(boolean z) {
        if (this.d != z) {
            this.d = z;
            e();
        }
    }

    public final boolean o(@NonNull com.coui.appcompat.chip.a<T> aVar, boolean z) {
        int id = aVar.getId();
        if (!this.b.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && this.b.size() == 1 && this.b.contains(Integer.valueOf(id))) {
            aVar.setChecked(true);
            return false;
        }
        boolean zRemove = this.b.remove(Integer.valueOf(id));
        if (aVar.isChecked()) {
            aVar.setChecked(false);
        }
        return zRemove;
    }

    public void setOnCheckedStateChangeListener(@Nullable a aVar) {
        this.f1669c = aVar;
    }
}
