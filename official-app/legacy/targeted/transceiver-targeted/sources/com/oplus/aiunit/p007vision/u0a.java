package com.oplus.aiunit.p007vision;

import android.app.Notification;
import android.app.RemoteInput;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.heytap.health.device_data_sync.sleep.IDoNotDisturbService;
import com.heytap.health.watch.notification.DismissNotificationProto;
import com.heytap.health.watch.notification.HealthNotificationBean;
import com.heytap.health.watch.notification.MessageStyle;
import com.heytap.health.watch.notification.MsgPictureProto;
import com.heytap.health.watch.notification.NTFCmdId2;
import com.heytap.health.watch.notification.NotificationStyleProto;
import com.heytap.health.watch.notification.ParsedNotificationActionProto;
import com.heytap.health.watch.notification.ParsedNotificationProto;
import com.heytap.health.watch.notification.ParsedRemoteInputProto;
import com.heytap.health.watch.notification.SimpleNotificationProto;
import com.heytap.health.watch.notification.StandardStyleProto;
import com.heytap.health.watch.notification.impl.R$string;
import com.heytap.health.watch.notification.impl.fluid.FluidAppInfo;
import com.heytap.health.watch.notification.impl.fluid.FluidConfigCenter;
import com.heytap.health.watch.notification.impl.module.NotificationModule;
import com.heytap.health.watch.notification.impl.transceiver.WeChatConfig;
import com.heytap.health.watchpair.family.personalInfo.FamilyPersonalInfoActivity;
import com.heytap.log.config.StdDtoConst;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.rl4;
import com.oplus.aiunit.vision.x0;
import com.oplus.backup.sdk.common.utils.Constants;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\dex\classes19.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010.J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J \u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J \u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J8\u0010#\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001fH\u0002J\u0010\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010,\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u0014H\u0002¨\u0006/"}, d2 = {"Lcom/oplus/aiunit/vision/u0a;", "Lcom/oplus/aiunit/vision/oa4;", "Lcom/heytap/health/watch/notification/HealthNotificationBean;", "hnb", "Landroid/os/Bundle;", "watchPush", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", LogFieldKey.MESSAGE_KEY, "Lcom/heytap/health/watch/notification/impl/transceiver/WeChatConfig;", Constants.MessagerConstants.CONFIG_KEY, "n", "g", "j", "a", "b", "", "D", "Lcom/oplus/aiunit/vision/na4;", "callback", "H", "", "cacheKey", "Lcom/heytap/health/watch/notification/ParsedNotificationProto$Builder;", "build", "N", "G", FamilyPersonalInfoActivity.SEX_M, "", "bytes", "picKey", "picType", "", "height", "width", "cid", "O", "Lcom/heytap/health/watch/notification/NotificationStyleProto;", "J", "", "Lcom/heytap/health/watch/notification/ParsedNotificationActionProto;", "F", "K", "I", StdDtoConst.ACTION_KEY, "L", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIWatchConverterWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IWatchConverterWorker.kt\ncom/heytap/health/watch/notification/impl/transceiver/convert/IWatchConverterWorker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,462:1\n1864#2,2:463\n1866#2:468\n13374#3,3:465\n13374#3,2:469\n13374#3,3:471\n13376#3:474\n6143#3,2:475\n13309#3,2:477\n*S KotlinDebug\n*F\n+ 1 IWatchConverterWorker.kt\ncom/heytap/health/watch/notification/impl/transceiver/convert/IWatchConverterWorker\n*L\n346#1:463,2\n346#1:468\n355#1:465,3\n380#1:469,2\n390#1:471,3\n380#1:474\n439#1:475,2\n441#1:477,2\n*E\n"})
public final class u0a extends oa4 {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 IWatchConverterWorker.kt\ncom/heytap/health/watch/notification/impl/transceiver/convert/IWatchConverterWorker\n*L\n1#1,328:1\n439#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Long.valueOf(((StatusBarNotification) t).getPostTime()), Long.valueOf(((StatusBarNotification) t2).getPostTime()));
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"com/oplus/aiunit/vision/u0a$b", "Lcom/oplus/aiunit/vision/na4;", "Lcom/google/protobuf/ByteString;", "str", "", "bytes", "", "width", "height", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements na4 {
        public final /* synthetic */ HealthNotificationBean a;
        public final /* synthetic */ String b;
        public final /* synthetic */ u0a c;
        public final /* synthetic */ ParsedNotificationProto.Builder d;

        public b(HealthNotificationBean healthNotificationBean, String str, u0a u0aVar, ParsedNotificationProto.Builder builder) {
            this.a = healthNotificationBean;
            this.b = str;
            this.c = u0aVar;
            this.d = builder;
        }

        @Override // com.oplus.aiunit.p007vision.na4
        public void a(@Nullable ByteString str, @Nullable byte[] bytes, int width, int height) {
            String str2;
            boolean z = false;
            if (bytes != null) {
                if (!(bytes.length == 0)) {
                    z = true;
                }
            }
            if (z) {
                a7b.f("NTF_Converter", "sendFluidIcon onResult: " + bytes.length + ", id: " + this.a.getId());
                if (Intrinsics.areEqual(this.a.getPackageName(), FluidConfigCenter.PICK_UP_SERVICE_PKG)) {
                    str2 = this.b + System.currentTimeMillis();
                } else {
                    str2 = this.b;
                }
                this.c.O(bytes, str2, uvc.PIC_TYPE_LARGE_144, height, width, NTFCmdId2.CID_SEEDING_CARD_PICTURE_VALUE);
                this.d.setLarge144IconBitmap((MsgPictureProto) MsgPictureProto.newBuilder().setPicKey(str2 + uvc.PIC_TYPE_LARGE_144).setPicType(uvc.PIC_TYPE_LARGE_144).build());
            }
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"com/oplus/aiunit/vision/u0a$c", "Lcom/oplus/aiunit/vision/na4;", "Lcom/google/protobuf/ByteString;", "str", "", "bytes", "", "width", "height", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements na4 {
        public final /* synthetic */ String b;
        public final /* synthetic */ ParsedNotificationProto.Builder c;

        public c(String str, ParsedNotificationProto.Builder builder) {
            this.b = str;
            this.c = builder;
        }

        @Override // com.oplus.aiunit.p007vision.na4
        public void a(@Nullable ByteString str, @Nullable byte[] bytes, int width, int height) {
            if (str != null) {
                ParsedNotificationProto.Builder builder = this.c;
                String str2 = this.b;
                builder.setLargeIconBitmap((MsgPictureProto) MsgPictureProto.newBuilder().setPicKey(str2 + uvc.PIC_TYPE_LARGE).setPicType(uvc.PIC_TYPE_LARGE).build());
            }
            if (Intrinsics.areEqual(str, ByteString.EMPTY) || bytes == null) {
                return;
            }
            a7b.f("NTF_Converter", "sendNotificationIcon onResult: " + bytes.length + " " + width);
            u0a.this.O(bytes, this.b, uvc.PIC_TYPE_LARGE, height, width, NTFCmdId2.CID_MSG_PICTURE_VALUE);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/u0a$d", "Lcom/oplus/aiunit/vision/rl4$c;", "", "success", "", "code", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class d implements rl4.c {
        public final /* synthetic */ ByteString a;
        public final /* synthetic */ String b;

        public d(ByteString byteString, String str) {
            this.a = byteString;
            this.b = str;
        }

        public static final void c(ByteString byteString, String str) {
            Intrinsics.checkNotNullParameter(str, "$picKey");
            a7b.f("NTF_Converter", "sendPicture, size=" + byteString.size() + ", picKey=" + str);
        }

        public void a(boolean success, int code) {
            NotificationModule notificationModule = NotificationModule.INSTANCE;
            final ByteString byteString = this.a;
            final String str = this.b;
            notificationModule.q(new Runnable() { // from class: com.oplus.aiunit.vision.v0a
                @Override // java.lang.Runnable
                public final void run() {
                    u0a.d.c(byteString, str);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    @Override // com.oplus.aiunit.p007vision.oa4
    public void D() {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis() - ((long) 60000);
        a7b.f("NTF_Converter", "IWatch resync --> from " + jCurrentTimeMillis);
        StatusBarNotification[] statusBarNotificationArrI = ls8.INSTANCE.i();
        if (statusBarNotificationArrI != null && statusBarNotificationArrI.length > 1) {
            ArraysKt.sortWith(statusBarNotificationArrI, new a());
        }
        if (statusBarNotificationArrI != null) {
            z = (statusBarNotificationArrI.length == 0) ^ true;
        }
        if (z) {
            for (StatusBarNotification statusBarNotification : statusBarNotificationArrI) {
                if (statusBarNotification.getPostTime() > jCurrentTimeMillis) {
                    HealthNotificationBean healthNotificationBeanC = HealthNotificationBean.Companion.c(HealthNotificationBean.INSTANCE, statusBarNotification, null, 2, null);
                    healthNotificationBeanC.setFlags(healthNotificationBeanC.getFlags() | 16777216);
                    gwc.INSTANCE.y(healthNotificationBeanC);
                }
            }
        }
        pwc.INSTANCE.b().clear();
    }

    public final List<ParsedNotificationActionProto> F(HealthNotificationBean hnb) {
        List<ParsedNotificationActionProto> listK = K(hnb);
        if (!listK.isEmpty()) {
            return listK;
        }
        List<ParsedNotificationActionProto> listI = I(hnb);
        if (!listI.isEmpty()) {
            return listI;
        }
        return null;
    }

    public final void G(HealthNotificationBean hnb, na4 callback) {
        Bitmap icon;
        Bitmap bitmapK;
        cvc.b bVarE;
        IconCache iconCacheJ;
        if (Intrinsics.areEqual(hnb.getPackageName(), FluidConfigCenter.PICK_UP_SERVICE_PKG) && (bitmapK = kyc.INSTANCE.k(true, hnb)) != null && (bVarE = oa4.INSTANCE.e()) != null && (iconCacheJ = bVarE.J(null, bitmapK)) != null) {
            a7b.f("NTF_Converter", "getFluidIcon: forceIcon=true, matched");
            callback.a(iconCacheJ.getByteString(), iconCacheJ.getByteArray(), iconCacheJ.getBitmap().getWidth(), iconCacheJ.getBitmap().getHeight());
            return;
        }
        if (s0a.INSTANCE.a(false, hnb.getPackageName())) {
            a7b.f("NTF_Converter", "getFluidIcon: cache icon");
            callback.a(ByteString.EMPTY, null, 0, 0);
            return;
        }
        kyc kycVar = kyc.INSTANCE;
        IconCache iconCacheD = kycVar.d(hnb, 86400000);
        if (iconCacheD != null) {
            callback.a(ByteString.EMPTY, iconCacheD.getByteArray(), 0, 0);
            return;
        }
        Bitmap bitmapF = kycVar.f(hnb.getPackageName());
        if (bitmapF != null) {
            cvc.b bVarE2 = oa4.INSTANCE.e();
            IconCache iconCacheJ2 = bVarE2 != null ? bVarE2.J(hnb, bitmapF) : null;
            if (iconCacheJ2 != null) {
                callback.a(iconCacheJ2.getByteString(), iconCacheJ2.getByteArray(), iconCacheJ2.getBitmap().getWidth(), iconCacheJ2.getBitmap().getHeight());
                return;
            }
        }
        FluidAppInfo fluidAppInfoV = FluidConfigCenter.INSTANCE.v(hnb.getPackageName());
        if (fluidAppInfoV != null && (icon = fluidAppInfoV.getIcon()) != null) {
            cvc.b bVarE3 = oa4.INSTANCE.e();
            IconCache iconCacheZ0 = bVarE3 != null ? bVarE3.Z0(hnb, icon) : null;
            if (iconCacheZ0 != null) {
                callback.a(iconCacheZ0.getByteString(), iconCacheZ0.getByteArray(), iconCacheZ0.getBitmap().getWidth(), iconCacheZ0.getBitmap().getWidth());
                a7b.f("NTF_Converter", "getFluidIcon: all null, get form local");
                return;
            }
        }
        a7b.f("NTF_Converter", "getFluidIcon: all null");
        callback.a(null, null, 0, 0);
    }

    public final void H(HealthNotificationBean hnb, na4 callback) {
        Bitmap icon;
        if (s0a.INSTANCE.a(true, hnb.getPackageName())) {
            a7b.f("NTF_Converter", "getNotificationIcon: cache icon");
            callback.a(ByteString.EMPTY, null, 0, 0);
            return;
        }
        kyc kycVar = kyc.INSTANCE;
        IconCache iconCacheI = kycVar.i(hnb, 86400000);
        if (iconCacheI != null) {
            callback.a(ByteString.EMPTY, iconCacheI.getByteArray(), 0, 0);
            return;
        }
        Bitmap bitmapF = kycVar.f(hnb.getPackageName());
        if (bitmapF != null) {
            cvc.b bVarE = oa4.INSTANCE.e();
            IconCache iconCacheZ0 = bVarE != null ? bVarE.Z0(hnb, bitmapF) : null;
            if (iconCacheZ0 != null) {
                callback.a(iconCacheZ0.getByteString(), iconCacheZ0.getByteArray(), iconCacheZ0.getBitmap().getWidth(), iconCacheZ0.getBitmap().getWidth());
                return;
            }
        }
        FluidAppInfo fluidAppInfoV = FluidConfigCenter.INSTANCE.v(hnb.getPackageName());
        if (fluidAppInfoV != null && (icon = fluidAppInfoV.getIcon()) != null) {
            cvc.b bVarE2 = oa4.INSTANCE.e();
            IconCache iconCacheZ1 = bVarE2 != null ? bVarE2.Z0(hnb, icon) : null;
            if (iconCacheZ1 != null) {
                callback.a(iconCacheZ1.getByteString(), iconCacheZ1.getByteArray(), iconCacheZ1.getBitmap().getWidth(), iconCacheZ1.getBitmap().getWidth());
                a7b.f("NTF_Converter", "getNotificationIcon: all null, get form local");
                return;
            }
        }
        a7b.f("NTF_Converter", "getNotificationIcon: all null");
        callback.a(null, null, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:30:0x0066  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ca  */
    public final List<ParsedNotificationActionProto> I(HealthNotificationBean hnb) {
        boolean z;
        RemoteInput remoteInput;
        boolean z2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        if (!(hnb.getOrigin() instanceof StatusBarNotification)) {
            return arrayList;
        }
        Object origin = hnb.getOrigin();
        Intrinsics.checkNotNull(origin, "null cannot be cast to non-null type android.service.notification.StatusBarNotification");
        Notification.Action[] actionArr = ((StatusBarNotification) origin).getNotification().actions;
        if (actionArr != null) {
            int length = actionArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                Notification.Action action = actionArr[i];
                int i3 = i2 + 1;
                RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (remoteInputs != null) {
                    Intrinsics.checkNotNullExpressionValue(remoteInputs, "inputs");
                    if (!(remoteInputs.length == 0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z && (remoteInput = remoteInputs[remoteInputs.length - 1]) != null) {
                    ParsedRemoteInputProto.Builder builderNewBuilder = ParsedRemoteInputProto.newBuilder();
                    CharSequence label = remoteInput.getLabel();
                    if (label != null) {
                        Intrinsics.checkNotNullExpressionValue(label, "label");
                        if (label.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    builderNewBuilder.setLabel(z2 ? "" : remoteInput.getLabel().toString());
                    builderNewBuilder.setResultKey(remoteInput.getResultKey());
                    ArrayList arrayList2 = new ArrayList();
                    CharSequence[] choices = remoteInput.getChoices();
                    if (choices != null) {
                        Intrinsics.checkNotNullExpressionValue(choices, "choices");
                        int length2 = choices.length;
                        int i4 = 0;
                        int i5 = 0;
                        while (i5 < length2) {
                            arrayList2.add(i4, choices[i5].toString());
                            i5++;
                            i4++;
                        }
                    }
                    builderNewBuilder.addAllChoices(arrayList2);
                    builderNewBuilder.setAllowFreeFormInput(remoteInput.getAllowFreeFormInput());
                    ParsedNotificationActionProto.Builder builderNewBuilder2 = ParsedNotificationActionProto.newBuilder();
                    CharSequence charSequence = action.title;
                    if (charSequence != null) {
                        Intrinsics.checkNotNullExpressionValue(charSequence, "title");
                        z3 = charSequence.length() == 0;
                    }
                    builderNewBuilder2.setTitle(z3 ? "" : action.title.toString());
                    builderNewBuilder2.setIntentId(hnb.getKey() + "^w^" + i2);
                    builderNewBuilder2.setAllowGeneratedReplies(action.getAllowGeneratedReplies());
                    builderNewBuilder2.setRemoteInputs((ParsedRemoteInputProto) builderNewBuilder.build());
                    GeneratedMessageLite generatedMessageLiteBuild = builderNewBuilder2.build();
                    Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "builder.build()");
                    arrayList.add(generatedMessageLiteBuild);
                }
                i++;
                i2 = i3;
            }
        }
        return arrayList;
    }

    public final NotificationStyleProto J(HealthNotificationBean hnb) {
        NotificationStyleProto.Builder builderNewBuilder = NotificationStyleProto.newBuilder();
        builderNewBuilder.setStyleType(String.valueOf(MessageStyle.STYLE_STANDARD.getValue()));
        builderNewBuilder.setStandardStyle((StandardStyleProto) StandardStyleProto.newBuilder().setBody(oa4.INSTANCE.b(hnb)).build());
        GeneratedMessageLite generatedMessageLiteBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "builder.build()");
        return (NotificationStyleProto) generatedMessageLiteBuild;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e6  */
    public final List<ParsedNotificationActionProto> K(HealthNotificationBean hnb) {
        ArrayList parcelableArrayList;
        boolean z;
        RemoteInput remoteInput;
        boolean z2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        if (!(hnb.getOrigin() instanceof StatusBarNotification)) {
            return arrayList;
        }
        Object origin = hnb.getOrigin();
        Intrinsics.checkNotNull(origin, "null cannot be cast to non-null type android.service.notification.StatusBarNotification");
        Bundle bundle = ((StatusBarNotification) origin).getNotification().extras.getBundle("android.wearable.EXTENSIONS");
        if (bundle != null && (parcelableArrayList = bundle.getParcelableArrayList("actions")) != null) {
            int i = 0;
            for (Object obj : parcelableArrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Notification.Action action = (Notification.Action) obj;
                RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (remoteInputs != null) {
                    Intrinsics.checkNotNullExpressionValue(remoteInputs, "inputs");
                    if (!(remoteInputs.length == 0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z && (remoteInput = remoteInputs[remoteInputs.length - 1]) != null) {
                    ParsedRemoteInputProto.Builder builderNewBuilder = ParsedRemoteInputProto.newBuilder();
                    CharSequence label = remoteInput.getLabel();
                    if (label != null) {
                        Intrinsics.checkNotNullExpressionValue(label, "label");
                        if (label.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    builderNewBuilder.setLabel(z2 ? "" : remoteInput.getLabel().toString());
                    builderNewBuilder.setResultKey(remoteInput.getResultKey());
                    ArrayList arrayList2 = new ArrayList();
                    CharSequence[] choices = remoteInput.getChoices();
                    if (choices != null) {
                        Intrinsics.checkNotNullExpressionValue(choices, "choices");
                        int length = choices.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            arrayList2.add(i4, choices[i3].toString());
                            i3++;
                            i4++;
                        }
                    }
                    builderNewBuilder.addAllChoices(arrayList2);
                    builderNewBuilder.setAllowFreeFormInput(remoteInput.getAllowFreeFormInput());
                    ParsedNotificationActionProto.Builder builderNewBuilder2 = ParsedNotificationActionProto.newBuilder();
                    CharSequence charSequence = action.title;
                    if (charSequence != null) {
                        Intrinsics.checkNotNullExpressionValue(charSequence, "title");
                        z3 = charSequence.length() == 0;
                    }
                    builderNewBuilder2.setTitle(z3 ? "" : action.title.toString());
                    builderNewBuilder2.setIntentId(hnb.getKey() + "^w^" + i);
                    builderNewBuilder2.setAllowGeneratedReplies(action.getAllowGeneratedReplies());
                    builderNewBuilder2.setRemoteInputs((ParsedRemoteInputProto) builderNewBuilder.build());
                    GeneratedMessageLite generatedMessageLiteBuild = builderNewBuilder2.build();
                    Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "builder.build()");
                    arrayList.add(generatedMessageLiteBuild);
                }
                i = i2;
            }
        }
        return arrayList;
    }

    public final void L(HealthNotificationBean hnb, ParsedNotificationProto.Builder build, String action) {
        int flags = hnb.getFlags();
        Object objNavigation = x0.d().b("/device_data_sync/DoNotDisturbServiceImpl").navigation();
        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.device_data_sync.sleep.IDoNotDisturbService");
        IDoNotDisturbService iDoNotDisturbService = (IDoNotDisturbService) objNavigation;
        if (iDoNotDisturbService.F1()) {
            flags |= 268435456;
            boolean zF1 = iDoNotDisturbService.F1();
            StringBuilder sb = new StringBuilder();
            sb.append(action);
            sb.append(" resetFlags: ");
            sb.append(zF1);
        }
        build.setFlags(flags);
    }

    public final void M(HealthNotificationBean hnb, String cacheKey, ParsedNotificationProto.Builder build) {
        G(hnb, new b(hnb, cacheKey, this, build));
    }

    public final void N(HealthNotificationBean hnb, String cacheKey, ParsedNotificationProto.Builder build) {
        H(hnb, new c(cacheKey, build));
    }

    public final void O(byte[] bytes, String picKey, String picType, int height, int width, int cid) {
        ByteString byteStringCopyFrom = ByteString.copyFrom(bytes);
        gl4.devicePrimary.b.e(new MessageEvent(2, cid, ((MsgPictureProto) MsgPictureProto.newBuilder().setData(byteStringCopyFrom).setPicKey(picKey + picType).setHeight(height).setWidth(width).setPicType(picType).build()).toByteArray()), new d(byteStringCopyFrom, picKey));
    }

    @Override // com.oplus.aiunit.p007vision.jo9
    @Nullable
    public MessageEvent a(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        String strH = kyc.INSTANCE.h(hnb);
        ParsedNotificationProto.Builder builderZ = z(hnb);
        L(hnb, builderZ, "convertPost");
        N(hnb, strH, builderZ);
        builderZ.setStyle(J(hnb));
        if (hnb.getOrigin() instanceof StatusBarNotification) {
            Object origin = hnb.getOrigin();
            Intrinsics.checkNotNull(origin, "null cannot be cast to non-null type android.service.notification.StatusBarNotification");
            if (((StatusBarNotification) origin).getNotification().contentIntent != null) {
                builderZ.setContentIntentId(hnb.getContentIntentId());
            }
        }
        List<ParsedNotificationActionProto> listF = F(hnb);
        boolean z = false;
        if (listF != null && (!listF.isEmpty())) {
            z = true;
        }
        if (z) {
            builderZ.addAllActions(listF);
        }
        ParsedNotificationProto parsedNotificationProto = (ParsedNotificationProto) builderZ.build();
        StringBuilder sb = new StringBuilder();
        sb.append("IWatch convertPost: ");
        sb.append(parsedNotificationProto);
        MessageEvent messageEvent = new MessageEvent(2, 200, parsedNotificationProto.toByteArray());
        messageEvent.setEncryptOption(2);
        return messageEvent;
    }

    @Override // com.oplus.aiunit.p007vision.jo9
    @NotNull
    public MessageEvent b(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        DismissNotificationProto.Builder builderNewBuilder = DismissNotificationProto.newBuilder();
        SimpleNotificationProto.Builder builderNewBuilder2 = SimpleNotificationProto.newBuilder();
        builderNewBuilder2.setId(hnb.getId());
        builderNewBuilder2.setKey(hnb.getKey());
        builderNewBuilder2.setPkgName(hnb.getPackageName());
        builderNewBuilder2.setTag(hnb.getTag());
        ArrayList arrayList = new ArrayList();
        arrayList.add(builderNewBuilder2.build());
        builderNewBuilder.addAllNtfs(arrayList);
        DismissNotificationProto dismissNotificationProto = (DismissNotificationProto) builderNewBuilder.build();
        StringBuilder sb = new StringBuilder();
        sb.append("IWatch convertRemoved: ");
        sb.append(dismissNotificationProto);
        return new MessageEvent(2, NTFCmdId2.CID_DISMISS_VALUE, dismissNotificationProto.toByteArray());
    }

    @Override // com.oplus.aiunit.p007vision.oa4
    @Nullable
    public MessageEvent g(@NotNull HealthNotificationBean hnb, @NotNull Bundle watchPush) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Intrinsics.checkNotNullParameter(watchPush, "watchPush");
        if (FluidConfigCenter.INSTANCE.s().contains(hnb.getPackageName())) {
            String strH = kyc.INSTANCE.h(hnb);
            ParsedNotificationProto.Builder builderZ = z(hnb);
            L(hnb, builderZ, "convertFluid");
            M(hnb, strH, builderZ);
            return h(hnb, watchPush, builderZ);
        }
        a7b.f("NTF_Converter", "iwatch not support: " + hnb.getPackageName());
        return null;
    }

    @Override // com.oplus.aiunit.p007vision.oa4
    @NotNull
    public MessageEvent j(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        return k(hnb);
    }

    @Override // com.oplus.aiunit.p007vision.oa4
    @Nullable
    public MessageEvent m(@NotNull HealthNotificationBean hnb, @Nullable Bundle watchPush) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        a7b.f("NTF_Converter", "iWatch not support convertPush");
        return null;
    }

    @Override // com.oplus.aiunit.p007vision.oa4
    @NotNull
    public MessageEvent n(@NotNull HealthNotificationBean hnb, @NotNull WeChatConfig config) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Intrinsics.checkNotNullParameter(config, Constants.MessagerConstants.CONFIG_KEY);
        String key = hnb.getKey();
        ParsedNotificationProto.Builder subText = ParsedNotificationProto.newBuilder().setId(hnb.getId()).setFlags(hnb.getFlags()).setTag(hnb.getTag()).setKey(hnb.getKey() + uvc.WECHAT_VOICE).setGroupKey(hnb.getGroupKey()).setPackageName(hnb.getPackageName() + uvc.WECHAT_VOICE).setSubText(hnb.getSubText());
        oa4.Companion companion = oa4.INSTANCE;
        ParsedNotificationProto.Builder title = subText.setAppName(companion.a(hnb)).setBridgeTag(hnb.getBridgeTag()).setPostTimeMillis(hnb.getPostTimeMillis()).setTitle(companion.b(hnb));
        Intrinsics.checkNotNullExpressionValue(title, "build");
        L(hnb, title, "convertWechatVoice");
        N(hnb, key, title);
        NotificationStyleProto.Builder builderNewBuilder = NotificationStyleProto.newBuilder();
        builderNewBuilder.setStandardStyle((StandardStyleProto) StandardStyleProto.newBuilder().setBody(b78.a().getString(R$string.notification_wechat_voice_content)).build());
        builderNewBuilder.setStyleType(String.valueOf(MessageStyle.STYLE_STANDARD.getValue()));
        title.setStyle((NotificationStyleProto) builderNewBuilder.build());
        ParsedNotificationProto parsedNotificationProto = (ParsedNotificationProto) title.build();
        StringBuilder sb = new StringBuilder();
        sb.append("convertWechatVoice: ");
        sb.append(parsedNotificationProto);
        MessageEvent messageEvent = new MessageEvent(2, 200, parsedNotificationProto.toByteArray());
        messageEvent.setEncryptOption(2);
        return messageEvent;
    }
}
