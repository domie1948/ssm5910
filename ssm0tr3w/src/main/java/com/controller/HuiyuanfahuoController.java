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

import com.entity.HuiyuanfahuoEntity;
import com.entity.view.HuiyuanfahuoView;

import com.service.HuiyuanfahuoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 会员发货
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
@RestController
@RequestMapping("/huiyuanfahuo")
public class HuiyuanfahuoController {
    @Autowired
    private HuiyuanfahuoService huiyuanfahuoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuiyuanfahuoEntity huiyuanfahuo, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huiyuanxinxi")) {
			huiyuanfahuo.setHuiyuanhao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuiyuanfahuoEntity> ew = new EntityWrapper<HuiyuanfahuoEntity>();
		PageUtils page = huiyuanfahuoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huiyuanfahuo), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuiyuanfahuoEntity huiyuanfahuo, HttpServletRequest request){
        EntityWrapper<HuiyuanfahuoEntity> ew = new EntityWrapper<HuiyuanfahuoEntity>();
		PageUtils page = huiyuanfahuoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huiyuanfahuo), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuiyuanfahuoEntity huiyuanfahuo){
       	EntityWrapper<HuiyuanfahuoEntity> ew = new EntityWrapper<HuiyuanfahuoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huiyuanfahuo, "huiyuanfahuo")); 
        return R.ok().put("data", huiyuanfahuoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuiyuanfahuoEntity huiyuanfahuo){
        EntityWrapper< HuiyuanfahuoEntity> ew = new EntityWrapper< HuiyuanfahuoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huiyuanfahuo, "huiyuanfahuo")); 
		HuiyuanfahuoView huiyuanfahuoView =  huiyuanfahuoService.selectView(ew);
		return R.ok("查询会员发货成功").put("data", huiyuanfahuoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        HuiyuanfahuoEntity huiyuanfahuo = huiyuanfahuoService.selectById(id);
        return R.ok().put("data", huiyuanfahuo);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        HuiyuanfahuoEntity huiyuanfahuo = huiyuanfahuoService.selectById(id);
        return R.ok().put("data", huiyuanfahuo);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuiyuanfahuoEntity huiyuanfahuo, HttpServletRequest request){
    	huiyuanfahuo.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huiyuanfahuo);

        huiyuanfahuoService.insert(huiyuanfahuo);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuiyuanfahuoEntity huiyuanfahuo, HttpServletRequest request){
    	huiyuanfahuo.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huiyuanfahuo);

        huiyuanfahuoService.insert(huiyuanfahuo);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HuiyuanfahuoEntity huiyuanfahuo, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huiyuanfahuo);
        huiyuanfahuoService.updateById(huiyuanfahuo);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huiyuanfahuoService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<HuiyuanfahuoEntity> wrapper = new EntityWrapper<HuiyuanfahuoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huiyuanxinxi")) {
			wrapper.eq("huiyuanhao", (String)request.getSession().getAttribute("username"));
		}

		int count = huiyuanfahuoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
