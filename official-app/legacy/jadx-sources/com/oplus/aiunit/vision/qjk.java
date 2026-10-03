package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.watchface.R$string;
import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;
import com.heytap.health.watchface.business.store.installer.bean.WfStatusBean;
import com.heytap.health.watchface.network.bean.WatchFaceHomeCard;
import com.heytap.health.watchface.utils.GenerateAdaptUtil;
import com.heytap.theme.watch.domain.dto.response.AppTagDto;
import com.heytap.theme.watch.domain.dto.response.ProductItemListDto;
import com.heytap.theme.watch.domain.dto.response.ThemewPicDto;
import com.heytap.theme.watch.domain.dto.response.ThemewProductItemDto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class qjk extends i51<ProductItemListDto> {
    public static final String TAG = "UpdateListPresenter";
    public Map<String, String> u = new HashMap();

    @NonNull
    public static List<WatchFaceHomeCard.Item.AodPreviewPic> N0(ThemewProductItemDto themewProductItemDto) {
        ArrayList arrayList = new ArrayList();
        List<ThemewPicDto> aodPreviewPicList = themewProductItemDto.getAodPreviewPicList();
        if (aodPreviewPicList != null) {
            for (ThemewPicDto themewPicDto : aodPreviewPicList) {
                WatchFaceHomeCard.Item.AodPreviewPic aodPreviewPic = new WatchFaceHomeCard.Item.AodPreviewPic();
                aodPreviewPic.setPicType(themewPicDto.getPicType());
                aodPreviewPic.setId(themewPicDto.getId());
                aodPreviewPic.setHeight(themewPicDto.getHeight());
                aodPreviewPic.setWidth(themewPicDto.getWidth());
                aodPreviewPic.setUrl(themewPicDto.getUrl());
                arrayList.add(aodPreviewPic);
            }
        }
        return arrayList;
    }

    @NonNull
    public static List<WatchFaceHomeCard.Item.AppTag> O0(ThemewProductItemDto themewProductItemDto) {
        ArrayList arrayList = new ArrayList();
        List<AppTagDto> appTagList = themewProductItemDto.getAppTagList();
        if (appTagList != null) {
            for (AppTagDto appTagDto : appTagList) {
                WatchFaceHomeCard.Item.AppTag appTag = new WatchFaceHomeCard.Item.AppTag();
                appTag.setType(appTagDto.getType().intValue());
                appTag.setName(appTagDto.getName());
                arrayList.add(appTag);
            }
        }
        return arrayList;
    }

    @Override // com.oplus.aiunit.vision.i51
    public void I0(int i, int i2, coi coiVar) {
        ltl.a(TAG, "updateAppliedStatus currentPos " + i2 + " position " + i + " info " + coiVar);
        if (coiVar.b().c() == 4) {
            Q0(i);
        }
    }

    @Override // com.oplus.aiunit.vision.i51
    public void J0(coi coiVar, WfStatusBean wfStatusBean, int i, int i2) {
        ltl.a(TAG, "updateItemStatus currentPos " + i + " position " + i2 + " info " + coiVar);
        x72 x72VarB = coiVar.b();
        int status = wfStatusBean.getStatus();
        x72VarB.h(wfStatusBean.getProcess());
        String strS = coiVar.s();
        if (status == 6 && i0(strS)) {
            Q0(i2);
        } else {
            super.J0(coiVar, wfStatusBean, i, i2);
        }
    }

    @Override // com.oplus.aiunit.vision.s41
    public lbd<ProductItemListDto> M(uo9 uo9Var, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        List<BaseWatchFaceBean> listF = GenerateAdaptUtil.INSTANCE.f(this.f13600n);
        if (listF != null) {
            this.u.clear();
            for (BaseWatchFaceBean baseWatchFaceBean : listF) {
                String wfUnique = baseWatchFaceBean.getWfUnique();
                String wfVersion = baseWatchFaceBean.getWfVersion();
                if (!baseWatchFaceBean.isCreationWf() && !baseWatchFaceBean.isHidden()) {
                    arrayList.add(vrl.a(wfUnique, wfVersion));
                    this.u.put(wfUnique, wfVersion);
                }
            }
        }
        ltl.a(TAG, "[queryListObservable] appImpInfos " + arrayList);
        return uo9Var.d(arrayList);
    }

    @Override // com.oplus.aiunit.vision.s41
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public guf<o41> G(ProductItemListDto productItemListDto) {
        if (productItemListDto == null) {
            return null;
        }
        List<ThemewProductItemDto> items = productItemListDto.getItems();
        ArrayList arrayList = new ArrayList();
        if (items != null) {
            ArrayList arrayList2 = new ArrayList();
            for (ThemewProductItemDto themewProductItemDto : items) {
                if (WatchFaceHomeCard.Item.isWfOnline(themewProductItemDto.getStatus())) {
                    String pkgNameMd5 = themewProductItemDto.getPkgNameMd5();
                    String str = this.u.get(pkgNameMd5);
                    if (TextUtils.isEmpty(str)) {
                        ltl.a(TAG, "not find versionKey, wfUnique:" + pkgNameMd5);
                    } else {
                        int iB = vrl.b(str);
                        if (iB < themewProductItemDto.getVersionCode()) {
                            ltl.a(TAG, "currentVersion " + iB + " cloudVersionCode " + themewProductItemDto.getVersionCode() + " itemDto" + themewProductItemDto.getPkgName() + " pkgNameMd5 " + pkgNameMd5);
                            coi coiVar = new coi();
                            coiVar.y(themewProductItemDto.getMasterId());
                            coiVar.L(themewProductItemDto.getVersionId());
                            coiVar.M(themewProductItemDto.getAppName());
                            coiVar.N(themewProductItemDto.getPkgNameMd5());
                            coiVar.H((long) ((int) themewProductItemDto.getFileSize()));
                            coiVar.K(themewProductItemDto.getVersionCode());
                            coiVar.B(themewProductItemDto.getThumbnailPic());
                            coiVar.I(themewProductItemDto.getFileSizeDesc());
                            coiVar.x(themewProductItemDto.getJumpUrl());
                            coiVar.A(themewProductItemDto.getPay());
                            x72 x72Var = new x72(1);
                            x72Var.g(R$string.watch_face_install_update);
                            coiVar.v(x72Var);
                            coiVar.w(P0(themewProductItemDto));
                            arrayList.add(coiVar);
                            arrayList2.add(pkgNameMd5);
                        }
                    }
                } else {
                    ltl.i(TAG, "is not online wf:" + themewProductItemDto.getPkgName());
                }
            }
            pjk.d(this.f13600n, GsonUtil.e(arrayList2));
        }
        return new guf<>(true, arrayList);
    }

    public final WatchFaceHomeCard.Item P0(ThemewProductItemDto themewProductItemDto) {
        WatchFaceHomeCard.Item item = new WatchFaceHomeCard.Item();
        item.setMasterId(themewProductItemDto.getMasterId());
        item.setVersionId(themewProductItemDto.getVersionId());
        item.setAppName(themewProductItemDto.getAppName());
        item.setPay(themewProductItemDto.getPay());
        item.setAodPreviewPicList(N0(themewProductItemDto));
        item.setDetailDesc(themewProductItemDto.getDetailDesc());
        item.setDevId(themewProductItemDto.getDevId());
        item.setDevName(themewProductItemDto.getDevName());
        item.setFileSizeDesc(themewProductItemDto.getFileSizeDesc());
        item.setDownloadNumDesc(themewProductItemDto.getDownloadNumDesc());
        item.setThumbnailPic(themewProductItemDto.getThumbnailPic());
        item.setAppTagList(O0(themewProductItemDto));
        return item;
    }

    public final void Q0(int i) {
        ltl.a(TAG, "removeItem " + i);
        List<o41> listE0 = e0();
        if (listE0 != null) {
            listE0.remove(listE0.get(i));
            A0(i);
        }
    }

    @Override // com.oplus.aiunit.vision.i51
    public x72 d0(coi coiVar) {
        return new x72(1, R$string.watch_face_install_update);
    }
}
