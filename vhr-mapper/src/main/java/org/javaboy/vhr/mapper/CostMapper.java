package org.javaboy.vhr.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.javaboy.vhr.model.Cost;

import java.util.List;
import java.util.Map;

public interface CostMapper {


    @Select("SELECT * FROM cost ")
    List<Map> getAllList();

    @Insert("INSERT INTO cost(type,money,time,people,beizhu) VALUES(#{type},#{money},#{time},#{people},#{beizhu} )")
    int insert(Cost cost);

    @Update("UPDATE cost  " +
            "SET type=#{type},money=#{money},time=#{time},people=#{people},beizhu=#{beizhu} " +
            "WHERE id=#{id}")
    int update(Cost cost);

    @Delete("DELETE from cost where id=#{id}")
    int delete(Integer id);


}
