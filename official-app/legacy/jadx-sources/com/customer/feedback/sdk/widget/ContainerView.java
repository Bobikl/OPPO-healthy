package com.customer.feedback.sdk.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.customer.feedback.sdk.R;
import com.customer.feedback.sdk.feedbacka;
import com.customer.feedback.sdk.util.LogUtil;
import com.customer.feedback.sdk.widget.ContainerView;
import com.oplus.aiunit.vision.kwm;

/* JADX INFO: loaded from: classes13.dex */
public class ContainerView extends RelativeLayout {
    public RelativeLayout feedbacka;
    public RelativeLayout feedbackb;
    public TextView feedbackc;
    public TextView feedbackd;
    public ProgressBar feedbacke;

    /* JADX INFO: renamed from: feedbackf, reason: collision with root package name */
    public TextView f2204feedbackf;

    /* JADX INFO: renamed from: feedbackg, reason: collision with root package name */
    public int f2205feedbackg;

    /* JADX INFO: renamed from: feedbackh, reason: collision with root package name */
    public WebView f2206feedbackh;
    public ImageView feedbacki;
    public View feedbackj;
    public TextView feedbackk;
    public ImageView feedbackl;
    public View.OnClickListener feedbackm;
    public final int feedbackn;
    public final int feedbacko;
    public boolean feedbackp;
    public boolean feedbackq;
    public View feedbackr;

    public ContainerView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ boolean feedbacka(View view, MotionEvent motionEvent) {
        return true;
    }

    private void setContainerBackground(boolean z) {
        int i = this.f2205feedbackg;
        if (i == 0) {
            if (z) {
                setBackgroundColor(this.feedbackn);
                return;
            } else {
                setBackgroundColor(this.feedbacko);
                return;
            }
        }
        if (i != 1) {
            if (i != 2) {
                LogUtil.d("ContainerView", "set by page self");
                return;
            } else if (z) {
                setBackgroundColor(-16777216);
                return;
            } else {
                setBackgroundColor(-1);
                return;
            }
        }
        WebView webView = this.f2206feedbackh;
        if (webView == null) {
            return;
        }
        if (z) {
            webView.setBackgroundColor(this.feedbackn);
        } else {
            webView.setBackgroundColor(this.feedbacko);
        }
    }

