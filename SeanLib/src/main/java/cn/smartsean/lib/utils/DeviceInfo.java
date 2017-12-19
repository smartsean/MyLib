package cn.smartsean.lib.utils;

/**
 * Created by zhj on 2016/2/24.
 */
public class DeviceInfo {
    /*
   * 电话状态：
   * 1.tm.CALL_STATE_IDLE=0          无活动
   * 2.tm.CALL_STATE_RINGING=1  响铃
   * 3.tm.CALL_STATE_OFFHOOK=2  摘机
   */
    private int callState;
    //    tm.getCallState();//int
  /*
   * 电话方位：
   *
   */
//    private CellLocation cellLocation;
//    tm.getCellLocation();//CellLocation
  /*
   * 唯一的设备ID：
   * GSM手机的 IMEI 和 CDMA手机的 MEID.
   * Return null if device ID is not available.
   */
    private String deviceId;
    //    tm.getDeviceId();//String
  /*
   * 设备的软件版本号：
   * 例如：the IMEI/SV(software version) for GSM phones.
   * Return null if the software version is not available.
   */
    private String deviceSoftwareVersion;
    //    tm.getDeviceSoftwareVersion();//String
  /*
   * 手机号：
   * GSM手机的 MSISDN.
   * Return null if it is unavailable.
   */
    private String telNumber;
    //    tm.getLine1Number();//String
  /*
   * 附近的电话的信息:
   * 类型：List
   * 需要权限：android.Manifest.permission#ACCESS_COARSE_UPDATES
   */
//    tm.getNeighboringCellInfo();//List
  /*
   * 获取ISO标准的国家码，即国际长途区号。
   * 注意：仅当用户已在网络注册后有效。
   *       在CDMA网络中结果也许不可靠。
   */
//    private String netWorkCountryIso;
    //    tm.getNetworkCountryIso();//String
  /*
   * MCC+MNC(mobile country code + mobile network code)
   * 注意：仅当用户已在网络注册时有效。
   *    在CDMA网络中结果也许不可靠。
   */
//    private String netWorkOperator;
    //    tm.getNetworkOperator();//String
  /*
   * 按照字母次序的current registered operator(当前已注册的用户)的名字
   * 注意：仅当用户已在网络注册时有效。
   *    在CDMA网络中结果也许不可靠。
   */
//    private String getNetWorkOperatorName;
    //    tm.getNetworkOperatorName();//String
  /*
   * 当前使用的网络类型：
   * 例如： NETWORK_TYPE_UNKNOWN  网络类型未知  0
     NETWORK_TYPE_GPRS     GPRS网络  1
     NETWORK_TYPE_EDGE     EDGE网络  2
     NETWORK_TYPE_UMTS     UMTS网络  3
     NETWORK_TYPE_HSDPA    HSDPA网络  8
     NETWORK_TYPE_HSUPA    HSUPA网络  9
     NETWORK_TYPE_HSPA     HSPA网络  10
     NETWORK_TYPE_CDMA     CDMA网络,IS95A 或 IS95B.  4
     NETWORK_TYPE_EVDO_0   EVDO网络, revision 0.  5
     NETWORK_TYPE_EVDO_A   EVDO网络, revision A.  6
     NETWORK_TYPE_1xRTT    1xRTT网络  7
   */
//    private int netWorkType;
//    private String netWorkTypeStr;
    //    tm.getNetworkType();//int
    /*
     * 手机类型：
     * 例如： PHONE_TYPE_NONE  无信号
       PHONE_TYPE_GSM   GSM信号
       PHONE_TYPE_CDMA  CDMA信号
     */
    private int phoneType;
    //    tm.getPhoneType();//int
  /*
   * Returns the ISO country code equivalent for the SIM provider's country code.
   * 获取ISO国家码，相当于提供SIM卡的国家码。
   *
   */
    private String simCountryIso;
    //    tm.getSimCountryIso();//String
  /*
   * Returns the MCC+MNC (mobile country code + mobile network code) of the provider of the SIM. 5 or 6 decimal digits.
   * 获取SIM卡提供的移动国家码和移动网络码.5或6位的十进制数字.
   * SIM卡的状态必须是 SIM_STATE_READY(使用getSimState()判断).
   */
    private String simOperator;
    //    tm.getSimOperator();//String
  /*
   * 服务商名称：
   * 例如：中国移动、联通
   * SIM卡的状态必须是 SIM_STATE_READY(使用getSimState()判断).
   */
    private String simOperatorName;
    //    tm.getSimOperatorName();//String
  /*
   * SIM卡的序列号：
   * 需要权限：READ_PHONE_STATE
   */
    private String simSerialNumber;
    //    tm.getSimSerialNumber();//String
  /*
   * SIM的状态信息：
   *  SIM_STATE_UNKNOWN          未知状态 0
   SIM_STATE_ABSENT           没插卡 1
   SIM_STATE_PIN_REQUIRED     锁定状态，需要用户的PIN码解锁 2
   SIM_STATE_PUK_REQUIRED     锁定状态，需要用户的PUK码解锁 3
   SIM_STATE_NETWORK_LOCKED   锁定状态，需要网络的PIN码解锁 4
   SIM_STATE_READY            就绪状态 5
   */
    private int simState;
    private String simStateStr;
    //    tm.getSimState();//int
    /*
     * 唯一的用户ID：
     * 例如：IMSI(国际移动用户识别码) for a GSM phone.
     * 需要权限：READ_PHONE_STATE
     */
    private String subscriberId;
//    tm.getSubscriberId();//String
  /*
   * 取得和语音邮件相关的标签，即为识别符
   * 需要权限：READ_PHONE_STATE
   */
//    tm.getVoiceMailAlphaTag();//String
  /*
   * 获取语音邮件号码：
   * 需要权限：READ_PHONE_STATE
   */
//    tm.getVoiceMailNumber();//String
  /*
   * ICC卡是否存在
   */
//    tm.hasIccCard();//boolean
  /*
   * 是否漫游:
   * (在GSM用途下)
   */
//    tm.isNetworkRoaming();//


