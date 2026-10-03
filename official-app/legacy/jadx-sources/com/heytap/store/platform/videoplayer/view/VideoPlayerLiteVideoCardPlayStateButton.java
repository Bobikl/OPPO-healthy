package com.heytap.store.platform.videoplayer.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import com.client.platform.opensdk.pay.download.resource.LanUtils;
import com.heytap.log.config.StdDtoConst;
import com.heytap.store.platform.videoplayer.base.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/heytap/store/platform/videoplayer/view/VideoPlayerLiteVideoCardPlayStateButton;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "state", "Lcom/heytap/store/platform/videoplayer/view/VideoPlayerLiteVideoCardPlayStateButton$ButtonState;", "getState", "()Lcom/heytap/store/platform/videoplayer/view/VideoPlayerLiteVideoCardPlayStateButton$ButtonState;", "setState", "(Lcom/heytap/store/platform/videoplayer/view/VideoPlayerLiteVideoCardPlayStateButton$ButtonState;)V", "onDetachedFromWindow", "", "onFinishInflate", "switchToState", StdDtoConst.FORCE_KEY, "", "ButtonState", "baseplayer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VideoPlayerLiteVideoCardPlayStateButton extends AppCompatImageView {

    @NotNull
    private ButtonState state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/heytap/store/platform/videoplayer/view/VideoPlayerLiteVideoCardPlayStateButton$ButtonState;", "", "resId", "", "(Ljava/lang/String;II)V", "getResId", "()I", "PLAY", LanUtils.US.PAUSE, "BUFFERING", "baseplayer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum ButtonState {
        PLAY(R.drawable.pf_videoplayer_video_play_resume),
        PAUSE(R.drawable.pf_videoplayer_video_play_pause),
        BUFFERING(R.drawable.pf_videoplayer_video_play_buffering);

        private final int resId;

        ButtonState(int i) {
            this.resId = i;
        }

        public final int getResId() {
            return this.resId;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonState.values().length];
            iArr[ButtonState.PLAY.ordinal()] = 1;
            iArr[ButtonState.PAUSE.ordinal()] = 2;
            iArr[ButtonState.BUFFERING.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoPlayerLiteVideoCardPlayStateButton(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void switchToState$default(VideoPlayerLiteVideoCardPlayStateButton videoPlayerLiteVideoCardPlayStateButton, ButtonState buttonState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        videoPlayerLiteVideoCardPlayStateButton.switchToState(buttonState, z);
    }

    @NotNull
    public final ButtonState getState() {
        return this.state;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        animate().cancel();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        switchToState(ButtonState.PLAY, true);
    }

    public final void setState(@NotNull ButtonState buttonState) {
        Intrinsics.checkNotNullParameter(buttonState, "<set-?>");
        this.state = buttonState;
    }

    public final void switchToState(@NotNull ButtonState state, boolean force) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.state != state || force) {
            setImageResource(state.getResId());
            int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i == 1 || i == 2) {
                animate().rotation(0.0f).setDuration(0L);
            } else if (i == 3) {
                animate().rotation(36000.0f).setDuration(100000L).setInterpolator(new LinearInterpolator());
            }
            this.state = state;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoPlayerLiteVideoCardPlayStateButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ VideoPlayerLiteVideoCardPlayStateButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoPlayerLiteVideoCardPlayStateButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.state = ButtonState.PLAY;
    }
}
