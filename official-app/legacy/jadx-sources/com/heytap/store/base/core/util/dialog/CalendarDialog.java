package com.heytap.store.base.core.util.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.heytap.store.base.core.R;
import com.heytap.store.base.core.util.DisplayUtil;
import com.heytap.store.base.core.util.statistics.StatisticsUtil;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes3.dex */
public class CalendarDialog extends Dialog {
    private boolean mCancelable;
    private OnOpenClick mOnOpenClick;

    public interface OnOpenClick {
        void click(View view);

        void close(View view);
    }

    public CalendarDialog(@NonNull Context context) {
        this(context, R.style.pf_core_base_dialog, true);
    }

    private void initView() {
        setContentView(R.layout.pf_core_base_dialog_calendar);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        ContextGetterUtils contextGetterUtils = ContextGetterUtils.INSTANCE;
        attributes.width = DisplayUtil.getScreenWidth(contextGetterUtils.getApp()) - (DisplayUtil.dip2px(contextGetterUtils.getApp(), 20.0f) * 2);
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        findViewById(R.id.dialog_close).setOnClickListener(new View.OnClickListener() { // from class: com.heytap.store.base.core.util.dialog.CalendarDialog.1
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                StatisticsUtil.calendarRemindClk("弹窗-签到日历提醒-取消", null);
                if (CalendarDialog.this.mOnOpenClick != null) {
                    CalendarDialog.this.mOnOpenClick.close(view);
                }
                CalendarDialog.this.dismiss();
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        });
        findViewById(R.id.notify_open).setOnClickListener(new View.OnClickListener() { // from class: com.heytap.store.base.core.util.dialog.CalendarDialog.2
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                if (CalendarDialog.this.mOnOpenClick != null) {
                    CalendarDialog.this.mOnOpenClick.click(view);
                }
                StatisticsUtil.calendarRemindClk("弹窗-签到日历提醒-去开启", null);
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        });
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void setOpenClick(OnOpenClick onOpenClick) {
        this.mOnOpenClick = onOpenClick;
    }

    public CalendarDialog(@NonNull Context context, int i, boolean z) {
        super(context, i);
        this.mCancelable = z;
    }
}
