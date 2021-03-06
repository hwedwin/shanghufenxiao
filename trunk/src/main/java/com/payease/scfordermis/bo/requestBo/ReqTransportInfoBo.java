package com.payease.scfordermis.bo.requestBo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by YHF on 2018/1/12.
 */
@ApiModel(value = "运单详情请求运输信息参数实体类",description = "运单详情请求运输信息参数实体类")
public class ReqTransportInfoBo {
    @ApiModelProperty(value = "运单id",required = true)
    private String transportId;
    @ApiModelProperty(value = "运输车辆",required = true)
    private String carNum;
    @ApiModelProperty(value = "司机",required = true)
    private String driverName;
    @ApiModelProperty(value = "手机号",required = true)
    private String driverPhone;
    @ApiModelProperty(value = "运单状态",required = true)
    private String transportStatus;

    public String getTransportStatus() {
        return transportStatus;
    }

    public void setTransportStatus(String transportStatus) {
        this.transportStatus = transportStatus;
    }

    public String getTransportId() {
        return transportId;
    }

    public void setTransportId(String transportId) {
        this.transportId = transportId;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }
}
