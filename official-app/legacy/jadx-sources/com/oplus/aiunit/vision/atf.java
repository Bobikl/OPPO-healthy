package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.reflect.ReflectionException;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey;

/* JADX INFO: loaded from: classes13.dex */
public class atf<T> implements com.badlogic.gdx.utils.d.c {
    public com.badlogic.gdx.utils.i<String, b> i = new com.badlogic.gdx.utils.i<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public wg0<b> f9483j = new wg0<>(true, 3, b.class);
    public wg0<a> k = new wg0<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9484l = 0;
    public T m;

    public static class a<T> implements com.badlogic.gdx.utils.d.c {
        public String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Class<T> f9485j;

        @Override // com.badlogic.gdx.utils.d.c
        public void b(com.badlogic.gdx.utils.d dVar, JsonValue jsonValue) {
            this.i = (String) dVar.l(BreakpointSQLiteKey.FILENAME, String.class, jsonValue);
            String str = (String) dVar.l("type", String.class, jsonValue);
            try {
                this.f9485j = kc3.a(str);
            } catch (ReflectionException e2) {
                throw new GdxRuntimeException("Class not found: " + str, e2);
            }
        }
    }

    public static class b implements com.badlogic.gdx.utils.d.c {
        public com.badlogic.gdx.utils.i<String, Object> i = new com.badlogic.gdx.utils.i<>();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public aca f9486j = new aca();
        public int k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public atf f9487l;

        @Override // com.badlogic.gdx.utils.d.c
        public void b(com.badlogic.gdx.utils.d dVar, JsonValue jsonValue) {
            this.i = (com.badlogic.gdx.utils.i) dVar.l("data", com.badlogic.gdx.utils.i.class, jsonValue);
            this.f9486j.b((int[]) dVar.l("indices", int[].class, jsonValue));
        }
    }

    public wg0<a> a() {
        return this.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.utils.d.c
    public void b(com.badlogic.gdx.utils.d dVar, JsonValue jsonValue) {
        com.badlogic.gdx.utils.i<String, b> iVar = (com.badlogic.gdx.utils.i) dVar.l("unique", com.badlogic.gdx.utils.i.class, jsonValue);
        this.i = iVar;
        com.badlogic.gdx.utils.i.a<String, b> it = iVar.c().iterator();
        while (it.hasNext()) {
            ((b) it.next().b).f9487l = this;
        }
        wg0<b> wg0Var = (wg0) dVar.m("data", wg0.class, b.class, jsonValue);
        this.f9483j = wg0Var;
        wg0.b<b> it2 = wg0Var.iterator();
        while (it2.hasNext()) {
            it2.next().f9487l = this;
        }
        this.k.b((wg0) dVar.m(SpeechConstant.RES_TYPE_ASSETS, wg0.class, a.class, jsonValue));
        this.m = (T) dVar.l("resource", null, jsonValue);
    }
}
