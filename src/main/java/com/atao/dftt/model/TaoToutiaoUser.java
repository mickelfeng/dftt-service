package com.atao.dftt.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.atao.base.model.BaseEntity;

/**
 * 
 *
 * @author twang
 */
public class TaoToutiaoUser extends BaseEntity {

	/**
	* 
	*/
	@Id
	@Column(name = "id")
	private Integer id;

	/**
	 * 
	 */
	@Column(name = "username")
	private String username;
	/**
	 * 
	 */
	@Column(name = "password")
	private String password;
	/**
	 * 
	 */
	@Column(name = "user_id")
	private String userId;
	/**
	 * 
	 */
	@Column(name = "ticket")
	private String ticket;
	/**
	 * 
	 */
	@Column(name = "distinct_id")
	private String distinctId;
	/**
	 * 
	 */
	@Column(name = "x")
	private String x;
	/**
	 * 
	 */
	@Column(name = "imei")
	private String imei;
	/**
	 * 
	 */
	@Column(name = "imsi")
	private String imsi;
	/**
	 * 
	 */
	@Column(name = "sdk")
	private String sdk;
	/**
	 * 
	 */
	@Column(name = "android_id")
	private String androidId;
	/**
	 * 
	 */
	@Column(name = "model")
	private String model;
	/**
	 * 
	 */
	@Column(name = "vendor")
	private String vendor;
	/**
	 * 
	 */
	@Column(name = "os")
	private String os;
	/**
	 * 
	 */
	@Column(name = "os_version")
	private String osVersion;
	/**
	 * 
	 */
	@Column(name = "carrier")
	private String carrier;
	/**
	 * 
	 */
	@Column(name = "device_id")
	private String deviceId;
	/**
	 * 
	 */
	@Column(name = "user_agent")
	private String userAgent;
	/**
	 * 
	 */
	@Column(name = "first_day")
	private Boolean firstDay;
	/**
	 * 
	 */
	@Column(name = "read_num")
	private Long readNum;
	/**
	 * 
	 */
	@Column(name = "read_time")
	private Date readTime;
	/**
	 * 
	 */
	@Column(name = "limit_read_num")
	private Long limitReadNum;
	/**
	 * 
	 */
	@Column(name = "v_read_num")
	private Long vReadNum;
	/**
	 * 
	 */
	@Column(name = "v_read_time")
	private Date vReadTime;
	/**
	 * 
	 */
	@Column(name = "v_limit_read_num")
	private Long vLimitReadNum;
	/**
	 * 最后签到时间
	 */
	@Column(name = "qd_time")
	private Date qdTime;
	/**
	 * 
	 */
	@Column(name = "create_time")
	private Date createTime;
	/**
	 * 
	 */
	@Column(name = "used")
	private Boolean used;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String getDistinctId() {
		return distinctId;
	}

	public void setDistinctId(String distinctId) {
		this.distinctId = distinctId;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getSdk() {
		return sdk;
	}

	public void setSdk(String sdk) {
		this.sdk = sdk;
	}

	public String getAndroidId() {
		return androidId;
	}

	public void setAndroidId(String androidId) {
		this.androidId = androidId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public Boolean getFirstDay() {
		return firstDay;
	}

	public void setFirstDay(Boolean firstDay) {
		this.firstDay = firstDay;
	}

	public Long getReadNum() {
		return readNum;
	}

	public void setReadNum(Long readNum) {
		this.readNum = readNum;
	}

	public Date getReadTime() {
		return readTime;
	}

	public void setReadTime(Date readTime) {
		this.readTime = readTime;
	}

	public Long getLimitReadNum() {
		return limitReadNum;
	}

	public void setLimitReadNum(Long limitReadNum) {
		this.limitReadNum = limitReadNum;
	}

	public Long getVReadNum() {
		return vReadNum;
	}

	public void setVReadNum(Long vReadNum) {
		this.vReadNum = vReadNum;
	}

	public Date getVReadTime() {
		return vReadTime;
	}

	public void setVReadTime(Date vReadTime) {
		this.vReadTime = vReadTime;
	}

	public Long getVLimitReadNum() {
		return vLimitReadNum;
	}

	public void setVLimitReadNum(Long vLimitReadNum) {
		this.vLimitReadNum = vLimitReadNum;
	}

	public Date getQdTime() {
		return qdTime;
	}

	public void setQdTime(Date qdTime) {
		this.qdTime = qdTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Boolean getUsed() {
		return used;
	}

	public void setUsed(Boolean used) {
		this.used = used;
	}

	public static class TF {

		public static String TABLE_NAME = "TAO_TOUTIAO_USER"; // 表名

		// public static String TABLE_SCHEMA = ConfigUtils.getValue(""); // 库名

		public static String id = "id"; //
		public static String username = "username"; //
		public static String password = "password"; //
		public static String userId = "user_id"; //
		public static String ticket = "ticket"; //
		public static String distinctId = "distinct_id"; //
		public static String x = "x"; //
		public static String imei = "imei"; //
		public static String imsi = "imsi"; //
		public static String sdk = "sdk"; //
		public static String androidId = "android_id"; //
		public static String model = "model"; //
		public static String vendor = "vendor"; //
		public static String os = "os"; //
		public static String osVersion = "os_version"; //
		public static String carrier = "carrier"; //
		public static String deviceId = "device_id"; //
		public static String userAgent = "user_agent"; //
		public static String firstDay = "first_day"; //
		public static String readNum = "read_num"; //
		public static String readTime = "read_time"; //
		public static String limitReadNum = "limit_read_num"; //
		public static String vReadNum = "v_read_num"; //
		public static String vReadTime = "v_read_time"; //
		public static String vLimitReadNum = "v_limit_read_num"; //
		public static String qdTime = "qd_time"; // 最后签到时间
		public static String createTime = "create_time"; //
		public static String used = "used"; //
	}
}