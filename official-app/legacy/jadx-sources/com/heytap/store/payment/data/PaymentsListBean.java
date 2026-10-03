package com.heytap.store.payment.data;

import com.heytap.store.base.core.util.DisplayUtil;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class PaymentsListBean implements Serializable {
    private List<DetailsBean> details;
    private MetaBean meta;
    private OtherParamsFromBean others;

    public static class DetailsBean implements Serializable {
        private String endTime;
        public boolean executeNewPlan;
        public String experimentGroupId;
        private int isContinuePay;
        private String nowTime;
        public boolean orderDetailExecuteNewPlan;
        private OrderDetailFormBean orderDetailForm;
        public OrderRetainForm orderRetainForm;
        private List<PaymentListFormBean> paymentListForm;
        public boolean quickBuyExecuteNewPlan = true;
        private double secondFee;
        private double totalAmount;

        public static class OrderDetailFormBean implements Serializable {
            private String address;
            private String city;
            private String district;
            private List<GoodsListBean> goodsList;
            private String mobile;
            private String province;
            private String receiveName;
            private String shippingName;
            private String shopAddress;
            private String shopName;
            private String shopPhone;

            public static class GoodsListBean implements Serializable {
                private List<String> addGoodsNames;
                private List<String> giftGoodsNames;
                private String goodsName;
                private int mainGoodsSkuId;
                private List<String> serviceNames;

                public List<String> getAddGoodsNames() {
                    return this.addGoodsNames;
                }

                public List<String> getGiftGoodsNames() {
                    return this.giftGoodsNames;
                }

                public String getGoodsName() {
                    return this.goodsName;
                }

                public int getMainGoodsSkuId() {
                    return this.mainGoodsSkuId;
                }

                public List<String> getServiceNames() {
                    return this.serviceNames;
                }

                public void setAddGoodsNames(List<String> list) {
                    this.addGoodsNames = list;
                }

                public void setGiftGoodsNames(List<String> list) {
                    this.giftGoodsNames = list;
                }

                public void setGoodsName(String str) {
                    this.goodsName = str;
                }

                public void setMainGoodsSkuId(int i) {
                    this.mainGoodsSkuId = i;
                }

                public void setServiceNames(List<String> list) {
                    this.serviceNames = list;
                }

                public String toString() {
                    return "GoodsListBean{goodsName='" + this.goodsName + "', mainGoodsSkuId=" + this.mainGoodsSkuId + ", addGoodsNames=" + this.addGoodsNames + ", serviceNames=" + this.serviceNames + ", giftGoodsNames=" + this.giftGoodsNames + '}';
                }
            }

            public String getAddress() {
                return this.address;
            }

            public String getCity() {
                return this.city;
            }

            public String getDistrict() {
                return this.district;
            }

            public List<GoodsListBean> getGoodsList() {
                return this.goodsList;
            }

            public String getMobile() {
                return this.mobile;
            }

            public String getProvince() {
                return this.province;
            }

            public String getReceiveName() {
                return this.receiveName;
            }

            public String getShippingName() {
                return this.shippingName;
            }

            public String getShopAddress() {
                return this.shopAddress;
            }

            public String getShopName() {
                return this.shopName;
            }

            public String getShopPhone() {
                return this.shopPhone;
            }

            public void setAddress(String str) {
                this.address = str;
            }

            public void setCity(String str) {
                this.city = str;
            }

            public void setDistrict(String str) {
                this.district = str;
            }

            public void setGoodsList(List<GoodsListBean> list) {
                this.goodsList = list;
            }

            public void setMobile(String str) {
                this.mobile = str;
            }

            public void setProvince(String str) {
                this.province = str;
            }

            public void setReceiveName(String str) {
                this.receiveName = str;
            }

            public void setShippingName(String str) {
                this.shippingName = str;
            }

            public void setShopAddress(String str) {
                this.shopAddress = str;
            }

            public void setShopName(String str) {
                this.shopName = str;
            }

            public void setShopPhone(String str) {
                this.shopPhone = str;
            }

            public String toString() {
                return "OrderDetailFormBean{receiveName='" + this.receiveName + "', mobile='" + this.mobile + "', province='" + this.province + "', city='" + this.city + "', district='" + this.district + "', address='" + this.address + "', shopPhone='" + this.shopPhone + "', shopName='" + this.shopName + "', shippingName='" + this.shippingName + "', shopAddress='" + this.shopAddress + "', goodsList=" + this.goodsList + '}';
            }
        }

        public static class PaymentListFormBean implements Serializable {
            public String accountStatus;
            public List<ActivityRule> activityRule;
            private double amount;
            private double availableCredit;
            private List<FenQiParamsFormBean> fenQiParamsForm;
            private double firstFee;
            public Group group;
            private double groupPayPercent;
            public String heytapStatus;
            public String jumpUrl;
            private String label;
            private String paymentCode;
            public String paymentDisplayLogo;
            public String paymentDisplayName;
            private int priority;
            public RecommendationBean recommendation;
            public HeytapSdkForm sdk;
            public boolean selected;
            private String slogan;
            private List<FenQiParamsFormBean> sxhParamsForm;
            public int minHeight = DisplayUtil.dip2px(48.0f);
            public boolean enable = true;

            public static class FenQiParamsFormBean implements Serializable {
                private double eachFee;
                private double eachRate;
                private int fqType;
                private int isFree;
                public String perDayAmount;
                private String qiShu;
                public boolean selected;
                private int sxh;
                private double totalFee;
                private int type;
                private String typeName;
                public String unionUrl;

                public double getEachFee() {
                    return this.eachFee;
                }

                public double getEachRate() {
                    return this.eachRate;
                }

                public int getFqType() {
                    return this.fqType;
                }

                public int getIsFree() {
                    return this.isFree;
                }

                public String getQiShu() {
                    return this.qiShu;
                }

                public int getSxh() {
                    return this.sxh;
                }

                public double getTotalFee() {
                    return this.totalFee;
                }

                public int getType() {
                    return this.type;
                }

                public String getTypeName() {
                    return this.typeName;
                }

                public void setEachFee(double d) {
                    this.eachFee = d;
                }

                public void setEachRate(double d) {
                    this.eachRate = d;
                }

                public void setFqType(int i) {
                    this.fqType = i;
                }

                public void setIsFree(int i) {
                    this.isFree = i;
                }

                public void setQiShu(String str) {
                    this.qiShu = str;
                }

                public void setSxh(int i) {
                    this.sxh = i;
                }

                public void setTotalFee(double d) {
                    this.totalFee = d;
                }

                public void setType(int i) {
                    this.type = i;
                }

                public void setTypeName(String str) {
                    this.typeName = str;
                }

                public String toString() {
                    return "FenQiParamsFormBean{eachFee=" + this.eachFee + ", eachRate=" + this.eachRate + ", isFree=" + this.isFree + ", qiShu='" + this.qiShu + "', totalFee=" + this.totalFee + ", type=" + this.type + ", typeName='" + this.typeName + "', sxh=" + this.sxh + '}';
                }
            }

            public static class Group implements Serializable {
                public String name;
                public int priority;
            }

            public static class RecommendationBean implements Serializable {
                public List<String> payMethod;
            }

            public double getAmount() {
                return this.amount;
            }

            public double getAvailableCredit() {
                return this.availableCredit;
            }

            public List<FenQiParamsFormBean> getFenQiParamsForm() {
                return this.fenQiParamsForm;
            }

            public double getFirstFee() {
                return this.firstFee;
            }

            public double getGroupPayPercent() {
                return this.groupPayPercent;
            }

            public String getLabel() {
                return this.label;
            }

            public String getPaymentCode() {
                return this.paymentCode;
            }

            public int getPriority() {
                return this.priority;
            }

            public RecommendationBean getRecommendation() {
                return this.recommendation;
            }

            public String getSlogan() {
                return this.slogan;
            }

            public List<FenQiParamsFormBean> getSxhParamsForm() {
                return this.sxhParamsForm;
            }

            public void setAmount(double d) {
                this.amount = d;
            }

            public void setAvailableCredit(double d) {
                this.availableCredit = d;
            }

            public void setFenQiParamsForm(List<FenQiParamsFormBean> list) {
                this.fenQiParamsForm = list;
            }

            public void setFirstFee(double d) {
                this.firstFee = d;
            }

            public void setGroupPayPercent(double d) {
                this.groupPayPercent = d;
            }

            public void setLabel(String str) {
                this.label = str;
            }

            public void setPaymentCode(String str) {
                this.paymentCode = str;
            }

            public void setPriority(int i) {
                this.priority = i;
            }

            public void setRecommendation(RecommendationBean recommendationBean) {
                this.recommendation = recommendationBean;
            }

            public void setSlogan(String str) {
                this.slogan = str;
            }

            public void setSxhParamsForm(List<FenQiParamsFormBean> list) {
                this.sxhParamsForm = list;
            }

            public String toString() {
                return "PaymentListFormBean{paymentCode='" + this.paymentCode + "', label='" + this.label + "', amount=" + this.amount + ", firstFee=" + this.firstFee + ", availableCredit=" + this.availableCredit + ", groupPayPercent=" + this.groupPayPercent + ", priority=" + this.priority + ", slogan='" + this.slogan + "', fenQiParamsForm=" + this.fenQiParamsForm + ", sxhParamsForm=" + this.sxhParamsForm + '}';
            }
        }

        public String getEndTime() {
            return this.endTime;
        }

        public int getIsContinuePay() {
            return this.isContinuePay;
        }

        public String getNowTime() {
            return this.nowTime;
        }

        public OrderDetailFormBean getOrderDetailForm() {
            return this.orderDetailForm;
        }

        public List<PaymentListFormBean> getPaymentListForm() {
            return this.paymentListForm;
        }

        public double getSecondFee() {
            return this.secondFee;
        }

        public double getTotalAmount() {
            return this.totalAmount;
        }

        public void setEndTime(String str) {
            this.endTime = str;
        }

        public void setIsContinuePay(int i) {
            this.isContinuePay = i;
        }

        public void setNowTime(String str) {
            this.nowTime = str;
        }

        public void setOrderDetailForm(OrderDetailFormBean orderDetailFormBean) {
            this.orderDetailForm = orderDetailFormBean;
        }

        public void setPaymentListForm(List<PaymentListFormBean> list) {
            this.paymentListForm = list;
        }

        public void setSecondFee(double d) {
            this.secondFee = d;
        }

        public void setTotalAmount(double d) {
            this.totalAmount = d;
        }

        public String toString() {
            return "DetailsBean{endTime='" + this.endTime + "', orderDetailForm=" + this.orderDetailForm + ", isContinuePay=" + this.isContinuePay + ", nowTime='" + this.nowTime + "', secondFee=" + this.secondFee + ", totalAmount=" + this.totalAmount + ", paymentListForm=" + this.paymentListForm + '}';
        }
    }

    public static class MetaBean implements Serializable {
        private int code;
        private String errorMessage;
        private String errorType;

        public int getCode() {
            return this.code;
        }

        public String getErrorMessage() {
            return this.errorMessage;
        }

        public String getErrorType() {
            return this.errorType;
        }

        public void setCode(int i) {
            this.code = i;
        }

        public void setErrorMessage(String str) {
            this.errorMessage = str;
        }

        public void setErrorType(String str) {
            this.errorType = str;
        }

        public String toString() {
            return "MetaBean{code=" + this.code + ", errorMessage='" + this.errorMessage + "', errorType='" + this.errorType + "'}";
        }
    }

    public static class OtherParamsFromBean implements Serializable {
        public String huabeiTipsButtonUrl;
        public String huabeiTipsPic;

        public String getHuabeiTipsButtonUrl() {
            return this.huabeiTipsButtonUrl;
        }

        public String getHuabeiTipsPic() {
            return this.huabeiTipsPic;
        }

        public void setHuabeiTipsButtonUrl(String str) {
            this.huabeiTipsButtonUrl = str;
        }

        public void setHuabeiTipsPic(String str) {
            this.huabeiTipsPic = str;
        }
    }

    public List<DetailsBean> getDetails() {
        return this.details;
    }

    public MetaBean getMeta() {
        return this.meta;
    }

    public OtherParamsFromBean getOtherParams() {
        return this.others;
    }

    public void setDetails(List<DetailsBean> list) {
        this.details = list;
    }

    public void setMeta(MetaBean metaBean) {
        this.meta = metaBean;
    }

    public void setOtherParams(OtherParamsFromBean otherParamsFromBean) {
        this.others = otherParamsFromBean;
    }

    public String toString() {
        return "PaymentsListBean{meta=" + this.meta + ", details=" + this.details + '}';
    }
}
