package me.chanjar.weixin.mp;

import me.chanjar.weixin.mp.util.DomainUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by xuht on 2017/4/27.
 */
public class DomainUtilTest {
  @Test
  public void testChangeAPIUrl(){
    String url = DomainUtil.changeAPIUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=STATE#wechat_redirect","zh_CN");
    System.out.println(url);
    Assert.assertTrue(url.equals("https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=STATE#wechat_redirect"));

    url = DomainUtil.changeAPIUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=STATE#wechat_redirect","en_US");
    System.out.println(url);
    Assert.assertTrue(url.equals("https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=STATE#wechat_redirect"));

    url = DomainUtil.changeAPIUrl("https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code","zh_CN");
    System.out.println(url);
    Assert.assertTrue(url.equals("https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code"));

    url = DomainUtil.changeAPIUrl("https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code","en_US");
    System.out.println(url);
    Assert.assertTrue(url.equals("https://api.wechat.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code"));

  }

}
