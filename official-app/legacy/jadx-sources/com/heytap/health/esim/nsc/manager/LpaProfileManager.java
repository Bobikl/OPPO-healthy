package com.heytap.health.esim.nsc.manager;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.esim.nsc.dto.NetWorkServiceNetSource;
import com.heytap.health.esim.nsc.repo.DeviceRepo;
import com.heytap.wearable.lpa.proto.LPASyncProto;
import com.oplus.aiunit.vision.CardInfo;
import com.oplus.aiunit.vision.Profile;
import com.oplus.aiunit.vision.bm5;
import com.oplus.aiunit.vision.dkf;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.rl4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u001d\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/esim/nsc/manager/LpaProfileManager;", "Lcom/oplus/aiunit/vision/rl4$b;", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "", "onMessageReceived", "b", "Lcom/oplus/aiunit/vision/dye;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "i", "Ljava/util/Map;", "profileCaches", "Lkotlinx/coroutines/sync/Mutex;", "j", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLpaProfileManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LpaProfileManager.kt\ncom/heytap/health/esim/nsc/manager/LpaProfileManager\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,99:1\n372#2,7:100\n*S KotlinDebug\n*F\n+ 1 LpaProfileManager.kt\ncom/heytap/health/esim/nsc/manager/LpaProfileManager\n*L\n57#1:100,7\n*E\n"})
public final class LpaProfileManager implements rl4.b {
    public static final int $stable;

    @NotNull
    public static final LpaProfileManager INSTANCE;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static Map<String, Profile> profileCaches;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Mutex mutex;

