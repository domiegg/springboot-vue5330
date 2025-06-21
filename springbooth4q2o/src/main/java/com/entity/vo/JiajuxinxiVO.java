package com.entity.vo;

import com.entity.JiajuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 家具信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-27 14:06:04
 */
public class JiajuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 家具名称
	 */
	
	private String jiajumingcheng;
		
	/**
	 * 家具类型
	 */
	
	private String jiajuleixing;
		
	/**
	 * 家具品牌
	 */
	
	private String jiajupinpai;
		
	/**
	 * 家具规格
	 */
	
	private String jiajuguige;
		
	/**
	 * 家具图片
	 */
	
	private String jiajutupian;
		
	/**
	 * 家具颜色
	 */
	
	private String jiajuyanse;
		
	/**
	 * 家具材料
	 */
	
	private String jiajucailiao;
		
	/**
	 * 上架日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangjiariqi;
		
	/**
	 * 家具详情
	 */
	
	private String jiajuxiangqing;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 价格
	 */
	
	private Float price;
		
	/**
	 * 单限
	 */
	
	private Integer onelimittimes;
		
	/**
	 * 库存
	 */
	
	private Integer alllimittimes;
				
	
	/**
	 * 设置：家具名称
	 */
	 
	public void setJiajumingcheng(String jiajumingcheng) {
		this.jiajumingcheng = jiajumingcheng;
	}
	
	/**
	 * 获取：家具名称
	 */
	public String getJiajumingcheng() {
		return jiajumingcheng;
	}
				
	
	/**
	 * 设置：家具类型
	 */
	 
	public void setJiajuleixing(String jiajuleixing) {
		this.jiajuleixing = jiajuleixing;
	}
	
	/**
	 * 获取：家具类型
	 */
	public String getJiajuleixing() {
		return jiajuleixing;
	}
				
	
	/**
	 * 设置：家具品牌
	 */
	 
	public void setJiajupinpai(String jiajupinpai) {
		this.jiajupinpai = jiajupinpai;
	}
	
	/**
	 * 获取：家具品牌
	 */
	public String getJiajupinpai() {
		return jiajupinpai;
	}
				
	
	/**
	 * 设置：家具规格
	 */
	 
	public void setJiajuguige(String jiajuguige) {
		this.jiajuguige = jiajuguige;
	}
	
	/**
	 * 获取：家具规格
	 */
	public String getJiajuguige() {
		return jiajuguige;
	}
				
	
	/**
	 * 设置：家具图片
	 */
	 
	public void setJiajutupian(String jiajutupian) {
		this.jiajutupian = jiajutupian;
	}
	
	/**
	 * 获取：家具图片
	 */
	public String getJiajutupian() {
		return jiajutupian;
	}
				
	
	/**
	 * 设置：家具颜色
	 */
	 
	public void setJiajuyanse(String jiajuyanse) {
		this.jiajuyanse = jiajuyanse;
	}
	
	/**
	 * 获取：家具颜色
	 */
	public String getJiajuyanse() {
		return jiajuyanse;
	}
				
	
	/**
	 * 设置：家具材料
	 */
	 
	public void setJiajucailiao(String jiajucailiao) {
		this.jiajucailiao = jiajucailiao;
	}
	
	/**
	 * 获取：家具材料
	 */
	public String getJiajucailiao() {
		return jiajucailiao;
	}
				
	
	/**
	 * 设置：上架日期
	 */
	 
	public void setShangjiariqi(Date shangjiariqi) {
		this.shangjiariqi = shangjiariqi;
	}
	
	/**
	 * 获取：上架日期
	 */
	public Date getShangjiariqi() {
		return shangjiariqi;
	}
				
	
	/**
	 * 设置：家具详情
	 */
	 
	public void setJiajuxiangqing(String jiajuxiangqing) {
		this.jiajuxiangqing = jiajuxiangqing;
	}
	
	/**
	 * 获取：家具详情
	 */
	public String getJiajuxiangqing() {
		return jiajuxiangqing;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
				
	
	/**
	 * 设置：单限
	 */
	 
	public void setOnelimittimes(Integer onelimittimes) {
		this.onelimittimes = onelimittimes;
	}
	
	/**
	 * 获取：单限
	 */
	public Integer getOnelimittimes() {
		return onelimittimes;
	}
				
	
	/**
	 * 设置：库存
	 */
	 
	public void setAlllimittimes(Integer alllimittimes) {
		this.alllimittimes = alllimittimes;
	}
	
	/**
	 * 获取：库存
	 */
	public Integer getAlllimittimes() {
		return alllimittimes;
	}
			
}
