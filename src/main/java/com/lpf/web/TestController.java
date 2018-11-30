package com.lpf.web;


import com.lpf.bean.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;


@Controller
@SessionAttributes({"sessionu4","sessionu5"})
public class TestController {


/*    @RequestMapping(value = "testmvc",method = RequestMethod.POST)//请求地址
    public String test1(){
        System.out.println("testmvc-----------");
        return "success";
    }*/

    @RequestMapping(value = "testmvc/{name}/{id}/{sex}",method = RequestMethod.GET)//请求地址
    public String test1(@PathVariable("name")String name,
                        @PathVariable("id")int id,
                        @PathVariable("sex")int sex,
                        @CookieValue("JSESSIONID")String sessionid,
                        @RequestHeader("Accept-Encoding")String a){
        System.out.println("testmvc-----------");
        System.out.println("sessionid="+sessionid);
        System.out.println("Accept-Encoding="+a);
        System.out.println(name+"\t"+id+"\t"+sex);
        return "redirect:/selectall";
    }

    @RequestMapping("selectall")
    public String selectall(){
        System.out.println("selectall++++++++++++++");
        //System.out.println(5/0);
        return "success";
    }

    //异常
    @ExceptionHandler(Exception.class)
    public String yichang(){
        return "error";
    }

    @RequestMapping("insert")
    public ModelAndView insert(Users users, ModelAndView mv, HttpSession session,ModelMap map){
        System.out.println("insert---------");
        System.out.println(users.getUname());
        System.out.println(users.getUpass());
        System.out.println(users.getUage());
        System.out.println(users.getUsex());
        List<String> list = users.getUhobby();
        for (String s : list) {
            System.out.println(s);
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String format = sdf.format(users.getDate());
        System.out.println(format);
        mv.setViewName("success");
        mv.addObject("u2",users);
        session.setAttribute("u3",users);
        map.put("sessionu4",users);
        map.put("sessionu5",users);
        return mv;
    }

    //退出
/*    @RequestMapping("loginout")
    public String out(HttpSession session){
        session.invalidate();
        return "success";
    }*/
    @RequestMapping("loginout")
    public void out(SessionStatus status, HttpServletResponse response){
        status.setComplete();
        try {
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
            out.print("<script>alert('退出成功，跳转到index.jsp');location.href='index.jsp'</script>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
