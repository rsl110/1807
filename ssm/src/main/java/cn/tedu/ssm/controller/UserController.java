package cn.tedu.ssm.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.ssm.pojo.User;
import cn.tedu.ssm.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	/**查询user表所有数据*/
	@RequestMapping("findAll")
	public List<User> findAll(){
		List<User> userList = userService.findAll();
		return userList;
	}
	/**根据id查询user表中数据*/
	@RequestMapping("/get/{id}")
	public User getById(@PathVariable Integer id){
		return userService.getById(id);
	}
	/**向user表中插入一条数据*/
	@RequestMapping("/add/{name}/{birthday}/{address}")
	public String add(User user){
		try {
			userService.add(user);
			return "add ok";
		} catch (Exception e) {
			e.printStackTrace();
			return "add error";
		}		
	}
	/**根据id更新user表中数据*/
	@RequestMapping("/update/{id}/{name}/{birthday}/{address}")
	public String updateById(@PathVariable Integer id,
			@PathVariable String name,
			@DateTimeFormat(pattern="yyyy-MM-dd") @PathVariable Date birthday,
			@PathVariable String address){
		try {
			userService.updateById(id,name,birthday,address);
			return "update ok";
		} catch (Exception e) {
			e.printStackTrace();
			return "update error";
		}
	}
	/**根据id删除user表中数据*/
	@RequestMapping("/delete/{id}")
	public String deleteById(@PathVariable Integer id){
		try {
			userService.deleteById(id);
			return "delete ok";
		} catch (Exception e) {
			e.printStackTrace();
			return "delete error";
		}
	}
}
