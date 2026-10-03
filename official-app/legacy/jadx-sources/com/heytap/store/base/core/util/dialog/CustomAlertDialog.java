package com.heytap.store.base.core.util.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoCmdId;
import com.heytap.nearx.uikit.widget.dialog.AlertDialog;
import com.heytap.store.base.core.R;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes3.dex */
public class CustomAlertDialog extends AlertDialog {
    public CustomAlertDialog(Context context, int i) {
        super(context, R.style.NXNearAlertDialogTheme1);
    }

    public static void resetPositiveBtnClickLsn(final AlertDialog alertDialog, final DialogInterface.OnClickListener onClickListener) {
        Button button;
        if (alertDialog == null || !alertDialog.isShowing() || onClickListener == null || (button = alertDialog.getButton(-1)) == null || button.getVisibility() != 0) {
            return;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.store.base.core.util.dialog.CustomAlertDialog.1
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                onClickListener.onClick(alertDialog, -1);
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        });
    }

    public static class CustomBuilder extends AlertDialog.Builder {
        private boolean mIsCancelTouchOutside;
        private boolean mIsHasTitle;
        private boolean mIsNeedShowSoftInput;
        private boolean mIsPositiveBtnDismiss;

        public CustomBuilder(Context context) {
            super(context);
            this.mIsNeedShowSoftInput = false;
            this.mIsCancelTouchOutside = false;
            this.mIsPositiveBtnDismiss = true;
            this.mIsHasTitle = false;
        }

        private AlertDialog resetDialog(AlertDialog alertDialog) {
            if (this.mIsNeedShowSoftInput) {
                alertDialog.getWindow().setSoftInputMode(UserInfoProto$UserInfoCmdId.CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE);
            }
            alertDialog.setCanceledOnTouchOutside(this.mIsCancelTouchOutside);
            return alertDialog;
        }

        @Override // com.heytap.nearx.uikit.widget.dialog.AlertDialog.Builder
        public AlertDialog create() {
            return resetDialog(super.create());
        }

        public AlertDialog.Builder setCanceledOnTouchOutside(boolean z) {
            this.mIsCancelTouchOutside = z;
            return this;
        }

        public AlertDialog.Builder setIsHasTitle(boolean z) {
            this.mIsHasTitle = z;
            return this;
        }

        public AlertDialog.Builder setIsShowSoftInput(boolean z) {
            this.mIsNeedShowSoftInput = z;
            return this;
        }

        @Override // com.heytap.nearx.uikit.widget.dialog.AlertDialog.Builder
        public AlertDialog.Builder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            return super.setPositiveButton(i, onClickListener);
        }

        @Override // com.heytap.nearx.uikit.widget.dialog.AlertDialog.Builder
        public AlertDialog.Builder setTitle(int i) {
            return this.mIsHasTitle ? super.setTitle(i) : super.setTitle((CharSequence) null);
        }

        @Override // com.heytap.nearx.uikit.widget.dialog.AlertDialog.Builder
        public AlertDialog.Builder setView(View view) {
            Resources resources = view.getResources();
            int i = R.dimen.dp_18;
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            Resources resources2 = view.getResources();
            int i2 = R.dimen.dp_1;
            return super.setView(view, dimensionPixelSize, resources2.getDimensionPixelSize(i2), view.getResources().getDimensionPixelSize(i), view.getResources().getDimensionPixelSize(i2));
        }

        @Override // com.heytap.nearx.uikit.widget.dialog.AlertDialog.Builder
        public AlertDialog.Builder setTitle(CharSequence charSequence) {
            if (this.mIsHasTitle) {
                return super.setTitle(charSequence);
            }
            return super.setTitle((CharSequence) null);
        }
    }
}
