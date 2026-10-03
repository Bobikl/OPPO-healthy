package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.heytap.device.R$id;
import com.heytap.device.R$layout;
import com.heytap.device.R$string;
import com.heytap.device.ui.weight.BodyFatScaleWifiSettingActivity;
import com.heytap.health.base.R$color;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.devicemanager.util.BluetoothUtil;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.log.formatter.LogFieldKey;
import com.lifesense.android.bluetooth.scale.enums.UnitType;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001f B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J \u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0003J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000eH\u0002J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0003J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0012H\u0002¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/brl;", "", "Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/tql;", "weightScaleDeviceInfo", "Lcom/oplus/aiunit/vision/brl$a;", "callback", "", "n", "Lcom/oplus/aiunit/vision/brl$b;", "unbindCallback", "q", LogFieldKey.LEVEL_KEY, "", "j", b2n.g, "id", "Lcom/lifesense/android/bluetooth/scale/enums/UnitType;", "unitType", b2n.f, "t", "tips", LogFieldKey.PROCESS_NAME_KEY, MapSchema.FIELD_NAME_KEY, t04.DEVICE_UNIQUE_ID, LogFieldKey.MESSAGE_KEY, "unit", "i", "<init>", "()V", "a", "b", "device_third_impl_release"}, k = 1, mv = {1, 8, 0})
public final class brl {

    @NotNull
    public static final brl INSTANCE = new brl();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/brl$a;", "", "", "unit", "", "onSuccess", "onFail", "device_third_impl_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void onFail();

        void onSuccess(@NotNull String unit);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/oplus/aiunit/vision/brl$b;", "", "", "onSuccess", "onFail", "device_third_impl_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        void onFail();

