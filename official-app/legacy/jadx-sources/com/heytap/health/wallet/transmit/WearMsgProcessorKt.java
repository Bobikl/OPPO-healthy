package com.heytap.health.wallet.transmit;

import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.devicemanager.client.call.DMCallException;
import com.heytap.health.wallet.bean.CardInfo;
import com.heytap.health.wallet.bean.DetectList;
import com.heytap.health.wallet.bean.NtDataDto;
import com.heytap.health.wallet.bean.ProbeDataDto;
import com.heytap.health.wallet.bean.SmartSecretKey;
import com.heytap.health.wallet.model.WatchImageInfo;
import com.oplus.aiunit.vision.aec;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.j7l;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.zk4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oppo.wear.wallet.proto.CapOperation$BoolRlt;
import com.oppo.wear.wallet.proto.CapOperation$DrxConfigMsg;
import com.oppo.wear.wallet.proto.CapOperation$ProbeData;
import com.oppo.wear.wallet.proto.NfcStatusManager$GetWatchApkVersionMessage;
import com.oppo.wear.wallet.proto.NfcStatusManager$NfcStatusMessage;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u001b\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f\u001a\u001b\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0003\u001a\u001b\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0012\u001a\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0012\"\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"", "mac", "c", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "mode", "", "j", "f", b2n.g, "Lcom/oppo/wear/wallet/proto/CapOperation$DrxConfigMsg;", "config", "", "i", "(Lcom/oppo/wear/wallet/proto/CapOperation$DrxConfigMsg;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/heytap/health/wallet/bean/ProbeDataDto;", b2n.f, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/wallet/bean/DetectList;", "rawData", "b", "srvKeys", "a", "Lcom/heytap/health/wallet/bean/SmartSecretKey;", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/wallet/bean/CardInfo;", "d", "MODE_SUPPORT_ICCOA_AGREE", "J", "commonlib_release"}, k = 2, mv = {1, 8, 0})
public final class WearMsgProcessorKt {
    public static final long MODE_SUPPORT_ICCOA_AGREE = 8;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v14, types: [kotlin.jvm.internal.Ref$BooleanRef] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    @Nullable
    public static final Object a(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        WearMsgProcessorKt$checkSectorsBy$1 wearMsgProcessorKt$checkSectorsBy$1;
        Object objM5287constructorimpl;
        Ref.BooleanRef booleanRef;
        if (continuation instanceof WearMsgProcessorKt$checkSectorsBy$1) {
            wearMsgProcessorKt$checkSectorsBy$1 = (WearMsgProcessorKt$checkSectorsBy$1) continuation;
            int i = wearMsgProcessorKt$checkSectorsBy$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wearMsgProcessorKt$checkSectorsBy$1.label = i - Integer.MIN_VALUE;
            } else {
                wearMsgProcessorKt$checkSectorsBy$1 = new WearMsgProcessorKt$checkSectorsBy$1(continuation);
            }
        } else {
            wearMsgProcessorKt$checkSectorsBy$1 = new WearMsgProcessorKt$checkSectorsBy$1(continuation);
        }
        WearMsgProcessorKt$checkSectorsBy$1 wearMsgProcessorKt$checkSectorsBy$2 = wearMsgProcessorKt$checkSectorsBy$1;
        Object objD = wearMsgProcessorKt$checkSectorsBy$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = wearMsgProcessorKt$checkSectorsBy$2.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objD);
                MessageEvent messageEvent = new MessageEvent(12, 33, CapOperation$ProbeData.newBuilder().setProbeData(str).build().toByteArray());
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                Result.Companion companion = Result.INSTANCE;
                zk4 zk4Var = gl4.devicePrimary.callApi;
                String strT = j7l.t();
                Intrinsics.checkNotNullExpressionValue(strT, "getCurrentBluetoothId()");
                wearMsgProcessorKt$checkSectorsBy$2.L$0 = booleanRef2;
                wearMsgProcessorKt$checkSectorsBy$2.label = 1;
                objD = zk4.a.d(zk4Var, strT, messageEvent, null, 65000L, 0, wearMsgProcessorKt$checkSectorsBy$2, 20, null);
                str = booleanRef2;
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ref.BooleanRef booleanRef3 = (Ref.BooleanRef) wearMsgProcessorKt$checkSectorsBy$2.L$0;
                ResultKt.throwOnFailure(objD);
                str = booleanRef3;
            }
            MessageEvent messageEvent2 = (MessageEvent) objD;
            boolean result = CapOperation$BoolRlt.parseFrom(messageEvent2 != null ? messageEvent2.getData() : null).getResult();
            str.element = result;
            t6b.a("checkSectorsBy rlt: " + result);
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
            booleanRef = str;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            booleanRef = str;
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl == null) {
            return Boxing.boxBoolean(booleanRef.element);
        }
        t6b.c("except: " + thM5290exceptionOrNullimpl);
        if (!(thM5290exceptionOrNullimpl instanceof DMCallException)) {
            throw thM5290exceptionOrNullimpl;
        }
        throw new Throwable("checkSectors-" + ((DMCallException) thM5290exceptionOrNullimpl).getErrorCode() + "\n请检查与穿戴设备的蓝牙连接状况后重试");
    }

    @Nullable
    public static final List<ProbeDataDto> b(@Nullable List<? extends DetectList> list) {
        Iterator<? extends DetectList> it;
        DetectList detectList;
        int i;
        List<? extends DetectList> list2 = list;
        int i2 = 0;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends DetectList> it2 = list.iterator();
        while (it2.hasNext()) {
            DetectList next = it2.next();
            t6b.a("req sector no " + next.getSectorIndex() + (!next.isKeyB() ? " keyA" : " keyB"));
            int size = next.size();
            int i3 = i2;
            while (i3 < size) {
                DetectList.Detect byIndex = next.getByIndex(i3);
                t6b.a("req detect " + i3 + " tolerance:" + byIndex.tolerance + " median:" + byIndex.median);
                ArrayList<DetectList.Sample> arrayList2 = byIndex.ntList;
                Intrinsics.checkNotNullExpressionValue(arrayList2, "probe.ntList");
                if (arrayList2.isEmpty()) {
                    t6b.e("req sample is null ");
                    it = it2;
                    detectList = next;
                    i = size;
                } else {
                    ProbeDataDto probeDataDto = new ProbeDataDto();
                    probeDataDto.setMedian(Long.valueOf(byIndex.median));
                    probeDataDto.setSectorNo(Integer.valueOf(next.getSectorIndex()));
                    probeDataDto.setKeyType(next.isKeyB() ? "keyB" : "keyA");
                    ArrayList arrayList3 = new ArrayList();
                    int size2 = arrayList2.size();
                    int i4 = i2;
                    while (i4 < size2) {
                        DetectList.Sample sample = arrayList2.get(i4);
                        long j2 = sample.nt;
                        Iterator<? extends DetectList> it3 = it2;
                        long j3 = sample.ntEnc;
                        int[] iArr = sample.parity;
                        DetectList detectList2 = next;
                        int i5 = iArr[i2];
                        int i6 = iArr[1];
                        int i7 = iArr[2];
                        int i8 = size;
                        StringBuilder sb = new StringBuilder();
                        int i9 = size2;
                        sb.append("req sample ");
                        sb.append(i4);
                        sb.append(" nt:");
                        sb.append(j2);
                        sb.append(" ntEnc:");
                        sb.append(j3);
                        sb.append(" parity{");
                        sb.append(i5);
                        sb.append(",");
                        sb.append(i6);
                        sb.append(",");
                        sb.append(i7);
                        sb.append("}");
                        t6b.a(sb.toString());
                        int[] iArr2 = sample.parity;
                        Integer[] numArr = new Integer[iArr2.length];
                        int length = iArr2.length;
                        for (int i10 = 0; i10 < length; i10++) {
                            numArr[i10] = Integer.valueOf(sample.parity[i10]);
                        }
                        arrayList3.add(new NtDataDto(Long.valueOf(sample.nt), Long.valueOf(sample.ntEnc), numArr));
                        i4++;
                        it2 = it3;
                        next = detectList2;
                        size = i8;
                        size2 = i9;
                        i2 = 0;
                    }
                    it = it2;
                    detectList = next;
                    i = size;
                    probeDataDto.setNtsSize(Long.valueOf(arrayList2.size()));
                    probeDataDto.setpNtDataDtos(arrayList3);
                    arrayList.add(probeDataDto);
                }
                i3++;
                it2 = it;
                next = detectList;
                size = i;
                i2 = 0;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final Object c(@NotNull String str, @NotNull Continuation<? super String> continuation) throws DMCallException {
        WearMsgProcessorKt$getApkVersion$1 wearMsgProcessorKt$getApkVersion$1;
        Ref.ObjectRef objectRef;
        long j2;
        Object objM5287constructorimpl;
        T t;
        if (continuation instanceof WearMsgProcessorKt$getApkVersion$1) {
            wearMsgProcessorKt$getApkVersion$1 = (WearMsgProcessorKt$getApkVersion$1) continuation;
            int i = wearMsgProcessorKt$getApkVersion$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wearMsgProcessorKt$getApkVersion$1.label = i - Integer.MIN_VALUE;
            } else {
                wearMsgProcessorKt$getApkVersion$1 = new WearMsgProcessorKt$getApkVersion$1(continuation);
            }
        } else {
            wearMsgProcessorKt$getApkVersion$1 = new WearMsgProcessorKt$getApkVersion$1(continuation);
        }
        WearMsgProcessorKt$getApkVersion$1 wearMsgProcessorKt$getApkVersion$2 = wearMsgProcessorKt$getApkVersion$1;
        Object obj = wearMsgProcessorKt$getApkVersion$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = wearMsgProcessorKt$getApkVersion$2.label;
        String str2 = "0";
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            t6b.a("getApkVersion");
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = "0";
            MessageEvent messageEvent = new MessageEvent(12, 15, null);
            zk4 zk4Var = gl4.devicePrimary.callApi;
            wearMsgProcessorKt$getApkVersion$2.L$0 = objectRef2;
            wearMsgProcessorKt$getApkVersion$2.J$0 = jCurrentTimeMillis;
            wearMsgProcessorKt$getApkVersion$2.label = 1;
            Object objD = zk4.a.d(zk4Var, str, messageEvent, null, 10000L, 0, wearMsgProcessorKt$getApkVersion$2, 20, null);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
            obj = objD;
            j2 = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = wearMsgProcessorKt$getApkVersion$2.J$0;
            objectRef = (Ref.ObjectRef) wearMsgProcessorKt$getApkVersion$2.L$0;
            ResultKt.throwOnFailure(obj);
        }
        MessageEvent messageEvent2 = (MessageEvent) obj;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(NfcStatusManager$GetWatchApkVersionMessage.parseFrom(messageEvent2 != null ? messageEvent2.getData() : null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m5294isSuccessimpl(objM5287constructorimpl)) {
            NfcStatusManager$GetWatchApkVersionMessage nfcStatusManager$GetWatchApkVersionMessage = (NfcStatusManager$GetWatchApkVersionMessage) objM5287constructorimpl;
            String watchApkVersion = nfcStatusManager$GetWatchApkVersionMessage.getWatchApkVersion();
            if (watchApkVersion != null) {
                t = str2;
                Intrinsics.checkNotNullExpressionValue(watchApkVersion, "value.watchApkVersion ?: \"0\"");
                t = watchApkVersion;
            }
            t = str2;
            objectRef.element = t;
            aec.x(new WatchImageInfo(nfcStatusManager$GetWatchApkVersionMessage.getPixelX(), nfcStatusManager$GetWatchApkVersionMessage.getPixelY()));
            boolean zJ = j(nfcStatusManager$GetWatchApkVersionMessage.getIccoaFeatureBitmap());
            aec.v(zJ);
            t6b.a("getApkVersion: " + objectRef.element + ", time pixel: " + nfcStatusManager$GetWatchApkVersionMessage.getPixelX() + ", isSupportICCOAAgree: " + zJ + ", value.iccoaFeatureBitmap: " + nfcStatusManager$GetWatchApkVersionMessage.getIccoaFeatureBitmap());
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            t6b.c("getApkVersion parse failed: " + thM5290exceptionOrNullimpl.getMessage() + ", set isSupportAgree to false");
            aec.v(false);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        t6b.a("getApkVersion: " + objectRef.element + ", time cost: " + (jCurrentTimeMillis2 - j2));
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final Object d(@NotNull Continuation<? super CardInfo> continuation) {
        WearMsgProcessorKt$getCardInfoFrmDev$1 wearMsgProcessorKt$getCardInfoFrmDev$1;
        Ref.ObjectRef objectRef;
        Throwable th;
        Object objM5287constructorimpl;
        if (continuation instanceof WearMsgProcessorKt$getCardInfoFrmDev$1) {
            wearMsgProcessorKt$getCardInfoFrmDev$1 = (WearMsgProcessorKt$getCardInfoFrmDev$1) continuation;
            int i = wearMsgProcessorKt$getCardInfoFrmDev$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wearMsgProcessorKt$getCardInfoFrmDev$1.label = i - Integer.MIN_VALUE;
            } else {
                wearMsgProcessorKt$getCardInfoFrmDev$1 = new WearMsgProcessorKt$getCardInfoFrmDev$1(continuation);
            }
        } else {
            wearMsgProcessorKt$getCardInfoFrmDev$1 = new WearMsgProcessorKt$getCardInfoFrmDev$1(continuation);
        }
        WearMsgProcessorKt$getCardInfoFrmDev$1 wearMsgProcessorKt$getCardInfoFrmDev$2 = wearMsgProcessorKt$getCardInfoFrmDev$1;
        Object obj = wearMsgProcessorKt$getCardInfoFrmDev$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = wearMsgProcessorKt$getCardInfoFrmDev$2.label;
        T t = 0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            MessageEvent messageEvent = new MessageEvent(12, 35, null);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                Result.Companion companion = Result.INSTANCE;
                zk4 zk4Var = gl4.devicePrimary.callApi;
                String strT = j7l.t();
                Intrinsics.checkNotNullExpressionValue(strT, "getCurrentBluetoothId()");
                wearMsgProcessorKt$getCardInfoFrmDev$2.L$0 = objectRef2;
                wearMsgProcessorKt$getCardInfoFrmDev$2.label = 1;
                Object objD = zk4.a.d(zk4Var, strT, messageEvent, null, 65000L, 0, wearMsgProcessorKt$getCardInfoFrmDev$2, 20, null);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
                obj = objD;
            } catch (Throwable th2) {
                objectRef = objectRef2;
                th = th2;
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) wearMsgProcessorKt$getCardInfoFrmDev$2.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion3 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
        }
        MessageEvent messageEvent2 = (MessageEvent) obj;
        CapOperation$ProbeData from = CapOperation$ProbeData.parseFrom(messageEvent2 != null ? messageEvent2.getData() : null);
        if (from != null) {
            t6b.a("cardInfo from Dev: " + from.getProbeData());
            t = (CardInfo) GsonUtil.a(from.getProbeData(), CardInfo.class);
        }
        objectRef.element = t;
        t6b.a("cardInfo: " + t);
        objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl == null) {
            return objectRef.element;
        }
        t6b.c("except: " + thM5290exceptionOrNullimpl);
        if (!(thM5290exceptionOrNullimpl instanceof DMCallException)) {
            throw thM5290exceptionOrNullimpl;
        }
        throw new Throwable("getCardInfo-" + ((DMCallException) thM5290exceptionOrNullimpl).getErrorCode() + "\n请检查与穿戴设备的蓝牙连接状况后重试");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.util.ArrayList] */
    @Nullable
    public static final Object e(@NotNull Continuation<? super List<SmartSecretKey>> continuation) throws Throwable {
        WearMsgProcessorKt$getCorrectKeysFrmDev$1 wearMsgProcessorKt$getCorrectKeysFrmDev$1;
        Ref.ObjectRef objectRef;
        Throwable th;
        Object objM5287constructorimpl;
        if (continuation instanceof WearMsgProcessorKt$getCorrectKeysFrmDev$1) {
            wearMsgProcessorKt$getCorrectKeysFrmDev$1 = (WearMsgProcessorKt$getCorrectKeysFrmDev$1) continuation;
            int i = wearMsgProcessorKt$getCorrectKeysFrmDev$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wearMsgProcessorKt$getCorrectKeysFrmDev$1.label = i - Integer.MIN_VALUE;
            } else {
                wearMsgProcessorKt$getCorrectKeysFrmDev$1 = new WearMsgProcessorKt$getCorrectKeysFrmDev$1(continuation);
            }
        } else {
            wearMsgProcessorKt$getCorrectKeysFrmDev$1 = new WearMsgProcessorKt$getCorrectKeysFrmDev$1(continuation);
        }
        WearMsgProcessorKt$getCorrectKeysFrmDev$1 wearMsgProcessorKt$getCorrectKeysFrmDev$2 = wearMsgProcessorKt$getCorrectKeysFrmDev$1;
        Object obj = wearMsgProcessorKt$getCorrectKeysFrmDev$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = wearMsgProcessorKt$getCorrectKeysFrmDev$2.label;
        T tC = 0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            MessageEvent messageEvent = new MessageEvent(12, 34, null);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = new ArrayList();
            try {
                Result.Companion companion = Result.INSTANCE;
                zk4 zk4Var = gl4.devicePrimary.callApi;
                String strT = j7l.t();
                Intrinsics.checkNotNullExpressionValue(strT, "getCurrentBluetoothId()");
                wearMsgProcessorKt$getCorrectKeysFrmDev$2.L$0 = objectRef2;
                wearMsgProcessorKt$getCorrectKeysFrmDev$2.label = 1;
                Object objD = zk4.a.d(zk4Var, strT, messageEvent, null, 65000L, 0, wearMsgProcessorKt$getCorrectKeysFrmDev$2, 20, null);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
                obj = objD;
            } catch (Throwable th2) {
                objectRef = objectRef2;
                th = th2;
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) wearMsgProcessorKt$getCorrectKeysFrmDev$2.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion3 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
        }
        MessageEvent messageEvent2 = (MessageEvent) obj;
        CapOperation$ProbeData from = CapOperation$ProbeData.parseFrom(messageEvent2 != null ? messageEvent2.getData() : null);
        if (from != null) {
            t6b.a("smartSecretKeys from Dev: " + from.getProbeData());
            tC = GsonUtil.c(from.getProbeData(), SmartSecretKey.class);
        }
        objectRef.element = tC;
        t6b.a("correctKeys: " + tC);
        objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl == null) {
            return objectRef.element;
        }
        t6b.c("except: " + thM5290exceptionOrNullimpl);
        if (!(thM5290exceptionOrNullimpl instanceof DMCallException)) {
            throw thM5290exceptionOrNullimpl;
        }
        throw new Throwable("getCorrectKeys-" + ((DMCallException) thM5290exceptionOrNullimpl).getErrorCode() + "\n请检查与穿戴设备的蓝牙连接状况后重试");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public static final Object f(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) throws DMCallException {
        WearMsgProcessorKt$getNfcEnabled$1 wearMsgProcessorKt$getNfcEnabled$1;
        Ref.BooleanRef booleanRef;
        long j2;
        Object objM5287constructorimpl;
        if (continuation instanceof WearMsgProcessorKt$getNfcEnabled$1) {
            wearMsgProcessorKt$getNfcEnabled$1 = (WearMsgProcessorKt$getNfcEnabled$1) continuation;
            int i = wearMsgProcessorKt$getNfcEnabled$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wearMsgProcessorKt$getNfcEnabled$1.label = i - Integer.MIN_VALUE;
            } else {
                wearMsgProcessorKt$getNfcEnabled$1 = new WearMsgProcessorKt$getNfcEnabled$1(continuation);
            }
        } else {
            wearMsgProcessorKt$getNfcEnabled$1 = new WearMsgProcessorKt$getNfcEnabled$1(continuation);
        }
        WearMsgProcessorKt$getNfcEnabled$1 wearMsgProcessorKt$getNfcEnabled$2 = wearMsgProcessorKt$getNfcEnabled$1;
        Object obj = wearMsgProcessorKt$getNfcEnabled$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = wearMsgProcessorKt$getNfcEnabled$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            t6b.a("getNfcEnabled");
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            MessageEvent messageEvent = new MessageEvent(12, 14, null);
            zk4 zk4Var = gl4.devicePrimary.callApi;
            wearMsgProcessorKt$getNfcEnabled$2.L$0 = booleanRef2;
            wearMsgProcessorKt$getNfcEnabled$2.J$0 = jCurrentTimeMillis;
            wearMsgProcessorKt$getNfcEnabled$2.label = 1;
            Object objD = zk4.a.d(zk4Var, str, messageEvent, null, 10000L, 0, wearMsgProcessorKt$getNfcEnabled$2, 20, null);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            booleanRef = booleanRef2;
            obj = objD;
            j2 = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = wearMsgProcessorKt$getNfcEnabled$2.J$0;
            booleanRef = (Ref.BooleanRef) wearMsgProcessorKt$getNfcEnabled$2.L$0;
            ResultKt.throwOnFailure(obj);
        }
        MessageEvent messageEvent2 = (MessageEvent) obj;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(NfcStatusManager$NfcStatusMessage.parseFrom(messageEvent2 != null ? messageEvent2.getData() : null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m5294isSuccessimpl(objM5287constructorimpl)) {
            booleanRef.element = ((NfcStatusManager$NfcStatusMessage) objM5287constructorimpl).getIsNfcOpen();
            objM5287constructorimpl = Unit.INSTANCE;
        }
        Result.m5287constructorimpl(objM5287constructorimpl);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        t6b.a("getNfcEnabled: " + booleanRef.element + ", time cost: " + (jCurrentTimeMillis2 - j2));
        return Boxing.boxBoolean(booleanRef.element);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final Object g(@NotNull Continuation<? super List<? extends ProbeDataDto>> continuation) throws Throwable {
        WearMsgProcessorKt$getProbeFromDev$1 wearMsgProcessorKt$getProbeFromDev$1;
        Ref.ObjectRef objectRef;
        Throwable th;
        Object objM5287constructorimpl;
        if (continuation instanceof WearMsgProcessorKt$getProbeFromDev$1) {
            wearMsgProcessorKt$getProbeFromDev$1 = (WearMsgProcessorKt$getProbeFromDev$1) continuation;
            int i = wearMsgProcessorKt$getProbeFromDev$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wearMsgProcessorKt$getProbeFromDev$1.label = i - Integer.MIN_VALUE;
            } else {
                wearMsgProcessorKt$getProbeFromDev$1 = new WearMsgProcessorKt$getProbeFromDev$1(continuation);
            }
        } else {
            wearMsgProcessorKt$getProbeFromDev$1 = new WearMsgProcessorKt$getProbeFromDev$1(continuation);
        }
        WearMsgProcessorKt$getProbeFromDev$1 wearMsgProcessorKt$getProbeFromDev$2 = wearMsgProcessorKt$getProbeFromDev$1;
        Object obj = wearMsgProcessorKt$getProbeFromDev$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = wearMsgProcessorKt$getProbeFromDev$2.label;
        T tC = 0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            MessageEvent messageEvent = new MessageEvent(12, 32, null);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                Result.Companion companion = Result.INSTANCE;
                zk4 zk4Var = gl4.devicePrimary.callApi;
                String strT = j7l.t();
                Intrinsics.checkNotNullExpressionValue(strT, "getCurrentBluetoothId()");
                wearMsgProcessorKt$getProbeFromDev$2.L$0 = objectRef2;
                wearMsgProcessorKt$getProbeFromDev$2.label = 1;
                Object objD = zk4.a.d(zk4Var, strT, messageEvent, null, 120000L, 0, wearMsgProcessorKt$getProbeFromDev$2, 20, null);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
                obj = objD;
            } catch (Throwable th2) {
                objectRef = objectRef2;
                th = th2;
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) wearMsgProcessorKt$getProbeFromDev$2.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion3 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
        }
        MessageEvent messageEvent2 = (MessageEvent) obj;
        CapOperation$ProbeData from = CapOperation$ProbeData.parseFrom(messageEvent2 != null ? messageEvent2.getData() : null);
        if (from != null) {
            t6b.a("probeData from Dev: " + from + ".probeData");
            tC = GsonUtil.c(from.getProbeData(), DetectList.class);
        }
        objectRef.element = tC;
        t6b.a("proData: " + tC);
        objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl == null) {
            return b((List) objectRef.element);
        }
        t6b.c("except: " + thM5290exceptionOrNullimpl);
        if (!(thM5290exceptionOrNullimpl instanceof DMCallException)) {
            throw thM5290exceptionOrNullimpl;
        }
        throw new Throwable("getProbe-" + ((DMCallException) thM5290exceptionOrNullimpl).getErrorCode() + "\n请检查与穿戴设备的蓝牙连接状况后重试");
    }

    @NotNull
    public static final String h(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        t6b.a("initCplc");
        String strJ = aec.j(mac);
        Intrinsics.checkNotNullExpressionValue(strJ, "getDevCplc(mac)");
        return strJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object i(@NotNull CapOperation$DrxConfigMsg capOperation$DrxConfigMsg, @NotNull Continuation<? super Unit> continuation) {
        WearMsgProcessorKt$sendConfToDev$1 wearMsgProcessorKt$sendConfToDev$1;
        if (continuation instanceof WearMsgProcessorKt$sendConfToDev$1) {
            wearMsgProcessorKt$sendConfToDev$1 = (WearMsgProcessorKt$sendConfToDev$1) continuation;
            int i = wearMsgProcessorKt$sendConfToDev$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wearMsgProcessorKt$sendConfToDev$1.label = i - Integer.MIN_VALUE;
            } else {
                wearMsgProcessorKt$sendConfToDev$1 = new WearMsgProcessorKt$sendConfToDev$1(continuation);
            }
        } else {
            wearMsgProcessorKt$sendConfToDev$1 = new WearMsgProcessorKt$sendConfToDev$1(continuation);
        }
        WearMsgProcessorKt$sendConfToDev$1 wearMsgProcessorKt$sendConfToDev$2 = wearMsgProcessorKt$sendConfToDev$1;
        Object obj = wearMsgProcessorKt$sendConfToDev$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = wearMsgProcessorKt$sendConfToDev$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            MessageEvent messageEvent = new MessageEvent(12, 30, capOperation$DrxConfigMsg.toByteArray());
            zk4 zk4Var = gl4.devicePrimary.callApi;
            String strT = j7l.t();
            Intrinsics.checkNotNullExpressionValue(strT, "getCurrentBluetoothId()");
            wearMsgProcessorKt$sendConfToDev$2.label = 1;
            if (zk4.a.d(zk4Var, strT, messageEvent, null, 10000L, 0, wearMsgProcessorKt$sendConfToDev$2, 20, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        t6b.a("sendConfToDev finish!");
        return Unit.INSTANCE;
    }

    public static final boolean j(long j2) {
        return (j2 & 8) == 8;
    }
}
