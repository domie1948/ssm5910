package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.PutonggoumaiEntity;
import com.entity.view.PutonggoumaiView;

import com.service.PutonggoumaiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 普通购买
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
@RestController
@RequestMapping("/putonggoumai")
public class PutonggoumaiController {
    @Autowired
    private PutonggoumaiService putonggoumaiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PutonggoumaiEntity putonggoumai, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			putonggoumai.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<PutonggoumaiEntity> ew = new EntityWrapper<PutonggoumaiEntity>();
		PageUtils page = putonggoumaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, putonggoumai), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PutonggoumaiEntity putonggoumai, HttpServletRequest request){
        EntityWrapper<PutonggoumaiEntity> ew = new EntityWrapper<PutonggoumaiEntity>();
		PageUtils page = putonggoumaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, putonggoumai), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PutonggoumaiEntity putonggoumai){
       	EntityWrapper<PutonggoumaiEntity> ew = new EntityWrapper<PutonggoumaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( putonggoumai, "putonggoumai")); 
        return R.ok().put("data", putonggoumaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PutonggoumaiEntity putonggoumai){
        EntityWrapper< PutonggoumaiEntity> ew = new EntityWrapper< PutonggoumaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( putonggoumai, "putonggoumai")); 
		PutonggoumaiView putonggoumaiView =  putonggoumaiService.selectView(ew);
		return R.ok("查询普通购买成功").put("data", putonggoumaiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        PutonggoumaiEntity putonggoumai = putonggoumaiService.selectById(id);
        return R.ok().put("data", putonggoumai);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        PutonggoumaiEntity putonggoumai = putonggoumaiService.selectById(id);
        return R.ok().put("data", putonggoumai);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PutonggoumaiEntity putonggoumai, HttpServletRequest request){
    	putonggoumai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(putonggoumai);

        putonggoumaiService.insert(putonggoumai);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PutonggoumaiEntity putonggoumai, HttpServletRequest request){
    	putonggoumai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(putonggoumai);

        putonggoumaiService.insert(putonggoumai);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PutonggoumaiEntity putonggoumai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(putonggoumai);
        putonggoumaiService.updateById(putonggoumai);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        putonggoumaiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<PutonggoumaiEntity> wrapper = new EntityWrapper<PutonggoumaiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = putonggoumaiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
