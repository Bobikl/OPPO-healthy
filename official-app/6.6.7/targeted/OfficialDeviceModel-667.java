package com.heytap.health.vision.deviceability;

import android.text.TextUtils;
import com.heytap.health.base.view.exceptionview.DevicePageType;
import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.device_manager_base.ScreenType;
import com.heytap.health.device_manager_base.c;
import com.heytap.health.vision.devicetype.constants.Constants;
import com.heytap.health.vision.processor.bean.ResBean;
import com.heytap.health.vision.util.DeviceUtilsKt;
import com.heytap.store.platform.videoplayer.base.BuildConfig;
import com.oplus.aiunit.model.ExtraInfo;
import com.oplus.aiunit.model.cm4;
import com.oplus.aiunit.model.hab;
import com.oplus.aiunit.model.n04;
import com.oplus.aiunit.model.zqb;
import com.oplus.aiunit.model.zxa;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes16.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bG\b\u0016\u0018\u00002\u00020\u0001B\u0012\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0005\b³\u0001\u0010jJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J#\u0010\t\u001a\u00020\u00052\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007\"\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJL\u0010\u000f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u001d\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0002\b\r2\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007\"\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020\u0005H\u0016J\b\u0010&\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\b\u0010*\u001a\u00020\u0005H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020\u0005H\u0016J\b\u0010/\u001a\u00020\u0005H\u0016J\b\u00100\u001a\u00020\u0005H\u0016J\b\u00101\u001a\u00020\u0005H\u0016J\b\u00102\u001a\u00020\u0005H\u0016J\b\u00103\u001a\u00020\u0005H\u0016J\b\u00104\u001a\u00020\u0005H\u0016J\b\u00105\u001a\u00020\u0005H\u0016J\b\u00106\u001a\u00020\u0005H\u0016J\b\u00107\u001a\u00020\u0005H\u0016J\b\u00108\u001a\u00020\u0005H\u0016J\b\u00109\u001a\u00020\u0005H\u0016J\b\u0010:\u001a\u00020\u0005H\u0016J\u001c\u0010>\u001a\u00020=2\b\u0010;\u001a\u0004\u0018\u00010\u00032\b\u0010<\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010?\u001a\u00020\u0005H\u0016J\b\u0010@\u001a\u00020\u0005H\u0016J\b\u0010A\u001a\u00020\u0005H\u0016J\b\u0010B\u001a\u00020\u0005H\u0016J\b\u0010C\u001a\u00020\u0005H\u0016J\b\u0010D\u001a\u00020\u0005H\u0016J\b\u0010E\u001a\u00020\u0005H\u0016J\u0012\u0010G\u001a\u00020\u00032\b\u0010F\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010I\u001a\u00020=2\u0006\u0010H\u001a\u00020\u0005H\u0016J\b\u0010J\u001a\u00020\u0005H\u0016J\b\u0010K\u001a\u00020\u0005H\u0016J\b\u0010L\u001a\u00020\u0005H\u0016J\b\u0010M\u001a\u00020\u0005H\u0016J\b\u0010N\u001a\u00020\u0005H\u0016J\b\u0010O\u001a\u00020\u0005H\u0016J\b\u0010P\u001a\u00020\u0005H\u0016J\u0006\u0010Q\u001a\u00020\u0005J\u0006\u0010S\u001a\u00020RJ\u0006\u0010U\u001a\u00020TJ\n\u0010W\u001a\u0004\u0018\u00010VH\u0016J\u0006\u0010X\u001a\u00020\u0005J\u0006\u0010Y\u001a\u00020\u0005J\u0006\u0010Z\u001a\u00020\u0005J\u0010\u0010]\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020[H\u0016J\n\u0010^\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010`\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020_H\u0016J\u0010\u0010b\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020aH\u0016J\u0006\u0010c\u001a\u00020\u0005J\u0006\u0010d\u001a\u00020\u0005R$\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\bk\u0010fR$\u0010t\u001a\u0004\u0018\u00010m8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001b\u0010y\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u001b\u0010|\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010v\u001a\u0004\b{\u0010xR\u001b\u0010\u007f\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b}\u0010v\u001a\u0004\b~\u0010xR\u001e\u0010\u0082\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010v\u001a\u0005\b\u0081\u0001\u0010xR\u001e\u0010\u0085\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010v\u001a\u0005\b\u0084\u0001\u0010xR\u001e\u0010\u0088\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010v\u001a\u0005\b\u0087\u0001\u0010xR\u001e\u0010\u008b\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010v\u001a\u0005\b\u008a\u0001\u0010xR\u001e\u0010\u008e\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010v\u001a\u0005\b\u008d\u0001\u0010xR\u001e\u0010\u0091\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010v\u001a\u0005\b\u0090\u0001\u0010xR\u001e\u0010\u0094\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010v\u001a\u0005\b\u0093\u0001\u0010xR\u001e\u0010\u0097\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010v\u001a\u0005\b\u0096\u0001\u0010xR\u001e\u0010\u009a\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010v\u001a\u0005\b\u0099\u0001\u0010xR\u001e\u0010\u009d\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010v\u001a\u0005\b\u009c\u0001\u0010xR\u001e\u0010 \u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010v\u001a\u0005\b\u009f\u0001\u0010xR\u001e\u0010£\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¡\u0001\u0010v\u001a\u0005\b¢\u0001\u0010xR\u001e\u0010¦\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¤\u0001\u0010v\u001a\u0005\b¥\u0001\u0010xR\u001e\u0010©\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b§\u0001\u0010v\u001a\u0005\b¨\u0001\u0010xR\u001e\u0010¬\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bª\u0001\u0010v\u001a\u0005\b«\u0001\u0010xR\u001e\u0010¯\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010v\u001a\u0005\b®\u0001\u0010xR\u001e\u0010²\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b°\u0001\u0010v\u001a\u0005\b±\u0001\u0010x¨\u0006´\u0001"}, d2 = {"Lcom/heytap/health/devicemanager/deviceability/DeviceModel;", "Lcom/heytap/health/device_manager_base/c;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "models", BuildConfig.VERSION_NAME, "X8", BuildConfig.VERSION_NAME, "arg", "na", "([Ljava/lang/String;)Z", "model", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "W8", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;[Ljava/lang/String;)Z", "O9", "Q9", "V9", "Z9", "C9", "ha", "H9", "I9", "G9", "ka", "da", "ia", "la", "ca", "k0", "ga", "ma", "ea", "fa", "M9", "K9", "D9", "N9", "p2", "F9", "L9", "P9", "U9", "E9", "R9", "ja", "W9", "Y9", "aa", "za", "La", "Da", "Fa", "Ea", "Ca", "xa", "J9", "boardId", "projectId", BuildConfig.VERSION_NAME, "t9", "S9", "T9", "X9", "ba", "ua", "Ba", "b2", "mac", "h9", "isBle", "u9", "ya", "wa", "Ka", "Aa", "Ga", "va", "Z8", "Ha", "Lcom/heytap/health/base/view/exceptionview/DevicePageType;", "p9", "Lcom/oplus/aiunit/vision/zqb;", "k9", "Lcom/oplus/aiunit/vision/x07;", "g9", "oa", "Ja", "Ia", "Lcom/heytap/health/device_manager_base/DeviceConstants$b;", "deviceGroup", "qa", "x4", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b;", "sa", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$a;", "ra", "ta", "Y8", "a", "Ljava/lang/String;", "l9", "()Ljava/lang/String;", "setModel", "(Ljava/lang/String;)V", "b", "TAG", "Lcom/heytap/health/devicemanager/processor/bean/ResBean;", "c", "Lcom/heytap/health/devicemanager/processor/bean/ResBean;", "n9", "()Lcom/heytap/health/devicemanager/processor/bean/ResBean;", "pa", "(Lcom/heytap/health/devicemanager/processor/bean/ResBean;)V", "oobeResBean", "d", "Lkotlin/Lazy;", "w9", "()Z", "watch1", "e", "x9", "watch2", "f", "c9", "band", "g", "A9", "watchFree", "h", "m9", "onePlus", "i", "q9", "realMe", "j", "y9", "watch3", "k", "i9", "heisenberg", "l", "z9", "watch4", "m", "s9", "starWatch", "n", "b9", "bagelWatch", "o", "o9", "oppoSportWatch", "p", "r9", "starRiverWatch", "q", "a9", "astraWatch", "r", "f9", "columbusWatch", "s", "j9", "iwatch", "t", "v9", "taycanWatch", "u", "B9", "watchSE", "v", "d9", "cocoWatch", "w", "e9", "cocoWatchBluetooth", "<init>", "device_manager_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeviceModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceModel.kt\ncom/heytap/health/devicemanager/deviceability/DeviceModel\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,728:1\n30#2,5:729\n30#2,5:734\n30#2,5:739\n30#2,5:744\n30#2,2:749\n33#2,2:752\n30#2,5:754\n30#2,5:759\n30#2,5:764\n30#2,5:769\n30#2,5:774\n30#2,5:779\n30#2,5:784\n30#2,5:789\n30#2,5:794\n30#2,5:799\n30#2,5:804\n30#2,5:809\n30#2,5:814\n30#2,5:819\n30#2,5:824\n30#2,5:829\n30#2,5:834\n30#2,5:839\n30#2,5:844\n30#2,5:849\n30#2,5:854\n30#2,5:859\n30#2,5:864\n30#2,5:869\n30#2,5:874\n30#2,5:879\n30#2,5:884\n30#2,5:889\n30#2,5:894\n30#2,5:899\n30#2,5:904\n30#2,5:909\n30#2,5:914\n30#2,5:919\n30#2,5:924\n30#2,5:929\n30#2,5:934\n30#2,5:939\n30#2,5:944\n30#2,5:949\n1#3:751\n*S KotlinDebug\n*F\n+ 1 DeviceModel.kt\ncom/heytap/health/devicemanager/deviceability/DeviceModel\n*L\n274#1:729,5\n303#1:734,5\n311#1:739,5\n316#1:744,5\n320#1:749,2\n320#1:752,2\n326#1:754,5\n332#1:759,5\n340#1:764,5\n344#1:769,5\n348#1:774,5\n357#1:779,5\n366#1:784,5\n368#1:789,5\n372#1:794,5\n376#1:799,5\n384#1:804,5\n392#1:809,5\n401#1:814,5\n405#1:819,5\n417#1:824,5\n421#1:829,5\n425#1:834,5\n429#1:839,5\n433#1:844,5\n437#1:849,5\n445#1:854,5\n453#1:859,5\n461#1:864,5\n470#1:869,5\n493#1:874,5\n515#1:879,5\n523#1:884,5\n532#1:889,5\n540#1:894,5\n544#1:899,5\n552#1:904,5\n568#1:909,5\n577#1:914,5\n588#1:919,5\n600#1:924,5\n652#1:929,5\n657#1:934,5\n668#1:939,5\n690#1:944,5\n725#1:949,5\n*E\n"})
public class DeviceModel implements c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public String model;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public ResBean oobeResBean;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "BaseAbility";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy watch1 = LazyKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$watch1$2
        {
            super(0);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m129invoke() {
            DeviceModel deviceModel = this.this$0;
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            return Boolean.valueOf(deviceModel.X8(companion.J(companion.X())));
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Lazy watch2 = LazyKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$watch2$2
        {
            super(0);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m130invoke() {
            DeviceModel deviceModel = this.this$0;
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            return Boolean.valueOf(deviceModel.X8(companion.J(companion.Y())));
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Lazy band = LazyKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$band$2
        {
            super(0);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m117invoke() {
            DeviceModel deviceModel = this.this$0;
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            return Boolean.valueOf(deviceModel.X8(companion.J(companion.i())));
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Lazy watchFree = LazyKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$watchFree$2
        {
            super(0);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m133invoke() {
            DeviceModel deviceModel = this.this$0;
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            return Boolean.valueOf(deviceModel.X8(companion.J(companion.u0())));
        }
    });

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Lazy onePlus = LazyKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$onePlus$2
        {
            super(0);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m123invoke() {
            DeviceModel deviceModel = this.this$0;
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            return Boolean.valueOf(deviceModel.X8(companion.J(companion.N())));
        }
    });

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy realMe = LazyKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$realMe$2
        {
            super(0);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m125invoke() {
            return Boolean.valueOf(this.this$0.na(DeviceConstants.INSTANCE.M()));
        }
    });

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy watch3 = LazyKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$watch3$2
        {
            super(0);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m131invoke() {
            DeviceModel deviceModel = this.this$0;
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            return Boolean.valueOf(deviceModel.X8(companion.J(companion.Z())));
        }
    });

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy heisenberg = LazyKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$heisenberg$2
        {
            super(0);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m121invoke() {
            DeviceModel deviceModel = this.this$0;
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            return Boolean.valueOf(deviceModel.X8(companion.J(companion.F())));
        }
    });

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy watch4 = LazyKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$watch4$2
        {
            super(0);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m132invoke() {
            DeviceModel deviceModel = this.this$0;
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            return Boolean.valueOf(deviceModel.X8(companion.J(companion.a0())));
        }
    });

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy starWatch = LazyKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$starWatch$2
        {
            super(0);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m127invoke() {
            DeviceModel deviceModel = this.this$0;
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            return Boolean.valueOf(deviceModel.X8(companion.J(companion.S())));
        }
    });

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Lazy bagelWatch = LazyKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$bagelWatch$2
        {
            super(0);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m116invoke() {
            return Boolean.valueOf(this.this$0.na(DeviceConstants.INSTANCE.h()));
        }
    });

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Lazy oppoSportWatch = LazyKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$oppoSportWatch$2
        {
            super(0);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m124invoke() {
            return Boolean.valueOf(this.this$0.na(DeviceConstants.INSTANCE.L()));
        }
    });

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Lazy starRiverWatch = LazyKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$starRiverWatch$2
        {
            super(0);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m126invoke() {
            return Boolean.valueOf(this.this$0.na(DeviceConstants.INSTANCE.Q()));
        }
    });

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Lazy astraWatch = LazyKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$astraWatch$2
        {
            super(0);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m115invoke() {
            return Boolean.valueOf(this.this$0.na(DeviceConstants.INSTANCE.f()));
        }
    });

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final Lazy columbusWatch = LazyKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$columbusWatch$2
        {
            super(0);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m120invoke() {
            return Boolean.valueOf(this.this$0.na(DeviceConstants.INSTANCE.x()));
        }
    });

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Lazy iwatch = LazyKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$iwatch$2
        {
            super(0);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m122invoke() {
            return Boolean.valueOf(this.this$0.na(DeviceConstants.INSTANCE.I()));
        }
    });

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final Lazy taycanWatch = LazyKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$taycanWatch$2
        {
            super(0);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m128invoke() {
            return Boolean.valueOf(this.this$0.na(DeviceConstants.INSTANCE.W()));
        }
    });

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final Lazy watchSE = LazyKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$watchSE$2
        {
            super(0);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m134invoke() {
            return Boolean.valueOf(this.this$0.na(DeviceConstants.INSTANCE.s0()));
        }
    });

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final Lazy cocoWatch = LazyKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$cocoWatch$2
        {
            super(0);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m118invoke() {
            DeviceModel deviceModel = this.this$0;
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            return Boolean.valueOf(deviceModel.X8(companion.J(companion.s())));
        }
    });

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final Lazy cocoWatchBluetooth = LazyKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$cocoWatchBluetooth$2
        {
            super(0);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m119invoke() {
            return Boolean.valueOf(this.this$0.na(DeviceConstants.INSTANCE.u()));
        }
    });

    public DeviceModel(@Nullable String str) {
        this.model = str;
    }

    public final boolean A9() {
        return ((Boolean) this.watchFree.getValue()).booleanValue();
    }

    public boolean Aa() {
        return !(!M9() || O9() || Q9()) || ga();
    }

    public final boolean B9() {
        return ((Boolean) this.watchSE.getValue()).booleanValue();
    }

    public boolean Ba() {
        return (M9() && !O9()) || b2();
    }

    public boolean C9() {
        return c9();
    }

    public boolean Ca() {
        return Da() || Fa() || M9() || H9() || I9() || Ea() || (K9() && qa(DeviceConstants.BaseDevice.a.C0016b.INSTANCE));
    }

    public boolean D9() {
        return C9() || ha() || G9();
    }

    public boolean Da() {
        return TextUtils.equals(this.model, DeviceConstants.INSTANCE.k());
    }

    public boolean E9() {
        String strX4 = x4();
        if (strX4 == null) {
            return false;
        }
        Set<String> set = Constants.sBigWatchSet;
        String upperCase = strX4.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return set.contains(upperCase);
    }

    public boolean Ea() {
        return TextUtils.equals(this.model, DeviceConstants.INSTANCE.E());
    }

    public boolean F9() {
        return M9();
    }

    public boolean Fa() {
        return TextUtils.equals(this.model, DeviceConstants.INSTANCE.p0());
    }

    public boolean G9() {
        return i9();
    }

    public boolean Ga() {
        return (O9() || H9() || I9() || C9()) ? false : true;
    }

    public boolean H9() {
        return m9() || q9();
    }

    public final boolean Ha() {
        return (M9() && qa(DeviceConstants.BaseDevice.AbstractC0017b.k.INSTANCE)) || (K9() && qa(DeviceConstants.BaseDevice.a.C0016b.INSTANCE));
    }

    public boolean I9() {
        return q9();
    }

    public final boolean Ia() {
        return !M9();
    }

    public boolean J9() {
        return H9() || I9() || ka() || la() || ga() || ma() || ea();
    }

    public final boolean Ja() {
        return (M9() && qa(DeviceConstants.BaseDevice.AbstractC0017b.f.INSTANCE)) || (K9() && qa(DeviceConstants.BaseDevice.a.C0016b.INSTANCE));
    }

    public boolean K9() {
        return D9() || N9() || ga();
    }

    public boolean Ka() {
        return M9() && !O9();
    }

    public boolean L9() {
        return K9() && qa(DeviceConstants.BaseDevice.a.C0016b.INSTANCE);
    }

    public boolean La() {
        return M9() && !O9();
    }

    public boolean M9() {
        return O9() || Q9() || V9() || Z9() || ka() || da() || la() || ma() || ea();
    }

    public boolean N9() {
        return H9() || I9();
    }

    public boolean O9() {
        return w9();
    }

    public boolean P9() {
        return TextUtils.equals(DeviceConstants.INSTANCE.t0(), x4());
    }

    public boolean Q9() {
        return x9() || B9();
    }

    public boolean R9() {
        String strX4 = x4();
        if (strX4 == null) {
            return false;
        }
        Set<String> set = Constants.sBigWatch2Set;
        String upperCase = strX4.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return set.contains(upperCase);
    }

    public boolean S9() {
        return TextUtils.equals(this.model, DeviceConstants.INSTANCE.e0());
    }

    public boolean T9() {
        return TextUtils.equals(this.model, DeviceConstants.INSTANCE.c0());
    }

    public boolean U9() {
        String strX4 = x4();
        if (strX4 == null) {
            return false;
        }
        Set<String> set = Constants.sSmallWatch2Set;
        String upperCase = strX4.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return set.contains(upperCase);
    }

    public boolean V9() {
        return y9();
    }

    public final boolean W8(String model, Function2<? super String, ? super String, Boolean> block, String... arg) {
        if (model == null) {
            return false;
        }
        for (String str : arg) {
            if (((Boolean) block.invoke(model, str)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public boolean W9() {
        return Intrinsics.areEqual(DeviceConstants.INSTANCE.f0(), x4());
    }

    public final boolean X8(List<String> models) {
        Iterator<String> it = models.iterator();
        while (it.hasNext()) {
            if (na(it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean X9() {
        return TextUtils.equals(this.model, DeviceConstants.INSTANCE.f0());
    }

    public final boolean Y8() {
        return !k0();
    }

    public boolean Y9() {
        return Intrinsics.areEqual(DeviceConstants.INSTANCE.h0(), x4());
    }

    public boolean Z8() {
        return M9() && !O9();
    }

    public boolean Z9() {
        return z9();
    }

    public final boolean a9() {
        return ((Boolean) this.astraWatch.getValue()).booleanValue();
    }

    public boolean aa() {
        return Intrinsics.areEqual(DeviceConstants.INSTANCE.k0(), x4());
    }

    @Override // com.heytap.health.device_manager_base.c
    public boolean b2() {
        return K9() && qa(DeviceConstants.BaseDevice.a.C0016b.INSTANCE);
    }

    public final boolean b9() {
        return ((Boolean) this.bagelWatch.getValue()).booleanValue();
    }

    public boolean ba() {
        return aa();
    }

    public final boolean c9() {
        return ((Boolean) this.band.getValue()).booleanValue();
    }

    public boolean ca() {
        return a9();
    }

    public final boolean d9() {
        return ((Boolean) this.cocoWatch.getValue()).booleanValue();
    }

    public boolean da() {
        return b9() || o9();
    }

    public final boolean e9() {
        return ((Boolean) this.cocoWatchBluetooth.getValue()).booleanValue();
    }

    public boolean ea() {
        return d9();
    }

    public final boolean f9() {
        return ((Boolean) this.columbusWatch.getValue()).booleanValue();
    }

    public boolean fa() {
        return e9();
    }

    @Nullable
    public ExtraInfo g9() {
        if (la() || ka() || ga()) {
            return new ExtraInfo(ScreenType.SCREEN_TYPE_ROUND, (short) 466, (short) 466, (short) 233, null, 16, null);
        }
        if (Z9() || W9()) {
            return new ExtraInfo(ScreenType.SCREEN_TYPE_SQUARE, (short) 378, (short) 496, (short) 70, null, 16, null);
        }
        if (E9()) {
            return new ExtraInfo(ScreenType.SCREEN_TYPE_SQUARE, (short) 402, (short) 476, (short) 72, null, 16, null);
        }
        if (Y9() || ja() || U9()) {
            return new ExtraInfo(ScreenType.SCREEN_TYPE_SQUARE, (short) 372, (short) 430, (short) 54, null, 16, null);
        }
        if (P9()) {
            return new ExtraInfo(ScreenType.SCREEN_TYPE_SQUARE, (short) 320, (short) 360, (short) 48, null, 16, null);
        }
        if (ha()) {
            return new ExtraInfo(ScreenType.SCREEN_TYPE_SQUARE, (short) 280, (short) 456, (short) 28, null, 16, null);
        }
        if (G9()) {
            return new ExtraInfo(ScreenType.SCREEN_TYPE_SQUARE, (short) 256, (short) 402, (short) 27, null, 16, null);
        }
        if (ma() || ea()) {
            return new ExtraInfo(ScreenType.SCREEN_TYPE_ROUND, (short) 466, (short) 466, (short) 233, BuildConfig.VERSION_NAME);
        }
        if (H9()) {
            return new ExtraInfo(ScreenType.SCREEN_TYPE_ROUND, (short) 454, (short) 454, (short) 227, null, 16, null);
        }
        return I9() ? new ExtraInfo(ScreenType.SCREEN_TYPE_ROUND, (short) 416, (short) 416, (short) 208, null, 16, null) : new ExtraInfo(ScreenType.SCREEN_TYPE_ROUND, (short) 466, (short) 466, (short) 233, null, 16, null);
    }

    public boolean ga() {
        return f9();
    }

    @NotNull
    public String h9(@Nullable String mac) {
        String btNamePrefix;
        Iterator<DeviceConstants.DeviceParams> it = DeviceConstants.INSTANCE.A().iterator();
        while (true) {
            if (!it.hasNext()) {
                btNamePrefix = BuildConfig.VERSION_NAME;
                break;
            }
            DeviceConstants.DeviceParams next = it.next();
            if (Intrinsics.areEqual(next.getModel(), this.model)) {
                btNamePrefix = next.getBtNamePrefix();
                break;
            }
        }
        if (!(btNamePrefix.length() > 0)) {
            return btNamePrefix;
        }
        return btNamePrefix + " " + DeviceUtilsKt.c(mac);
    }

    public boolean ha() {
        return A9();
    }

    public final boolean i9() {
        return ((Boolean) this.heisenberg.getValue()).booleanValue();
    }

    public boolean ia() {
        return o9();
    }

    public final boolean j9() {
        return ((Boolean) this.iwatch.getValue()).booleanValue();
    }

    public boolean ja() {
        return B9();
    }

    @Override // com.heytap.health.device_manager_base.c
    public boolean k0() {
        return j9();
    }

    @NotNull
    public final zqb k9() {
        if (Ka()) {
            return (Q9() || V9() || Z9() || ka() || da()) ? zxa.INSTANCE : hab.INSTANCE;
        }
        return hab.INSTANCE;
    }

    public boolean ka() {
        return s9() || da();
    }

    @Nullable
    /* JADX INFO: renamed from: l9, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    public boolean la() {
        return r9() || ca();
    }

    public final boolean m9() {
        return ((Boolean) this.onePlus.getValue()).booleanValue();
    }

    public boolean ma() {
        return v9();
    }

    @Nullable
    /* JADX INFO: renamed from: n9, reason: from getter */
    public final ResBean getOobeResBean() {
        return this.oobeResBean;
    }

    public final boolean na(String... arg) {
        return W8(this.model, DeviceModel$modelEquals$1$1.INSTANCE, (String[]) Arrays.copyOf(arg, arg.length));
    }

    public final boolean o9() {
        return ((Boolean) this.oppoSportWatch.getValue()).booleanValue();
    }

    public final boolean oa() {
        return (M9() && qa(DeviceConstants.BaseDevice.AbstractC0017b.k.INSTANCE)) || (K9() && qa(DeviceConstants.BaseDevice.a.C0016b.INSTANCE));
    }

    @Override // com.heytap.health.device_manager_base.c
    public boolean p2() {
        return M9() || K9() || k0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public final DevicePageType p9() throws NoWhenBranchMatchedException {
        zqb zqbVarK9 = k9();
        if (Intrinsics.areEqual(zqbVarK9, zxa.INSTANCE)) {
            return DevicePageType.LITTLE_SMART_MODULE;
        }
        if (Intrinsics.areEqual(zqbVarK9, hab.INSTANCE)) {
            return DevicePageType.ON_STUB_MODULE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void pa(@Nullable ResBean resBean) {
        this.oobeResBean = resBean;
    }

    public final boolean q9() {
        return ((Boolean) this.realMe.getValue()).booleanValue();
    }

    public boolean qa(@NotNull DeviceConstants.BaseDevice deviceGroup) {
        Intrinsics.checkNotNullParameter(deviceGroup, "deviceGroup");
        DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
        String str = this.model;
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        DeviceConstants.BaseDevice baseDeviceZ = companion.z(str);
        if (baseDeviceZ == null) {
            cm4.a(this.TAG, this.model + " not find deviceGroup");
            return false;
        }
        cm4.a(this.TAG, "find " + baseDeviceZ + " ,check " + deviceGroup);
        return baseDeviceZ.getDate() - deviceGroup.getDate() >= n04.PROGRESS_ZERO;
    }

    public final boolean r9() {
        return ((Boolean) this.starRiverWatch.getValue()).booleanValue();
    }

    public boolean ra(@NotNull DeviceConstants.BaseDevice.a deviceGroup) {
        Intrinsics.checkNotNullParameter(deviceGroup, "deviceGroup");
        return K9() && qa(deviceGroup);
    }

    public final boolean s9() {
        return ((Boolean) this.starWatch.getValue()).booleanValue();
    }

    public boolean sa(@NotNull DeviceConstants.BaseDevice.AbstractC0017b deviceGroup) {
        Intrinsics.checkNotNullParameter(deviceGroup, "deviceGroup");
        return M9() && qa(deviceGroup);
    }

    public int t9(@Nullable String boardId, @Nullable String projectId) {
        return (O9() && TextUtils.equals(boardId, Constants.BOARD_ID_9) && TextUtils.equals(projectId, Constants.PROJECT_ID_19903)) ? 1 : 0;
    }

    public final boolean ta() {
        return qa(DeviceConstants.BaseDevice.AbstractC0017b.g.INSTANCE);
    }

    public int u9(boolean isBle) {
        DeviceConstants.DeviceParams deviceParamsB;
        DeviceConstants.DeviceParams deviceParamsB2;
        if (isBle) {
            if (!wa() || (deviceParamsB2 = DeviceConstants.INSTANCE.B(this.model)) == null) {
                return -1;
            }
            return deviceParamsB2.getDeviceType();
        }
        if (!ya() || (deviceParamsB = DeviceConstants.INSTANCE.B(this.model)) == null) {
            return -1;
        }
        return deviceParamsB.getDeviceType();
    }

    public boolean ua() {
        return O9() || Ba();
    }

    public final boolean v9() {
        return ((Boolean) this.taycanWatch.getValue()).booleanValue();
    }

    public boolean va() {
        return (M9() || C9() || ga() || k0()) ? false : true;
    }

    public final boolean w9() {
        return ((Boolean) this.watch1.getValue()).booleanValue();
    }

    public boolean wa() {
        return D9() || O9() || oa();
    }

    @Override // com.heytap.health.device_manager_base.c
    @Nullable
    public String x4() {
        return this.model;
    }

    public final boolean x9() {
        return ((Boolean) this.watch2.getValue()).booleanValue();
    }

    public boolean xa() {
        return (M9() && !O9()) || Fa();
    }

    public final boolean y9() {
        return ((Boolean) this.watch3.getValue()).booleanValue();
    }

    public boolean ya() {
        return !wa();
    }

    public final boolean z9() {
        return ((Boolean) this.watch4.getValue()).booleanValue();
    }

    public boolean za() {
        return (!M9() || S9() || fa()) ? false : true;
    }
}
