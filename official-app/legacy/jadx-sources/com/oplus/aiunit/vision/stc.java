package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public abstract class stc extends zla {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final stc f16744c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f16745e;

    public static final class a extends stc {
        public Iterator<ela> f;
        public ela g;

        public a(ela elaVar, stc stcVar) {
            super(1, stcVar);
            this.f = elaVar.elements();
        }

        @Override // com.oplus.aiunit.vision.zla
        public /* bridge */ /* synthetic */ zla e() {
            return super.l();
        }

        @Override // com.oplus.aiunit.vision.stc
        public ela k() {
            return this.g;
        }

        @Override // com.oplus.aiunit.vision.stc
        public JsonToken m() {
            if (!this.f.hasNext()) {
                this.g = null;
                return JsonToken.END_ARRAY;
            }
            this.b++;
            ela next = this.f.next();
            this.g = next;
            return next.asToken();
        }

        @Override // com.oplus.aiunit.vision.stc
        public stc n() {
            return new a(this.g, this);
        }

        @Override // com.oplus.aiunit.vision.stc
        public stc o() {
            return new b(this.g, this);
        }
    }

    public static final class b extends stc {
        public Iterator<Map.Entry<String, ela>> f;
        public Map.Entry<String, ela> g;
        public boolean h;

        public b(ela elaVar, stc stcVar) {
            super(2, stcVar);
            this.f = ((ObjectNode) elaVar).fields();
            this.h = true;
        }

        @Override // com.oplus.aiunit.vision.zla
        public /* bridge */ /* synthetic */ zla e() {
            return super.l();
        }

        @Override // com.oplus.aiunit.vision.stc
        public ela k() {
            Map.Entry<String, ela> entry = this.g;
            if (entry == null) {
                return null;
            }
            return entry.getValue();
        }

        @Override // com.oplus.aiunit.vision.stc
        public JsonToken m() {
            if (!this.h) {
                this.h = true;
                return this.g.getValue().asToken();
            }
            if (!this.f.hasNext()) {
                this.d = null;
                this.g = null;
                return JsonToken.END_OBJECT;
            }
            this.b++;
            this.h = false;
            Map.Entry<String, ela> next = this.f.next();
            this.g = next;
            this.d = next != null ? next.getKey() : null;
            return JsonToken.FIELD_NAME;
        }

        @Override // com.oplus.aiunit.vision.stc
        public stc n() {
            return new a(k(), this);
        }

        @Override // com.oplus.aiunit.vision.stc
        public stc o() {
            return new b(k(), this);
        }
    }

    public static final class c extends stc {
        public ela f;
        public boolean g;

        public c(ela elaVar, stc stcVar) {
            super(0, stcVar);
            this.g = false;
            this.f = elaVar;
        }

        @Override // com.oplus.aiunit.vision.zla
        public /* bridge */ /* synthetic */ zla e() {
            return super.l();
        }

        @Override // com.oplus.aiunit.vision.stc
        public ela k() {
            if (this.g) {
                return this.f;
            }
            return null;
        }

        @Override // com.oplus.aiunit.vision.stc
        public JsonToken m() {
            if (this.g) {
                this.f = null;
                return null;
            }
            this.b++;
            this.g = true;
            return this.f.asToken();
        }

        @Override // com.oplus.aiunit.vision.stc
        public stc n() {
            return new a(this.f, this);
        }

        @Override // com.oplus.aiunit.vision.stc
        public stc o() {
            return new b(this.f, this);
        }
    }

    public stc(int i, stc stcVar) {
        this.a = i;
        this.b = -1;
        this.f16744c = stcVar;
    }

    @Override // com.oplus.aiunit.vision.zla
    public final String b() {
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.zla
    public Object c() {
        return this.f16745e;
    }

    @Override // com.oplus.aiunit.vision.zla
    public void i(Object obj) {
        this.f16745e = obj;
    }

    public abstract ela k();

    public final stc l() {
        return this.f16744c;
    }

    public abstract JsonToken m();

    public abstract stc n();

    public abstract stc o();
}
