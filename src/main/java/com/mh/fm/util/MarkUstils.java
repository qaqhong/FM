package com.mh.fm.util;

public interface MarkUstils {
    //用户的标识
    public static final String USER_YES="1";
    public static final String USER_NO="0";

    //提取的公共的页面，供所有的增加，删除，修改页面所使用,防止重复提交页面
    public static final String SHOW_INFO="/resource/jsp/show_info.jsp";

    //权限管理的标识符
    public static final String AUTH_ORDINARY="普通员工";
    public static final String AUTH_MANAGER="经理";
    public static final String AUTH_FINANCE="财务人员";
    public static final String AUTH_ADMIN="超级管理员";


    //费用的标识
    public static final String COST_YES="1";
    public static final String COST_NO="0";

    //报销单状态和预算状态使用这一个状态了
    public static final String REIM_STATE_NO_ONE="-1";//-1:未提交未通过
    public static final String REIM_STATE_ZERO="0";//0经理审核不通过
    public static final String REIM_STATE_ONE="1";//1:已提交未审核
    public static final String REIM_STATE_TWO="2";//2:经理审核通过
    public static final String REIM_STATE_THREE="3";//3:作废
    public static final String REIM_STATE_FOUR="4";//4:财务审核通过
    public static final String REIM_STATE_NO_FOUR="-4";//-4:财务审核不通过
    public static final String REIM_STATE_FIVE="5";//5:已发放
}
