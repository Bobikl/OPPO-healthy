package com.client.platform.opensdk.pay.download.dialog;

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
import com.client.platform.opensdk.pay.R;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes13.dex */
public class AtlasPayDialog extends Dialog {
    public static final int BUTTON_NEGATIVE = 2;
    public static final int BUTTON_POSITIVE = 1;
    private boolean mCancelable;
    private View mContentView;
    private Context mContext;
    private View mCustomView;
    private boolean mIsAutoDismiss;
    private String mMessage;
    private TextView mMessageTextView;
    private Button mNegativeButton;
    private OnClickListener mNegativeButtonListener;
    private String mNegativeButtonTitle;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private Button mPositiveButton;
    private OnClickListener mPositiveButtonListener;
    private String mPositiveButtonTitle;
    private Button mSingleButton;
    private OnClickListener mSingleButtonListener;
    private String mSingleButtonTitle;
    private String mTitle;
    private TextView mTitleTextView;

    public static class Builder {
        private DialogInterface.OnCancelListener cancelListener;
        private View customView;
        private Context mContext;
        private String message;
        private OnClickListener negativeButtonListener;
        private String negativeButtonTitle;
        private OnClickListener positiveButtonListener;
        private String positiveButtonTitle;
        private OnClickListener singleButtonListener;
        private String singleButtonTitle;
        private String title;
        private View view;
        private boolean cancelable = true;
        private boolean isAutoDismiss = true;

        public Builder(Context context) {
            this.mContext = context;
        }

        public AtlasPayDialog create() {
            return create(R.style.PayColorDialog, R.layout.pay_layout_dialog);
        }

        public Builder setCancelable(boolean z) {
            this.cancelable = z;
            return this;
        }

        public Builder setIsAutoDismiss(boolean z) {
            this.isAutoDismiss = z;
            return this;
        }

        public Builder setMessage(int i) {
            this.message = this.mContext.getString(i);
            return this;
        }

        public Builder setNegativeButton(int i, OnClickListener onClickListener) {
            return setNegativeButton(this.mContext.getString(i), onClickListener);
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.cancelListener = onCancelListener;
            return this;
        }

        public Builder setPositiveButton(int i, OnClickListener onClickListener) {
            return setPositiveButton(this.mContext.getString(i), onClickListener);
        }

        public Builder setSingleButton(int i, OnClickListener onClickListener) {
            return setSingleButton(this.mContext.getString(i), onClickListener);
        }

        public Builder setTitle(int i) {
            this.title = this.mContext.getString(i);
            return this;
        }

        public Builder setView(int i) {
            this.view = ((LayoutInflater) this.mContext.getSystemService("layout_inflater")).inflate(i, (ViewGroup) null);
            return this;
        }

        public AtlasPayDialog create(int i, int i2) {
            return TextUtils.isEmpty(this.singleButtonTitle) ? new AtlasPayDialog(this.mContext, this.title, this.message, this.positiveButtonTitle, this.positiveButtonListener, this.negativeButtonTitle, this.negativeButtonListener, this.view, this.customView, this.cancelable, this.cancelListener, this.isAutoDismiss, i, i2) : new AtlasPayDialog(this.mContext, this.title, this.message, this.singleButtonTitle, this.singleButtonListener, this.view, this.customView, this.cancelable, this.cancelListener, this.isAutoDismiss, i, i2);
        }

        public Builder setMessage(String str) {
            this.message = str;
            return this;
        }

        public Builder setNegativeButton(String str, OnClickListener onClickListener) {
            this.negativeButtonTitle = str;
            this.negativeButtonListener = onClickListener;
            return this;
        }

        public Builder setPositiveButton(String str, OnClickListener onClickListener) {
            this.positiveButtonTitle = str;
            this.positiveButtonListener = onClickListener;
            return this;
        }

        public Builder setSingleButton(String str, OnClickListener onClickListener) {
            this.singleButtonTitle = str;
            this.singleButtonListener = onClickListener;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setView(View view) {
            this.view = view;
            return this;
        }
    }

    public interface OnClickListener {
        void onClick(int i);
    }

