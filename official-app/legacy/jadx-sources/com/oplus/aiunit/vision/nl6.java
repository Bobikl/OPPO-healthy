package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.JsonValue;

/* JADX INFO: loaded from: classes13.dex */
public abstract class nl6 extends w8e {
    public int s;
    public int t = 4;

    @Override // com.oplus.aiunit.vision.w8e, com.badlogic.gdx.utils.d.c
    public void b(com.badlogic.gdx.utils.d dVar, JsonValue jsonValue) {
        Class cls = Integer.TYPE;
        this.s = ((Integer) dVar.l("minParticleCount", cls, jsonValue)).intValue();
        this.t = ((Integer) dVar.l("maxParticleCount", cls, jsonValue)).intValue();
    }
}
