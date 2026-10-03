package com.heytap.health.device.tab.itemview.wearable;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.heytap.health.base.base.BaseApplication;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.device.tab.controller.DeviceTabAdapterController;
import com.heytap.health.device.tab.itemview.base.BaseDeviceTabItem;
import com.heytap.health.device.tab.itemview.wearable.DeviceInfoItem;
import com.heytap.health.device.third.bgp.IBpgService;
import com.heytap.health.device_pair.view.IWatchViewService;
import com.heytap.health.device_settings.impl.R$dimen;
import com.heytap.health.device_settings.impl.R$drawable;
import com.heytap.health.device_settings.impl.R$id;
import com.heytap.health.device_settings.impl.R$layout;
import com.heytap.health.device_settings.impl.R$string;
import com.heytap.health.manager.SkuHelper;
import com.heytap.health.vision.deviceability.DeviceInfo;
import com.heytap.health.vision.deviceability.DeviceModel;
import com.heytap.health.vision.processor.bean.UserDeviceInfo;
import com.heytap.health.watchpair.view.WatchView;
import com.heytap.sporthealth.blib.weiget.BatteryIconViewKt;
import com.heytap.store.platform.videoplayer.base.BuildConfig;
import com.oplus.aiunit.model.d21;
import com.oplus.aiunit.model.f0a;
import com.oplus.aiunit.model.fu6;
import com.oplus.aiunit.model.g8h;
import com.oplus.aiunit.model.gd5;
import com.oplus.aiunit.model.god;
import com.oplus.aiunit.model.i37;
import com.oplus.aiunit.model.mb5;
import com.oplus.aiunit.model.n04;
import com.oplus.aiunit.model.qml;
import com.oplus.aiunit.model.qul;
import com.oplus.aiunit.model.vnf;
import com.oplus.aiunit.model.w32;
import com.oplus.aiunit.model.wl4;
import com.oplus.aiunit.model.zqb;
import com.oplus.aiunit.model.zxa;
import com.oplus.aiunit.vision.c4l;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.f8h;
import com.oplus.aiunit.vision.fn2;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.jtf;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.pb5;
import com.oplus.aiunit.vision.qmg;
import com.oplus.aiunit.vision.veb;
import com.oplus.aiunit.vision.xmk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003B\u0013\u0012\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0014\u0010\t\u001a\u00020\u00022\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\f\u0010\u0018\u001a\u00020\u0002*\u00020\u0017H\u0002J\f\u0010\u0019\u001a\u00020\u0002*\u00020\u0017H\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014J\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\u0002H\u0016J\b\u0010#\u001a\u00020\"H\u0016J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020$H\u0016J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0017H\u0014J\u0017\u0010)\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*J\u0006\u0010+\u001a\u00020\u0002J\u0006\u0010,\u001a\u00020\u0002J\u0006\u0010-\u001a\u00020\u0002J\b\u0010.\u001a\u00020\u0002H\u0016J\b\u0010/\u001a\u00020\u0002H\u0016J\u001c\u00101\u001a\u00020\u00022\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016R>\u0010:\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c02j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c`38\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0017\u0010?\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010B\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010>R\u0018\u0010D\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010<R\u0016\u0010P\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010<R\u0014\u0010T\u001a\u00020Q8\u0002X\u0082D¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020Q8\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010SR\u0014\u0010V\u001a\u00020Q8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010SR\u0016\u0010X\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010<R\u0016\u0010Z\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010<R\u0016\u0010\\\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010<R\u0016\u0010]\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010\u001fR\u0016\u0010a\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010e\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010g\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010fR\u0016\u0010h\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010fR\u0016\u0010l\u001a\u00020i8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010n\u001a\u00020i8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bm\u0010kR\u0016\u0010p\u001a\u00020i8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bo\u0010kR\u0016\u0010r\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bq\u0010dR\u0016\u0010t\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bs\u0010fR\u0016\u0010v\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bu\u0010dR\u0016\u0010x\u001a\u00020i8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bw\u0010kR\u0016\u0010{\u001a\u00020y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010zR\u0016\u0010|\u001a\u00020i8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010kR\u0017\u0010\u0080\u0001\u001a\u00020}8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0082\u0001\u001a\u00020i8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010kR\u0018\u0010\u0084\u0001\u001a\u00020i8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010kR\u0018\u0010\u0086\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010f¨\u0006\u008b\u0001"}, d2 = {"Lcom/heytap/health/device/tab/itemview/wearable/DeviceInfoItem;", "Lcom/heytap/health/device/tab/itemview/base/BaseDeviceTabItem;", BuildConfig.VERSION_NAME, "Landroidx/lifecycle/Observer;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "Lcom/oplus/aiunit/vision/g8h;", "Lcom/oplus/aiunit/vision/d21;", "device", "j1", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "k1", "data", "h1", "deviceInfo", "Y0", "faceBeanWrapper", "a1", "R0", "S0", "X0", "i1", "Z0", "Landroid/view/View;", "c1", "N0", "Lcom/oplus/aiunit/vision/fu6;", i37.FAMILY_KEY_FRIEND_INVITE_TYPE, BuildConfig.VERSION_NAME, "B", "Lcom/oplus/aiunit/vision/vnf;", "Z", "l", "b0", "Landroid/graphics/Rect;", "S", BuildConfig.VERSION_NAME, "R", "u", "itemView", "A", "O0", "(Lkotlin/Unit;)V", "g1", "d1", "f1", "z0", "y0", "value", "V0", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "r", "Ljava/util/HashMap;", "getFirstLaunchMap", "()Ljava/util/HashMap;", "setFirstLaunchMap", "(Ljava/util/HashMap;)V", "firstLaunchMap", "s", "I", "getPadding_startend", "()I", "padding_startend", "t", "getDp12", "dp12", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "mCurrentUserDeviceInfo", BuildConfig.VERSION_NAME, "v", "J", "mUpdateBatteryTimeStamp", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "w", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "scrollListener", "x", "originalPreviewHeight", "y", "originalPreviewWidth", BuildConfig.VERSION_NAME, "z", "F", "maxHeightReduceDp", "maxAlphaReduce", "hideScrollDistanceDp", "C", "maxHeightReduce", "D", "hideScrollDistance", "E", "totalScrollDistance", "showIwatchTips", "Lcom/heytap/health/watchpair/view/WatchView;", "G", "Lcom/heytap/health/watchpair/view/WatchView;", "mWatchView", "Landroid/widget/ImageView;", "H", "Landroid/widget/ImageView;", "mThirdImg", "Landroid/view/View;", "mCurrImg", "mGroupWearable", "Landroid/widget/TextView;", "K", "Landroid/widget/TextView;", "mTvStatue", "L", "mTvThirdStatue", "M", "mTvName", "N", "mIvDeviceExpand", "O", "mLayoutDeviceName", "P", "mIvPoint", "Q", "mTvReconnect", "Lcom/airbnb/lottie/LottieAnimationView;", "Lcom/airbnb/lottie/LottieAnimationView;", "mLottieAnimationView", "mTvBattery", "Landroidx/compose/ui/platform/ComposeView;", "T", "Landroidx/compose/ui/platform/ComposeView;", "mHorizBatteryView", "U", "mTvTip", "V", "mTvStateErrorTip", "W", "mViewDivider", "Lcom/heytap/health/device/tab/controller/DeviceTabAdapterController;", "controller", "<init>", "(Lcom/heytap/health/device/tab/controller/DeviceTabAdapterController;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeviceInfoItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoItem.kt\ncom/heytap/health/device/tab/itemview/wearable/DeviceInfoItem\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,738:1\n296#2:739\n298#2,2:740\n296#2:742\n298#2,2:743\n*S KotlinDebug\n*F\n+ 1 DeviceInfoItem.kt\ncom/heytap/health/device/tab/itemview/wearable/DeviceInfoItem\n*L\n728#1:739\n729#1:740,2\n734#1:742\n735#1:743,2\n*E\n"})
public final class DeviceInfoItem extends BaseDeviceTabItem<Unit> implements Observer<Map<String, g8h>> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public final float maxAlphaReduce;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public final float hideScrollDistanceDp;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public int maxHeightReduce;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public int hideScrollDistance;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public int totalScrollDistance;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public boolean showIwatchTips;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public WatchView mWatchView;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ImageView mThirdImg;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    public View mCurrImg;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public View mGroupWearable;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public TextView mTvStatue;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public TextView mTvThirdStatue;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public TextView mTvName;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ImageView mIvDeviceExpand;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public View mLayoutDeviceName;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ImageView mIvPoint;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public TextView mTvReconnect;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public LottieAnimationView mLottieAnimationView;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public TextView mTvBattery;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public ComposeView mHorizBatteryView;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public TextView mTvTip;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public TextView mTvStateErrorTip;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public View mViewDivider;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public HashMap<String, Boolean> firstLaunchMap;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final int padding_startend;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final int dp12;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public UserDeviceInfo mCurrentUserDeviceInfo;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public long mUpdateBatteryTimeStamp;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public RecyclerView.OnScrollListener scrollListener;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public int originalPreviewHeight;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public int originalPreviewWidth;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public final float maxHeightReduceDp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceInfoItem(@NotNull DeviceTabAdapterController deviceTabAdapterController) {
        super("DeviceInfoItem", deviceTabAdapterController);
        Intrinsics.checkNotNullParameter(deviceTabAdapterController, "controller");
        this.firstLaunchMap = new HashMap<>();
        this.padding_startend = e88.a().getResources().getDimensionPixelOffset(R$dimen.device_start_end_padding);
        this.dp12 = qmg.a(r(), 12.0f);
        this.maxHeightReduceDp = 100.0f;
        this.maxAlphaReduce = 0.5f;
        this.hideScrollDistanceDp = 100.0f;
    }

    public static final void P0(DeviceInfoItem deviceInfoItem) {
        Intrinsics.checkNotNullParameter(deviceInfoItem, "this$0");
        View view = deviceInfoItem.mCurrImg;
        if (view != null) {
            deviceInfoItem.originalPreviewHeight = view.getHeight();
            int width = view.getWidth();
            deviceInfoItem.originalPreviewWidth = width;
            view.setPivotX(width / 2.0f);
            view.setPivotY(deviceInfoItem.originalPreviewHeight);
        }
    }

    public static final void Q0(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "$block");
        function0.invoke();
    }

    public static final void T0(DeviceInfoItem deviceInfoItem, View view) {
        Intrinsics.checkNotNullParameter(deviceInfoItem, "this$0");
        String string = deviceInfoItem.r().getString(R$string.settings_device_linked_state);
        TextView textView = deviceInfoItem.mTvStatue;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvStatue");
            textView = null;
        }
        if (string.equals(textView.getText())) {
            deviceInfoItem.getMTag();
            return;
        }
        UserDeviceInfo userDeviceInfoN0 = deviceInfoItem.n0();
        if (userDeviceInfoN0 == null) {
            m8b.b(deviceInfoItem.getMTag(), "reconnect not select wearable device");
            return;
        }
        userDeviceInfoN0.setConnectionState(101);
        deviceInfoItem.T();
        xmk.b(2, 1);
        if (deviceInfoItem.s() instanceof DeviceTabAdapterController) {
            ((DeviceTabAdapterController) deviceInfoItem.s()).o0(userDeviceInfoN0, "DeviceInfoItem");
        }
    }

    public static final void U0(DeviceInfoItem deviceInfoItem, View view) {
        Intrinsics.checkNotNullParameter(deviceInfoItem, "this$0");
        if (deviceInfoItem.s().c()) {
            deviceInfoItem.s().i(deviceInfoItem.r());
        }
    }

    public static final void W0() {
        wl4.businessApi.requestDeviceBattery(wl4.managerApi.q(mb5.a.INSTANCE));
    }

    public static final void b1(Ref.ObjectRef objectRef, DeviceInfoItem deviceInfoItem) {
        Intrinsics.checkNotNullParameter(objectRef, "$firstWF");
        Intrinsics.checkNotNullParameter(deviceInfoItem, "this$0");
        WatchView watchView = null;
        if (((CharSequence) objectRef.element).length() == 0) {
            WatchView watchView2 = deviceInfoItem.mWatchView;
            if (watchView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWatchView");
            } else {
                watchView = watchView2;
            }
            watchView.J();
            return;
        }
        FragmentActivity activity = deviceInfoItem.s().getActivity();
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            WatchView watchView3 = deviceInfoItem.mWatchView;
            if (watchView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWatchView");
                watchView3 = null;
            }
            if (watchView3.getFaceView().isAttachedToWindow()) {
                WatchView watchView4 = deviceInfoItem.mWatchView;
                if (watchView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mWatchView");
                    watchView4 = null;
                }
                jtf jtfVarQ = com.bumptech.glide.a.w(watchView4.getFaceView()).q((String) objectRef.element);
                WatchView watchView5 = deviceInfoItem.mWatchView;
                if (watchView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mWatchView");
                } else {
                    watchView = watchView5;
                }
                jtfVarQ.Q0(watchView.getFaceView());
                return;
            }
        }
        m8b.m(deviceInfoItem.getMTag(), "skip load watch face, activity invalid or faceView detached");
    }

    public static final void e1(DeviceInfoItem deviceInfoItem) {
        Intrinsics.checkNotNullParameter(deviceInfoItem, "this$0");
        LottieAnimationView lottieAnimationView = deviceInfoItem.mLottieAnimationView;
        if (lottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLottieAnimationView");
            lottieAnimationView = null;
        }
        lottieAnimationView.playAnimation();
    }

    public static final void l1(View view) {
        god.c().a(Uri.parse("healthap://app/path=113?extra_launch_type=7&jumpUrl=general-single-page/index.html#/?code=ijnuda&showNav=1"), null);
    }

    @Override // com.heytap.health.device.flexadapter.a
    public void A(@NotNull View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.group_device_wearable);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.group_device_wearable)");
        this.mGroupWearable = viewFindViewById;
        WatchView watchViewFindViewById = itemView.findViewById(R$id.watch_view);
        Intrinsics.checkNotNullExpressionValue(watchViewFindViewById, "itemView.findViewById(R.id.watch_view)");
        this.mWatchView = watchViewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.third_device_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(R.id.third_device_img)");
        this.mThirdImg = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.layout_device_tip_device_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "itemView.findViewById(R.…t_device_tip_device_name)");
        this.mLayoutDeviceName = viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.tv_device_tip_device_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "itemView.findViewById(R.…v_device_tip_device_name)");
        this.mTvName = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.iv_device_tip_device_expand);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "itemView.findViewById(R.…device_tip_device_expand)");
        this.mIvDeviceExpand = (ImageView) viewFindViewById5;
        TextView textView = this.mTvName;
        View view = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvName");
            textView = null;
        }
        if0.G(textView, false);
        View viewFindViewById6 = itemView.findViewById(R$id.iv_device_tip_point);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "itemView.findViewById(R.id.iv_device_tip_point)");
        this.mIvPoint = (ImageView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.tv_device_tip_mode);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "itemView.findViewById(R.id.tv_device_tip_mode)");
        this.mTvStatue = (TextView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.tv_third_device_tip_mode);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "itemView.findViewById(R.…tv_third_device_tip_mode)");
        this.mTvThirdStatue = (TextView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.tv_device_reconnect);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "itemView.findViewById(R.id.tv_device_reconnect)");
        this.mTvReconnect = (TextView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.tv_device_tip_battery);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "itemView.findViewById(R.id.tv_device_tip_battery)");
        this.mTvBattery = (TextView) viewFindViewById10;
        ComposeView composeViewFindViewById = itemView.findViewById(R$id.iv_device_battery);
        Intrinsics.checkNotNullExpressionValue(composeViewFindViewById, "itemView.findViewById(R.id.iv_device_battery)");
        this.mHorizBatteryView = composeViewFindViewById;
        LottieAnimationView lottieAnimationViewFindViewById = itemView.findViewById(R$id.lottie_view);
        Intrinsics.checkNotNullExpressionValue(lottieAnimationViewFindViewById, "itemView.findViewById(R.id.lottie_view)");
        this.mLottieAnimationView = lottieAnimationViewFindViewById;
        View viewFindViewById11 = itemView.findViewById(R$id.view_divider_connect);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "itemView.findViewById(R.id.view_divider_connect)");
        this.mViewDivider = viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(R$id.tv_device_tip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "itemView.findViewById(R.id.tv_device_tip)");
        this.mTvTip = (TextView) viewFindViewById12;
        View viewFindViewById13 = itemView.findViewById(R$id.tv_state_error_tip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "itemView.findViewById(R.id.tv_state_error_tip)");
        this.mTvStateErrorTip = (TextView) viewFindViewById13;
        TextView textView2 = this.mTvReconnect;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvReconnect");
            textView2 = null;
        }
        fn2.b(textView2);
        TextView textView3 = this.mTvReconnect;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvReconnect");
            textView3 = null;
        }
        c4l.a(textView3, new View.OnClickListener() { // from class: com.oplus.aiunit.vision.si5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DeviceInfoItem.T0(this.i, view2);
            }
        });
        View view2 = this.mLayoutDeviceName;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutDeviceName");
        } else {
            view = view2;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ti5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                DeviceInfoItem.U0(this.i, view3);
            }
        });
        R0();
        S0();
    }

    @Override // com.heytap.health.device.flexadapter.a
    public boolean B(@NotNull fu6 type) {
        Intrinsics.checkNotNullParameter(type, i37.FAMILY_KEY_FRIEND_INVITE_TYPE);
        return !s0();
    }

    public final void N0(View view) {
        if (view.getVisibility() == 8) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.heytap.health.device.flexadapter.a
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public void z(@NotNull Unit data) {
        MutableLiveData<Map<String, g8h>> mutableLiveDataH0;
        MutableLiveData<Map<String, g8h>> mutableLiveDataH1;
        Intrinsics.checkNotNullParameter(data, "data");
        final d21<?> d21VarM0 = m0();
        if (d21VarM0 == null) {
            m8b.b(getMTag(), "init data not select device");
            return;
        }
        final DeviceWatchFaceItem deviceWatchFaceItem = (DeviceWatchFaceItem) s().l(DeviceWatchFaceItem.class);
        if (deviceWatchFaceItem == null) {
            m8b.b(getMTag(), "not find DeviceWatchFaceItem");
        }
        WatchView watchView = null;
        if (s().c()) {
            ImageView imageView = this.mIvDeviceExpand;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvDeviceExpand");
                imageView = null;
            }
            c1(imageView);
        } else {
            ImageView imageView2 = this.mIvDeviceExpand;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvDeviceExpand");
                imageView2 = null;
            }
            N0(imageView2);
        }
        if (d21VarM0 instanceof qml) {
            ImageView imageView3 = this.mThirdImg;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mThirdImg");
                imageView3 = null;
            }
            N0(imageView3);
            TextView textView = this.mTvThirdStatue;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvThirdStatue");
                textView = null;
            }
            N0(textView);
            View view = this.mGroupWearable;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGroupWearable");
                view = null;
            }
            c1(view);
            View view2 = this.mWatchView;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWatchView");
                view2 = null;
            }
            c1(view2);
            View view3 = this.mWatchView;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWatchView");
                view3 = null;
            }
            this.mCurrImg = view3;
            final UserDeviceInfo userDeviceInfoD = ((qml) d21VarM0).d();
            WatchView watchView2 = this.mWatchView;
            if (watchView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWatchView");
                watchView2 = null;
            }
            watchView2.setAutoDownloadRes(true);
            final Function0<Object> function0 = new Function0<Object>() { // from class: com.heytap.health.device.tab.itemview.wearable.DeviceInfoItem$initData$1$block$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Nullable
                public final Object invoke() {
                    MutableLiveData<Map<String, g8h>> mutableLiveDataH2;
                    Map map;
                    g8h g8hVar;
                    WatchView watchView3 = null;
                    if (this.this$0.h0(userDeviceInfoD)) {
                        Object objNavigation = e1.d().b("/device_pair/IWatchViewService").navigation();
                        IWatchViewService iWatchViewService = objNavigation instanceof IWatchViewService ? (IWatchViewService) objNavigation : null;
                        if (iWatchViewService == null) {
                            return null;
                        }
                        WatchView watchView4 = this.this$0.mWatchView;
                        if (watchView4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mWatchView");
                        } else {
                            watchView3 = watchView4;
                        }
                        iWatchViewService.Y8(watchView3, userDeviceInfoD);
                        return Unit.INSTANCE;
                    }
                    if (userDeviceInfoD.isSecondary()) {
                        WatchView watchView5 = this.this$0.mWatchView;
                        if (watchView5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mWatchView");
                        } else {
                            watchView3 = watchView5;
                        }
                        watchView3.getFaceView().setImageResource(R$drawable.device_settings_second_wf);
                        return Unit.INSTANCE;
                    }
                    DeviceWatchFaceItem deviceWatchFaceItem2 = deviceWatchFaceItem;
                    if (deviceWatchFaceItem2 != null && (mutableLiveDataH2 = deviceWatchFaceItem2.H0()) != null && (map = (Map) mutableLiveDataH2.getValue()) != null && (g8hVar = (g8h) map.get(d21VarM0.getCurrDeviceMac())) != null) {
                        this.this$0.a1(g8hVar);
                        return g8hVar;
                    }
                    WatchView watchView6 = this.this$0.mWatchView;
                    if (watchView6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mWatchView");
                    } else {
                        watchView3 = watchView6;
                    }
                    watchView3.J();
                    return Unit.INSTANCE;
                }
            };
            WatchView watchView3 = this.mWatchView;
            if (watchView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWatchView");
                watchView3 = null;
            }
            watchView3.setResDownloadUpdateCallback(new Runnable() { // from class: com.oplus.aiunit.vision.vi5
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceInfoItem.Q0(function0);
                }
            });
            WatchView watchView4 = this.mWatchView;
            if (watchView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWatchView");
                watchView4 = null;
            }
            watchView4.L(userDeviceInfoD.getMac(), userDeviceInfoD.getModel());
            Boolean bool = this.firstLaunchMap.get(userDeviceInfoD.getMac());
            if (bool == null || Intrinsics.areEqual(bool, Boolean.TRUE)) {
                WatchView watchView5 = this.mWatchView;
                if (watchView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mWatchView");
                } else {
                    watchView = watchView5;
                }
                watchView.t((String) SkuHelper.b().get(userDeviceInfoD.getMac()), true, userDeviceInfoD.getSkuCode(), userDeviceInfoD.getDeviceType());
            }
            HashMap<String, Boolean> map = this.firstLaunchMap;
            String mac = userDeviceInfoD.getMac();
            Intrinsics.checkNotNullExpressionValue(mac, "userDeviceInfo.mac");
            map.put(mac, Boolean.FALSE);
            k1(userDeviceInfoD);
            if (deviceWatchFaceItem != null && (mutableLiveDataH1 = deviceWatchFaceItem.H0()) != null) {
                mutableLiveDataH1.observe(s().getActivity(), this);
            }
        } else {
            ImageView imageView4 = this.mThirdImg;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mThirdImg");
                imageView4 = null;
            }
            c1(imageView4);
            TextView textView2 = this.mTvThirdStatue;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvThirdStatue");
                textView2 = null;
            }
            c1(textView2);
            View view4 = this.mGroupWearable;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGroupWearable");
                view4 = null;
            }
            N0(view4);
            View view5 = this.mWatchView;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWatchView");
                view5 = null;
            }
            N0(view5);
            ImageView imageView5 = this.mThirdImg;
            if (imageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mThirdImg");
                imageView5 = null;
            }
            this.mCurrImg = imageView5;
            j1(d21VarM0);
            if (deviceWatchFaceItem != null && (mutableLiveDataH0 = deviceWatchFaceItem.H0()) != null) {
                mutableLiveDataH0.removeObserver(this);
            }
            WatchView watchView6 = this.mWatchView;
            if (watchView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWatchView");
                watchView6 = null;
            }
            watchView6.setResDownloadUpdateCallback((Runnable) null);
        }
        View view6 = this.mCurrImg;
        if (view6 != null) {
            view6.post(new Runnable() { // from class: com.oplus.aiunit.vision.wi5
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceInfoItem.P0(this.i);
                }
            });
        }
    }

    @Override // com.heytap.health.device.flexadapter.a
    public int R() {
        return R$layout.settings_viewholder_tip;
    }

    public final void R0() {
        Context contextR = r();
        this.maxHeightReduce = qmg.a(contextR, this.maxHeightReduceDp);
        int iA = qmg.a(contextR, this.hideScrollDistanceDp);
        this.hideScrollDistance = iA;
        this.totalScrollDistance = this.maxHeightReduce + iA;
    }

    @Override // com.heytap.health.device.flexadapter.a
    @NotNull
    public Rect S() {
        int i = this.padding_startend;
        return new Rect(i, 0, i, this.dp12);
    }

    public final void S0() {
        this.scrollListener = new RecyclerView.OnScrollListener() { // from class: com.heytap.health.device.tab.itemview.wearable.DeviceInfoItem$initScrollListener$1
            public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, dx, dy);
                this.a.i1();
            }
        };
        RecyclerView recyclerViewK = s().k();
        RecyclerView.OnScrollListener onScrollListener = this.scrollListener;
        Intrinsics.checkNotNull(onScrollListener);
        recyclerViewK.addOnScrollListener(onScrollListener);
    }

    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public void onChanged(@NotNull Map<String, g8h> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        d21<?> d21VarM0 = m0();
        if (d21VarM0 == null) {
            m8b.b(getMTag(), "onChanged not find wearable device");
            return;
        }
        if (d21VarM0.g()) {
            g8h g8hVar = value.get(d21VarM0.getCurrDeviceMac());
            if (g8hVar != null) {
                a1(g8hVar);
                return;
            }
            m8b.b(getMTag(), "onChanged not find " + veb.a(d21VarM0.getCurrDeviceMac()) + " wf");
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void X0() {
        RecyclerView.OnScrollListener onScrollListener = this.scrollListener;
        if (onScrollListener != null) {
            s().k().removeOnScrollListener(onScrollListener);
            this.scrollListener = null;
        }
    }

    public final void Y0(UserDeviceInfo deviceInfo) {
        xmk.e(new pb5(deviceInfo.getFirmwareVersion(), deviceInfo.getModel(), deviceInfo.getDeviceSn(), deviceInfo.getMac(), deviceInfo.getSku()), 2, (String) null, 4, -1);
    }

    @Override // com.heytap.health.device.flexadapter.a
    @NotNull
    public vnf Z(@NotNull fu6 type) {
        Intrinsics.checkNotNullParameter(type, i37.FAMILY_KEY_FRIEND_INVITE_TYPE);
        d0(Unit.INSTANCE);
        if ((Intrinsics.areEqual(type, fu6.c.INSTANCE) || this.showIwatchTips) && ((Boolean) gd5.b(n0()).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.health.device.tab.itemview.wearable.DeviceInfoItem$onEvent$1
            @NotNull
            public final Boolean invoke(@NotNull DeviceInfo deviceInfo) {
                Intrinsics.checkNotNullParameter(deviceInfo, "$this$applyInfo");
                return Boolean.valueOf(deviceInfo.k0());
            }
        })).booleanValue()) {
            this.showIwatchTips = true;
            getMTag();
        } else {
            this.showIwatchTips = false;
        }
        return super.Z(type);
    }

    public final void Z0() {
        View view = this.mCurrImg;
        if (view != null) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setAlpha(1.0f);
            view.setVisibility(0);
            int i = this.originalPreviewWidth;
            if (i <= 0 || this.originalPreviewHeight <= 0) {
                return;
            }
            view.setPivotX(i / 2.0f);
            view.setPivotY(this.originalPreviewHeight);
        }
    }

    public final void a1(g8h faceBeanWrapper) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = BuildConfig.VERSION_NAME;
        List<f0a> listA = faceBeanWrapper.a();
        if (listA == null || listA.isEmpty()) {
            List<f8h> listB = faceBeanWrapper.b();
            if (!(listB == null || listB.isEmpty())) {
                String strA = faceBeanWrapper.b().get(0).a();
                Intrinsics.checkNotNullExpressionValue(strA, "faceBeanWrapper.watchSim…chFaceBeans[0].previewUrl");
                objectRef.element = strA;
            }
        } else {
            String strA2 = faceBeanWrapper.a().get(0).a();
            Intrinsics.checkNotNullExpressionValue(strA2, "faceBeanWrapper.bandSimp…chFaceBeans[0].previewUrl");
            objectRef.element = strA2;
        }
        boolean z = this.mWatchView != null;
        m8b.f(getMTag(), "firstWF:" + objectRef.element + " initialized:" + z);
        if (z) {
            WatchView watchView = this.mWatchView;
            if (watchView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWatchView");
                watchView = null;
            }
            watchView.I(new Runnable() { // from class: com.oplus.aiunit.vision.ri5
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceInfoItem.b1(objectRef, this);
                }
            });
        }
    }

    @Override // com.heytap.health.device.flexadapter.a
    public void b0() {
        super.b0();
        if (Math.abs(System.currentTimeMillis() - this.mUpdateBatteryTimeStamp) > 60000) {
            getMTag();
            this.mUpdateBatteryTimeStamp = System.currentTimeMillis();
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.ui5
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceInfoItem.W0();
                }
            });
        }
    }

    public final void c1(View view) {
        if (view.getVisibility() == 8) {
            view.setVisibility(0);
        }
    }

    public final void d1() {
        View view = this.mLottieAnimationView;
        TextView textView = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLottieAnimationView");
            view = null;
        }
        view.setVisibility(0);
        LottieAnimationView lottieAnimationView = this.mLottieAnimationView;
        if (lottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLottieAnimationView");
            lottieAnimationView = null;
        }
        if (!lottieAnimationView.isAnimating()) {
            View view2 = this.mLottieAnimationView;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLottieAnimationView");
                view2 = null;
            }
            view2.post(new Runnable() { // from class: com.oplus.aiunit.vision.yi5
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceInfoItem.e1(this.i);
                }
            });
        }
        View view3 = this.mViewDivider;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDivider");
            view3 = null;
        }
        view3.setVisibility(8);
        TextView textView2 = this.mTvReconnect;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvReconnect");
            textView2 = null;
        }
        textView2.setVisibility(8);
        ImageView imageView = this.mIvPoint;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvPoint");
            imageView = null;
        }
        imageView.setVisibility(8);
        TextView textView3 = this.mTvStatue;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvStatue");
            textView3 = null;
        }
        textView3.setVisibility(0);
        View view4 = this.mHorizBatteryView;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHorizBatteryView");
            view4 = null;
        }
        view4.setVisibility(8);
        TextView textView4 = this.mTvBattery;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvBattery");
            textView4 = null;
        }
        textView4.setVisibility(8);
        TextView textView5 = this.mTvTip;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvTip");
        } else {
            textView = textView5;
        }
        textView.setVisibility(8);
    }

    public final void f1() {
        View view = this.mLottieAnimationView;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLottieAnimationView");
            view = null;
        }
        view.setVisibility(8);
        LottieAnimationView lottieAnimationView = this.mLottieAnimationView;
        if (lottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLottieAnimationView");
            lottieAnimationView = null;
        }
        lottieAnimationView.pauseAnimation();
        TextView textView = this.mTvReconnect;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvReconnect");
            textView = null;
        }
        textView.setVisibility(8);
        ImageView imageView = this.mIvPoint;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvPoint");
            imageView = null;
        }
        imageView.setVisibility(0);
        TextView textView2 = this.mTvStatue;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvStatue");
            textView2 = null;
        }
        textView2.setVisibility(0);
        View view3 = this.mHorizBatteryView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHorizBatteryView");
            view3 = null;
        }
        view3.setVisibility(0);
        TextView textView3 = this.mTvBattery;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvBattery");
            textView3 = null;
        }
        textView3.setVisibility(0);
        TextView textView4 = this.mTvTip;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvTip");
            textView4 = null;
        }
        textView4.setVisibility(8);
        View view4 = this.mViewDivider;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDivider");
        } else {
            view2 = view4;
        }
        view2.setVisibility(0);
    }

    public final void g1() {
        View view = this.mLottieAnimationView;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLottieAnimationView");
            view = null;
        }
        view.setVisibility(8);
        LottieAnimationView lottieAnimationView = this.mLottieAnimationView;
        if (lottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLottieAnimationView");
            lottieAnimationView = null;
        }
        lottieAnimationView.pauseAnimation();
        TextView textView = this.mTvReconnect;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvReconnect");
            textView = null;
        }
        textView.setVisibility(8);
        ImageView imageView = this.mIvPoint;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvPoint");
            imageView = null;
        }
        imageView.setVisibility(8);
        TextView textView2 = this.mTvStatue;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvStatue");
            textView2 = null;
        }
        textView2.setVisibility(8);
        View view3 = this.mHorizBatteryView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHorizBatteryView");
            view3 = null;
        }
        view3.setVisibility(8);
        TextView textView3 = this.mTvBattery;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvBattery");
            textView3 = null;
        }
        textView3.setVisibility(8);
        TextView textView4 = this.mTvTip;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvTip");
            textView4 = null;
        }
        textView4.setVisibility(0);
        TextView textView5 = this.mTvStateErrorTip;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvStateErrorTip");
            textView5 = null;
        }
        textView5.setVisibility(8);
        View view4 = this.mViewDivider;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDivider");
        } else {
            view2 = view4;
        }
        view2.setVisibility(8);
    }

    public final void h1(final UserDeviceInfo data) {
        String string;
        String str;
        m8b.f(getMTag(), veb.a(data.getMac()) + " connect state:" + data.getConnectionState() + "   currentCapacity:" + data.getCapacityPercent() + " chargeStatus:" + data.getChargeStatus());
        final int capacityPercent = data.getCapacityPercent();
        boolean zIsConnecting = data.isConnecting();
        boolean zIsConnect = data.isConnect();
        if (zIsConnecting) {
            string = r().getString(com.heytap.health.device_settings.R$string.settings_device_linking);
        } else {
            string = zIsConnect ? r().getString(R$string.settings_device_linked_state) : r().getString(R$string.settings_device_disconnect);
        }
        Intrinsics.checkNotNullExpressionValue(string, "if (connecting) {\n      …ice_disconnect)\n        }");
        TextView textView = this.mTvStatue;
        ImageView imageView = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvStatue");
            textView = null;
        }
        textView.setText(string);
        getMTag();
        StringBuilder sb = new StringBuilder();
        sb.append("mTvStatue ");
        sb.append(string);
        if (zIsConnecting) {
            d1();
            return;
        }
        f1();
        if (zIsConnect) {
            TextView textView2 = this.mTvReconnect;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvReconnect");
                textView2 = null;
            }
            textView2.setClickable(false);
            TextView textView3 = this.mTvBattery;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvBattery");
                textView3 = null;
            }
            textView3.setVisibility(0);
            TextView textView4 = this.mTvReconnect;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvReconnect");
                textView4 = null;
            }
            textView4.setVisibility(8);
            if (UserDeviceInfo.isConnectedBT(data.getConnectionState())) {
                if (((Boolean) gd5.d(data.getModel()).a(new Function1<DeviceModel, Boolean>() { // from class: com.heytap.health.device.tab.itemview.wearable.DeviceInfoItem$updateDeviceConnectState$1
                    @NotNull
                    public final Boolean invoke(@NotNull DeviceModel deviceModel) {
                        Intrinsics.checkNotNullParameter(deviceModel, "$this$applyMode");
                        return Boolean.valueOf(deviceModel.Ka());
                    }
                })).booleanValue()) {
                    String string2 = r().getString(R$string.settings_mode_smart);
                    Intrinsics.checkNotNullExpressionValue(string2, "getContext().getString(R…ring.settings_mode_smart)");
                    TextView textView5 = this.mTvStatue;
                    if (textView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mTvStatue");
                        textView5 = null;
                    }
                    textView5.setText(string2);
                }
            } else if (UserDeviceInfo.isConnectedBLE(data.getConnectionState())) {
                int i = ((zqb) gd5.d(data.getModel()).a(new Function1<DeviceModel, zqb>() { // from class: com.heytap.health.device.tab.itemview.wearable.DeviceInfoItem$updateDeviceConnectState$mcuType$1
                    @NotNull
                    public final zqb invoke(@NotNull DeviceModel deviceModel) {
                        Intrinsics.checkNotNullParameter(deviceModel, "$this$applyMode");
                        return deviceModel.k9();
                    }
                })) == zxa.INSTANCE ? R$string.settings_mode_smart_weak : R$string.settings_device_linked_model_01;
                TextView textView6 = this.mTvStatue;
                if (textView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvStatue");
                    textView6 = null;
                }
                textView6.setText(i);
            }
            if (capacityPercent >= 0) {
                str = capacityPercent + "%";
            } else {
                str = "--%";
            }
            data.getChargeStatus();
            TextView textView7 = this.mTvBattery;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvBattery");
                textView7 = null;
            }
            textView7.setText(str);
            ComposeView composeView = this.mHorizBatteryView;
            if (composeView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHorizBatteryView");
                composeView = null;
            }
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-418205515, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.device.tab.itemview.wearable.DeviceInfoItem$updateDeviceConnectState$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer, int i2) {
                    if ((i2 & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-418205515, i2, -1, "com.heytap.health.device.tab.itemview.wearable.DeviceInfoItem.updateDeviceConnectState.<anonymous> (DeviceInfoItem.kt:454)");
                    }
                    BatteryIconViewKt.a(capacityPercent / 100.0f, data.isCharge(), (Modifier) null, composer, 0, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        } else {
            TextView textView8 = this.mTvBattery;
            if (textView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvBattery");
                textView8 = null;
            }
            textView8.setVisibility(8);
            View view = this.mHorizBatteryView;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHorizBatteryView");
                view = null;
            }
            view.setVisibility(8);
            TextView textView9 = this.mTvReconnect;
            if (textView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvReconnect");
                textView9 = null;
            }
            textView9.setVisibility(0);
            TextView textView10 = this.mTvReconnect;
            if (textView10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvReconnect");
                textView10 = null;
            }
            textView10.setClickable(true);
        }
        ImageView imageView2 = this.mIvPoint;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvPoint");
        } else {
            imageView = imageView2;
        }
        imageView.setImageResource(zIsConnect ? R$drawable.settings_device_state_connect : R$drawable.settings_device_state_disconnect);
    }

    public final void i1() {
        LinearLayoutManager layoutManager = s().k().getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = layoutManager;
        if (linearLayoutManager.findFirstVisibleItemPosition() != 0) {
            Z0();
            return;
        }
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(0);
        if (viewFindViewByPosition != null && Intrinsics.areEqual(viewFindViewByPosition, v())) {
            int iCoerceAtLeast = RangesKt.coerceAtLeast(-viewFindViewByPosition.getTop(), 0);
            float f = iCoerceAtLeast;
            float f2 = f / this.totalScrollDistance;
            float f3 = n04.PROGRESS_ZERO;
            float fCoerceIn = RangesKt.coerceIn(f2, n04.PROGRESS_ZERO, 1.0f);
            if (fCoerceIn <= n04.PROGRESS_ZERO) {
                Z0();
                return;
            }
            float fCoerceIn2 = RangesKt.coerceIn(f / this.maxHeightReduce, n04.PROGRESS_ZERO, 1.0f);
            int i = this.maxHeightReduce;
            float fCoerceIn3 = iCoerceAtLeast > i ? RangesKt.coerceIn((iCoerceAtLeast - i) / this.hideScrollDistance, n04.PROGRESS_ZERO, 1.0f) : 0.0f;
            int i2 = this.maxHeightReduce;
            if (iCoerceAtLeast <= i2) {
                i2 = (int) (i2 * fCoerceIn2);
            }
            int iCoerceAtLeast2 = RangesKt.coerceAtLeast(this.originalPreviewHeight - i2, 0);
            int i3 = this.originalPreviewHeight;
            float f4 = i3 > 0 ? iCoerceAtLeast2 / i3 : 1.0f;
            if (iCoerceAtLeast <= this.maxHeightReduce) {
                f3 = 1.0f - (fCoerceIn2 * this.maxAlphaReduce);
            } else if (iCoerceAtLeast <= this.totalScrollDistance) {
                f3 = (1.0f - this.maxAlphaReduce) * (1.0f - fCoerceIn3);
            }
            View view = this.mCurrImg;
            if (view != null) {
                view.setScaleX(f4);
                view.setScaleY(f4);
                view.setAlpha(f3);
                if (fCoerceIn >= 1.0f) {
                    view.setVisibility(4);
                } else {
                    view.setVisibility(0);
                }
            }
        }
    }

    public final void j1(d21<?> device) {
        String deviceName;
        String string;
        Drawable drawable;
        if (device instanceof w32) {
            Object objNavigation = e1.d().b("/device/BpgServiceImpl").navigation();
            IBpgService iBpgService = objNavigation instanceof IBpgService ? (IBpgService) objNavigation : null;
            if (iBpgService != null) {
                FragmentActivity fragmentActivityP = p();
                String deviceType = ((w32) device).d().getDeviceType();
                ImageView imageView = this.mThirdImg;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mThirdImg");
                    imageView = null;
                }
                iBpgService.d4(fragmentActivityP, deviceType, imageView);
            }
            deviceName = ((w32) device).d().getDeviceName();
            Intrinsics.checkNotNullExpressionValue(deviceName, "device.data.deviceName");
            string = r().getString(R$string.settings_device_pair);
            Intrinsics.checkNotNullExpressionValue(string, "getContext().getString(R…ing.settings_device_pair)");
            drawable = AppCompatResources.getDrawable(r(), R$drawable.settings_device_state_connect);
        } else if (device instanceof qul) {
            ImageView imageView2 = this.mThirdImg;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mThirdImg");
                imageView2 = null;
            }
            imageView2.setImageResource(R$drawable.device_settings_weight);
            qul qulVar = (qul) device;
            String strB = qulVar.d().b();
            Intrinsics.checkNotNullExpressionValue(strB, "device.data.deviceName");
            String string2 = r().getString(qulVar.d().f() ? R$string.settings_device_linked_state : R$string.settings_device_disconnect);
            Intrinsics.checkNotNullExpressionValue(string2, "getContext().getString(i…ttings_device_disconnect)");
            drawable = AppCompatResources.getDrawable(r(), qulVar.d().f() ? R$drawable.settings_device_state_connect : R$drawable.settings_device_state_disconnect);
            deviceName = strB;
            string = string2;
        } else {
            deviceName = BuildConfig.VERSION_NAME;
            string = BuildConfig.VERSION_NAME;
            drawable = null;
        }
        TextView textView = this.mTvName;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvName");
            textView = null;
        }
        textView.setText(deviceName);
        TextView textView2 = this.mTvThirdStatue;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvThirdStatue");
            textView2 = null;
        }
        textView2.setText(string);
        TextView textView3 = this.mTvThirdStatue;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvThirdStatue");
            textView3 = null;
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void k1(UserDeviceInfo device) {
        WatchView watchView = this.mWatchView;
        TextView textView = null;
        if (watchView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWatchView");
            watchView = null;
        }
        watchView.U(n04.PROGRESS_ZERO, qmg.a(r(), 256.0f));
        String name = device.getName();
        TextView textView2 = this.mTvName;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvName");
            textView2 = null;
        }
        if (device.getVirtualAccountData() != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = BaseApplication.a().getString(R$string.settings_device_of_new);
            Intrinsics.checkNotNullExpressionValue(string, "get().getString(R.string.settings_device_of_new)");
            name = String.format(string, Arrays.copyOf(new Object[]{device.getVirtualAccountData().getNikcName(), name}, 2));
            Intrinsics.checkNotNullExpressionValue(name, "format(...)");
        }
        textView2.setText(name);
        if (h0(device)) {
            g1();
            return;
        }
        if (((Boolean) gd5.b(device).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.health.device.tab.itemview.wearable.DeviceInfoItem$updateWearableData$isFamilyDevice$1
            @NotNull
            public final Boolean invoke(@NotNull DeviceInfo deviceInfo) {
                Intrinsics.checkNotNullParameter(deviceInfo, "$this$applyInfo");
                return Boolean.valueOf(deviceInfo.Ta());
            }
        })).booleanValue()) {
            TextView textView3 = this.mTvStateErrorTip;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvStateErrorTip");
                textView3 = null;
            }
            textView3.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.xi5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DeviceInfoItem.l1(view);
                }
            });
            TextView textView4 = this.mTvStateErrorTip;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvStateErrorTip");
                textView4 = null;
            }
            textView4.setCompoundDrawablesRelativeWithIntrinsicBounds(AppCompatResources.getDrawable(r(), R$drawable.device_ic_tip), (Drawable) null, AppCompatResources.getDrawable(r(), R$drawable.settings_device_right), (Drawable) null);
            TextView textView5 = this.mTvStateErrorTip;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvStateErrorTip");
                textView5 = null;
            }
            textView5.setText(r().getString(R$string.device_settings_family_device_tip));
            TextView textView6 = this.mTvStateErrorTip;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvStateErrorTip");
            } else {
                textView = textView6;
            }
            textView.setVisibility(0);
        } else if (this.showIwatchTips) {
            TextView textView7 = this.mTvStateErrorTip;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvStateErrorTip");
                textView7 = null;
            }
            textView7.setOnClickListener(null);
            TextView textView8 = this.mTvStateErrorTip;
            if (textView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvStateErrorTip");
                textView8 = null;
            }
            textView8.setCompoundDrawablesRelativeWithIntrinsicBounds(AppCompatResources.getDrawable(r(), R$drawable.device_ic_tip), (Drawable) null, (Drawable) null, (Drawable) null);
            TextView textView9 = this.mTvStateErrorTip;
            if (textView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvStateErrorTip");
                textView9 = null;
            }
            textView9.setText(r().getString(R$string.device_toptips_iwatch, r().getString(com.heytap.health.device_pair.R$string.pair_iwatch_app_name)));
            TextView textView10 = this.mTvStateErrorTip;
            if (textView10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvStateErrorTip");
            } else {
                textView = textView10;
            }
            textView.setVisibility(0);
        } else {
            TextView textView11 = this.mTvStateErrorTip;
            if (textView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvStateErrorTip");
            } else {
                textView = textView11;
            }
            textView.setVisibility(8);
        }
        h1(device);
        if (this.mCurrentUserDeviceInfo == null) {
            this.mCurrentUserDeviceInfo = device;
        }
        UserDeviceInfo userDeviceInfo = this.mCurrentUserDeviceInfo;
        if (userDeviceInfo == null || UserDeviceInfo.isSameDevice(userDeviceInfo, device.getMac())) {
            return;
        }
        this.mCurrentUserDeviceInfo = userDeviceInfo;
        Y0(device);
    }

    @Override // com.heytap.health.device.flexadapter.a
    public void l() {
        super.l();
        this.mUpdateBatteryTimeStamp = 0L;
        X0();
        Z0();
        DeviceWatchFaceItem deviceWatchFaceItem = (DeviceWatchFaceItem) s().l(DeviceWatchFaceItem.class);
        if (deviceWatchFaceItem != null) {
            deviceWatchFaceItem.H0().observe(s().getActivity(), this);
        } else {
            m8b.b(getMTag(), "not find DeviceWatchFaceItem");
        }
        WatchView watchView = this.mWatchView;
        if (watchView != null) {
            if (watchView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWatchView");
                watchView = null;
            }
            watchView.setAutoDownloadRes(false);
            WatchView watchView2 = this.mWatchView;
            if (watchView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWatchView");
                watchView2 = null;
            }
            watchView2.setResDownloadUpdateCallback((Runnable) null);
        }
    }

    @Override // com.heytap.health.device.flexadapter.a
    public int u() {
        return 8;
    }

    @Override // com.heytap.health.device.tab.itemview.base.BaseDeviceTabItem
    public void y0() {
        super.y0();
        T();
    }

    @Override // com.heytap.health.device.tab.itemview.base.BaseDeviceTabItem
    public void z0() {
        super.z0();
        if (this.showIwatchTips && ((Boolean) gd5.b(n0()).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.health.device.tab.itemview.wearable.DeviceInfoItem$updateConnectionState$1
            @NotNull
            public final Boolean invoke(@NotNull DeviceInfo deviceInfo) {
                Intrinsics.checkNotNullParameter(deviceInfo, "$this$applyInfo");
                return Boolean.valueOf(deviceInfo.k0() && deviceInfo.Pa());
            }
        })).booleanValue()) {
            this.showIwatchTips = false;
        }
        T();
    }
}
