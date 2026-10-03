package pantanal.app.bean;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.heytap.webview.extension.cache.CacheConstants;
import com.oplus.aiunit.vision.SeedlingConfiguration;
import com.oplus.aiunit.vision.jla;
import com.oplus.aiunit.vision.ks9;
import com.oplus.aiunit.vision.tba;
import com.oplus.seedling.sdk.statistics.StatisticsTrackUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.app.ILaunchInterceptor;
import pantanal.app.ILaunchInterceptorV2;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0089\u0001B\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0005\b\u0088\u0001\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\"0!8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u001c8\u0006¢\u0006\f\n\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010 R\u0017\u0010/\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u00104\u001a\u0004\u0018\u0001038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u00109\u001a\u0004\u0018\u0001088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010>\u001a\u0004\u0018\u00010=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010C\u001a\u0004\u0018\u00010B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\"\u0010G\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010M\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010H\u001a\u0004\bN\u0010J\"\u0004\bO\u0010LR\"\u0010P\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010H\u001a\u0004\bQ\u0010J\"\u0004\bR\u0010LR\"\u0010S\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010H\u001a\u0004\bT\u0010J\"\u0004\bU\u0010LR\"\u0010V\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010H\u001a\u0004\bV\u0010J\"\u0004\bW\u0010LR\"\u0010X\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010H\u001a\u0004\bY\u0010J\"\u0004\bZ\u0010LR$\u0010\\\u001a\u0004\u0018\u00010[8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u00100\u001a\u0004\bc\u00102\"\u0004\bd\u0010eR\"\u0010f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010H\u001a\u0004\bg\u0010J\"\u0004\bh\u0010LR\"\u0010i\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010H\u001a\u0004\bj\u0010J\"\u0004\bk\u0010LR\"\u0010l\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010H\u001a\u0004\bl\u0010J\"\u0004\bm\u0010LR0\u0010n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010$\u001a\u0004\bo\u0010&\"\u0004\bp\u0010qR\"\u0010r\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010H\u001a\u0004\bs\u0010J\"\u0004\bt\u0010LR\"\u0010u\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010H\u001a\u0004\bu\u0010J\"\u0004\bv\u0010LR\"\u0010w\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010H\u001a\u0004\bx\u0010J\"\u0004\by\u0010LR$\u0010z\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR&\u0010\u0080\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010H\u001a\u0005\b\u0080\u0001\u0010J\"\u0005\b\u0081\u0001\u0010LR4\u0010\u0082\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010$\u001a\u0005\b\u0083\u0001\u0010&\"\u0005\b\u0084\u0001\u0010qR&\u0010\u0085\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010H\u001a\u0005\b\u0086\u0001\u0010J\"\u0005\b\u0087\u0001\u0010L¨\u0006\u008a\u0001"}, d2 = {"Lpantanal/app/bean/Configuration;", "", "", "toString", "Lpantanal/app/bean/Configuration$Builder;", "component1", "builder", "copy", "", "hashCode", "other", "", "equals", "Lpantanal/app/bean/Configuration$Builder;", "getBuilder", "()Lpantanal/app/bean/Configuration$Builder;", "setBuilder", "(Lpantanal/app/bean/Configuration$Builder;)V", "Landroid/os/Bundle;", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "Lpantanal/app/bean/Entrance;", StatisticsTrackUtil.KEY_ENTRANCE, "Lpantanal/app/bean/Entrance;", "getEntrance", "()Lpantanal/app/bean/Entrance;", "", "supportEntranceList", "Ljava/util/List;", "getSupportEntranceList", "()Ljava/util/List;", "", "Lpantanal/app/ILaunchInterceptorV2;", "launchInterceptorMap", "Ljava/util/Map;", "getLaunchInterceptorMap", "()Ljava/util/Map;", "Lpantanal/app/bean/Mode;", "mode", "Lpantanal/app/bean/Mode;", "getMode", "()Lpantanal/app/bean/Mode;", "Lpantanal/app/bean/CardCategory;", "supportedCardCategory", "getSupportedCardCategory", "loadTimeout", "I", "getLoadTimeout", "()I", "Lcom/oplus/aiunit/vision/wqg;", "seedingConfiguration", "Lcom/oplus/aiunit/vision/wqg;", "getSeedingConfiguration", "()Lcom/oplus/aiunit/vision/wqg;", "Lcom/oplus/aiunit/vision/tba;", "instantConfiguration", "Lcom/oplus/aiunit/vision/tba;", "getInstantConfiguration", "()Lcom/oplus/aiunit/vision/tba;", "Lpantanal/app/ILaunchInterceptor;", "launcherInterceptor", "Lpantanal/app/ILaunchInterceptor;", "getLauncherInterceptor", "()Lpantanal/app/ILaunchInterceptor;", "Lcom/oplus/aiunit/vision/ks9;", "logger", "Lcom/oplus/aiunit/vision/ks9;", "getLogger", "()Lcom/oplus/aiunit/vision/ks9;", "shouldNotifyCardServiceToInit", "Z", "getShouldNotifyCardServiceToInit", "()Z", "setShouldNotifyCardServiceToInit", "(Z)V", "supportInterruptLoadingSeedlingCard", "getSupportInterruptLoadingSeedlingCard", "setSupportInterruptLoadingSeedlingCard", "shouldPreInitSeedlingPlugin", "getShouldPreInitSeedlingPlugin", "setShouldPreInitSeedlingPlugin", "shouldPreInitInstantSdk", "getShouldPreInitInstantSdk", "setShouldPreInitInstantSdk", "isContextLoadedByAppDefaultClassLoader", "setContextLoadedByAppDefaultClassLoader", "shouldParseSeedlingUIData", "getShouldParseSeedlingUIData", "setShouldParseSeedlingUIData", "Ljava/lang/ClassLoader;", "hostClassLoader", "Ljava/lang/ClassLoader;", "getHostClassLoader", "()Ljava/lang/ClassLoader;", "setHostClassLoader", "(Ljava/lang/ClassLoader;)V", "deltaOfLCAParentClassLoader", "getDeltaOfLCAParentClassLoader", "setDeltaOfLCAParentClassLoader", "(I)V", "enableV2Callback", "getEnableV2Callback", "setEnableV2Callback", "needHostHandleCardBg", "getNeedHostHandleCardBg", "setNeedHostHandleCardBg", "isHostLightColor", "setHostLightColor", "extrasDataToEngine", "getExtrasDataToEngine", "setExtrasDataToEngine", "(Ljava/util/Map;)V", "checkForceCopySwitch", "getCheckForceCopySwitch", "setCheckForceCopySwitch", "isSupportChildThread", "setSupportChildThread", "enableInstantCardView", "getEnableInstantCardView", "setEnableInstantCardView", "supportUseServiceDecisionFromPlugin", "Ljava/lang/Boolean;", "getSupportUseServiceDecisionFromPlugin", "()Ljava/lang/Boolean;", "setSupportUseServiceDecisionFromPlugin", "(Ljava/lang/Boolean;)V", "isSupportAddParamsToIntent", "setSupportAddParamsToIntent", "extrasDataToPlugin", "getExtrasDataToPlugin", "setExtrasDataToPlugin", "interceptorInstantCardReload", "getInterceptorInstantCardReload", "setInterceptorInstantCardReload", "<init>", "Builder", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Configuration {

    @NotNull
    private Builder builder;

    @Nullable
    private final Bundle bundle;
    private boolean checkForceCopySwitch;
    private int deltaOfLCAParentClassLoader;
    private boolean enableInstantCardView;
    private boolean enableV2Callback;

    @NotNull
    private final Entrance entrance;

    @NotNull
    private Map<String, ? extends Object> extrasDataToEngine;

    @NotNull
    private Map<String, ? extends Object> extrasDataToPlugin;

    @Nullable
    private ClassLoader hostClassLoader;

    @Nullable
    private final tba instantConfiguration;
    private boolean interceptorInstantCardReload;
    private boolean isContextLoadedByAppDefaultClassLoader;
    private boolean isHostLightColor;
    private boolean isSupportAddParamsToIntent;
    private boolean isSupportChildThread;

    @NotNull
    private final Map<Entrance, ILaunchInterceptorV2> launchInterceptorMap;

    @Nullable
    private final ILaunchInterceptor launcherInterceptor;
    private final int loadTimeout;

    @Nullable
    private final ks9 logger;

    @NotNull
    private final Mode mode;
    private boolean needHostHandleCardBg;

    @Nullable
    private final SeedlingConfiguration seedingConfiguration;
    private boolean shouldNotifyCardServiceToInit;
    private boolean shouldParseSeedlingUIData;
    private boolean shouldPreInitInstantSdk;
    private boolean shouldPreInitSeedlingPlugin;

    @NotNull
    private final List<Entrance> supportEntranceList;
    private boolean supportInterruptLoadingSeedlingCard;

    @Nullable
    private Boolean supportUseServiceDecisionFromPlugin;

    @NotNull
    private final List<CardCategory> supportedCardCategory;

    @Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\bX\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010\u000e\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001bJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001bJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001bJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u001bJ\u0014\u0010%\u001a\u00020\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000bJ\u001a\u0010(\u001a\u00020\u00002\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020'0&J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0005J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u001bJ\u000e\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u001bJ\u000e\u0010.\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u001bJ\u001c\u00100\u001a\u00020\u00002\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0006\u0012\u0004\u0018\u00010\u00010&J\u000e\u00101\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u001bJ\u000e\u00103\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u001bJ\u000e\u00105\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u001bJ\u000e\u00106\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u001bJ\u001c\u00107\u001a\u00020\u00002\u0014\u00107\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0006\u0012\u0004\u0018\u00010\u00010&J\u000e\u00108\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u001bJ\u000e\u00109\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u001bJ\u0006\u0010;\u001a\u00020:R\"\u0010\u001e\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u001f\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010<\u001a\u0004\bA\u0010>\"\u0004\bB\u0010@R\"\u0010\u0007\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR(\u0010%\u001a\b\u0012\u0004\u0012\u00020#0H8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR.\u0010O\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020'0N8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010I\u001a\u0004\bZ\u0010K\"\u0004\b[\u0010MR\"\u0010\u0010\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010a\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010l\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010\u001c\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010<\u001a\u0004\bw\u0010>\"\u0004\bx\u0010@R\"\u0010\u001d\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010<\u001a\u0004\by\u0010>\"\u0004\bz\u0010@R\"\u0010!\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010<\u001a\u0004\b{\u0010>\"\u0004\b|\u0010@R\"\u0010\"\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010<\u001a\u0004\b}\u0010>\"\u0004\b~\u0010@R(\u0010*\u001a\u0004\u0018\u00010)8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\b*\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R$\u0010+\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b+\u0010\\\u001a\u0005\b\u0084\u0001\u0010^\"\u0005\b\u0085\u0001\u0010`R$\u0010,\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b,\u0010<\u001a\u0005\b\u0086\u0001\u0010>\"\u0005\b\u0087\u0001\u0010@R$\u0010-\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b-\u0010<\u001a\u0005\b\u0088\u0001\u0010>\"\u0005\b\u0089\u0001\u0010@R$\u0010.\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b.\u0010<\u001a\u0005\b\u008a\u0001\u0010>\"\u0005\b\u008b\u0001\u0010@R$\u00101\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b1\u0010<\u001a\u0005\b\u008c\u0001\u0010>\"\u0005\b\u008d\u0001\u0010@R$\u00103\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b3\u0010<\u001a\u0005\b\u008e\u0001\u0010>\"\u0005\b\u008f\u0001\u0010@R$\u00105\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b5\u0010<\u001a\u0005\b\u0090\u0001\u0010>\"\u0005\b\u0091\u0001\u0010@R)\u00108\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b8\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R2\u00100\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0006\u0012\u0004\u0018\u00010\u00010N8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b0\u0010P\u001a\u0005\b\u0097\u0001\u0010R\"\u0005\b\u0098\u0001\u0010TR$\u00106\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b6\u0010<\u001a\u0005\b\u0099\u0001\u0010>\"\u0005\b\u009a\u0001\u0010@R2\u00107\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0006\u0012\u0004\u0018\u00010\u00010&8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b7\u0010P\u001a\u0005\b\u009b\u0001\u0010R\"\u0005\b\u009c\u0001\u0010TR$\u00109\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b9\u0010<\u001a\u0005\b\u009d\u0001\u0010>\"\u0005\b\u009e\u0001\u0010@R)\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0003\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001¨\u0006¦\u0001"}, d2 = {"Lpantanal/app/bean/Configuration$Builder;", "", "Landroid/os/Bundle;", "bundle", "setBundle", "", "entranceType", StatisticsTrackUtil.KEY_ENTRANCE, "Lpantanal/app/bean/Mode;", "mode", "setMode", "", "Lpantanal/app/bean/CardCategory;", "cardCategory", "supportedCardCategory", "timeout", "loadTimeout", "Lcom/oplus/aiunit/vision/wqg;", CacheConstants.Word.CONFIGURATION, "seedlingConfiguration", "Lcom/oplus/aiunit/vision/tba;", "instantConfiguration", "Lpantanal/app/ILaunchInterceptor;", "interceptor", "launchInterceptor", "Lcom/oplus/aiunit/vision/ks9;", "logger", "", "shouldNotifyCardServiceToInit", "supportInterruptLoadingSeedlingCard", "shouldPreInitSeedlingPlugin", "shouldPreInitInstantSdk", "isContextLoadedByAppClassLoader", "isContextLoadedByAppDefaultClassLoader", "shouldParseSeedlingUIData", "Lpantanal/app/bean/Entrance;", "list", "supportEntranceList", "", "Lpantanal/app/ILaunchInterceptorV2;", "entranceToLauncherInterceptorMap", "Ljava/lang/ClassLoader;", "hostClassLoader", "deltaOfLCAParentClassLoader", "enableV2Callback", "needHostHandleCardBg", "isHostLightColor", "", "extrasDataToEngine", "checkForceCopySwitch", "support", "isSupportChildThread", "enable", "enableInstantCardView", "isSupportAddParamsToIntent", "extrasDataToPlugin", "supportUseServiceDecisionFromPlugin", "interceptorInstantCardReload", "Lpantanal/app/bean/Configuration;", jla.DEFAULT_BUILD_METHOD, "Z", "getShouldPreInitSeedlingPlugin$pantanal_interface_release", "()Z", "setShouldPreInitSeedlingPlugin$pantanal_interface_release", "(Z)V", "getShouldPreInitInstantSdk$pantanal_interface_release", "setShouldPreInitInstantSdk$pantanal_interface_release", "Lpantanal/app/bean/Entrance;", "getEntrance$pantanal_interface_release", "()Lpantanal/app/bean/Entrance;", "setEntrance$pantanal_interface_release", "(Lpantanal/app/bean/Entrance;)V", "", "Ljava/util/List;", "getSupportEntranceList$pantanal_interface_release", "()Ljava/util/List;", "setSupportEntranceList$pantanal_interface_release", "(Ljava/util/List;)V", "", "launchInterceptorMap", "Ljava/util/Map;", "getLaunchInterceptorMap$pantanal_interface_release", "()Ljava/util/Map;", "setLaunchInterceptorMap$pantanal_interface_release", "(Ljava/util/Map;)V", "Lpantanal/app/bean/Mode;", "getMode$pantanal_interface_release", "()Lpantanal/app/bean/Mode;", "setMode$pantanal_interface_release", "(Lpantanal/app/bean/Mode;)V", "getSupportedCardCategory$pantanal_interface_release", "setSupportedCardCategory$pantanal_interface_release", "I", "getLoadTimeout$pantanal_interface_release", "()I", "setLoadTimeout$pantanal_interface_release", "(I)V", "seedingConfiguration", "Lcom/oplus/aiunit/vision/wqg;", "getSeedingConfiguration$pantanal_interface_release", "()Lcom/oplus/aiunit/vision/wqg;", "setSeedingConfiguration$pantanal_interface_release", "(Lcom/oplus/aiunit/vision/wqg;)V", "Lcom/oplus/aiunit/vision/tba;", "getInstantConfiguration$pantanal_interface_release", "()Lcom/oplus/aiunit/vision/tba;", "setInstantConfiguration$pantanal_interface_release", "(Lcom/oplus/aiunit/vision/tba;)V", "launcherInterceptor", "Lpantanal/app/ILaunchInterceptor;", "getLauncherInterceptor$pantanal_interface_release", "()Lpantanal/app/ILaunchInterceptor;", "setLauncherInterceptor$pantanal_interface_release", "(Lpantanal/app/ILaunchInterceptor;)V", "Lcom/oplus/aiunit/vision/ks9;", "getLogger$pantanal_interface_release", "()Lcom/oplus/aiunit/vision/ks9;", "setLogger$pantanal_interface_release", "(Lcom/oplus/aiunit/vision/ks9;)V", "getShouldNotifyCardServiceToInit$pantanal_interface_release", "setShouldNotifyCardServiceToInit$pantanal_interface_release", "getSupportInterruptLoadingSeedlingCard$pantanal_interface_release", "setSupportInterruptLoadingSeedlingCard$pantanal_interface_release", "isContextLoadedByAppDefaultClassLoader$pantanal_interface_release", "setContextLoadedByAppDefaultClassLoader$pantanal_interface_release", "getShouldParseSeedlingUIData$pantanal_interface_release", "setShouldParseSeedlingUIData$pantanal_interface_release", "Ljava/lang/ClassLoader;", "getHostClassLoader$pantanal_interface_release", "()Ljava/lang/ClassLoader;", "setHostClassLoader$pantanal_interface_release", "(Ljava/lang/ClassLoader;)V", "getDeltaOfLCAParentClassLoader$pantanal_interface_release", "setDeltaOfLCAParentClassLoader$pantanal_interface_release", "getEnableV2Callback$pantanal_interface_release", "setEnableV2Callback$pantanal_interface_release", "getNeedHostHandleCardBg$pantanal_interface_release", "setNeedHostHandleCardBg$pantanal_interface_release", "isHostLightColor$pantanal_interface_release", "setHostLightColor$pantanal_interface_release", "getCheckForceCopySwitch$pantanal_interface_release", "setCheckForceCopySwitch$pantanal_interface_release", "isSupportChildThread$pantanal_interface_release", "setSupportChildThread$pantanal_interface_release", "getEnableInstantCardView$pantanal_interface_release", "setEnableInstantCardView$pantanal_interface_release", "Ljava/lang/Boolean;", "getSupportUseServiceDecisionFromPlugin$pantanal_interface_release", "()Ljava/lang/Boolean;", "setSupportUseServiceDecisionFromPlugin$pantanal_interface_release", "(Ljava/lang/Boolean;)V", "getExtrasDataToEngine$pantanal_interface_release", "setExtrasDataToEngine$pantanal_interface_release", "isSupportAddParamsToIntent$pantanal_interface_release", "setSupportAddParamsToIntent$pantanal_interface_release", "getExtrasDataToPlugin$pantanal_interface_release", "setExtrasDataToPlugin$pantanal_interface_release", "getInterceptorInstantCardReload$pantanal_interface_release", "setInterceptorInstantCardReload$pantanal_interface_release", "Landroid/os/Bundle;", "getBundle$pantanal_interface_release", "()Landroid/os/Bundle;", "setBundle$pantanal_interface_release", "(Landroid/os/Bundle;)V", "<init>", "()V", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        @Nullable
        private Bundle bundle;
        private boolean enableInstantCardView;
        private boolean enableV2Callback;

        @Nullable
        private ClassLoader hostClassLoader;

        @Nullable
        private tba instantConfiguration;
        private boolean isSupportAddParamsToIntent;
        private boolean isSupportChildThread;

        @Nullable
        private ILaunchInterceptor launcherInterceptor;

        @Nullable
        private ks9 logger;
        private boolean needHostHandleCardBg;

        @Nullable
        private SeedlingConfiguration seedingConfiguration;
        private boolean shouldNotifyCardServiceToInit;
        private boolean shouldParseSeedlingUIData;
        private boolean shouldPreInitInstantSdk;
        private boolean shouldPreInitSeedlingPlugin;
        private boolean supportInterruptLoadingSeedlingCard;

        @Nullable
        private Boolean supportUseServiceDecisionFromPlugin;

        @NotNull
        private Entrance entrance = Entrance.UNKNOWN;

        @NotNull
        private List<Entrance> supportEntranceList = new ArrayList();

        @NotNull
        private Map<Entrance, ILaunchInterceptorV2> launchInterceptorMap = new LinkedHashMap();

        @NotNull
        private Mode mode = Mode.STANDARD;

        @NotNull
        private List<? extends CardCategory> supportedCardCategory = new ArrayList();
        private int loadTimeout = -1;
        private boolean isContextLoadedByAppDefaultClassLoader = true;
        private int deltaOfLCAParentClassLoader = 1;
        private boolean isHostLightColor = true;
        private boolean checkForceCopySwitch = true;

        @NotNull
        private Map<String, Object> extrasDataToEngine = new LinkedHashMap();

        @NotNull
        private Map<String, ? extends Object> extrasDataToPlugin = new LinkedHashMap();
        private boolean interceptorInstantCardReload = true;

        @NotNull
        public final Configuration build() {
            return new Configuration(this);
        }

        @NotNull
        public final Builder checkForceCopySwitch(boolean checkForceCopySwitch) {
            this.checkForceCopySwitch = checkForceCopySwitch;
            return this;
        }

        @NotNull
        public final Builder deltaOfLCAParentClassLoader(int deltaOfLCAParentClassLoader) {
            this.deltaOfLCAParentClassLoader = deltaOfLCAParentClassLoader;
            return this;
        }

        @NotNull
        public final Builder enableInstantCardView(boolean enable) {
            this.enableInstantCardView = enable;
            return this;
        }

        @NotNull
        public final Builder enableV2Callback(boolean enableV2Callback) {
            this.enableV2Callback = enableV2Callback;
            return this;
        }

        @NotNull
        public final Builder entrance(int entranceType) {
            this.entrance = Entrance.INSTANCE.findByType(entranceType);
            return this;
        }

        @NotNull
        public final Builder entranceToLauncherInterceptorMap(@NotNull Map<Entrance, ? extends ILaunchInterceptorV2> entranceToLauncherInterceptorMap) {
            Intrinsics.checkNotNullParameter(entranceToLauncherInterceptorMap, "entranceToLauncherInterceptorMap");
            this.launchInterceptorMap.clear();
            this.launchInterceptorMap.putAll(entranceToLauncherInterceptorMap);
            return this;
        }

        @NotNull
        public final Builder extrasDataToEngine(@NotNull Map<String, ? extends Object> extrasDataToEngine) {
            Intrinsics.checkNotNullParameter(extrasDataToEngine, "extrasDataToEngine");
            this.extrasDataToEngine.putAll(extrasDataToEngine);
            return this;
        }

        @NotNull
        public final Builder extrasDataToPlugin(@NotNull Map<String, ? extends Object> extrasDataToPlugin) {
            Intrinsics.checkNotNullParameter(extrasDataToPlugin, "extrasDataToPlugin");
            this.extrasDataToPlugin = extrasDataToPlugin;
            return this;
        }

        @Nullable
        /* JADX INFO: renamed from: getBundle$pantanal_interface_release, reason: from getter */
        public final Bundle getBundle() {
            return this.bundle;
        }

        /* JADX INFO: renamed from: getCheckForceCopySwitch$pantanal_interface_release, reason: from getter */
        public final boolean getCheckForceCopySwitch() {
            return this.checkForceCopySwitch;
        }

        /* JADX INFO: renamed from: getDeltaOfLCAParentClassLoader$pantanal_interface_release, reason: from getter */
        public final int getDeltaOfLCAParentClassLoader() {
            return this.deltaOfLCAParentClassLoader;
        }

        /* JADX INFO: renamed from: getEnableInstantCardView$pantanal_interface_release, reason: from getter */
        public final boolean getEnableInstantCardView() {
            return this.enableInstantCardView;
        }

        /* JADX INFO: renamed from: getEnableV2Callback$pantanal_interface_release, reason: from getter */
        public final boolean getEnableV2Callback() {
            return this.enableV2Callback;
        }

        @NotNull
        /* JADX INFO: renamed from: getEntrance$pantanal_interface_release, reason: from getter */
        public final Entrance getEntrance() {
            return this.entrance;
        }

        @NotNull
        public final Map<String, Object> getExtrasDataToEngine$pantanal_interface_release() {
            return this.extrasDataToEngine;
        }

        @NotNull
        public final Map<String, Object> getExtrasDataToPlugin$pantanal_interface_release() {
            return this.extrasDataToPlugin;
        }

        @Nullable
        /* JADX INFO: renamed from: getHostClassLoader$pantanal_interface_release, reason: from getter */
        public final ClassLoader getHostClassLoader() {
            return this.hostClassLoader;
        }

        @Nullable
        public final tba getInstantConfiguration$pantanal_interface_release() {
            return null;
        }

        /* JADX INFO: renamed from: getInterceptorInstantCardReload$pantanal_interface_release, reason: from getter */
        public final boolean getInterceptorInstantCardReload() {
            return this.interceptorInstantCardReload;
        }

        @NotNull
        public final Map<Entrance, ILaunchInterceptorV2> getLaunchInterceptorMap$pantanal_interface_release() {
            return this.launchInterceptorMap;
        }

        @Nullable
        /* JADX INFO: renamed from: getLauncherInterceptor$pantanal_interface_release, reason: from getter */
        public final ILaunchInterceptor getLauncherInterceptor() {
            return this.launcherInterceptor;
        }

        /* JADX INFO: renamed from: getLoadTimeout$pantanal_interface_release, reason: from getter */
        public final int getLoadTimeout() {
            return this.loadTimeout;
        }

        @Nullable
        public final ks9 getLogger$pantanal_interface_release() {
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: getMode$pantanal_interface_release, reason: from getter */
        public final Mode getMode() {
            return this.mode;
        }

        /* JADX INFO: renamed from: getNeedHostHandleCardBg$pantanal_interface_release, reason: from getter */
        public final boolean getNeedHostHandleCardBg() {
            return this.needHostHandleCardBg;
        }

        @Nullable
        /* JADX INFO: renamed from: getSeedingConfiguration$pantanal_interface_release, reason: from getter */
        public final SeedlingConfiguration getSeedingConfiguration() {
            return this.seedingConfiguration;
        }

        /* JADX INFO: renamed from: getShouldNotifyCardServiceToInit$pantanal_interface_release, reason: from getter */
        public final boolean getShouldNotifyCardServiceToInit() {
            return this.shouldNotifyCardServiceToInit;
        }

        /* JADX INFO: renamed from: getShouldParseSeedlingUIData$pantanal_interface_release, reason: from getter */
        public final boolean getShouldParseSeedlingUIData() {
            return this.shouldParseSeedlingUIData;
        }

        /* JADX INFO: renamed from: getShouldPreInitInstantSdk$pantanal_interface_release, reason: from getter */
        public final boolean getShouldPreInitInstantSdk() {
            return this.shouldPreInitInstantSdk;
        }

        /* JADX INFO: renamed from: getShouldPreInitSeedlingPlugin$pantanal_interface_release, reason: from getter */
        public final boolean getShouldPreInitSeedlingPlugin() {
            return this.shouldPreInitSeedlingPlugin;
        }

        @NotNull
        public final List<Entrance> getSupportEntranceList$pantanal_interface_release() {
            return this.supportEntranceList;
        }

        /* JADX INFO: renamed from: getSupportInterruptLoadingSeedlingCard$pantanal_interface_release, reason: from getter */
        public final boolean getSupportInterruptLoadingSeedlingCard() {
            return this.supportInterruptLoadingSeedlingCard;
        }

        @Nullable
        /* JADX INFO: renamed from: getSupportUseServiceDecisionFromPlugin$pantanal_interface_release, reason: from getter */
        public final Boolean getSupportUseServiceDecisionFromPlugin() {
            return this.supportUseServiceDecisionFromPlugin;
        }

        @NotNull
        public final List<CardCategory> getSupportedCardCategory$pantanal_interface_release() {
            return this.supportedCardCategory;
        }

        @NotNull
        public final Builder hostClassLoader(@NotNull ClassLoader hostClassLoader) {
            Intrinsics.checkNotNullParameter(hostClassLoader, "hostClassLoader");
            this.hostClassLoader = hostClassLoader;
            return this;
        }

        @NotNull
        public final Builder instantConfiguration(@NotNull tba configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return this;
        }

        @NotNull
        public final Builder interceptorInstantCardReload(boolean interceptor) {
            this.interceptorInstantCardReload = interceptor;
            return this;
        }

        @NotNull
        public final Builder isContextLoadedByAppDefaultClassLoader(boolean isContextLoadedByAppClassLoader) {
            this.isContextLoadedByAppDefaultClassLoader = isContextLoadedByAppClassLoader;
            return this;
        }

        /* JADX INFO: renamed from: isContextLoadedByAppDefaultClassLoader$pantanal_interface_release, reason: from getter */
        public final boolean getIsContextLoadedByAppDefaultClassLoader() {
            return this.isContextLoadedByAppDefaultClassLoader;
        }

        @NotNull
        public final Builder isHostLightColor(boolean isHostLightColor) {
            this.isHostLightColor = isHostLightColor;
            return this;
        }

        /* JADX INFO: renamed from: isHostLightColor$pantanal_interface_release, reason: from getter */
        public final boolean getIsHostLightColor() {
            return this.isHostLightColor;
        }

        @NotNull
        public final Builder isSupportAddParamsToIntent(boolean isSupportAddParamsToIntent) {
            this.isSupportAddParamsToIntent = isSupportAddParamsToIntent;
            return this;
        }

        /* JADX INFO: renamed from: isSupportAddParamsToIntent$pantanal_interface_release, reason: from getter */
        public final boolean getIsSupportAddParamsToIntent() {
            return this.isSupportAddParamsToIntent;
        }

        @NotNull
        public final Builder isSupportChildThread(boolean support) {
            this.isSupportChildThread = support;
            return this;
        }

        /* JADX INFO: renamed from: isSupportChildThread$pantanal_interface_release, reason: from getter */
        public final boolean getIsSupportChildThread() {
            return this.isSupportChildThread;
        }

        @NotNull
        public final Builder launchInterceptor(@NotNull ILaunchInterceptor interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.launcherInterceptor = interceptor;
            return this;
        }

        @NotNull
        public final Builder loadTimeout(int timeout) {
            this.loadTimeout = timeout;
            return this;
        }

        @NotNull
        public final Builder logger(@NotNull ks9 logger) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            return this;
        }

        @NotNull
        public final Builder needHostHandleCardBg(boolean needHostHandleCardBg) {
            this.needHostHandleCardBg = needHostHandleCardBg;
            return this;
        }

        @NotNull
        public final Builder seedlingConfiguration(@NotNull SeedlingConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.seedingConfiguration = configuration;
            return this;
        }

        @NotNull
        public final Builder setBundle(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            this.bundle = bundle;
            return this;
        }

        public final void setBundle$pantanal_interface_release(@Nullable Bundle bundle) {
            this.bundle = bundle;
        }

        public final void setCheckForceCopySwitch$pantanal_interface_release(boolean z) {
            this.checkForceCopySwitch = z;
        }

        public final void setContextLoadedByAppDefaultClassLoader$pantanal_interface_release(boolean z) {
            this.isContextLoadedByAppDefaultClassLoader = z;
        }

        public final void setDeltaOfLCAParentClassLoader$pantanal_interface_release(int i) {
            this.deltaOfLCAParentClassLoader = i;
        }

        public final void setEnableInstantCardView$pantanal_interface_release(boolean z) {
            this.enableInstantCardView = z;
        }

        public final void setEnableV2Callback$pantanal_interface_release(boolean z) {
            this.enableV2Callback = z;
        }

        public final void setEntrance$pantanal_interface_release(@NotNull Entrance entrance) {
            Intrinsics.checkNotNullParameter(entrance, "<set-?>");
            this.entrance = entrance;
        }

        public final void setExtrasDataToEngine$pantanal_interface_release(@NotNull Map<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.extrasDataToEngine = map;
        }

        public final void setExtrasDataToPlugin$pantanal_interface_release(@NotNull Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.extrasDataToPlugin = map;
        }

        public final void setHostClassLoader$pantanal_interface_release(@Nullable ClassLoader classLoader) {
            this.hostClassLoader = classLoader;
        }

        public final void setHostLightColor$pantanal_interface_release(boolean z) {
            this.isHostLightColor = z;
        }

        public final void setInstantConfiguration$pantanal_interface_release(@Nullable tba tbaVar) {
        }

        public final void setInterceptorInstantCardReload$pantanal_interface_release(boolean z) {
            this.interceptorInstantCardReload = z;
        }

        public final void setLaunchInterceptorMap$pantanal_interface_release(@NotNull Map<Entrance, ILaunchInterceptorV2> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.launchInterceptorMap = map;
        }

        public final void setLauncherInterceptor$pantanal_interface_release(@Nullable ILaunchInterceptor iLaunchInterceptor) {
            this.launcherInterceptor = iLaunchInterceptor;
        }

        public final void setLoadTimeout$pantanal_interface_release(int i) {
            this.loadTimeout = i;
        }

        public final void setLogger$pantanal_interface_release(@Nullable ks9 ks9Var) {
        }

        @NotNull
        public final Builder setMode(@NotNull Mode mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.mode = mode;
            return this;
        }

        public final void setMode$pantanal_interface_release(@NotNull Mode mode) {
            Intrinsics.checkNotNullParameter(mode, "<set-?>");
            this.mode = mode;
        }

        public final void setNeedHostHandleCardBg$pantanal_interface_release(boolean z) {
            this.needHostHandleCardBg = z;
        }

        public final void setSeedingConfiguration$pantanal_interface_release(@Nullable SeedlingConfiguration seedlingConfiguration) {
            this.seedingConfiguration = seedlingConfiguration;
        }

        public final void setShouldNotifyCardServiceToInit$pantanal_interface_release(boolean z) {
            this.shouldNotifyCardServiceToInit = z;
        }

        public final void setShouldParseSeedlingUIData$pantanal_interface_release(boolean z) {
            this.shouldParseSeedlingUIData = z;
        }

        public final void setShouldPreInitInstantSdk$pantanal_interface_release(boolean z) {
            this.shouldPreInitInstantSdk = z;
        }

        public final void setShouldPreInitSeedlingPlugin$pantanal_interface_release(boolean z) {
            this.shouldPreInitSeedlingPlugin = z;
        }

        public final void setSupportAddParamsToIntent$pantanal_interface_release(boolean z) {
            this.isSupportAddParamsToIntent = z;
        }

        public final void setSupportChildThread$pantanal_interface_release(boolean z) {
            this.isSupportChildThread = z;
        }

        public final void setSupportEntranceList$pantanal_interface_release(@NotNull List<Entrance> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.supportEntranceList = list;
        }

        public final void setSupportInterruptLoadingSeedlingCard$pantanal_interface_release(boolean z) {
            this.supportInterruptLoadingSeedlingCard = z;
        }

        public final void setSupportUseServiceDecisionFromPlugin$pantanal_interface_release(@Nullable Boolean bool) {
            this.supportUseServiceDecisionFromPlugin = bool;
        }

        public final void setSupportedCardCategory$pantanal_interface_release(@NotNull List<? extends CardCategory> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.supportedCardCategory = list;
        }

        @NotNull
        public final Builder shouldNotifyCardServiceToInit(boolean shouldNotifyCardServiceToInit) {
            this.shouldNotifyCardServiceToInit = shouldNotifyCardServiceToInit;
            return this;
        }

        @NotNull
        public final Builder shouldParseSeedlingUIData(boolean shouldParseSeedlingUIData) {
            this.shouldParseSeedlingUIData = shouldParseSeedlingUIData;
            return this;
        }

        @NotNull
        public final Builder shouldPreInitInstantSdk(boolean shouldPreInitInstantSdk) {
            this.shouldPreInitInstantSdk = shouldPreInitInstantSdk;
            return this;
        }

        @NotNull
        public final Builder shouldPreInitSeedlingPlugin(boolean shouldPreInitSeedlingPlugin) {
            this.shouldPreInitSeedlingPlugin = shouldPreInitSeedlingPlugin;
            return this;
        }

        @NotNull
        public final Builder supportEntranceList(@NotNull List<? extends Entrance> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.supportEntranceList.clear();
            this.supportEntranceList.addAll(list);
            return this;
        }

        @NotNull
        public final Builder supportInterruptLoadingSeedlingCard(boolean supportInterruptLoadingSeedlingCard) {
            this.supportInterruptLoadingSeedlingCard = supportInterruptLoadingSeedlingCard;
            return this;
        }

        @NotNull
        public final Builder supportUseServiceDecisionFromPlugin(boolean supportUseServiceDecisionFromPlugin) {
            this.supportUseServiceDecisionFromPlugin = Boolean.valueOf(supportUseServiceDecisionFromPlugin);
            return this;
        }

        @NotNull
        public final Builder supportedCardCategory(@NotNull List<? extends CardCategory> cardCategory) {
            Intrinsics.checkNotNullParameter(cardCategory, "cardCategory");
            this.supportedCardCategory = cardCategory;
            return this;
        }
    }

    public Configuration(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.builder = builder;
        this.bundle = builder.getBundle();
        this.entrance = this.builder.getEntrance();
        this.supportEntranceList = this.builder.getSupportEntranceList$pantanal_interface_release();
        this.launchInterceptorMap = this.builder.getLaunchInterceptorMap$pantanal_interface_release();
        this.mode = this.builder.getMode();
        this.supportedCardCategory = this.builder.getSupportedCardCategory$pantanal_interface_release();
        this.loadTimeout = this.builder.getLoadTimeout();
        this.seedingConfiguration = this.builder.getSeedingConfiguration();
        this.builder.getInstantConfiguration$pantanal_interface_release();
        this.launcherInterceptor = this.builder.getLauncherInterceptor();
        this.builder.getLogger$pantanal_interface_release();
        this.shouldNotifyCardServiceToInit = this.builder.getShouldNotifyCardServiceToInit();
        this.supportInterruptLoadingSeedlingCard = this.builder.getSupportInterruptLoadingSeedlingCard();
        this.shouldPreInitSeedlingPlugin = this.builder.getShouldPreInitSeedlingPlugin();
        this.shouldPreInitInstantSdk = this.builder.getShouldPreInitInstantSdk();
        this.isContextLoadedByAppDefaultClassLoader = this.builder.getIsContextLoadedByAppDefaultClassLoader();
        this.shouldParseSeedlingUIData = this.builder.getShouldParseSeedlingUIData();
        this.hostClassLoader = this.builder.getHostClassLoader();
        this.deltaOfLCAParentClassLoader = this.builder.getDeltaOfLCAParentClassLoader();
        this.enableV2Callback = this.builder.getEnableV2Callback();
        this.isHostLightColor = this.builder.getIsHostLightColor();
        this.extrasDataToEngine = this.builder.getExtrasDataToEngine$pantanal_interface_release();
        this.checkForceCopySwitch = this.builder.getCheckForceCopySwitch();
        this.isSupportChildThread = this.builder.getIsSupportChildThread();
        this.enableInstantCardView = this.builder.getEnableInstantCardView();
        this.supportUseServiceDecisionFromPlugin = this.builder.getSupportUseServiceDecisionFromPlugin();
        this.isSupportAddParamsToIntent = this.builder.getIsSupportAddParamsToIntent();
        this.extrasDataToPlugin = this.builder.getExtrasDataToPlugin$pantanal_interface_release();
        this.interceptorInstantCardReload = this.builder.getInterceptorInstantCardReload();
    }

    public static /* synthetic */ Configuration copy$default(Configuration configuration, Builder builder, int i, Object obj) {
        if ((i & 1) != 0) {
            builder = configuration.builder;
        }
        return configuration.copy(builder);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Builder getBuilder() {
        return this.builder;
    }

    @NotNull
    public final Configuration copy(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return new Configuration(builder);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Configuration) && Intrinsics.areEqual(this.builder, ((Configuration) other).builder);
    }

    @NotNull
    public final Builder getBuilder() {
        return this.builder;
    }

    @Nullable
    public final Bundle getBundle() {
        return this.bundle;
    }

    public final boolean getCheckForceCopySwitch() {
        return this.checkForceCopySwitch;
    }

    public final int getDeltaOfLCAParentClassLoader() {
        return this.deltaOfLCAParentClassLoader;
    }

    public final boolean getEnableInstantCardView() {
        return this.enableInstantCardView;
    }

    public final boolean getEnableV2Callback() {
        return this.enableV2Callback;
    }

    @NotNull
    public final Entrance getEntrance() {
        return this.entrance;
    }

    @NotNull
    public final Map<String, Object> getExtrasDataToEngine() {
        return this.extrasDataToEngine;
    }

    @NotNull
    public final Map<String, Object> getExtrasDataToPlugin() {
        return this.extrasDataToPlugin;
    }

    @Nullable
    public final ClassLoader getHostClassLoader() {
        return this.hostClassLoader;
    }

    @Nullable
    public final tba getInstantConfiguration() {
        return null;
    }

    public final boolean getInterceptorInstantCardReload() {
        return this.interceptorInstantCardReload;
    }

    @NotNull
    public final Map<Entrance, ILaunchInterceptorV2> getLaunchInterceptorMap() {
        return this.launchInterceptorMap;
    }

    @Nullable
    public final ILaunchInterceptor getLauncherInterceptor() {
        return this.launcherInterceptor;
    }

    public final int getLoadTimeout() {
        return this.loadTimeout;
    }

    @Nullable
    public final ks9 getLogger() {
        return null;
    }

    @NotNull
    public final Mode getMode() {
        return this.mode;
    }

    public final boolean getNeedHostHandleCardBg() {
        return this.needHostHandleCardBg;
    }

    @Nullable
    public final SeedlingConfiguration getSeedingConfiguration() {
        return this.seedingConfiguration;
    }

    public final boolean getShouldNotifyCardServiceToInit() {
        return this.shouldNotifyCardServiceToInit;
    }

    public final boolean getShouldParseSeedlingUIData() {
        return this.shouldParseSeedlingUIData;
    }

    public final boolean getShouldPreInitInstantSdk() {
        return this.shouldPreInitInstantSdk;
    }

    public final boolean getShouldPreInitSeedlingPlugin() {
        return this.shouldPreInitSeedlingPlugin;
    }

    @NotNull
    public final List<Entrance> getSupportEntranceList() {
        return this.supportEntranceList;
    }

    public final boolean getSupportInterruptLoadingSeedlingCard() {
        return this.supportInterruptLoadingSeedlingCard;
    }

    @Nullable
    public final Boolean getSupportUseServiceDecisionFromPlugin() {
        return this.supportUseServiceDecisionFromPlugin;
    }

    @NotNull
    public final List<CardCategory> getSupportedCardCategory() {
        return this.supportedCardCategory;
    }

    public int hashCode() {
        return this.builder.hashCode();
    }

    /* JADX INFO: renamed from: isContextLoadedByAppDefaultClassLoader, reason: from getter */
    public final boolean getIsContextLoadedByAppDefaultClassLoader() {
        return this.isContextLoadedByAppDefaultClassLoader;
    }

    /* JADX INFO: renamed from: isHostLightColor, reason: from getter */
    public final boolean getIsHostLightColor() {
        return this.isHostLightColor;
    }

    /* JADX INFO: renamed from: isSupportAddParamsToIntent, reason: from getter */
    public final boolean getIsSupportAddParamsToIntent() {
        return this.isSupportAddParamsToIntent;
    }

    /* JADX INFO: renamed from: isSupportChildThread, reason: from getter */
    public final boolean getIsSupportChildThread() {
        return this.isSupportChildThread;
    }

    public final void setBuilder(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<set-?>");
        this.builder = builder;
    }

    public final void setCheckForceCopySwitch(boolean z) {
        this.checkForceCopySwitch = z;
    }

    public final void setContextLoadedByAppDefaultClassLoader(boolean z) {
        this.isContextLoadedByAppDefaultClassLoader = z;
    }

    public final void setDeltaOfLCAParentClassLoader(int i) {
        this.deltaOfLCAParentClassLoader = i;
    }

    public final void setEnableInstantCardView(boolean z) {
        this.enableInstantCardView = z;
    }

    public final void setEnableV2Callback(boolean z) {
        this.enableV2Callback = z;
    }

    public final void setExtrasDataToEngine(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.extrasDataToEngine = map;
    }

    public final void setExtrasDataToPlugin(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.extrasDataToPlugin = map;
    }

    public final void setHostClassLoader(@Nullable ClassLoader classLoader) {
        this.hostClassLoader = classLoader;
    }

    public final void setHostLightColor(boolean z) {
        this.isHostLightColor = z;
    }

    public final void setInterceptorInstantCardReload(boolean z) {
        this.interceptorInstantCardReload = z;
    }

    public final void setNeedHostHandleCardBg(boolean z) {
        this.needHostHandleCardBg = z;
    }

    public final void setShouldNotifyCardServiceToInit(boolean z) {
        this.shouldNotifyCardServiceToInit = z;
    }

    public final void setShouldParseSeedlingUIData(boolean z) {
        this.shouldParseSeedlingUIData = z;
    }

    public final void setShouldPreInitInstantSdk(boolean z) {
        this.shouldPreInitInstantSdk = z;
    }

    public final void setShouldPreInitSeedlingPlugin(boolean z) {
        this.shouldPreInitSeedlingPlugin = z;
    }

    public final void setSupportAddParamsToIntent(boolean z) {
        this.isSupportAddParamsToIntent = z;
    }

    public final void setSupportChildThread(boolean z) {
        this.isSupportChildThread = z;
    }

    public final void setSupportInterruptLoadingSeedlingCard(boolean z) {
        this.supportInterruptLoadingSeedlingCard = z;
    }

    public final void setSupportUseServiceDecisionFromPlugin(@Nullable Boolean bool) {
        this.supportUseServiceDecisionFromPlugin = bool;
    }

    @NotNull
    public String toString() {
        return "Configuration(entrance=" + this.entrance + ", supportEntranceList=" + this.supportEntranceList + ", mode=" + this.mode + ", loadTimeout=" + this.loadTimeout + ", supportedCardCategory=" + this.supportedCardCategory + ",shouldNotifyCardServiceToInit=" + this.shouldNotifyCardServiceToInit + ", shouldPreInitSeedlingPlugin=" + this.shouldPreInitSeedlingPlugin + ", seedingConfiguration=" + this.seedingConfiguration + ", instantConfiguration=" + ((Object) null) + ",shouldParseSeedlingUIData=" + this.shouldParseSeedlingUIData + ",needHostHandleCardBg=" + this.needHostHandleCardBg + ",isHostLightColor=" + this.isHostLightColor + ",launchInterceptorMap=" + this.launchInterceptorMap + ",launcherInterceptor=" + this.launcherInterceptor + ", enableV2Callback=" + this.enableV2Callback + ",checkForceCopySwitch=" + this.checkForceCopySwitch + ",isSupportChildThread=" + this.isSupportChildThread + ",enableInstantCardView=" + this.enableInstantCardView + ",supportUseServiceDecisionFromPlugin=" + this.supportUseServiceDecisionFromPlugin + "isSupportAddParamsToIntent=" + this.isSupportAddParamsToIntent + "extrasDataToPlugin=" + this.extrasDataToPlugin + "extrasDataToEngine=" + this.extrasDataToEngine + ")";
    }
}
