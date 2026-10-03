package pantanal.decision;

import com.heytap.store.base.core.http.HttpUtils;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.y6e;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import pantanal.annotaions.SizeKt;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u00060\u0002j\u0002`\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u0001*\u00060\u0002j\u0002`\u0003*\n\u0010\u0005\"\u00020\u00022\u00020\u0002¨\u0006\u0006"}, d2 = {"getCardSizeListDesc", "", "Lcom/pantanal/server/content/recommendlist/ServiceInfo;", "Lpantanal/decision/StaticService;", "infoMsg", "StaticService", "service-decision_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nServiceInfoExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceInfoExt.kt\npantanal/decision/ServiceInfoExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1855#2,2:126\n*S KotlinDebug\n*F\n+ 1 ServiceInfoExt.kt\npantanal/decision/ServiceInfoExtKt\n*L\n119#1:126,2\n*E\n"})
public final class ServiceInfoExtKt {
    @NotNull
    public static final String getCardSizeListDesc(@NotNull com.pantanal.server.content.recommendlist.ServiceInfo serviceInfo) {
        Intrinsics.checkNotNullParameter(serviceInfo, "<this>");
        StringBuilder sb = new StringBuilder(serviceInfo.getServiceId());
        sb.append('[');
        Iterator<T> it = serviceInfo.getSupportCardSizes().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            sb.append(iIntValue + "-" + SizeKt.toSizeString(iIntValue) + ",");
        }
        sb.append(']');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return y6e.h(string);
    }

    @NotNull
    public static final String infoMsg(@NotNull com.pantanal.server.content.recommendlist.ServiceInfo serviceInfo) {
        Intrinsics.checkNotNullParameter(serviceInfo, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("serviceId");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getServiceId());
        sb.append(",");
        sb.append("serviceType");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getServiceType());
        sb.append(",");
        sb.append("supportCardSizes");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getSupportCardSizes());
        sb.append(",");
        sb.append("score");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getScore());
        sb.append(",");
        sb.append("supportEntrance");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getSupportEntrance());
        sb.append(",");
        sb.append(SpeechConstant.KEY_TTS_TIMESTAMP);
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getTimeStamp());
        sb.append(",");
        sb.append("versionCode");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getVersionCode());
        sb.append(",");
        sb.append("subdomain");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getSubdomain());
        sb.append(",");
        sb.append("isParamsSendToSeedling");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.isParamsSendToSeedling());
        sb.append(",");
        sb.append("cannotReduceRecommend");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getCannotReduceRecommend());
        sb.append(",");
        sb.append("forceRebuild");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getForceRebuild());
        sb.append(",");
        sb.append("serviceCategory");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getServiceCategory());
        sb.append(",");
        sb.append("channelType");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getChannelType());
        sb.append(",");
        sb.append("needToWaitCardData = ");
        sb.append(serviceInfo.getNeedToWaitCardData());
        sb.append(",");
        sb.append("sizeToCardType = ");
        sb.append(serviceInfo.getSizeToCardType());
        sb.append(",");
        sb.append("intentCategory");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getIntentCategory());
        sb.append(",");
        sb.append("isGuaranteedCard");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.isGuaranteedCard());
        sb.append(",");
        sb.append("seedlingType");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getSeedlingType());
        sb.append(",");
        sb.append("useTemplate");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getUseTemplate());
        sb.append(",");
        sb.append("hostPackage");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getHostPackage());
        sb.append(",");
        sb.append("seedlingCardOptions");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getSeedlingCardOptions());
        sb.append(",");
        sb.append("instanceId");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getInstanceId());
        sb.append(",");
        sb.append("intentId");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getIntentId());
        sb.append(",");
        sb.append("policy");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getPolicy());
        sb.append(",");
        sb.append("initDataSize");
        sb.append(HttpUtils.EQUAL_SIGN);
        String initData = serviceInfo.getInitData();
        sb.append(initData != null ? Integer.valueOf(initData.length()) : null);
        sb.append(",");
        sb.append("serviceInstanceId");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getServiceInstanceId());
        sb.append(",");
        sb.append("needToWaitCardData");
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(serviceInfo.getNeedToWaitCardData());
        sb.append(",");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
