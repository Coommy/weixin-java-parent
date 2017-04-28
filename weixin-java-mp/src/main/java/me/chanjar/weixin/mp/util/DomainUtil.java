package me.chanjar.weixin.mp.util;

/**
 * 将访问的url接口切换为对应的中英文接口，其实就是域名的切换
 * Created by xuht on 2017/4/27.
 */
public class DomainUtil {
  private static final String LOCALE_EN = "en_US";
  private static final String LOCALE_CN = "zh_CN";
  private static final String API_EN = "api.wechat.com";
  private static final String API_CN = "api.weixin.qq.com";

  /**
   * api接口的切换。
   * 中文:api.weixin.qq.com
   * 英文:api.wechat.com
   * TODO 暂时只发现这两个地址，以后可能有其他域名，open.weixin.qq.com有可能会改变
   * @param url
   * @param locale
   * @return
   */
  public static String changeAPIUrl(String url, String locale) {
    if (locale.equals(LOCALE_EN)) {
      //如果是英文的,则进行切换
      url = url.replace(API_CN, API_EN);
    }
    return url;
  }
}
