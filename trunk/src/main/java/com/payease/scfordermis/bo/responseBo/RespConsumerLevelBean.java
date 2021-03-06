package com.payease.scfordermis.bo.responseBo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by admin on 2018/1/11.
 */
@ApiModel(value = "客户级别实体",description = "客户级别实体")
public class RespConsumerLevelBean  extends  PageBean{

    @ApiModelProperty(value = "主键id",dataType = "String",required = true)
    private  String  fId;

    @ApiModelProperty(value = "客户级别名称",dataType = "String",required = true)
    private  String  fName;

    @ApiModelProperty(value = "折扣",dataType = "String",required = true)
    private  String  fDiscount;

    @ApiModelProperty(value = "创建时间",dataType = "String",required = true)
    private  String  fCreateTime;

    @ApiModelProperty(value = "更新时间",dataType = "String",required = true)
    private  String  fUpdateTime;

    @ApiModelProperty(value = "操作人",dataType = "String",required = true)
    private  String  fOperate;

    @ApiModelProperty(value = "公司id",dataType = "String",required = true)
    private  String  fCompanyId;


    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfDiscount() {
        return fDiscount;
    }

    public void setfDiscount(String fDiscount) {
        this.fDiscount = fDiscount;
    }

    public String getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(String fCreateTime) {
        this.fCreateTime = fCreateTime;
    }

    public String getfUpdateTime() {
        return fUpdateTime;
    }

    public void setfUpdateTime(String fUpdateTime) {
        this.fUpdateTime = fUpdateTime;
    }

    public String getfOperate() {
        return fOperate;
    }

    public void setfOperate(String fOperate) {
        this.fOperate = fOperate;
    }

    public String getfCompanyId() {
        return fCompanyId;
    }

    public void setfCompanyId(String fCompanyId) {
        this.fCompanyId = fCompanyId;
    }
}
