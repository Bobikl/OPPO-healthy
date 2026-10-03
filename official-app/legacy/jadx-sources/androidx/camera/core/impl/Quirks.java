package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Quirks {

    @NonNull
    private final List<Quirk> mQuirks;

    public Quirks(@NonNull List<Quirk> list) {
        this.mQuirks = new ArrayList(list);
    }

    @NonNull
    public static String toString(@NonNull Quirks quirks) {
        ArrayList arrayList = new ArrayList();
        Iterator<Quirk> it = quirks.mQuirks.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getClass().getSimpleName());
        }
        return String.join(" | ", arrayList);
    }

    @VisibleForTesting
    public void addQuirkForTesting(@NonNull Quirk quirk) {
        this.mQuirks.add(quirk);
    }

    public boolean contains(@NonNull Class<? extends Quirk> cls) {
        Iterator<Quirk> it = this.mQuirks.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next().getClass())) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public <T extends Quirk> T get(@NonNull Class<T> cls) {
        Iterator<Quirk> it = this.mQuirks.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @NonNull
    public <T extends Quirk> List<T> getAll(@NonNull Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (Quirk quirk : this.mQuirks) {
            if (cls.isAssignableFrom(quirk.getClass())) {
                arrayList.add(quirk);
            }
        }
        return arrayList;
    }
}
