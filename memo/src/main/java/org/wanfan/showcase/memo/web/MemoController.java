package org.wanfan.showcase.memo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.wanfan.showcase.memo.domain.Memo;
import org.wanfan.showcase.memo.service.MemoService;

/**
 * 前台MVC，使用spring mvc
 * @author andy
 *
 */
@Controller
@RequestMapping("/memo")
public class MemoController {

	@Autowired
	private MemoService memoService;

	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addMemo(@ModelAttribute("memo") Memo memo) {
		memoService.saveMemo(memo);
		return "redirect:/memo/list";
	}
	
	@RequestMapping(value="/modify", method = RequestMethod.POST)
	public String modifyMemo(@ModelAttribute("memo") Memo memo) {
		memoService.saveMemo(memo);
		return "redirect:/memo/list";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.GET)
	public String addMemoForm(Model model) {
		Memo memo = new Memo();
		model.addAttribute("memo", memo);
		return "memo/addForm";
	}
	
	@RequestMapping(value="/modify", method = RequestMethod.GET)
	public String modifyMemoForm(@RequestParam String id, Model model) {
		Memo memo = memoService.findMemo(id);
		model.addAttribute("memo", memo);
		return "memo/modifyForm";
	}
	
	@RequestMapping(value="/list")
	public String listMemos(Model model) {
		Iterable<Memo> memos = memoService.findAllMemo();
		model.addAttribute("memos", memos);
		return "memo/list";
	}
	
	@RequestMapping(value="/delete")
	public String deleteMemo(@RequestParam String id) {
		memoService.deleteMemo(id);
		return "redirect:memo/list";
	}
	
	@RequestMapping(value="/view")
	public String viewMemo(@RequestParam String id, Model model) {
		Memo memo = memoService.findMemo(id);
		model.addAttribute("memo", memo);
		return "memo/view";
	}
	
}
