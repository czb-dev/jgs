package cn.kgc.bean;


import lombok.Data;

import java.util.Date;
@Data
public class Bill{
	private Integer id;
	private String billCode;//商品编码
	private String productName;//商品名称
	private String productDesc;//商品描述
	private String productUnit;//商品单位
	private double productCount;//商品数量
	private double totalPrice;//商品总额
	private Integer isPayment;//是否付款
	private  Integer createdBy;//创建者
	private Date creationDate;//创建时间
	private  Integer modifyBy;//修改者
	private Date modifyDate;//修改时间
	private Integer providerId;//供应商Id

	private  String providerName;//供应商名称
	private String name;

}
