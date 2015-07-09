package org.wanfan.showcase.user.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用Controller来实现一个Rest API，只提供Json、xml或者其他自定义的mediatype content。
 * <br/>
 * 你可以使用<code>@RequestMapping</code>和<code>@ResponseBody</code>配合，但目前更推荐使用<code>@RestController</code>
 * @author andy
 *
 */
@RestController
@RequestMapping("/role")
public class RoleController {

	
}
