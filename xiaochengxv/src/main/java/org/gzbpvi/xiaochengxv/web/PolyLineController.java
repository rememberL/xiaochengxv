package org.gzbpvi.xiaochengxv.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*采集管线数据
 * */

@RestController
@RequestMapping(value = "/saveDB")
public class PolyLineController {

	public String addPolylieData() {
		
		return "1";
	}
}
