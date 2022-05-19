package com.controller;

import com.dao.Building;
import com.mapper.BuildingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class BuildingController {
    @Autowired
    private BuildingMapper buildingMapper;
    @RequestMapping("/all")
    public String getbuilding(Model model){
        List<Building> buildings = null;
        try{
            buildings = buildingMapper.selectBuilding();
        }catch (Exception e){
            System.out.println("数据库为空！！！");
        }
        model.addAttribute("buildings",buildings);
        return "all";
    }
public String add(Building building, Model model, HttpSession session){
        Building building1 = null;
        String bid = building.getBid();
        String bname =building.getBname();
        Integer price = building.getPrice();
        String supplier = building.getSupplier();
        Integer bnumer = building.getBnumber();
        if (bid!="" && bid!=null){
            try{
                building1 = buildingMapper.selectBuilding(bid);
                System.out.println("添加失败");
            }catch (NullPointerException e){
                System.out.println("添加成功");
            }if(building1 == null){
                buildingMapper.insertBuilding(building);
            }
        }else {
            model.addAttribute("");
        }
return "all";
}
}
