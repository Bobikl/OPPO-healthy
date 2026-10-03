package com.oplus.seedling.sdk;

import com.oplus.seedling.sdk.entity.EngineType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001:\u0001FB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u0013\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010B\u001a\u00020\t2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\u000fHÖ\u0001J\b\u0010E\u001a\u00020\u0019H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R(\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000b\"\u0004\b1\u0010\rR\u001a\u00102\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u000b\"\u0004\b3\u0010\rR\u001a\u00104\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u000b\"\u0004\b5\u0010\rR\u001a\u00106\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u000b\"\u0004\b7\u0010\rR\u001a\u00108\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000b\"\u0004\b:\u0010\rR\u0011\u0010;\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u000bR\u001a\u0010=\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u000b\"\u0004\b?\u0010\r¨\u0006G"}, d2 = {"Lcom/oplus/seedling/sdk/SeedlingInitConfig;", "", "builder", "Lcom/oplus/seedling/sdk/SeedlingInitConfig$Builder;", "(Lcom/oplus/seedling/sdk/SeedlingInitConfig$Builder;)V", "getBuilder", "()Lcom/oplus/seedling/sdk/SeedlingInitConfig$Builder;", "setBuilder", "checkForceCopySwitch", "", "getCheckForceCopySwitch", "()Z", "setCheckForceCopySwitch", "(Z)V", "deltaOfLCAParentClassLoader", "", "getDeltaOfLCAParentClassLoader", "()I", "setDeltaOfLCAParentClassLoader", "(I)V", "engineType", "Lcom/oplus/seedling/sdk/entity/EngineType;", "getEngineType", "()Lcom/oplus/seedling/sdk/entity/EngineType;", "entranceAuthorityName", "", "getEntranceAuthorityName", "()Ljava/lang/String;", "entranceType", "getEntranceType", "setEntranceType", "extrasDataToEngine", "", "getExtrasDataToEngine", "()Ljava/util/Map;", "setExtrasDataToEngine", "(Ljava/util/Map;)V", "extrasDataToPlugin", "", "getExtrasDataToPlugin", "setExtrasDataToPlugin", "hostClassLoader", "Ljava/lang/ClassLoader;", "getHostClassLoader", "()Ljava/lang/ClassLoader;", "setHostClassLoader", "(Ljava/lang/ClassLoader;)V", "initViaPantacardSdk", "getInitViaPantacardSdk", "setInitViaPantacardSdk", "isContextLoadedByAppDefaultClassLoader", "setContextLoadedByAppDefaultClassLoader", "isHostLightColor", "setHostLightColor", "isSupportAddParamsToIntent", "setSupportAddParamsToIntent", "needHostHandleCardBg", "getNeedHostHandleCardBg", "setNeedHostHandleCardBg", "shouldNotifyCardServiceToInit", "getShouldNotifyCardServiceToInit", "supportInteruptCreatingSeedlingCard", "getSupportInteruptCreatingSeedlingCard", "setSupportInteruptCreatingSeedlingCard", "component1", "copy", "equals", "other", "hashCode", "toString", "Builder", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SeedlingInitConfig {

    @NotNull
    private Builder builder;
    private boolean checkForceCopySwitch;
    private int deltaOfLCAParentClassLoader;

    @NotNull
    private final EngineType engineType;

    @NotNull
    private final String entranceAuthorityName;
    private int entranceType;

    @NotNull
    private Map<String, Object> extrasDataToEngine;

    @NotNull
    private Map<String, ? extends Object> extrasDataToPlugin;

    @Nullable
    private ClassLoader hostClassLoader;
    private boolean initViaPantacardSdk;
    private boolean isContextLoadedByAppDefaultClassLoader;
    private boolean isHostLightColor;
    private boolean isSupportAddParamsToIntent;
    private boolean needHostHandleCardBg;
    private final boolean shouldNotifyCardServiceToInit;
    private boolean supportInteruptCreatingSeedlingCard;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010C\u001a\u00020DJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\nJ\u001c\u0010\u001e\u001a\u00020\u00002\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010%J\u001c\u0010$\u001a\u00020\u00002\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010%J\u0010\u0010(\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010)J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0004J\u000e\u00101\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0004J\u000e\u00104\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0004J\u000e\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0004J\u000e\u0010:\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0004J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u0004J\u000e\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR(\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010%X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\u001a\u00101\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR\u001a\u00104\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\bR\u001a\u00107\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0006\"\u0004\b9\u0010\bR\u001a\u0010:\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR\u001a\u0010=\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010\bR\u001a\u0010@\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010\b¨\u0006E"}, d2 = {"Lcom/oplus/seedling/sdk/SeedlingInitConfig$Builder;", "", "()V", "checkForceCopySwitch", "", "getCheckForceCopySwitch$pantanal_client_release", "()Z", "setCheckForceCopySwitch$pantanal_client_release", "(Z)V", "deltaOfLCAParentClassLoader", "", "getDeltaOfLCAParentClassLoader$pantanal_client_release", "()I", "setDeltaOfLCAParentClassLoader$pantanal_client_release", "(I)V", "engineType", "Lcom/oplus/seedling/sdk/entity/EngineType;", "getEngineType$pantanal_client_release", "()Lcom/oplus/seedling/sdk/entity/EngineType;", "setEngineType$pantanal_client_release", "(Lcom/oplus/seedling/sdk/entity/EngineType;)V", "entranceAuthorityName", "", "getEntranceAuthorityName$pantanal_client_release", "()Ljava/lang/String;", "setEntranceAuthorityName$pantanal_client_release", "(Ljava/lang/String;)V", "entranceType", "getEntranceType$pantanal_client_release", "setEntranceType$pantanal_client_release", "extrasDataToEngine", "", "getExtrasDataToEngine$pantanal_client_release", "()Ljava/util/Map;", "setExtrasDataToEngine$pantanal_client_release", "(Ljava/util/Map;)V", "extrasDataToPlugin", "", "getExtrasDataToPlugin$pantanal_client_release", "setExtrasDataToPlugin$pantanal_client_release", "hostClassLoader", "Ljava/lang/ClassLoader;", "getHostClassLoader$pantanal_client_release", "()Ljava/lang/ClassLoader;", "setHostClassLoader$pantanal_client_release", "(Ljava/lang/ClassLoader;)V", "initViaPantacardSdk", "getInitViaPantacardSdk$pantanal_client_release", "setInitViaPantacardSdk$pantanal_client_release", "isContextLoadedByAppDefaultClassLoader", "isContextLoadedByAppDefaultClassLoader$pantanal_client_release", "setContextLoadedByAppDefaultClassLoader$pantanal_client_release", "isHostLightColor", "isHostLightColor$pantanal_client_release", "setHostLightColor$pantanal_client_release", "isSupportAddParamsToIntent", "isSupportAddParamsToIntent$pantanal_client_release", "setSupportAddParamsToIntent$pantanal_client_release", "needHostHandleCardBg", "getNeedHostHandleCardBg$pantanal_client_release", "setNeedHostHandleCardBg$pantanal_client_release", "shouldNotifyCardServiceToInit", "getShouldNotifyCardServiceToInit$pantanal_client_release", "setShouldNotifyCardServiceToInit$pantanal_client_release", "supportInteruptCreatingSeedlingCard", "getSupportInteruptCreatingSeedlingCard$pantanal_client_release", "setSupportInteruptCreatingSeedlingCard$pantanal_client_release", "build", "Lcom/oplus/seedling/sdk/SeedlingInitConfig;", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private ClassLoader hostClassLoader;
        private boolean initViaPantacardSdk;
        private boolean isSupportAddParamsToIntent;
        private boolean needHostHandleCardBg;
        private boolean shouldNotifyCardServiceToInit;
        private boolean supportInteruptCreatingSeedlingCard;

        @NotNull
        private EngineType engineType = EngineType.STANDARD;

        @NotNull
        private String entranceAuthorityName = "";
        private boolean isContextLoadedByAppDefaultClassLoader = true;
        private int deltaOfLCAParentClassLoader = 1;
        private boolean isHostLightColor = true;

        @NotNull
        private Map<String, Object> extrasDataToEngine = new LinkedHashMap();
        private boolean checkForceCopySwitch = true;
        private int entranceType = -1;

        @NotNull
        private Map<String, ? extends Object> extrasDataToPlugin = new LinkedHashMap();

        @NotNull
        public final SeedlingInitConfig build() {
            return new SeedlingInitConfig(this);
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
        public final Builder engineType(@NotNull EngineType engineType) {
            Intrinsics.checkNotNullParameter(engineType, "engineType");
            this.engineType = engineType;
            return this;
        }

        @NotNull
        public final Builder entranceAuthorityName(@NotNull String entranceAuthorityName) {
            Intrinsics.checkNotNullParameter(entranceAuthorityName, "entranceAuthorityName");
            this.entranceAuthorityName = entranceAuthorityName;
            return this;
        }

        @NotNull
        public final Builder entranceType(int entranceType) {
            this.entranceType = entranceType;
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

        /* JADX INFO: renamed from: getCheckForceCopySwitch$pantanal_client_release, reason: from getter */
        public final boolean getCheckForceCopySwitch() {
            return this.checkForceCopySwitch;
        }

        /* JADX INFO: renamed from: getDeltaOfLCAParentClassLoader$pantanal_client_release, reason: from getter */
        public final int getDeltaOfLCAParentClassLoader() {
            return this.deltaOfLCAParentClassLoader;
        }

        @NotNull
        /* JADX INFO: renamed from: getEngineType$pantanal_client_release, reason: from getter */
        public final EngineType getEngineType() {
            return this.engineType;
        }

        @NotNull
        /* JADX INFO: renamed from: getEntranceAuthorityName$pantanal_client_release, reason: from getter */
        public final String getEntranceAuthorityName() {
            return this.entranceAuthorityName;
        }

        /* JADX INFO: renamed from: getEntranceType$pantanal_client_release, reason: from getter */
        public final int getEntranceType() {
            return this.entranceType;
        }

        @NotNull
        public final Map<String, Object> getExtrasDataToEngine$pantanal_client_release() {
            return this.extrasDataToEngine;
        }

        @NotNull
        public final Map<String, Object> getExtrasDataToPlugin$pantanal_client_release() {
            return this.extrasDataToPlugin;
        }

        @Nullable
        /* JADX INFO: renamed from: getHostClassLoader$pantanal_client_release, reason: from getter */
        public final ClassLoader getHostClassLoader() {
            return this.hostClassLoader;
        }

        /* JADX INFO: renamed from: getInitViaPantacardSdk$pantanal_client_release, reason: from getter */
        public final boolean getInitViaPantacardSdk() {
            return this.initViaPantacardSdk;
        }

        /* JADX INFO: renamed from: getNeedHostHandleCardBg$pantanal_client_release, reason: from getter */
        public final boolean getNeedHostHandleCardBg() {
            return this.needHostHandleCardBg;
        }

        /* JADX INFO: renamed from: getShouldNotifyCardServiceToInit$pantanal_client_release, reason: from getter */
        public final boolean getShouldNotifyCardServiceToInit() {
            return this.shouldNotifyCardServiceToInit;
        }

        /* JADX INFO: renamed from: getSupportInteruptCreatingSeedlingCard$pantanal_client_release, reason: from getter */
        public final boolean getSupportInteruptCreatingSeedlingCard() {
            return this.supportInteruptCreatingSeedlingCard;
        }

        @NotNull
        public final Builder hostClassLoader(@Nullable ClassLoader hostClassLoader) {
            this.hostClassLoader = hostClassLoader;
            return this;
        }

        @NotNull
        public final Builder initViaPantacardSdk(boolean initViaPantacardSdk) {
            this.initViaPantacardSdk = initViaPantacardSdk;
            return this;
        }

        @NotNull
        public final Builder isContextLoadedByAppDefaultClassLoader(boolean isContextLoadedByAppDefaultClassLoader) {
            this.isContextLoadedByAppDefaultClassLoader = isContextLoadedByAppDefaultClassLoader;
            return this;
        }

        /* JADX INFO: renamed from: isContextLoadedByAppDefaultClassLoader$pantanal_client_release, reason: from getter */
        public final boolean getIsContextLoadedByAppDefaultClassLoader() {
            return this.isContextLoadedByAppDefaultClassLoader;
        }

        @NotNull
        public final Builder isHostLightColor(boolean isHostLightColor) {
            this.isHostLightColor = isHostLightColor;
            return this;
        }

        /* JADX INFO: renamed from: isHostLightColor$pantanal_client_release, reason: from getter */
        public final boolean getIsHostLightColor() {
            return this.isHostLightColor;
        }

        @NotNull
        public final Builder isSupportAddParamsToIntent(boolean isSupportAddParamsToIntent) {
            this.isSupportAddParamsToIntent = isSupportAddParamsToIntent;
            return this;
        }

        /* JADX INFO: renamed from: isSupportAddParamsToIntent$pantanal_client_release, reason: from getter */
        public final boolean getIsSupportAddParamsToIntent() {
            return this.isSupportAddParamsToIntent;
        }

        @NotNull
        public final Builder needHostHandleCardBg(boolean needHostHandleCardBg) {
            this.needHostHandleCardBg = needHostHandleCardBg;
            return this;
        }

        public final void setCheckForceCopySwitch$pantanal_client_release(boolean z) {
            this.checkForceCopySwitch = z;
        }

        public final void setContextLoadedByAppDefaultClassLoader$pantanal_client_release(boolean z) {
            this.isContextLoadedByAppDefaultClassLoader = z;
        }

        public final void setDeltaOfLCAParentClassLoader$pantanal_client_release(int i) {
            this.deltaOfLCAParentClassLoader = i;
        }

        public final void setEngineType$pantanal_client_release(@NotNull EngineType engineType) {
            Intrinsics.checkNotNullParameter(engineType, "<set-?>");
            this.engineType = engineType;
        }

        public final void setEntranceAuthorityName$pantanal_client_release(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.entranceAuthorityName = str;
        }

        public final void setEntranceType$pantanal_client_release(int i) {
            this.entranceType = i;
        }

        public final void setExtrasDataToEngine$pantanal_client_release(@NotNull Map<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.extrasDataToEngine = map;
        }

        public final void setExtrasDataToPlugin$pantanal_client_release(@NotNull Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.extrasDataToPlugin = map;
        }

        public final void setHostClassLoader$pantanal_client_release(@Nullable ClassLoader classLoader) {
            this.hostClassLoader = classLoader;
        }

        public final void setHostLightColor$pantanal_client_release(boolean z) {
            this.isHostLightColor = z;
        }

        public final void setInitViaPantacardSdk$pantanal_client_release(boolean z) {
            this.initViaPantacardSdk = z;
        }

        public final void setNeedHostHandleCardBg$pantanal_client_release(boolean z) {
            this.needHostHandleCardBg = z;
        }

        public final void setShouldNotifyCardServiceToInit$pantanal_client_release(boolean z) {
            this.shouldNotifyCardServiceToInit = z;
        }

        public final void setSupportAddParamsToIntent$pantanal_client_release(boolean z) {
            this.isSupportAddParamsToIntent = z;
        }

        public final void setSupportInteruptCreatingSeedlingCard$pantanal_client_release(boolean z) {
            this.supportInteruptCreatingSeedlingCard = z;
        }

        @NotNull
        public final Builder shouldNotifyCardServiceToInit(boolean shouldNotifyCardServiceToInit) {
            this.shouldNotifyCardServiceToInit = shouldNotifyCardServiceToInit;
            return this;
        }

        @NotNull
        public final Builder supportInteruptCreatingSeedlingCard(boolean supportInteruptCreatingSeedlingCard) {
            this.supportInteruptCreatingSeedlingCard = supportInteruptCreatingSeedlingCard;
            return this;
        }
    }

    public SeedlingInitConfig(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.builder = builder;
        this.engineType = builder.getEngineType();
        this.shouldNotifyCardServiceToInit = this.builder.getShouldNotifyCardServiceToInit();
        this.entranceAuthorityName = this.builder.getEntranceAuthorityName();
        this.supportInteruptCreatingSeedlingCard = this.builder.getSupportInteruptCreatingSeedlingCard();
        this.isContextLoadedByAppDefaultClassLoader = this.builder.getIsContextLoadedByAppDefaultClassLoader();
        this.initViaPantacardSdk = this.builder.getInitViaPantacardSdk();
        this.hostClassLoader = this.builder.getHostClassLoader();
        this.deltaOfLCAParentClassLoader = this.builder.getDeltaOfLCAParentClassLoader();
        this.needHostHandleCardBg = this.builder.getNeedHostHandleCardBg();
        this.isHostLightColor = this.builder.getIsHostLightColor();
        this.extrasDataToEngine = this.builder.getExtrasDataToEngine$pantanal_client_release();
        this.checkForceCopySwitch = this.builder.getCheckForceCopySwitch();
        this.entranceType = this.builder.getEntranceType();
        this.isSupportAddParamsToIntent = this.builder.getIsSupportAddParamsToIntent();
        this.extrasDataToPlugin = this.builder.getExtrasDataToPlugin$pantanal_client_release();
    }

    public static /* synthetic */ SeedlingInitConfig copy$default(SeedlingInitConfig seedlingInitConfig, Builder builder, int i, Object obj) {
        if ((i & 1) != 0) {
            builder = seedlingInitConfig.builder;
        }
        return seedlingInitConfig.copy(builder);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Builder getBuilder() {
        return this.builder;
    }

    @NotNull
    public final SeedlingInitConfig copy(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return new SeedlingInitConfig(builder);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SeedlingInitConfig) && Intrinsics.areEqual(this.builder, ((SeedlingInitConfig) other).builder);
    }

    @NotNull
    public final Builder getBuilder() {
        return this.builder;
    }

    public final boolean getCheckForceCopySwitch() {
        return this.checkForceCopySwitch;
    }

    public final int getDeltaOfLCAParentClassLoader() {
        return this.deltaOfLCAParentClassLoader;
    }

    @NotNull
    public final EngineType getEngineType() {
        return this.engineType;
    }

    @NotNull
    public final String getEntranceAuthorityName() {
        return this.entranceAuthorityName;
    }

    public final int getEntranceType() {
        return this.entranceType;
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

    public final boolean getInitViaPantacardSdk() {
        return this.initViaPantacardSdk;
    }

    public final boolean getNeedHostHandleCardBg() {
        return this.needHostHandleCardBg;
    }

    public final boolean getShouldNotifyCardServiceToInit() {
        return this.shouldNotifyCardServiceToInit;
    }

    public final boolean getSupportInteruptCreatingSeedlingCard() {
        return this.supportInteruptCreatingSeedlingCard;
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

    public final void setEntranceType(int i) {
        this.entranceType = i;
    }

    public final void setExtrasDataToEngine(@NotNull Map<String, Object> map) {
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

    public final void setInitViaPantacardSdk(boolean z) {
        this.initViaPantacardSdk = z;
    }

    public final void setNeedHostHandleCardBg(boolean z) {
        this.needHostHandleCardBg = z;
    }

    public final void setSupportAddParamsToIntent(boolean z) {
        this.isSupportAddParamsToIntent = z;
    }

    public final void setSupportInteruptCreatingSeedlingCard(boolean z) {
        this.supportInteruptCreatingSeedlingCard = z;
    }

    @NotNull
    public String toString() {
        return "SeedlingInitConfig(engineType=" + this.engineType + ", shouldNotifyCardServiceToInit=" + this.shouldNotifyCardServiceToInit + ", entranceAuthorityName='" + this.entranceAuthorityName + "', isContextLoadedByAppDefaultClassLoader='" + this.isContextLoadedByAppDefaultClassLoader + "', initViaPantacardSdk='" + this.initViaPantacardSdk + "', supportInteruptCreatingSeedlingCard=" + this.supportInteruptCreatingSeedlingCard + ",deltaOfLCAParentClassLoader='" + this.deltaOfLCAParentClassLoader + "', needHostHandleCardBg='" + this.needHostHandleCardBg + "', isHostLightColor='" + this.isHostLightColor + "', entranceType='" + this.entranceType + ",checkForceCopySwitch='" + this.checkForceCopySwitch + ",extrasDataToEngine='" + this.extrasDataToEngine + "', isSupportAddParamsToIntent='" + this.isSupportAddParamsToIntent + "', extrasDataToPlugin='" + this.extrasDataToPlugin + "', hostClassLoader='" + this.hostClassLoader + "') ";
    }
}