    public final void feedbackb(boolean z) {
        if (!z) {
            this.feedbackj.setVisibility(8);
            setPadding(getPaddingStart(), kwm.m(getContext()), getPaddingEnd(), getPaddingBottom());
        } else {
            this.feedbackj.setVisibility(0);
            setPadding(getPaddingStart(), 0, getPaddingEnd(), getPaddingBottom());
            this.feedbackj.setPadding(0, kwm.m(getContext()), 0, 0);
        }
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    public final void feedbackc(boolean z) {
        if (z) {
            Drawable drawable = getContext().getDrawable(R.drawable.fb_anim_dark);
            Rect bounds = this.feedbacke.getIndeterminateDrawable().getBounds();
            this.feedbacke.setIndeterminateDrawable(drawable);
            this.feedbacke.getIndeterminateDrawable().setBounds(bounds);
            TextView textView = this.f2204feedbackf;
            Resources resources = getResources();
            int i = R.color.feedback_text_secondary_color_dark;
            textView.setTextColor(resources.getColor(i));
            this.feedbacka.setBackgroundColor(this.feedbackn);
            Drawable drawable2 = getContext().getDrawable(R.drawable.fb_no_network_night);
            LogUtil.d("ContainerView", "noNetworkAnim()");
            ImageView imageView = this.feedbacki;
            if (imageView != null) {
                if (drawable2 == null) {
                    imageView.setImageDrawable(getContext().getDrawable(R.drawable.fb_no_network_light));
                } else {
                    imageView.setImageDrawable(drawable2);
                    Object drawable3 = this.feedbacki.getDrawable();
                    if (drawable3 instanceof Animatable) {
                        ((Animatable) drawable3).start();
                    }
                }
            }
            this.feedbackb.setBackgroundColor(-16777216);
            TextView textView2 = this.feedbackc;
            Resources resources2 = getResources();
            int i2 = R.color.feedback_text_primary_color_dark;
            textView2.setTextColor(resources2.getColor(i2));
            this.feedbackd.setTextColor(getResources().getColor(i));
            this.feedbackl.setImageResource(R.drawable.fb_night_ic_back);
            this.feedbackj.setBackgroundColor(-16777216);
            this.feedbackk.setTextColor(getResources().getColor(i2));
        } else {
            Drawable drawable4 = getContext().getDrawable(R.drawable.fb_anim);
            Rect bounds2 = this.feedbacke.getIndeterminateDrawable().getBounds();
            this.feedbacke.setIndeterminateDrawable(drawable4);
            this.feedbacke.getIndeterminateDrawable().setBounds(bounds2);
            TextView textView3 = this.f2204feedbackf;
            Resources resources3 = getResources();
            int i3 = R.color.feedback_text_secondary_color_light;
            textView3.setTextColor(resources3.getColor(i3));
            this.feedbacka.setBackgroundColor(this.feedbacko);
            Context context = getContext();
            int i4 = R.drawable.fb_no_network_light;
            Drawable drawable5 = context.getDrawable(i4);
            LogUtil.d("ContainerView", "noNetworkAnim()");
            ImageView imageView2 = this.feedbacki;
            if (imageView2 != null) {
                if (drawable5 == null) {
                    imageView2.setImageDrawable(getContext().getDrawable(i4));
                } else {
                    imageView2.setImageDrawable(drawable5);
                    Object drawable6 = this.feedbacki.getDrawable();
                    if (drawable6 instanceof Animatable) {
                        ((Animatable) drawable6).start();
                    }
                }
            }
            this.feedbackb.setBackgroundColor(-1);
            TextView textView4 = this.feedbackc;
            Resources resources4 = getResources();
            int i5 = R.color.feedback_text_primary_color_light;
            textView4.setTextColor(resources4.getColor(i5));
            this.feedbackd.setTextColor(getResources().getColor(i3));
            this.feedbackl.setImageResource(R.drawable.fb_light_ic_back);
            this.feedbackj.setBackgroundColor(-1);
            this.feedbackk.setTextColor(getResources().getColor(i5));
        }
        this.feedbackp = z;
        setContainerBackground(z);
    }

    @SuppressLint({"ScreencaptureDetector"})
    public WebView getContentView() {
        return this.f2206feedbackh;
    }

    public int getCurrentShowViewType() {
        return this.f2205feedbackg;
    }

    public void setBackClick(View.OnClickListener onClickListener) {
        this.feedbackm = onClickListener;
    }

    public void setNavigationBarBackground(int i) {
        if (this.feedbackr != null) {
            LogUtil.i("ContainerView", "setNavigationBarBackground = " + i);
            this.feedbackr.setBackgroundColor(i);
        }
    }

    public void setNavigationBarViewHeight(int i) {
        if (this.feedbackr != null) {
            LogUtil.i("ContainerView", "setNavigationBarViewHeight = " + i);
            ViewGroup.LayoutParams layoutParams = this.feedbackr.getLayoutParams();
            layoutParams.height = i;
            this.feedbackr.setLayoutParams(layoutParams);
        }
    }

    public void setReloadListener(View.OnClickListener onClickListener) {
        this.feedbackb.setOnClickListener(onClickListener);
    }

    public void setTitle(String str) {
        this.feedbackk.setText(str);
    }

    public ContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void feedbacka() {
        Context context = getContext();
        Context context2 = feedbacka.feedbacku;
        if (context2 != null) {
            this.f2206feedbackh = new WebView(context2);
        } else {
            this.f2206feedbackh = new WebView(context);
        }
        setBackgroundColor(0);
        this.f2206feedbackh.setBackgroundColor(0);
        feedbacka(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, 0);
        layoutParams.addRule(12);
        View view = new View(context);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        view.setLayoutParams(layoutParams);
        this.feedbackr = view;
        addView(view);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(3, R.id.feedback_main_title);
        layoutParams2.addRule(2, this.feedbackr.getId());
        addView(this.f2206feedbackh, 0, layoutParams2);
        addView(View.inflate(context, R.layout.feedback_error_view, null), 0, layoutParams2);
        View viewInflate = View.inflate(context, R.layout.feedback_loading_view, null);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(2, this.feedbackr.getId());
        addView(viewInflate, 0, layoutParams3);
        this.feedbackb = (RelativeLayout) findViewById(R.id.error_rl);
        this.feedbackc = (TextView) findViewById(R.id.tv_hint);
        this.feedbackd = (TextView) findViewById(R.id.tv_hint1);
        this.feedbacka = (RelativeLayout) findViewById(R.id.rl_loading);
        this.feedbacke = (ProgressBar) findViewById(R.id.pb_loading);
        this.f2204feedbackf = (TextView) findViewById(R.id.tv_loading);
        this.feedbacki = (ImageView) findViewById(R.id.iv_no_network);
    }

    public ContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2205feedbackg = 0;
        this.feedbackn = feedbacka.feedbackb();
        this.feedbacko = getContext().getResources().getColor(R.color.feedback_background_color);
        this.feedbackp = false;
        this.feedbackq = true;
        feedbacka();
    }

