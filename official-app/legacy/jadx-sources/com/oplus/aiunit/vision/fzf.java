package com.oplus.aiunit.vision;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import com.alibaba.android.arouter.facade.Postcard;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/fzf;", "", "", "launchType", "Landroid/content/Intent;", "intent", "", "goToLaunch", "Lcom/alibaba/android/arouter/facade/Postcard;", "a", "<init>", "()V", "Health-6.4.4_03460bd_260624_OPlusRelease"}, k = 1, mv = {1, 8, 0})
public final class fzf {
    @Nullable
    public final Postcard a(int launchType, @NotNull Intent intent, boolean goToLaunch) {
        Postcard postcardWithInt;
        Bundle optionsBundle;
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (goToLaunch) {
            postcardWithInt = x0.d().b("/app/LaunchActivity").withInt("launchType", launchType).withString("extra", intent.getStringExtra("extra"));
        } else if (launchType == 14) {
            postcardWithInt = x0.d().b("/step/StepHistoryActivity").withInt("launchType", 14);
        } else if (launchType != 15) {
            postcardWithInt = launchType != 18 ? null : x0.d().b("/step/StepHistoryActivity").withInt("launchType", 18);
        } else {
            postcardWithInt = x0.d().b("/app/MainActivity").withInt("launchType", 15).withString("extra", intent.getStringExtra("extra"));
        }
        if (postcardWithInt != null) {
            postcardWithInt.withOptionsCompat(ActivityOptionsCompat.makeBasic());
        }
        if (postcardWithInt != null && (optionsBundle = postcardWithInt.getOptionsBundle()) != null) {
            optionsBundle.putInt("android.activity.launchDisplayId", 0);
        }
        return postcardWithInt;
    }
}
