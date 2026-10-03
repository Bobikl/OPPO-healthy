package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public class sj9 implements n2c<y68, InputStream> {
    public static final brd<Integer> TIMEOUT = brd.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    @Nullable
    public final k2c<y68, y68> a;

    public static class a implements o2c<y68, InputStream> {
        public final k2c<y68, y68> a = new k2c<>(500);

        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<y68, InputStream> d(p7c p7cVar) {
            return new sj9(this.a);
        }
    }

    public sj9(@Nullable k2c<y68, y68> k2cVar) {
        this.a = k2cVar;
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n2c.a<InputStream> a(@NonNull y68 y68Var, int i, int i2, @NonNull erd erdVar) {
        k2c<y68, y68> k2cVar = this.a;
        if (k2cVar != null) {
            y68 y68VarA = k2cVar.a(y68Var, 0, 0);
            if (y68VarA == null) {
                this.a.b(y68Var, 0, 0, y68Var);
            } else {
                y68Var = y68VarA;
            }
        }
        return new n2c.a<>(y68Var, new vk9(y68Var, ((Integer) erdVar.a(TIMEOUT)).intValue()));
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull y68 y68Var) {
        return true;
    }
}
