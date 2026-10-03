package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.cpe;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class b {
    public static final com.bumptech.glide.load.data.a.InterfaceC0176a<?> b = new a();
    public final Map<Class<?>, com.bumptech.glide.load.data.a.InterfaceC0176a<?>> a = new HashMap();

    public class a implements com.bumptech.glide.load.data.a.InterfaceC0176a<Object> {
        @Override // com.bumptech.glide.load.data.a.InterfaceC0176a
        @NonNull
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0176a
        @NonNull
        public com.bumptech.glide.load.data.a<Object> b(@NonNull Object obj) {
            return new C0177b(obj);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.b$b, reason: collision with other inner class name */
    public static final class C0177b implements com.bumptech.glide.load.data.a<Object> {
        public final Object a;

        public C0177b(@NonNull Object obj) {
            this.a = obj;
        }

        @Override // com.bumptech.glide.load.data.a
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.a
        @NonNull
        public Object c() {
            return this.a;
        }
    }

    @NonNull
    public synchronized <T> com.bumptech.glide.load.data.a<T> a(@NonNull T t) {
        com.bumptech.glide.load.data.a.InterfaceC0176a<?> interfaceC0176a;
        cpe.d(t);
        interfaceC0176a = this.a.get(t.getClass());
        if (interfaceC0176a == null) {
            for (com.bumptech.glide.load.data.a.InterfaceC0176a<?> interfaceC0176a2 : this.a.values()) {
                if (interfaceC0176a2.a().isAssignableFrom(t.getClass())) {
                    interfaceC0176a = interfaceC0176a2;
                    break;
                }
            }
        }
        if (interfaceC0176a == null) {
            interfaceC0176a = b;
        }
        return (com.bumptech.glide.load.data.a<T>) interfaceC0176a.b(t);
    }

    public synchronized void b(@NonNull com.bumptech.glide.load.data.a.InterfaceC0176a<?> interfaceC0176a) {
        this.a.put(interfaceC0176a.a(), interfaceC0176a);
    }
}