    static {
        LpaProfileManager lpaProfileManager = new LpaProfileManager();
        INSTANCE = lpaProfileManager;
        bm5 bm5Var = gl4.devicePrimary;
        bm5Var.messageApi.f(14, 4, lpaProfileManager);
        bm5Var.messageApi.f(14, 2, lpaProfileManager);
        bm5Var.messageApi.f(14, 5, lpaProfileManager);
        profileCaches = new LinkedHashMap();
        mutex = MutexKt.Mutex$default(false, 1, null);
        $stable = 8;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b9 A[Catch: all -> 0x0063, Exception -> 0x0066, Merged into TryCatch #0 {all -> 0x0063, Exception -> 0x0066, blocks: (B:14:0x0040, B:45:0x0124, B:47:0x0163, B:50:0x0192, B:49:0x0170, B:53:0x019b, B:19:0x005a, B:38:0x00ad, B:40:0x00b9, B:41:0x00de, B:29:0x0083, B:31:0x008b, B:34:0x0099), top: B:58:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00de A[Catch: all -> 0x0063, Exception -> 0x0066, Merged into TryCatch #0 {all -> 0x0063, Exception -> 0x0066, blocks: (B:14:0x0040, B:45:0x0124, B:47:0x0163, B:50:0x0192, B:49:0x0170, B:53:0x019b, B:19:0x005a, B:38:0x00ad, B:40:0x00b9, B:41:0x00de, B:29:0x0083, B:31:0x008b, B:34:0x0099), top: B:58:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x011e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x011f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0163 A[Catch: all -> 0x0063, Exception -> 0x0066, Merged into TryCatch #0 {all -> 0x0063, Exception -> 0x0066, blocks: (B:14:0x0040, B:45:0x0124, B:47:0x0163, B:50:0x0192, B:49:0x0170, B:53:0x019b, B:19:0x005a, B:38:0x00ad, B:40:0x00b9, B:41:0x00de, B:29:0x0083, B:31:0x008b, B:34:0x0099), top: B:58:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0170 A[Catch: all -> 0x0063, Exception -> 0x0066, Merged into TryCatch #0 {all -> 0x0063, Exception -> 0x0066, blocks: (B:14:0x0040, B:45:0x0124, B:47:0x0163, B:50:0x0192, B:49:0x0170, B:53:0x019b, B:19:0x005a, B:38:0x00ad, B:40:0x00b9, B:41:0x00de, B:29:0x0083, B:31:0x008b, B:34:0x0099), top: B:58:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x00b9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x00de, please report this as an issue */
    @Nullable
    public final Object a(@NotNull String str, @NotNull Continuation<? super Profile> continuation) {
        LpaProfileManager$getProfile$1 lpaProfileManager$getProfile$1;
        String str2;
        Map<String, Profile> map;
        Profile dyeVar;
        DeviceRepo deviceRepo;
        Map<String, Profile> map2;
        List<LPASyncProto.LPAProfile> profiles;
        LPASyncProto.LPAProfile lPAProfile;
        Object objI;
        LPASyncProto.LPAProfile lPAProfile2;
        String str3;
        Map<String, Profile> map3;
        DeviceRepo deviceRepo2;
        CardInfo cardInfo;
        Profile dyeVar2;
        if (continuation instanceof LpaProfileManager$getProfile$1) {
            lpaProfileManager$getProfile$1 = (LpaProfileManager$getProfile$1) continuation;
            int i = lpaProfileManager$getProfile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lpaProfileManager$getProfile$1.label = i - Integer.MIN_VALUE;
            } else {
                lpaProfileManager$getProfile$1 = new LpaProfileManager$getProfile$1(this, continuation);
            }
        } else {
            lpaProfileManager$getProfile$1 = new LpaProfileManager$getProfile$1(this, continuation);
        }
        Object obj = lpaProfileManager$getProfile$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = lpaProfileManager$getProfile$1.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    str2 = (String) lpaProfileManager$getProfile$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i2 == 2) {
                        DeviceRepo deviceRepo3 = (DeviceRepo) lpaProfileManager$getProfile$1.L$2;
                        map2 = (Map) lpaProfileManager$getProfile$1.L$1;
                        String str4 = (String) lpaProfileManager$getProfile$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        deviceRepo = deviceRepo3;
                        str2 = str4;
                        profiles = ((LPASyncProto.GetEsimInfo) obj).getProfileDataList();
                        if (profiles.size() < 1) {
                            dkf.INSTANCE.a("LpaProfileObserver -> getProfile in device size 0: " + profiles);
                            dyeVar = new Profile(false, false, null, 3, null);
                            map = map2;
                        } else {
                            dkf.INSTANCE.a("LpaProfileObserver -> getProfile in device size: " + profiles.size());
                            Intrinsics.checkNotNullExpressionValue(profiles, "profiles");
                            lPAProfile = (LPASyncProto.LPAProfile) CollectionsKt___CollectionsKt.first((List) profiles);
                            NetWorkServiceNetSource netWorkServiceNetSource = NetWorkServiceNetSource.INSTANCE;
                            String profileIccid = lPAProfile.getProfileIccid();
                            Intrinsics.checkNotNullExpressionValue(profileIccid, "lpaProfile.profileIccid");
                            lpaProfileManager$getProfile$1.L$0 = str2;
                            lpaProfileManager$getProfile$1.L$1 = map2;
                            lpaProfileManager$getProfile$1.L$2 = deviceRepo;
                            lpaProfileManager$getProfile$1.L$3 = lPAProfile;
                            lpaProfileManager$getProfile$1.label = 3;
                            objI = netWorkServiceNetSource.i(profileIccid, lpaProfileManager$getProfile$1);
                            if (objI == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            lPAProfile2 = lPAProfile;
                            obj = objI;
                            str3 = str2;
                            map3 = map2;
                            deviceRepo2 = deviceRepo;
                        }
                        map.put(str2, dyeVar);
                        Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
                        return dyeVar;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lPAProfile2 = (LPASyncProto.LPAProfile) lpaProfileManager$getProfile$1.L$3;
                    DeviceRepo deviceRepo4 = (DeviceRepo) lpaProfileManager$getProfile$1.L$2;
                    map3 = (Map) lpaProfileManager$getProfile$1.L$1;
                    str3 = (String) lpaProfileManager$getProfile$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    deviceRepo2 = deviceRepo4;
                }
                cardInfo = (CardInfo) obj;
                dkf.INSTANCE.a("LpaProfileObserver -> getProfile cardInfo-> eSim:" + cardInfo.getEsim() + " self:" + cardInfo.getSelf() + "，profileType:" + lPAProfile2.getProfileType() + "}");
                if (cardInfo.getEsim()) {
                    dyeVar2 = new Profile(cardInfo.getSelf(), true, lPAProfile2);
                } else {
                    BuildersKt__Builders_commonKt.launch$default(NSCScope.INSTANCE, null, null, new LpaProfileManager$getProfile$2$1(lPAProfile2, deviceRepo2, str3, cardInfo, null), 3, null);
                    dyeVar2 = new Profile(cardInfo.getSelf(), false, lPAProfile2);
                }
                dyeVar = dyeVar2;
                map = map3;
                str2 = str3;
                map.put(str2, dyeVar);
                Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
                return dyeVar;
            }
            ResultKt.throwOnFailure(obj);
            Mutex mutex2 = mutex;
            str2 = str;
            lpaProfileManager$getProfile$1.L$0 = str2;
            lpaProfileManager$getProfile$1.label = 1;
            if (Mutex.DefaultImpls.lock$default(mutex2, null, lpaProfileManager$getProfile$1, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            map = profileCaches;
            dyeVar = map.get(str2);
            if (dyeVar == null) {
                deviceRepo = new DeviceRepo();
                if (DeviceRepo.e(deviceRepo, null, 1, null)) {
                    lpaProfileManager$getProfile$1.L$0 = str2;
                    lpaProfileManager$getProfile$1.L$1 = map;
                    lpaProfileManager$getProfile$1.L$2 = deviceRepo;
                    lpaProfileManager$getProfile$1.label = 2;
                    Object objI2 = deviceRepo.i(str2, lpaProfileManager$getProfile$1);
                    if (objI2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    map2 = map;
                    obj = objI2;
                    profiles = ((LPASyncProto.GetEsimInfo) obj).getProfileDataList();
                    if (profiles.size() < 1) {
                        dkf.INSTANCE.a("LpaProfileObserver -> getProfile in device size 0: " + profiles);
                        dyeVar = new Profile(false, false, null, 3, null);
                        map = map2;
                    } else {
                        dkf.INSTANCE.a("LpaProfileObserver -> getProfile in device size: " + profiles.size());
                        Intrinsics.checkNotNullExpressionValue(profiles, "profiles");
                        lPAProfile = (LPASyncProto.LPAProfile) CollectionsKt___CollectionsKt.first((List) profiles);
                        NetWorkServiceNetSource netWorkServiceNetSource2 = NetWorkServiceNetSource.INSTANCE;
                        String profileIccid2 = lPAProfile.getProfileIccid();
                        Intrinsics.checkNotNullExpressionValue(profileIccid2, "lpaProfile.profileIccid");
                        lpaProfileManager$getProfile$1.L$0 = str2;
                        lpaProfileManager$getProfile$1.L$1 = map2;
                        lpaProfileManager$getProfile$1.L$2 = deviceRepo;
                        lpaProfileManager$getProfile$1.L$3 = lPAProfile;
                        lpaProfileManager$getProfile$1.label = 3;
                        objI = netWorkServiceNetSource2.i(profileIccid2, lpaProfileManager$getProfile$1);
                        if (objI == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        lPAProfile2 = lPAProfile;
                        obj = objI;
                        str3 = str2;
                        map3 = map2;
                        deviceRepo2 = deviceRepo;
                        cardInfo = (CardInfo) obj;
                        dkf.INSTANCE.a("LpaProfileObserver -> getProfile cardInfo-> eSim:" + cardInfo.getEsim() + " self:" + cardInfo.getSelf() + "，profileType:" + lPAProfile2.getProfileType() + "}");
                        if (cardInfo.getEsim()) {
                            dyeVar2 = new Profile(cardInfo.getSelf(), true, lPAProfile2);
                        } else {
                            BuildersKt__Builders_commonKt.launch$default(NSCScope.INSTANCE, null, null, new LpaProfileManager$getProfile$2$1(lPAProfile2, deviceRepo2, str3, cardInfo, null), 3, null);
                            dyeVar2 = new Profile(cardInfo.getSelf(), false, lPAProfile2);
                        }
                        dyeVar = dyeVar2;
                        map = map3;
                        str2 = str3;
                    }
                } else {
                    dyeVar = null;
                }
                map.put(str2, dyeVar);
            }
            Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
            return dyeVar;
        } catch (Exception e2) {
            dkf.INSTANCE.a("LpaProfileObserver -> getProfile error -> " + e2.getMessage());
            return null;
        } finally {
            Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
        }
    }

    public final void b(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        profileCaches.remove(mac);
    }

    @Override // com.oplus.aiunit.vision.rl4.b
    public void onMessageReceived(@NotNull String mac, @NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(event, "event");
        dkf.INSTANCE.a("LpaProfileObserver.onMessageReceived() commandId:" + event.getCommandId());
        profileCaches.remove(mac);
    }
}
