package com.oplus.aiunit.p007vision;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.heytap.health.watch.notification.DismissNotificationProto;
import com.heytap.health.watch.notification.HealthNotificationBean;
import com.heytap.health.watch.notification.ImagesElement;
import com.heytap.health.watch.notification.MessageStyle;
import com.heytap.health.watch.notification.NTFCmdId2;
import com.heytap.health.watch.notification.NotificationRoomBean;
import com.heytap.health.watch.notification.NotificationStyleProto;
import com.heytap.health.watch.notification.ParsedNotificationProto;
import com.heytap.health.watch.notification.ProcessInfo;
import com.heytap.health.watch.notification.SeedingCardStyleProto;
import com.heytap.health.watch.notification.SimpleNotificationProto;
import com.heytap.health.watch.notification.TextElement;
import com.heytap.health.watch.notification.flashback.FlashbackMsg;
import com.heytap.health.watch.notification.impl.R$string;
import com.heytap.health.watch.notification.impl.fluid.FluidAppInfo;
import com.heytap.health.watch.notification.impl.fluid.FluidConfigCenter;
import com.heytap.health.watch.notification.impl.fluid.ImageBean;
import com.heytap.health.watch.notification.impl.fluid.TextBean;
import com.heytap.health.watch.notification.impl.module.NotificationHolder;
import com.heytap.health.watch.notification.impl.transceiver.WeChatConfig;
import com.heytap.health.watch.notification.impl.whitelist.a;
import com.heytap.log.config.StdDtoConst;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.evc;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ra5;
import com.oplus.backup.sdk.common.utils.Constants;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\dex\classes19.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 <2\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b:\u0010;J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\u0016\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013J \u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u0010J \u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010!\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0018\u0010'\u001a\u00020\u00102\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002J\u001a\u0010+\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010*\u001a\u00020(H\u0002J\u0010\u0010-\u001a\u00020#2\u0006\u0010,\u001a\u00020(H\u0002J\u0014\u0010/\u001a\u00020#*\u00020(2\u0006\u0010.\u001a\u00020#H\u0002J\u0014\u00100\u001a\u00020#*\u00020(2\u0006\u0010.\u001a\u00020#H\u0002J\f\u00101\u001a\u00020(*\u00020(H\u0002J\u0018\u00103\u001a\u00020\u00152\u0006\u00102\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u00104\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u00020%H\u0002J \u00105\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u00020%H\u0002R \u00109\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020(068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006="}, d2 = {"Lcom/oplus/aiunit/vision/oa4;", "Lcom/oplus/aiunit/vision/jo9;", "Lcom/heytap/health/watch/notification/HealthNotificationBean;", "hnb", "Landroid/os/Bundle;", "watchPush", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", LogFieldKey.MESSAGE_KEY, "Lcom/heytap/health/watch/notification/impl/transceiver/WeChatConfig;", Constants.MessagerConstants.CONFIG_KEY, "n", "g", "j", "sbn", "", "u", "", "w", "forceIcon", "Lcom/oplus/aiunit/vision/na4;", "callback", "", "r", "D", LogFieldKey.PROCESS_NAME_KEY, "icon144", "v", "Lcom/heytap/health/watch/notification/ParsedNotificationProto$Builder;", "build", "h", "k", "i", LogFieldKey.LEVEL_KEY, "z", "q", "", SpeechConstant.KEY_APP_KEY, "Lcom/heytap/health/watch/notification/SeedingCardStyleProto$Builder;", "currentBuilder", "x", "Lcom/heytap/health/watch/notification/SeedingCardStyleProto;", "last", "current", "y", "card", "o", StdDtoConst.LEVEL_KEY, "s", LogFieldKey.TAG_KEY, c8l.KEY_B, "seedingBuilder", "f", "C", c8l.KEY_A, "Ljava/util/concurrent/ConcurrentHashMap;", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "lastFluidSeedingCardCache", "<init>", "()V", "Companion", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotificationEventConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationEventConverter.kt\ncom/heytap/health/watch/notification/impl/transceiver/convert/ConverterWorker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,731:1\n1#2:732\n288#3,2:733\n288#3,2:735\n1855#3,2:737\n1855#3,2:739\n*S KotlinDebug\n*F\n+ 1 NotificationEventConverter.kt\ncom/heytap/health/watch/notification/impl/transceiver/convert/ConverterWorker\n*L\n498#1:733,2\n502#1:735,2\n586#1:737,2\n599#1:739,2\n*E\n"})
public abstract class oa4 implements jo9 {

