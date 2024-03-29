/**  
  * Code Generator Author :singleton_zw
  * Code Generator version: 2.0
  * QQ群: 123456789
  * author：singleton_zw
  * CreateDate: 2016-01-25 15:48:08
  * Copyright &copy; 2015-2016
*/
package org.zw.singleton.jeeframework.modules.appinterface.bookdesc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zw.singleton.jeeframework.modules.appinterface.bookdesc.entity.AppBookdesc;
import org.zw.singleton.jeeframework.modules.appinterface.bookdesc.service.AppBookdescService;
import org.zw.singleton.jeeframework.modules.basis.page.Page;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**  
  * @ClassName:AppBookdescController
  * @Description:健康图书列表
  * @Author: singleton_zw
  * @CreateDate: 2016-01-25 15:48:08
  * @UpdateAuthor:
  * @UpdateDate:
  * @@UpdateDesc:
  * @version:
  * @Copyright
*/
@Controller
@RequestMapping(value = "AppBookdesc")
public class AppBookdescController {

	@Autowired
	private AppBookdescService appBookdescService;

	@ResponseBody
	@RequestMapping(value = { "/appBookdescList.do" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Map<String,Object> list(@RequestBody AppBookdesc appBookdesc,HttpServletRequest request,HttpServletResponse response){
		Map<String,Object> map = new HashMap<String,Object>();	
		return map;
	}


}