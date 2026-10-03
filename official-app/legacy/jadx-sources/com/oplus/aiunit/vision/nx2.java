package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.animation.Animation;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/nx2;", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "", ParserTag.TAG_ON_ANIMATION_START, ParserTag.TAG_ON_ANIMATION_END, ParserTag.TAG_ON_ANIMATION_REPEAT, "c", "b", "", "i", "J", "mAnimationDuration", "j", "Landroid/view/animation/Animation;", "mAnimation", "Landroid/os/Handler;", MapSchema.FIELD_NAME_KEY, "Landroid/os/Handler;", "mHandler", "", LogFieldKey.LEVEL_KEY, "Ljava/lang/String;", "mAnimationName", "<init>", "(Ljava/lang/String;Landroid/view/animation/Animation;)V", "Companion", "a", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public class nx2 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final long mAnimationDuration;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final Animation mAnimation;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final Handler mHandler;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final String mAnimationName;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/aiunit/vision/nx2$b", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
    public static final class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg.what == 100) {
                nx2 nx2Var = nx2.this;
                nx2Var.onAnimationEnd(nx2Var.mAnimation);
            }
        }
    }

    public nx2(@NotNull String mAnimationName, @NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(mAnimationName, "mAnimationName");
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.mAnimationName = mAnimationName;
        long duration = animation.getDuration();
        this.mAnimationDuration = duration;
        this.mAnimation = animation;
        this.mHandler = new b(Looper.getMainLooper());
        c7b.INSTANCE.a("PAAnimationListener", "PAAnimationListener " + mAnimationName + " duration = " + duration);
    }

    public final void b() {
        c7b.INSTANCE.a("PAAnimationListener", this.mAnimationName + " removeCheckAnimationCompleteMsg");
        if (this.mHandler.hasMessages(100)) {
            this.mHandler.removeMessages(100);
        }
    }

    public final void c() {
        c7b.INSTANCE.a("PAAnimationListener", this.mAnimationName + " sendCheckAnimationCompleteMsg");
        this.mHandler.sendEmptyMessageDelayed(100, this.mAnimationDuration + ((long) 100));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        c7b.INSTANCE.a("PAAnimationListener", this.mAnimationName + " onAnimationEnd");
        b();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        c7b.INSTANCE.a("PAAnimationListener", this.mAnimationName + " onAnimationRepeat");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        c7b.INSTANCE.a("PAAnimationListener", this.mAnimationName + " onAnimationStart");
        c();
    }
}
