package com.oplus.aiunit.model;

import com.heytap.accessory.accessorymanager.AccessoryManager;
import com.heytap.accessory.bean.PeerAccessory;
import com.heytap.accessory.bean.ServiceProfile;
import com.oplus.aiunit.vision.uml;
import com.oplus.aiunit.vision.veb;
import com.oplus.aiunit.vision.z1g;
import com.oplus.wearable.linkservice.sdk.Node;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\official-device-assets\classes17.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0006R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/dcd;", "", "", "mac", "Lcom/heytap/accessory/accessorymanager/AccessoryManager;", "accessoryManager", "", "a", "Lcom/oplus/wearable/linkservice/sdk/Node;", "node", "d", "", "b", "c", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "I", "preRole", "", "Ljava/util/Map;", "roleMap", "<init>", "()V", "oafhost_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOafRoleManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OafRoleManager.kt\ncom/heytap/health/oaf/OafRoleManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n1747#2,3:84\n1747#2,3:87\n1747#2,3:90\n*S KotlinDebug\n*F\n+ 1 OafRoleManager.kt\ncom/heytap/health/oaf/OafRoleManager\n*L\n31#1:84,3\n37#1:87,3\n43#1:90,3\n*E\n"})
public final class dcd {

    @NotNull
    public static final dcd INSTANCE = new dcd();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String TAG = "OafRoleManager";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static int preRole = -1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, Integer> roleMap = new LinkedHashMap();

    public final void a(@NotNull String mac, @NotNull AccessoryManager accessoryManager) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(accessoryManager, "accessoryManager");
        Integer num = roleMap.get(mac);
        int iIntValue = num != null ? num.intValue() : 1;
        if (!accessoryManager.isSupportDynamicRegisterAgent()) {
            uml.k(TAG, "dynamicRegisterProfiles role:" + iIntValue + " , not support");
            return;
        }
        List localRegisteredProfile = accessoryManager.getLocalRegisteredProfile();
        int size = localRegisteredProfile.size();
        boolean z3 = false;
        if (iIntValue == preRole) {
            Intrinsics.checkNotNullExpressionValue(localRegisteredProfile, "registeredProfiles");
            List list = localRegisteredProfile;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    String id = ((ServiceProfile) it.next()).getId();
                    Intrinsics.checkNotNullExpressionValue(id, "it.id");
                    if (StringsKt.contains$default(id, "notification", false, 2, (Object) null)) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
            if (z2) {
                uml.k(TAG, "dynamicRegisterProfiles role:" + iIntValue + " , role no change");
                return;
            }
        }
        List connectedAccessories = accessoryManager.getConnectedAccessories();
        Intrinsics.checkNotNullExpressionValue(connectedAccessories, "accessoryManager.connectedAccessories");
        List list2 = connectedAccessories;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                } else if (Intrinsics.areEqual(((PeerAccessory) it2.next()).getAddress(), mac)) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        if (z) {
            Intrinsics.checkNotNullExpressionValue(localRegisteredProfile, "registeredProfiles");
            List list3 = localRegisteredProfile;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    String id2 = ((ServiceProfile) it3.next()).getId();
                    Intrinsics.checkNotNullExpressionValue(id2, "it.id");
                    if (StringsKt.contains$default(id2, iIntValue == 2 ? "notification" : "health2", false, 2, (Object) null)) {
                        z3 = true;
                        break;
                    }
                }
            }
            if (z3) {
                uml.d(TAG, "already connected, ignore dynamic registeredProfile ");
                preRole = iIntValue;
                return;
            }
        }
        String str = TAG;
        uml.k(str, "dynamicRegisterProfiles role:" + iIntValue + " , profiles->" + size);
        if (iIntValue == 1) {
            boolean zUnRegisterServiceProfile = accessoryManager.unRegisterServiceProfile();
            uml.k(str, "dynamicRegisterProfiles preRole:" + preRole + " SECONDARY-PRIMARY->unRegisterServiceProfile => " + zUnRegisterServiceProfile);
            boolean zRegisterServiceProfile = accessoryManager.registerServiceProfile(z1g.d().b());
            uml.k(str, "dynamicRegisterProfiles preRole:" + preRole + " SECONDARY-PRIMARY->" + veb.a(mac) + " => " + zRegisterServiceProfile + " " + size);
        } else {
            boolean zUnRegisterServiceProfile2 = accessoryManager.unRegisterServiceProfile();
            uml.k(str, "dynamicRegisterProfiles preRole:" + preRole + " PRIMARY-SECONDARY->unRegisterServiceProfile => " + zUnRegisterServiceProfile2);
            boolean zRegisterServiceProfile2 = accessoryManager.registerServiceProfile(z1g.d().c());
            uml.k(str, "dynamicRegisterProfiles preRole:" + preRole + " PRIMARY-SECONDARY->" + veb.a(mac) + " => " + zRegisterServiceProfile2 + " " + size);
        }
        preRole = iIntValue;
    }

    public final int b(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Integer num = roleMap.get(mac);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public final void c() {
        preRole = -1;
    }

    public final void d(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int role = node.getRole();
        Map<String, Integer> map = roleMap;
        String nodeId = node.getNodeId();
        Intrinsics.checkNotNullExpressionValue(nodeId, "node.nodeId");
        map.put(nodeId, Integer.valueOf(role));
    }
}
