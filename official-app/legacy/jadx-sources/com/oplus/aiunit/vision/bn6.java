package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class bn6 {
    public final List<a<?>> a = new ArrayList();

    public static final class a<T> {
        public final Class<T> a;
        public final im6<T> b;

        public a(@NonNull Class<T> cls, @NonNull im6<T> im6Var) {
            this.a = cls;
            this.b = im6Var;
        }

        public boolean a(@NonNull Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(@NonNull Class<T> cls, @NonNull im6<T> im6Var) {
        this.a.add(new a<>(cls, im6Var));
    }

    @Nullable
    public synchronized <T> im6<T> b(@NonNull Class<T> cls) {
        for (a<?> aVar : this.a) {
            if (aVar.a(cls)) {
                return (im6<T>) aVar.b;
            }
        }
        return null;
    }
}
