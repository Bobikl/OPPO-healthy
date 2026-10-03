package com.heytap.store.apm;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.heytap.store.apm.util.DataReportUtilKt;
import com.heytap.store.business.rn.service.RnConstant;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes19.dex */
public class PageTracker implements IPageTrack {
    private String errorPageMsg;
    private boolean errorPageReport;
    private int firstLayoutIvCount;
    private int firstLayoutTvCount;
    private int fistLayoutViewCount;
    private boolean isBusinessViewLayout;
    private int ivCount;
    private String pageName;
    PageTrackBean pageTrackBean;
    private int tvCount;
    WeakReference<ViewGroup> viewRefer;
    private final String TAG = "PageTracker";
    private Handler handler = new Handler();
    private boolean isFirstLayout = true;
    private Long appId = 0L;
    private Runnable timeTask = new a();
    private ViewTreeObserver.OnGlobalLayoutListener layoutChangeListener = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PageTracker.this.isBusinessViewLayout) {
                return;
            }
            if (ApmClient.logEnable) {
                Log.d("PageTracker", "track page time out:" + PageTracker.this.pageName);
            }
            PageTracker.this.savePageStus(0);
            DataReportUtilKt.reportPageEvent(PageTracker.this.pageTrackBean);
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ApmClient.logEnable) {
                Log.d("PageTracker", "onGlobalLayout " + PageTracker.this.pageName);
            }
            PageTracker pageTracker = PageTracker.this;
            pageTracker.traverseViewExposure(pageTracker.viewRefer.get());
        }
    }

    public PageTracker(Activity activity) {
        View viewFindViewById = activity.findViewById(android.R.id.content);
        this.pageName = activity.getClass().getSimpleName();
        String stringExtra = activity.getIntent().getStringExtra(RnConstant.KEY_COMPONENT_NAME);
        if (!TextUtils.isEmpty(stringExtra)) {
            this.pageName = stringExtra;
        }
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(this.layoutChangeListener);
        this.viewRefer = new WeakReference<>(viewFindViewById);
        IDataPoolHandleImpl.getInstance().removeTrackModel(this.pageName);
        this.pageTrackBean = IDataPoolHandleImpl.getInstance().getPageTrackModel(this.pageName);
    }

    private boolean isViewInvisible(View view) {
        if (view.getVisibility() != 0) {
            return false;
        }
        if (view.getParent() == null || !(view.getParent() instanceof View)) {
            return true;
        }
        return isViewInvisible((View) view.getParent());
    }

    private boolean matchErrorKey(String str) {
        Iterator<String> it = ApmClient.apmConfig.getErrorKey().iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void savePageStus(int i) {
        this.pageTrackBean.setStatus(i);
    }

    @Override // com.heytap.store.apm.IPageTrack
    public void exit() {
        if (ApmClient.logEnable) {
            Log.d("PageTracker", "removeCallbacks " + this.pageName);
        }
        this.handler.removeCallbacks(this.timeTask);
        WeakReference<ViewGroup> weakReference = this.viewRefer;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.viewRefer.get().getViewTreeObserver().removeOnGlobalLayoutListener(this.layoutChangeListener);
        this.viewRefer.clear();
    }

    public PageTrackBean getPageTrackBean() {
        return this.pageTrackBean;
    }

    public void setAppId(Long l2) {
        this.appId = l2;
    }

    @Override // com.heytap.store.apm.IPageTrack
    public void start() {
    }

    @Override // com.heytap.store.apm.IPageTrack
    public void traverseViewExposure(ViewGroup viewGroup) {
        if (ApmClient.logEnable) {
            Log.d("PageTracker", "start traverseViewExposure " + this.pageName);
        }
        if (viewGroup == null) {
            return;
        }
        this.tvCount = 0;
        this.ivCount = 0;
        LinkedList linkedList = new LinkedList();
        linkedList.add(viewGroup);
        int i = 0;
        boolean zIsViewInvisible = false;
        while (!linkedList.isEmpty()) {
            ViewGroup viewGroup2 = (ViewGroup) linkedList.removeFirst();
            i++;
            for (int i2 = 0; i2 < viewGroup2.getChildCount(); i2++) {
                View childAt = viewGroup2.getChildAt(i2);
                if (childAt instanceof ViewGroup) {
                    linkedList.addLast((ViewGroup) childAt);
                } else {
                    i++;
                    if ((childAt instanceof TextView) && childAt.getVisibility() == 0) {
                        if (this.isFirstLayout) {
                            this.firstLayoutTvCount++;
                        } else {
                            String string = ((TextView) childAt).getText().toString();
                            if (!TextUtils.isEmpty(string) && string.length() < 15 && matchErrorKey(string)) {
                                zIsViewInvisible |= isViewInvisible(childAt);
                                this.errorPageMsg = string;
                                Log.d("PageTracker", "get eeror page: " + string);
                            }
                        }
                        this.tvCount++;
                    } else if ((childAt instanceof ImageView) && childAt.getVisibility() == 0) {
                        if (this.isFirstLayout) {
                            this.firstLayoutIvCount++;
                        }
                        this.ivCount++;
                    }
                }
            }
        }
        if (ApmClient.logEnable) {
            Log.d("PageTracker", this.pageName + " hasLoadingView:" + zIsViewInvisible);
            Log.d("PageTracker", "getViewsCount " + i + ",textViewsCount " + this.tvCount + ",imageViewsCount " + this.ivCount + ",firstLayoutIvCount" + this.firstLayoutIvCount + ",firstLayoutTvCount " + this.firstLayoutTvCount);
        }
        if (this.isFirstLayout) {
            this.fistLayoutViewCount = i;
            this.isFirstLayout = false;
        } else {
            int i3 = this.ivCount - this.firstLayoutIvCount;
            int i4 = this.tvCount;
            int i5 = i4 - this.firstLayoutTvCount;
            boolean z = i - this.fistLayoutViewCount > 10;
            boolean z2 = i3 > 5 || i5 > 5;
            boolean z3 = i4 > 10;
            if (((z && z2) || z3) && !zIsViewInvisible) {
                this.isBusinessViewLayout = true;
                if (ApmClient.logEnable) {
                    Log.d("PageTracker", "has business views " + this.pageName);
                }
            }
        }
        if (TextUtils.isEmpty(this.errorPageMsg) || this.errorPageReport) {
            return;
        }
        this.errorPageReport = true;
        this.pageTrackBean.setPageErrorMgs(this.errorPageMsg);
        DataReportUtilKt.reportPageEvent(this.appId.longValue(), this.pageTrackBean);
    }

    public PageTracker(String str, View view) {
        this.pageName = str;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.layoutChangeListener);
        this.viewRefer = new WeakReference<>(view);
        IDataPoolHandleImpl.getInstance().removeTrackModel(str);
        this.pageTrackBean = IDataPoolHandleImpl.getInstance().getPageTrackModel(str);
    }
}
