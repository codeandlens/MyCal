package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.entities.Boards;
import com.entities.BoardsType;
import com.services.BoardsServices;
import com.services.BoardsTypeServices;

@Controller
public class BoardsController {
	
	@Autowired
	BoardsServices boardsServices;
	
	@Autowired
	BoardsTypeServices boardsTypeServices;
	
	@RequestMapping("/boards")
    public ModelAndView getBoards() {
        ModelAndView view = new ModelAndView("page-boards/boards");
        return view;
    }
	
	@RequestMapping("/get-boards-list") @ResponseBody
	public List boardslist() {
		
		List list = boardsServices.list();
	   return list;
	}
	
	@RequestMapping("/get-boards-type-list") @ResponseBody
	public List boardsTypelist() {
		List list = boardsTypeServices.list();
	   return list;
	}
	
	@RequestMapping("/board-add") 
	public ModelAndView boardsAdd() {
		 ModelAndView view = new ModelAndView("page-boards/board-add");
		
	   return view;
	}
	
	@RequestMapping(value = "/perform-board-add", method = RequestMethod.POST)
    public ModelAndView getboardsaved(Boards boards) {
		ModelAndView view = new ModelAndView("redirect:/boards");
        	boardsServices.saveOrUpdate(boards);
        return view;
    }
	
	@RequestMapping(value = "/board-read/{board_id}" , method = RequestMethod.GET)
    public ModelAndView userSetting(@PathVariable Integer board_id) {
		ModelAndView view = new ModelAndView("page-boards/board-read");
		List<Boards> boardsList = boardsServices.list();
		
		Boards board = null;
		
		for(Boards b : boardsList){
			if(board_id == b.getBoard_id()){
				board = b;
			}
		}
		
		view.addObject("board", board);
		
       return view;
    }

}
