package com.heytap.health.devicemanager.deviceability;

import android.text.TextUtils;
import com.heytap.health.base.view.exceptionview.DevicePageType;
import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.device_manager_base.ScreenType;
import com.heytap.health.device_manager_base.c;
import com.heytap.health.devicemanager.devicetype.constants.Constants;
import com.heytap.health.devicemanager.processor.bean.ResBean;
import com.heytap.health.devicemanager.util.DeviceUtilsKt;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.ExtraInfo;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.kpb;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.owa;
import com.oplus.aiunit.vision.v8b;
import io.protostuff.MapSchema;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bG\b\u0016\u0018\u00002\u00020\u0001B\u0012\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0005\b³\u0001\u0010jJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J#\u0010\t\u001a\u00020\u00052\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007\"\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJL\u0010\u000f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u001d\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0002\b\r2\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007\"\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020\u0005H\u0016J\b\u0010&\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\b\u0010*\u001a\u00020\u0005H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020\u0005H\u0016J\b\u0010/\u001a\u00020\u0005H\u0016J\b\u00100\u001a\u00020\u0005H\u0016J\b\u00101\u001a\u00020\u0005H\u0016J\b\u00102\u001a\u00020\u0005H\u0016J\b\u00103\u001a\u00020\u0005H\u0016J\b\u00104\u001a\u00020\u0005H\u0016J\b\u00105\u001a\u00020\u0005H\u0016J\b\u00106\u001a\u00020\u0005H\u0016J\b\u00107\u001a\u00020\u0005H\u0016J\b\u00108\u001a\u00020\u0005H\u0016J\b\u00109\u001a\u00020\u0005H\u0016J\b\u0010:\u001a\u00020\u0005H\u0016J\u001c\u0010>\u001a\u00020=2\b\u0010;\u001a\u0004\u0018\u00010\u00032\b\u0010<\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010?\u001a\u00020\u0005H\u0016J\b\u0010@\u001a\u00020\u0005H\u0016J\b\u0010A\u001a\u00020\u0005H\u0016J\b\u0010B\u001a\u00020\u0005H\u0016J\b\u0010C\u001a\u00020\u0005H\u0016J\b\u0010D\u001a\u00020\u0005H\u0016J\b\u0010E\u001a\u00020\u0005H\u0016J\u0012\u0010G\u001a\u00020\u00032\b\u0010F\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010I\u001a\u00020=2\u0006\u0010H\u001a\u00020\u0005H\u0016J\b\u0010J\u001a\u00020\u0005H\u0016J\b\u0010K\u001a\u00020\u0005H\u0016J\b\u0010L\u001a\u00020\u0005H\u0016J\b\u0010M\u001a\u00020\u0005H\u0016J\b\u0010N\u001a\u00020\u0005H\u0016J\b\u0010O\u001a\u00020\u0005H\u0016J\b\u0010P\u001a\u00020\u0005H\u0016J\u0006\u0010Q\u001a\u00020\u0005J\u0006\u0010S\u001a\u00020RJ\u0006\u0010U\u001a\u00020TJ\n\u0010W\u001a\u0004\u0018\u00010VH\u0016J\u0006\u0010X\u001a\u00020\u0005J\u0006\u0010Y\u001a\u00020\u0005J\u0006\u0010Z\u001a\u00020\u0005J\u0010\u0010]\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020[H\u0016J\n\u0010^\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010`\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020_H\u0016J\u0010\u0010b\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020aH\u0016J\u0006\u0010c\u001a\u00020\u0005J\u0006\u0010d\u001a\u00020\u0005R$\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\bk\u0010fR$\u0010t\u001a\u0004\u0018\u00010m8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001b\u0010y\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u001b\u0010|\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010v\u001a\u0004\b{\u0010xR\u001b\u0010\u007f\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b}\u0010v\u001a\u0004\b~\u0010xR\u001e\u0010\u0082\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010v\u001a\u0005\b\u0081\u0001\u0010xR\u001e\u0010\u0085\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010v\u001a\u0005\b\u0084\u0001\u0010xR\u001e\u0010\u0088\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010v\u001a\u0005\b\u0087\u0001\u0010xR\u001e\u0010\u008b\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010v\u001a\u0005\b\u008a\u0001\u0010xR\u001e\u0010\u008e\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010v\u001a\u0005\b\u008d\u0001\u0010xR\u001e\u0010\u0091\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010v\u001a\u0005\b\u0090\u0001\u0010xR\u001e\u0010\u0094\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010v\u001a\u0005\b\u0093\u0001\u0010xR\u001e\u0010\u0097\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010v\u001a\u0005\b\u0096\u0001\u0010xR\u001e\u0010\u009a\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010v\u001a\u0005\b\u0099\u0001\u0010xR\u001e\u0010\u009d\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010v\u001a\u0005\b\u009c\u0001\u0010xR\u001e\u0010 \u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010v\u001a\u0005\b\u009f\u0001\u0010xR\u001e\u0010£\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¡\u0001\u0010v\u001a\u0005\b¢\u0001\u0010xR\u001e\u0010¦\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¤\u0001\u0010v\u001a\u0005\b¥\u0001\u0010xR\u001e\u0010©\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b§\u0001\u0010v\u001a\u0005\b¨\u0001\u0010xR\u001e\u0010¬\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bª\u0001\u0010v\u001a\u0005\b«\u0001\u0010xR\u001e\u0010¯\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010v\u001a\u0005\b®\u0001\u0010xR\u001e\u0010²\u0001\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b°\u0001\u0010v\u001a\u0005\b±\u0001\u0010x¨\u0006´\u0001"}, d2 = {"Lcom/heytap/health/devicemanager/deviceability/DeviceModel;", "Lcom/heytap/health/device_manager_base/c;", "", "", "models", "", "V8", "", "arg", "la", "([Ljava/lang/String;)Z", "model", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "U8", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;[Ljava/lang/String;)Z", "M9", "O9", "T9", "X9", "A9", "fa", "F9", "G9", "E9", "ia", "ba", "ga", "ja", "aa", "k0", "ea", "ka", "ca", "da", "K9", "I9", "B9", "L9", "o2", "D9", "J9", "N9", "S9", "C9", "P9", "ha", "U9", "W9", "Y9", "xa", "Ja", "Ba", "Da", "Ca", "Aa", "va", "H9", "boardId", "projectId", "", "r9", "Q9", "R9", "V9", "Z9", "sa", "za", "a2", "mac", "f9", "isBle", "s9", "wa", HttpConst.UA, "Ia", "ya", "Ea", "ta", "X8", "Fa", "Lcom/heytap/health/base/view/exceptionview/DevicePageType;", "n9", "Lcom/oplus/aiunit/vision/kpb;", "i9", "Lcom/oplus/aiunit/vision/wz6;", "e9", "ma", "Ha", "Ga", "Lcom/heytap/health/device_manager_base/DeviceConstants$b;", "deviceGroup", "oa", "y4", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b;", "qa", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$a;", "pa", "ra", "W8", "a", "Ljava/lang/String;", "j9", "()Ljava/lang/String;", "setModel", "(Ljava/lang/String;)V", "b", "TAG", "Lcom/heytap/health/devicemanager/processor/bean/ResBean;", "c", "Lcom/heytap/health/devicemanager/processor/bean/ResBean;", "l9", "()Lcom/heytap/health/devicemanager/processor/bean/ResBean;", "na", "(Lcom/heytap/health/devicemanager/processor/bean/ResBean;)V", "oobeResBean", "d", "Lkotlin/Lazy;", "u9", "()Z", "watch1", MapSchema.FIELD_NAME_ENTRY, "v9", "watch2", "f", "a9", "band", b2n.f, "y9", "watchFree", b2n.g, "k9", "onePlus", "i", "o9", "realMe", "j", "w9", "watch3", MapSchema.FIELD_NAME_KEY, "g9", "heisenberg", LogFieldKey.LEVEL_KEY, "x9", "watch4", LogFieldKey.MESSAGE_KEY, "q9", "starWatch", "n", "Z8", "bagelWatch", "o", "m9", "oppoSportWatch", LogFieldKey.PROCESS_NAME_KEY, "p9", "starRiverWatch", "q", "Y8", "astraWatch", "r", "d9", "columbusWatch", "s", "h9", "iwatch", "t", "t9", "taycanWatch", "u", "z9", "watchSE", "v", "b9", "cocoWatch", "w", "c9", "cocoWatchBluetooth", "<init>", "device_manager_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeviceModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceModel.kt\ncom/heytap/health/devicemanager/deviceability/DeviceModel\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,728:1\n30#2,5:729\n30#2,5:734\n30#2,5:739\n30#2,5:744\n30#2,2:749\n33#2,2:752\n30#2,5:754\n30#2,5:759\n30#2,5:764\n30#2,5:769\n30#2,5:774\n30#2,5:779\n30#2,5:784\n30#2,5:789\n30#2,5:794\n30#2,5:799\n30#2,5:804\n30#2,5:809\n30#2,5:814\n30#2,5:819\n30#2,5:824\n30#2,5:829\n30#2,5:834\n30#2,5:839\n30#2,5:844\n30#2,5:849\n30#2,5:854\n30#2,5:859\n30#2,5:864\n30#2,5:869\n30#2,5:874\n30#2,5:879\n30#2,5:884\n30#2,5:889\n30#2,5:894\n30#2,5:899\n30#2,5:904\n30#2,5:909\n30#2,5:914\n30#2,5:919\n30#2,5:924\n30#2,5:929\n30#2,5:934\n30#2,5:939\n30#2,5:944\n30#2,5:949\n1#3:751\n*S KotlinDebug\n*F\n+ 1 DeviceModel.kt\ncom/heytap/health/devicemanager/deviceability/DeviceModel\n*L\n274#1:729,5\n303#1:734,5\n311#1:739,5\n316#1:744,5\n320#1:749,2\n320#1:752,2\n326#1:754,5\n332#1:759,5\n340#1:764,5\n344#1:769,5\n348#1:774,5\n357#1:779,5\n366#1:784,5\n368#1:789,5\n372#1:794,5\n376#1:799,5\n384#1:804,5\n392#1:809,5\n401#1:814,5\n405#1:819,5\n417#1:824,5\n421#1:829,5\n425#1:834,5\n429#1:839,5\n433#1:844,5\n437#1:849,5\n445#1:854,5\n453#1:859,5\n461#1:864,5\n470#1:869,5\n493#1:874,5\n515#1:879,5\n523#1:884,5\n532#1:889,5\n540#1:894,5\n544#1:899,5\n552#1:904,5\n568#1:909,5\n577#1:914,5\n588#1:919,5\n600#1:924,5\n652#1:929,5\n657#1:934,5\n668#1:939,5\n690#1:944,5\n725#1:949,5\n*E\n"})
public class DeviceModel implements c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public String model;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ResBean oobeResBean;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "BaseAbility";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy watch1 = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$watch1$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            DeviceModel deviceModel = this.this$0;
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            return Boolean.valueOf(deviceModel.V8(companion.J(companion.X())));
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy watch2 = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$watch2$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            DeviceModel deviceModel = this.this$0;
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            return Boolean.valueOf(deviceModel.V8(companion.J(companion.Y())));
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Lazy band = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$band$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            DeviceModel deviceModel = this.this$0;
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            return Boolean.valueOf(deviceModel.V8(companion.J(companion.i())));
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Lazy watchFree = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$watchFree$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            DeviceModel deviceModel = this.this$0;
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            return Boolean.valueOf(deviceModel.V8(companion.J(companion.u0())));
        }
    });

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Lazy onePlus = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$onePlus$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            DeviceModel deviceModel = this.this$0;
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            return Boolean.valueOf(deviceModel.V8(companion.J(companion.N())));
        }
    });

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy realMe = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$realMe$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.la(DeviceConstants.INSTANCE.M()));
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy watch3 = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$watch3$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            DeviceModel deviceModel = this.this$0;
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            return Boolean.valueOf(deviceModel.V8(companion.J(companion.Z())));
        }
    });

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy heisenberg = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$heisenberg$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            DeviceModel deviceModel = this.this$0;
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            return Boolean.valueOf(deviceModel.V8(companion.J(companion.F())));
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy watch4 = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$watch4$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            DeviceModel deviceModel = this.this$0;
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            return Boolean.valueOf(deviceModel.V8(companion.J(companion.a0())));
        }
    });

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy starWatch = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$starWatch$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            DeviceModel deviceModel = this.this$0;
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            return Boolean.valueOf(deviceModel.V8(companion.J(companion.S())));
        }
    });

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy bagelWatch = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$bagelWatch$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.la(DeviceConstants.INSTANCE.h()));
        }
    });

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Lazy oppoSportWatch = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$oppoSportWatch$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.la(DeviceConstants.INSTANCE.L()));
        }
    });

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Lazy starRiverWatch = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$starRiverWatch$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.la(DeviceConstants.INSTANCE.Q()));
        }
    });

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Lazy astraWatch = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$astraWatch$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.la(DeviceConstants.INSTANCE.f()));
        }
    });

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final Lazy columbusWatch = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$columbusWatch$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.la(DeviceConstants.INSTANCE.x()));
        }
    });

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Lazy iwatch = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$iwatch$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.la(DeviceConstants.INSTANCE.I()));
        }
    });

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final Lazy taycanWatch = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$taycanWatch$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.la(DeviceConstants.INSTANCE.W()));
        }
    });

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final Lazy watchSE = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$watchSE$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.la(DeviceConstants.INSTANCE.s0()));
        }
    });

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final Lazy cocoWatch = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$cocoWatch$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            DeviceModel deviceModel = this.this$0;
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            return Boolean.valueOf(deviceModel.V8(companion.J(companion.s())));
        }
    });

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final Lazy cocoWatchBluetooth = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceModel$cocoWatchBluetooth$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.la(DeviceConstants.INSTANCE.u()));
        }
    });

    public DeviceModel(@Nullable String str) {
        this.model = str;
    }

    public boolean A9() {
        return a9();
    }

    public boolean Aa() {
        return Ba() || Da() || K9() || F9() || G9() || Ca() || (I9() && oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE));
    }

    public boolean B9() {
        return A9() || fa() || E9();
    }

    public boolean Ba() {
        return TextUtils.equals(this.model, DeviceConstants.INSTANCE.k());
    }

    public boolean C9() {
        String strY4 = y4();
        if (strY4 == null) {
            return false;
        }
        Set<String> set = Constants.sBigWatchSet;
        String upperCase = strY4.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return set.contains(upperCase);
    }

    public boolean Ca() {
        return TextUtils.equals(this.model, DeviceConstants.INSTANCE.E());
    }

    public boolean D9() {
        return K9();
    }

    public boolean Da() {
        return TextUtils.equals(this.model, DeviceConstants.INSTANCE.p0());
    }

    public boolean E9() {
        return g9();
    }

    public boolean Ea() {
        return (M9() || F9() || G9() || A9()) ? false : true;
    }

    public boolean F9() {
        return k9() || o9();
    }

    public final boolean Fa() {
        return (K9() && oa(DeviceConstants.BaseDevice.AbstractC0341b.k.INSTANCE)) || (I9() && oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE));
    }

    public boolean G9() {
        return o9();
    }

    public final boolean Ga() {
        return !K9();
    }

    public boolean H9() {
        return F9() || G9() || ia() || ja() || ea() || ka() || ca();
    }

    public final boolean Ha() {
        return (K9() && oa(DeviceConstants.BaseDevice.AbstractC0341b.f.INSTANCE)) || (I9() && oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE));
    }

    public boolean I9() {
        return B9() || L9() || ea();
    }

    public boolean Ia() {
        return K9() && !M9();
    }

    public boolean J9() {
        return I9() && oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE);
    }

    public boolean Ja() {
        return K9() && !M9();
    }

    public boolean K9() {
        return M9() || O9() || T9() || X9() || ia() || ba() || ja() || ka() || ca();
    }

    public boolean L9() {
        return F9() || G9();
    }

    public boolean M9() {
        return u9();
    }

    public boolean N9() {
        return TextUtils.equals(DeviceConstants.INSTANCE.t0(), y4());
    }

    public boolean O9() {
        return v9() || z9();
    }

    public boolean P9() {
        String strY4 = y4();
        if (strY4 == null) {
            return false;
        }
        Set<String> set = Constants.sBigWatch2Set;
        String upperCase = strY4.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return set.contains(upperCase);
    }

    public boolean Q9() {
        return TextUtils.equals(this.model, DeviceConstants.INSTANCE.e0());
    }

    public boolean R9() {
        return TextUtils.equals(this.model, DeviceConstants.INSTANCE.c0());
    }

    public boolean S9() {
        String strY4 = y4();
        if (strY4 == null) {
            return false;
        }
        Set<String> set = Constants.sSmallWatch2Set;
        String upperCase = strY4.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return set.contains(upperCase);
    }

    public boolean T9() {
        return w9();
    }

    public final boolean U8(String model, Function2<? super String, ? super String, Boolean> block, String... arg) {
        if (model == null) {
            return false;
        }
        for (String str : arg) {
            if (block.invoke(model, str).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public boolean U9() {
        return Intrinsics.areEqual(DeviceConstants.INSTANCE.f0(), y4());
    }

    public final boolean V8(List<String> models) {
        Iterator<String> it = models.iterator();
        while (it.hasNext()) {
            if (la(it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean V9() {
        return TextUtils.equals(this.model, DeviceConstants.INSTANCE.f0());
    }

    public final boolean W8() {
        return !k0();
    }

    public boolean W9() {
        return Intrinsics.areEqual(DeviceConstants.INSTANCE.h0(), y4());
    }

    public boolean X8() {
        return K9() && !M9();
    }

    public boolean X9() {
        return x9();
    }

    public final boolean Y8() {
        return ((Boolean) this.astraWatch.getValue()).booleanValue();
    }

    public boolean Y9() {
        return Intrinsics.areEqual(DeviceConstants.INSTANCE.k0(), y4());
    }

    public final boolean Z8() {
        return ((Boolean) this.bagelWatch.getValue()).booleanValue();
    }

    public boolean Z9() {
        return Y9();
    }

    @Override // com.heytap.health.device_manager_base.c
    public boolean a2() {
        return I9() && oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE);
    }

    public final boolean a9() {
        return ((Boolean) this.band.getValue()).booleanValue();
    }

    public boolean aa() {
        return Y8();
    }

    public final boolean b9() {
        return ((Boolean) this.cocoWatch.getValue()).booleanValue();
    }

    public boolean ba() {
        return Z8() || m9();
    }

    public final boolean c9() {
        return ((Boolean) this.cocoWatchBluetooth.getValue()).booleanValue();
    }

    public boolean ca() {
        return b9();
    }

    public final boolean d9() {
        return ((Boolean) this.columbusWatch.getValue()).booleanValue();
    }

    public boolean da() {
        return c9();
    }

    @Nullable
    public ExtraInfo e9() {
        if (ja() || ia() || ea()) {
            return new ExtraInfo(ScreenType.SCREEN_TYPE_ROUND, (short) 466, (short) 466, (short) 233, null, 16, null);
        }
        if (X9() || U9()) {
            return new ExtraInfo(ScreenType.SCREEN_TYPE_SQUARE, (short) 378, (short) 496, (short) 70, null, 16, null);
        }
        if (C9()) {
            return new ExtraInfo(ScreenType.SCREEN_TYPE_SQUARE, (short) 402, (short) 476, (short) 72, null, 16, null);
        }
        if (W9() || ha() || S9()) {
            return new ExtraInfo(ScreenType.SCREEN_TYPE_SQUARE, (short) 372, (short) 430, (short) 54, null, 16, null);
        }
        if (N9()) {
            return new ExtraInfo(ScreenType.SCREEN_TYPE_SQUARE, (short) 320, (short) 360, (short) 48, null, 16, null);
        }
        if (fa()) {
            return new ExtraInfo(ScreenType.SCREEN_TYPE_SQUARE, (short) 280, (short) 456, (short) 28, null, 16, null);
        }
        if (E9()) {
            return new ExtraInfo(ScreenType.SCREEN_TYPE_SQUARE, (short) 256, (short) 402, (short) 27, null, 16, null);
        }
        if (ka() || ca()) {
            return new ExtraInfo(ScreenType.SCREEN_TYPE_ROUND, (short) 466, (short) 466, (short) 233, "");
        }
        if (F9()) {
            return new ExtraInfo(ScreenType.SCREEN_TYPE_ROUND, (short) 454, (short) 454, (short) 227, null, 16, null);
        }
        return G9() ? new ExtraInfo(ScreenType.SCREEN_TYPE_ROUND, (short) 416, (short) 416, (short) 208, null, 16, null) : new ExtraInfo(ScreenType.SCREEN_TYPE_ROUND, (short) 466, (short) 466, (short) 233, null, 16, null);
    }

    public boolean ea() {
        return d9();
    }

    @NotNull
    public String f9(@Nullable String mac) {
        String btNamePrefix;
        Iterator<DeviceConstants.DeviceParams> it = DeviceConstants.INSTANCE.A().iterator();
        while (true) {
            if (!it.hasNext()) {
                btNamePrefix = "";
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

    public boolean fa() {
        return y9();
    }

    public final boolean g9() {
        return ((Boolean) this.heisenberg.getValue()).booleanValue();
    }

    public boolean ga() {
        return m9();
    }

    public final boolean h9() {
        return ((Boolean) this.iwatch.getValue()).booleanValue();
    }

    public boolean ha() {
        return z9();
    }

    @NotNull
    public final kpb i9() {
        if (Ia()) {
            return (O9() || T9() || X9() || ia() || ba()) ? owa.INSTANCE : v8b.INSTANCE;
        }
        return v8b.INSTANCE;
    }

    public boolean ia() {
        return q9() || ba();
    }

    @Nullable
    /* JADX INFO: renamed from: j9, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    public boolean ja() {
        return p9() || aa();
    }

    @Override // com.heytap.health.device_manager_base.c
    public boolean k0() {
        return h9();
    }

    public final boolean k9() {
        return ((Boolean) this.onePlus.getValue()).booleanValue();
    }

    public boolean ka() {
        return t9();
    }

    @Nullable
    /* JADX INFO: renamed from: l9, reason: from getter */
    public final ResBean getOobeResBean() {
        return this.oobeResBean;
    }

    public final boolean la(String... arg) {
        return U8(this.model, DeviceModel$modelEquals$1$1.INSTANCE, (String[]) Arrays.copyOf(arg, arg.length));
    }

    public final boolean m9() {
        return ((Boolean) this.oppoSportWatch.getValue()).booleanValue();
    }

    public final boolean ma() {
        return (K9() && oa(DeviceConstants.BaseDevice.AbstractC0341b.k.INSTANCE)) || (I9() && oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE));
    }

    @NotNull
    public final DevicePageType n9() {
        kpb kpbVarI9 = i9();
        if (Intrinsics.areEqual(kpbVarI9, owa.INSTANCE)) {
            return DevicePageType.LITTLE_SMART_MODULE;
        }
        if (Intrinsics.areEqual(kpbVarI9, v8b.INSTANCE)) {
            return DevicePageType.ON_STUB_MODULE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void na(@Nullable ResBean resBean) {
        this.oobeResBean = resBean;
    }

    @Override // com.heytap.health.device_manager_base.c
    public boolean o2() {
        return K9() || I9() || k0();
    }

    public final boolean o9() {
        return ((Boolean) this.realMe.getValue()).booleanValue();
    }

    public boolean oa(@NotNull DeviceConstants.BaseDevice deviceGroup) {
        Intrinsics.checkNotNullParameter(deviceGroup, "deviceGroup");
        DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
        String str = this.model;
        if (str == null) {
            str = "";
        }
        DeviceConstants.BaseDevice baseDeviceZ = companion.z(str);
        if (baseDeviceZ == null) {
            ml4.a(this.TAG, this.model + " not find deviceGroup");
            return false;
        }
        ml4.a(this.TAG, "find " + baseDeviceZ + " ,check " + deviceGroup);
        return baseDeviceZ.getDate() - deviceGroup.getDate() >= 0.0f;
    }

    public final boolean p9() {
        return ((Boolean) this.starRiverWatch.getValue()).booleanValue();
    }

    public boolean pa(@NotNull DeviceConstants.BaseDevice.a deviceGroup) {
        Intrinsics.checkNotNullParameter(deviceGroup, "deviceGroup");
        return I9() && oa(deviceGroup);
    }

    public final boolean q9() {
        return ((Boolean) this.starWatch.getValue()).booleanValue();
    }

    public boolean qa(@NotNull DeviceConstants.BaseDevice.AbstractC0341b deviceGroup) {
        Intrinsics.checkNotNullParameter(deviceGroup, "deviceGroup");
        return K9() && oa(deviceGroup);
    }

    public int r9(@Nullable String boardId, @Nullable String projectId) {
        return (M9() && TextUtils.equals(boardId, "9") && TextUtils.equals(projectId, Constants.PROJECT_ID_19903)) ? 1 : 0;
    }

    public final boolean ra() {
        return oa(DeviceConstants.BaseDevice.AbstractC0341b.g.INSTANCE);
    }

    public int s9(boolean isBle) {
        DeviceConstants.DeviceParams deviceParamsB;
        DeviceConstants.DeviceParams deviceParamsB2;
        if (isBle) {
            if (!ua() || (deviceParamsB2 = DeviceConstants.INSTANCE.B(this.model)) == null) {
                return -1;
            }
            return deviceParamsB2.getDeviceType();
        }
        if (!wa() || (deviceParamsB = DeviceConstants.INSTANCE.B(this.model)) == null) {
            return -1;
        }
        return deviceParamsB.getDeviceType();
    }

    public boolean sa() {
        return M9() || za();
    }

    public final boolean t9() {
        return ((Boolean) this.taycanWatch.getValue()).booleanValue();
    }

    public boolean ta() {
        return (K9() || A9() || ea() || k0()) ? false : true;
    }

    public final boolean u9() {
        return ((Boolean) this.watch1.getValue()).booleanValue();
    }

    public boolean ua() {
        return B9() || M9() || ma();
    }

    public final boolean v9() {
        return ((Boolean) this.watch2.getValue()).booleanValue();
    }

    public boolean va() {
        return (K9() && !M9()) || Da();
    }

    public final boolean w9() {
        return ((Boolean) this.watch3.getValue()).booleanValue();
    }

    public boolean wa() {
        return !ua();
    }

    public final boolean x9() {
        return ((Boolean) this.watch4.getValue()).booleanValue();
    }

    public boolean xa() {
        return (!K9() || Q9() || da()) ? false : true;
    }

    @Override // com.heytap.health.device_manager_base.c
    @Nullable
    public String y4() {
        return this.model;
    }

    public final boolean y9() {
        return ((Boolean) this.watchFree.getValue()).booleanValue();
    }

    public boolean ya() {
        return !(!K9() || M9() || O9()) || ea();
    }

    public final boolean z9() {
        return ((Boolean) this.watchSE.getValue()).booleanValue();
    }

    public boolean za() {
        return (K9() && !M9()) || a2();
    }
}
