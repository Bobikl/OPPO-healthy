package pantanal.app.bean;

import android.os.Bundle;
import android.util.ArrayMap;
import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.aiunit.vision.bs9;
import com.oplus.aiunit.vision.lma;
import com.oplus.aiunit.vision.t6e;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.seedling.sdk.CardBlurHandler;
import com.oplus.seedling.sdk.statistics.StatisticsTrackUtil;
import com.oplus.utrace.sdk.UTraceContext;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.app.CardLaunchInterceptor;
import pantanal.decision.ServiceInfo;
import pantanal.foundation.utils.RequiresVersionSdk;
import pantanal.foundation.utils.VersionSdk;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bR\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 ¸\u00012\u00020\u0001:\u0002¸\u0001Bý\u0001\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0014\u0012\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d¢\u0006\u0002\u0010!B§\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0014\u0012\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d\u0012\u001c\b\u0002\u0010\"\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u001d\u0018\u00010\f\u0012\b\b\u0002\u0010#\u001a\u00020\u0014\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d\u0012\b\b\u0002\u0010&\u001a\u00020\u0005\u0012\b\b\u0002\u0010'\u001a\u00020\u0005\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u0010.\u001a\u00020\u0014\u0012\b\b\u0002\u0010/\u001a\u00020\u0014\u0012\b\b\u0002\u00100\u001a\u00020\u0014\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u00102\u001a\u00020\u0014¢\u0006\u0002\u00103J\n\u0010\u0085\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0005HÆ\u0003J\u0018\u0010\u0091\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001dHÆ\u0003J\u001e\u0010\u0092\u0001\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u001d\u0018\u00010\fHÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0014HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u0018\u0010\u0097\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001dHÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010+HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0014HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\tHÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0005HÆ\u0003J\u0010\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\fHÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u000fHÆ\u0003J¶\u0003\u0010©\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u00142\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d2\u001c\b\u0002\u0010\"\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u001d\u0018\u00010\f2\b\b\u0002\u0010#\u001a\u00020\u00142\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d2\b\b\u0002\u0010&\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\b\b\u0002\u0010.\u001a\u00020\u00142\b\b\u0002\u0010/\u001a\u00020\u00142\b\b\u0002\u00100\u001a\u00020\u00142\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u00102\u001a\u00020\u0014HÆ\u0001J\u0015\u0010ª\u0001\u001a\u00020\u00142\t\u0010«\u0001\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0007\u0010¬\u0001\u001a\u00020\u000fJ\u0013\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u0080\u00012\u0007\u0010®\u0001\u001a\u00020\u000fJ\n\u0010¯\u0001\u001a\u0005\u0018\u00010\u0080\u0001J\t\u0010°\u0001\u001a\u00020\u0005H\u0016J\u0007\u0010±\u0001\u001a\u00020\u0014J\u001d\u0010²\u0001\u001a\u00030³\u00012\u0007\u0010®\u0001\u001a\u00020\u000f2\n\u0010´\u0001\u001a\u0005\u0018\u00010\u0080\u0001J\u0014\u0010µ\u0001\u001a\u00030³\u00012\n\u0010¶\u0001\u001a\u0005\u0018\u00010\u0080\u0001J\t\u0010·\u0001\u001a\u00020\u000fH\u0016R\u001e\u0010/\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u0010\u0017\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00105\"\u0004\b9\u00107R \u0010,\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR \u0010*\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001c\u00101\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u00100\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u00105\"\u0004\bK\u00107R \u0010$\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010G\"\u0004\bM\u0010IR\u001a\u00102\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u00105\"\u0004\bO\u00107R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0018\u0010(\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR,\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR,\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010U\"\u0004\bY\u0010WR.\u0010\"\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u001d\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010A\"\u0004\b_\u0010`R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\ba\u0010AR\u001a\u0010\u0016\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010G\"\u0004\bc\u0010IR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010G\"\u0004\be\u0010IR\u0016\u0010\u001a\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u00105R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u00105R\u001e\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u00105\"\u0004\bf\u00107R\u001e\u0010.\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u00105\"\u0004\bg\u00107R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u00105R\u001e\u0010&\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010A\"\u0004\bi\u0010`R \u0010%\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010G\"\u0004\bk\u0010IR\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bl\u0010GR \u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bq\u0010r\u001a\u0004\bs\u0010AR\u001e\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010A\"\u0004\bu\u0010`R$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010[\"\u0004\bw\u0010]R\u001e\u0010#\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u00105\"\u0004\by\u00107R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b~\u0010AR\u0011\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010'\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010A\"\u0005\b\u0082\u0001\u0010`R\u001c\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010A\"\u0005\b\u0084\u0001\u0010`¨\u0006¹\u0001"}, d2 = {"Lpantanal/app/bean/CardViewInfo;", "", StatisticsTrackUtil.KEY_ENTRANCE, "Lpantanal/app/bean/Entrance;", "type", "", "cardId", "hostId", "cardCategory", "Lpantanal/app/bean/CardCategory;", "size", "sizeList", "", "sizeCode", "instantUri", "", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "serviceId", "isRecommend", "", "isDragging", "initData", "allowUIBackground", "timestamp", "", "isAbnormal", "isEntranceTriggerCardClick", "extraDataToEngine", "Landroid/util/ArrayMap;", "serviceInfo", "Lpantanal/decision/ServiceInfo;", "extraData", "(Lpantanal/app/bean/Entrance;IIILpantanal/app/bean/CardCategory;ILjava/util/List;ILjava/lang/String;IILjava/lang/String;ZZLjava/lang/String;ZJZZLandroid/util/ArrayMap;Lpantanal/decision/ServiceInfo;Landroid/util/ArrayMap;)V", "extraDataToEngineList", Constants.SUPPORT_SUPER_CHANNEL, RnConstant.KEY_COMPONENT_NAME, "packageName", "loadCardTimeOut", "waitCardDataTimeOut", "extraBundle", "Landroid/os/Bundle;", "cardLaunchInterceptor", "Lpantanal/app/CardLaunchInterceptor;", "cardBlurHandler", "Lcom/oplus/seedling/sdk/CardBlurHandler;", "isLocalCard", "allowReceiveUIDataBackground", "changeVisibilityManually", "cardUiData", "enableQueryUpkPathForEngine", "(Lpantanal/app/bean/Entrance;IIILpantanal/app/bean/CardCategory;ILjava/util/List;ILjava/lang/String;IILjava/lang/String;ZZLjava/lang/String;ZJZZLandroid/util/ArrayMap;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Lpantanal/decision/ServiceInfo;Landroid/util/ArrayMap;IILandroid/os/Bundle;Lpantanal/app/CardLaunchInterceptor;Lcom/oplus/seedling/sdk/CardBlurHandler;ZZZLjava/lang/String;Z)V", "getAllowReceiveUIDataBackground", "()Z", "setAllowReceiveUIDataBackground", "(Z)V", "getAllowUIBackground", "setAllowUIBackground", "getCardBlurHandler", "()Lcom/oplus/seedling/sdk/CardBlurHandler;", "setCardBlurHandler", "(Lcom/oplus/seedling/sdk/CardBlurHandler;)V", "getCardCategory", "()Lpantanal/app/bean/CardCategory;", "getCardId", "()I", "getCardLaunchInterceptor", "()Lpantanal/app/CardLaunchInterceptor;", "setCardLaunchInterceptor", "(Lpantanal/app/CardLaunchInterceptor;)V", "getCardUiData", "()Ljava/lang/String;", "setCardUiData", "(Ljava/lang/String;)V", "getChangeVisibilityManually", "setChangeVisibilityManually", "getComponentName", "setComponentName", "getEnableQueryUpkPathForEngine", "setEnableQueryUpkPathForEngine", "getEntrance", "()Lpantanal/app/bean/Entrance;", "getExtraBundle", "()Landroid/os/Bundle;", "getExtraData", "()Landroid/util/ArrayMap;", "setExtraData", "(Landroid/util/ArrayMap;)V", "getExtraDataToEngine", "setExtraDataToEngine", "getExtraDataToEngineList", "()Ljava/util/List;", "setExtraDataToEngineList", "(Ljava/util/List;)V", "getHeight", "setHeight", "(I)V", "getHostId", "getInitData", "setInitData", "getInstantUri", "setInstantUri", "setEntranceTriggerCardClick", "setLocalCard", "getLoadCardTimeOut", "setLoadCardTimeOut", "getPackageName", "setPackageName", "getServiceId", "getServiceInfo", "()Lpantanal/decision/ServiceInfo;", "setServiceInfo", "(Lpantanal/decision/ServiceInfo;)V", "getSize$annotations", "()V", "getSize", "getSizeCode", "setSizeCode", "getSizeList", "setSizeList", "getSupportSuperChannel", "setSupportSuperChannel", "getTimestamp", "()J", "setTimestamp", "(J)V", "getType", "utraceContext", "Lcom/oplus/utrace/sdk/UTraceContext;", "getWaitCardDataTimeOut", "setWaitCardDataTimeOut", "getWidth", "setWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "getServiceInstanceId", "getUTraceCodeContext", "key", "getUTraceIntentContext", "hashCode", Constants.IS_SUPPORT_MULTI_INSTANCE, "setUTraceCodeContext", "", "codeCtx", "setUTraceIntentContext", "uTraceIntentContext", "toString", "Companion", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CardViewInfo {

    @NotNull
    private static final String TAG = "CardViewInfo";

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_60)
    private boolean allowReceiveUIDataBackground;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_0_30)
    private boolean allowUIBackground;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_24)
    @Nullable
    private CardBlurHandler cardBlurHandler;

    @NotNull
    private final CardCategory cardCategory;
    private final int cardId;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_24)
    @Nullable
    private CardLaunchInterceptor cardLaunchInterceptor;

    @Nullable
    private String cardUiData;
    private boolean changeVisibilityManually;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_0)
    @Nullable
    private String componentName;
    private boolean enableQueryUpkPathForEngine;

    @NotNull
    private final Entrance entrance;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_10)
    @Nullable
    private final Bundle extraBundle;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_0_26)
    @Nullable
    private ArrayMap<String, Object> extraData;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_0_30)
    @Nullable
    private ArrayMap<String, Object> extraDataToEngine;

    @Nullable
    private List<ArrayMap<String, Object>> extraDataToEngineList;
    private int height;
    private final int hostId;

    @NotNull
    private String initData;

    @NotNull
    private String instantUri;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_0_30)
    private final boolean isAbnormal;
    private final boolean isDragging;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_0_30)
    private boolean isEntranceTriggerCardClick;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_34)
    private boolean isLocalCard;
    private final boolean isRecommend;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_1)
    private int loadCardTimeOut;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_0)
    @Nullable
    private String packageName;

    @NotNull
    private final String serviceId;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_0)
    @Nullable
    private ServiceInfo serviceInfo;
    private final int size;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_0_30)
    private int sizeCode;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_0_30)
    @NotNull
    private List<Integer> sizeList;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_0)
    private boolean supportSuperChannel;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_0_30)
    private long timestamp;
    private final int type;

    @Nullable
    private final UTraceContext utraceContext;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_1)
    private int waitCardDataTimeOut;
    private int width;

    public CardViewInfo(@NotNull Entrance entrance, int i, int i2, int i3, @NotNull CardCategory cardCategory, int i4, @NotNull List<Integer> sizeList, int i5, @NotNull String instantUri, int i6, int i7, @NotNull String serviceId, boolean z, boolean z2, @NotNull String initData, boolean z3, long j2, boolean z4, boolean z5, @Nullable ArrayMap<String, Object> arrayMap, @Nullable List<ArrayMap<String, Object>> list, boolean z6, @Nullable String str, @Nullable String str2, @Nullable ServiceInfo serviceInfo, @Nullable ArrayMap<String, Object> arrayMap2, int i8, int i9, @Nullable Bundle bundle, @Nullable CardLaunchInterceptor cardLaunchInterceptor, @Nullable CardBlurHandler cardBlurHandler, boolean z7, boolean z8, boolean z9, @Nullable String str3, boolean z10) {
        Intrinsics.checkNotNullParameter(entrance, "entrance");
        Intrinsics.checkNotNullParameter(cardCategory, "cardCategory");
        Intrinsics.checkNotNullParameter(sizeList, "sizeList");
        Intrinsics.checkNotNullParameter(instantUri, "instantUri");
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(initData, "initData");
        this.entrance = entrance;
        this.type = i;
        this.cardId = i2;
        this.hostId = i3;
        this.cardCategory = cardCategory;
        this.size = i4;
        this.sizeList = sizeList;
        this.sizeCode = i5;
        this.instantUri = instantUri;
        this.width = i6;
        this.height = i7;
        this.serviceId = serviceId;
        this.isRecommend = z;
        this.isDragging = z2;
        this.initData = initData;
        this.allowUIBackground = z3;
        this.timestamp = j2;
        this.isAbnormal = z4;
        this.isEntranceTriggerCardClick = z5;
        this.extraDataToEngine = arrayMap;
        this.extraDataToEngineList = list;
        this.supportSuperChannel = z6;
        this.componentName = str;
        this.packageName = str2;
        this.serviceInfo = serviceInfo;
        this.extraData = arrayMap2;
        this.loadCardTimeOut = i8;
        this.waitCardDataTimeOut = i9;
        this.extraBundle = bundle;
        this.cardLaunchInterceptor = cardLaunchInterceptor;
        this.cardBlurHandler = cardBlurHandler;
        this.isLocalCard = z7;
        this.allowReceiveUIDataBackground = z8;
        this.changeVisibilityManually = z9;
        this.cardUiData = str3;
        this.enableQueryUpkPathForEngine = z10;
    }

    @Deprecated(message = "do not use it, please use sizeList")
    public static /* synthetic */ void getSize$annotations() {
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Entrance getEntrance() {
        return this.entrance;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsRecommend() {
        return this.isRecommend;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsDragging() {
        return this.isDragging;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getInitData() {
        return this.initData;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getAllowUIBackground() {
        return this.allowUIBackground;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getIsAbnormal() {
        return this.isAbnormal;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getIsEntranceTriggerCardClick() {
        return this.isEntranceTriggerCardClick;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    public final ArrayMap<String, Object> component20() {
        return this.extraDataToEngine;
    }

    @Nullable
    public final List<ArrayMap<String, Object>> component21() {
        return this.extraDataToEngineList;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getSupportSuperChannel() {
        return this.supportSuperChannel;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getComponentName() {
        return this.componentName;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final ServiceInfo getServiceInfo() {
        return this.serviceInfo;
    }

    @Nullable
    public final ArrayMap<String, Object> component26() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final int getLoadCardTimeOut() {
        return this.loadCardTimeOut;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final int getWaitCardDataTimeOut() {
        return this.waitCardDataTimeOut;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Bundle getExtraBundle() {
        return this.extraBundle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCardId() {
        return this.cardId;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final CardLaunchInterceptor getCardLaunchInterceptor() {
        return this.cardLaunchInterceptor;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final CardBlurHandler getCardBlurHandler() {
        return this.cardBlurHandler;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final boolean getIsLocalCard() {
        return this.isLocalCard;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final boolean getAllowReceiveUIDataBackground() {
        return this.allowReceiveUIDataBackground;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final boolean getChangeVisibilityManually() {
        return this.changeVisibilityManually;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getCardUiData() {
        return this.cardUiData;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final boolean getEnableQueryUpkPathForEngine() {
        return this.enableQueryUpkPathForEngine;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHostId() {
        return this.hostId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CardCategory getCardCategory() {
        return this.cardCategory;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final List<Integer> component7() {
        return this.sizeList;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getSizeCode() {
        return this.sizeCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getInstantUri() {
        return this.instantUri;
    }

    @NotNull
    public final CardViewInfo copy(@NotNull Entrance entrance, int type, int cardId, int hostId, @NotNull CardCategory cardCategory, int size, @NotNull List<Integer> sizeList, int sizeCode, @NotNull String instantUri, int width, int height, @NotNull String serviceId, boolean isRecommend, boolean isDragging, @NotNull String initData, boolean allowUIBackground, long timestamp, boolean isAbnormal, boolean isEntranceTriggerCardClick, @Nullable ArrayMap<String, Object> extraDataToEngine, @Nullable List<ArrayMap<String, Object>> extraDataToEngineList, boolean supportSuperChannel, @Nullable String componentName, @Nullable String packageName, @Nullable ServiceInfo serviceInfo, @Nullable ArrayMap<String, Object> extraData, int loadCardTimeOut, int waitCardDataTimeOut, @Nullable Bundle extraBundle, @Nullable CardLaunchInterceptor cardLaunchInterceptor, @Nullable CardBlurHandler cardBlurHandler, boolean isLocalCard, boolean allowReceiveUIDataBackground, boolean changeVisibilityManually, @Nullable String cardUiData, boolean enableQueryUpkPathForEngine) {
        Intrinsics.checkNotNullParameter(entrance, "entrance");
        Intrinsics.checkNotNullParameter(cardCategory, "cardCategory");
        Intrinsics.checkNotNullParameter(sizeList, "sizeList");
        Intrinsics.checkNotNullParameter(instantUri, "instantUri");
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(initData, "initData");
        return new CardViewInfo(entrance, type, cardId, hostId, cardCategory, size, sizeList, sizeCode, instantUri, width, height, serviceId, isRecommend, isDragging, initData, allowUIBackground, timestamp, isAbnormal, isEntranceTriggerCardClick, extraDataToEngine, extraDataToEngineList, supportSuperChannel, componentName, packageName, serviceInfo, extraData, loadCardTimeOut, waitCardDataTimeOut, extraBundle, cardLaunchInterceptor, cardBlurHandler, isLocalCard, allowReceiveUIDataBackground, changeVisibilityManually, cardUiData, enableQueryUpkPathForEngine);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(CardViewInfo.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type pantanal.app.bean.CardViewInfo");
        CardViewInfo cardViewInfo = (CardViewInfo) other;
        return this.entrance == cardViewInfo.entrance && this.type == cardViewInfo.type && this.cardId == cardViewInfo.cardId && this.hostId == cardViewInfo.hostId && this.cardCategory == cardViewInfo.cardCategory && this.size == cardViewInfo.size && Intrinsics.areEqual(this.sizeList, cardViewInfo.sizeList) && this.sizeCode == cardViewInfo.sizeCode && Intrinsics.areEqual(this.instantUri, cardViewInfo.instantUri) && this.width == cardViewInfo.width && this.height == cardViewInfo.height && Intrinsics.areEqual(this.serviceId, cardViewInfo.serviceId) && this.isRecommend == cardViewInfo.isRecommend && this.isDragging == cardViewInfo.isDragging && Intrinsics.areEqual(this.initData, cardViewInfo.initData) && this.allowUIBackground == cardViewInfo.allowUIBackground && this.timestamp == cardViewInfo.timestamp && this.isAbnormal == cardViewInfo.isAbnormal && this.isEntranceTriggerCardClick == cardViewInfo.isEntranceTriggerCardClick && this.supportSuperChannel == cardViewInfo.supportSuperChannel && Intrinsics.areEqual(this.componentName, cardViewInfo.componentName) && Intrinsics.areEqual(this.packageName, cardViewInfo.packageName) && Intrinsics.areEqual(this.serviceInfo, cardViewInfo.serviceInfo) && this.loadCardTimeOut == cardViewInfo.loadCardTimeOut && this.waitCardDataTimeOut == cardViewInfo.waitCardDataTimeOut && Intrinsics.areEqual(this.extraBundle, cardViewInfo.extraBundle) && Intrinsics.areEqual(this.cardLaunchInterceptor, cardViewInfo.cardLaunchInterceptor) && Intrinsics.areEqual(this.cardBlurHandler, cardViewInfo.cardBlurHandler) && this.allowReceiveUIDataBackground == cardViewInfo.allowReceiveUIDataBackground;
    }

    public final boolean getAllowReceiveUIDataBackground() {
        return this.allowReceiveUIDataBackground;
    }

    public final boolean getAllowUIBackground() {
        return this.allowUIBackground;
    }

    @Nullable
    public final CardBlurHandler getCardBlurHandler() {
        return this.cardBlurHandler;
    }

    @NotNull
    public final CardCategory getCardCategory() {
        return this.cardCategory;
    }

    public final int getCardId() {
        return this.cardId;
    }

    @Nullable
    public final CardLaunchInterceptor getCardLaunchInterceptor() {
        return this.cardLaunchInterceptor;
    }

    @Nullable
    public final String getCardUiData() {
        return this.cardUiData;
    }

    public final boolean getChangeVisibilityManually() {
        return this.changeVisibilityManually;
    }

    @Nullable
    public final String getComponentName() {
        return this.componentName;
    }

    public final boolean getEnableQueryUpkPathForEngine() {
        return this.enableQueryUpkPathForEngine;
    }

    @NotNull
    public final Entrance getEntrance() {
        return this.entrance;
    }

    @Nullable
    public final Bundle getExtraBundle() {
        return this.extraBundle;
    }

    @Nullable
    public final ArrayMap<String, Object> getExtraData() {
        return this.extraData;
    }

    @Nullable
    public final ArrayMap<String, Object> getExtraDataToEngine() {
        return this.extraDataToEngine;
    }

    @Nullable
    public final List<ArrayMap<String, Object>> getExtraDataToEngineList() {
        return this.extraDataToEngineList;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getHostId() {
        return this.hostId;
    }

    @NotNull
    public final String getInitData() {
        return this.initData;
    }

    @NotNull
    public final String getInstantUri() {
        return this.instantUri;
    }

    public final int getLoadCardTimeOut() {
        return this.loadCardTimeOut;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getServiceId() {
        return this.serviceId;
    }

    @Nullable
    public final ServiceInfo getServiceInfo() {
        return this.serviceInfo;
    }

    @NotNull
    public final String getServiceInstanceId() {
        String serviceInstanceId;
        ServiceInfo serviceInfo = this.serviceInfo;
        return (serviceInfo == null || (serviceInstanceId = serviceInfo.getServiceInstanceId()) == null) ? "" : serviceInstanceId;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getSizeCode() {
        return this.sizeCode;
    }

    @NotNull
    public final List<Integer> getSizeList() {
        return this.sizeList;
    }

    public final boolean getSupportSuperChannel() {
        return this.supportSuperChannel;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final UTraceContext getUTraceCodeContext(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.utraceContext;
    }

    @Nullable
    public final UTraceContext getUTraceIntentContext() {
        String str = "getUTraceIntentContext,serviceId:" + this.serviceId + ",cardViewInfo:" + hashCode();
        if (this.extraData == null) {
            bs9.a.a(t6e.INSTANCE, "CardViewInfo", str + ",extraData == null", false, null, false, 0, false, null, 252, null);
        }
        return null;
    }

    public final int getWaitCardDataTimeOut() {
        return this.waitCardDataTimeOut;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((this.entrance.hashCode() * 31) + this.type) * 31) + this.cardId) * 31) + this.hostId) * 31) + this.cardCategory.hashCode()) * 31) + this.size) * 31) + this.sizeList.hashCode()) * 31) + this.sizeCode) * 31) + this.instantUri.hashCode()) * 31) + this.width) * 31) + this.height) * 31) + this.serviceId.hashCode()) * 31) + Boolean.hashCode(this.isRecommend)) * 31) + Boolean.hashCode(this.isDragging)) * 31) + this.initData.hashCode()) * 31) + Boolean.hashCode(this.allowUIBackground)) * 31) + Long.hashCode(this.timestamp)) * 31) + Boolean.hashCode(this.isAbnormal)) * 31) + Boolean.hashCode(this.isEntranceTriggerCardClick)) * 31) + Boolean.hashCode(this.supportSuperChannel)) * 31;
        String str = this.componentName;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.packageName;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ServiceInfo serviceInfo = this.serviceInfo;
        int iHashCode4 = (((((iHashCode3 + (serviceInfo != null ? serviceInfo.hashCode() : 0)) * 31) + this.loadCardTimeOut) * 31) + this.waitCardDataTimeOut) * 31;
        Bundle bundle = this.extraBundle;
        int iHashCode5 = (iHashCode4 + (bundle != null ? bundle.hashCode() : 0)) * 31;
        CardLaunchInterceptor cardLaunchInterceptor = this.cardLaunchInterceptor;
        int iHashCode6 = (iHashCode5 + (cardLaunchInterceptor != null ? cardLaunchInterceptor.hashCode() : 0)) * 31;
        CardBlurHandler cardBlurHandler = this.cardBlurHandler;
        return ((iHashCode6 + (cardBlurHandler != null ? cardBlurHandler.hashCode() : 0)) * 31) + Boolean.hashCode(this.allowReceiveUIDataBackground);
    }

    public final boolean isAbnormal() {
        return this.isAbnormal;
    }

    public final boolean isDragging() {
        return this.isDragging;
    }

    public final boolean isEntranceTriggerCardClick() {
        return this.isEntranceTriggerCardClick;
    }

    public final boolean isLocalCard() {
        return this.isLocalCard;
    }

    public final boolean isRecommend() {
        return this.isRecommend;
    }

    public final boolean isSupportMultiInstance() {
        ServiceInfo serviceInfo = this.serviceInfo;
        if (serviceInfo != null) {
            return serviceInfo.isSupportMultiInstance();
        }
        return false;
    }

    public final void setAllowReceiveUIDataBackground(boolean z) {
        this.allowReceiveUIDataBackground = z;
    }

    public final void setAllowUIBackground(boolean z) {
        this.allowUIBackground = z;
    }

    public final void setCardBlurHandler(@Nullable CardBlurHandler cardBlurHandler) {
        this.cardBlurHandler = cardBlurHandler;
    }

    public final void setCardLaunchInterceptor(@Nullable CardLaunchInterceptor cardLaunchInterceptor) {
        this.cardLaunchInterceptor = cardLaunchInterceptor;
    }

    public final void setCardUiData(@Nullable String str) {
        this.cardUiData = str;
    }

    public final void setChangeVisibilityManually(boolean z) {
        this.changeVisibilityManually = z;
    }

    public final void setComponentName(@Nullable String str) {
        this.componentName = str;
    }

    public final void setEnableQueryUpkPathForEngine(boolean z) {
        this.enableQueryUpkPathForEngine = z;
    }

    public final void setEntranceTriggerCardClick(boolean z) {
        this.isEntranceTriggerCardClick = z;
    }

    public final void setExtraData(@Nullable ArrayMap<String, Object> arrayMap) {
        this.extraData = arrayMap;
    }

    public final void setExtraDataToEngine(@Nullable ArrayMap<String, Object> arrayMap) {
        this.extraDataToEngine = arrayMap;
    }

    public final void setExtraDataToEngineList(@Nullable List<ArrayMap<String, Object>> list) {
        this.extraDataToEngineList = list;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setInitData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.initData = str;
    }

    public final void setInstantUri(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.instantUri = str;
    }

    public final void setLoadCardTimeOut(int i) {
        this.loadCardTimeOut = i;
    }

    public final void setLocalCard(boolean z) {
        this.isLocalCard = z;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    public final void setServiceInfo(@Nullable ServiceInfo serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    public final void setSizeCode(int i) {
        this.sizeCode = i;
    }

    public final void setSizeList(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sizeList = list;
    }

    public final void setSupportSuperChannel(boolean z) {
        this.supportSuperChannel = z;
    }

    public final void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    public final void setUTraceCodeContext(@NotNull String key, @Nullable UTraceContext codeCtx) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            bs9.a.c(t6e.INSTANCE, "CardViewInfo", "setUTraceIntentContext nothing", false, null, false, 0, false, null, 252, null);
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            bs9.a.b(t6e.INSTANCE, "CardViewInfo", "setUTraceIntentContext error:" + thM5290exceptionOrNullimpl, false, null, false, 0, false, null, 252, null);
        }
    }

    public final void setUTraceIntentContext(@Nullable UTraceContext uTraceIntentContext) {
        Object objM5287constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (uTraceIntentContext == null) {
                return;
            }
            if (this.extraData == null) {
                this.extraData = new ArrayMap<>();
            }
            ArrayMap<String, Object> arrayMap = this.extraData;
            objM5287constructorimpl = Result.m5287constructorimpl(arrayMap != null ? arrayMap.put("uTraceIntentContext", uTraceIntentContext) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            bs9.a.b(t6e.INSTANCE, "CardViewInfo", "setUTraceIntentContext error:" + thM5290exceptionOrNullimpl, false, null, false, 0, false, null, 252, null);
        }
    }

    public final void setWaitCardDataTimeOut(int i) {
        this.waitCardDataTimeOut = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    @NotNull
    public String toString() {
        UTraceContext uTraceIntentContext = getUTraceIntentContext();
        Entrance entrance = this.entrance;
        String str = this.serviceId;
        int i = this.type;
        int i2 = this.hostId;
        int i3 = this.cardId;
        CardCategory cardCategory = this.cardCategory;
        int i4 = this.size;
        List<Integer> list = this.sizeList;
        String str2 = this.instantUri;
        int i5 = this.width;
        int i6 = this.height;
        boolean z = this.isRecommend;
        boolean z2 = this.isDragging;
        int length = this.initData.length();
        String strB = lma.b(this.initData, null, 2, null);
        List<ArrayMap<String, Object>> list2 = this.extraDataToEngineList;
        Integer numValueOf = list2 != null ? Integer.valueOf(list2.size()) : null;
        ServiceInfo serviceInfo = this.serviceInfo;
        Bundle bundle = this.extraBundle;
        CardLaunchInterceptor cardLaunchInterceptor = this.cardLaunchInterceptor;
        CardBlurHandler cardBlurHandler = this.cardBlurHandler;
        boolean z3 = this.allowReceiveUIDataBackground;
        boolean z4 = this.isLocalCard;
        String str3 = this.cardUiData;
        return "CardViewInfo[entrance:" + entrance + ", serviceId:" + str + ", cardType:" + i + ", hostId:" + i2 + ", cardId:" + i3 + ", cardCategory:" + cardCategory + ", cardSize:" + i4 + ", sizeList:" + list + ", instantUri:" + str2 + ", width:" + i5 + ", height:" + i6 + ", isRecommend:" + z + ", isDragging:" + z2 + ", initDataSize:" + length + ", policyName:" + strB + ", uTraceIntentContext:" + uTraceIntentContext + ", extraDataToEngineList.size:" + numValueOf + ", serviceInfo:" + serviceInfo + ", extraBundle:" + bundle + ", cardLaunchInterceptor:" + cardLaunchInterceptor + ", cardBlurHandler:" + cardBlurHandler + ", allowReceiveUIDataBackground:" + z3 + ", isLocalCard:" + z4 + "cardUiDataLen:" + (str3 != null ? Integer.valueOf(str3.length()) : null) + "]";
    }

    public /* synthetic */ CardViewInfo(Entrance entrance, int i, int i2, int i3, CardCategory cardCategory, int i4, List list, int i5, String str, int i6, int i7, String str2, boolean z, boolean z2, String str3, boolean z3, long j2, boolean z4, boolean z5, ArrayMap arrayMap, List list2, boolean z6, String str4, String str5, ServiceInfo serviceInfo, ArrayMap arrayMap2, int i8, int i9, Bundle bundle, CardLaunchInterceptor cardLaunchInterceptor, CardBlurHandler cardBlurHandler, boolean z7, boolean z8, boolean z9, String str6, boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(entrance, i, i2, i3, cardCategory, (i10 & 32) != 0 ? 0 : i4, (i10 & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 128) != 0 ? 0 : i5, (i10 & 256) != 0 ? "" : str, (i10 & 512) != 0 ? -1 : i6, (i10 & 1024) != 0 ? -1 : i7, (i10 & 2048) != 0 ? "" : str2, (i10 & 4096) != 0 ? false : z, (i10 & 8192) != 0 ? false : z2, (i10 & 16384) != 0 ? "" : str3, (32768 & i10) != 0 ? true : z3, (65536 & i10) != 0 ? 0L : j2, (131072 & i10) != 0 ? false : z4, (262144 & i10) != 0 ? false : z5, (524288 & i10) != 0 ? null : arrayMap, (1048576 & i10) != 0 ? null : list2, (2097152 & i10) != 0 ? false : z6, (4194304 & i10) != 0 ? "" : str4, (8388608 & i10) != 0 ? "" : str5, (16777216 & i10) != 0 ? null : serviceInfo, (33554432 & i10) != 0 ? null : arrayMap2, (67108864 & i10) != 0 ? -1 : i8, (134217728 & i10) != 0 ? -1 : i9, (268435456 & i10) != 0 ? null : bundle, (536870912 & i10) != 0 ? null : cardLaunchInterceptor, (1073741824 & i10) != 0 ? null : cardBlurHandler, (i10 & Integer.MIN_VALUE) != 0 ? false : z7, (i11 & 1) != 0 ? false : z8, (i11 & 2) != 0 ? true : z9, (i11 & 4) != 0 ? null : str6, (i11 & 8) != 0 ? false : z10);
    }

    public /* synthetic */ CardViewInfo(Entrance entrance, int i, int i2, int i3, CardCategory cardCategory, int i4, List list, int i5, String str, int i6, int i7, String str2, boolean z, boolean z2, String str3, boolean z3, long j2, boolean z4, boolean z5, ArrayMap arrayMap, ServiceInfo serviceInfo, ArrayMap arrayMap2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(entrance, i, i2, i3, cardCategory, (i8 & 32) != 0 ? 0 : i4, (i8 & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i8 & 128) != 0 ? 0 : i5, (i8 & 256) != 0 ? "" : str, (i8 & 512) != 0 ? -1 : i6, (i8 & 1024) != 0 ? -1 : i7, (i8 & 2048) != 0 ? "" : str2, (i8 & 4096) != 0 ? false : z, (i8 & 8192) != 0 ? false : z2, (i8 & 16384) != 0 ? "" : str3, (32768 & i8) != 0 ? true : z3, (65536 & i8) != 0 ? 0L : j2, (131072 & i8) != 0 ? false : z4, (262144 & i8) != 0 ? false : z5, (524288 & i8) != 0 ? null : arrayMap, (1048576 & i8) != 0 ? null : serviceInfo, (i8 & 2097152) != 0 ? null : arrayMap2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardViewInfo(@NotNull Entrance entrance, int i, int i2, int i3, @NotNull CardCategory cardCategory, int i4, @NotNull List<Integer> sizeList, int i5, @NotNull String instantUri, int i6, int i7, @NotNull String serviceId, boolean z, boolean z2, @NotNull String initData, boolean z3, long j2, boolean z4, boolean z5, @Nullable ArrayMap<String, Object> arrayMap, @Nullable ServiceInfo serviceInfo, @Nullable ArrayMap<String, Object> arrayMap2) {
        this(entrance, i, i2, i3, cardCategory, i4, sizeList, i5, instantUri, i6, i7, serviceId, z, z2, initData, z3, j2, z4, z5, arrayMap, null, false, "", "", serviceInfo, arrayMap2, 0, 0, null, null, null, false, false, false, null, false, -67108864, 15, null);
        Intrinsics.checkNotNullParameter(entrance, "entrance");
        Intrinsics.checkNotNullParameter(cardCategory, "cardCategory");
        Intrinsics.checkNotNullParameter(sizeList, "sizeList");
        Intrinsics.checkNotNullParameter(instantUri, "instantUri");
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(initData, "initData");
    }
}
