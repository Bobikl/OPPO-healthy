package com.oplus.aiunit.vision;

import com.badlogic.gdx.graphics.Texture;

/* JADX INFO: loaded from: classes13.dex */
public interface wtj {

    public static class a implements wtj {
        public final di0 a;

        public a(di0 di0Var) {
            this.a = di0Var;
        }

        @Override // com.oplus.aiunit.vision.wtj
        public Texture load(String str) {
            return (Texture) this.a.q(str, Texture.class);
        }
    }

    Texture load(String str);
}
