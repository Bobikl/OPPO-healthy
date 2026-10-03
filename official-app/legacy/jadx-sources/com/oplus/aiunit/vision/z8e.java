package com.oplus.aiunit.vision;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.ParticleEmitter;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes13.dex */
public class z8e implements bv5 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f19322j;
    public float k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f19323l = 1.0f;
    public float m = 1.0f;
    public final wg0<ParticleEmitter> i = new wg0<>(8);

    public void b(kb7 kb7Var, kb7 kb7Var2) throws Throwable {
        p(kb7Var);
        n(kb7Var2);
    }

    @Override // com.oplus.aiunit.vision.bv5
    public void dispose() {
        if (this.f19322j) {
            int i = this.i.f18241j;
            for (int i2 = 0; i2 < i; i2++) {
                wg0.b<uki> it = this.i.get(i2).b().iterator();
                while (it.hasNext()) {
                    it.next().f().dispose();
                }
            }
        }
    }

    public void i(kb7 kb7Var, ptj ptjVar, String str) throws Throwable {
        p(kb7Var);
        o(ptjVar, str);
    }

    public void n(kb7 kb7Var) {
        this.f19322j = true;
        com.badlogic.gdx.utils.i iVar = new com.badlogic.gdx.utils.i(this.i.f18241j);
        int i = this.i.f18241j;
        for (int i2 = 0; i2 < i; i2++) {
            ParticleEmitter particleEmitter = this.i.get(i2);
            if (particleEmitter.a().f18241j != 0) {
                wg0<uki> wg0Var = new wg0<>();
                wg0.b<String> it = particleEmitter.a().iterator();
                while (it.hasNext()) {
                    String name = new File(it.next().replace('\\', mla.SEPARATOR)).getName();
                    uki ukiVar = (uki) iVar.get(name);
                    if (ukiVar == null) {
                        ukiVar = new uki(q(kb7Var.a(name)));
                        iVar.h(name, ukiVar);
                    }
                    wg0Var.a(ukiVar);
                }
                particleEmitter.n(wg0Var);
            }
        }
    }

    public void o(ptj ptjVar, String str) {
        int i = this.i.f18241j;
        for (int i2 = 0; i2 < i; i2++) {
            ParticleEmitter particleEmitter = this.i.get(i2);
            if (particleEmitter.a().f18241j != 0) {
                wg0<uki> wg0Var = new wg0<>();
                wg0.b<String> it = particleEmitter.a().iterator();
                while (it.hasNext()) {
                    String name = new File(it.next().replace('\\', mla.SEPARATOR)).getName();
                    int iLastIndexOf = name.lastIndexOf(46);
                    if (iLastIndexOf != -1) {
                        name = name.substring(0, iLastIndexOf);
                    }
                    if (str != null) {
                        name = str + name;
                    }
                    uki ukiVarB = ptjVar.b(name);
                    if (ukiVarB == null) {
                        throw new IllegalArgumentException("Atlas is missing region: " + name);
                    }
                    wg0Var.a(ukiVarB);
                }
                particleEmitter.n(wg0Var);
            }
        }
    }

    public void p(kb7 kb7Var) throws Throwable {
        InputStream inputStreamM = kb7Var.m();
        this.i.clear();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamM), 512);
                do {
                    try {
                        this.i.a(r(bufferedReader2));
                    } catch (IOException e2) {
                        e = e2;
                        bufferedReader = bufferedReader2;
                        throw new GdxRuntimeException("Error loading effect: " + kb7Var, e);
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        nwi.a(bufferedReader);
                        throw th;
                    }
                } while (bufferedReader2.readLine() != null);
                nwi.a(bufferedReader2);
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Texture q(kb7 kb7Var) {
        return new Texture(kb7Var, false);
    }

    public ParticleEmitter r(BufferedReader bufferedReader) throws IOException {
        return new ParticleEmitter(bufferedReader);
    }
}