    public AtlasPayDialog(Context context, String str, String str2, String str3, OnClickListener onClickListener, String str4, OnClickListener onClickListener2, View view, View view2, boolean z, DialogInterface.OnCancelListener onCancelListener, boolean z2, int i, int i2) {
        super(context, i);
        this.mContext = context;
        this.mTitle = str;
        this.mMessage = str2;
        this.mPositiveButtonTitle = str3;
        this.mPositiveButtonListener = onClickListener;
        this.mNegativeButtonTitle = str4;
        this.mNegativeButtonListener = onClickListener2;
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
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_dialog_title);
        this.mTitleTextView = textView;
        if (this.mTitle != null) {
            textView.setVisibility(0);
            this.mTitleTextView.setText(this.mTitle);
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_dialog_msg);
        this.mMessageTextView = textView2;
        if (this.mMessage != null) {
            textView2.setVisibility(0);
            this.mMessageTextView.setText(this.mMessage);
        }
        this.mSingleButton = (Button) viewInflate.findViewById(R.id.btn_dialog_one);
        this.mPositiveButton = (Button) viewInflate.findViewById(R.id.tv_dialog_btn_right);
        this.mNegativeButton = (Button) viewInflate.findViewById(R.id.tv_dialog_btn_left);
        if (TextUtils.isEmpty(this.mSingleButtonTitle)) {
            this.mSingleButton.setVisibility(8);
            findViewById(R.id.ll_dialog_two_btn).setVisibility(0);
            if (!TextUtils.isEmpty(this.mPositiveButtonTitle)) {
                this.mPositiveButton.setText(this.mPositiveButtonTitle);
                this.mPositiveButton.setOnClickListener(new View.OnClickListener() { // from class: com.client.platform.opensdk.pay.download.dialog.AtlasPayDialog.2
                    @Override // android.view.View.OnClickListener
                    @SensorsDataInstrumented
                    public void onClick(View view) {
                        if (AtlasPayDialog.this.mPositiveButtonListener != null) {
                            AtlasPayDialog.this.mPositiveButtonListener.onClick(1);
                        } else {
                            AtlasPayDialog.this.dismiss();
                        }
                        if (AtlasPayDialog.this.mIsAutoDismiss) {
                            AtlasPayDialog.this.dismiss();
                        }
                        SensorsDataAutoTrackHelper.trackViewOnClick(view);
                    }
                });
                this.mPositiveButton.setVisibility(0);
            }
            if (!TextUtils.isEmpty(this.mNegativeButtonTitle)) {
                this.mNegativeButton.setText(this.mNegativeButtonTitle);
                this.mNegativeButton.setOnClickListener(new View.OnClickListener() { // from class: com.client.platform.opensdk.pay.download.dialog.AtlasPayDialog.3
                    @Override // android.view.View.OnClickListener
                    @SensorsDataInstrumented
                    public void onClick(View view) {
                        if (AtlasPayDialog.this.mNegativeButtonListener != null) {
                            AtlasPayDialog.this.mNegativeButtonListener.onClick(2);
                        } else {
                            AtlasPayDialog.this.dismiss();
                        }
                        if (AtlasPayDialog.this.mIsAutoDismiss) {
                            AtlasPayDialog.this.dismiss();
                        }
                        SensorsDataAutoTrackHelper.trackViewOnClick(view);
                    }
                });
                this.mNegativeButton.setVisibility(0);
            }
        } else {
            this.mSingleButton.setVisibility(0);
            findViewById(R.id.ll_dialog_two_btn).setVisibility(8);
            this.mSingleButton.setText(this.mSingleButtonTitle);
            this.mSingleButton.setOnClickListener(new View.OnClickListener() { // from class: com.client.platform.opensdk.pay.download.dialog.AtlasPayDialog.1
                @Override // android.view.View.OnClickListener
                @SensorsDataInstrumented
                public void onClick(View view) {
                    if (AtlasPayDialog.this.mSingleButtonListener != null) {
                        AtlasPayDialog.this.mSingleButtonListener.onClick(0);
                    } else {
                        AtlasPayDialog.this.dismiss();
                    }
                    if (AtlasPayDialog.this.mIsAutoDismiss) {
                        AtlasPayDialog.this.dismiss();
                    }
                    SensorsDataAutoTrackHelper.trackViewOnClick(view);
                }
            });
        }
        if (this.mContentView != null) {
            ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(R.id.ll_dialog_container);
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

    public static AtlasPayDialog createOneBtnDialog(Context context, String str, String str2, OnClickListener onClickListener) {
        return new Builder(context).setTitle(str).setSingleButton(str2, onClickListener).setCancelable(false).create();
    }

    public static AtlasPayDialog createTwoBtnDialog(Context context, String str, String str2, String str3, OnClickListener onClickListener, OnClickListener onClickListener2) {
        return new Builder(context).setTitle(str).setCancelable(false).setNegativeButton(str2, onClickListener).setPositiveButton(str3, onClickListener2).create();
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

    public AtlasPayDialog(Context context, String str, String str2, String str3, OnClickListener onClickListener, View view, View view2, boolean z, DialogInterface.OnCancelListener onCancelListener, boolean z2, int i, int i2) {
        super(context, i);
        this.mContext = context;
        this.mTitle = str;
        this.mMessage = str2;
        this.mSingleButtonTitle = str3;
        this.mSingleButtonListener = onClickListener;
        this.mContentView = view;
        this.mCustomView = view2;
        this.mCancelable = z;
        this.mOnCancelListener = onCancelListener;
        this.mIsAutoDismiss = z2;
        create(context, i2);
    }
}
