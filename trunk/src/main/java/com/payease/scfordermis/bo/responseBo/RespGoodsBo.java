package com.payease.scfordermis.bo.responseBo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by YHF on 2018/1/11.
 */
@ApiModel(value = "商品返回实体类",description = "商品返回实体类")
public class RespGoodsBo {
    @ApiModelProperty(value = "商品编码")
    private String fCode;  //商品编码
    @ApiModelProperty(value = "商品名称")
    private String fName;  //商品名称
    @ApiModelProperty(value = "规格名称")
    private String formatName ;//规格名称
    @ApiModelProperty(value = "商品id")
    private String fProductId;
    @ApiModelProperty(value = "商品规格id")
    private String fProductFormatId;
    @ApiModelProperty(value = "商品图片url")
    private String fPicUrl;
    @ApiModelProperty(value = "商品单位")
    private String fUnit;
    @ApiModelProperty(value = "商品单位id")
    private String fUnitId;

    public String getfUnitId() {
        return fUnitId;
    }

    public void setfUnitId(String fUnitId) {
        this.fUnitId = fUnitId;
    }

    public String getfUnit() {
        return fUnit;
    }

    public void setfUnit(String fUnit) {
        this.fUnit = fUnit;
    }

    public String getfPicUrl() {
        return fPicUrl;
    }

    public void setfPicUrl(String fPicUrl) {
        this.fPicUrl = fPicUrl;
    }

    public String getfProductId() {
        return fProductId;
    }

    public void setfProductId(String fProductId) {
        this.fProductId = fProductId;
    }

    public String getfProductFormatId() {
        return fProductFormatId;
    }

    public void setfProductFormatId(String fProductFormatId) {
        this.fProductFormatId = fProductFormatId;
    }

    public String getfCode() {
        return fCode;
    }

    public void setfCode(String fCode) {
        this.fCode = fCode;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getFormatName() {
        return formatName;
    }

    public void setFormatName(String formatName) {
        this.formatName = formatName;
    }
}