    @NotNull
    public static final String TAG = "NTF_Converter";

    @Nullable
    public static cvc.b b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, SeedingCardStyleProto> lastFluidSeedingCardCache = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Map<String, String> c = new LinkedHashMap();

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.oa4$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u0011\u001a\u00020\u0010R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/oplus/aiunit/vision/oa4$a;", "", "Lcom/oplus/wearable/linkservice/sdk/Node;", "node", "Lcom/oplus/aiunit/vision/oa4;", "j", "", "h", "g", "f", "Lcom/heytap/health/watch/notification/HealthNotificationBean;", "sbn", "", "c", "b", "a", "", "d", "Lcom/oplus/aiunit/vision/cvc$b;", "ability", "Lcom/oplus/aiunit/vision/cvc$b;", "e", "()Lcom/oplus/aiunit/vision/cvc$b;", "i", "(Lcom/oplus/aiunit/vision/cvc$b;)V", "TAG", "Ljava/lang/String;", "", "UPDATE_INDICATOR_CHANGED", "I", "UPDATE_INDICATOR_DEFAULT", "", "appNames", "Ljava/util/Map;", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a(@NotNull HealthNotificationBean sbn) {
            String appName;
            Intrinsics.checkNotNullParameter(sbn, "sbn");
            String str = (String) oa4.c.get(sbn.getPackageName());
            if (str != null) {
                if (str.length() > 0) {
                    return str;
                }
            }
            String appName2 = sbn.getAppName();
            NotificationRoomBean notificationRoomBeanP = a.INSTANCE.p(sbn.getPackageName());
            if (notificationRoomBeanP == null || (appName = notificationRoomBeanP.getAppName()) == null) {
                return appName2;
            }
            if (!(appName.length() > 0)) {
                return appName2;
            }
            oa4.c.put(sbn.getPackageName(), appName);
            return appName;
        }

        @NotNull
        public final String b(@NotNull HealthNotificationBean sbn) {
            String strN;
            String strN2;
            Intrinsics.checkNotNullParameter(sbn, "sbn");
            if (k51.INSTANCE.q(sbn)) {
                String strReplaceFirst = new Regex("^\\[\\d+条]").replaceFirst(sbn.getContent(), "");
                cvc.b bVarE = e();
                return (bVarE == null || (strN2 = bVarE.n(strReplaceFirst)) == null) ? strReplaceFirst : strN2;
            }
            if (!Intrinsics.areEqual("com.coloros.weather.service", sbn.getPackageName())) {
                cvc.b bVarE2 = e();
                return (bVarE2 == null || (strN = bVarE2.n(sbn.getContent())) == null) ? sbn.getContent() : strN;
            }
            String string = b78.a().getResources().getString(R$string.weather_notice);
            Intrinsics.checkNotNullExpressionValue(string, "getAppContext().resource…(R.string.weather_notice)");
            return string;
        }

        @NotNull
        public final String c(@NotNull HealthNotificationBean sbn) {
            String strN;
            String strReplace;
            String strN2;
            Intrinsics.checkNotNullParameter(sbn, "sbn");
            if (!k51.INSTANCE.k(sbn)) {
                cvc.b bVarE = e();
                return (bVarE == null || (strN = bVarE.n(sbn.getTitle())) == null) ? sbn.getTitle() : strN;
            }
            Context contextA = b78.a();
            String title = sbn.getTitle();
            String string = contextA.getString(R$string.notification_regex_with_qq_unread_count);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…gex_with_qq_unread_count)");
            if (Pattern.compile(string).matcher(title).find()) {
                strReplace = new Regex(string).replace(title, "");
            } else {
                String string2 = contextA.getString(R$string.notification_regex_with_qq_unread_max_count);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…with_qq_unread_max_count)");
                strReplace = Pattern.compile(string2).matcher(title).find() ? new Regex(string2).replace(title, "") : null;
            }
            if (strReplace != null) {
                title = strReplace;
            }
            cvc.b bVarE2 = e();
            return (bVarE2 == null || (strN2 = bVarE2.n(title)) == null) ? title : strN2;
        }

        public final void d() {
            oa4.c.clear();
        }

        @Nullable
        public final cvc.b e() {
            return oa4.b;
        }

        public final boolean f() {
            cvc.b bVarE = e();
            return bVarE != null && bVarE.o3();
        }

        public final boolean g() {
            cvc.b bVarE = e();
            return bVarE != null && bVarE.q4();
        }

        public final boolean h() {
            cvc.b bVarE = e();
            return bVarE != null && bVarE.b2();
        }

        public final void i(@Nullable cvc.b bVar) {
            oa4.b = bVar;
        }

        @NotNull
        public final oa4 j(@NotNull Node node) {
            Intrinsics.checkNotNullParameter(node, "node");
            i(evc.a(node.getNodeId()));
            cvc.b bVarE = e();
            if (bVarE != null && bVarE.R8()) {
                return new u0a();
            }
            cvc.b bVarE2 = e();
            if (bVarE2 != null && bVarE2.D1()) {
                return new c8l();
            }
            cvc.b bVarE3 = e();
            return bVarE3 != null && bVarE3.h8() ? new xg1() : new puc();
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"com/oplus/aiunit/vision/oa4$b", "Lcom/oplus/aiunit/vision/na4;", "Lcom/google/protobuf/ByteString;", "str", "", "bytes", "", "width", "height", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements na4 {
        public final /* synthetic */ FlashbackMsg.Builder a;

        public b(FlashbackMsg.Builder builder) {
            this.a = builder;
        }

        @Override // com.oplus.aiunit.p007vision.na4
        public void a(@Nullable ByteString str, @Nullable byte[] bytes, int width, int height) {
            if (bytes != null) {
                FlashbackMsg.Builder builder = this.a;
                if (!(bytes.length == 0)) {
                    builder.setByteIcon(ByteString.copyFrom(bytes));
                }
            }
        }
    }

    public final void A(HealthNotificationBean hnb, Bundle watchPush, SeedingCardStyleProto.Builder seedingBuilder) {
        TextBean textBean;
        TextBean textBean2;
        String string;
        String string2 = watchPush.getString(c8l.KEY_D19, "");
        Intrinsics.checkNotNullExpressionValue(string2, "d19Key");
        if (string2.length() > 0) {
            seedingBuilder.addImages((ImagesElement) ImagesElement.newBuilder().setLevel(c8l.KEY_D19).setImageKey(string2 + uvc.PIC_TYPE_D19).build());
        }
        ArrayList<ImageBean> parcelableArrayList = watchPush.getParcelableArrayList(c8l.KEY_IMAGES);
        if (parcelableArrayList != null) {
            for (ImageBean imageBean : parcelableArrayList) {
                ImagesElement.Builder imageKey = ImagesElement.newBuilder().setLevel(imageBean.getLevel()).setImageKey(imageBean.getMd5() + "_" + imageBean.getLevel());
                if (imageBean.getSquare()) {
                    imageKey.setShape(imageBean.getLevel() + c8l.SQUARE_84_112);
                }
                seedingBuilder.addImages((ImagesElement) imageKey.build());
            }
        }
        ArrayList<TextBean> parcelableArrayList2 = watchPush.getParcelableArrayList(c8l.KEY_TEXTS);
        ArrayList arrayList = new ArrayList();
        if (parcelableArrayList2 != null) {
            textBean = null;
            textBean2 = null;
            for (TextBean textBean3 : parcelableArrayList2) {
                if (Intrinsics.areEqual(textBean3.getLevel(), c8l.KEY_B4)) {
                    textBean2 = textBean3;
                }
                if (Intrinsics.areEqual(textBean3.getLevel(), c8l.KEY_B0)) {
                    textBean = textBean3;
                } else {
                    GeneratedMessageLite generatedMessageLiteBuild = TextElement.newBuilder().setLevel(textBean3.getLevel()).setColor(textBean3.getColor()).setText(textBean3.getText()).setCountDownTarget(textBean3.getTargetCountDownTime()).setStep(textBean3.getStep()).setStartText(textBean3.getStartText()).build();
                    Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "newBuilder()\n           …ext(it.startText).build()");
                    arrayList.add(generatedMessageLiteBuild);
                }
            }
        } else {
            textBean = null;
            textBean2 = null;
        }
        if (textBean2 != null && textBean != null) {
            GeneratedMessageLite generatedMessageLiteBuild2 = TextElement.newBuilder().setLevel(textBean.getLevel()).setColor(textBean.getColor()).setText(textBean.getText()).setCountDownTarget(textBean2.getTargetCountDownTime()).setStep(textBean2.getStep()).setStartText(textBean2.getStartText()).build();
            Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild2, "newBuilder()\n           …                 .build()");
            arrayList.add(generatedMessageLiteBuild2);
        }
        if (textBean2 == null && textBean != null) {
            GeneratedMessageLite generatedMessageLiteBuild3 = TextElement.newBuilder().setLevel(textBean.getLevel()).setColor(textBean.getColor()).setText(textBean.getText()).build();
            Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild3, "newBuilder().setLevel(b0….setText(b0.text).build()");
            arrayList.add(generatedMessageLiteBuild3);
        }
        if (!arrayList.isEmpty()) {
            seedingBuilder.addAllTexts(arrayList);
        }
        if (evc.a(gl4.managerApi.q(ra5.a.INSTANCE)).E5() && FluidConfigCenter.INSTANCE.n(hnb.getPackageName())) {
            a7b.m("NTF_Converter", "newPb: compat mode, center:compat");
            string = "center:compat";
        } else {
            string = watchPush.getString(c8l.KEY_TYPES);
            if (!(string != null && StringsKt.contains$default(string, "center:", false, 2, (Object) null))) {
                if (!(string != null && StringsKt.contains$default(string, "custom:", false, 2, (Object) null))) {
                    string = "center:common";
                }
            }
        }
        seedingBuilder.setType(string);
    }

    public final SeedingCardStyleProto B(SeedingCardStyleProto seedingCardStyleProto) {
        if (seedingCardStyleProto.getUpdateIndicator() == 1) {
            return seedingCardStyleProto;
        }
        GeneratedMessageLite generatedMessageLiteBuild = ((SeedingCardStyleProto.Builder) seedingCardStyleProto.toBuilder()).setUpdateIndicator(1).build();
        Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "toBuilder().setUpdateInd…NDICATOR_DEFAULT).build()");
        return (SeedingCardStyleProto) generatedMessageLiteBuild;
    }

    public final void C(Bundle watchPush, SeedingCardStyleProto.Builder seedingBuilder) {
        String string = watchPush.getString(c8l.KEY_C1, "");
        String string2 = watchPush.getString(c8l.KEY_C2, "");
        String string3 = watchPush.getString(c8l.KEY_C3, "");
        Intrinsics.checkNotNullExpressionValue(string, "c1");
        if (string.length() == 0) {
            Intrinsics.checkNotNullExpressionValue(string2, "c2");
            if (string2.length() == 0) {
                Intrinsics.checkNotNullExpressionValue(string3, "c3");
                if (string3.length() == 0) {
                    string = watchPush.getString(c8l.KEY_DEFAULT_C, "");
                }
            }
        }
        seedingBuilder.setB(watchPush.getString(c8l.KEY_B, "")).setB0(watchPush.getString(c8l.KEY_B0, "")).setB1(watchPush.getString(c8l.KEY_B1, "")).setC1(string).setC2(string2).setC3(string3).setBColor(watchPush.getInt(c8l.KEY_B_COLOR, -1)).setB0Color(watchPush.getInt(c8l.KEY_B0_COLOR, -1)).setB1Color(watchPush.getInt(c8l.KEY_B1_COLOR, -1)).setC1Color(watchPush.getInt(c8l.KEY_C1_COLOR, -1)).setC2Color(watchPush.getInt(c8l.KEY_C2_COLOR, -1)).setC3Color(watchPush.getInt(c8l.KEY_C3_COLOR, -1));
        String string4 = watchPush.getString(c8l.KEY_D19, "");
        Intrinsics.checkNotNullExpressionValue(string4, "d19Key");
        if (string4.length() > 0) {
            seedingBuilder.addImages((ImagesElement) ImagesElement.newBuilder().setLevel(c8l.KEY_D19).setImageKey(string4 + uvc.PIC_TYPE_D19).build());
        }
        String string5 = watchPush.getString(c8l.KEY_D20, "");
        Intrinsics.checkNotNullExpressionValue(string5, "d20Key");
        if (string5.length() > 0) {
            seedingBuilder.addImages((ImagesElement) ImagesElement.newBuilder().setLevel(c8l.KEY_D20).setImageKey(string5 + uvc.PIC_TYPE_D20).build());
        }
    }

    public void D() {
        a7b.f("NTF_Converter", "[reSync] --> ");
        gl4.deviceMultiple.b.k(gl4.managerApi.n(), new MessageEvent(2, NTFCmdId2.CID_MSG_SYNC_AFTER_DEVICE_RESTART_VALUE, (byte[]) null));
    }

    public final void f(SeedingCardStyleProto.Builder seedingBuilder, Bundle watchPush) {
        SeedingCardStyleProto.Builder score = seedingBuilder.setNotifyLevel(watchPush.getInt(c8l.KEY_NOTIFY_LEVEL, 0)).setBgColor(watchPush.getInt(c8l.KEY_F1_COLOR, wud.BACKGROUND_COLOR_BLACK)).setForceShow(watchPush.getBoolean(c8l.KEY_NOTIFY_FORCE_SHOW, false)).setGroupPriority(watchPush.getInt(c8l.KEY_GROUP_PRIORITY, 0)).setDismissOnce(watchPush.getBoolean(c8l.KEY_FLUID_DISMISS_ONCE, false)).setScore(watchPush.getFloat(c8l.KEY_SCORE, v50.ALPHA_TRANSPARENT));
        String string = watchPush.getString(c8l.KEY_ALL_STEPS, "");
        if (!(string == null || string.length() == 0)) {
            ProcessInfo.Builder builderNewBuilder = ProcessInfo.newBuilder();
            String string2 = watchPush.getString(c8l.KEY_BG_COLOR, "0");
            Intrinsics.checkNotNullExpressionValue(string2, "watchPush.getString(KEY_BG_COLOR, \"0\")");
            ProcessInfo.Builder bgColor = builderNewBuilder.setBgColor(Integer.parseInt(string2));
            String string3 = watchPush.getString(c8l.KEY_F_COLOR, "0");
            Intrinsics.checkNotNullExpressionValue(string3, "watchPush.getString(KEY_F_COLOR, \"0\")");
            ProcessInfo.Builder foreColor = bgColor.setForeColor(Integer.parseInt(string3));
            Intrinsics.checkNotNullExpressionValue(string, "step");
            ProcessInfo.Builder allSteps = foreColor.setAllSteps(Integer.parseInt(string));
            String string4 = watchPush.getString(c8l.KEY_CURRENT_STEP, "0");
            Intrinsics.checkNotNullExpressionValue(string4, "watchPush.getString(KEY_CURRENT_STEP, \"0\")");
            ProcessInfo.Builder currentStep = allSteps.setCurrentStep(Integer.parseInt(string4));
            String string5 = watchPush.getString(c8l.KEY_PERCENT, "0");
            Intrinsics.checkNotNullExpressionValue(string5, "watchPush.getString(KEY_PERCENT, \"0\")");
            ProcessInfo.Builder percent = currentStep.setPercent(Integer.parseInt(string5));
            String string6 = watchPush.getString(c8l.KEY_D12_IMAGE, "");
            Intrinsics.checkNotNullExpressionValue(string6, "it");
            if (string6.length() > 0) {
                percent.setImageKey(string6 + "_D12");
            }
            String[] stringArray = watchPush.getStringArray(c8l.KEY_D13_NODES);
            if (stringArray != null) {
                Intrinsics.checkNotNullExpressionValue(stringArray, "it");
                percent.addAllNodeName(ArraysKt.toList(stringArray));
            }
            score.setProcess(percent);
        }
        long j = watchPush.getLong(c8l.KEY_COUNT_TIME, 0L);
        if (j > 0) {
            score.setCountDownTarget(j);
            score.setStartText(watchPush.getBoolean(c8l.KEY_COUNT_TIME_START, false));
            score.setStep(1);
        }
    }

    @Nullable
    public abstract MessageEvent g(@NotNull HealthNotificationBean hnb, @NotNull Bundle watchPush);

    @Nullable
    public final MessageEvent h(@NotNull HealthNotificationBean hnb, @NotNull Bundle watchPush, @NotNull ParsedNotificationProto.Builder build) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Intrinsics.checkNotNullParameter(watchPush, "watchPush");
        Intrinsics.checkNotNullParameter(build, "build");
        boolean zH3 = evc.a(gl4.managerApi.q(ra5.a.INSTANCE)).H3();
        NotificationStyleProto.Builder builderNewBuilder = NotificationStyleProto.newBuilder();
        builderNewBuilder.setStyleType(String.valueOf(MessageStyle.STYLE_SEEDING_CARD.getValue()));
        SeedingCardStyleProto.Builder builderNewBuilder2 = SeedingCardStyleProto.newBuilder();
        if (zH3) {
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "seedingBuilder");
            A(hnb, watchPush, builderNewBuilder2);
        } else {
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "seedingBuilder");
            C(watchPush, builderNewBuilder2);
        }
        f(builderNewBuilder2, watchPush);
        if (x(hnb.getKey(), builderNewBuilder2)) {
            a7b.m("NTF_Converter", "convertFluidNew: duplicate seedingCard, skip send. key=" + hnb.getKey());
            return null;
        }
        builderNewBuilder.setSeedingCard((SeedingCardStyleProto) builderNewBuilder2.build());
        build.setStyle((NotificationStyleProto) builderNewBuilder.build());
        ParsedNotificationProto parsedNotificationProto = (ParsedNotificationProto) build.build();
        StringBuilder sb = new StringBuilder();
        sb.append("Watch4Gen convertFluid: ");
        sb.append(parsedNotificationProto);
        MessageEvent messageEvent = new MessageEvent(2, NTFCmdId2.CID_SEEDING_CARD_POST_VALUE, parsedNotificationProto.toByteArray());
        messageEvent.setEncryptOption(2);
        return messageEvent;
    }

    @Nullable
    public final MessageEvent i(@NotNull HealthNotificationBean hnb, @NotNull Bundle watchPush) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Intrinsics.checkNotNullParameter(watchPush, "watchPush");
        FlashbackMsg.Builder status = FlashbackMsg.newBuilder().setStrTitle(hnb.getTitle()).setStrContent(hnb.getContent()).setBackground(false).setPackageName(hnb.getPackageName()).setStatus(0);
        if (!evc.a(gl4.managerApi.getActiveNodeId()).j5()) {
            r(true, hnb, new b(status));
        }
        FlashbackMsg flashbackMsg = (FlashbackMsg) status.build();
        StringBuilder sb = new StringBuilder();
        sb.append("Watch4Gen convertFluid: ");
        sb.append(flashbackMsg);
        return new MessageEvent(2, 112, flashbackMsg.toByteArray());
    }

    @Nullable
    public abstract MessageEvent j(@NotNull HealthNotificationBean hnb);

    @NotNull
    public final MessageEvent k(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        this.lastFluidSeedingCardCache.remove(hnb.getKey());
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
        sb.append("Watch4Gen convertFluidRemoved: ");
        sb.append(dismissNotificationProto);
        return new MessageEvent(2, NTFCmdId2.CID_SEEDING_CARD_DISMISS_VALUE, dismissNotificationProto.toByteArray());
    }

    @NotNull
    public final MessageEvent l(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        this.lastFluidSeedingCardCache.remove(hnb.getKey());
        FlashbackMsg flashbackMsg = (FlashbackMsg) FlashbackMsg.newBuilder().setStatus(2).build();
        StringBuilder sb = new StringBuilder();
        sb.append("onNotificationFluidRemoved: ");
        sb.append(flashbackMsg);
        return new MessageEvent(2, 112, flashbackMsg.toByteArray());
    }

    @Nullable
    public abstract MessageEvent m(@NotNull HealthNotificationBean hnb, @Nullable Bundle watchPush);

    @Nullable
    public abstract MessageEvent n(@NotNull HealthNotificationBean hnb, @NotNull WeChatConfig config);

    public final String o(SeedingCardStyleProto card) {
        String strS = s(card, c8l.KEY_A1);
        String strS2 = s(card, c8l.KEY_A);
        String strS3 = s(card, c8l.KEY_A0);
        String strT = t(card, c8l.KEY_B);
        if (strT.length() == 0) {
            strT = card.getB();
        }
        String strT2 = t(card, c8l.KEY_B0);
        if (strT2.length() == 0) {
            strT2 = card.getB0();
        }
        return CollectionsKt.joinToString$default(CollectionsKt.listOf(new String[]{strS, strS2, strS3, strT, strT2}), "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final void p(@NotNull HealthNotificationBean hnb, @NotNull na4 callback) {
        boolean z;
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Intrinsics.checkNotNullParameter(callback, "callback");
        cvc.b bVar = b;
        if (bVar != null) {
            z = bVar.S(hnb.getPackageName());
        }
        if (z) {
            a7b.f("NTF_Converter", "get144Icon: ignore icon");
            callback.a(null, null, 0, 0);
            return;
        }
        kyc kycVar = kyc.INSTANCE;
        IconCache iconCacheE = kyc.e(kycVar, hnb, 0, 2, null);
        if (iconCacheE != null) {
            callback.a(ByteString.EMPTY, iconCacheE.getByteArray(), 0, 0);
            return;
        }
        Bitmap bitmapK = kycVar.k(false, hnb);
        if (bitmapK != null) {
            cvc.b bVar2 = b;
            IconCache iconCacheJ = bVar2 != null ? bVar2.J(hnb, bitmapK) : null;
            if (iconCacheJ != null) {
                callback.a(iconCacheJ.getByteString(), iconCacheJ.getByteArray(), iconCacheJ.getBitmap().getWidth(), iconCacheJ.getBitmap().getHeight());
                return;
            }
        }
        a7b.f("NTF_Converter", "get144Icon: all null");
        callback.a(null, null, 0, 0);
    }

    public final void q(HealthNotificationBean hnb, na4 callback) {
        Bitmap icon;
        Bitmap bitmapK = kyc.INSTANCE.k(false, hnb);
        if (bitmapK != null) {
            cvc.b bVar = b;
            IconCache iconCacheZ0 = bVar != null ? bVar.Z0(hnb, bitmapK) : null;
            if (iconCacheZ0 != null) {
                callback.a(iconCacheZ0.getByteString(), iconCacheZ0.getByteArray(), iconCacheZ0.getBitmap().getWidth(), iconCacheZ0.getBitmap().getWidth());
                return;
            }
        }
        FluidAppInfo fluidAppInfoV = FluidConfigCenter.INSTANCE.v(hnb.getPackageName());
        if (fluidAppInfoV != null && (icon = fluidAppInfoV.getIcon()) != null) {
            cvc.b bVar2 = b;
            IconCache iconCacheZ1 = bVar2 != null ? bVar2.Z0(hnb, icon) : null;
            if (iconCacheZ1 != null) {
                callback.a(iconCacheZ1.getByteString(), iconCacheZ1.getByteArray(), iconCacheZ1.getBitmap().getWidth(), iconCacheZ1.getBitmap().getWidth());
                a7b.f("NTF_Converter", "getAndCacheIcon: all null, get form local");
                return;
            }
        }
        a7b.f("NTF_Converter", "getAndCacheIcon: all null");
        callback.a(null, null, 0, 0);
    }

    public void r(boolean forceIcon, @NotNull HealthNotificationBean hnb, @NotNull na4 callback) {
        Bitmap bitmapK;
        cvc.b bVar;
        IconCache iconCacheZ0;
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if ((forceIcon || Intrinsics.areEqual(hnb.getPackageName(), k51.PKG_QQ)) && (bitmapK = kyc.INSTANCE.k(true, hnb)) != null && (bVar = b) != null && (iconCacheZ0 = bVar.Z0(null, bitmapK)) != null) {
            a7b.f("NTF_Converter", "getIcon: forceIcon=true, matched");
            callback.a(iconCacheZ0.getByteString(), iconCacheZ0.getByteArray(), iconCacheZ0.getBitmap().getWidth(), iconCacheZ0.getBitmap().getHeight());
            return;
        }
        cvc.b bVar2 = b;
        if (bVar2 != null && bVar2.S(hnb.getPackageName())) {
            a7b.f("NTF_Converter", "getIcon: ignore icon");
            callback.a(ByteString.EMPTY, null, 0, 0);
            return;
        }
        IconCache iconCacheJ = kyc.j(kyc.INSTANCE, hnb, 0, 2, null);
        if (iconCacheJ != null) {
            callback.a(ByteString.EMPTY, iconCacheJ.getByteArray(), 0, 0);
        } else {
            q(hnb, callback);
        }
    }

    public final String s(SeedingCardStyleProto seedingCardStyleProto, String str) {
        Object next;
        List<ImagesElement> imagesList = seedingCardStyleProto.getImagesList();
        Intrinsics.checkNotNullExpressionValue(imagesList, "imagesList");
        Iterator<T> it = imagesList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((ImagesElement) next).getLevel(), str));
        ImagesElement imagesElement = (ImagesElement) next;
        String imageKey = imagesElement != null ? imagesElement.getImageKey() : null;
        return imageKey == null ? "" : imageKey;
    }

    public final String t(SeedingCardStyleProto seedingCardStyleProto, String str) {
        Object next;
        List<TextElement> textsList = seedingCardStyleProto.getTextsList();
        Intrinsics.checkNotNullExpressionValue(textsList, "textsList");
        Iterator<T> it = textsList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((TextElement) next).getLevel(), str));
        TextElement textElement = (TextElement) next;
        String text = textElement != null ? textElement.getText() : null;
        return text == null ? "" : text;
    }

    public final int u(@NotNull HealthNotificationBean sbn) {
        Intrinsics.checkNotNullParameter(sbn, "sbn");
        if (Intrinsics.areEqual(k51.PKG_WECHAT, sbn.getPackageName())) {
            return 1;
        }
        k51.Companion companion = k51.INSTANCE;
        if (companion.k(sbn)) {
            return 2;
        }
        NotificationHolder notificationHolder = NotificationHolder.INSTANCE;
        if (notificationHolder.f(sbn.getPackageName())) {
            return 3;
        }
        if (notificationHolder.i(sbn.getPackageName())) {
            return 4;
        }
        return companion.m(sbn) ? 5 : 0;
    }

    public final void v(@NotNull HealthNotificationBean hnb, @Nullable na4 callback, boolean icon144) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Bitmap bitmapK = kyc.INSTANCE.k(false, hnb);
        if (bitmapK != null) {
            IconCache iconCacheZ0 = null;
            if (icon144) {
                cvc.b bVar = b;
                if (bVar != null) {
                    iconCacheZ0 = bVar.J(null, bitmapK);
                }
            } else {
                cvc.b bVar2 = b;
                if (bVar2 != null) {
                    iconCacheZ0 = bVar2.Z0(null, bitmapK);
                }
            }
            if (iconCacheZ0 == null || callback == null) {
                return;
            }
            callback.a(iconCacheZ0.getByteString(), iconCacheZ0.getByteArray(), iconCacheZ0.getBitmap().getWidth(), iconCacheZ0.getBitmap().getHeight());
        }
    }

    public final boolean w(@NotNull HealthNotificationBean sbn) {
        Notification.CarExtender.UnreadConversation unreadConversation;
        Intrinsics.checkNotNullParameter(sbn, "sbn");
        if (sbn.getOrigin() instanceof StatusBarNotification) {
            Object origin = sbn.getOrigin();
            Intrinsics.checkNotNull(origin, "null cannot be cast to non-null type android.service.notification.StatusBarNotification");
            Notification notification = ((StatusBarNotification) origin).getNotification();
            if (Intrinsics.areEqual(k51.PKG_WECHAT, sbn.getPackageName()) && (unreadConversation = new Notification.CarExtender(notification).getUnreadConversation()) != null && unreadConversation.getReplyPendingIntent() != null) {
                a7b.f(twc.TAG, "[isNotificationHasRemoteInput] --> wechat with carExt");
                return true;
            }
            Notification.Action[] actionArr = notification.actions;
            if (actionArr == null) {
                return false;
            }
            for (Notification.Action action : actionArr) {
                RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (action.actionIntent != null && remoteInputs != null) {
                    boolean z = false;
                    for (RemoteInput remoteInput : remoteInputs) {
                        if (remoteInput.getAllowFreeFormInput()) {
                            z = true;
                        }
                    }
                    if (z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean x(String key, SeedingCardStyleProto.Builder currentBuilder) {
        SeedingCardStyleProto seedingCardStyleProto = this.lastFluidSeedingCardCache.get(key);
        SeedingCardStyleProto seedingCardStyleProto2 = (SeedingCardStyleProto) currentBuilder.build();
        Intrinsics.checkNotNullExpressionValue(seedingCardStyleProto2, "current");
        currentBuilder.setUpdateIndicator(y(seedingCardStyleProto, seedingCardStyleProto2) ? 2 : 1);
        if (Intrinsics.areEqual(seedingCardStyleProto != null ? B(seedingCardStyleProto) : null, B(seedingCardStyleProto2))) {
            return true;
        }
        ConcurrentHashMap<String, SeedingCardStyleProto> concurrentHashMap = this.lastFluidSeedingCardCache;
        GeneratedMessageLite generatedMessageLiteBuild = currentBuilder.build();
        Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "currentBuilder.build()");
        concurrentHashMap.put(key, (SeedingCardStyleProto) generatedMessageLiteBuild);
        return false;
    }

    public final boolean y(SeedingCardStyleProto last, SeedingCardStyleProto current) {
        if (last == null) {
            return true;
        }
        return !Intrinsics.areEqual(o(last), o(current));
    }

    @NotNull
    public final ParsedNotificationProto.Builder z(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        ParsedNotificationProto.Builder subText = ParsedNotificationProto.newBuilder().setId(hnb.getId()).setFlags(hnb.getFlags()).setTag(hnb.getTag()).setKey(hnb.getKey()).setGroupKey(hnb.getGroupKey()).setPackageName(hnb.getPackageName()).setSubText(hnb.getSubText());
        Companion companion = INSTANCE;
        ParsedNotificationProto.Builder title = subText.setAppName(companion.a(hnb)).setBridgeTag(hnb.getBridgeTag()).setPostTimeMillis(hnb.getPostTimeMillis()).setTitle(companion.c(hnb));
        Intrinsics.checkNotNullExpressionValue(title, "build");
        return title;
    }
}
