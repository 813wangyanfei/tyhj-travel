/**
 * 
 */
package com.tyhj.travel.controller.account;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tyhj.travel.base.dao.support.SqlParameter;
import com.tyhj.travel.entity.Account;
import com.tyhj.travel.service.AccountService;

/**
 * @author wangyanfei
 * 
 */
@Controller
@RequestMapping("/Account")
public class AccountController {
	
	@Resource
	AccountService AccountService;

	@RequestMapping("/hello")
	public String test() {
		return "hello";
	}

	@RequestMapping("/greeting")
	public String greeting(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	/**
	 * 
	 * 
	 * @return
	 */
	@RequestMapping("/manage")
	public String login(HttpSession session) {
		if (session.getAttribute("admin") != null) {
			return "main";
		}
		return "login";
	}

	/**
	 * 
	 * 
	 * @return
	 */
	@RequestMapping("/doLogin")
	public String doLogin(@ModelAttribute Account Account, HttpSession session,
			HttpServletRequest request,
			@RequestParam(value = "code", required = false) String code,
			Model model) {
		if (session.getAttribute("Account") != null) {
			return "main";
		}
		SqlParameter parameter = SqlParameter.getSqlParameter();
		parameter.addQuery("AccountName", Account.getAccountName());
		parameter.addQuery("AccountPass", Account.getAccountPwd());
		Account nAccount = AccountService.read(Account.class, "Account_read", parameter);
		if (nAccount == null) {
			request.setAttribute("info", "用户名或密码错误");
			return "login";
		}
		System.out.println(Account.toString());
		session.setAttribute("admin", Account);
		return "main";
	}
	
	/**
	 * 添加用户
	 * @param Account
	 * @param session
	 * @param request
	 * @param code
	 * @param model
	 * @return
	 */
	@RequestMapping("/addAccount")
	public String addAccount(@ModelAttribute Account Account, HttpSession session,
			HttpServletRequest request,
			@RequestParam(value = "code", required = false) String code,
			Model model) {
		AccountService.addAccount(Account);
		System.out.println(Account.toString());
		session.setAttribute("admin", Account);
		return "addAccountSuccess";
	}
	
	/**
	 * 跳转到添加用户页�?
	 * @param Account
	 * @param session
	 * @param request
	 * @param code
	 * @param model
	 * @return
	 */
	@RequestMapping("/toAddAccount")
	public String toAddAccount(@ModelAttribute Account Account, HttpSession session,
			HttpServletRequest request,
			@RequestParam(value = "code", required = false) String code,
			Model model) {
		return "add";
	}

//	/**
//	 * 管理员列
//	 * 
//	 * @return
//	 */
//	@RequestMapping("/adminList")
//	public String adminList(Model model) {
//		List<Account> admins = AccountService.findAccountAll();
//		model.addAttribute("admins", admins);
//		return "admin/listAccount";
//	}

	/**
	 * 管理员更
	 * 
	 * @return
	 */
	@RequestMapping("/admin/initUpdateAccount")
	public String initUpdateAccount(
			@RequestParam(value = "updateId", required = false, defaultValue = "0") int updateId,
			Model model) {

//		if (updateId != 0) {
//			Account Account = AccountService.findAccount(updateId);
//			model.addAttribute("admin", Account);
//			model.addAttribute("updateId", updateId);
//		}
		return "admin/addAccount";
	}

	/**
	 * 管理员更
	 * 
	 * @return
	 */
	@RequestMapping("/admin/updateAccount")
	public String updateAccount(
			@ModelAttribute Account Account,
			@RequestParam(value = "updateId", required = false, defaultValue = "0") int updateId,
			Model model) {

		if (updateId != 0) {
//			Account Account2 = AccountService.findAccount(updateId);
//			Account2.setAccountPwd(Account.getAccountPwd());
//			AccountService.updateAccount(Account2);
//			model.addAttribute("admin", Account2);
			model.addAttribute("updateId", updateId);
			model.addAttribute("info", "更新成功");
		} else {
			model.addAttribute("info", "更新失败");
		}
		return "admin/addAccount";
	}

	/**
	 * 管理员删
	 * 
	 * @return
	 */
//	@RequestMapping("/admin/delAccount")
//	public String delAccount(
//			@ModelAttribute Account Account,
//			@RequestParam(value = "updateId", required = false, defaultValue = "0") int updateId,
//			Model model) {
//
//		if (updateId != 0) {
//			Account Account2 = AccountService.findAccount(updateId);
//			if (Account2 != null && Account2.getId() != 1) {
//				AccountService.deleteAccount(Account2);
//				model.addAttribute("info", "");
//			} else {
//				model.addAttribute("info", "");
//			}
//		} else {
//			model.addAttribute("info", "操作失败");
//		}
//		return adminList(model);
//	}

}
