package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class pse<Z> extends eg4<Z> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Handler f15468j = new Handler(Looper.getMainLooper(), new a());
    public final vqf i;

    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((pse) message.obj).a();
            return true;
        }
    }

    public pse(vqf vqfVar, int i, int i2) {
        super(i, i2);
        this.i = vqfVar;
    }

    public static <Z> pse<Z> b(vqf vqfVar, int i, int i2) {
        return new pse<>(vqfVar, i, i2);
    }

    public void a() {
        this.i.f(this);
    }

    @Override // com.oplus.aiunit.vision.boj
    public void onLoadCleared(@Nullable Drawable drawable) {
    }

    @Override // com.oplus.aiunit.vision.boj
    public void onResourceReady(@NonNull Z z, @Nullable oak<? super Z> oakVar) {
        dqf request = getRequest();
        if (request == null || !request.isComplete()) {
            return;
        }
        f15468j.obtainMessage(1, this).sendToTarget();
    }
}
