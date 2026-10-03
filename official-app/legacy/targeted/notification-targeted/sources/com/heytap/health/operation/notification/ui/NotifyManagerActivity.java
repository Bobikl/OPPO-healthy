package com.heytap.health.operation.notification.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationManagerCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.base.R$id;
import com.heytap.health.base.R$string;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.operation.R$layout;
import com.heytap.health.operation.notification.NotifyItem;
import com.heytap.health.operation.notification.NotifyStateManager;
import com.heytap.health.operation.notification.helper.NotifyManagerConfigActivity;
import com.heytap.health.operation.notification.ui.NotifyManagerActivity;
import com.heytap.log.formatter.LogFieldKey;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Route(path = "/operation/NotifyManagerPage")
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002R\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\r¨\u0006("}, d2 = {"Lcom/heytap/health/operation/notification/ui/NotifyManagerActivity;", "Lcom/heytap/health/base/base/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "initView", "p7", "", "t7", "u7", LogFieldKey.MESSAGE_KEY, "Z", "mToOpenNotifyPermission", "Landroidx/recyclerview/widget/RecyclerView;", "n", "Landroidx/recyclerview/widget/RecyclerView;", "mNotifyList", "", "Lcom/heytap/health/operation/notification/NotifyItem;", "o", "Ljava/util/List;", "itemList", "Lcom/heytap/health/operation/notification/ui/NotifyItemAdapter;", LogFieldKey.PROCESS_NAME_KEY, "Lcom/heytap/health/operation/notification/ui/NotifyItemAdapter;", "o7", "()Lcom/heytap/health/operation/notification/ui/NotifyItemAdapter;", "v7", "(Lcom/heytap/health/operation/notification/ui/NotifyItemAdapter;)V", "notifyItemAdapter", "Lcom/heytap/health/operation/notification/NotifyStateManager;", "q", "Lcom/heytap/health/operation/notification/NotifyStateManager;", "notifyStateManager", "r", "isFirstResume", "<init>", "()V", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class NotifyManagerActivity extends BaseActivity {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean mToOpenNotifyPermission;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public RecyclerView mNotifyList;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public List<NotifyItem> itemList;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public NotifyItemAdapter notifyItemAdapter;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public NotifyStateManager notifyStateManager;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean isFirstResume = true;

    public static final void q7(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    public static final void r7(NotifyManagerActivity this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mToOpenNotifyPermission = true;
        this$0.u7();
        dialogInterface.dismiss();
    }

    public static final void s7(NotifyManagerActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.p7();
    }

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public final void initView() {
        COUIToolbar cOUIToolbar = (COUIToolbar) findViewById(R$id.lib_base_toolbar);
        this.i = cOUIToolbar;
        cOUIToolbar.setTitle(R$string.settings_app_permanent_notify_setting);
        f7(this.i, true);
        ((ConstraintLayout) findViewById(com.heytap.health.operation.R$id.constraint_plugin)).setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ryc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotifyManagerActivity.s7(this.i, view);
            }
        });
        this.mNotifyList = (RecyclerView) findViewById(com.heytap.health.operation.R$id.notify_list);
        NotifyStateManager notifyStateManager = this.notifyStateManager;
        if (notifyStateManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notifyStateManager");
            notifyStateManager = null;
        }
        v7(new NotifyItemAdapter(this, notifyStateManager));
        RecyclerView recyclerView = this.mNotifyList;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
        RecyclerView recyclerView2 = this.mNotifyList;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(o7());
        }
        this.itemList = o7().e();
    }

    @NotNull
    public final NotifyItemAdapter o7() {
        NotifyItemAdapter notifyItemAdapter = this.notifyItemAdapter;
        if (notifyItemAdapter != null) {
            return notifyItemAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notifyItemAdapter");
        return null;
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.activity_notify_manager);
        this.notifyStateManager = new NotifyStateManager(this);
        initView();
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        NotifyItemAdapter notifyItemAdapterO7;
        super.onResume();
        if (!this.isFirstResume && (notifyItemAdapterO7 = o7()) != null) {
            notifyItemAdapterO7.refresh();
        }
        this.isFirstResume = false;
    }

    public final void p7() {
        if (t7()) {
            NotifyManagerConfigActivity.l7();
        } else {
            new COUIAlertDialogBuilder(this).setTitle(com.heytap.health.operation.R$string.sports_notify_need_notify_permission).setMessage(com.heytap.health.operation.R$string.sports_notify_need_notify_permission_desc).setNegativeButton(com.heytap.health.operation.R$string.sports_notify_need_notify_permission_notopen, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.syc
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    NotifyManagerActivity.q7(dialogInterface, i);
                }
            }).setPositiveButton(com.heytap.health.operation.R$string.sports_notify_need_notify_permission_toopen, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.tyc
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    NotifyManagerActivity.r7(this.i, dialogInterface, i);
                }
            }).show();
        }
    }

    public final boolean t7() {
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(this);
        Intrinsics.checkNotNullExpressionValue(notificationManagerCompatFrom, "from(this)");
        return notificationManagerCompatFrom.areNotificationsEnabled();
    }

    public final void u7() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", getPackageName());
        intent.setFlags(268435456);
        startActivity(intent);
    }

    public final void v7(@NotNull NotifyItemAdapter notifyItemAdapter) {
        Intrinsics.checkNotNullParameter(notifyItemAdapter, "<set-?>");
        this.notifyItemAdapter = notifyItemAdapter;
    }
}
