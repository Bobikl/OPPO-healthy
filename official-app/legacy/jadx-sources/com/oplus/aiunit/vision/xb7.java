package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.provider.MediaStore;
import androidx.annotation.RequiresApi;
import com.heytap.speech.engine.constant.EngineConstant;

/* JADX INFO: loaded from: classes15.dex */
public class xb7 extends srb {
    public int r;
    public int s;
    public String t;

    public static class a extends srb.a<a, xb7> {
        public int r;
        public String s;

        @RequiresApi(api = 29)
        @SuppressLint({"ObsoleteSdkInt"})
        public a() {
            super(MediaStore.Files.getContentUri(EngineConstant.ENGINE_CONFIG_EXTERNAL));
        }

        public xb7 v() {
            return new xb7(this);
        }
    }

    public xb7(a aVar) {
        super(aVar);
        this.r = aVar.r;
        this.s = aVar.r;
        this.t = aVar.s;
    }
}
