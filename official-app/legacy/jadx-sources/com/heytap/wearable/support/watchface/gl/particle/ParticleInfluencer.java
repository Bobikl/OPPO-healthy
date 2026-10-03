package com.heytap.wearable.support.watchface.gl.particle;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class ParticleInfluencer {
    protected long mLastTime = 0;

    public void start() {
        this.mLastTime = System.currentTimeMillis();
    }

    public boolean updateParticles(LinkedList<Particle> linkedList, ParticleEmitter particleEmitter) {
        return false;
    }
}
