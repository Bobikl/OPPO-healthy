package com.heytap.health.esim.nsc.dto;

import android.view.View;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.heytap.health.esim.R$id;
import com.heytap.health.esim.R$layout;
import com.heytap.health.esim.R$string;
import com.heytap.health.esim.nsc.utils.NSCHelper;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.sporthealth.blib.adapter.face.OnViewClickListener;
import com.heytap.sporthealth.blib.adapter.holder.JViewHolder;
import com.heytap.sporthealth.blib.adapter.vb.JViewBean;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0002\u0010\u0013J\b\u0010%\u001a\u00020\u0003H\u0016J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\t\u0010)\u001a\u00020\u0011HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u008b\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0005HÆ\u0001J\u0013\u00104\u001a\u00020\u00112\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020\u0003HÖ\u0001J6\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00032\u000e\u0010=\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010>2\f\u0010?\u001a\b\u0012\u0002\b\u0003\u0018\u00010@H\u0016J\t\u0010A\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006B"}, d2 = {"Lcom/heytap/health/esim/nsc/dto/OrderVB;", "Lcom/heytap/sporthealth/blib/adapter/vb/JViewBean;", "autoRenewal", "", "comboDesc", "", "comboName", "amount", "comboPrice", "comboSize", "orderId", "payChannel", "comboType", "expireTime", "", "paySuccessTime", "refunded", "", ServiceNodeBundleKeys.DEVICE_NAME, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIJJZLjava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getAutoRenewal", "()I", "getComboDesc", "getComboName", "getComboPrice", "getComboSize", "getComboType", "getDeviceName", "getExpireTime", "()J", "getOrderId", "getPayChannel", "getPaySuccessTime", "getRefunded", "()Z", "bindLayout", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "onBindViewHolder", "", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "Lcom/heytap/sporthealth/blib/adapter/holder/JViewHolder;", "position", "payloads", "", "viewClickListener", "Lcom/heytap/sporthealth/blib/adapter/face/OnViewClickListener;", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOrders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Orders.kt\ncom/heytap/health/esim/nsc/dto/OrderVB\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,81:1\n256#2,2:82\n256#2,2:84\n*S KotlinDebug\n*F\n+ 1 Orders.kt\ncom/heytap/health/esim/nsc/dto/OrderVB\n*L\n73#1:82,2\n75#1:84,2\n*E\n"})
public final /* data */ class OrderVB extends JViewBean {
    public static final int $stable = 0;

    @SerializedName("amount")
    @NotNull
    private final String amount;

    @SerializedName("autoRenewal")
    private final int autoRenewal;

    @SerializedName("comboDesc")
    @NotNull
    private final String comboDesc;

    @SerializedName("comboName")
    @NotNull
    private final String comboName;

    @SerializedName("comboPrice")
    @NotNull
    private final String comboPrice;

    @SerializedName("comboSize")
    private final int comboSize;

    @SerializedName("comboType")
    private final int comboType;

    @SerializedName(ServiceNodeBundleKeys.DEVICE_NAME)
    @NotNull
    private final String deviceName;

    @SerializedName("expireTime")
    private final long expireTime;

    @SerializedName("orderId")
    @NotNull
    private final String orderId;

    @SerializedName("payChannel")
    private final int payChannel;

    @SerializedName("paySuccessTime")
    private final long paySuccessTime;

    @SerializedName("refunded")
    private final boolean refunded;

    public OrderVB(int i, @NotNull String comboDesc, @NotNull String comboName, @NotNull String amount, @NotNull String comboPrice, int i2, @NotNull String orderId, int i3, int i4, long j2, long j3, boolean z, @NotNull String deviceName) {
        Intrinsics.checkNotNullParameter(comboDesc, "comboDesc");
        Intrinsics.checkNotNullParameter(comboName, "comboName");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(comboPrice, "comboPrice");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        this.autoRenewal = i;
        this.comboDesc = comboDesc;
        this.comboName = comboName;
        this.amount = amount;
        this.comboPrice = comboPrice;
        this.comboSize = i2;
        this.orderId = orderId;
        this.payChannel = i3;
        this.comboType = i4;
        this.expireTime = j2;
        this.paySuccessTime = j3;
        this.refunded = z;
        this.deviceName = deviceName;
    }

    @Override // com.heytap.sporthealth.blib.adapter.vb.JViewBean
    public int bindLayout() {
        return R$layout.esim_redtea_order_item;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAutoRenewal() {
        return this.autoRenewal;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getExpireTime() {
        return this.expireTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getPaySuccessTime() {
        return this.paySuccessTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getRefunded() {
        return this.refunded;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getComboDesc() {
        return this.comboDesc;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getComboName() {
        return this.comboName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getComboPrice() {
        return this.comboPrice;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getComboSize() {
        return this.comboSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getPayChannel() {
        return this.payChannel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getComboType() {
        return this.comboType;
    }

    @NotNull
    public final OrderVB copy(int autoRenewal, @NotNull String comboDesc, @NotNull String comboName, @NotNull String amount, @NotNull String comboPrice, int comboSize, @NotNull String orderId, int payChannel, int comboType, long expireTime, long paySuccessTime, boolean refunded, @NotNull String deviceName) {
        Intrinsics.checkNotNullParameter(comboDesc, "comboDesc");
        Intrinsics.checkNotNullParameter(comboName, "comboName");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(comboPrice, "comboPrice");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        return new OrderVB(autoRenewal, comboDesc, comboName, amount, comboPrice, comboSize, orderId, payChannel, comboType, expireTime, paySuccessTime, refunded, deviceName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderVB)) {
            return false;
        }
        OrderVB orderVB = (OrderVB) other;
        return this.autoRenewal == orderVB.autoRenewal && Intrinsics.areEqual(this.comboDesc, orderVB.comboDesc) && Intrinsics.areEqual(this.comboName, orderVB.comboName) && Intrinsics.areEqual(this.amount, orderVB.amount) && Intrinsics.areEqual(this.comboPrice, orderVB.comboPrice) && this.comboSize == orderVB.comboSize && Intrinsics.areEqual(this.orderId, orderVB.orderId) && this.payChannel == orderVB.payChannel && this.comboType == orderVB.comboType && this.expireTime == orderVB.expireTime && this.paySuccessTime == orderVB.paySuccessTime && this.refunded == orderVB.refunded && Intrinsics.areEqual(this.deviceName, orderVB.deviceName);
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    public final int getAutoRenewal() {
        return this.autoRenewal;
    }

    @NotNull
    public final String getComboDesc() {
        return this.comboDesc;
    }

    @NotNull
    public final String getComboName() {
        return this.comboName;
    }

    @NotNull
    public final String getComboPrice() {
        return this.comboPrice;
    }

    public final int getComboSize() {
        return this.comboSize;
    }

    public final int getComboType() {
        return this.comboType;
    }

    @NotNull
    public final String getDeviceName() {
        return this.deviceName;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    public final int getPayChannel() {
        return this.payChannel;
    }

    public final long getPaySuccessTime() {
        return this.paySuccessTime;
    }

    public final boolean getRefunded() {
        return this.refunded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((Integer.hashCode(this.autoRenewal) * 31) + this.comboDesc.hashCode()) * 31) + this.comboName.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.comboPrice.hashCode()) * 31) + Integer.hashCode(this.comboSize)) * 31) + this.orderId.hashCode()) * 31) + Integer.hashCode(this.payChannel)) * 31) + Integer.hashCode(this.comboType)) * 31) + Long.hashCode(this.expireTime)) * 31) + Long.hashCode(this.paySuccessTime)) * 31;
        boolean z = this.refunded;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + this.deviceName.hashCode();
    }

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvData
    public void onBindViewHolder(@NotNull JViewHolder holder, int position, @Nullable List<Object> payloads, @Nullable OnViewClickListener<?> viewClickListener) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.setClickable(false);
        JViewHolder text = holder.setText(R$id.esim_order_item_title, this.comboName);
        int i = R$id.esim_order_item_lose_time;
        NSCHelper nSCHelper = NSCHelper.INSTANCE;
        text.setText(i, nSCHelper.i(this.expireTime)).setText(R$id.esim_order_item_buy_time, nSCHelper.i(this.paySuccessTime)).setText(R$id.esim_order_item_pay, this.payChannel == 1 ? R$string.esim_redtea_pay_way_ali : R$string.esim_redtea_pay_way_wechat).setText(R$id.esim_order_item_order_id, this.orderId).setText(R$id.esim_order_item_device, this.deviceName).setText(R$id.esim_order_item_price, "￥" + this.amount);
        if (this.refunded) {
            View view = holder.getView(R$id.esim_combo_order_state);
            Intrinsics.checkNotNullExpressionValue(view, "holder.getView<View>(R.id.esim_combo_order_state)");
            view.setVisibility(0);
        } else {
            View view2 = holder.getView(R$id.esim_combo_order_state);
            Intrinsics.checkNotNullExpressionValue(view2, "holder.getView<View>(R.id.esim_combo_order_state)");
            view2.setVisibility(8);
        }
    }

    @NotNull
    public String toString() {
        return "OrderVB(autoRenewal=" + this.autoRenewal + ", comboDesc=" + this.comboDesc + ", comboName=" + this.comboName + ", amount=" + this.amount + ", comboPrice=" + this.comboPrice + ", comboSize=" + this.comboSize + ", orderId=" + this.orderId + ", payChannel=" + this.payChannel + ", comboType=" + this.comboType + ", expireTime=" + this.expireTime + ", paySuccessTime=" + this.paySuccessTime + ", refunded=" + this.refunded + ", deviceName=" + this.deviceName + ")";
    }
}