        void onSuccess();
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "result", "", "a", "(Z)V"}, k = 3, mv = {1, 8, 0})
    public static final class c<T> implements o14 {
        public final /* synthetic */ a i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Context f9832j;
        public final /* synthetic */ UnitType k;

        public c(a aVar, Context context, UnitType unitType) {
            this.i = aVar;
            this.f9832j = context;
            this.k = unitType;
        }

        public final void a(boolean z) {
            a7b.f("WeightScaleUtils", "changeUnit result:" + z);
            if (z) {
                this.i.onSuccess(brl.INSTANCE.i(this.f9832j, this.k));
            } else {
                this.i.onFail();
            }
        }

        @Override // com.oplus.aiunit.vision.o14
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            a(((Boolean) obj).booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class d<T> implements o14 {
        public final /* synthetic */ a i;

        public d(a aVar) {
            this.i = aVar;
        }

        @Override // com.oplus.aiunit.vision.o14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            a7b.b("WeightScaleUtils", "changeUnit fail " + throwable.getMessage());
            this.i.onFail();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/health/network/core/BaseResponse;", "Ljava/lang/Void;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "a", "(Lcom/heytap/health/network/core/BaseResponse;)V"}, k = 3, mv = {1, 8, 0})
    public static final class e<T> implements o14 {
        public final /* synthetic */ String i;

        public e(String str) {
            this.i = str;
        }

        @Override // com.oplus.aiunit.vision.o14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@Nullable BaseResponse<Void> baseResponse) {
            if (baseResponse != null) {
                if (baseResponse.isSuccess()) {
                    BluetoothUtil.INSTANCE.h(this.i);
                }
                a7b.f("WeightScaleUtils", "Save unbind weight scale result=" + baseResponse.getErrorCode());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class f<T> implements o14 {
        public static final f<T> INSTANCE = new f<>();

        @Override // com.oplus.aiunit.vision.o14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            a7b.f("WeightScaleUtils", "Save unbind weight scale fail=" + throwable);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "result", "", "a", "(Z)V"}, k = 3, mv = {1, 8, 0})
    public static final class g<T> implements o14 {
        public final /* synthetic */ Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ tql f9833j;
        public final /* synthetic */ b k;

        public g(Context context, tql tqlVar, b bVar) {
            this.i = context;
            this.f9833j = tqlVar;
            this.k = bVar;
        }

        public final void a(boolean z) {
            brl brlVar = brl.INSTANCE;
            brlVar.k(this.i);
            if (!z) {
                this.k.onFail();
                y0k.h(this.i.getString(R$string.device_unbind_fail_tips));
                return;
            }
            Intent intent = new Intent("com.op.smartwear.native.unbind.UNBIND_DEVICE");
            intent.putExtra("msg_bt_address", this.f9833j.d());
            LocalBroadcastManager.getInstance(b78.a()).sendBroadcast(intent);
            brlVar.m(this.f9833j.c());
            this.k.onSuccess();
        }

        @Override // com.oplus.aiunit.vision.o14
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            a(((Boolean) obj).booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class h<T> implements o14 {
        public final /* synthetic */ Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ b f9834j;

        public h(Context context, b bVar) {
            this.i = context;
            this.f9834j = bVar;
        }

        @Override // com.oplus.aiunit.vision.o14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            brl.INSTANCE.k(this.i);
            a7b.b("WeightScaleUtils", "unbind weight scale fail " + it.getMessage());
            this.f9834j.onFail();
            y0k.h(this.i.getString(R$string.device_unbind_fail_tips));
        }
    }

    public static final void o(AlertDialog alertDialog, Context context, tql weightScaleDeviceInfo, a callback, View view) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(weightScaleDeviceInfo, "$weightScaleDeviceInfo");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        alertDialog.dismiss();
        if (view.getId() == R$id.item_unit_kg) {
            brl brlVar = INSTANCE;
            String strC = weightScaleDeviceInfo.c();
            Intrinsics.checkNotNullExpressionValue(strC, "weightScaleDeviceInfo.id");
            brlVar.g(context, strC, UnitType.UNIT_KG, callback);
            return;
        }
        if (view.getId() == R$id.item_unit_jin) {
            brl brlVar2 = INSTANCE;
            String strC2 = weightScaleDeviceInfo.c();
            Intrinsics.checkNotNullExpressionValue(strC2, "weightScaleDeviceInfo.id");
            brlVar2.g(context, strC2, UnitType.UNIT_JIN, callback);
        }
    }

    public static final void r(Context context, tql weightScaleDeviceInfo, b unbindCallback, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(weightScaleDeviceInfo, "$weightScaleDeviceInfo");
        Intrinsics.checkNotNullParameter(unbindCallback, "$unbindCallback");
        dialogInterface.dismiss();
        INSTANCE.t(context, weightScaleDeviceInfo, unbindCallback);
    }

    public static final void s(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    @SuppressLint({"CheckResult"})
    public final void g(Context context, String id, UnitType unitType, a callback) {
        if (com.heytap.device.manager.a.a0().i0()) {
            com.heytap.device.manager.a.a0().Q0(id, unitType).s(f30.c()).w(new c(callback, context, unitType), new d(callback));
        } else {
            y0k.h(context.getString(R$string.device_weight_scale_not_connect));
        }
    }

    @NotNull
    public final String h(@NotNull Context context, @NotNull tql weightScaleDeviceInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(weightScaleDeviceInfo, "weightScaleDeviceInfo");
        UnitType unit = com.heytap.device.manager.a.a0().f0(weightScaleDeviceInfo.c());
        Intrinsics.checkNotNullExpressionValue(unit, "unit");
        return i(context, unit);
    }

    public final String i(Context context, UnitType unit) {
        String string = context.getString(unit == UnitType.UNIT_KG ? R$string.device_weight_unit_kg : R$string.device_weight_unit_jin);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(if (un…g.device_weight_unit_jin)");
        return string;
    }

    @Nullable
    public final String j(@NotNull tql weightScaleDeviceInfo) {
        Intrinsics.checkNotNullParameter(weightScaleDeviceInfo, "weightScaleDeviceInfo");
        return com.heytap.device.manager.a.a0().g0(weightScaleDeviceInfo.d());
    }

    public final void k(Context context) {
        if (context instanceof BaseActivity) {
            ((BaseActivity) context).d7();
        }
    }

    public final void l(@NotNull Context context, @NotNull tql weightScaleDeviceInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(weightScaleDeviceInfo, "weightScaleDeviceInfo");
        if (com.heytap.device.manager.a.a0().i0()) {
            BodyFatScaleWifiSettingActivity.r7(context, weightScaleDeviceInfo.d());
        } else {
            y0k.h(context.getString(R$string.device_bluetooth_disconnect));
        }
    }

    @SuppressLint({"CheckResult"})
    public final void m(String deviceUniqueId) {
        a7b.f("WeightScaleUtils", "Start save unbind weight device, id=" + gdb.a(deviceUniqueId));
        xql.f(deviceUniqueId).L0(su8.c()).b(new e(deviceUniqueId), f.INSTANCE);
    }

    public final void n(@NotNull final Context context, @NotNull final tql weightScaleDeviceInfo, @NotNull final a callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(weightScaleDeviceInfo, "weightScaleDeviceInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.device_weight_scale_unit_change, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(context).inflate(R.…_scale_unit_change, null)");
        CheckedTextView checkedTextView = (CheckedTextView) viewInflate.findViewById(R$id.item_unit_kg);
        CheckedTextView checkedTextView2 = (CheckedTextView) viewInflate.findViewById(R$id.item_unit_jin);
        UnitType unitTypeF0 = com.heytap.device.manager.a.a0().f0(weightScaleDeviceInfo.c());
        Intrinsics.checkNotNullExpressionValue(unitTypeF0, "get().getUnit(weightScaleDeviceInfo.id)");
        checkedTextView.setChecked(unitTypeF0 == UnitType.UNIT_KG);
        checkedTextView2.setChecked(unitTypeF0 == UnitType.UNIT_JIN);
        final AlertDialog alertDialogShow = new COUIAlertDialogBuilder(context).setTitle(com.heytap.health.device.third.R$string.device_change_unit).X(80).setView(viewInflate).setCancelable(true).show();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.oplus.aiunit.vision.yql
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                brl.o(alertDialogShow, context, weightScaleDeviceInfo, callback, view);
            }
        };
        checkedTextView.setOnClickListener(onClickListener);
        checkedTextView2.setOnClickListener(onClickListener);
    }

    public final void p(Context context, String tips) {
        if (context instanceof BaseActivity) {
            ((BaseActivity) context).j7(tips);
        }
    }

    public final void q(@NotNull final Context context, @NotNull final tql weightScaleDeviceInfo, @NotNull final b unbindCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(weightScaleDeviceInfo, "weightScaleDeviceInfo");
        Intrinsics.checkNotNullParameter(unbindCallback, "unbindCallback");
        TextView textView = new TextView(context);
        textView.setText(R$string.device_unbind_confirm_tips);
        textView.setTextColor(context.getColor(R$color.lib_base_colorBlack));
        textView.setGravity(17);
        textView.setPadding(0, 10, 0, 10);
        textView.setTextSize(14.0f);
        new COUIAlertDialogBuilder(context).setTitle(R$string.device_unbind_confirm_title).setView(textView).setPositiveButton(com.heytap.health.device.third.R$string.device_unbind, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.zql
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                brl.r(context, weightScaleDeviceInfo, unbindCallback, dialogInterface, i);
            }
        }).setNegativeButton(R$string.device_not_now, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.arl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                brl.s(dialogInterface, i);
            }
        }).setCancelable(true).show();
    }

    @SuppressLint({"CheckResult"})
    public final void t(Context context, tql weightScaleDeviceInfo, b unbindCallback) {
        String string = context.getString(R$string.device_doing_unbind);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.device_doing_unbind)");
        p(context, string);
        com.heytap.device.manager.a.a0().Y0(weightScaleDeviceInfo.c()).y(su8.c()).s(f30.c()).w(new g(context, weightScaleDeviceInfo, unbindCallback), new h(context, unbindCallback));
    }
}
