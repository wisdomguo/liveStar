package com.wisdomguo.livestar.utils;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import org.json.JSONException;

import java.io.IOException;

/**
 * 发送短信验证码的工具类
 * @author shuaike
 *  
 */
public class TelUtils {


	/**
	 * 用腾讯给手机号发送验证码
	 * 
	 * 调用此方法即可
	 */
	public static  String sendTo(String phoneNumber, String code,String time) {
		String reStr = null; // 定义返回值
		// 短信应用SDK AppID   // 1400开头
		int appid = 1400201815;
		// 短信应用SDK AppKey        
		String appkey = "54d405f2f3bd1facaceb62b90741d0bc";
		// 短信模板ID，需要在短信应用中申请       
		int templateId = 353307;
		// 签名，使用的是`签名内容`，而不是`签名ID`        
		String smsSign = "郭睿恒个人学习";
		try {

			// 参数，一定要对应短信模板中的参数顺序和个数， 
			String[] params = { code,time };
			// 创建ssender对象
			SmsSingleSender ssender = new SmsSingleSender(appid, appkey);
			SmsSingleSenderResult result = ssender.sendWithParam("86", phoneNumber, templateId, params, smsSign, "",
					"");
			if (result.result == 0) {
				reStr = "success";
			} else {
				reStr = "error";
			}
		} catch (HTTPException e) {

			e.printStackTrace();
		} catch (JSONException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}
		return reStr;
	}
}
