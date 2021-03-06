package com.payease.scfordermis.bean;

/**
 * Created by zhangzhili on 2018/1/5.
 * 返回状态码自定义类
 * ps：注意codeId值是 int 类型 状态码别太长
 */
public enum Status {

    SUCCESS(0, "OK"), FAIL(1, "fail"),QUERYERROR(-1,"请求参数异常"),TIMEOUT(-2,"登录已失效"),
    GOODSCATEFAIL(1001,"该商品分类下已有商品，请修改商品所属分类后再进行删除操作！"),GOODSCATEREPEAT(1002,"分类名称不能重复"),GOODUNITREOEAT(1003,"计量单位名称不能重复")
    ,GOODUNITFAIL(1004,"已有商品使用该计量单位，不能删除"),GOODNAMEREPEAT(1005,"商品名称不能重复"),FORMARTDELETE(1006,"该商品已经发生订单，不能删除"), GOODFORMATNORE(1007,"商品编码不能重复"),
    TRANSPORTFAIL(1008,"已有运单使用该计量单位，不能删除"),
    UPDATEFAIL(9001,"更新时数据库中值有变化，更新失败！"),CHECKISNULL(2001,"获取参数失败"),CHECKACCOUNTSTATUS(2002,"账号获取失败"),
    CHECKPWDERROR(2003,"密码错误"),CHECKPWDNULL(2004,"密码未填"),CHECKROLEIDISNULL(2005,"角色id获取失败"),CHECKROLEINFOERROR(2006,"角色信息获取权限失败"),
    CHECKDEPARTMENTINFOERROR(2007,"部门id查询异常"),SAVEPWDERROR(2008,"密码重设异常"),SAVEACCINFOERROR(2009,"用户修改信息"),COMPANYINFOERRO(2010,"公司信息获取失败"),
    SAVECOMINFOERROR(2011,"公司信息保存失败"),APPLOGINERROR(3001,"登录app端获取账号失败"),APPAUTOLOGINERROR(3002,"自动获取登录app端失败"),APPLOGOUT(3003,"登出app端账号异常"),PICKCODE(4001,"二维码失效"),
    MSGCODEERROR(4001,"短信验证码错误"),CONSUMERISNULL(4002,"app账号获取失败"),MSGUSECASE(4003,"发送场景类型不正确"),MSGPHONEISNOTFORGOODS(4004,"该手机号未查到待提货订单"),MSGPHONESTATUSERROR(4005,"该手机号状态异常"),
    GETCONSUMERMSG(5000,"此客户消息查询失败"),GETEMPINFO(5001,"此员工信息查询失败"),ACCOUNTREPEAT(5002,"登录账号重复"),
    SAVEEMPFAIL(5003,"新增员工账号异常"),EMPSTATUSERROR(5004,"该用户已启用状态不能执行删除"),DEPONEREPEAT(5005,"一级部门名称重复"),DEPREPEAT(5006,"部门名称重复"),GETDEP(5007,"未查询到该部门"),
    DEPONEISTWO(5008,"该部门含有子部门"),ROLENAMEISADMIN(5009,"角色名称不允许是系统管理员"),ROLENAMEREPEAT(5010,"角色名称重复"),GETROLEINFO(5011,"未查询到该角色信息"),
    UPDROLENAMEISADMIN(5012,"系统管理员角色不允许改名"), AREAONEREPEAT(5013,"一级地区名称重复"),AREAREPEAT(5014,"地区名称重复"),GETAREA(5015,"未查询到该地区"), AREAONEISTWO(5016,"该地区含有子地区"),
    CUSTOMERNAMEALREADYEXISTS(5016,"客户名已存在"),CUSTOMERIDCANNOTBEEMPTY(5017,"客户id不能为空"),NOQUALIFIEDVALUE(5018,"无符合条件的值"),THISCOMPANYCUSTOMERLEVELWASNOTFOUND(5019,"未查到此公司客户级别"),
    COMPANYIDCANNOTBEEMPTY(5019,"公司id不能为空"),CUSTOMERLEVELNAMEALREADYEXISTS(5020,"客户级别名称已存在"),CUSTOMERLEVELCANNOTBEEMPTY(5021,"客户级别不能为空"),CUSTOMERLEVELIDCANNOTBEEMPTY(5022,"客户级别id不能为空"),
    DRIVERLOGERROR(6001,"司机端登录失败"),JSONMENUPARSEERROR(6002,"菜单对象解析错误"),ACCSTATUSERROR(6003,"账号状态异常"),EMPLOYEEROLEERROR(6004,"员工角色权限获取失败"),CHECKROLEIDERROR(6005,"角色关系获取失败"),LOGOUTERROR(6006,"退出失败"),
    DRIMSGCODE(6007,"司机端验证码获取失败"),DRIMSGCODEERR(6008,"司机端验证码异常"),DIRLOGINISNULL(6009,"司机端登录账号查找失败"),ORDERSTATUSERR(6010,"订单状态错误"),TOKENISNULL(6011,"token不存在"),DIRLOGOUTERR(6012,"司机端退出失败"),
    CHECKOLDPWDISNULL(6013,"原密码未获取到"),CHECKNEWPWDISNULL(6014,"新密码未获取到"),SETCHECKERROR(6015,"原密码错误"),ACCIDISNULL(6016,"账号id获取失败"),CHECKACCIDERR(6017,"检查账号id不一致"),CHECKACCERROR(6018,"公司信息获取失败"),
    COMINFOERR(6019,"修改公司信息异常"),MOBILEEXIST(6020,"手机号已存在"),ACCINFOFAIL(6021,"账号信息获取失败"),
    ;
    private Integer codeId;
    private String message;

    Status(Integer codeId, String message) {
        this.codeId = codeId;
        this.message = message;
    }


    public Integer getCodeId() {
        return codeId;
    }

    public void setCodeId(Integer codeId) {
        this.codeId = codeId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
