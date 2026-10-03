package pantanal.app.bean;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.aiunit.vision.k18;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.smartenginehelper.entity.ViewEntity;
import com.opos.process.bridge.base.BridgeConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.content.nano.CardConfigInfoListProto;
import pantanal.decision.DecisionCardConfig;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0003\b£\u0001\b\u0087\b\u0018\u0000 Ø\u00012\u00020\u0001:\u0002Ø\u0001Bµ\u0003\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0011\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010)\u001a\u00020\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010+\u001a\u00020\u0011\u0012\b\b\u0002\u0010,\u001a\u00020\u0011¢\u0006\u0002\u0010-BÇ\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0011\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010+\u001a\u00020\u0011\u0012\u0006\u0010,\u001a\u00020\u0011\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010/\u001a\u00020\u0011\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0006\u0012\b\u00101\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00103\u001a\u00020\u0006\u0012\b\b\u0002\u00104\u001a\u00020\u0006\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u00109J\n\u0010¢\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0011HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010«\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010°\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010±\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010´\u0001\u001a\u00020\u0003HÆ\u0003J\u0011\u0010µ\u0001\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0002\u0010kJ\f\u0010¶\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010·\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010¹\u0001\u001a\u00020\u0011HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010¿\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010À\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010Á\u0001\u001a\u00020\u0011HÆ\u0003J\n\u0010Â\u0001\u001a\u00020\u0011HÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010Å\u0001\u001a\u00020\u0011HÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u000102HÆ\u0003J\n\u0010È\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010É\u0001\u001a\u00020\u0006HÆ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u000106HÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010Ð\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ñ\u0001\u001a\u00020\u0003HÆ\u0003J¤\u0004\u0010Ò\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00112\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010)\u001a\u00020\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010+\u001a\u00020\u00112\b\b\u0002\u0010,\u001a\u00020\u00112\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010/\u001a\u00020\u00112\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\b\b\u0002\u00103\u001a\u00020\u00062\b\b\u0002\u00104\u001a\u00020\u00062\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0003\u0010Ó\u0001J\u0015\u0010Ô\u0001\u001a\u00020\u00112\t\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Ö\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010×\u0001\u001a\u00020\u0006HÖ\u0001R\u001c\u00107\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u00105\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u00101\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010;\"\u0004\bK\u0010=R\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010G\"\u0004\bM\u0010IR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010;\"\u0004\bO\u0010=R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010G\"\u0004\bQ\u0010IR\u001a\u00104\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010;\"\u0004\bS\u0010=R\u001a\u0010#\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001c\u0010$\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010;\"\u0004\bY\u0010=R\u001a\u0010\"\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010G\"\u0004\b[\u0010IR\u001c\u00108\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010;\"\u0004\b]\u0010=R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010;\"\u0004\b_\u0010=R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010G\"\u0004\ba\u0010IR\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010G\"\u0004\bc\u0010IR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010;\"\u0004\be\u0010=R\u001c\u00100\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010;\"\u0004\bg\u0010=R\u001c\u0010.\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010;\"\u0004\bi\u0010=R\u0015\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\n\n\u0002\u0010l\u001a\u0004\bj\u0010kR\u001a\u0010+\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010U\"\u0004\bm\u0010WR\u001c\u0010(\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010;\"\u0004\bo\u0010=R\u001c\u0010'\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010;\"\u0004\bq\u0010=R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010;\"\u0004\bs\u0010=R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010;\"\u0004\bu\u0010=R\u001a\u00103\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010;\"\u0004\bw\u0010=R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010G\"\u0004\by\u0010IR\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010G\"\u0004\b{\u0010IR\u001c\u0010*\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010;\"\u0004\b}\u0010=R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010;\"\u0004\b\u007f\u0010=R\u001c\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010G\"\u0005\b\u0081\u0001\u0010IR\u001c\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010G\"\u0005\b\u0083\u0001\u0010IR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010;\"\u0005\b\u0085\u0001\u0010=R\u0014\u0010!\u001a\u0004\u0018\u00010\u0006¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010;R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010;\"\u0005\b\u0088\u0001\u0010=R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010;\"\u0005\b\u008a\u0001\u0010=R\u001c\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010G\"\u0005\b\u008c\u0001\u0010IR\u001c\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010U\"\u0005\b\u008e\u0001\u0010WR\u0012\u0010\u001e\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010GR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010;\"\u0005\b\u0091\u0001\u0010=R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010;\"\u0005\b\u0093\u0001\u0010=R\u001c\u0010)\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010G\"\u0005\b\u0095\u0001\u0010IR\u001c\u0010,\u001a\u00020\u0011X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0001\u0010U\"\u0005\b\u0097\u0001\u0010WR\u001c\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010G\"\u0005\b\u0099\u0001\u0010IR\u001e\u0010&\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010;\"\u0005\b\u009b\u0001\u0010=R\u001e\u0010%\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0001\u0010;\"\u0005\b\u009d\u0001\u0010=R\u001c\u0010/\u001a\u00020\u0011X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010U\"\u0005\b\u009f\u0001\u0010WR\u001c\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b \u0001\u0010G\"\u0005\b¡\u0001\u0010I¨\u0006Ù\u0001"}, d2 = {"Lpantanal/app/bean/CardConfigInfo;", "", "type", "", "groupId", "groupTitle", "", "groupIcon", "name", DBHealthReviewPlan.DESC, "preview", "size", "orderInGroup", "packageName", RnConstant.KEY_COMPONENT_NAME, "category", "resizable", "", "operatingIcon", "settingUrl", "displayArea", ViewEntity.MIN_WIDTH, ViewEntity.MIN_HEIGHT, "loadingIcon", "loadingBgIcon", "reservedFlag", "defaultSubscribed", "groupOrder", "previewSw480", "serviceId", "serviceCategory", "intentId", "", "policy", "dragonFlyType", "dragonFlySecure", "dragonFlyService", "skeletonPicPath", "skeletonDarkPicPath", "loadFailPicPath", "loadFailDp", "showTitle", "miniAppIcon", "isDarkStyle", "showWhenLocked", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;IZILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/Long;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZ)V", "instantCardUrl", Constants.SUPPORT_SUPER_CHANNEL, "identification", "cardMaintainProto", "Lpantanal/content/nano/CardConfigInfoListProto$CardMaintainProto;", "materialPreview", "distributeType", "cardMaintain", "Lpantanal/app/bean/CardMaintain;", "bizPkgName", BridgeConstant.KEY_EXTRAS, "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;IZILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/Long;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZLjava/lang/String;ZLjava/lang/String;Lpantanal/content/nano/CardConfigInfoListProto$CardMaintainProto;Ljava/lang/String;Ljava/lang/String;Lpantanal/app/bean/CardMaintain;Ljava/lang/String;Ljava/lang/String;)V", "getBizPkgName", "()Ljava/lang/String;", "setBizPkgName", "(Ljava/lang/String;)V", "getCardMaintain", "()Lpantanal/app/bean/CardMaintain;", "setCardMaintain", "(Lpantanal/app/bean/CardMaintain;)V", "getCardMaintainProto", "()Lpantanal/content/nano/CardConfigInfoListProto$CardMaintainProto;", "setCardMaintainProto", "(Lpantanal/content/nano/CardConfigInfoListProto$CardMaintainProto;)V", "getCategory", "()I", "setCategory", "(I)V", "getComponentName", "setComponentName", "getDefaultSubscribed", "setDefaultSubscribed", "getDesc", "setDesc", "getDisplayArea", "setDisplayArea", "getDistributeType", "setDistributeType", "getDragonFlySecure", "()Z", "setDragonFlySecure", "(Z)V", "getDragonFlyService", "setDragonFlyService", "getDragonFlyType", "setDragonFlyType", "getExtras", "setExtras", "getGroupIcon", "setGroupIcon", "getGroupId", "setGroupId", "getGroupOrder", "setGroupOrder", "getGroupTitle", "setGroupTitle", "getIdentification", "setIdentification", "getInstantCardUrl", "setInstantCardUrl", "getIntentId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "setDarkStyle", "getLoadFailDp", "setLoadFailDp", "getLoadFailPicPath", "setLoadFailPicPath", "getLoadingBgIcon", "setLoadingBgIcon", "getLoadingIcon", "setLoadingIcon", "getMaterialPreview", "setMaterialPreview", "getMinHeight", "setMinHeight", "getMinWidth", "setMinWidth", "getMiniAppIcon", "setMiniAppIcon", "getName", "setName", "getOperatingIcon", "setOperatingIcon", "getOrderInGroup", "setOrderInGroup", "getPackageName", "setPackageName", "getPolicy", "getPreview", "setPreview", "getPreviewSw480", "setPreviewSw480", "getReservedFlag", "setReservedFlag", "getResizable", "setResizable", "getServiceCategory", "getServiceId", "setServiceId", "getSettingUrl", "setSettingUrl", "getShowTitle", "setShowTitle", "getShowWhenLocked", "setShowWhenLocked", "getSize", "setSize", "getSkeletonDarkPicPath", "setSkeletonDarkPicPath", "getSkeletonPicPath", "setSkeletonPicPath", "getSupportSuperChannel", "setSupportSuperChannel", "getType", "setType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component5", "component6", "component7", "component8", "component9", "copy", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;IZILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/Long;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZLjava/lang/String;ZLjava/lang/String;Lpantanal/content/nano/CardConfigInfoListProto$CardMaintainProto;Ljava/lang/String;Ljava/lang/String;Lpantanal/app/bean/CardMaintain;Ljava/lang/String;Ljava/lang/String;)Lpantanal/app/bean/CardConfigInfo;", "equals", "other", "hashCode", "toString", "Companion", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CardConfigInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String bizPkgName;

    @Nullable
    private CardMaintain cardMaintain;

    @Nullable
    private CardConfigInfoListProto.CardMaintainProto cardMaintainProto;
    private int category;

    @Nullable
    private String componentName;
    private int defaultSubscribed;

    @Nullable
    private String desc;
    private int displayArea;

    @NotNull
    private String distributeType;
    private boolean dragonFlySecure;

    @Nullable
    private String dragonFlyService;
    private int dragonFlyType;

    @Nullable
    private String extras;

    @Nullable
    private String groupIcon;
    private int groupId;
    private int groupOrder;

    @Nullable
    private String groupTitle;

    @Nullable
    private String identification;

    @Nullable
    private String instantCardUrl;

    @Nullable
    private final Long intentId;
    private boolean isDarkStyle;

    @Nullable
    private String loadFailDp;

    @Nullable
    private String loadFailPicPath;

    @Nullable
    private String loadingBgIcon;

    @Nullable
    private String loadingIcon;

    @NotNull
    private String materialPreview;
    private int minHeight;
    private int minWidth;

    @Nullable
    private String miniAppIcon;

    @Nullable
    private String name;
    private int operatingIcon;
    private int orderInGroup;

    @Nullable
    private String packageName;

    @Nullable
    private final String policy;

    @Nullable
    private String preview;

    @Nullable
    private String previewSw480;
    private int reservedFlag;
    private boolean resizable;
    private final int serviceCategory;

    @Nullable
    private String serviceId;

    @Nullable
    private String settingUrl;
    private int showTitle;
    private boolean showWhenLocked;
    private int size;

    @Nullable
    private String skeletonDarkPicPath;

    @Nullable
    private String skeletonPicPath;
    private boolean supportSuperChannel;
    private int type;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bJ\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0004¨\u0006\u0011"}, d2 = {"Lpantanal/app/bean/CardConfigInfo$Companion;", "", "()V", "fromProto", "Lpantanal/app/bean/CardConfigInfo;", "proto", "Lpantanal/content/nano/CardConfigInfoListProto$CardConfigInfoProto;", "getOperationIcon", "", "protoOperationIcon", "getSize", "protoSize", "toCategory", "Lpantanal/app/bean/CardCategory;", "category", "toDecisionCardConfig", "Lpantanal/decision/DecisionCardConfig;", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CardConfigInfo fromProto(@NotNull CardConfigInfoListProto.CardConfigInfoProto proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int i = proto.dragonFlyType;
            boolean z = proto.dragonFlySecure;
            String str = proto.dragonFlyService;
            String str2 = proto.skeletonPicPath;
            String str3 = proto.skeletonDarkPicPath;
            String str4 = proto.loadFailPicPath;
            String str5 = proto.loadFailDp;
            int i2 = proto.showTitle;
            String str6 = proto.miniAppIcon;
            boolean z2 = proto.isDarkStyle;
            boolean z3 = proto.showWhenLocked;
            String str7 = proto.instantCardUrl;
            boolean z4 = proto.supportSuperChannel;
            String str8 = proto.identification;
            CardConfigInfoListProto.CardMaintainProto cardMaintainProto = proto.cardMaintain;
            String str9 = proto.materialPreview;
            Intrinsics.checkNotNullExpressionValue(str9, "proto.materialPreview");
            String str10 = proto.distributeType;
            Intrinsics.checkNotNullExpressionValue(str10, "proto.distributeType");
            return new CardConfigInfo(proto.type, proto.groupId, proto.groupTitle, proto.groupIcon, proto.name, proto.desc, proto.preview, proto.size, proto.orderInGroup, proto.packageName, proto.componentName, proto.category, proto.resizable, getOperationIcon(proto.operatingIcon), proto.settingUrl, proto.displayArea, proto.minWidth, proto.minHeight, proto.loadingIcon, proto.loadingBgIcon, proto.reservedFlag, proto.defaultSubscribed, proto.groupOrder, proto.previewSw480, proto.serviceId, 0, 0L, null, i, z, str, str2, str3, str4, str5, i2, str6, z2, z3, str7, z4, str8, cardMaintainProto, str9, str10, null, proto.bizPkgName, proto.extras, 0, 8192, null);
        }

        public final int getOperationIcon(int protoOperationIcon) {
            if (protoOperationIcon == 1) {
                return 1;
            }
            if (protoOperationIcon == 2) {
                return 2;
            }
            if (protoOperationIcon != 3) {
                return protoOperationIcon != 4 ? -1 : 4;
            }
            return 3;
        }

        public final int getSize(int protoSize) {
            switch (protoSize) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                    return 6;
                case 7:
                    return 7;
                case 8:
                    return 8;
                case 9:
                    return 9;
                case 10:
                    return 10;
                default:
                    return -1;
            }
        }

        @NotNull
        public final CardCategory toCategory(int category) {
            if (category == 1) {
                return CardCategory.INSTANT;
            }
            if (category != 2) {
                return category != 100 ? CardCategory.UNKNOWN : CardCategory.SEEDLING;
            }
            return CardCategory.APP;
        }

        @NotNull
        public final DecisionCardConfig toDecisionCardConfig(@NotNull CardConfigInfo cardConfigInfo) {
            Intrinsics.checkNotNullParameter(cardConfigInfo, "<this>");
            String serviceId = cardConfigInfo.getServiceId();
            String str = serviceId == null ? "" : serviceId;
            int type = cardConfigInfo.getType();
            String name = cardConfigInfo.getName();
            String str2 = name == null ? "" : name;
            String desc = cardConfigInfo.getDesc();
            String str3 = desc == null ? "" : desc;
            int size = cardConfigInfo.getSize();
            String packageName = cardConfigInfo.getPackageName();
            String str4 = packageName == null ? "" : packageName;
            String componentName = cardConfigInfo.getComponentName();
            String str5 = componentName == null ? "" : componentName;
            int category = cardConfigInfo.getCategory();
            boolean supportSuperChannel = cardConfigInfo.getSupportSuperChannel();
            String instantCardUrl = cardConfigInfo.getInstantCardUrl();
            return new DecisionCardConfig(str, type, str2, str3, size, str4, str5, category, false, 0, 0, 0, 0, instantCardUrl == null ? "" : instantCardUrl, supportSuperChannel, k18.GL_VENDOR, null);
        }
    }

    public CardConfigInfo(int i, int i2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i3, int i4, @Nullable String str6, @Nullable String str7, int i5, boolean z, int i6, @Nullable String str8, int i7, int i8, int i9, @Nullable String str9, @Nullable String str10, int i10, int i11, int i12, @Nullable String str11, @Nullable String str12, int i13, @Nullable Long l2, @Nullable String str13, int i14, boolean z2, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, int i15, @Nullable String str19, boolean z3, boolean z4, @Nullable String str20, boolean z5, @Nullable String str21, @Nullable CardConfigInfoListProto.CardMaintainProto cardMaintainProto, @NotNull String materialPreview, @NotNull String distributeType, @Nullable CardMaintain cardMaintain, @Nullable String str22, @Nullable String str23) {
        Intrinsics.checkNotNullParameter(materialPreview, "materialPreview");
        Intrinsics.checkNotNullParameter(distributeType, "distributeType");
        this.type = i;
        this.groupId = i2;
        this.groupTitle = str;
        this.groupIcon = str2;
        this.name = str3;
        this.desc = str4;
        this.preview = str5;
        this.size = i3;
        this.orderInGroup = i4;
        this.packageName = str6;
        this.componentName = str7;
        this.category = i5;
        this.resizable = z;
        this.operatingIcon = i6;
        this.settingUrl = str8;
        this.displayArea = i7;
        this.minWidth = i8;
        this.minHeight = i9;
        this.loadingIcon = str9;
        this.loadingBgIcon = str10;
        this.reservedFlag = i10;
        this.defaultSubscribed = i11;
        this.groupOrder = i12;
        this.previewSw480 = str11;
        this.serviceId = str12;
        this.serviceCategory = i13;
        this.intentId = l2;
        this.policy = str13;
        this.dragonFlyType = i14;
        this.dragonFlySecure = z2;
        this.dragonFlyService = str14;
        this.skeletonPicPath = str15;
        this.skeletonDarkPicPath = str16;
        this.loadFailPicPath = str17;
        this.loadFailDp = str18;
        this.showTitle = i15;
        this.miniAppIcon = str19;
        this.isDarkStyle = z3;
        this.showWhenLocked = z4;
        this.instantCardUrl = str20;
        this.supportSuperChannel = z5;
        this.identification = str21;
        this.cardMaintainProto = cardMaintainProto;
        this.materialPreview = materialPreview;
        this.distributeType = distributeType;
        this.cardMaintain = cardMaintain;
        this.bizPkgName = str22;
        this.extras = str23;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getComponentName() {
        return this.componentName;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getResizable() {
        return this.resizable;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getOperatingIcon() {
        return this.operatingIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSettingUrl() {
        return this.settingUrl;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getDisplayArea() {
        return this.displayArea;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getMinWidth() {
        return this.minWidth;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getMinHeight() {
        return this.minHeight;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getLoadingIcon() {
        return this.loadingIcon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getGroupId() {
        return this.groupId;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getLoadingBgIcon() {
        return this.loadingBgIcon;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getReservedFlag() {
        return this.reservedFlag;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getDefaultSubscribed() {
        return this.defaultSubscribed;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getGroupOrder() {
        return this.groupOrder;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getPreviewSw480() {
        return this.previewSw480;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getServiceCategory() {
        return this.serviceCategory;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Long getIntentId() {
        return this.intentId;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getPolicy() {
        return this.policy;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final int getDragonFlyType() {
        return this.dragonFlyType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGroupTitle() {
        return this.groupTitle;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final boolean getDragonFlySecure() {
        return this.dragonFlySecure;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getDragonFlyService() {
        return this.dragonFlyService;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getSkeletonPicPath() {
        return this.skeletonPicPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getSkeletonDarkPicPath() {
        return this.skeletonDarkPicPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getLoadFailPicPath() {
        return this.loadFailPicPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getLoadFailDp() {
        return this.loadFailDp;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final int getShowTitle() {
        return this.showTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getMiniAppIcon() {
        return this.miniAppIcon;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final boolean getIsDarkStyle() {
        return this.isDarkStyle;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final boolean getShowWhenLocked() {
        return this.showWhenLocked;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGroupIcon() {
        return this.groupIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getInstantCardUrl() {
        return this.instantCardUrl;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final boolean getSupportSuperChannel() {
        return this.supportSuperChannel;
    }

    @Nullable
    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getIdentification() {
        return this.identification;
    }

    @Nullable
    /* JADX INFO: renamed from: component43, reason: from getter */
    public final CardConfigInfoListProto.CardMaintainProto getCardMaintainProto() {
        return this.cardMaintainProto;
    }

    @NotNull
    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getMaterialPreview() {
        return this.materialPreview;
    }

    @NotNull
    /* JADX INFO: renamed from: component45, reason: from getter */
    public final String getDistributeType() {
        return this.distributeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component46, reason: from getter */
    public final CardMaintain getCardMaintain() {
        return this.cardMaintain;
    }

    @Nullable
    /* JADX INFO: renamed from: component47, reason: from getter */
    public final String getBizPkgName() {
        return this.bizPkgName;
    }

    @Nullable
    /* JADX INFO: renamed from: component48, reason: from getter */
    public final String getExtras() {
        return this.extras;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPreview() {
        return this.preview;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getOrderInGroup() {
        return this.orderInGroup;
    }

    @NotNull
    public final CardConfigInfo copy(int type, int groupId, @Nullable String groupTitle, @Nullable String groupIcon, @Nullable String name, @Nullable String desc, @Nullable String preview, int size, int orderInGroup, @Nullable String packageName, @Nullable String componentName, int category, boolean resizable, int operatingIcon, @Nullable String settingUrl, int displayArea, int minWidth, int minHeight, @Nullable String loadingIcon, @Nullable String loadingBgIcon, int reservedFlag, int defaultSubscribed, int groupOrder, @Nullable String previewSw480, @Nullable String serviceId, int serviceCategory, @Nullable Long intentId, @Nullable String policy, int dragonFlyType, boolean dragonFlySecure, @Nullable String dragonFlyService, @Nullable String skeletonPicPath, @Nullable String skeletonDarkPicPath, @Nullable String loadFailPicPath, @Nullable String loadFailDp, int showTitle, @Nullable String miniAppIcon, boolean isDarkStyle, boolean showWhenLocked, @Nullable String instantCardUrl, boolean supportSuperChannel, @Nullable String identification, @Nullable CardConfigInfoListProto.CardMaintainProto cardMaintainProto, @NotNull String materialPreview, @NotNull String distributeType, @Nullable CardMaintain cardMaintain, @Nullable String bizPkgName, @Nullable String extras) {
        Intrinsics.checkNotNullParameter(materialPreview, "materialPreview");
        Intrinsics.checkNotNullParameter(distributeType, "distributeType");
        return new CardConfigInfo(type, groupId, groupTitle, groupIcon, name, desc, preview, size, orderInGroup, packageName, componentName, category, resizable, operatingIcon, settingUrl, displayArea, minWidth, minHeight, loadingIcon, loadingBgIcon, reservedFlag, defaultSubscribed, groupOrder, previewSw480, serviceId, serviceCategory, intentId, policy, dragonFlyType, dragonFlySecure, dragonFlyService, skeletonPicPath, skeletonDarkPicPath, loadFailPicPath, loadFailDp, showTitle, miniAppIcon, isDarkStyle, showWhenLocked, instantCardUrl, supportSuperChannel, identification, cardMaintainProto, materialPreview, distributeType, cardMaintain, bizPkgName, extras);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardConfigInfo)) {
            return false;
        }
        CardConfigInfo cardConfigInfo = (CardConfigInfo) other;
        return this.type == cardConfigInfo.type && this.groupId == cardConfigInfo.groupId && Intrinsics.areEqual(this.groupTitle, cardConfigInfo.groupTitle) && Intrinsics.areEqual(this.groupIcon, cardConfigInfo.groupIcon) && Intrinsics.areEqual(this.name, cardConfigInfo.name) && Intrinsics.areEqual(this.desc, cardConfigInfo.desc) && Intrinsics.areEqual(this.preview, cardConfigInfo.preview) && this.size == cardConfigInfo.size && this.orderInGroup == cardConfigInfo.orderInGroup && Intrinsics.areEqual(this.packageName, cardConfigInfo.packageName) && Intrinsics.areEqual(this.componentName, cardConfigInfo.componentName) && this.category == cardConfigInfo.category && this.resizable == cardConfigInfo.resizable && this.operatingIcon == cardConfigInfo.operatingIcon && Intrinsics.areEqual(this.settingUrl, cardConfigInfo.settingUrl) && this.displayArea == cardConfigInfo.displayArea && this.minWidth == cardConfigInfo.minWidth && this.minHeight == cardConfigInfo.minHeight && Intrinsics.areEqual(this.loadingIcon, cardConfigInfo.loadingIcon) && Intrinsics.areEqual(this.loadingBgIcon, cardConfigInfo.loadingBgIcon) && this.reservedFlag == cardConfigInfo.reservedFlag && this.defaultSubscribed == cardConfigInfo.defaultSubscribed && this.groupOrder == cardConfigInfo.groupOrder && Intrinsics.areEqual(this.previewSw480, cardConfigInfo.previewSw480) && Intrinsics.areEqual(this.serviceId, cardConfigInfo.serviceId) && this.serviceCategory == cardConfigInfo.serviceCategory && Intrinsics.areEqual(this.intentId, cardConfigInfo.intentId) && Intrinsics.areEqual(this.policy, cardConfigInfo.policy) && this.dragonFlyType == cardConfigInfo.dragonFlyType && this.dragonFlySecure == cardConfigInfo.dragonFlySecure && Intrinsics.areEqual(this.dragonFlyService, cardConfigInfo.dragonFlyService) && Intrinsics.areEqual(this.skeletonPicPath, cardConfigInfo.skeletonPicPath) && Intrinsics.areEqual(this.skeletonDarkPicPath, cardConfigInfo.skeletonDarkPicPath) && Intrinsics.areEqual(this.loadFailPicPath, cardConfigInfo.loadFailPicPath) && Intrinsics.areEqual(this.loadFailDp, cardConfigInfo.loadFailDp) && this.showTitle == cardConfigInfo.showTitle && Intrinsics.areEqual(this.miniAppIcon, cardConfigInfo.miniAppIcon) && this.isDarkStyle == cardConfigInfo.isDarkStyle && this.showWhenLocked == cardConfigInfo.showWhenLocked && Intrinsics.areEqual(this.instantCardUrl, cardConfigInfo.instantCardUrl) && this.supportSuperChannel == cardConfigInfo.supportSuperChannel && Intrinsics.areEqual(this.identification, cardConfigInfo.identification) && Intrinsics.areEqual(this.cardMaintainProto, cardConfigInfo.cardMaintainProto) && Intrinsics.areEqual(this.materialPreview, cardConfigInfo.materialPreview) && Intrinsics.areEqual(this.distributeType, cardConfigInfo.distributeType) && Intrinsics.areEqual(this.cardMaintain, cardConfigInfo.cardMaintain) && Intrinsics.areEqual(this.bizPkgName, cardConfigInfo.bizPkgName) && Intrinsics.areEqual(this.extras, cardConfigInfo.extras);
    }

    @Nullable
    public final String getBizPkgName() {
        return this.bizPkgName;
    }

    @Nullable
    public final CardMaintain getCardMaintain() {
        return this.cardMaintain;
    }

    @Nullable
    public final CardConfigInfoListProto.CardMaintainProto getCardMaintainProto() {
        return this.cardMaintainProto;
    }

    public final int getCategory() {
        return this.category;
    }

    @Nullable
    public final String getComponentName() {
        return this.componentName;
    }

    public final int getDefaultSubscribed() {
        return this.defaultSubscribed;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    public final int getDisplayArea() {
        return this.displayArea;
    }

    @NotNull
    public final String getDistributeType() {
        return this.distributeType;
    }

    public final boolean getDragonFlySecure() {
        return this.dragonFlySecure;
    }

    @Nullable
    public final String getDragonFlyService() {
        return this.dragonFlyService;
    }

    public final int getDragonFlyType() {
        return this.dragonFlyType;
    }

    @Nullable
    public final String getExtras() {
        return this.extras;
    }

    @Nullable
    public final String getGroupIcon() {
        return this.groupIcon;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final int getGroupOrder() {
        return this.groupOrder;
    }

    @Nullable
    public final String getGroupTitle() {
        return this.groupTitle;
    }

    @Nullable
    public final String getIdentification() {
        return this.identification;
    }

    @Nullable
    public final String getInstantCardUrl() {
        return this.instantCardUrl;
    }

    @Nullable
    public final Long getIntentId() {
        return this.intentId;
    }

    @Nullable
    public final String getLoadFailDp() {
        return this.loadFailDp;
    }

    @Nullable
    public final String getLoadFailPicPath() {
        return this.loadFailPicPath;
    }

    @Nullable
    public final String getLoadingBgIcon() {
        return this.loadingBgIcon;
    }

    @Nullable
    public final String getLoadingIcon() {
        return this.loadingIcon;
    }

    @NotNull
    public final String getMaterialPreview() {
        return this.materialPreview;
    }

    public final int getMinHeight() {
        return this.minHeight;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    @Nullable
    public final String getMiniAppIcon() {
        return this.miniAppIcon;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getOperatingIcon() {
        return this.operatingIcon;
    }

    public final int getOrderInGroup() {
        return this.orderInGroup;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final String getPolicy() {
        return this.policy;
    }

    @Nullable
    public final String getPreview() {
        return this.preview;
    }

    @Nullable
    public final String getPreviewSw480() {
        return this.previewSw480;
    }

    public final int getReservedFlag() {
        return this.reservedFlag;
    }

    public final boolean getResizable() {
        return this.resizable;
    }

    public final int getServiceCategory() {
        return this.serviceCategory;
    }

    @Nullable
    public final String getServiceId() {
        return this.serviceId;
    }

    @Nullable
    public final String getSettingUrl() {
        return this.settingUrl;
    }

    public final int getShowTitle() {
        return this.showTitle;
    }

    public final boolean getShowWhenLocked() {
        return this.showWhenLocked;
    }

    public final int getSize() {
        return this.size;
    }

    @Nullable
    public final String getSkeletonDarkPicPath() {
        return this.skeletonDarkPicPath;
    }

    @Nullable
    public final String getSkeletonPicPath() {
        return this.skeletonPicPath;
    }

    public final boolean getSupportSuperChannel() {
        return this.supportSuperChannel;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r1v121 */
    /* JADX WARN: Type inference failed for: r1v122 */
    /* JADX WARN: Type inference failed for: r1v129 */
    /* JADX WARN: Type inference failed for: r1v137 */
    /* JADX WARN: Type inference failed for: r1v145 */
    /* JADX WARN: Type inference failed for: r1v146 */
    /* JADX WARN: Type inference failed for: r1v147 */
    /* JADX WARN: Type inference failed for: r1v148 */
    /* JADX WARN: Type inference failed for: r1v30, types: [int] */
    /* JADX WARN: Type inference failed for: r1v71, types: [int] */
    /* JADX WARN: Type inference failed for: r1v93, types: [int] */
    /* JADX WARN: Type inference failed for: r1v95, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.groupId)) * 31;
        String str = this.groupTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.groupIcon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.desc;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.preview;
        int iHashCode6 = (((((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.size)) * 31) + Integer.hashCode(this.orderInGroup)) * 31;
        String str6 = this.packageName;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.componentName;
        int iHashCode8 = (((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + Integer.hashCode(this.category)) * 31;
        boolean z = this.resizable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode9 = (((iHashCode8 + r1) * 31) + Integer.hashCode(this.operatingIcon)) * 31;
        String str8 = this.settingUrl;
        int iHashCode10 = (((((((iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31) + Integer.hashCode(this.displayArea)) * 31) + Integer.hashCode(this.minWidth)) * 31) + Integer.hashCode(this.minHeight)) * 31;
        String str9 = this.loadingIcon;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.loadingBgIcon;
        int iHashCode12 = (((((((iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31) + Integer.hashCode(this.reservedFlag)) * 31) + Integer.hashCode(this.defaultSubscribed)) * 31) + Integer.hashCode(this.groupOrder)) * 31;
        String str11 = this.previewSw480;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.serviceId;
        int iHashCode14 = (((iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31) + Integer.hashCode(this.serviceCategory)) * 31;
        Long l2 = this.intentId;
        int iHashCode15 = (iHashCode14 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str13 = this.policy;
        int iHashCode16 = (((iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31) + Integer.hashCode(this.dragonFlyType)) * 31;
        boolean z2 = this.dragonFlySecure;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i = (iHashCode16 + r2) * 31;
        String str14 = this.dragonFlyService;
        int iHashCode17 = (i + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.skeletonPicPath;
        int iHashCode18 = (iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.skeletonDarkPicPath;
        int iHashCode19 = (iHashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.loadFailPicPath;
        int iHashCode20 = (iHashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.loadFailDp;
        int iHashCode21 = (((iHashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31) + Integer.hashCode(this.showTitle)) * 31;
        String str19 = this.miniAppIcon;
        int iHashCode22 = (iHashCode21 + (str19 == null ? 0 : str19.hashCode())) * 31;
        boolean z3 = this.isDarkStyle;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i2 = (iHashCode22 + r3) * 31;
        boolean z4 = this.showWhenLocked;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int i3 = (i2 + r4) * 31;
        String str20 = this.instantCardUrl;
        int iHashCode23 = (i3 + (str20 == null ? 0 : str20.hashCode())) * 31;
        boolean z5 = this.supportSuperChannel;
        int i4 = (iHashCode23 + (z5 ? 1 : z5)) * 31;
        String str21 = this.identification;
        int iHashCode24 = (i4 + (str21 == null ? 0 : str21.hashCode())) * 31;
        CardConfigInfoListProto.CardMaintainProto cardMaintainProto = this.cardMaintainProto;
        int iHashCode25 = (((((iHashCode24 + (cardMaintainProto == null ? 0 : cardMaintainProto.hashCode())) * 31) + this.materialPreview.hashCode()) * 31) + this.distributeType.hashCode()) * 31;
        CardMaintain cardMaintain = this.cardMaintain;
        int iHashCode26 = (iHashCode25 + (cardMaintain == null ? 0 : cardMaintain.hashCode())) * 31;
        String str22 = this.bizPkgName;
        int iHashCode27 = (iHashCode26 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.extras;
        return iHashCode27 + (str23 != null ? str23.hashCode() : 0);
    }

    public final boolean isDarkStyle() {
        return this.isDarkStyle;
    }

    public final void setBizPkgName(@Nullable String str) {
        this.bizPkgName = str;
    }

    public final void setCardMaintain(@Nullable CardMaintain cardMaintain) {
        this.cardMaintain = cardMaintain;
    }

    public final void setCardMaintainProto(@Nullable CardConfigInfoListProto.CardMaintainProto cardMaintainProto) {
        this.cardMaintainProto = cardMaintainProto;
    }

    public final void setCategory(int i) {
        this.category = i;
    }

    public final void setComponentName(@Nullable String str) {
        this.componentName = str;
    }

    public final void setDarkStyle(boolean z) {
        this.isDarkStyle = z;
    }

    public final void setDefaultSubscribed(int i) {
        this.defaultSubscribed = i;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setDisplayArea(int i) {
        this.displayArea = i;
    }

    public final void setDistributeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.distributeType = str;
    }

    public final void setDragonFlySecure(boolean z) {
        this.dragonFlySecure = z;
    }

    public final void setDragonFlyService(@Nullable String str) {
        this.dragonFlyService = str;
    }

    public final void setDragonFlyType(int i) {
        this.dragonFlyType = i;
    }

    public final void setExtras(@Nullable String str) {
        this.extras = str;
    }

    public final void setGroupIcon(@Nullable String str) {
        this.groupIcon = str;
    }

    public final void setGroupId(int i) {
        this.groupId = i;
    }

    public final void setGroupOrder(int i) {
        this.groupOrder = i;
    }

    public final void setGroupTitle(@Nullable String str) {
        this.groupTitle = str;
    }

    public final void setIdentification(@Nullable String str) {
        this.identification = str;
    }

    public final void setInstantCardUrl(@Nullable String str) {
        this.instantCardUrl = str;
    }

    public final void setLoadFailDp(@Nullable String str) {
        this.loadFailDp = str;
    }

    public final void setLoadFailPicPath(@Nullable String str) {
        this.loadFailPicPath = str;
    }

    public final void setLoadingBgIcon(@Nullable String str) {
        this.loadingBgIcon = str;
    }

    public final void setLoadingIcon(@Nullable String str) {
        this.loadingIcon = str;
    }

    public final void setMaterialPreview(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.materialPreview = str;
    }

    public final void setMinHeight(int i) {
        this.minHeight = i;
    }

    public final void setMinWidth(int i) {
        this.minWidth = i;
    }

    public final void setMiniAppIcon(@Nullable String str) {
        this.miniAppIcon = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOperatingIcon(int i) {
        this.operatingIcon = i;
    }

    public final void setOrderInGroup(int i) {
        this.orderInGroup = i;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    public final void setPreview(@Nullable String str) {
        this.preview = str;
    }

    public final void setPreviewSw480(@Nullable String str) {
        this.previewSw480 = str;
    }

    public final void setReservedFlag(int i) {
        this.reservedFlag = i;
    }

    public final void setResizable(boolean z) {
        this.resizable = z;
    }

    public final void setServiceId(@Nullable String str) {
        this.serviceId = str;
    }

    public final void setSettingUrl(@Nullable String str) {
        this.settingUrl = str;
    }

    public final void setShowTitle(int i) {
        this.showTitle = i;
    }

    public final void setShowWhenLocked(boolean z) {
        this.showWhenLocked = z;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    public final void setSkeletonDarkPicPath(@Nullable String str) {
        this.skeletonDarkPicPath = str;
    }

    public final void setSkeletonPicPath(@Nullable String str) {
        this.skeletonPicPath = str;
    }

    public final void setSupportSuperChannel(boolean z) {
        this.supportSuperChannel = z;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "CardConfigInfo(type=" + this.type + ", groupId=" + this.groupId + ", groupTitle=" + this.groupTitle + ", groupIcon=" + this.groupIcon + ", name=" + this.name + ", desc=" + this.desc + ", preview=" + this.preview + ", size=" + this.size + ", orderInGroup=" + this.orderInGroup + ", packageName=" + this.packageName + ", componentName=" + this.componentName + ", category=" + this.category + ", resizable=" + this.resizable + ", operatingIcon=" + this.operatingIcon + ", settingUrl=" + this.settingUrl + ", displayArea=" + this.displayArea + ", minWidth=" + this.minWidth + ", minHeight=" + this.minHeight + ", loadingIcon=" + this.loadingIcon + ", loadingBgIcon=" + this.loadingBgIcon + ", reservedFlag=" + this.reservedFlag + ", defaultSubscribed=" + this.defaultSubscribed + ", groupOrder=" + this.groupOrder + ", previewSw480=" + this.previewSw480 + ", serviceId=" + this.serviceId + ", serviceCategory=" + this.serviceCategory + ", intentId=" + this.intentId + ", policy=" + this.policy + ", dragonFlyType=" + this.dragonFlyType + ", dragonFlySecure=" + this.dragonFlySecure + ", dragonFlyService=" + this.dragonFlyService + ", skeletonPicPath=" + this.skeletonPicPath + ", skeletonDarkPicPath=" + this.skeletonDarkPicPath + ", loadFailPicPath=" + this.loadFailPicPath + ", loadFailDp=" + this.loadFailDp + ", showTitle=" + this.showTitle + ", miniAppIcon=" + this.miniAppIcon + ", isDarkStyle=" + this.isDarkStyle + ", showWhenLocked=" + this.showWhenLocked + ", instantCardUrl=" + this.instantCardUrl + ", supportSuperChannel=" + this.supportSuperChannel + ", identification=" + this.identification + ", cardMaintainProto=" + this.cardMaintainProto + ", materialPreview=" + this.materialPreview + ", distributeType=" + this.distributeType + ", cardMaintain=" + this.cardMaintain + ", bizPkgName=" + this.bizPkgName + ", extras=" + this.extras + ")";
    }

    public /* synthetic */ CardConfigInfo(int i, int i2, String str, String str2, String str3, String str4, String str5, int i3, int i4, String str6, String str7, int i5, boolean z, int i6, String str8, int i7, int i8, int i9, String str9, String str10, int i10, int i11, int i12, String str11, String str12, int i13, Long l2, String str13, int i14, boolean z2, String str14, String str15, String str16, String str17, String str18, int i15, String str19, boolean z3, boolean z4, String str20, boolean z5, String str21, CardConfigInfoListProto.CardMaintainProto cardMaintainProto, String str22, String str23, CardMaintain cardMaintain, String str24, String str25, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, str2, str3, str4, str5, i3, i4, str6, str7, i5, z, i6, str8, i7, i8, i9, str9, str10, i10, i11, i12, str11, str12, i13, l2, str13, i14, z2, str14, str15, str16, str17, str18, i15, str19, z3, z4, str20, (i17 & 256) != 0 ? false : z5, (i17 & 512) != 0 ? null : str21, cardMaintainProto, (i17 & 2048) != 0 ? "" : str22, (i17 & 4096) != 0 ? "" : str23, (i17 & 8192) != 0 ? null : cardMaintain, (i17 & 16384) != 0 ? null : str24, (i17 & 32768) != 0 ? null : str25);
    }

    public /* synthetic */ CardConfigInfo(int i, int i2, String str, String str2, String str3, String str4, String str5, int i3, int i4, String str6, String str7, int i5, boolean z, int i6, String str8, int i7, int i8, int i9, String str9, String str10, int i10, int i11, int i12, String str11, String str12, int i13, Long l2, String str13, int i14, boolean z2, String str14, String str15, String str16, String str17, String str18, int i15, String str19, boolean z3, boolean z4, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 0 : i, (i16 & 2) != 0 ? 0 : i2, (i16 & 4) != 0 ? "" : str, (i16 & 8) != 0 ? "" : str2, (i16 & 16) != 0 ? "" : str3, (i16 & 32) != 0 ? "" : str4, (i16 & 64) != 0 ? "" : str5, (i16 & 128) != 0 ? 0 : i3, (i16 & 256) != 0 ? 0 : i4, (i16 & 512) != 0 ? "" : str6, (i16 & 1024) != 0 ? "" : str7, (i16 & 2048) != 0 ? 0 : i5, (i16 & 4096) != 0 ? false : z, (i16 & 8192) != 0 ? 0 : i6, (i16 & 16384) != 0 ? "" : str8, (i16 & 32768) != 0 ? 0 : i7, (i16 & 65536) != 0 ? 0 : i8, (i16 & 131072) != 0 ? 0 : i9, (i16 & 262144) != 0 ? "" : str9, (i16 & 524288) != 0 ? "" : str10, (i16 & 1048576) != 0 ? 0 : i10, (i16 & 2097152) != 0 ? 0 : i11, (i16 & 4194304) != 0 ? 0 : i12, (i16 & 8388608) != 0 ? "" : str11, (i16 & 16777216) != 0 ? "" : str12, (i16 & 33554432) != 0 ? 0 : i13, (i16 & 67108864) != 0 ? null : l2, (i16 & 134217728) == 0 ? str13 : null, (i16 & 268435456) != 0 ? 0 : i14, (i16 & 536870912) != 0 ? false : z2, (i16 & 1073741824) != 0 ? "" : str14, (i16 & Integer.MIN_VALUE) != 0 ? "" : str15, (i17 & 1) != 0 ? "" : str16, (i17 & 2) != 0 ? "" : str17, (i17 & 4) != 0 ? "" : str18, (i17 & 8) != 0 ? 0 : i15, (i17 & 16) != 0 ? "" : str19, (i17 & 32) != 0 ? false : z3, (i17 & 64) != 0 ? false : z4);
    }

    public CardConfigInfo(int i, int i2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i3, int i4, @Nullable String str6, @Nullable String str7, int i5, boolean z, int i6, @Nullable String str8, int i7, int i8, int i9, @Nullable String str9, @Nullable String str10, int i10, int i11, int i12, @Nullable String str11, @Nullable String str12, int i13, @Nullable Long l2, @Nullable String str13, int i14, boolean z2, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, int i15, @Nullable String str19, boolean z3, boolean z4) {
        this(i, i2, str, str2, str3, str4, str5, i3, i4, str6, str7, i5, z, i6, str8, i7, i8, i9, str9, str10, i10, i11, i12, str11, str12, i13, l2, str13, i14, z2, str14, str15, str16, str17, str18, i15, str19, z3, z4, "", false, "", null, "", "", null, null, null, 0, 57344, null);
    }
}
