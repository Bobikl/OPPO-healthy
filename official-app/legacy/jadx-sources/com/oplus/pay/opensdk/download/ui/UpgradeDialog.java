package com.oplus.pay.opensdk.download.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Keep;
import com.oplus.pay.opensdk.download.R$id;
import com.oplus.pay.opensdk.download.R$layout;
import com.oplus.pay.opensdk.download.R$style;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class UpgradeDialog extends Dialog {
    public static final int BUTTON_NEGATIVE = 2;
    public static final int BUTTON_POSITIVE = 1;
    private final boolean mCancelable;
    private final View mContentView;
    private final Context mContext;
    private final View mCustomView;
    private final boolean mIsAutoDismiss;
    private final String mMessage;
    private TextView mMessageTextView;
    private Button mNegativeButton;
    private b mNegativeButtonListener;
    private String mNegativeButtonTitle;
    private final DialogInterface.OnCancelListener mOnCancelListener;
    private Button mPositiveButton;
    private b mPositiveButtonListener;
    private String mPositiveButtonTitle;
    private b mSingleButtonListener;
    private String mSingleButtonTitle;
    private final String mTitle;
    private TextView mTitleTextView;

    public static class a {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20066c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f20067e;
        public boolean f = true;
        public boolean g = true;
        public b h;
        public b i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public b f20068j;
        public View k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public View f20069l;
        public DialogInterface.OnCancelListener m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Context f20070n;

        public a(Context context) {
            this.f20070n = context;
        }

        public UpgradeDialog a() {
            return b(R$style.PayColorDialog, R$layout.pay_layout_dialog);
        }

        public UpgradeDialog b(int i, int i2) {
            return TextUtils.isEmpty(this.f20067e) ? new UpgradeDialog(this.f20070n, this.a, this.b, this.f20066c, this.h, this.d, this.i, this.k, this.f20069l, this.f, this.m, this.g, i, i2) : new UpgradeDialog(this.f20070n, this.a, this.b, this.f20067e, this.f20068j, this.k, this.f20069l, this.f, this.m, this.g, i, i2);
        }

        public a c(boolean z) {
            this.f = z;
            return this;
        }

        public a d(String str, b bVar) {
            this.d = str;
            this.i = bVar;
            return this;
        }

        public a e(String str, b bVar) {
            this.f20066c = str;
            this.h = bVar;
            return this;
        }

        public a f(String str, b bVar) {
            this.f20067e = str;
            this.f20068j = bVar;
            return this;
        }

        public a g(String str) {
            this.a = str;
            return this;
        }
    }

    public interface b {
        void onClick(int i);
    }

    public UpgradeDialog(Context context, String str, String str2, String str3, b bVar, String str4, b bVar2, View view, View view2, boolean z, DialogInterface.OnCancelListener onCancelListener, boolean z2, int i, int i2) {
        super(context, i);
        this.mContext = context;
        this.mTitle = str;
        this.mMessage = str2;
        this.mPositiveButtonTitle = str3;
        this.mPositiveButtonListener = bVar;
        this.mNegativeButtonTitle = str4;
        this.mNegativeButtonListener = bVar2;
        this.mContentView = view;
        this.mCustomView = view2;
        this.mCancelable = z;
        this.mOnCancelListener = onCancelListener;
        this.mIsAutoDismiss = z2;
        create(context, i2);
    }

    private void create(Context context, int i) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(i, (ViewGroup) null);
        setContentView(viewInflate);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_dialog_title);
        this.mTitleTextView = textView;
        if (this.mTitle != null) {
            textView.setVisibility(0);
            this.mTitleTextView.setText(this.mTitle);
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.tv_dialog_msg);
        this.mMessageTextView = textView2;
        if (this.mMessage != null) {
            textView2.setVisibility(0);
            this.mMessageTextView.setText(this.mMessage);
        }
        Button button = (Button) viewInflate.findViewById(R$id.btn_dialog_one);
        this.mPositiveButton = (Button) viewInflate.findViewById(R$id.tv_dialog_btn_right);
        this.mNegativeButton = (Button) viewInflate.findViewById(R$id.tv_dialog_btn_left);
        if (TextUtils.isEmpty(this.mSingleButtonTitle)) {
            button.setVisibility(8);
            findViewById(R$id.ll_dialog_two_btn).setVisibility(0);
            if (!TextUtils.isEmpty(this.mPositiveButtonTitle)) {
                this.mPositiveButton.setText(this.mPositiveButtonTitle);
                this.mPositiveButton.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.zjk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.i.lambda$create$1(view);
                    }
                });
                this.mPositiveButton.setVisibility(0);
            }
            if (!TextUtils.isEmpty(this.mNegativeButtonTitle)) {
                this.mNegativeButton.setText(this.mNegativeButtonTitle);
                this.mNegativeButton.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.akk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.i.lambda$create$2(view);
                    }
                });
                this.mNegativeButton.setVisibility(0);
            }
        } else {
            button.setVisibility(0);
            findViewById(R$id.ll_dialog_two_btn).setVisibility(8);
            button.setText(this.mSingleButtonTitle);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.yjk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.i.lambda$create$0(view);
                }
            });
        }
        if (this.mContentView != null) {
            ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(R$id.ll_dialog_container);
            viewGroup.setVisibility(0);
            viewGroup.addView(this.mContentView);
        }
        DialogInterface.OnCancelListener onCancelListener = this.mOnCancelListener;
        if (onCancelListener != null) {
            setOnCancelListener(onCancelListener);
        }
        setCancelable(this.mCancelable);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = -2;
            attributes.width = dp2px(320);
            window.setAttributes(attributes);
            window.setDimAmount(0.4f);
        }
    }

    public static UpgradeDialog createOneBtnDialog(Context context, String str, String str2, b bVar) {
        return new a(context).g(str).f(str2, bVar).c(false).a();
    }

    public static UpgradeDialog createTwoBtnDialog(Context context, String str, String str2, String str3, b bVar, b bVar2) {
        return new a(context).g(str).c(false).d(str2, bVar).e(str3, bVar2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public /* synthetic */ void lambda$create$0(View view) {
        b bVar = this.mSingleButtonListener;
        if (bVar != null) {
            bVar.onClick(0);
        } else {
            dismiss();
        }
        if (this.mIsAutoDismiss) {
            dismiss();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public /* synthetic */ void lambda$create$1(View view) {
        b bVar = this.mPositiveButtonListener;
        if (bVar != null) {
            bVar.onClick(1);
        } else {
            dismiss();
        }
        if (this.mIsAutoDismiss) {
            dismiss();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public /* synthetic */ void lambda$create$2(View view) {
        b bVar = this.mNegativeButtonListener;
        if (bVar != null) {
            bVar.onClick(2);
        } else {
            dismiss();
        }
        if (this.mIsAutoDismiss) {
            dismiss();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    public int dp2px(int i) {
        return (int) ((i * this.mContext.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public Button getButton(int i) {
        if (i == 1) {
            return this.mPositiveButton;
        }
        if (i == 2) {
            return this.mNegativeButton;
        }
        throw new IllegalArgumentException("which is a wrong num");
    }

    public void setMessage(String str) {
        this.mMessageTextView.setVisibility(0);
        this.mMessageTextView.setText(str);
    }

    public void setTitle(String str) {
        this.mTitleTextView.setVisibility(0);
        this.mTitleTextView.setText(str);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        setTitle(getContext().getResources().getString(i));
    }

    public UpgradeDialog(Context context, String str, String str2, String str3, b bVar, View view, View view2, boolean z, DialogInterface.OnCancelListener onCancelListener, boolean z2, int i, int i2) {
        super(context, i);
        this.mContext = context;
        this.mTitle = str;
        this.mMessage = str2;
        this.mSingleButtonTitle = str3;
        this.mSingleButtonListener = bVar;
        this.mContentView = view;
        this.mCustomView = view2;
        this.mCancelable = z;
        this.mOnCancelListener = onCancelListener;
        this.mIsAutoDismiss = z2;
        create(context, i2);
    }
}