    public final void feedbackb(int i) {
        if (this.feedbacki == null) {
            LogUtil.e("ContainerView", "updateErrorViewSize view is null!");
            return;
        }
        boolean z = i == 2;
        LogUtil.d("ContainerView", "updateErrorViewSize isLandscape=" + z);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.feedbacki.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            if (z) {
                layoutParams.height = getResources().getDimensionPixelSize(R.dimen.net_error_view_land_height);
            } else {
                layoutParams.height = getResources().getDimensionPixelSize(R.dimen.net_error_view_port_height);
            }
            this.feedbacki.setLayoutParams(layoutParams);
        }
    }

    public final void feedbacka(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.feedback_main_title, (ViewGroup) this, false);
        this.feedbackj = viewInflate;
        viewInflate.findViewById(R.id.iv_main_back_container).setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.y64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.feedbacka(view);
            }
        });
        this.feedbackl = (ImageView) this.feedbackj.findViewById(R.id.iv_main_back);
        this.feedbackk = (TextView) this.feedbackj.findViewById(R.id.tv_main_title);
        feedbackb(false);
        this.feedbackj.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.z64
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ContainerView.feedbacka(view, motionEvent);
            }
        });
        addView(this.feedbackj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void feedbacka(View view) {
        View.OnClickListener onClickListener = this.feedbackm;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public final void feedbacka(boolean z) {
        if (z) {
            this.feedbacka.setVisibility(0);
            setPadding(getPaddingStart(), 0, getPaddingEnd(), getPaddingBottom());
            this.feedbacka.setPadding(0, kwm.m(getContext()), 0, kwm.k(getContext()));
        } else {
            this.feedbacka.setVisibility(8);
            setPadding(getPaddingStart(), kwm.m(getContext()), getPaddingEnd(), getPaddingBottom());
        }
    }

    public final void feedbacka(int i) {
        LogUtil.d("ContainerView", "switchView:" + i);
        this.f2205feedbackg = i;
        setContainerBackground(this.feedbackp);
        if (i == 0) {
            feedbackb(false);
            this.f2206feedbackh.setVisibility(8);
            this.feedbackb.setVisibility(8);
            feedbacka(true);
            this.f2204feedbackf.setText(getResources().getString(R.string.fb_start_loading));
            return;
        }
        if (i == 1) {
            this.feedbackb.setVisibility(8);
            feedbacka(false);
            if (this.feedbackj.getVisibility() == 0) {
                setPadding(getPaddingStart(), 0, getPaddingEnd(), getPaddingBottom());
                this.feedbackj.setBackground(getBackground());
            } else {
                setPadding(getPaddingStart(), this.feedbackq ? kwm.m(getContext()) : 0, getPaddingEnd(), getPaddingBottom());
            }
            if (this.f2206feedbackh.getVisibility() != 0) {
                this.f2206feedbackh.setVisibility(0);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        this.feedbackb.setVisibility(0);
        feedbackb(getResources().getConfiguration().orientation);
        this.f2206feedbackh.setVisibility(8);
        feedbacka(false);
        feedbackb(true);
        setTitle(getResources().getString(R.string.feedback_app_name));
        this.feedbackc.setText(getResources().getString(R.string.no_network_connect_str));
        this.feedbackd.setText(getResources().getString(R.string.check_network_settings));
    }
}
