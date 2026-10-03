package com.lifesense.device.scale.application.interfaces;

import com.lifesense.android.bluetooth.core.bean.constant.DeviceConnectState;
import com.lifesense.device.scale.application.interfaces.callback.BindResultCallback;
import com.lifesense.device.scale.application.interfaces.callback.OnResultCallback;
import com.lifesense.device.scale.application.interfaces.callback.SearchResultCallback;
import com.lifesense.device.scale.constant.PairRandomStatus;
import com.lifesense.device.scale.device.dto.device.LSEDeviceInfo;
import com.lifesense.device.scale.device.product.DisplayProduct;
import com.lifesense.device.scale.device.product.GetProductListRespond;
import com.lifesense.device.scale.infrastructure.entity.Device;
import com.lifesense.weidong.lzsimplenetlibs.net.callback.IRequestCallBack;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface ILZDeviceBindService extends ILZDeviceSyncService {
    void bindDeviceBySearchResult(LSEDeviceInfo lSEDeviceInfo, BindResultCallback bindResultCallback);

    List<Device> getBondedDevices();

    void getProduct(String str, IRequestCallBack<GetProductListRespond> iRequestCallBack);

    void getProductByModel(String str, IRequestCallBack<DisplayProduct> iRequestCallBack);

    PairRandomStatus inputCode(String str, String str2);

    void interruptBindDevice(LSEDeviceInfo lSEDeviceInfo);

    DeviceConnectState queryConnectState(String str);

    void searchDevice(DisplayProduct displayProduct, SearchResultCallback searchResultCallback);

    void stopSearch();

    void unBindDevice(String str, OnResultCallback onResultCallback);
}
