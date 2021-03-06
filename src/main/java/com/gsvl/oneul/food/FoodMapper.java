package com.gsvl.oneul.food;

import com.gsvl.oneul.food.model.FoodConNmEntity;
import com.gsvl.oneul.food.model.FoodConditionEntity;
import com.gsvl.oneul.food.model.FoodResultVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodMapper {
    //검색조건들로 음식 가져오기
    List<FoodResultVO> selFoodList(FoodConditionEntity entity);

    //검색조건들 이름 가져오기
    List<FoodConNmEntity> selConList(int masterNum);

    //음식 이름으로 이미지 업데이트
    int insFoodImg(FoodConditionEntity entity);
}
