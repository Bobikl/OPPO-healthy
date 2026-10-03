package pantanal.decision;

import com.oplus.aiunit.vision.oea;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\u000fH&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H&J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u000b\u001a\u00020\fH&J\u001a\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dH&J\u001a\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u000b\u001a\u00020\fH&J\u001a\u0010\u001f\u001a\u00020\u00182\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H&J\u0016\u0010#\u001a\u00020\u00182\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u0007H&J\u0012\u0010%\u001a\u00020\u00182\b\b\u0002\u0010\u000b\u001a\u00020\fH&J\u0012\u0010&\u001a\u00020\u00182\b\b\u0002\u0010\u000b\u001a\u00020\fH&J\u0012\u0010'\u001a\u00020\u00182\b\b\u0002\u0010\u000b\u001a\u00020\fH&J\u0012\u0010(\u001a\u00020\u00182\b\b\u0002\u0010\u000b\u001a\u00020\fH&J\u001a\u0010)\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u000b\u001a\u00020\fH&J\u001a\u0010*\u001a\u00020\u00182\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dH&J\u001a\u0010+\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u000b\u001a\u00020\fH&J\u001a\u0010,\u001a\u00020\u00182\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dH&¨\u0006-"}, d2 = {"Lpantanal/decision/IServiceDecision;", "", "disableSubDomain", "", "subDomain", "", "getCacheMultiInstanceRecommendList", "", "Lpantanal/decision/ServiceInfo;", "getCacheRecommendList", "getCurMultiInstanceRecommendList", "recmdType", "", "getCurrentRecommendList", "getCurrentServiceDecisionVersion", "", "getDecisionAllData", "queryRecommendSceneList", "Lpantanal/decision/PantaSceneInfo;", "queryRecommendSceneMultiInstanceist", "queryServiceInfo", "Lpantanal/decision/SeedlingServiceInfo;", "serviceId", "registerDecisionListCallback", "", oea.CALLBACK, "Lpantanal/decision/DecisionObserver;", "registerDecisionSceneListCallback", "pantaSceneObserver", "Lpantanal/decision/PantaSceneListObserver;", "registerMultiInstanceDecisionListCallBack", "registerSceneMultiInstanceCallback", "reportStatistics", "statisticsBean", "Lpantanal/decision/StatisticsBean;", "reportStatisticsList", "statisticsList", "unregisterAllDecisionListCallback", "unregisterAllMultiInstanceListCallback", "unregisterAllSceneListCallback", "unregisterAllSceneMultiInstanceCallback", "unregisterDecisionListCallback", "unregisterDecisionSceneListCallback", "unregisterMultiInstanceListCallback", "unregisterSceneMultiInstanceCallback", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IServiceDecision {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ List getCurMultiInstanceRecommendList$default(IServiceDecision iServiceDecision, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurMultiInstanceRecommendList");
            }
            if ((i2 & 1) != 0) {
                i = 3;
            }
            return iServiceDecision.getCurMultiInstanceRecommendList(i);
        }

        public static /* synthetic */ List getCurrentRecommendList$default(IServiceDecision iServiceDecision, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurrentRecommendList");
            }
            if ((i2 & 1) != 0) {
                i = 3;
            }
            return iServiceDecision.getCurrentRecommendList(i);
        }

        public static /* synthetic */ List queryRecommendSceneList$default(IServiceDecision iServiceDecision, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryRecommendSceneList");
            }
            if ((i2 & 1) != 0) {
                i = 3;
            }
            return iServiceDecision.queryRecommendSceneList(i);
        }

        public static /* synthetic */ List queryRecommendSceneMultiInstanceist$default(IServiceDecision iServiceDecision, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryRecommendSceneMultiInstanceist");
            }
            if ((i2 & 1) != 0) {
                i = 3;
            }
            return iServiceDecision.queryRecommendSceneMultiInstanceist(i);
        }

        public static /* synthetic */ void registerDecisionListCallback$default(IServiceDecision iServiceDecision, DecisionObserver decisionObserver, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerDecisionListCallback");
            }
            if ((i2 & 2) != 0) {
                i = 3;
            }
            iServiceDecision.registerDecisionListCallback(decisionObserver, i);
        }

        public static /* synthetic */ void registerDecisionSceneListCallback$default(IServiceDecision iServiceDecision, int i, PantaSceneListObserver pantaSceneListObserver, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerDecisionSceneListCallback");
            }
            if ((i2 & 1) != 0) {
                i = 3;
            }
            iServiceDecision.registerDecisionSceneListCallback(i, pantaSceneListObserver);
        }

        public static /* synthetic */ void registerMultiInstanceDecisionListCallBack$default(IServiceDecision iServiceDecision, DecisionObserver decisionObserver, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerMultiInstanceDecisionListCallBack");
            }
            if ((i2 & 2) != 0) {
                i = 3;
            }
            iServiceDecision.registerMultiInstanceDecisionListCallBack(decisionObserver, i);
        }

        public static /* synthetic */ void registerSceneMultiInstanceCallback$default(IServiceDecision iServiceDecision, int i, PantaSceneListObserver pantaSceneListObserver, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerSceneMultiInstanceCallback");
            }
            if ((i2 & 1) != 0) {
                i = 3;
            }
            iServiceDecision.registerSceneMultiInstanceCallback(i, pantaSceneListObserver);
        }

        public static /* synthetic */ void unregisterAllDecisionListCallback$default(IServiceDecision iServiceDecision, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unregisterAllDecisionListCallback");
            }
            if ((i2 & 1) != 0) {
                i = 3;
            }
            iServiceDecision.unregisterAllDecisionListCallback(i);
        }

        public static /* synthetic */ void unregisterAllMultiInstanceListCallback$default(IServiceDecision iServiceDecision, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unregisterAllMultiInstanceListCallback");
            }
            if ((i2 & 1) != 0) {
                i = 3;
            }
            iServiceDecision.unregisterAllMultiInstanceListCallback(i);
        }

        public static /* synthetic */ void unregisterAllSceneListCallback$default(IServiceDecision iServiceDecision, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unregisterAllSceneListCallback");
            }
            if ((i2 & 1) != 0) {
                i = 3;
            }
            iServiceDecision.unregisterAllSceneListCallback(i);
        }

        public static /* synthetic */ void unregisterAllSceneMultiInstanceCallback$default(IServiceDecision iServiceDecision, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unregisterAllSceneMultiInstanceCallback");
            }
            if ((i2 & 1) != 0) {
                i = 3;
            }
            iServiceDecision.unregisterAllSceneMultiInstanceCallback(i);
        }

        public static /* synthetic */ void unregisterDecisionListCallback$default(IServiceDecision iServiceDecision, DecisionObserver decisionObserver, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unregisterDecisionListCallback");
            }
            if ((i2 & 2) != 0) {
                i = 3;
            }
            iServiceDecision.unregisterDecisionListCallback(decisionObserver, i);
        }

        public static /* synthetic */ void unregisterDecisionSceneListCallback$default(IServiceDecision iServiceDecision, int i, PantaSceneListObserver pantaSceneListObserver, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unregisterDecisionSceneListCallback");
            }
            if ((i2 & 1) != 0) {
                i = 3;
            }
            iServiceDecision.unregisterDecisionSceneListCallback(i, pantaSceneListObserver);
        }

        public static /* synthetic */ void unregisterMultiInstanceListCallback$default(IServiceDecision iServiceDecision, DecisionObserver decisionObserver, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unregisterMultiInstanceListCallback");
            }
            if ((i2 & 2) != 0) {
                i = 3;
            }
            iServiceDecision.unregisterMultiInstanceListCallback(decisionObserver, i);
        }

        public static /* synthetic */ void unregisterSceneMultiInstanceCallback$default(IServiceDecision iServiceDecision, int i, PantaSceneListObserver pantaSceneListObserver, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unregisterSceneMultiInstanceCallback");
            }
            if ((i2 & 1) != 0) {
                i = 3;
            }
            iServiceDecision.unregisterSceneMultiInstanceCallback(i, pantaSceneListObserver);
        }
    }

    boolean disableSubDomain(@NotNull String subDomain);

    @NotNull
    List<ServiceInfo> getCacheMultiInstanceRecommendList();

    @NotNull
    List<ServiceInfo> getCacheRecommendList();

    @NotNull
    List<ServiceInfo> getCurMultiInstanceRecommendList(int recmdType);

    @NotNull
    List<ServiceInfo> getCurrentRecommendList(int recmdType);

    long getCurrentServiceDecisionVersion();

    @NotNull
    List<ServiceInfo> getDecisionAllData();

    @NotNull
    List<PantaSceneInfo> queryRecommendSceneList(int recmdType);

    @NotNull
    List<PantaSceneInfo> queryRecommendSceneMultiInstanceist(int recmdType);

    @NotNull
    SeedlingServiceInfo queryServiceInfo(@NotNull String serviceId);

    void registerDecisionListCallback(@NotNull DecisionObserver cb, int recmdType);

    void registerDecisionSceneListCallback(int recmdType, @NotNull PantaSceneListObserver pantaSceneObserver);

    void registerMultiInstanceDecisionListCallBack(@NotNull DecisionObserver cb, int recmdType);

    void registerSceneMultiInstanceCallback(int recmdType, @NotNull PantaSceneListObserver pantaSceneObserver);

    void reportStatistics(@NotNull StatisticsBean statisticsBean);

    void reportStatisticsList(@NotNull List<StatisticsBean> statisticsList);

    void unregisterAllDecisionListCallback(int recmdType);

    void unregisterAllMultiInstanceListCallback(int recmdType);

    void unregisterAllSceneListCallback(int recmdType);

    void unregisterAllSceneMultiInstanceCallback(int recmdType);

    void unregisterDecisionListCallback(@NotNull DecisionObserver cb, int recmdType);

    void unregisterDecisionSceneListCallback(int recmdType, @NotNull PantaSceneListObserver pantaSceneObserver);

    void unregisterMultiInstanceListCallback(@NotNull DecisionObserver cb, int recmdType);

    void unregisterSceneMultiInstanceCallback(int recmdType, @NotNull PantaSceneListObserver pantaSceneObserver);
}
