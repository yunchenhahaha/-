package com.mapper;

import com.dao.Building;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BuildingMapper {
    public List<Building> selectBuilding();
    public int insertBuilding(Building building);
}
