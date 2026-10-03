package com.oplus.aiunit.vision;

import android.content.Intent;
import android.view.KeyEvent;
import android.view.MenuItem;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.oobe.Stage;

/* JADX INFO: loaded from: classes17.dex */
public class mli {
    public static final String TAG = "StageProceed";
    public Stage a;
    public Stage b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kli f14121c;
    public Intent d;

    public mli(kli kliVar) {
        this.f14121c = kliVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Stage stage) {
        if (stage == null) {
            throw new IllegalThreadStateException("stage can not be null !!!");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("currentStage:");
        Stage stage2 = this.a;
        sb.append(stage2 == null ? "null" : stage2.getClass().getSimpleName());
        sb.append("start stage is ");
        sb.append(stage.getClass().getSimpleName());
        a7b.f(TAG, sb.toString());
        Stage stage3 = this.a;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Stage stage4 = this.a;
            if (stage4 != null) {
                if (stage4.getClass() == stage.getClass()) {
                    return;
                }
                this.a.p();
                this.b = this.a;
            }
            this.a = stage;
            stage.g(this.f14121c);
            this.a.o(this);
            a7b.f(TAG, "start: cost time is " + (System.currentTimeMillis() - jCurrentTimeMillis) + " stage is " + stage.getClass().getSimpleName());
        } catch (Exception e2) {
            a7b.f(TAG, "prevStage:" + stage3 + ",start stage is " + stage.getClass().getSimpleName());
            a7b.b(TAG, "Exception: " + e2.getMessage() + ",caller:" + m3k.a());
            e();
        }
    }

    public Intent b() {
        return this.d;
    }

    public void d(int i, int i2, @Nullable Intent intent) {
        this.a.j(i, i2, intent);
    }

    public void e() {
        StringBuilder sb = new StringBuilder();
        sb.append("onBackPressed:");
        sb.append(this.a);
        Stage stage = this.a;
        if (stage != null) {
            stage.k();
        }
    }

    public boolean f(int i, KeyEvent keyEvent) {
        Stage stage = this.a;
        if (stage != null) {
            return stage.l(i, keyEvent);
        }
        return false;
    }

    public boolean g(@NonNull MenuItem menuItem) {
        Stage stage = this.a;
        if (stage != null) {
            return stage.m(menuItem);
        }
        return false;
    }

    public void h(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Stage stage = this.a;
        if (stage != null) {
            stage.n(i, strArr, iArr);
        }
    }

    public void i(Intent intent) {
        this.d = intent;
    }

    @MainThread
    public void j(final Stage stage) {
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.lli
            @Override // java.lang.Runnable
            public final void run() {
                this.i.c(stage);
            }
        });
    }
}
