package com.oplus.aiunit.vision;

import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public abstract class dze {
    public final dze a;
    public final Object b;

    public static final class a extends dze {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SettableAnyProperty f10735c;
        public final String d;

        public a(dze dzeVar, Object obj, SettableAnyProperty settableAnyProperty, String str) {
            super(dzeVar, obj);
            this.f10735c = settableAnyProperty;
            this.d = str;
        }

        @Override // com.oplus.aiunit.vision.dze
        public void a(Object obj) throws IOException {
            this.f10735c.set(obj, this.d, this.b);
        }
    }

    public static final class b extends dze {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f10736c;

        public b(dze dzeVar, Object obj, Object obj2) {
            super(dzeVar, obj);
            this.f10736c = obj2;
        }

        @Override // com.oplus.aiunit.vision.dze
        public void a(Object obj) throws IOException {
            ((Map) obj).put(this.f10736c, this.b);
        }
    }

    public static final class c extends dze {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SettableBeanProperty f10737c;

        public c(dze dzeVar, Object obj, SettableBeanProperty settableBeanProperty) {
            super(dzeVar, obj);
            this.f10737c = settableBeanProperty;
        }

        @Override // com.oplus.aiunit.vision.dze
        public void a(Object obj) throws IOException {
            this.f10737c.set(obj, this.b);
        }
    }

    public dze(dze dzeVar, Object obj) {
        this.a = dzeVar;
        this.b = obj;
    }

    public abstract void a(Object obj) throws IOException;
}
