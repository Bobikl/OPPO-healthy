package com.heytap.msp.sdk.common.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.heytap.msp.sdk.R$color;
import com.heytap.msp.sdk.R$drawable;
import com.heytap.msp.sdk.R$id;
import com.heytap.msp.sdk.R$layout;
import com.heytap.msp.sdk.R$string;
import com.heytap.msp.sdk.R$style;
import com.heytap.msp.sdk.common.utils.DownloadHelper;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes19.dex */
public class CommonDialog extends Dialog {
    private boolean isInstallInSupportBrand;
    private boolean isSingle;
    private Button mBtnCancel;
    private Button mBtnConfirm;
    private Button mBtnUpdateConfirm;
    private OnCallback mCallback;
    private String mContent;
    private String mNegative;
    private String mPositive;
    private String mTitle;
    private TextView mTvContent;
    private TextView mTvTitle;
    private String mUpdatePostive;
    private View mView;

    public CommonDialog(@NonNull Activity activity, String str, String str2, String str3, String str4, boolean z, OnCallback onCallback) {
        this(activity, str, str2, str3, str4, z, false, onCallback);
    }

    private void initView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.dialog_common, (ViewGroup) null);
        requestWindowFeature(1);
        setContentView(viewInflate);
        this.mTvTitle = (TextView) viewInflate.findViewById(R$id.tv_title);
        this.mTvContent = (TextView) viewInflate.findViewById(R$id.tv_content);
        this.mBtnConfirm = (Button) viewInflate.findViewById(R$id.btn_confirm);
        this.mBtnCancel = (Button) viewInflate.findViewById(R$id.btn_cancel);
        this.mBtnUpdateConfirm = (Button) viewInflate.findViewById(R$id.btn_update_confirm);
        if (this.isSingle) {
            this.mBtnCancel.setVisibility(8);
        } else {
            this.mBtnCancel.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.mNegative)) {
            this.mBtnCancel.setText(this.mNegative);
        }
        this.mTvContent.setGravity(3);
        this.mBtnConfirm.setText(this.mPositive);
        if (this.isInstallInSupportBrand) {
            this.mBtnUpdateConfirm.setVisibility(0);
            this.mBtnUpdateConfirm.setText(this.mUpdatePostive);
            Button button = this.mBtnCancel;
            int i = R$color.green_64BD0B;
            button.setTextColor(ContextCompat.getColor(context, i));
            if (DownloadHelper.getCount() > 0) {
                this.mBtnConfirm.setTextColor(ContextCompat.getColor(context, i));
                this.mBtnConfirm.setBackground(context.getResources().getDrawable(R$drawable.download_item_corner_default));
                this.mBtnConfirm.setVisibility(0);
            } else {
                this.mBtnConfirm.setVisibility(8);
            }
        }
        if (TextUtils.isEmpty(this.mTitle)) {
            this.mTvTitle.setVisibility(8);
        } else {
            this.mTvTitle.setText(this.mTitle);
        }
        if (TextUtils.isEmpty(this.mContent)) {
            this.mTvContent.setVisibility(8);
        } else {
            this.mTvContent.setText(this.mContent);
        }
        this.mBtnConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.msp.sdk.common.dialog.CommonDialog.1
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                if (CommonDialog.this.mCallback != null) {
                    CommonDialog.this.dismiss();
                    CommonDialog.this.mCallback.confirm();
                }
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        });
        this.mBtnCancel.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.msp.sdk.common.dialog.CommonDialog.2
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                if (CommonDialog.this.mCallback != null) {
                    CommonDialog.this.dismiss();
                    CommonDialog.this.mCallback.cancel();
                }
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        });
        this.mBtnUpdateConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.msp.sdk.common.dialog.CommonDialog.3
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                if (CommonDialog.this.mCallback != null) {
                    CommonDialog.this.dismiss();
                    CommonDialog.this.mCallback.updateConfirm();
                }
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        });
    }

    public CommonDialog(@NonNull Activity activity, String str, String str2, String str3, String str4, boolean z, boolean z2, OnCallback onCallback) {
        super(activity, R$style.custom_dialog);
        this.isSingle = false;
        this.isInstallInSupportBrand = false;
        setCancelable(false);
        this.mCallback = onCallback;
        this.mTitle = str;
        this.mContent = str2;
        this.isInstallInSupportBrand = z2;
        this.mPositive = z2 ? activity.getString(R$string.tx_msp_local_install) : str3;
        this.mUpdatePostive = activity.getString(DownloadHelper.getCount() > 0 ? R$string.tx_msp_store_install : R$string.tx_install);
        this.mNegative = str4;
        this.isSingle = z;
        initView(activity);
    }

    public CommonDialog(@NonNull Activity activity, String str, String str2, String str3, boolean z, OnCallback onCallback) {
        this(activity, str, str2, str3, "", z, false, onCallback);
    }
}
