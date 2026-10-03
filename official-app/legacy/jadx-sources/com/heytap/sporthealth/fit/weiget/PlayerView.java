package com.heytap.sporthealth.fit.weiget;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.exifinterface.media.ExifInterface;
import com.coui.appcompat.progressbar.COUIHorizontalProgressBar;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.sporthealth.fit.R$id;
import com.heytap.sporthealth.fit.R$layout;
import com.heytap.sporthealth.fit.R$string;
import com.heytap.sporthealth.fit.weiget.PlayerView;
import com.oplus.aiunit.vision.jfk;
import com.oplus.aiunit.vision.rg7;
import com.oplus.aiunit.vision.yz9;
import com.oplus.aiunit.vision.zz9;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\b\u0007\u0012\u0006\u00106\u001a\u000205\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b9\u0010:J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J \u0010\u0015\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006;"}, d2 = {"Lcom/heytap/sporthealth/fit/weiget/PlayerView;", "Lcom/heytap/sporthealth/fit/weiget/MediaPlayerTextureView;", "Lcom/oplus/aiunit/vision/zz9;", "Lcom/heytap/sporthealth/fit/weiget/MediaPlayerTextureView$f;", "Landroid/view/MotionEvent;", "ev", "", "onTouchEvent", "Landroid/net/Uri;", ParserTag.TAG_URI, "", "setUri", "Landroid/media/MediaPlayer;", "getMedalPlayer", "Lcom/oplus/aiunit/vision/yz9;", "listener", "setVideoListener", "", "title", "Lkotlin/Function0;", "onNavigationBack", "b", "t2", "H1", "u3", "Landroid/view/ViewGroup;", "parent", "a", "", "progress", "setDownloadProgress", "Lcom/heytap/sporthealth/fit/weiget/JMediaController;", SecureGcmConstants.MESSAGE_KEY, "Lcom/heytap/sporthealth/fit/weiget/JMediaController;", "mJMediaController", "Landroid/view/View;", "Q", "Landroid/view/View;", "mDownloadView", "Lcom/coui/appcompat/progressbar/COUIHorizontalProgressBar;", "R", "Lcom/coui/appcompat/progressbar/COUIHorizontalProgressBar;", "mProgressBar", "Landroid/widget/TextView;", "S", "Landroid/widget/TextView;", "mProgressBarTv", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/yz9;", "getListener", "()Lcom/oplus/aiunit/vision/yz9;", "setListener", "(Lcom/oplus/aiunit/vision/yz9;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "fitness_impl_release"}, k = 1, mv = {1, 8, 0})
public final class PlayerView extends MediaPlayerTextureView implements zz9, MediaPlayerTextureView.f {

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @Nullable
    public JMediaController mJMediaController;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @Nullable
    public View mDownloadView;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public COUIHorizontalProgressBar mProgressBar;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @Nullable
    public TextView mProgressBarTv;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @Nullable
    public yz9 listener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PlayerView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void H(JMediaController this_run, String str, final Function0 onNavigationBack) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        Intrinsics.checkNotNullParameter(onNavigationBack, "$onNavigationBack");
        View viewM = this_run.m(R$id.fit_toolbar);
        Intrinsics.checkNotNullExpressionValue(viewM, "findView(R.id.fit_toolbar)");
        Toolbar toolbar = (Toolbar) viewM;
        toolbar.setTitleTextColor(-1);
        if (str == null) {
            str = "";
        }
        toolbar.setTitle(str);
        jfk.a(toolbar, -1);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.jle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerView.I(onNavigationBack, view);
            }
        });
    }

    public static final void I(Function0 onNavigationBack, View view) {
        Intrinsics.checkNotNullParameter(onNavigationBack, "$onNavigationBack");
        onNavigationBack.invoke();
    }

    @Override // com.heytap.sporthealth.fit.weiget.MediaPlayerTextureView.f
    public void H1() {
        yz9 yz9Var = this.listener;
        if (yz9Var != null) {
            yz9Var.onPause();
        }
    }

    @Override // com.oplus.aiunit.vision.zz9
    public void a(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.mDownloadView == null) {
            View viewInflate = View.inflate(parent.getContext(), R$layout.fit_course_video_download, parent);
            this.mDownloadView = viewInflate;
            Intrinsics.checkNotNull(viewInflate);
            this.mProgressBarTv = (TextView) viewInflate.findViewById(R$id.fit_tv_download_progress_msg);
            View view = this.mDownloadView;
            Intrinsics.checkNotNull(view);
            COUIHorizontalProgressBar cOUIHorizontalProgressBar = (COUIHorizontalProgressBar) view.findViewById(R$id.fit_course_video_download);
            this.mProgressBar = cOUIHorizontalProgressBar;
            Intrinsics.checkNotNull(cOUIHorizontalProgressBar);
            cOUIHorizontalProgressBar.setMax(100);
            COUIHorizontalProgressBar cOUIHorizontalProgressBar2 = this.mProgressBar;
            Intrinsics.checkNotNull(cOUIHorizontalProgressBar2);
            cOUIHorizontalProgressBar2.setIndeterminate(false);
        }
    }

    @Override // com.oplus.aiunit.vision.zz9
    public void b(@Nullable final String title, @NotNull final Function0<Unit> onNavigationBack) {
        Intrinsics.checkNotNullParameter(onNavigationBack, "onNavigationBack");
        if (this.mJMediaController == null) {
            final JMediaController jMediaController = new JMediaController(getContext());
            this.mJMediaController = jMediaController;
            jMediaController.post(new Runnable() { // from class: com.oplus.aiunit.vision.ile
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerView.H(jMediaController, title, onNavigationBack);
                }
            });
            setMediaController(jMediaController);
        }
        JMediaController jMediaController2 = this.mJMediaController;
        if (jMediaController2 != null) {
            jMediaController2.show();
        }
    }

    @Nullable
    public final yz9 getListener() {
        return this.listener;
    }

    @Override // com.oplus.aiunit.vision.zz9
    @Nullable
    public MediaPlayer getMedalPlayer() {
        return getMediaPlayer();
    }

    @Override // com.heytap.sporthealth.fit.weiget.MediaPlayerTextureView, android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent ev) {
        if (this.mJMediaController != null) {
            return super.onTouchEvent(ev);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.zz9
    public void setDownloadProgress(int progress) {
        COUIHorizontalProgressBar cOUIHorizontalProgressBar = this.mProgressBar;
        if (cOUIHorizontalProgressBar != null) {
            cOUIHorizontalProgressBar.setProgress(progress);
        }
        TextView textView = this.mProgressBarTv;
        if (textView == null) {
            return;
        }
        textView.setText(rg7.f(R$string.fit_download_progress_tip, Integer.valueOf(progress)));
    }

    public final void setListener(@Nullable yz9 yz9Var) {
        this.listener = yz9Var;
    }

    @Override // com.oplus.aiunit.vision.zz9
    public void setUri(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        setVideoURI(uri);
    }

    @Override // com.oplus.aiunit.vision.zz9
    public void setVideoListener(@NotNull yz9 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    @Override // com.heytap.sporthealth.fit.weiget.MediaPlayerTextureView.f
    public void t2() {
        yz9 yz9Var = this.listener;
        if (yz9Var != null) {
            yz9Var.onStart();
        }
    }

    @Override // com.heytap.sporthealth.fit.weiget.MediaPlayerTextureView.f
    public void u3() {
        yz9 yz9Var = this.listener;
        if (yz9Var != null) {
            yz9Var.onComplete();
        }
        this.mJMediaController = null;
    }

    public /* synthetic */ PlayerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setVideoState(this);
    }
}