    /**
     * 屏幕高度
     */
    private int screenHeigh;

    /**
     * 屏幕宽度
     */
    private int screenWidth;

    /**
     * 手机型号
     */
    private String buildModel;

    /**
     * 整体产品名称
     */
    private String buildProduct;

    /**
     * 工业设计名称
     */
    private String buildDevice;

    /**
     * 生产商
     */
    private String manufacturer;


    public String getSimOperator() {
        return simOperator;
    }

    public void setSimOperator(String simOperator) {
        this.simOperator = simOperator;
    }

    public int getCallState() {
        return callState;
    }

    public void setCallState(int callState) {
        this.callState = callState;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceSoftwareVersion() {
        return deviceSoftwareVersion;
    }

    public void setDeviceSoftwareVersion(String deviceSoftwareVersion) {
        this.deviceSoftwareVersion = deviceSoftwareVersion;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

//    public String getNetWorkCountryIso() {
//        return netWorkCountryIso;
//    }
//
//    public void setNetWorkCountryIso(String netWorkCountryIso) {
//        this.netWorkCountryIso = netWorkCountryIso;
//    }
//
//    public String getNetWorkOperator() {
//        return netWorkOperator;
//    }
//
//    public void setNetWorkOperator(String netWorkOperator) {
//        this.netWorkOperator = netWorkOperator;
//    }
//
//    public String getGetNetWorkOperatorName() {
//        return getNetWorkOperatorName;
//    }
//
//    public void setGetNetWorkOperatorName(String getNetWorkOperatorName) {
//        this.getNetWorkOperatorName = getNetWorkOperatorName;
//    }
//
//    public int getNetWorkType() {
//        return netWorkType;
//    }
//
//    public void setNetWorkType(int netWorkType) {
//        this.netWorkType = netWorkType;
//        switch (netWorkType) {
//            case 0:
//                setNetWorkTypeStr("网络类型未知");
//                break;
//            case 1:
//                setNetWorkTypeStr("GPRS网络");
//                break;
//            case 2:
//                setNetWorkTypeStr("EDGE网络");
//                break;
//            case 3:
//                setNetWorkTypeStr("UMTS网络");
//                break;
//            case 4:
//                setNetWorkTypeStr("CDMA网络, IS95A 或 IS95B");
//                break;
//            case 5:
//                setNetWorkTypeStr("EVDO网络, revision 0");
//                break;
//            case 6:
//                setNetWorkTypeStr("EVDO网络, revision CodecCheck.A");
//                break;
//            case 7:
//                setNetWorkTypeStr("1 xRTT网络");
//                break;
//            case 8:
//                setNetWorkTypeStr("HSDPA网络");
//                break;
//            case 9:
//                setNetWorkTypeStr("HSDPA网络");
//                break;
//            case 10:
//                setNetWorkTypeStr("HSPA网络");
//                break;
//            default:
//                setNetWorkTypeStr("网络类型未知");
//                break;
//        }
//    }
//
//    public String getNetWorkTypeStr() {
//        return netWorkTypeStr;
//    }

//    public void setNetWorkTypeStr(String netWorkTypeStr) {
//        this.netWorkTypeStr = netWorkTypeStr;
//    }

    public int getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(int phoneType) {
        this.phoneType = phoneType;
    }

    public String getSimCountryIso() {
        return simCountryIso;
    }

    public void setSimCountryIso(String simCountryIso) {
        this.simCountryIso = simCountryIso;
    }

    public String getSimOperatorName() {
        return simOperatorName;
    }

    public void setSimOperatorName(String simOperatorName) {
        this.simOperatorName = simOperatorName;
    }

    public String getSimSerialNumber() {
        return simSerialNumber;
    }

    public void setSimSerialNumber(String simSerialNumber) {
        this.simSerialNumber = simSerialNumber;
    }

    public int getSimState() {
        return simState;
    }

    public void setSimState(int simState) {
        this.simState = simState;
        switch (simState) {
            case 0:
                setSimStateStr("未知状态");
                break;
            case 1:
                setSimStateStr("没插卡");
                break;
            case 2:
                setSimStateStr("锁定状态，需要用户的PIN码解锁");
                break;
            case 3:
                setSimStateStr("锁定状态，需要用户的PUK码解锁");
                break;
            case 4:
                setSimStateStr("锁定状态，需要网络的PIN码解锁");
                break;
            case 5:
                setSimStateStr("就绪状态");
                break;
            default:
                setSimStateStr("未知状态");
                break;
        }
    }

    public String getSimStateStr() {
        return simStateStr;
    }

    public void setSimStateStr(String simStateStr) {
        this.simStateStr = simStateStr;
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public int getScreenHeigh() {
        return screenHeigh;
    }

    public void setScreenHeigh(int screenHeigh) {
        this.screenHeigh = screenHeigh;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public String getBuildDevice() {
        return buildDevice;
    }

    public void setBuildDevice(String buildDevice) {
        this.buildDevice = buildDevice;
    }

    public String getBuildModel() {
        return buildModel;
    }

    public void setBuildModel(String buildModel) {
        this.buildModel = buildModel;
    }

    public String getBuildProduct() {
        return buildProduct;
    }

    public void setBuildProduct(String buildProduct) {
        this.buildProduct = buildProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
