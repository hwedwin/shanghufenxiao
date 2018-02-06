package com.payease.scfordermis.bo.responseBo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Created by lch on 2018/1/11.
 */
@ApiModel(value = "商品列表信息",description = "商品信息")
public class RespProductBo {

    @ApiModelProperty(value = "运单详情id（新增，修改订单时有值）",dataType = "long")
    private Long transportOrderDetailId;
    @ApiModelProperty(value = "订单详情id（修改订单时有值）",dataType = "long")
    private Long orderDetailId;
    @ApiModelProperty(value = "主图",dataType = "string")
    private String fPic;
    @ApiModelProperty(value = "商品编码",dataType = "string")
    private String fCode;
    @ApiModelProperty(value = "商品名称",dataType = "string")
    private String productName;
    @ApiModelProperty(value = "规格",dataType = "string")
    private String fName;
    @ApiModelProperty(value = "可用数量（新增，修改订单时有值）",dataType = "string")
    private String quantity;
    @ApiModelProperty(value = "数量（修改订单，查看订单详情时有值）",dataType = "string")
    private String fProductNum;
    @ApiModelProperty(value = "单价",dataType = "string")
    private String fPrice;
    @ApiModelProperty(value = "单位",dataType = "string")
    private String unit;

    public Long getTransportOrderDetailId() {
        return transportOrderDetailId;
    }

    public void setTransportOrderDetailId(Long transportOrderDetailId) {
        this.transportOrderDetailId = transportOrderDetailId;
    }

    public Long getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getfPic() {
        return fPic;
    }

    public void setfPic(String fPic) {
        this.fPic = fPic;
    }

    public String getfCode() {
        return fCode;
    }

    public void setfCode(String fCode) {
        this.fCode = fCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getfProductNum() {
        return fProductNum;
    }

    public void setfProductNum(String fProductNum) {
        this.fProductNum = fProductNum;
    }

    public String getfPrice() {
        return fPrice;
    }

    public void setfPrice(String fPrice) {
        this.fPrice = fPrice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}